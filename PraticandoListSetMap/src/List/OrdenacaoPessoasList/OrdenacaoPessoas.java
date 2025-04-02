package List.OrdenacaoPessoasList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();;
    }
    public void adicionarPessoas(String nome,int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    public void ordenarPornome(){
        Collections.sort(pessoas);
    }
    public void ordenarPorAltura(){
        pessoas.sort(new OrdenarPorAltura());
    }
    public void ordenarPorIdade(){
        pessoas.sort(new OrdenarPorIdade());
    }
}
class OrdenarPorAltura implements Comparator<Pessoa> {
    //copia a lista pessoas e podemos implementar o Collections nela
    //List<Pessoa> pessoasTemp = new ArrayList<>(pessoas);
    //Collections.sorte(pessoasTemp);
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}
class OrdenarPorIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getIdade(),p2.getIdade());
    }
}

