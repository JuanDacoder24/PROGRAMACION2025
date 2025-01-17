public class Empresa extends Contacto{

    protected String pagWeb;

    public Empresa(String nombre, String telefono, String pagWeb) {
        super(nombre, telefono);
        this.pagWeb = pagWeb;
    }

    public String getpagWebs() {
        return pagWeb;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", telefono=" + telefono + ", cumpleaños=" + pagWeb + "]";
    }

}
