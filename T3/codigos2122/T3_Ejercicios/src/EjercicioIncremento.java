import java.util.Scanner;

public class EjercicioIncremento {

    public static void main(String[] args) {

        int numeroUno;
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce n1");
        numeroUno = lecturaTeclado.nextInt();

        if (numeroUno%2==0){
            numeroUno+=2;
        } else if (numeroUno%3==0){
            numeroUno+=3;
        } else if (numeroUno%5==0){
            numeroUno+=5;
        } else {
            numeroUno+=1;
        }

        System.out.println(numeroUno);


    }
}
