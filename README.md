﻿# ConsoleDataBrick
# 🔍 Projeto UserActivityTracker

## 📌 Visão Geral
O **UserActivityTracker** é um sistema que monitora e registra as ações realizadas por usuários e empresas, garantindo transparência e insights sobre interações dentro da plataforma. Esse projeto faz parte da **simbiose do Databricks**, integrando-se ao ecossistema para análise de dados avançada.

## 🎯 Objetivo
O principal objetivo do **UserActivityTracker** é:
- **Registrar todas as ações** dos usuários e empresas dentro do sistema.
- **Fornecer rastreamento detalhado** para auditoria e otimização de processos.
- **Facilitar a integração com Databricks** para análise de dados e geração de insights.

## 🏗️ Arquitetura
O projeto utiliza **Node.js** para comunicação com **Spring Boot**, que gerencia a persistência dos dados e garante que todas as ações sejam registradas corretamente.

### 🔹 Tecnologias Utilizadas
- **Node.js** → Envia eventos de ação do usuário para o backend.
- **Spring Boot** → Processa e armazena os dados no banco de dados.
- **MySQL** → Banco de dados para persistência das atividades.
- **Databricks** → Integração para análise avançada de dados e geração de relatórios.

## 🔧 Configuração
### 🔹 Pré-requisitos
1. **Instalar Node.js**
   ```bash
   npm install
