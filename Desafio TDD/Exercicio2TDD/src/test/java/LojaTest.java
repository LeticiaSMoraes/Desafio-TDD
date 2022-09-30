import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LojaTest {

    private Loja loja;
    private List<Livro> livros;
    private List<VideoGame> games;
    private Livro l1,l2,l3;
    private VideoGame ps4, ps4Usado, xbox;

    @Before
    public void setup(){
        livros = new ArrayList<>();
        games = new ArrayList<>();
        loja = new Loja("Americanas", "12345678", livros, games);
        l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
        l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
        l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
        ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
    }


    @Test
    public void deveImprimirMensagemCasoListaLivrosVazia(){
        loja.listaLivros();
    }

    @Test
    public void deveImprimirListaLivros(){
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        loja.listaLivros();
        assertEquals(3, loja.livros.size());
    }
    @Test
    public void deveImprimirMensagemCasoLListaVideoGameVazia(){
        loja.listaVideoGames();
    }

    @Test
    public void deveImprimirListaVideoGame(){
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);
        loja.listaVideoGames();
        assertEquals(3, loja.videoGames.size());
    }

    @Test
    public void deveCalcularPatrimonioZeradoParaLojaSemProdutos(){
        assertEquals(0.0, loja.calculaPatrimonio(), 0.0001);
    }

    @Test
    public void deveCalcularPatrimonioParaLojaComProduto(){
        livros.add(l1);
        games.add(ps4);
        assertEquals(182000, loja.calculaPatrimonio(), 0.0001);
    }
}
