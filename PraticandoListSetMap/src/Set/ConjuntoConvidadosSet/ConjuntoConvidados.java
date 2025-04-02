package Set.ConjuntoConvidadosSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidados;

    public ConjuntoConvidados(){
        convidados = new HashSet<>();
        // convidados = new TreeSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        if(!convidados.isEmpty()){
            for (Convidado convidado : convidados){
                if(convidado.getCodigoConvite() == codigoConvite){
                    convidados.remove(convidado);
                    break;
                }
            }
        }else {
            System.out.println("A lista está vazia");
        }
    }
    public void contarConvidados(){
        System.out.println("Convidados convidados: "+convidados.size());
    }
    public void exibirConvidados(){
       convidados.forEach(convidado -> {
           System.out.print(convidado.toString());
       });
    }


}
