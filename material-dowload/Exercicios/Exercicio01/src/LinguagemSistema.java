import java.util.Locale;

public class LinguagemSistema {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String lingua = locale.getLanguage();
        System.out.println("A linguagem do sistema é " +lingua+".");  
    }
} 
