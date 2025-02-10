import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("***Bienvenido a TuBank***");
        String iban;
        do {
            System.out.println("Introduce una IBAN");
            iban = teclado.nextLine().toUpperCase();
        }while (!setValidIban(iban));

        System.out.println("Ingresa nombre del titular");
        String titular = teclado.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);
        String opcion = "";
        teclado = new Scanner(System.in);

        do { 
            System.out.println("1 - Datos de la cuenta");
            System.out.println("2 - IBAN");
            System.out.println("3 - Titular");
            System.out.println("4 - Saldo");
            System.out.println("5 - Ingreso");
            System.out.println("6 - Retirada");
            System.out.println("7 - Movimientos");
            System.out.println("8 - Salir");
            teclado = new Scanner(System.in);
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Titular: " + cuenta.getTitular() +" | "+ "IBAN: " + cuenta.getIban() +" | "+ "Saldo: " + cuenta.getSaldo());
                System.out.println("------------------------------------------------------------------------------");
                    break;

                case "2":
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("El numero del IBAN es: " + cuenta.getIban());
                System.out.println("------------------------------------------------------------------------------");
                    break;

                case "3":
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("El titular de la cuenta es: " + cuenta.getTitular());
                System.out.println("------------------------------------------------------------------------------");
                    break;  

                case "4":
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                System.out.println("------------------------------------------------------------------------------");
                    break;

                case "5":
                    System.out.println("Escriba la cantidad que desee ingresar.");
                    teclado = new Scanner(System.in);
                    double cantidad = teclado.nextDouble();
                    cuenta.ingresarMovimientos(cantidad);
                    break;

                case "6":
                System.out.println("Escriba la cantidad que desee retirar.");
                teclado = new Scanner(System.in);
                cantidad = teclado.nextDouble();
                cuenta.ingresarMovimientos(cantidad);
                    break;

                case "7":
                cuenta.mostrarMovimiento();
                    break;

                case "8":
                System.out.println("Saliendo del programa, HASTA PRONTO");
                    break;

                default:
                System.out.println("Introduzca la alternativa correcta");
            }
        } while (!opcion.equalsIgnoreCase("8"));
    }

    public static boolean setValidIban(String iban) {
        Pattern pat = Pattern.compile("[A-Z]{2}[0-9]{22}");
        Matcher mat = pat.matcher(iban);
        return mat.matches();
        
    }
}
