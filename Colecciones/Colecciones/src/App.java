import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //ejercicio 1 
        Scanner teclado = new Scanner(System.in);
        int a;
        
        try {
            System.out.println("Introduce una letra");
            a = teclado.nextInt();
            System.out.println("Valor introducido...");
        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un numero");
            System.out.println("Valor introducido incorrecto: " + e.getMessage()); 
            e.printStackTrace();
        }finally{
            System.out.println("Hasta pronto");
        }
        

        //ejercicio 2
        teclado = new Scanner(System.in);
        int aa = 30;
        int bb = 0;
        int result = -1;
        
        try {
            System.out.println("Insertar letra");
            aa = teclado.nextInt();
            System.out.println("Insertar letra");
            bb = teclado.nextInt();
            result = aa/bb;
        } catch (InputMismatchException e) {
            System.out.println("VALOR INCORRECTO: " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Error: NO SE PUEDE DIVIDIR POR CERO");
            e.printStackTrace();
        }finally{
            System.out.println("Hasta pronto");
        }
        
        //ejercicio 3
        teclado = new Scanner(System.in);
        int contador = 0;

        try {
            double [] num = new double [5];  
        for (int i = 0; i <= num.length; i++) {
            System.out.println("Introduce numeros");
            num [i] = teclado.nextInt();
            contador++;
        }    
        } catch (InputMismatchException e) {
            System.out.println("VALOR INCORRECTO: " + e.getMessage());
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            System.out.println("El array es pequeño");
        }

        //ejercicio 4

        teclado = new Scanner(System.in);

        int p = 0;
        int n = 0;

       
        try {
            System.out.println("Inserta el numero");
            p = teclado.nextInt();
            imprimePositivo(p);
            System.out.println("Inserta el numero");
            n = teclado.nextInt();
            imprimeNegativo(n);
        } catch (PositivoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NegativoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        //ejercicio 5

        

        
    }


    public static void imprimePositivo(int p)throws PositivoException{
        if(p<0){
            System.out.println("El numero es negativo");
            throw new PositivoException(p);
        }
    }

    public static void imprimeNegativo(int n)throws NegativoException{
        if(n>=0){
            System.out.println("El numero es positivo");
            throw new NegativoException(n);
        }
    }
}
