import java.util.Date;

public class Cliente extends Persona{

    protected String telefono;
    protected String email;
    protected String direccion;

    public Cliente(String nombre, String dni, Date fechaNacimiento, String telefono, String email, String direccion) {
        super(nombre, dni, fechaNacimiento);
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
    


}
