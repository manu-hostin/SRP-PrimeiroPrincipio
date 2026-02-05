
public class SalvarBD {
    // Responsabilidade 3: Salvar o pedido no banco de dados
    public void salvarNoBancoDeDados(Pedido pedido, double valorFinal) {
        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");

    }
}
