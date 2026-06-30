package br.com.jh.model;

import java.time.LocalDateTime;

public class TransientLog {
    private final String id;
    private final LocalDateTime timestamp;
    private final String hashGerado;
    private final int tamanhoPayloadBytes;

    public TransientLog(String id, LocalDateTime timestamp, String hashGerado, int tamanhoPayloadBytes) {
        this.id = id;
        this.timestamp = timestamp;
        this.hashGerado = hashGerado;
        this.tamanhoPayloadBytes = tamanhoPayloadBytes;
    }

    // Getters para estruturação do JSON de resposta (se necessário)
    public String getId() { return id; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getHashGerado() { return hashGerado; }
    public int getTamanhoPayloadBytes() { return tamanhoPayloadBytes; }
}