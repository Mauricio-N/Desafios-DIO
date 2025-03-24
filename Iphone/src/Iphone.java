import Funcionalidades.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {

        AparelhoTelefonico newIphone = new AparelhoTelefonico("9999999");

        newIphone.iniciarCorreioVoz("sadasdasdasd");
        newIphone.iniciarCorreioVoz("sadasdasd1312312sd");
        newIphone.iniciarCorreioVoz("sadasdas123123d");
        newIphone.getCorreioDeVoz();
        //newIphone.selecionarMusica("Mariana faz nada");
        newIphone.pausar();

    }
}
