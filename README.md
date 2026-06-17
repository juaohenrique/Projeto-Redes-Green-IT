
# Green IT - Tecnologia da Informação aplicada de forma consciente e sustentável

Este trabalho busca apresentar os principais conceitos e definições relacionados a Green IT, combinado com o levantamento dos principais cases do mercado de nuvem e, ainda, a implementação prática de projeto que aplica de forma suscinta os conhecimentos adquiridos.

## Introdução

A preocupação com a sustentabilidade, há anos, deixou de ser um mero diferencial entre as empresas e passou a ser um pilar estratégico corporativo, sendo a TI uma peça fundamental nesse cenário uma vez que demanda alto consumo energético e gera muito resíduos eletrônicos poluidores. 

Segundo o estudo Digital Economy and Climate Impact, divulgado pela Schneider Electric em 2021, a TI é uma das maiores consumidoras de energia elétrica no mundo, além de revelar que a demanda de eletricidade do setor de TI deverá aumentar em quase 50% até 2030. E para suprir a demanda energética, é preciso investir em produção de mais energia — o que, consequentemente, gera mais CO2 que é expelido para a atmosfera.

Nesse sentido, Green IT, ou TI Verde, representa um conjunto de práticas que reduzem o impacto da tecnologia no meio-ambiente sem abrir mão da melhoria da eficiência e da redução dos custos, além de promover uma imagem de responsabilidade ambiental para as empresas, ainda que seja motivado pela alta no custo da energia, do alcance de metas ESG mais rigorosas ou da maior transparência exigida por investidores e clientes.


## Definição

Green IT representa o conjunto de práticas e tecnologias que buscam minimizar o impacto ambiental da TI como um todo, da fabricação e uso até o descarte de equipamentos. Isso inclui otimização do consumo de energia e aumento da vida útil dos equipamentos, migração de workloads para data centers com eficiência energética ou fornecedores que usam fontes renováveis.

### A TI verde se subdivide em:
    
**Green in IT (Verde na TI):** Foco na infraestrutura física. Refere-se à eficiência energética de servidores físicos, sistemas de resfriamento de data centers, transição para fontes de energia renovável e reciclagem de lixo eletrônico (e-waste).

**Green by IT (Verde pela TI):** Usar a tecnologia para tornar outros setores mais sustentáveis. Exemplos: sistemas de redes inteligentes (smart grids), aplicativos de otimização de rotas logísticas para gastar menos combustível ou videoconferências que evitam viagens aéreas.

**Green of IT / Green Software (Verde do Software):** Prática de projetar, desenvolver e executar aplicações eficientes. É aqui que o seu software se torna um agente ativo, consumindo menos CPU, memória e dados de rede para a mesma tarefa.


## Métricas
- **PUE:** relação entre energia total do data center e energia consumida pela TI. Quanto mais próximo de 1, melhor.

$$PUE = \frac{\text{Energia Total do Data Center}}{\text{Energia Consumida pelos Equipamentos de TI}}$$

- **CUE** mede a intensidade de carbono direta da infraestrutura.

$$CUE = \frac{\text{Total de Emissões de } CO_2e \text{ do Data Center (g)}}{\text{Energia Consumida pelos Equipamentos de TI (kWh)}}$$

- **DCiE:** inversa do PUE, representa a porcentagem da energia que realmente chega ao hardware útil.

$$DCiE = \frac{1}{PUE} = \frac{\text{Energia Consumida pelos Equipamentos de TI}}{\text{Energia Total do Data Center}} \times 100\%$$

- **WUE:** mede o impacto hídrico causado pelo resfriamento dos servidores

$$WUE = \frac{\text{Consumo Anual de Água (Litros)}}{\text{Energia Consumida pelos Equipamentos de TI (kWh)}}$$

- **CER:** eficiência de resfriamento, padronizada na ISO/IEC 30134-7.

- **Utilização real do hardware:** CPU, memória, IOPS, throughput, latência.

- **Energia por transação/requisição:** métrica excelente para software e sistemas.

- **Desempenho por Watt:** muito útil para comparar arquiteturas e stacks.


## Níveis
**Green IT 1.0 (Foco Tático/Eficiência):** Reduzir o consumo de energia da própria infraestrutura de TI (fazer o data center gastar menos, otimizar refrigeração). É o "Verde na TI".

**Green IT 2.0 (Foco Estratégico/Transformacional):** Usar a TI como ferramenta de eco-eficiência para transformar os processos da sociedade 
e do negócio (reduzir pegada de carbono global, logística verde, eliminação de papel). É o "Verde pela TI".

## Ambientes
**On-Premises Tradicional:** Baixa eficiência. Servidores subutilizados mantidos resfriados 24/7 (PUE alto, próximo de 2.0).

**Virtualização / HCI (Hiperconvergência):** Consolidação de servidores físicos. Menos hardware ligado, melhor aproveitamento de CPU.

**Containers / Kubernetes:** Eliminação do overhead de Sistemas Operacionais redundantes. Máxima densidade de microsserviços por Watt.

**Cloud Computing:** Escala hiper-eficiente. Data centers projetados para operar com PUE próximo a 1.15, alimentados por matrizes de energia 100% renováveis.


## Software Eficiente
Software com menos chamadas inúteis, menos loops custosos, menos I/O excessivo e melhor uso de cache tende a consumir menos energia porque exige menos trabalho da máquina.


## O Padrão ISO do Green Software: Software Carbon Intensity (SCI)
O SCI não mede o volume total de carbono emitido (que sempre cresce conforme o número de usuários aumenta), mas sim a taxa de emissão por unidade funcional. Portanto, não é uma métrica de volume absoluto, mas de intensidade.
### A Equação do SCI (Software Carbon Intensity)

$$SCI = \frac{(E \times I) + M}{R}$$

Onde:
- **E**: Energy consumed by the software system (in kWh).
- **I**: Location-based carbon intensity of the grid ($gCO_2e/kWh$).
- **M**: Embodied carbon of the hardware used to run the software.
- **R**: Functional unit (e.g., per active user, per 1,000 API requests, per transaction).


## Estratégias Arquiteturais para Computação Verde em Nuvem
**Deslocamento Temporal (Temporal Shifting):** Consiste em adiar a execução de tarefas que não são de tempo real (backups, geração de relatórios pesados, processamento de lote/batch) para horários em que a intensidade de carbono da rede elétrica local ($I$) esteja mais baixa.

**Deslocamento Espacial (Spatial Shifting):** Consiste em mover dinamicamente o tráfego e o processamento de dados pela rede para regiões geográficas cuja energia seja mais limpa naquele instante, mesmo que isso custe uma latência ligeiramente maior.


## Estudos de Caso
### Google Cloud Platform (GCP)
- Meta verde: 
  - Pretende operar com energia 100% livre de carbono, 24 horas por dia, 7 dias por semana, até 2030.
- Foco:
  - Computação inteligente em carbono (deslocando tarefas pesadas e não urgentes para horários ou locais com maior oferta de energia renovável).
- Ferramentas: 
  - Google Cloud Carbon Footprint;

### Microsoft Azure
- Meta verde: 
  - Compromisso de ser carbono negativo até 2030 e remover todas as suas emissões históricas até 2050.
- Foco:
  - Economia circular nativa da nuvem, investindo fortemente em reposição de água e operações de data center com zero descarte de resíduos.
- Ferramentas: 
  - Microsoft Emissions Impact Dashboard;

### Amazon Web Services (AWS)
- Meta verde: 
  - Compromisso de alcançar 100% de uso de energia renovável em suas operações.
- Foco:
  - Altas taxas de utilização de recursos e processadores customizados (como o AWS Graviton), que entregam melhor desempenho computacional por watt do que os servidores x86 tradicionais.
- Ferramentas: 
  - AWS Sustainability Consol [detalhes](https://aws.amazon.com/pt/sustainability/tools/console/)
  - Customer Carbon Footprint Tool - CCFT [detalhes](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/ccft-overview.html)
  - AWS Graviton - família de processadores de servidores projetada pela própria Amazon Web Services (AWS). Eles são baseados na arquitetura ARM (em vez da arquitetura tradicional x86) e têm o objetivo de entregar o melhor custo-benefício e eficiência energética para aplicações executadas na nuvem.
  
### Oracle Cloud Infrastructure (OCI)
- Meta verde: 
  - Meta de 100% de uso de energia renovável em todos os seus data centers globalmente até 2025.
- Foco:
  - Alta consolidação de hardware. A OCI utiliza sistemas de resfriamento altamente eficientes e programas agressivos de reciclagem de servidores (reciclando 99% do hardware aposentado).
- Ferramentas: 
  - OCI Carbon Footprint Dashboard.

### DigitalOcean
- Meta verde: 
  - Foca na eficiência dos servidores e em implantações de alta densidade, em vez de grandes suítes de sustentabilidade corporativa.
- Foco:
  - Pegada ecológica menor devido a operações simplificadas e utilização de créditos de compensação de carbono de terceiros.
- Ferramentas: 
  - 

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

https://www.researchgate.net/publication/396527521_The_Green_Cloud_Computing_An_Approach_to_Technological_Sustainability_Case_Study
https://ric.cps.sp.gov.br/bitstream/123456789/22150/3/informaticanegocios_2023_1_renanbernardomanuquian_greenitpraticasetecnologiassutentavei.pdf


https://www.meegle.com/en_us/topics/green-it-strategies/cloud-computing-and-green-it
https://gartsolutions.com/how-cloud-computing-reduces-carbon-footprint-case-studies/
https://www.vertiv.com/pt-latam/about/news-and-insights/articles/blog-posts/the-search-for-the-sustainability-triangle-pue-cue-and-wue/
https://www.techtarget.com/searchcio/definition/green-IT-green-information-technology
https://evernex.com/pt-br/guia-de-mercado/green-it/
  
## Créditos

  - **Alunos:** João Henrique Silva, Alanna Rocha Monteiro
  - **Disciplina:** CCOM0031 - REDES DE COMPUTADORES (2025 .2 - T01)
  - **Professor:** Mário Antônio Meireles Teixeira
  - **Instituição:** UFMA — Universidade Federal do Maranhão

