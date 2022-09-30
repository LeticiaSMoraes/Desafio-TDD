public class Livro extends Produto implements Imposto{

    private String autor;
    private String tema;
    private int quantidadePagina;


    public Livro() {
    }

    public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidadePagina) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadePagina = quantidadePagina;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if(this.tema.equals("educativo")){
            imposto = 0;
            System.out.println("Livro educativo não tem imposto: " + super.getNome() + ".");
        } else {
            imposto = super.getPreco()*0.1;
            System.out.println("R$ " + imposto + " de impostos sobre o livro " + super.getNome() + ".");
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Título: " + super.getNome() +
                ", preço: " + super.getPreco() +
                ", quantidade: " + super.getQuantidade() +
                " em estoque.";
    }
}
