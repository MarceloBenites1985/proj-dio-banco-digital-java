package desafio_dio_bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private static int numeroSequencial = 1;
    private int numero;
    private Cliente cliente;
    private double saldo;
    private List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.numero = numeroSequencial++;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            transacoes.add(new Transacao("Depósito", valor));
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", -valor));
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
            transacoes.add(new Transacao("Transferência para conta " + contaDestino.getNumero(), -valor));
            contaDestino.getTransacoes().add(new Transacao("Transferência da conta " + this.numero, valor));
        }
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}
