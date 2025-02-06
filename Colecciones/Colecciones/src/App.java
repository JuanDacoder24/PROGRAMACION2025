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
        } catch (IndexOutOfBoundsException e){
            System.out.println("El array es pequeño");
        }

        
    }
    //ejercicio 4

    Scanner teclado = new Scanner(System.in);
    public void imprimePositivo(int p)throws PositivoException{
        if(p<0){
            throw new PositivoException(p);
        }
    }

    public void imprimeNegativo(int n)throws NegativoException{
        if(n>=0){
            throw new NegativoException(n);
        }
    }
}
