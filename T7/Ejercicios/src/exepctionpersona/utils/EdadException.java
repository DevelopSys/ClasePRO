package exepctionpersona.utils;

public class EdadException extends Exception{
    // cuando la edad es <18
    public EdadException(String message) {
        super(message);
    }
}
