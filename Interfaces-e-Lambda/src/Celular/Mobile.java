package Celular;
import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato(11,1));
        contatos.add(new Contato(15,2));

        int temp = 0;
        do {
            try {
                System.out.print("""
                        ##########################
                        Digite: o numero do usuário destinatário ou
                        Digite: 0 para sair:
                        Digite a opção desejada:\s""");
                int userTemp = Integer.parseInt(entrada.nextLine());
                boolean usuarioEncontrado = false;
                if (userTemp != 0){
                    for(Contato user : contatos){
                        if (userTemp == user.getNumero()) {
                            usuarioEncontrado = !usuarioEncontrado;
                            System.out.println("""
                                    Digite a opção desejada:
                                    1- Para enviar SMS;
                                    2- Para enviar E-mail;
                                    3- Para sair.
                                    """);
                            System.out.print("Digite a opção desejada: ");
                            switch(Integer.parseInt(entrada.nextLine())){
                                case 1: {
                                    System.out.print("Digite SMS a ser enviado: ");
                                    String enviarSMS = entrada.nextLine();
                                    user.enviarPara(user, enviarSMS, 1);

                                    System.out.println("SMS enviado!");
                                    temp = 1;
                                    break;
                                }
                                case 2:{
                                    System.out.print("Digite Email a ser enviado: ");
                                    String enviarEmail = entrada.nextLine();
                                    user.enviarPara(user,enviarEmail,2);
                                    System.out.println("E-mail enviado!");
                                    temp = 2;
                                    break;
                                }
                                case 3:{
                                    System.out.println("Finalizando o programa...");
                                    temp = 3;
                                    break;
                                }
                                default:{
                                    System.out.println("Opção inválida");
                                }
                            }//fim do SWITCH
                        }//FIM do IF FIND-USER
                    }//FIM do FOREACH
                    if (!usuarioEncontrado) {
                        System.out.println("Usuário não encontrado.");
                    }
                } else {
                    temp = userTemp;
                }
            } catch (NumberFormatException e) {
                System.out.println("digite somente números.");
            }
        }while (temp != 0);
    ChecarMSGS(contatos);
    }
    public static void ChecarMSGS(ArrayList<Contato> contatos){
       // System.out.println("Tamanho do ArrayList: "+ contatos.size());
        for(Contato user : contatos){
            int temp =0;
                System.out.printf("Mensagens de : %d-%d\n", user.getDdd(), user.getNumero());
                for (Mensagen msg :contatos.get(temp).getMensagens()){
                    System.out.printf(
                            """
                            Tipo: %s
                            Numero: %s
                            Mensagem enviada: %s
                            """,msg.type(),msg.id(),msg.msg());
                }

        }
    }
}
