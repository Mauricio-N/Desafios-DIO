package PrimeiroDesafio;

public class IngressoFamilia extends Ingressos{

    public IngressoFamilia(String nomeDofilme, double valor){
        super(nomeDofilme, valor);
    }

public double ingressoFamilia(int integrantes){

    return (this.valor * integrantes)*.95;
}


}
