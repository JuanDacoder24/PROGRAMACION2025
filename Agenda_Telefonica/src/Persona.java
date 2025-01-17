public class Persona extends Contacto {

    protected String cumpleaños;

    public Persona(String nombre, String telefono, String cumpleaños) {
        super(nombre, telefono);
        this.cumpleaños = cumpleaños;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cumpleaños=" + cumpleaños + ", telefono=" + telefono + "]";
    }

    
}
