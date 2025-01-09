
public abstract class Mascotas {

    protected String nombre;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    protected Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    protected abstract void muestra();

    protected abstract void cumpleaños();

    protected abstract void morir();

    protected abstract String habla();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascotas{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", estado=").append(estado);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }



}
