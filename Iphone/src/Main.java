import Funcionalidades.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone newIphone = new Iphone("9999999");

        newIphone.iniciarCorreioVoz("sadasdasdasd");
        newIphone.iniciarCorreioVoz("sadasdasd1312312sd");
        newIphone.iniciarCorreioVoz("sadasdas123123d");
        newIphone.getCorreioDeVoz();
        newIphone.selecionarMusica("Mariana minha vida, Mariana meu amor.");
        newIphone.tocar();
        newIphone.pausar();
        newIphone.tocar();
        newIphone.adicionarNovaAba();
        newIphone.adicionarNovaAba();
        newIphone.adicionarNovaAba();
        newIphone.exibirPagina("www.uol.com.br");

    }
}
