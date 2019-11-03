import java.util.Scanner;

public class EstructuraDo {

    // Ámbito de clase
    static Scanner teclado = new Scanner(System.in);
 
    public static void main(String[] args) {
       int nota = 10;
       
       // de una a n ejecuciones 
       do{
            System.out.println("El examen está aprovbado con un "+nota);
            nota--;
       }while(nota>4);

       nota = 0;

       // de 0 a n ejecuciones 
       while(nota<5){
            System.out.println("El examen está suspenso con un "+nota);
            nota++;
       }

    }


    }
}
    
