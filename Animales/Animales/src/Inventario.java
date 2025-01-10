import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) throws Exception {
        

        Mascotas [] animales = new Mascotas[4];

        animales [0] = new Perro("No tiene", "Pitbull", "Draco", 1, "Feliz", "09/01/2024");
        animales [1] = new Gato("No tiene", "Pelo largo", "Miguel", 2, "Feliz", "05/01/2023");
        animales [2] = new Loro("Si habla", "La selva del Peru", "Pico corto", "Si vuela", "Lorenzo", 3, "Feliz", "09/01/2022");
        animales [3] = new Canario("Pico largo", "No vuela", "Felso", 2, "Feliz", "07/01/2023", "Rojo y azul", "No canta");

        String opcionPrincipal = "";
        String opcionSecundaria = "";
        Scanner teclado = new Scanner(System.in);

        do { 
            System.out.println("***Bienvenido a la tienda de mascotas: TU AMIGO FIEL***");
            System.out.println("1. Mostrar los animales disponibles");
            System.out.println("2. Mostrar todos los datos de un animal concreto");
            System.out.println("3. Mostrar todos los datos de todos los animales");
            System.out.println("4. Agregar mascota");
            System.out.println("5. Eliminar mascota");
            System.out.println("6. Vaciar el inventario");
            opcionPrincipal = teclado.nextLine();
            switch (opcionPrincipal) {
                
                case "1":
                System.out.println("Estos son los animales disponibles: ");
                for (Mascotas animal : animales) {
                    System.out.println(animal.getClass().getSimpleName());
                }
                break;        
        
                case "2":
                    System.out.println("De que animal quieres informacion");
                    System.out.println("1. Perro");
                    System.out.println("2. Gato");
                    System.out.println("3. Loro");
                    System.out.println("4. Canario");  
                    opcionSecundaria = teclado.nextLine();

                    switch (opcionSecundaria) {
                        case "1":
                            System.out.println(animales[0].toString());
                            break;

                        case "2":
                            System.out.println(animales[1].toString());
                            break;
                            
                        case "3":
                            System.out.println(animales[2].toString());
                            break;

                        case "4":
                            System.out.println(animales[3].toString());
                            break;
            
                    default:
                        System.out.println("Opcion no válida.");
                        break;
                }
                break;

                case "3":
                    for(Mascotas m :animales){
                        System.out.println(m);
                    }
                break;

                case "4":
                    teclado = new Scanner(System.in);
                    System.out.print("¿Cuántos animales adicionales desea agregar? ");
                    int cantidad = teclado.nextInt();
                    teclado.nextLine(); 
                    Mascotas[] animalesAgregados = new Mascotas[animales.length + cantidad];

                    for (int i = 0; i < animales.length; i++) {
                    animalesAgregados[i] = animales[i];
                    }
                    for (int i = 0; i < cantidad; i++) {
                    System.out.print("Ingrese el nombre del animal " + (i + 1) + ": ");
                    String nombre = teclado.nextLine();
                    System.out.print("Ingrese el tipo del animal " + (i + 1) + ": ");
                    String tipo = teclado.nextLine();
                }
                break;

                case "5":
                    String animalEliminado = teclado.nextLine();
                    System.out.println("¿Desea eliminar un animal?");
                    int index = -1;
                    for (int i = 0; i < animales.length; i++) {
                    if (animales[i].getNombre().equalsIgnoreCase(animalEliminado)) {
                        index = i;
                        break;
                    }
                }
                break;

                case "6":
                System.out.println("Vaciaste el inventario de mascotas");
                for (int i = 0; i < animales.length; i++) {
                    animales[i] = null;
                }
                break;

            }
        } while (true);
    }
}
