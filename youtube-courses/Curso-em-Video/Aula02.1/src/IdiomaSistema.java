import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma do sistema:");
        System.out.println(idioma);
        System.out.println (idioma.getDisplayLanguage());
        System.out.println (idioma.getLanguage());
    }
}