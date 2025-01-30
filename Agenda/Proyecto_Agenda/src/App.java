import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
    }

    public static boolean validNombre(String nombre) {
        Pattern pat = Pattern.compile("[A-Z][a-zA-Z]");
        Matcher mat = pat.matcher(nombre);
        return mat.matches();
    }
    
    public static boolean validTelefono(String telefono) {
        Pattern pat = Pattern.compile("[679]\\d{8}");
        Matcher mat = pat.matcher(telefono);
        return mat.matches(); 
    }

    public static boolean validCorreo(String correo) {
        Pattern pat = Pattern.compile("[a-zA-Z0-9_.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}");
        Matcher mat = pat.matcher(correo);
        return mat.matches(); 
    }
}
