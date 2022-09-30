import java.util.List;

public class Loja {

    String nome;
    String cnpj;
    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros(){
        if(livros.size()==0){
            System.out.println("A loja não tem livros no seu estoque.");
        } else {
            System.out.println("A loja " + this.getNome() + " possui estes livros para venda:");
            for(int i=0; i<livros.size(); i++)
                System.out.println(livros.get(i));
        }
    }

    public void listaVideoGames() {
        if (videoGames.size() == 0) {
            System.out.println("A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("A loja " + this.getNome() + " possui estes video-games para venda:");
            for (int i = 0; i < videoGames.size(); i++) {
                System.out.println(videoGames.get(i));
            }
        }
    }

    public double calculaPatrimonio(){
        double patrimonio = 0;
        double patrimoniLivros = 0;
        double patrimonioVideoGames = 0;

        for(int i=0; i<livros.size(); i++){
            patrimoniLivros += livros.get(i).getPreco()*livros.get(i).getQuantidade();
        }
        for(int i=0; i<videoGames.size(); i++){
            patrimonioVideoGames += videoGames.get(i).getPreco()*videoGames.get(i).getQuantidade();
        }
        patrimonio = patrimoniLivros + patrimonioVideoGames;

        System.out.println("O patrimonio da loja: " + this.getNome() + " é de R$ " + patrimonio);
        return patrimonio;
    }

}
