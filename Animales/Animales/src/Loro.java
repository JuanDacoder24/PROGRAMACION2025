
import java.time.LocalDate;

public class Loro extends Aves{

    protected String origen;
    protected boolean habla;

    public Loro(boolean habla, String origen, boolean pico, boolean vuela, String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.habla = habla;
        this.origen = origen;
    }

    @Override
    protected void habla() {
        super.habla();
    }
    @Override
    public boolean isVuela() {
        return super.isVuela();
    }
    @Override
    protected void muestra() {
        super.muestra();
    }

    public String getOrigen() {
        return origen;
    }

    public boolean isHabla() {
        return habla;
    }

    @Override
    public String toString() {
        return "Loro [origen=" + origen + ", nombre=" + nombre + ", vuela=" + vuela + ", edad=" + edad + ", habla="
                + habla + ", pico=" + pico + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
