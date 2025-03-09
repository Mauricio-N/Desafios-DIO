import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
  //ENTRADA DE DADOS
  Scanner entrada = new Scanner(System.in);
  String agencia;
  int numero;
  String nome;
  double saldo;
  
  //INICIO DO PROGRAMA
  System.out.println("""
  *********************************    
  ***SEJA BEM VINDO AO BANCO DIO***
  *********************************

  Para cadastrar digite corretamente
  os dados solicitados a seguir.

  **********************************

  """);
  System.out.print("Por gentileza, digite nome: ");
  nome = entrada.nextLine();
  System.out.print("Por gentileza, digite o número de sua agencia: ");
  agencia = entrada.nextLine();
  System.out.print("Digite o número da sua conta: ");
  numero = entrada.nextInt();
  System.out.print("Por gentileza, digite o saldo desejado: ");
  saldo = entrada.nextDouble();

  System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nome,agencia,numero,saldo));
  entrada.close();
  }//fim da main
}//fim do classe
