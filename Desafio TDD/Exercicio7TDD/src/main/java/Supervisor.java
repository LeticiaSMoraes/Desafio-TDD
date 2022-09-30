public class Supervisor extends Funcionario{

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao(){
        return super.bonificacao() + 5000.00;
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
