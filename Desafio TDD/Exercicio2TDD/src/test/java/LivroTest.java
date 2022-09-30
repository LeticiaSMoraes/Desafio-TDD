import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LivroTest {

    Livro l1,l2;


    @Before
    public void setup(){
        l1 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
        l2 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
    }


    @Test
    public void deveCalcularImpostoLivroTemaDiferenteDoEducativo(){
        assertEquals(6.0, l1.calculaImposto(), 0.0001);
    }

    @Test
    public void deveCalcularImpostoZeradoParaLivroTemaEducativo(){
        assertEquals(0.0, l2.calculaImposto(), 0.0001);
    }

}
