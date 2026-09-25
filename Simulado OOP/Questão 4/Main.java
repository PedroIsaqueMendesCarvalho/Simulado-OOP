public class Main {
    public static void main(String[] args) {
        GestaoPedidos gestaoPedidos = new GestaoPedidos();
        gestaoPedidos.adicionarPedido("Arroz");
        gestaoPedidos.adicionarPedido("Feijão");
        gestaoPedidos.adicionarPedido("Macarrão");

        gestaoPedidos.listarPedidos();
        gestaoPedidos.quantidadePendente();

        gestaoPedidos.proximoPedido();
        gestaoPedidos.listarPedidos();
        gestaoPedidos.quantidadePendente();

       
    }
}