package Tributos;

import java.util.ArrayList;

public class CalculoTributario {
    public static void main(String[] args) {
/*
        Alimentacao alimentacao = new Alimentacao(100);
        Saude saude = new Saude(100);
        Vestuario roupa = new Vestuario(100);
        Cultura lazer = new Cultura(100);
*/
/*
Impostos taxaAlimentacao = new Alimentacao(10);
Impostos taxaSaude = new Saude(100);
Impostos taxaRoupa = new Saude(100);
Cultura taxaLazer = new Cultura(100);
taxaAlimentacao.taxa();
taxaSaude.taxa();
taxaRoupa.taxa();
taxaLazer.taxa();
*/
        ArrayList<Impostos> taxas = new ArrayList<>();
        taxas.add(new Alimentacao(10));
        taxas.add(new Saude(100));
        taxas.add(new Vestuario(100));
        taxas.add(new Cultura(100));

        for (Impostos produto : taxas) {
        produto.taxa();
        }


    }
}