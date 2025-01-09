
public class Perro extends Mascotas {

    private String raza;
    private String pulgas;

    public Perro(String pulgas, String raza, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pulgas = pulgas;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public String  getPulgas() {
        return pulgas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPulgas(String pulgas) {
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
    protected String habla() {
        return "Hola, soy un perro";
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", pulgas=" + pulgas + ", estado="
                + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
