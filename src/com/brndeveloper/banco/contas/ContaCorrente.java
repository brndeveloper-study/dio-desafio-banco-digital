package com.brndeveloper.banco.contas;

import com.brndeveloper.banco.Banco;
import com.brndeveloper.banco.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public ContaCorrente(String nome, Banco banco) {
        super(nome, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO CONTA CORRENTE ---");
        super.imprimirExtrato();
    }

}
