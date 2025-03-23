package Tributos;

public record Cultura(double valor) implements Impostos{
    private static final String TYPE = "CULTURA";
    @Override
    public double taxa() {
        double taxacao = this.valor *1.04;
        System.out.printf(
                """
                Tipo: %s
                Valor inserido: %.2f
                Valor da taxa: %.2f
                Valor total: %.2f
                ###########################
                """,Cultura.TYPE,this.valor,this.valor*.04,taxacao);
        return taxacao;
    }
}
