import java.util.Scanner;

public class EstructuraSwitch {

    static Scanner teclado = new Scanner(System.in);
 
    public static void main(String[] args) {
       int nota = 10;
       
      nota = 8;
        switch (nota) {
            case 1:
                System.out.println("La note obtenida es un 1");
                break;
            case 5:
                System.out.println("La nota obtenida es un 5");
                break;
            case 10:
                System.out.println("La nota obtenida es un 10");
                break;
            default:
                System.out.println("La nota obtenida no está contemplada en este bloque");
                break;
        }


    }
}
    
