public class Agenda {

    Contacto [] contactos;

    private int contador;

    public Agenda() {
        this.contactos = new Contacto[10];
    }
    
    public boolean añadirContacto(Contacto c){
        if (c == null) {
            return false; 
        }

        for (int i = 0; i < contador; i++) {
            if(contactos[i].getNombre().equals(c.getNombre()) && contactos[i].getTelefono().equals(c.getTelefono()))
            return false;
        }

        if (contador < contactos.length) {
            contactos[contador] = c; 
            contador++; 
            return true;
        } else {
            return false; 
        }
    }

    public boolean eliminarContacto(String nombre){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                contactos[i] = contactos[contador - 1]; 
                contactos[contador - 1] = null; 
                contador--;
                return true;
            }
        }
        return false;
    }

    public boolean existeContacto(String nombre){
        return false;
    }

    public void listaContacto(){
        for (int i = 0; i < contador; i++) {
            if(contactos[i] != null){
            System.out.println("Nombre: " + contactos[i].getNombre() + ", Teléfono: " + contactos[i].getTelefono());
        }
        }
    }

    public int buscaContacto(String nombre){
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return i; 
            }
        }
        return -1;
    }
}
