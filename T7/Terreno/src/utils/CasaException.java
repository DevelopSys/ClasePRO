package utils;

public class CasaException extends Exception {

    private int tipo;
    public CasaException(String message, int tipo) {
        super(message);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
