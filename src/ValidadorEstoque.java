
public class ValidadorEstoque {
    // Responsabilidade 1: Validar o estoque do pedido
    public void validarEstoque(Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
    }
}
