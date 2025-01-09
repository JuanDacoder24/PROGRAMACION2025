

public class Gato extends Mascotas {

    private String color;
    private String peloLargo;

    public Gato(String color, String peloLargo, String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public String getPeloLargo() {
        return peloLargo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeloLargo(String peloLargo) {
        this.peloLargo = peloLargo;
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
        return "Hola, soy un gato";
    }

    @Override
    public String toString() {
        return "Gato [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", peloLargo=" + peloLargo
                + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }


}
