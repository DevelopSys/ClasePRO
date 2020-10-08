import java.util.Scanner;

public class Ambito {

    // primitiva o compleja
    // constante
    // clase o bloque (metodo)

    // variablo de clase
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // variable de bloque (metodo)
        //teclado = new Scanner(System.in);

        String nombre;
        System.out.println("Introduce nombre");
        //nombre = teclado.next();
    }

    // metodo_acceso tipo_retorno nombre_metodo(argumentos){
    //      Lo que se va a ejecutar
    // }

    // public - protected - private
    // void - int double float boolean

    public void hacerAlgo(){
        // variable de bloque (metodo)
        String nombre = teclado.next();

    }

}
