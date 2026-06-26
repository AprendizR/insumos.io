# insumos.io — Precificação, Custos e DRE para Microempreendedores



**insumos.io** é uma aplicação (web/mobile) para ajudar **microempreendedores** a entenderem, registrarem e controlarem **custos, despesas, vendas e lucro**, com foco em **precificação correta** e geração de **DRE (Demonstrativo de Resultado do Exercício)**.



A dor que o projeto resolve: muita gente define preço “no achismo”, mistura despesas pessoais/empresa, não enxerga margem real e acaba vendendo com prejuízo sem perceber.



---



## 📋 Sobre o Projeto



Este projeto está sendo desenvolvido com foco em **excelência técnica**, **clareza de regras de negócio** e **entregas incrementais**, guiado por levantamento contínuo de requisitos e validação das necessidades reais do público-alvo.



- Documentação e planejamento: Notion (requisitos, regras de negócio, modelagem e backlog)

- Evolução por fases (MVP → fases seguintes)

- Cálculos financeiros com precisão e rastreabilidade



---



## ✨ Funcionalidades (escopo atual)



### Requisitos funcionais

- CRUD de **produtos**

- CRUD de **insumos** (unidade de medida e custo unitário)

- **Cálculo de custo total** do produto (insumos diretos + rateio de custos fixos)

- **Cálculo do preço de venda** a partir de margem desejada

- Registro de **vendas, compras e gastos** para geração de resultados

- Geração de **DRE**

- **Despesas fixas** com recorrência mensal (aluguel, internet, pró-labore etc.)

- **Rateio** de custos fixos baseado em volume mensal de produção

- **Histórico de preços/custos** dos insumos (rastreabilidade de margem)



### Regras de negócio importantes

- Custo final do produto = insumos (diretos) + rateio de fixos (indiretos)

- Preço de venda = `CustoTotal / (1 - (Margem% / 100))`

- **Atualização em cascata**: ao alterar custo de um insumo, recalcula produtos que usam esse insumo

- Rateio por equivalência baseado no volume de produção do período



---



## 🛠 Metodologia de Trabalho



- **Levantamento de Requisitos:** entrevistas e documentação contínua no Notion.

- **Modelagem:** diagrama de classes + regras de negócio como fonte de verdade.

- **Gestão de Tarefas:** backlog (Kanban) para acompanhar mini tasks e entregas.

- **DevOps (CI/CD):** via GitHub.



---



## 🚀 Tecnologias Utilizadas



- **Java 21**

- **Spring Boot**

- **Maven**

- **React** (frontend)

- **PostgreSQL** (banco de dados)

- **GitHub** (CI/CD)



---



### A modelagem e o diagrama de classes estão sendo mantidos no Notion.



---



## 🚦 Status do Projeto



- [✅] Requisitos levantados

- [ ] Modelagem de classes finalizada

- [✅] Setup do ambiente backend

- [ ] Setup do ambiente front

- [ ] Banco de dados

- [ ] Pipeline de CI/CD configurado

- [ ] Desenvolvimento do MVP (insumos + produtos + precificação)

- [ ] Fase 2 (despesas fixas + rateio)

- [ ] Fase 3 (DRE + exportações)



---



## 🧭 Roadmap (fases)



- **Fase 1:** CRUD de insumos e produtos + lógica de somatória de custos

- **Fase 2:** CRUD de despesas fixas + rateio por volume de produção

- **Fase 3:** Geração de DRE + exportação/backup



---



## 📜 Licença



Este projeto está licenciado sob a **MIT License** — veja o arquivo `LICENSE` para detalhes.
