public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("123", 450.00, 2, "cliente@example.com");

        ServicoPedido servicoDePedido = new ServicoPedido();
        servicoDePedido.processarPedido(pedido);
    }
}
