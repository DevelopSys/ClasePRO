import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        String s = "impar";
        if (a % 2 == 0) {
            s = "es par";
        }
        System.out.println("El resultado es " + s);
    }
    public static void ejercicio2(){
        Scanner lector = new Scanner(System.in);
        int a = lector.nextInt();
        if (a%2==0){
            //a+=1;
            a++;
        } else if (a<10){
            // es impor -> no es necesario preguntarlo
            a--;
        } else if (a<100) {
            // es impor -> no es necesario preguntarlo
            // es mayor que 10
            a*=2;
            a++;
        } else{
            // es impor -> no es necesario preguntarlo
            // es mayor que 100
            a=0;
        }
        System.out.println("El valor de a es "+a);
    }

    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<0){
            System.out.println("Negativo");
        } else if (a<10) {
            System.out.println("1 digito");
        } else if (a<100){
            System.out.println("2 digitos");
        } else if (a<1000){
            System.out.println("3 digitos");
        }
        /*
        * [-,0)
        * [0,10)
        * [10,100)
        * [100,1000)
        * */
    }
}
