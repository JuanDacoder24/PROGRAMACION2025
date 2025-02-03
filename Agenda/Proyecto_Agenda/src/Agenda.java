import java.util.LinkedList;

public class Agenda {

    private LinkedList<Contacto> contactos;
    private int contador;

    public Agenda() {
        this.contactos = new LinkedList<>();
        this.contador = 0;
    }

    public boolean anadeContacto (String nombre, String telefono, String correo){
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El contacto ya existe un contacto con el nombre " + nombre);
                return false;
            }
        }
        Contacto nuevoContacto = new Contacto(nombre, telefono, correo);
        contactos.add(nuevoContacto);
        System.out.println("Contacto añadido: " + nombre);
        contador ++;
        return true;
    }

    public void bucaContacto (String nombre){
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                System.out.println(contacto.getNombre() + "---" + contacto.getTelefono() + "---" + contacto.getCorreo());
            }
        }
    }

    public boolean eliminaContacto (String nombre, String telefono, String correo){
        Contacto contactoEliminado = new Contacto(nombre, telefono, correo);
        return contactos.remove(contactoEliminado);
    }

    public void visualizaAgenda (){
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono() + ", Correo: " + contacto.getCorreo());
        }
    }

}
