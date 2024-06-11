package com.brndeveloper.banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private List<Banco> bancosRegistrados;

    public Cliente(String nome) {
        this.nome = nome;
        this.bancosRegistrados = new ArrayList<>();
    }

    public void adicionarBanco(Banco banco) {
        this.bancosRegistrados.add(banco);
    }

    public void mostrarBancosRegistrados() {
        System.out.println(bancosRegistrados);
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
