package com.brndeveloper.banco.contas;
import com.brndeveloper.banco.Banco;
import com.brndeveloper.banco.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 3;
    private static int ID = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = ID++;
        this.cliente = cliente;
        this.banco = banco;
        banco.adicionarConta(this);
        cliente.adicionarBanco(banco);
    }

    public Conta(String nomeCliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = ID++;
        this.cliente = new Cliente(nomeCliente);
        this.banco = banco;
        banco.adicionarConta(this);
        cliente.adicionarBanco(banco);
    }

    // Apenas uma Exception Teste...
    @Override
    public void sacar(double valor) throws RuntimeException {
        try {
            if (this.saldo < valor) {
                throw new RuntimeException();
            }
            this.saldo -= valor;
        } catch (RuntimeException e) {
            System.out.println("Erro. Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } catch (RuntimeException e) {
            System.out.println("Erro. Saldo insuficiente!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
