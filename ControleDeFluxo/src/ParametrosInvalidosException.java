public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){}
@Override
    public String getMessage(){
        return "O segundo parâmetro deve ser maior que o primeiro.";
    }
}
