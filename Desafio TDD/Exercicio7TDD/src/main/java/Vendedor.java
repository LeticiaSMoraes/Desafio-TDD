public class Vendedor extends Funcionario{

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao(){
        return super.bonificacao() + 3000.00;
    }

    @Override
    public String toString() {
        return "Vendedor{ " +
                ", nome='" + getNome() +
                ", idade='" + getIdade() +
                ", salário='" + getSalario() +
                ", bonificação='" + super.bonificacao() +
                "}";
    }
}
