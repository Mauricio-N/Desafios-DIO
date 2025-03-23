package Celular;

public record Mensagen(String msg,int id, String type) {
    public static final String SMS_TYPE = "SMS";
    public static final String EMAIL_TYPE = "E-MAIL";

 /*
   SEM NECESSIDADE.
   public static Mensagen enviarSMS(String msg,int id){
    return new Mensagen(msg, id, SMS_TYPE);
    }

    public static Mensagen enviarEmail(String email, int id) {
        return new Mensagen(email, id, Mensagen.EMAIL_TYPE);
    }*/
}
