import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) throws Exception {
        

        Mascotas [] animales = new Mascotas[30];

        animales [0] = new Perro("No tiene", "Pitbull", "Draco", 1, "Feliz", "09/01/2024");
        animales [1] = new Gato("No tiene", "Pelo largo", "Miguel", 2, "Feliz", "05/01/2023");
        animales [2] = new Loro("Si habla", "La selva del Peru", "Pico corto", "Si vuela", "Lorenzo", 3, "Feliz", "09/01/2022");
        animales [3] = new Canario("Pico largo", "No vuela", "Felso", 2, "Feliz", "07/01/2023", "Rojo y azul", "No canta");
        String opcion = "";
        Scanner teclado = new Scanner(System.in);

        do { 
            System.out.println("***Bienvenido a la tienda de mascotas: TU AMIGO FIEL***");
            System.out.println("1. Mostrar los animales disponibles");
            System.out.println("2. Mostrar todos los datos de un animal concreto");
            System.out.println("3. Mostrar todos los datos de todos los animales");
            System.out.println("4. Agregar mascota");
            System.out.println("6. Eliminar mascota");
            System.out.println("7. Vaciar el inventario");
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

                case "7":
                break;
            }
        } while (true);

    }
}
