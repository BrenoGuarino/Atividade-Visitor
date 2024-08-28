package org.example;

public class Junior implements Funcionario {

    private String nome;
    private int cargaHoraria;

    public Junior(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }


    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirJunior(this);
    }

}
