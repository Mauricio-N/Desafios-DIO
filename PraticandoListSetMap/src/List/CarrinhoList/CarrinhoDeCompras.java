package List.CarrinhoList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras(){
        itens = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
    List<Item> itemList = new ArrayList<>();
    if(!this.itens.isEmpty()){
        itens.forEach(item -> {
            if (item.getNome().equalsIgnoreCase(nome)) {
             itemList.add(item);
            }
        });
        itens.removeAll(itemList);
    }else {
        System.out.println("Sem itens");
    }



    }
    public void calcularValorTotal(){
        double totalValor =0;
        for(Item item : itens){
            totalValor += item.getPreco()*item.getQuantidade();
        }
        System.out.println("Valor total de sua compra: "+totalValor);
    }
    public void exibirItens(){
        itens.forEach(item -> {
            System.out.println("Nome: "+item.getNome()+" Preco: "+item.getPreco()+" Quantidade: "+item.getQuantidade());
        });
        System.out.println("########################");
    }
}
