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

    protected abstract void habla();

}
