
# Sustentabilidade por meio redução do consumo energético de aplicações rodando na nuvem AWS

Este projeto tem como objetivo avaliar como a utilização de serviços disponibilizados na nuvem AWS podem contribuir positivamente para a sustentabilidade por meio aplicação de conceitos de Green IT.

## Introdução
Nunca foi tão urgente alinhar tecnologia e sustentabilidade. No centro dessa mudança está o Green IT, ou TI Verde, uma abordagem que transforma o uso da tecnologia em algo mais consciente e menos impactante para o planeta. 

Segundo um estudo da International Energy Agency, centros de dados e dispositivos conectados representam cerca de 1% das emissões globais de CO2.

Segundo o estudo Digital Economy and Climate Impact, divulgado pela Schneider Electric em 2021, a TI é uma das maiores consumidoras de energia elétrica no mundo, além de revelar que a demanda de eletricidade do setor de
TI deverá aumentar em quase 50% até 2030. E para suprir a demanda energética, é preciso investir em produção de mais energia — o que, consequentemente, gera mais CO2 que é expelido para a atmosfera.

Isso envolve desde a escolha de dispositivos energeticamente eficientes até práticas de descarte correto de equipamentos.

O conceito ganhou força com a crescente preocupação sobre o impacto ambiental das operações empresariais e a necessidade de reduzir as emissões de carbono. 

Seja através de práticas sustentáveis, tecnologias inovadoras ou estratégias eficientes, o Green IT oferece soluções reais para empresas que desejam fazer a diferença. 

Ao adotar o Green IT, as empresas não só diminuem a pegada de carbono, mas também otimizam custos operacionais e promovem uma imagem de responsabilidade ambiental.

Exemplos práticos:
    - Virtualização de servidores;
    - Computação em nuvem;
    - Descarte responsável de equipamentos;
    - Uso de energia renovável;
    - Equipamentos com certificação energética.

## Conceitos fundamentais

Definição: trata-se de um conjunto de boas práticas gerenciais e operacionais com foco na sustentabilidade. O objetivo é reeducar as pessoas quanto ao uso sustentável dos recursos tecnológicos. (ITSM)

Green IT, ou Tecnologia da Informação Verde, refere-se ao uso sustentável dos recursos tecnológicos para reduzir impactos no meio ambiente. 

A TI verde se subdivide em:
    
Green in IT (Verde na TI): Foco na infraestrutura física. Refere-se à eficiência energética de servidores físicos, sistemas de resfriamento de data centers, transição para fontes de energia renovável e reciclagem de lixo eletrônico (e-waste).

Green by IT (Verde pela TI): Usar a tecnologia para tornar outros setores mais sustentáveis. Exemplos: sistemas de redes inteligentes (smart grids), aplicativos de otimização de rotas logísticas para gastar menos combustível ou videoconferências que evitam viagens aéreas.

Green of IT / Green Software (Verde do Software): Prática de projetar, desenvolver e executar aplicações eficientes. É aqui que o seu software se torna um agente ativo, consumindo menos CPU, memória e dados de rede para a mesma tarefa.



## Métricas
PUE: relação entre energia total do data center e energia consumida pela TI. Quanto mais próximo de 1, melhor.

DCiE: inversa do PUE.

WUE: eficiência de uso de água.

CER: eficiência de resfriamento, padronizada na ISO/IEC 30134-7.

Utilização real do hardware: CPU, memória, IOPS, throughput, latência.

Energia por transação/requisição: métrica excelente para software e sistemas.

Desempenho por watt: muito útil para comparar arquiteturas e stacks.


## Níveis
Green IT 1.0 (eficiência) × Green IT 2.0 (sustentabilidade holística)

## Ambientes
on-premise tradicional
virtualização
HCI
containers/Kubernetes
cloud


## Software Eficiente
software com menos chamadas inúteis, menos loops custosos, menos I/O excessivo e melhor uso de cache tende a consumir menos energia porque exige menos trabalho da máquina.


## O Padrão ISO do Green Software: Software Carbon Intensity (SCI)
O SCI não mede o volume total de carbono emitido (que sempre cresce conforme o número de usuários aumenta), mas sim a taxa de emissão por unidade funcional. A equação do SCI é: XXXXXX


## Estratégias Arquiteturais para Computação Verde (Nuvem)
A. Deslocamento Temporal (Temporal Shifting)
Consiste em adiar a execução de tarefas que não são de tempo real (backups, geração de relatórios pesados, processamento de lote/batch) para horários em que a intensidade de carbono da rede elétrica local ($I$) esteja mais baixa.

B. Deslocamento Espacial (Spatial Shifting)
Consiste em mover dinamicamente o tráfego e o processamento de dados pela rede para regiões geográficas cuja energia seja mais limpa naquele instante, mesmo que isso custe uma latência ligeiramente maior.

# Projeto
## 1. Instalação e Configuração

## 2. Pré-requisitos

| Ferramenta | Versão recomendada |
|------------|--------------------|
| Java | 17 |
| Spring Boot | 3.5.7 |
| Docker / Docker Compose | latest |
| PostgreSQL | 14+ |
| k6 (testes de carga) | latest |
| Kepler | xxx |
| Scaphandre | xxx |
| AWS | EC2 |
| Cloud Carbon Footprint | xxx |
| Git | Opcional |


## 3. Implantação
### Fase 1 - Teste no ambiente On-Premises (Baseline)
Passo 1.1: Preparar a Aplicação
Passo 1.2: Instalar a Ferramenta de Captura Local
Passo 1.3: Teste de carga

### Fase 2 - Migração para a Nuvem AWS (Arquitetura x86 Tradicional)
Passo 2.1: Subir a Infraestrutura Inicial
Passo 2.2: Configurar o Cloud Carbon Footprint (CCF)
Passo 2.3: Replicar o Experimento

### Fase 3 - Otimização Arquitetural na Nuvem (AWS ARM / Graviton)
Passo 3.1: Mudar para Instâncias ARM
Passo 3.2: O Teste de Estresse Final

## 4. Arquitetura / Estrutura

## 5. Resultados
Tabela comparativa
Ambiente (On-Premises vs AWS x86 vs AWS ARM)
Consumo em Modo Ocioso (Watts)
Consumo sob Estresse Máximo (Watts)
Tempo de Resposta da Rede (RTT / Latência)
Estimativa de Emissão de Carbono (CO2 por mil requisições)

## 6. Conclusão

## Referências
https://www.vertiv.com/pt-latam/about/news-and-insights/articles/blog-posts/the-search-for-the-sustainability-triangle-pue-cue-and-wue/

https://ric.cps.sp.gov.br/bitstream/123456789/22150/3/informaticanegocios_2023_1_renanbernardomanuquian_greenitpraticasetecnologiassutentavei.pdf

https://www.techtarget.com/searchcio/definition/green-IT-green-information-technology
  
## Créditos

  - **Alunos:** João Henrique Silva
  - **Disciplina:** CCOM0031 - REDES DE COMPUTADORES (2025 .2 - T01)
  - **Professor:** Mário Antônio Meireles Teixeira
  - **Instituição:** UFMA — Universidade Federal do Maranhão

