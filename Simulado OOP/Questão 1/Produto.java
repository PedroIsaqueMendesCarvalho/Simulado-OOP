public class Produto {
    // atributo publico, deveria ser private
    public String nome;
    // static faz todos os produtos compartilharem o mesmo preco
    private static double preco;
    final int codigo;

    public Produto(String nome) {
        // String "A100" nao pode ser atribuida a int
        codigo = "A100";
        // parametro atribuido a ele mesmo, falta this.nome
        nome = nome;
    }

    public static void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * (porcentagem / 100));
        // metodo static nao acessa atributo de instancia
        System.out.println("Produto: " + nome);
    }

    public void setCodigo(int novoCodigo) {
        // atributo final nao pode ser reatribuido
        this.codigo = novoCodigo;
    }

    // metodo void nao pode retornar valor, deveria ser double
    public void getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado");
        // atributo static acessado via objeto, usar Produto.preco
        p1.preco = 150.0;
        // atributo final nao pode ser reatribuido
        p1.codigo = 500;

        // metodo void nao retorna valor para atribuir a double
        double valor = p1.getPreco();
        System.out.println("Valor: " + valor);

        Produto.aplicarDesconto(10);
    }
}