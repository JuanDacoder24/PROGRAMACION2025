
public abstract class Aves extends Mascotas{

    protected String vuela;
    protected String pico;

    public Aves(String pico, String vuela, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public String isVuela() {
        return vuela;
    }

    public String isPico() {
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
    protected String habla() {
        return "";
    }

}
