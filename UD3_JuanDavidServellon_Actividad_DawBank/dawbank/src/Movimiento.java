import java.time.LocalDateTime;
public class Movimiento {

    private static int contador = 0;
    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    public Movimiento (String tipo, double cantidad){
        this.contador++;
        this.id = id;
        this.fecha = LocalDateTime.now().toString();
        this.tipo = tipo; //ingreso o retirada
        this.cantidad = 0.0;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public String mostrarInfoMovimiento(){
        String mostrarInfo = String.format("Movimiento - ID: %s, Fecha: %s, Tipo: %s, Cantidad: %s", 
        this.id, this.fecha, this.tipo, this.cantidad);
        return mostrarInfo;
    }

}
