import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListaPessoasTest {

    List<Pessoa> pessoas;
    ListaPessoas listaPessoas;

    @Before
    public void setup(){
        pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        listaPessoas = new ListaPessoas(pessoas);
    }

    @Test
    public void deveImprimirPessoaMaisVelha(){
        assertEquals("Leandro", listaPessoas.pessoaMaisVelha(pessoas));
    }

    @Test
    public void deveExcluirDaListaTodasAsPessoasMenoresQue18Anos (){
        listaPessoas.excluirNomeMenorQueIdade(18);
        assertEquals(2, pessoas.size());
    }

    @Test
    public void deveConsultarPessoaNaListaEEncontrar(){
        assertTrue(listaPessoas.consultarPessoaNaLista("Jessica"));
    }

    @Test
    public void deveConsultarPessoaNaListaENaoEncontrar(){
        assertFalse(listaPessoas.consultarPessoaNaLista("Louise"));
    }
}
