
import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        Agenda agenda = new Agenda();
        Persona persona = null;
        Empresa empresa = null;

        System.out.println("***Agenda Telefonica***");
        do { 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Añadir contacto empresa");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar lista de contactos");
            System.out.println("5. Buscar contacto");
            System.out.println("6. Salir");
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
                    System.out.println("Ingrese la fecha de nacimiento");
                    String cumpleaños = teclado.nextLine();
                    persona = new Persona(nombre, telefono, cumpleaños);
                    agenda.añadirContacto(persona);
                break;

                case "2":
                    System.out.println("--¡ALERTA!: Para agregar un contacto debes saber que no se puede repetir dos veces--");
                    System.out.println("***Iniciemos con el ingreso del contacto***");
                    System.out.print("Ingrese el nombre del contacto empresa: ");
                    String nombreEmpresa = teclado.nextLine();
                    System.out.print("Ingrese el teléfono del contacto empresa: ");
                    String telefonoEmpresa = teclado.nextLine();
                    System.out.println("Ingrese la pagina web");
                    String pagWeb = teclado.nextLine();
                    empresa = new Empresa(nombreEmpresa, telefonoEmpresa, pagWeb);
                    agenda.añadirContacto(empresa);
                break;

                case "3":
                System.out.print("Ingrese el nombre del contacto que desea eliminar: ");
                String contactoEliminado = teclado.nextLine();
                if (agenda.eliminarContacto(contactoEliminado)) {
                    System.out.println("Contacto eliminado exitosamente.");
                } else {
                    System.out.println("No se encontró el contacto.");
                }
                break;

                case "4":
                    System.out.println("Esta es la lista");
                    agenda.listaContacto();
                break;

                case "5":
                System.out.print("Ingrese el nombre del contacto a buscar: ");
                String nombreBuscar = teclado.nextLine();
                int posicion = agenda.buscaContacto(nombreBuscar);
                if (posicion != -1) {
                    System.out.println("Contacto encontrado en la posición: " + posicion);
                } else {
                    System.out.println("No se encontró el contacto.");
                }
                break;

                case "6":
                    System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;
                default:
                    System.out.println("Introduzca la alternativa correcta");
            }
        } while (!opcion.equalsIgnoreCase("5"));

    }
}
