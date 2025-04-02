package List.CatalogoList;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        //METODO MANUAL
        return this.autor.compareTo(outroLivro.getAutor());
    }
    @Override
    public String toString() {
        return "Livro:\n" +
                "titulo='" + this.titulo + '\n' +
                "autor='" + this.autor + '\n' +
                "anoPublicacao=" + this.anoPublicacao +
                "\n********************"+
                '\n';
    }

}//fim da classe
