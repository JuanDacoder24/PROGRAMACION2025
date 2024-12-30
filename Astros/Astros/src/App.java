
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    String opcion = "";

    Planetas p1 = new Planetas(143.234521, 45.390242, true, 123.12153, 12.301, 6.24 , -60, 38);

    Satelites s1 = new Satelites(234.346221, 31.478311, "Saturno", 111.12233, 10.435, 4.74 , -45, 42);

    do{
        teclado = new Scanner (System.in);
        System.out.println("Elige el tema que deseas ver: ");
        System.out.println("1.- Planetas");
        System.out.println("2.- Satelites");
        System.out.println("3.- Salir");
        opcion = teclado.nextLine();

        switch (opcion) {
            case "1":
                System.out.println(p1);
                break;

            case "2":
                System.out.println(s1);
                break;

            case "3":
                System.out.println("Gracias por su visita");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }while (!opcion.equals("3"));

}
}

