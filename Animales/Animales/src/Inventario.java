import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) throws Exception {
        
        System.out.println("***Bienvenido a la tienda de mascotas: TU AMIGO FIEL***");
        Scanner teclado = new Scanner(System.in);

        Mascotas [] animales = new Mascotas[30];

        animales [0] = new Perro("No tiene", "Pitbull", "Draco", 1, "Feliz", "09/01/2024");
        animales [1] = new Gato("No tiene", "Pelo largo", "Miguel", 2, "Feliz", "05/01/2023");
        animales [2] = new Loro("Si habla", "La selva del Peru", "Pico corto", "Si vuela", "Lorenzo", 3, "Feliz", "09/01/2022");
        animales [3] = new Canario("Pico largo", "No vuela", "Felso", 2, "Feliz", "07/01/2023", "Rojo y azul", "No canta");
        
    }
}
