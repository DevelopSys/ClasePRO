import java.util.Scanner;

public class EntradaEjerciciosSwitch {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio4();
        //ejercicio6();
        // ejercicio7();
        ejercicio8();


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

    public static void ejercicio6() {
        System.out.println("1. Opcion añadir\n2. Opcion listar\n3. Opcion buscar\n4. Opcion modificar\n5. Salir ");
        /*System.out.println("2. Opcion listar");
        System.out.println("3. Opcion buscar");
        System.out.println("4. Opcion modificar");
        System.out.println("5. Salir");*/
        System.out.println("Introduce que opcion quieres ralizar");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Seleccionada opcion 1");
                break;
            case 2:
                System.out.println("Seleccionada opcion 2");
                break;
            case 3:
                System.out.println("Seleccionada opcion 3");
                break;
            case 4:
                System.out.println("Seleccionada opcion 4");
                break;

        }
    }

    public static void ejercicio7() {
        System.out.println("Introduce una nota");
        int nota = scanner.nextInt();
        switch (nota) {
            case 1, 2, 3, 4:
                System.out.println("SS");
                break;
            case 5, 6:
                System.out.println("AP");
                break;
            case 7, 8:
                System.out.println("NT");
                break;
            case 9:
                System.out.println("SB");
                break;
            case 10:
                System.out.println("MH");
                break;
        }
    }

    public static void ejercicio8() {
        System.out.println("Introduce el primer operando");
        int oprando1 = scanner.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = scanner.nextInt();
        System.out.println("Que operacion quieres hacer");
        char operacion = scanner.next().charAt(0);
        int resultado = 0;
        switch (operacion) {
            case '+':
                resultado = oprando1 + operando2;
                //System.out.println("La suma es "+(oprando1+operando2));
                break;
            case '-':
                resultado = oprando1 - operando2;
                //System.out.println("La resta es "+ (oprando1-operando2));
                break;
            case '*':
                resultado = oprando1 * operando2;
                //System.out.println("La multi es "+(oprando1*operando2));
                break;
            case '/':
                resultado = oprando1 / operando2;
                //System.out.println("La div es "+((float)oprando1/operando2));
                break;
        }
        System.out.println("El resulttado es " + resultado);
        // quiero trabajar con el resultado
    }

    public static void ejercicio9() {
        System.out.println("Indica mes");
        int mes = scanner.nextInt();
        switch (mes) {
            case 1, 2, 3:
                System.out.println("Este mes es invierno");
                break;
            case 4, 5:
                System.out.println("Este mes es primavera");
                break;
            case 6, 7, 8, 9:
                System.out.println("Este mes es verano");
                break;
            case 10, 11, 12:
                System.out.println("Este mes es otoño");
                break;
        }
    }

    public static void ejercicio10() {
        // 1. iphone 700
        // 2. play 500
        // 3. tablet 300
        System.out.println("Indica el codigo de producto");
        int codigo = scanner.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("Es un iphone");
                System.out.println("Vale 700");
                break;
            case 2:
                System.out.println("Es una play");
                System.out.println("Vale 500");
                break;
            case 3:
                System.out.println("Es una tablet");
                System.out.println("Vale 300");
                break;
            default:
                System.out.println("Producto no reconocido");
        }
    }
}
