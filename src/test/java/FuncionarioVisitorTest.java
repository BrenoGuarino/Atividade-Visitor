import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioVisitorTest {

    @Test
    void deveExibirEstagiario() {
        Estagiario estagiario = new Estagiario("Breno", new Curso("Sistemas de Informação"), 6);

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Estagiario{nome='Breno', curso=Sistemas de Informação, carga Horária=6}", visitor.exibir(estagiario));
    }

    @Test
    void deveExibirJunior() {
        Junior junior = new Junior("Joana", 8);

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Junior{nome='Joana', carga Horária=8}", visitor.exibir(junior));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("Matheus", 10);

        FuncionarioVisitor visitor = new FuncionarioVisitor();
        assertEquals("Gerente{nome='Matheus', carga Horária=10}", visitor.exibir(gerente));
    }

}