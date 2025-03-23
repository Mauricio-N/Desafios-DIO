package PrimeiroDesafio;

public class Main {

    public static void main(String[] args) {
        Ingressos filme1 = new Ingressos("Hobbits",23);
        MeiaEntrada filme2 = new MeiaEntrada("Eureca",100);
        Ingressos filme3 = new IngressoFamilia("NewHorizon",24);
        Ingressos filme4 = new MeiaEntrada("BIG FISH", 30);
        System.out.println(filme2.meiaEntrada());
        System.out.println(((IngressoFamilia)filme3).ingressoFamilia(4));
/*
        Ingressos cachorro = new Ingressos();
        MeiaEntrada meia =(MeiaEntrada) cachorro; // Upcasting implícito*/
        Ingressos args2 = new MeiaEntrada("dadasd",123.21);
        if (args2 instanceof Ingressos) {
            MeiaEntrada cachorro = (MeiaEntrada) args2; // Seguro
        }

        if (filme4 instanceof MeiaEntrada) {
            //((MeiaEntrada) filme4).meiaEntrada();
            System.out.println(((MeiaEntrada) filme4).meiaEntrada());
            System.out.println("Deu certo!!!");
        }
    }
}
