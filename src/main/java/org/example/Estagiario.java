package org.example;

public class Estagiario implements Funcionario {

    private String nome;
    private Curso curso;
    private int cargaHoraria;

    public Estagiario(String nome, Curso curso, int cargaHoraria) {
        this.nome = nome;
        this.curso = curso;
        this.cargaHoraria = cargaHoraria;
    }



    public String getNome() {
        return nome;
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEstagiario(this);
    }

}