package br.com.jh.controller;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jh.model.TransientLog;

@RestController
@RequestMapping("/api/v1/traffic")
public class TrafficController {

    // Armazenamento em Memória RAM simulando o banco de dados (Thread-Safe)
    private final Map<String, TransientLog> bancoEmMemoria = new ConcurrentHashMap<>();

    @PostMapping
    public ResponseEntity<Map<String, Object>> processTraffic(@RequestBody(required = false) String payload) {
        try {
            String dataToProcess = (payload != null) ? payload : UUID.randomUUID().toString();

            // 1. GARGALO DE CPU (Green of IT / Algoritmo Ineficiente Proposital)
            // Executa 1000 iterações de SHA-256 para simular processamento matemático exaustivo
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = dataToProcess.getBytes(StandardCharsets.UTF_8);
            
            for (int i = 0; i < 1000; i++) {
                hash = digest.digest(hash);
            }
            String finalHash = bytesToHex(hash);

            // 2. GARGALO DE MEMÓRIA RAM
            // Armazena o log na estrutura em memória, forçando a retenção e uso de heap do Java
            String logId = UUID.randomUUID().toString();
            TransientLog log = new TransientLog(logId, LocalDateTime.now(), finalHash, dataToProcess.getBytes().length);
            bancoEmMemoria.put(logId, log);

            // Retorno estruturado para o k6 validar
            return ResponseEntity.ok(Map.of(
                "status", "sucesso",
                "logId", logId,
                "hashCalculado", finalHash,
                "logsRegistradosNaMemoria", bancoEmMemoria.size()
            ));

        } catch (NoSuchAlgorithmException e) {
            return ResponseEntity.internalServerError().body(Map.of("erro", "Falha criptográfica interna"));
        }
    }

    // Endpoint auxiliar para limpar a memória entre um teste de estresse e outro, se desejar
    @DeleteMapping("/clear")
    public ResponseEntity<String> clearMemory() {
        bancoEmMemoria.clear();
        return ResponseEntity.ok("Memória RAM limpa com sucesso. Registros zerados.");
    }

    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}