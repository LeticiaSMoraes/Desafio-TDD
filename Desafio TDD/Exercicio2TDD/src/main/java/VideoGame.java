public class VideoGame extends Produto implements Imposto{

    String marca;
    String modelo;
    Boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, Boolean isUsado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getUsado() {
        return isUsado;
    }

    public void setUsado(Boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if(this.isUsado){
            imposto = super.getPreco()*0.25;
            System.out.println("Imposto " + super.getNome() + " " + this.getModelo() + " usado, R$ " + imposto + ".");
        } else {
            imposto = super.getPreco()*0.45;
            System.out.println("Imposto " + super.getNome() + " " + this.getModelo() + " R$ " + imposto + ".");
        }
        return imposto;
    }

    @Override
    public String toString() {
        return "Vídeo-game: " + super.getNome() +
                ", preço: " + super.getPreco() +
                ", quantidade: " + super.getQuantidade() +
                " em estoque.";
    }
}
