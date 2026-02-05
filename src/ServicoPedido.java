public class ServicoPedido {
    // Classe orquestradora para coordenar as responsabilidades
    private ValidadorEstoque validadorEstoque;
    private CalculoFrete calculoFrete;
    private SalvarBD persistencia;
    private Notificacao notificacao;

    public ServicoPedido() {
        // Instanciando as dependências
        this.validadorEstoque = new ValidadorEstoque();
        this.calculoFrete = new CalculoFrete();
        this.persistencia = new SalvarBD();
        this.notificacao = new Notificacao();
    }

    public void processarPedido(Pedido pedido) {
        try {
            // Valida o estoque
            validadorEstoque.validarEstoque(pedido);

            double valorFinal = calculoFrete.calcularFreteImpostos(pedido);

            persistencia.salvarNoBancoDeDados(pedido, valorFinal);

            notificacao.enviarConfirmacaoPorEmail(pedido);

            pedido.setPago(true);

            System.out.println("Processamento do pedido concluído com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao processar pedido: " + e.getMessage());
        }
    }
}
