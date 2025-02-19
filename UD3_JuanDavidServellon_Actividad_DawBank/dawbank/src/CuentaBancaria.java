
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

    /**
 * Registra un movimiento en la lista de movimientos.
 *
 * @param r El movimiento a registrar.
 */
public void registrarMovimiento(Movimiento r) {
    movimientos.add(r);
}

/**
 * Ingresa una cantidad de dinero en la cuenta.
 *
 * @param cantidad La cantidad de dinero a ingresar.
 * @throws CuentaException Si la cantidad es menor o igual a 0.
 * 
 * <p>Si la cantidad ingresada es mayor o igual a 3000, se emite un aviso para notificar a hacienda.</p>
 * <p>El saldo de la cuenta se incrementa en la cantidad ingresada y se registra un movimiento de tipo "Ingreso".</p>
 */
public void ingresarMovimientos(double cantidad) throws CuentaException {
    if (cantidad <= 0) {
        throw new CuentaException("La cantidad debe ser mayor a 0.");
    }
    if (cantidad >= 3000) {
        System.out.println("AVISO: Notificar a hacienda.");
    }

    saldo += cantidad;
    registrarMovimiento(new Movimiento("Ingreso", cantidad));
}

/**
 * Retira una cantidad de dinero de la cuenta.
 *
 * @param cantidad La cantidad de dinero a retirar.
 * @throws CuentaException Si la cantidad es menor o igual a 0.
 * 
 * <p>Si la cantidad a retirar es mayor o igual a -50, se emite un aviso indicando que la retirada no está permitida y se debe verificar el saldo.</p>
 * <p>El saldo de la cuenta se decrementa en la cantidad retirada y se registra un movimiento de tipo "Retiro".</p>
 */
public void retirarMovimientos(double cantidad) throws CuentaException {
    if (cantidad <= 0) {
        throw new CuentaException("La cantidad debe ser mayor a 0.");
    }
    if (cantidad >= -50) {
        System.out.println("Retirada no permitida, verificar el saldo.");
    }
    saldo -= cantidad;
    registrarMovimiento(new Movimiento("Retiro", cantidad));
}

/**
 * Muestra todos los movimientos registrados en la cuenta.
 * 
 * <p>Si no hay movimientos registrados, se imprime un mensaje indicando que no hay movimientos.</p>
 * <p>De lo contrario, se imprime la representación de cada movimiento en la lista de movimientos.</p>
 */
public void mostrarMovimiento() {
    if (movimientos.isEmpty()) {
        System.out.println("No hay movimientos registrados.");
        return;
    }

    for (Movimiento movimiento : movimientos) {
        movimiento.toString();
    }
}
}
