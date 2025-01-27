import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Taller {

    int contador;
    Map<String,Coche> coches = new HashMap<>();

    public void anadeElemento (Coche color, Coche marca, Coche matricula){
        Set<String> claves = coches.keySet();
        for (String c : claves){
            System.out.println(c + " - " + coches.get(c));
            contador ++;
        }
        
    }

    public void eliminaElemento (Coche matricula){
        Set<String> claves = coches.keySet();
        for (String c : claves){
            System.out.println(c + " - " + coches.get(c));
            contador --;
        }
        
    }

    public void visualizaMatriculas (Coche matricula){
        Set<String> claves = coches.keySet();
        for (String c : claves){
            System.out.println(c + " - " + coches.get(c));
        }
    }

    public void visualizaCoches (Coche color, Coche marca){

    }

    public void visualizaTaller (Coche color, Coche marca, Coche matricula){

    }
}
