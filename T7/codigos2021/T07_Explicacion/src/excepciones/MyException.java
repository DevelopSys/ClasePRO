package excepciones;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public int actuarAnteMiExcepcion(int cv){
        System.out.println("Haz algo personalizado");
        return cv-20;
    }
}
