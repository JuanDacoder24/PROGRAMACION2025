import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Contacto contacto;
        Agenda agenda;
        String opcion = "";

        do { 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Visualiza contacto");
            System.out.println("5. Numero de contactos de mi agenda");
            System.out.println("6. Salir");
            teclado = new Scanner(System.in);
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                default:
                System.out.println("Opcion incorrecta, intentelo de nuevo");
            }

        } while (!opcion.equals("6"));
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
