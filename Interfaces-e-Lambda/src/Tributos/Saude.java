package Tributos;

public record Saude(double valor) implements Impostos{
    private static final String TYPE = "SAÚDE";
    @Override
    public double taxa() {
        double taxacao = this.valor *1.015;
        System.out.printf(
                """
                Tipo: %s
                Valor inserido: %.2f
                Valor da taxa: %.2f
                Valor total: %.2f
                ###########################
                """,Saude.TYPE,this.valor,this.valor*.015,taxacao);
        return taxacao;
    }
}
