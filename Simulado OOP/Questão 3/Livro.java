public class Livro{
    private String titulo;
    private double preco;
    private Autor autor;
    Livro(String titulo, double preco, Autor autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }
    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade do Autor: " + autor.getNacionalidade());

    }

}