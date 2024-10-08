import java.util.Scanner;

public class EntradaEjerciciosSwitch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio4();
        int numero = 5;
        switch (numero){
            case 1|2|3|4:
                break;
            case 6|5|7|8:
                if (){

                } else if(){
                    
                }

                else{}
                break;
        }
    }

    public static void ejercicio1() {
        System.out.println("Que dia de la semana quieres sacar");
        int dia = scanner.nextInt();
        // 1->lunes 7->domingo
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no contemplado");
        }
    }

    public static void ejercicio2() {
        System.out.println("Di que letra quieres analizar");
        char letra = scanner.next().charAt(0);
        switch (letra) {
            case 'A' | 'E' | 'I' | 'O' | 'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consolante");
        }
    }

    public static void ejercicio3() {
        System.out.println("Que numero quieres analizar");
        int numero = scanner.nextInt();
        int resto = numero % 2;

        /*boolean par = numero%2==0;
        if (numero%2==0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }*/
        switch (resto) {
            case 0:
                System.out.println("El numero es par");
                break;
            default:
                System.out.println("Impar");
        }


    }

    public static void ejercicio4() {

        // mes -> cuantos dias tiene
        // febrero ->28
        // enero marzo mayo julio agosto octubre diciembre 31
        // abril junio septiembre noviembre 30
        System.out.println("Que mes quires analizar");
        String mes = scanner.next();
        switch (mes.toLowerCase()) {
            case "febrero":
                System.out.println("Tienes 28 dias");
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("Tienes 31 dias");
                break;
            default:
                System.out.println("Tienes 30 dias");
        }
    }
}
