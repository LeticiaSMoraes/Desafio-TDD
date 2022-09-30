public class Gerente extends Funcionario{

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao(){
        return super.bonificacao() + 10000.00;
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
