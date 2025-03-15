package PrimeiroDesafio;

import java.util.Scanner;

public class Banco {
  static Scanner entrada = new Scanner(System.in);
  static boolean turnOnOff = false;
  public static void main(String[] args) {
    
    var clienteArthur = new ContaBancaria(600);
    System.out.println(
    """
    ###########################
    # Bem vindo ao ArthurBank #
    ###########################""");
    do {
      showMenu();
      System.out.print("*** Escolha a opção desejada: ");
      int temp = Integer.parseInt(entrada.nextLine());

      switch (temp) {
        case 1 -> clienteArthur.consultarSaldo();
        case 2 -> clienteArthur.consultarChequeEspecial();
        case 3 -> {System.out.print("Digite o valor a ser depositado: ");
          clienteArthur.depositarDinheiro(Integer.parseInt(entrada.nextLine()));
        }
        case 4 ->{System.out.print("Digite o valor a ser retirado: ");
          clienteArthur.sacarDinheiro(Integer.parseInt(entrada.nextLine()));
        }
        case 5 -> {System.out.print("Digite o valor: ");
          clienteArthur.pagarBoleto(Integer.parseInt(entrada.nextLine()));
        }
        case 6 -> clienteArthur.checarUsoDoChequeEspecial();
        default -> switchOnOff();
      }
      if(!turnOnOff){
        System.out.print("Deseja sair da aplicação?: \nDigite [s] para sim e [n] para não.\nResposta: ");
        if(entrada.nextLine().equalsIgnoreCase("s")){
          switchOnOff();
        }
      }

    }while (!turnOnOff);

    entrada.close();
    System.out.println(clienteArthur);
  }
  //Metodos
  static void switchOnOff(){
    turnOnOff = !turnOnOff;    
  }
  static void showMenu(){
    System.out.print(
    """
    ###########################################################
      1-> Consultar saldo
      2-> consultar cheque especial
      3-> Depositar dinheiro;
      4-> Sacar dinheiro;
      5-> Pagar um boleto.
      6-> Verificar se a conta está usando cheque especial.
      0-> Para sair.
    ###########################################################
    """);
  }
}