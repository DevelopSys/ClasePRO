import java.util.Scanner;

public class EjercioBase {

    public static void main(String[] args) {
        /*
         * */

        //new EjercioBase().ejercicio6();
        new EjercioBase().ejericio15(34,12,2020);
    }

    public void ejercicio1() {
        /*
         * Hágase un programa que lea dos enteros y
         * compruebe si el primero es o no mayor que el segundo.
         * En la salida se mostrará “El primero es mayor que el segundo”
         * o “El primero no es mayor que el segundo”.
         * */

        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce numero 1");
        num1 = teclado.nextInt();
        System.out.println("Introduce numero 2");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El segundo es mayor o igual que el primero");
        }
    }

    public void ejercicio2() {
        /*
         * (SumaTres) Hágase un programa que lea tres enteros positivos,
         * y compruebe si alguno es suma de los otros dos.
         * En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6”
         * (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java
         *
         * */

        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce numero 1");
        num1 = teclado.nextInt();
        System.out.println("Introduce numero 2");
        num2 = teclado.nextInt();
        System.out.println("Introduce numero 3");
        num3 = teclado.nextInt();

        if (num1 == num2 + num3) {
            System.out.printf("%d + %d = %d%n", num2, num3, num1);
        } else if (num2 == num1 + num3) {
            System.out.printf("%d + %d = %d%n", num1, num3, num2);
        } else if (num3 == num1 + num2) {
            System.out.printf("%d + %d = %d%n", num2, num1, num3);
        } else {
            System.out.println("Ninguno es la suma");
        }


    }

    public void ejercicio5() {
        /*
        * Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
        * “El número no tiene 4 dígitos”;
        * "Es capicúa”
        * “No es capicúa”.
        * */

        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Introduce numero a comprobar");
        num1 = teclado.nextInt();
        if (num1>=1000 && num1<=9999){
            System.out.println("hay 4 digitos");
            // 1991 --> 1,9,9,1
            int unidades, decenas, centenas, millares;
            int falta = num1;
            int resto = falta%10;
            unidades = num1%10;
            decenas = (num1%100)/10;
            centenas = (num1%1000)/100;
            millares = (num1%10000)/1000;

            if (unidades==millares && centenas==decenas){
                System.out.println("capicua");
            } else {
                System.out.println("no capicua");
            }
            System.out.println(unidades);
            System.out.println(decenas);
            System.out.println(centenas);
            System.out.println(millares);


        } else {
            System.out.println("No hay 4 digitos");
        }
    }

    public void ejercicio6(){
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce numero 1");
        num1 = teclado.nextInt();
        System.out.println("Introduce numero 2");
        num2 = teclado.nextInt();

        boolean acierto = true;
        System.out.println(-num1);
        System.out.println(-num2);
        System.out.println(!acierto);
    }

    public void ejercicio8(){
        /*
        * (Ordenados) Leer tres enteros y mostrarlos ordenados.
         * */

        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Introduce numero 1");
        num1 = teclado.nextInt();
        System.out.println("Introduce numero 2");
        num2 = teclado.nextInt();
        System.out.println("Introduce numero 3");
        num3 = teclado.nextInt();

        // 6,2,9 --> Array.sort(coleccion)

        /*
        * int menor = 2
        * int intermedio = 6
        * int mayor = 9;
        * */
    }

    public void ejercicio9(){
        // 4,5,6
        //5,6,9

        int n1=0,n2=0,n3=0;
        if (n1+1==n2 && n2+1==n3){

        }

    }

    public boolean ejericio14(int dia, int mes, int anio){
        if (dia>29){
            if (dia>30 && mes == 1){
                System.out.println("incorrecta");
                return false;
            }
        } else {
            if (mes ==2){
                if (anio%4==0){
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;


        /*if (mes==2 && dia>29){

        } else if ((mes==1|| mes==3) && dia>30 ){

        }*/
    }

    public void ejericio15(int dia, int mes, int anio){
        if (new EjercioBase().ejericio14(dia,mes,anio)){

        }else {

        }
    }



}
