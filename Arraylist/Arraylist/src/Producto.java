import java.util.Objects;

public class Producto implements Comparable<Producto>{

    private String nombre;
    private int cantidad;
    
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
    }

    @Override
    public int compareTo(Producto p) {
        return Integer.compare(this.cantidad, p.getCantidad());
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    Producto producto = (Producto) obj;
    return cantidad == producto.cantidad && Objects.equals(nombre, producto.nombre);
}


    
    

}
