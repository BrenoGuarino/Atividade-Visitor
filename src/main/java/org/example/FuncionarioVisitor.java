package org.example;

public class FuncionarioVisitor implements Visitor {

    public String exibir(Funcionario funcionario) {
        return funcionario.aceitar(this);
    }

    @Override
    public String exibirEstagiario(Estagiario estagiario) {
        return "Estagiario{" +
                "nome='" + estagiario.getNome() + '\'' +
                ", curso=" + estagiario.getNomeCurso() +
                ", carga Horária=" + estagiario.getCargaHoraria() +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "nome='" + gerente.getNome() + '\'' +
                ", carga Horária=" + gerente.getCargaHoraria() +
                '}';
    }

    @Override
    public String exibirJunior(Junior junior) {
        return "Junior{" +
                "nome='" + junior.getNome() + '\'' +
                ", carga Horária=" + junior.getCargaHoraria() +
                '}';
    }
}