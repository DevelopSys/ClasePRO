package excepcionsaldo.utils;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message, int numero) {
        super(message);
        System.out.println(message + ". No se puede realizar una operacion con el monto" + numero);
    }
}
