package Funcionalidades;

import java.util.ArrayList;

public class AparelhoTelefonico implements ReprodutorMusical,Navegador{

    private String numero;
    private ArrayList<String> correioDeVoz;
    private boolean musicaSelecionada = false;
    private boolean tocarMusica= false;
    public AparelhoTelefonico(String numero){
        this.numero = numero;
        correioDeVoz = new ArrayList<>();
    }
    //Metodo construtor
    public void getCorreioDeVoz() {
        int tempNumber=0;
        for(String elemento : correioDeVoz){
            System.out.println("Correio de voz número:\s"+(++tempNumber));
            System.out.println(elemento);
        }
    }
    //Metodos da Classe Aparelho telefonico
    public void ligar(String numero){
        System.out.println("Número Atendeu");
    }
    public void atender(){
        System.out.println("Atendeu a ligação");
    }
    public void iniciarCorreioVoz(String msg){
        System.out.println("A mensagem:\s"+ msg+ "\sfoi gravada com sucesso!");
        correioDeVoz.add(msg);
        System.out.println("Mensagem gravada!\n############################");
    }
    //Implementação das interfaces AparelhoTelefonico e Navegador
    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {
        this.tocarMusica = !this.tocarMusica;
    }

    @Override
    public void pausar() {
        if (this.musicaSelecionada){
            this.musicaSelecionada = !this.musicaSelecionada;
            System.out.println("Musica pausada");
        }else {
            System.out.println("Não tem musica tocando no momento");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica\s"+musica+"\sselecionada.");
        this.musicaSelecionada = !this.musicaSelecionada;
    }
}
/*
Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

 */