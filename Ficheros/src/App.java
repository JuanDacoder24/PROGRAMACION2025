
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        Producto producto;
        String opcion = "";
        List<Producto> productos = new LinkedList<>();

        do { 
            System.out.println("1. Crear producto");
            System.out.println("2. Mostrar productos existentes");
            System.out.println("3. Eliminar producto por código");
            System.out.println("4. Guardar productos en el fichero");
            System.out.println("5. Salir");
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
                try(FileWriter file = new FileWriter("./resources/Almacen.dat",true); BufferedWriter writer = new BufferedWriter(file);){

                    writer.write("***Productos tecnologicos***");
                    writer.newLine();
                    writer.write("Laptop");
                    writer.newLine();
                    writer.write("Audifonos");
                    writer.newLine();
                    writer.write("SmartWatch");
                    writer.newLine();
                    writer.write("Celular");
                    writer.newLine();
        
                }catch(IOException e){
                    System.out.println(e.getMessage());
                }
                    break;

                case "5":
                    System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;
                default:
                System.out.println("ERROR, inserte el numero correctamente");
                    
            }
        } while (!opcion.equals("5"));

    }
    
}
