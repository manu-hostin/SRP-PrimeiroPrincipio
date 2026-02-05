public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("PED-123", 600.00, 5, "cliente@email.com");

        ServicoPedido servicoDePedido = new ServicoPedido();
        servicoDePedido.processarPedido(pedido);
    }
}
