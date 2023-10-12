package br.com.dio.entidades;

import br.com.dio.enums.Genero;

public class Pessoa {

    private String nome;
    private Genero genero;
    private int telefone;
    private AparelhoTelefonico aparelhoTelefonico;

    public Pessoa() {
    }

    public Pessoa(String nome, Genero genero, int telefone, AparelhoTelefonico aparelhoTelefonico) {
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public String getNome() {
        return nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getTelefone() {
        return telefone;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }


}
