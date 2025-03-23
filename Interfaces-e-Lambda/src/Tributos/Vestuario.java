package Tributos;

public record Vestuario(double valor) implements Impostos{
    private static final String TYPE = "VESTUÁRIO";
    @Override
    public double taxa() {
        double taxacao = this.valor *1.025;
        System.out.printf(
                """
                Tipo: %s
                Valor inserido: %.2f
                Valor da taxa: %.2f
                Valor total: %.2f
                ###########################
                """,Vestuario.TYPE,this.valor,this.valor*.025,taxacao);
        return taxacao;
    }
}
