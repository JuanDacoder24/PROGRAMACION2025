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
        if (this.coches.containsKey(matricula)) {
            this.coches.remove(matricula);
            this.contador--;
        } else {
            System.out.println("No se encontró un coche con la matrícula: " + matricula);
        }
    }

    public void visualizaMatriculas (String matricula){
        for (String m : coches.keySet()) {
            System.out.println("Matriculas: " + m);
        }
    }

    public void visualizaCoches (){

    }

    public void visualizaTaller (){

    }
}
