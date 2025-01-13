public class Agenda {

    Contacto [] contactos = new Contacto[10];

    private int contador;

    public Agenda(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    public boolean añadirContacto(Contacto c){
        return false;
    }

    public String nombres(){
        return "";
    }

    public boolean eliminarContacto(String nombre){
        return false;
    }

    public boolean existeContacto(String nombre){
        return false;
    }

    public void listaContacto(){
    }

    public int buscaContacto(int nombre){
        return nombre;
    }
}
