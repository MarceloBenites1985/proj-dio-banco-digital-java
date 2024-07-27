package desafio_dio_bancodigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        conta1.depositar(1000);
        conta1.sacar(200);
        conta1.transferir(300, conta2);

        System.out.println("Detalhes das Contas:");
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
            System.out.println("Transações:");
            for (Transacao transacao : conta.getTransacoes()) {
                System.out.println(transacao);
            }
            System.out.println();
        }
    }
}
