public class Main {
    public static void main(String[] ARGS){
        Autor autor1 = new Autor ("Isaac Asimov", "Russo-Americano");
        Livro livro1 = new Livro("Fundação", 29.90, autor1);
        livro1.exibirDetalhes();
    }
    
}