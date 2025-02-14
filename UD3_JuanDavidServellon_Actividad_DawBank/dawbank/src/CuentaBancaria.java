
import java.util.LinkedList;


public class CuentaBancaria {

    private String iban;
    private Cliente titular;
    private double saldo;
    private int nMovimientos;
    LinkedList <Movimiento> movimientos = new LinkedList<>(); 

    public CuentaBancaria( String iban, Cliente titular){
        this.iban = iban;
        this.titular = titular;
        this.nMovimientos = nMovimientos;
        this.movimientos = new LinkedList<>();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >=0.0)
        this.saldo = saldo;
    }

    public void registrarMovimiento(Movimiento r){
       movimientos.add(r);
    }

    public void ingresarMovimientos(double cantidad) throws CuentaException {
        try {
            if(cantidad <= 0){
            }
            if(cantidad >= 3000){
                System.out.println("AVISO: Notificar a hacienda.");
            }
            saldo += cantidad;
            registrarMovimiento();

        } catch (CuentaException c) {
            System.out.println(c.getMessage());
        }
    }

    public void retirarMovimientos(double cantidad){
        if(cantidad <= 0){
        }
        if(cantidad >= -50){
            System.out.println("Retirada no permitida, verificar el saldo.");
        }
        saldo -= cantidad;
        registrarMovimiento();
    }

    public void mostrarMovimiento(){
        if(nMovimientos==0){
            System.out.println("No existen movimientos.");
        }
        for (int i = 0; i < nMovimientos; i++) {
            System.out.println(movimientos.toString());
        }
    }
}
