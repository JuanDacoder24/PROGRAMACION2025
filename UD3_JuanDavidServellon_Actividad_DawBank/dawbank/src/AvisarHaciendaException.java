/**
 * @throws AvisarHaciendaException Este constructor llama al constructor de la clase padre 
     * con un mensaje predeterminado que indica que se avisará a Hacienda.
 */
public class AvisarHaciendaException extends Exception{

    public AvisarHaciendaException (String mensaje) {
        super("Error en la operacion, avisaremos a hacienda");
    }
}
