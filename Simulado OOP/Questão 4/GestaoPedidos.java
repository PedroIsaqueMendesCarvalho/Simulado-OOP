import java.util.ArrayList;
import java.util.List;
public class GestaoPedidos {
    //string list to store the orders
    private List<String> pedidos;

    GestaoPedidos() {
        pedidos = new ArrayList<>();
    }
    public void adicionarPedido(String pedido) {
        pedidos.add(pedido);
    }
    public void proximoPedido() {
        if (!pedidos.isEmpty()) {
            String pedido = pedidos.remove(0);
            System.out.println("Preparando pedido: " + pedido);
        } else {
            System.out.println("Não há pedidos para preparar.");
        }
    }
    public void quantidadePendente() {
        System.out.println("Quantidade de pedidos pendentes: " + pedidos.size());
    }
    public void listarPedidos() {
        if (!pedidos.isEmpty()) {
            System.out.println("Pedidos atuais:");
            for (String pedido : pedidos) {
                System.out.println(pedido);
            }
        } else {
            System.out.println("Não há pedidos atuais.");
        }
    }

    
}