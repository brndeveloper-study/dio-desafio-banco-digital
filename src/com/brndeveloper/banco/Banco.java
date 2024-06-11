package com.brndeveloper.banco;
import com.brndeveloper.banco.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    // todo: fazer com que contasList aumente quando instanciar uma conta
    private List<Conta> contasList;

    public Banco(String nome) {
        this.nome = nome;
        this.contasList = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarConta(Conta conta) {
        this.contasList.add(conta);
    }

    public void mostrarContasRegistradas() {
        System.out.println(contasList);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
