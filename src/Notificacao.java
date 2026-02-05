
public class Notificacao {
    // Responsabilidade 4: Enviar notificação por e-mail
    public void enviarConfirmacaoPorEmail(Pedido pedido) {
        System.out.println("Email de confirmação enviado para: " + pedido.getEmailCliente() + " | Pedido: " + pedido.getId());

    }
}
