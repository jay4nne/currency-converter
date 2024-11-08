# Conversor de Moedas
### Sobre o Projeto

O Conversor de Moedas é uma aplicação web que permite converter valores entre diferentes moedas. Desenvolvido como parte da Fase de Especialização do Programa ONE (Oracle Next Education), o projeto tem o objetivo de demonstrar habilidades em Java, com foco especial no consumo de <abbr title="Application Programming Interface">API</abbr> para obter dados de câmbio.

### Funcionalidades

  -  **Conversão de Moedas:** O usuário seleciona uma entre seis opções de conversão disponíveis. Após inserir o valor que deseja converter, o sistema retorna o valor convertido, atualizado com base nas taxas de câmbio.
  - **Atualização em Tempo Real:** Utiliza a [API Exchange Rate](https://www.exchangerate-api.com/) para garantir que as conversões sejam feitas com as taxas mais recentes.

###  Recursos Utilizados

   - **Java:** Programação orientada a objetos e tratamento de exceções.
   - **Biblioteca Gson:** Para conversão de objetos JSON.
   - **Comunicação Cliente-Servidor:** Integração com API para consumo de dados em tempo real.

### Conceitos Aplicados

- **Orientação a Objetos (POO)**: Estruturação de classes e métodos para modularidade.
- **Manipulação de JSON:** Uso de JsonObject e JsonParse (org.json) e Gson para parsing de dados da API.
- **Tratamento de Exceções:** Gerenciamento de erros na aplicação.
