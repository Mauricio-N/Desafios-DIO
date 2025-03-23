package Celular;

import java.util.ArrayList;

public class Contato implements Acessos{

    //Atributos
    static private int id;
    private int ddd;
    private int smsNumber;
    private int eMailNumber;
    private int numero;
    private ArrayList<Mensagen> mensagens;

    //Construtor
    public Contato(int ddd, int numero){
        this.ddd = ddd;
        this.numero = numero;
        this.mensagens = new ArrayList<>();
        Contato.id++;
    }
    //Getters and Setters

    public int getNumero() {
        return numero;
    }
    public  int getDdd(){
        return this.ddd;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Mensagen> getMensagens(){
        return this.mensagens;
    }
    @Override
    public void enviarPara(Contato contato, String msg, int opcao) {
        if (opcao == 1){
            contato.setMensagen(msg,++this.smsNumber,Mensagen.SMS_TYPE);
        }else if (opcao == 2){
            contato.setMensagen(msg,++this.eMailNumber,Mensagen.EMAIL_TYPE);
        }
    }
    private void setMensagen(String msg,int id, String TYPE){
        mensagens.add(new Mensagen(msg, id, TYPE));
    }
}
