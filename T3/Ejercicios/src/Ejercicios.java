import java.util.Scanner;

public class Ejercicios {

    private Scanner lectorTeclado;

    public void ejercicio1(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = lectorTeclado.nextInt();
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        lectorTeclado.close();
    }

    public void ejercicio2(){
        lectorTeclado = new Scanner(System.in);

        System.out.println("Cuanto cobras al año");
        double salarioAnual = lectorTeclado.nextDouble();
        double impuestos = 0.0;
        if (salarioAnual<10000){
            impuestos =0.0;
        } else if (salarioAnual<20000){
            impuestos=0.05;
        } else if (salarioAnual<35000) {
            impuestos=0.15;
        } else {
            impuestos=0.2;
        }

        System.out.println("Pagas de impuestos "+(salarioAnual*impuestos));
        System.out.println("Cobras un total de "+salarioAnual);

        lectorTeclado.close();
    }

    public void ejercicio3(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el primer numero");
        int n1 = lectorTeclado.nextInt();
        System.out.println("Indica el segundo numero");
        int n2 = lectorTeclado.nextInt();
        System.out.println("Indica el tercero numero");
        int n3 = lectorTeclado.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("El mayor es el n1");
        } else if (n2>n1 && n2>n3){
            System.out.println("El mayor es el n2");
        } else {
            // tengo en cuenta que todos los numeros son diferentes
            System.out.println("El mayor es el n3");
        }
    }


    public void ejercicio6(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica que dia quieres pasar a letras");
        int nDia = lectorTeclado.nextInt();
        switch (nDia){
            case 1 ->{
                System.out.println("Lunes");
            }
            case 2 ->{
                System.out.println("Martes");
            }
            case 3 ->{
                System.out.println("Miercoles");
            }
            case 4 ->{
                System.out.println("Jueves");
            }
            case 5 ->{
                System.out.println("Viernes");
            }
            case 6 ->{
                System.out.println("Sabado");
            }
            case 7 ->{
                System.out.println("Domingo");
            }
            default -> {
                System.out.println("Dia desconocido");
            }
        }
    }

    public void ejecicio9(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica la lectra que quieres evaluar");
        char letra = lectorTeclado.next().charAt(0);
        switch (letra){
            case 'A','E','I','O','U' -> {
                System.out.println("Es una vocal");
            }
            default -> {
                System.out.println("Es una consolante");
            }
        }
    }
    public static void metodoStatic(){

    }
}
