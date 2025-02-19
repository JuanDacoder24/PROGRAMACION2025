/**
 * @throws CuentaException Excepción personalizada que se lanza para indicar un error en las operaciones 
 * relacionadas con la cuenta bancaria.
 */
public class CuentaException extends Exception{

    public CuentaException(String mensaje) {
        super("Error en la operacion");
    }
}
