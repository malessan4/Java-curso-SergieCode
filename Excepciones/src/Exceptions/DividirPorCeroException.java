package Exceptions;

public class DividirPorCeroException extends Exception {

    @Override
    public String getMessage() {
        return "No se puede divir por cero";
    }

}
