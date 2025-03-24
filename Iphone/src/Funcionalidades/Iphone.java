package Funcionalidades;

import java.util.ArrayList;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Navegador{
    private String numero;
    private ArrayList<String> correioDeVoz;
    private ArrayList<Integer> abas;
    private boolean musicaSelecionada = false;
    private boolean tocarMusica= false;

    //Metodo construtor
    public Iphone(String numero){
        this.numero = numero;
        correioDeVoz = new ArrayList<>();
        abas = new ArrayList<>();

    }

    //Implementação da interface AparelhoTelefonico
    @Override
    public void getCorreioDeVoz() {
        int tempNumber=0;
        for(String elemento : correioDeVoz){
            System.out.println("Correio de voz número: " +(++tempNumber));
            System.out.println(elemento);
        }
    }

    @Override
    public void ligar(String numero){
        System.out.println("Número Atendeu");
    }

    @Override
    public void atender(){
        System.out.println("Atendeu a ligação");
    }

    @Override
    public void iniciarCorreioVoz(String msg){
        System.out.println("A mensagem: " + msg+ " foi gravada com sucesso!");
        correioDeVoz.add(msg);
        System.out.println("Mensagem gravada!\n############################");
    }

    //Implementação da interface Navegador
    @Override
    public void exibirPagina(String url) {
    }

    @Override
    public void adicionarNovaAba() {
        abas.add(1);
        System.out.println("Aba criada com sucesso!");
        System.out.println(abas.size()+" abertas.\n############################");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }


    //Implementação da interface ReprodutorMusical
    @Override
    public void tocar() {

        if(!musicaSelecionada){
            System.out.println("Selecione a música primeiro.");
        }
        else{
            this.tocarMusica = !this.tocarMusica;
            System.out.println("Tocando a música: "+ "X");
        }
    }

    @Override
    public void pausar() {
        if (this.musicaSelecionada && this.tocarMusica){
            this.tocarMusica = false;
            System.out.println("Musica pausada");
        }else {
            System.out.println("Não tem musica tocando no momento");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " +musica+ " selecionada.");
        this.musicaSelecionada = !this.musicaSelecionada;
    }
}
