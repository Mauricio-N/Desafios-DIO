package Tributos;

 public record Alimentacao(double valor) implements Impostos{

     private static final String TYPE = "ALIMENTAÇÃO";
     @Override
     public double taxa() {
         double taxacao = this.valor *1.01;
         System.out.printf(
                 """
                 Tipo: %s
                 Valor inserido: %.2f
                 Valor da taxa: %.2f
                 Valor total: %.2f
                 ###########################
                 """,Alimentacao.TYPE,this.valor,this.valor*.01,taxacao);
         return taxacao;
     }

}
