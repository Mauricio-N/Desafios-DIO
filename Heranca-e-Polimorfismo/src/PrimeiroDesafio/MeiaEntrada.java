package PrimeiroDesafio;

public class MeiaEntrada extends Ingressos{

    public MeiaEntrada(String nomeDofilme, double valor){
        super(nomeDofilme, valor);
    }

    public double meiaEntrada(){
        return this.valor/2;
    }

}
