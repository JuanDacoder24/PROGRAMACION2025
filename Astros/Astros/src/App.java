
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Astros [] sistemaSolar = new Astros[20];

    sistemaSolar [0] = new Planetas(143.234521, 45.390242, true, radioEcuatorial, rotacionSobreEje, masa, temperatura, gravedad);

    sistemaSolar [1] = new Satelites(121.654120, 32.234000, "Saturno");

    for (int i = 0; i < sistemaSolar.length; i++) {
        if(sistemaSolar[i]!=null){
            if(sistemaSolar[i] instanceof Planetas){
                Planetas p1 = (Planetas)sistemaSolar[i];
                System.out.println(p1);
                
            }else if(sistemaSolar[i] instanceof Satelites){
                Satelites s1 = (Satelites)sistemaSolar[i];
                System.out.println(s1);
            }else 
            System.out.println(sistemaSolar[i]);
        }
    }

    }
}
