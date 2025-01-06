
import java.time.LocalDate;

public class Perro extends Mascotas {

    private String raza;
    private boolean pulgas;

    public Perro(boolean pulgas, String raza, String nombre, int edad, String estado, LocalDate fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pulgas = pulgas;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public boolean  getPulgas() {
        return pulgas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
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

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", pulgas=" + pulgas + ", estado="
                + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
