# Banco Digital em Java

Este projeto é uma implementação básica de um banco digital utilizando a linguagem de programação Java e conceitos de orientação a objetos. O objetivo do projeto é simular operações bancárias básicas, como criação de contas, depósito, saque e transferência de dinheiro entre contas.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

1. **Cliente**: Representa um cliente do banco com informações básicas como nome e CPF.
2. **Conta**: Representa uma conta bancária que pertence a um cliente, com funcionalidades de depósito, saque e transferência.
3. **Transacao**: Representa uma transação realizada em uma conta bancária.
4. **Banco**: Representa o banco que gerencia várias contas.
5. **Main**: A classe principal que demonstra o funcionamento do sistema.

## Funcionalidades

- **Criação de clientes e contas**: Permite criar novos clientes e associar contas bancárias a esses clientes.
- **Depósito em conta**: Permite adicionar dinheiro a uma conta bancária.
- **Saque de conta**: Permite retirar dinheiro de uma conta bancária.
- **Transferência entre contas**: Permite transferir dinheiro de uma conta para outra.
- **Registro e exibição de transações**: Mantém um histórico de todas as transações realizadas em cada conta.

## Como Executar

1. **Clone o repositório**:
    ```sh
    git clone https://github.com/seuusuario/banco-digital-java.git
    cd banco-digital-java
    ```

2. **Compile os arquivos Java**:
    ```sh
    javac *.java
    ```

3. **Execute a aplicação**:
    ```sh
    java Main
    ```

## Melhorias Futuras

- Adicionar uma interface gráfica.
- Implementar persistência de dados com um banco de dados.
- Adicionar autenticação e autorização.
- Implementar mais tipos de contas (corrente, poupança, etc.).

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
