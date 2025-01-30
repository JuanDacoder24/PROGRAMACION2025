import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Taller taller = new Taller();
        String matricula, marca, color;
        String opcion = "";

        do { 
            System.out.println("1. Añadir coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Salir");
            teclado = new Scanner(System.in);
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    do { 
                        System.out.println("Empieza poniendo la matricula del coche");
                        matricula = teclado.nextLine();
                    } while (!setValidMatricula(matricula));
                    System.out.println("Introduzca la marca del coche");
                    marca = teclado.nextLine();
                    System.out.println("Introduzca el color del coche");
                    color = teclado.nextLine();
                    taller.anadeElemento(matricula, new Coche(marca,color));
                    System.out.println("**Coche añadido**");
                    break;
                
                case "2":
                System.out.println("Debes colocar el numero de matricula que deseas eliminar");
                matricula = teclado.nextLine();
                taller.eliminaElemento(matricula);
                System.out.println("**Coche eliminado**");
                    break;

                case "3":
                taller.visualizaMatriculas();
                taller.visualizaCoches();
                taller.visualizaTaller();
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
