
import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        Agenda agenda = new Agenda();
        do { 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar lista de contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Salir");
            teclado = new Scanner(System.in);
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("--¡ALERTA!: Para agregar un contacto debes saber que no se puede repetir dos veces--");
                    System.out.println("***Iniciemos con el ingreso del contacto***");
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = teclado.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono);
                    agenda.añadirContacto(nuevoContacto);
                    
                break;

                case "2":
                    
                break;

                case "3":
                    System.out.println("Esta es la lista");
                    agenda.listaContacto();
                break;

                case "4":
                    
                break;

                case "5":
                    System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;
                default:
                    System.out.println("Introduzca la alternativa correcta");
            }
        } while (!opcion.equalsIgnoreCase("6"));

    }
}
