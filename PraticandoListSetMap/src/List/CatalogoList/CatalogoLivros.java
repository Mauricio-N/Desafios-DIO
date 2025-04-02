package List.CatalogoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return this.livros;
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
   }
    public void pesquisarPorAutor(String autor){
        if(!livros.isEmpty()){
            List<Livro> livrosTemporarios = new ArrayList<>();
            livros.forEach(livro -> {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosTemporarios.add(livro);
                }
            });
           // System.out.println(livrosTemporarios);
            for(Livro livro: livrosTemporarios){
                System.out.printf("""
                        Título: %s
                        Autor:  %s
                        Ano de publicação: %d
                        ########################
                        """,livro.getTitulo(),livro.getAutor(),livro.getAnoPublicacao());
            }
            System.out.println("Quantidade total de livros encontrados: "+livrosTemporarios.size());
        }else{
            System.out.println("Nenhum livro encontrado");
        }
   }
    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaTemporaria = new ArrayList<>();
        if(!livros.isEmpty()){
        for(Livro livro: livros){
            if(livro.getAnoPublicacao() >=anoInicial &&
                    livro.getAnoPublicacao() <=anoFinal){
                listaTemporaria.add(livro);
            }
        }
            System.out.println(listaTemporaria);
            System.out.println("Livros encontrados: "+listaTemporaria.size());

        }else {
            System.out.println("Não há livros adicionados");
        }
    }
    public void ordenarPorAutor(){
        Collections.sort(livros);
    }
    public void ordenarPorAno(){
        //NOVO
        livros.sort(new OrdenarPorAno());
        //ANTIGO
        //Collections.sort(livros,new OrdenarPorAno());
    }
}
    //ORDENACOES OPCIONAIS DA CLASSE
    class OrdenarPorAno implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAnoPublicacao(),l2.getAnoPublicacao());
    }
}
