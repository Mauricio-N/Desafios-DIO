import List.OrdenacaoPessoasList.OrdenacaoPessoas;
import Set.ConjuntoConvidadosSet.ConjuntoConvidados;

public class Main {
    public static void main(String[] args) {
        //LIST
        //TAREFAS
        /*
        ListTarefas tarefas = new ListTarefas();
        tarefas.adicionarTarefa("lele");
        tarefas.adicionarTarefa("Rodigo");
        tarefas.adicionarTarefa("Jeffzinho");
        tarefas.adicionarTarefa("lele");
        tarefas.obterNumeroTotalTarefas();
        tarefas.removerTarefa("lele");
        tarefas.obterNumeroTotalTarefas();
        tarefas.adicionarTarefa("Gabriel");
        tarefas.obterNumeroTotalTarefas();
        tarefas.obterDescricoesTarefas();
        */
        // CARRINHO DE COMPRAS
        /*
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("Carro1",11.1,3);
        compras.adicionarItem("Carro2",9,2);
        compras.adicionarItem("Carro3",212.2,1);
        compras.adicionarItem("Carro2",9,3);
        compras.calcularValorTotal();
        compras.exibirItens();
        compras.removerItem("carro2");
        compras.calcularValorTotal();
        compras.exibirItens();
        */
        //CATALOGO DE LIVROS
        /*
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("Eu enrolo muito","Mariana",1999);
        livros.adicionarLivro("Cada vez mais chato","Mauricio",1991);
        livros.adicionarLivro("Devo estudar mais","Arthur",1990);
        livros.adicionarLivro("Meu Jeju Sise","Cidinha",1980);
        livros.adicionarLivro("Brincar em dobro","Arthur",1989);
        livros.pesquisarPorAutor("arthur");
        //livros.pesquisarPorIntervaloAnos(1990,2000);
        System.out.println("#######################");
        livros.ordenarPorAno();
        System.out.println(livros.getLivros());
        System.out.println("#######################");
        livros.ordenarPorAutor();
        System.out.println(livros.getLivros());
        System.out.println("#######################");
        */
        //SOMA DE NUMEROS
        /*
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionaNumero(10);
        numeros.adicionaNumero(2);
        numeros.adicionaNumero(10);
        numeros.adicionaNumero(-10);
        numeros.adicionaNumero(1000);
        numeros.encontrarMenorNumero();
        numeros.encontrarMaiorNumero();
        */
        //ORDENACAO PESSOAS
        /*
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        System.out.println("Teste");
        */

        //SET
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Mauricio",1231);
        convidados.adicionarConvidado("Cidinha",1233);
        convidados.adicionarConvidado("Mariana",1211);
        convidados.adicionarConvidado("Arthur",1232);
        convidados.exibirConvidados();
        convidados.contarConvidados();

    }
}
