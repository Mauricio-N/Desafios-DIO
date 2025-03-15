package PrimeiroDesafio;

import java.util.Scanner;

public class ContaBancaria {
 public Scanner entrada = new Scanner(System.in);
 static int idAccounts;
 private int idUser;
 private double saldo;
 private double chequeEspecial;
 private double limite;
  public ContaBancaria(double saldo){
    ContaBancaria.idAccounts++;
    this.idUser = idAccounts;
    this.saldo = saldo;
    this.chequeEspecial = saldo <= 500 ? this.saldo * 0.1 : this.saldo * 0.5;
    this.limite = this.chequeEspecial;
  }
  public int getIdUser(){
    return this.idUser;
  }
  
  public void consultarSaldo(){
      System.out.println("Saldo: "+this.saldo);
  }
  public void consultarChequeEspecial(){
      System.out.println("Cheque especial: "+this.chequeEspecial);
  }
  public void depositarDinheiro(int valor){
      this.saldo += valor;
      showSaldo();
  }
  public void sacarDinheiro(int valor){
      retirarDinheiro(valor);
  }
  public void pagarBoleto(int valor){
      retirarDinheiro(valor);
  }
  public void checarUsoDoChequeEspecial(){
      if (this.chequeEspecial < this.limite){
          System.out.println("Você utilizou "+ (this.limite-this.chequeEspecial) + " de "+this.limite+" do limite concedido.\nCheque especial disponível: "+ this.chequeEspecial);

      }else{
          System.out.println("Seu limite: "+ this.chequeEspecial);
      }
  }
  
  @Override
  public String toString() {
    return String.format("ID: %s\nSaldo: %.2f\nCheque especial: %.2f",this.idUser,this.saldo,this.chequeEspecial);
  }
  public void showSaldo(){
      System.out.printf("""
                  Saldo atual é de: %.2f
                  ###########################################################"
                  """, saldo);
  }
  private void retirarDinheiro(int valor){
      if(valor > this.saldo) {
          System.out.println("Saldo insuficiente.");
          if ((this.saldo + this.chequeEspecial) >= valor){
              System.out.print("Deseja usar o Cheque especia?\nSerá aplicada uma taxa de 20% no valor utilizado do cheque especial.\n[s] para sim e [n] para não.\nResposta: ");
              if(entrada.nextLine().equalsIgnoreCase("s")){

                  if(valor <= 500){
                      System.out.println("Limite não utilizado!\nRetirada efetuada no valor de: "+valor);
                  } else if (valor <= (this.saldo+this.chequeEspecial)) {
                      double taxaDeJuros = .8;
                      this.chequeEspecial = ((this.saldo+this.chequeEspecial)-valor)*taxaDeJuros;
                      this.saldo = 0;
                      System.out.printf("""
                  Saldo é de: %.2f
                  Cheque especial: %.2f
                  Digite o valor desejado:\s""", this.saldo,this.chequeEspecial);
                  }else {
                      System.out.println("Saldo insuficiente!");
                  }
              }
          }
      }else{
          this.saldo -= valor;
          showSaldo();
      }
  }
}
