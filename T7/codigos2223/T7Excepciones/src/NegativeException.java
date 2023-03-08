public class NegativeException extends Exception{

    private int numero;
    public NegativeException(String mensaje, int numero){
        super(mensaje);
        // lo que sea
        //System.out.println("El numero pasado es "+numero);
        this.numero = numero;
    }

    public void verNumeroFallo(){
        System.out.println(numero);
    }
}
