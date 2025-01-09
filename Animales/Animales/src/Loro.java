

public class Loro extends Aves{

    protected String origen;
    protected String habla;

    public Loro(String habla, String origen, String pico, String vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.habla = habla;
        this.origen = origen;
    }

    protected String saluda(){
       return "Hola soy un loro";
    }

    @Override
    public String isVuela() {
        return "Mira como vuelo";
    }
    @Override
    protected void muestra() {
        super.muestra();
    }

    public String getOrigen() {
        return origen;
    }

    public String isHabla() {
        return habla;
    }

    @Override
    public String toString() {
        return "Loro [origen=" + origen + ", nombre=" + nombre + ", vuela=" + vuela + ", edad=" + edad + ", habla="
                + habla + ", pico=" + pico + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
