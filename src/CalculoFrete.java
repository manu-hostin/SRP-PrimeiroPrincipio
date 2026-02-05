
public class CalculoFrete {
    // Responsabilidade 2: Calcular o frete e os impostos
    public double calcularFreteImpostos(Pedido pedido) {
        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00; // Frete fixo
        } else {
            frete = 0.0; // Frete grátis
        }

        double impostos = pedido.getValorTotal() * 0.15; // 15% de imposto fixo
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        return valorFinal;
    }
}
