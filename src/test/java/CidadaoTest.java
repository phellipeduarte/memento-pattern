import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CidadaoTest {

    @Test
    void deveInstanciarCidadaoSolteiro(){
        Cidadao cidadao = new Cidadao();
        assertEquals(EstadoCivilSolteiro.getInstancia(), cidadao.getEstado());
    }

    @Test
    void deveArmazenarEstadoCivil(){
        Cidadao cidadao = new Cidadao();
        cidadao.setEstado(EstadoCivilCasado.getInstancia());
        cidadao.setEstado(EstadoCivilDivorciado.getInstancia());
        assertEquals(3, cidadao.getEstadosCivil().size());
    }

    @Test
    void deveRestaurarEstadoCivil(){
        Cidadao cidadao = new Cidadao(EstadoCivilCasado.getInstancia());
        cidadao.setEstado(EstadoCivilDivorciado.getInstancia());
        cidadao.restauraEstado(0);
        assertEquals(EstadoCivilCasado.getInstancia(), cidadao.getEstado());
    }

    @Test
    void deveRestaurarEstadoCivilAnterior(){
        Cidadao cidadao = new Cidadao();
        cidadao.setEstado(EstadoCivilCasado.getInstancia());
        cidadao.setEstado(EstadoCivilSeparado.getInstancia());
        cidadao.setEstado(EstadoCivilDivorciado.getInstancia());
        cidadao.restauraEstado(cidadao.getEstadosCivil().size() - 1 - 1);
        assertEquals(EstadoCivilSeparado.getInstancia(), cidadao.getEstado());
    }

    @Test
    void deveRetornarExcessaoIndiceLimiteInferior(){
        try{
            Cidadao cidadao = new Cidadao();
            cidadao.restauraEstado(0);
        }catch (IllegalArgumentException exception){
            assertEquals("Índice inválido", exception.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoIndiceLimiteSuperior(){
        try{
            Cidadao cidadao = new Cidadao();
            cidadao.restauraEstado(2);
        }catch (IllegalArgumentException exception){
            assertEquals("Índice inválido", exception.getMessage());
        }
    }
}
