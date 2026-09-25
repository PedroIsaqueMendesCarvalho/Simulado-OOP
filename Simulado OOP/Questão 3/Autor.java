public class Autor{
    private String nome;
    private String nacionalidade;
    Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    public String getNome(){
        return nome;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }

}