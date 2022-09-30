import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public ListaPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }


    public String pessoaMaisVelha(List<Pessoa> pessoas) {
        int maiorIdade = 0;
        String pessoaMaisVelha = " ";
        for(int i=0; i<pessoas.size(); i++){
            if(pessoas.get(i).getIdade() > maiorIdade){
                maiorIdade = pessoas.get(i).getIdade();
                pessoaMaisVelha = pessoas.get(i).getNome();
            }
        }
        //System.out.println(" A pessoa mais velha da lista se chama " + pessoaMaisVelha);
        return pessoaMaisVelha;
    }

    public void excluirNomeMenorQueIdade(int idade){
        System.out.println("A lista têm " + pessoas.size() + " pessoas cadastradas");
        for(int i=0; i<pessoas.size(); i++) {
            if (pessoas.get(i).getIdade() < idade) {
                pessoas.remove(i);
            }
        }
        System.out.println("A lista têm " + pessoas.size() + " pessoas cadastradas");
    }

    public Boolean consultarPessoaNaLista(String nome){
        Boolean estaNaLista = false;
        for(int i=0; i<pessoas.size(); i++) {
            if (pessoas.get(i).getNome() == nome) {
                estaNaLista = true;
                System.out.println(pessoas.get(i).getNome() + " está na lista e tem " + pessoas.get(i).getIdade() + " anos.");
            }
        }
        if(estaNaLista == false) {
            System.out.println("O nome não está na lista");
        }
        return estaNaLista;
    }
}
