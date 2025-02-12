import java.time.LocalDateTime;

public class Movimiento {

    private static int contador = 0;
    private int id;
    private LocalDateTime fecha;
    private String tipo;
    private double cantidad;

    public Movimiento (String tipo, double cantidad){
        this.contador++;
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo; 
        this.cantidad = 0.0;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        if(cantidad > 0){
            this.cantidad = cantidad;
        }else{
            System.out.println("El valor de la cantidad tiene que ser positivo");
        }
    }
    @Override
    public String toString() {
        return "Movimiento [id=" + id + ", fecha=" + fecha + ", tipo=" + tipo + ", cantidad=" + cantidad + "]";
    }

    

}
