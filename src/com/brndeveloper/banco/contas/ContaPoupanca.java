package com.brndeveloper.banco.contas;

import com.brndeveloper.banco.Banco;
import com.brndeveloper.banco.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public ContaPoupanca(String nomeCliente, Banco banco) {
        super(nomeCliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO CONTA POUPANCA ---");
        super.imprimirExtrato();
    }
}
