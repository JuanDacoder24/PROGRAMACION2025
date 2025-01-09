
public class Canario extends Aves {

    protected String color;
    protected String canta;

    public Canario(String pico, String vuela, String nombre, int edad, String estado, String fechaNacimiento,
            String color, String canta) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    @Override
    protected String habla() {
        return "Hola, soy un canario";
    }
    @Override
    public String isVuela() {
        return "Mira, como vuelo";
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

    public String isCanta() {
        return canta;
    }

    public void setCanta(String canta) {
        this.canta = canta;
    }

    @Override
    public String toString() {
        return "Canario [nombre=" + nombre + ", color=" + color + ", vuela=" + vuela + ", edad=" + edad + ", canta="
                + canta + ", pico=" + pico + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    


}
