import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) throws Exception {
        
        System.out.println("***Bienvenido a la tienda de mascotas: TU AMIGO FIEL***");
        Scanner teclado = new Scanner(System.in);

        Mascotas [] animales = new Mascotas[30];

        animales [0] = new Perro("No tiene", "Pitbull", "Draco", 1, "Feliz", null);
        animales [1] = new Gato("No tiene", "Pelo largo", "Miguel", 2, "Feliz", null);
        animales [2] = new Loro("Si habla", "La selva del Peru", "Pico corto", "Si vuela", "Lorenzo", 3, "Feliz", );
        animales [3] = new Canario("Pico largo", "No vuela", "Felso", 2, "Feliz", fechaNacimiento, "Rojo y azul", "No canta");
        
    }
}
