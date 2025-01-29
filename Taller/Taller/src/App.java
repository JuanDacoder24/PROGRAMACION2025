import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Taller taller;
        String opcion = "";

        do { 
            System.out.println("1. Añadir coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Salir");
            teclado = new Scanner(System.in);
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                System.out.println("Empieza poniendo la matricula del coche");
                    break;
                
                case "2":
                System.out.println("Debes colocar el numero de matricula");
                    break;

                case "3":
                System.out.println("Cerrando programa");
                    break;

                default:
                System.out.println("Opcion incorrecta, intentelo otra vez");
            }
        } while (!opcion.equals("3"));

    }

    public static boolean setValidMatricula(String matricula) {
        Pattern pat = Pattern.compile("[0-9]{4}[A-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        return mat.matches();
        
    }
}
