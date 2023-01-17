import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {
    @Test
    void deveConectarComCentral(){
        Pessoa pessoa = new Pessoa("Fulano", "999999999-99");
        assertEquals("Conectando com um de nossos atendentes na Cetral de Atendimento", pessoa.ligarPara(Central.getInstancia()));
    }

    @Test
    void deveConectarComOuvidoria(){
        Pessoa pessoa = new Pessoa("Fulano", "999999999-99");
        assertEquals("Conectando com um de nossos atendentes na Ouvidoria", pessoa.ligarPara(Ouvidoria.getInstancia()));
    }

    @Test
    void deveConectarComAnatel(){
        Pessoa pessoa = new Pessoa("Fulano", "999999999-99");
        assertEquals("Conectando com um de nossos atendentes na Anatel", pessoa.ligarPara(Anatel.getInstancia()));
    }
}
