package sistemTeste;

import classes.Condicoes;
import classes.Carro;
import classes.Locador;
import sistem.Cadastro;
import sistem.SistemaLocacao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SistemaLocacaoTest {
    private Carro carro;
    private Locador locador;
    private Cadastro cadastro;
    private SistemaLocacao sistemaLocacao;

    private Condicoes condicoes;

    @Before
    public void setUp() {
        cadastro = new Cadastro();
        carro = new Carro(1, "Modelo A", "Vermelho");
        carro.setCondicoesDeUso(true);
        carro.setDisponibilidade(true);
        cadastro.cadastrarCarro(carro);

        locador = new Locador("Paulo", true, true);
        locador.setCNH(true);
        locador.setCredito(true);
        cadastro.cadastrarLocador(locador);

        condicoes = new Condicoes(true,true);

    }

    @Test
    public void testCarroPodeSerAlugado() {
        boolean podeSerAlugado = SistemaLocacao.podeSerAlugado(carro, locador);
        assertFalse(podeSerAlugado);
    }

    @Test
    public void testCarroNaoPodeSerAlugadoSemCondicoes() {
        carro.setCondicoesDeUso(false);
        boolean podeSerAlugado = SistemaLocacao.podeSerAlugado(carro, locador);
        assertFalse(podeSerAlugado);
    }

    @Test
    public void testCarroNaoPodeSerAlugadoSemDisponibilidade() {
        carro.setDisponibilidade(false);
        boolean podeSerAlugado = SistemaLocacao.podeSerAlugado(carro, locador);
        assertFalse(podeSerAlugado);
    }

    @Test
    public void testCarroNaoPodeSerAlugadoSemCredito() {
        locador.setCredito(false);
        boolean podeSerAlugado = SistemaLocacao.podeSerAlugado(carro, locador);
        assertFalse(podeSerAlugado);
    }

    // Métodos de teste para a classe Carro

    @Test
    public void testGetId() {
        assertEquals(1, carro.getId());
    }

    @Test
    public void testSetId() {
        carro.setId(456);
        assertEquals(456, carro.getId());
    }

    @Test
    public void testGetModelo() {
        carro.setModelo("ModeloX");
        assertEquals("ModeloX", carro.getModelo());
    }

    @Test
    public void testSetModelo() {
        carro.setModelo("ModeloY");
        assertEquals("ModeloY", carro.getModelo());
    }

    @Test
    public void testGetCor() {
        carro.setCor("Azul");
        assertEquals("Azul", carro.getCor());
    }

    @Test
    public void testSetCor() {
        carro.setCor("Vermelho");
        assertEquals("Vermelho", carro.getCor());
    }

    @Test
    public void testIsCondicoesDeUso() {
        assertTrue(carro.isCondicoesDeUso());
    }

    @Test
    public void testSetCondicoesDeUso() {
        carro.setCondicoesDeUso(false);
        assertFalse(carro.isCondicoesDeUso());
    }

    @Test
    public void testIsDisponibilidade() {
        assertTrue(carro.isDisponibilidade());
    }

    @Test
    public void testSetDisponibilidade() {
        carro.setDisponibilidade(false);
        assertFalse(carro.isDisponibilidade());
    }

    // Métodos de teste para a classe Locador

    @Test
    public void testGetNome() {
        assertEquals("Paulo", locador.getNome());
    }

    @Test
    public void testIsCNH() {
        assertTrue(locador.isCNH());
    }

    @Test
    public void testIsCredito() {
        assertTrue(locador.isCredito());
    }
    // Metodos da classe Condicoes

    @Test
    public void testIsLimpo() {
        // Act: Executar a ação que está sendo testada
        boolean limpo = condicoes.isLimpo();

        // Assert: Verificar se o resultado é o esperado
        assertTrue(limpo);
    }

    @Test
    public void testSetLimpo() {
        // Act: Executar a ação que está sendo testada
        condicoes.setLimpo(false);

        // Assert: Verificar se o resultado é o esperado
        assertFalse(condicoes.isLimpo());
    }

    @Test
    public void testIsCombustivel() {
        // Act: Executar a ação que está sendo testada
        boolean combustivel = condicoes.isCombustivel();

        // Assert: Verificar se o resultado é o esperado
        assertTrue(combustivel);
    }

    @Test
    public void testSetCombustivel() {
        // Act: Executar a ação que está sendo testada
        condicoes.setCombustivel(false);

        // Assert: Verificar se o resultado é o esperado
        assertFalse(condicoes.isCombustivel());
    }

}
