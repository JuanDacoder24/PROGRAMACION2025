import java.util.HashMap;
import java.util.Map;

public class Taller {
 

    int contador;
    Map<String,Coche> coches;

    public Taller(){
        this.coches = new HashMap<>();
        this.contador = 0;
    }

    public void anadeElemento (String matricula, Coche coche){
        this.coches.put(matricula, coche);
        this.contador++;
    }

    public void eliminaElemento (String matricula){
        if (coches.remove(matricula) != null) {
            System.out.println("Coche eliminado con éxito.");
        } else {
            System.out.println("No existe un coche con esa matrícula.");
        }
    }

    public void visualizaMatriculas (){
        System.out.println("Matrículas almacenadas:");
        for (String matricula : coches.keySet()) {
            System.out.println(matricula);
        }
    }

    public void visualizaCoches (){
        System.out.println("Coches almacenados:");
        for (Coche coche : coches.values()) {
            System.out.println(coche);
        }
    }

    public void visualizaTaller (){
        System.out.println("Taller:");
        for (var entry : coches.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
