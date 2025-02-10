
public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;
    private Movimiento [] movimientos;
    private String validIban;
    private int nMovimientos;
    private int nElementosActuales;

    public CuentaBancaria( String iban, String titular){

        this.iban = iban;
        this.titular = titular;
        this.nMovimientos = 100;
        this.nElementosActuales = 0;
        this.movimientos = new Movimiento[nMovimientos];
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >=0.0)
        this.saldo = saldo;
    }
    
    public String getValidIban() {
        return validIban;
    }

    public void registrarMovimiento(String tipo, double cantidad){
        if(nElementosActuales >= 100){
            System.out.println("No se pueden realizar mas movimientos.");
        }else
        movimientos[nElementosActuales] = new Movimiento(tipo,cantidad);
        nElementosActuales++;
    }

    public void ingresarMovimientos(double cantidad){
        if(cantidad <= 0){
        }
        if(cantidad >= 3000){
            System.out.println("AVISO: Notificar a hacienda.");
        }
        saldo += cantidad;
        registrarMovimiento("Ingreso", cantidad);
    }

    public void retirarMovimientos(double cantidad){
        if(cantidad <= 0){
        }
        if(cantidad >= -50){
            System.out.println("Retirada no permitida, verificar el saldo.");
        }
        saldo -= cantidad;
        registrarMovimiento("Retirada", cantidad);
    }

    public void mostrarMovimiento(){
        if(nMovimientos==0){
            System.out.println("No existen movimientos.");
        }
        for (int i = 0; i < nMovimientos; i++) {
            System.out.println(movimientos[i].mostrarInfoMovimiento());
        }
    }
}
