
import java.time.LocalDate;

public abstract class Aves extends Mascotas{

    protected boolean vuela;
    protected boolean pico;

    public Aves(boolean pico, boolean vuela, String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public boolean isPico() {
        return pico;
    }

    @Override
    protected void muestra() {
    }

    @Override
    protected void cumpleaños() {
    }

    @Override
    protected void morir() {
    }

    @Override
    protected void habla() {
    }

}
