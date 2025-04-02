package List.SomaList;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionaNumero(int numero){
        numeros.add(numero);
    }
    public void encontrarMaiorNumero(){
        if(!numeros.isEmpty()){
            int maiorNumero = numeros.get(0);
            for(Integer num : numeros){
                if (maiorNumero < num){
                    maiorNumero = num;
                   // System.out.println("Numero atual é: "+maiorNumero);
                }
            }
            System.out.println("Maior número encontrado: "+ maiorNumero);
        }else {
            System.out.println("não foram adicionados números");
        }
    }
    public void encontrarMenorNumero(){
        if(!numeros.isEmpty()){
            int menorNumero = numeros.get(0);
            for(Integer num : numeros){
                if (menorNumero > num){
                    menorNumero = num;
                }
            }
            System.out.println("Menor número encontrado: "+ menorNumero);
        }else {
            System.out.println("não foram adicionados numeros");
        }
    }
}
