
import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        do { 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Contacto existente");
            System.out.println("4. Mostrar lista de contactos");
            System.out.println("5. Buscar contacto");
            System.out.println("6. Salir");
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
                    throw new AssertionError();
            }
        } while (true);

    }
}
