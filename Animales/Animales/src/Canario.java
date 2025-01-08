
import java.time.LocalDate;

public class Canario extends Aves {

    protected String color;
    protected boolean canta;

    public Canario(boolean pico, boolean vuela, String nombre, int edad, String estado, LocalDate fechaNacimiento,
            String color, boolean canta) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.canta = canta;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "Canario [nombre=" + nombre + ", color=" + color + ", vuela=" + vuela + ", edad=" + edad + ", canta="
                + canta + ", pico=" + pico + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    


}
