package org.example;

public interface Visitor {

    String exibirEstagiario(Estagiario estagiario);
    String exibirGerente(Gerente gerente);
    String exibirJunior(Junior junior);

}