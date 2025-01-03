public class Perro extends Mascotas {

    private String raza;
    private String pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, String pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public String getPulgas() {
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
    protected void habla() {
    }


}
