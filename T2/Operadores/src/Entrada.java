public class Entrada {

    public static void main(String[] args) {

        /*
        // casteo - parseo: cambiar el tipo de un dato
            // casteo: si de forma natural entra (se pierde info)
            // parseo: si de forma natural no entra (forzar el cambio)

        // casting
        int altura = (int)12.87;
        double estatura =  12;
        char letra = (char) 70;
        int letraASCII = (int)'o';
        int operando1 = 5;
        int operando2 = 2;
        System.out.println("Resultado division");
        System.out.println((double) operando1/operando2);
        System.out.println(operando1/operando2);
        System.out.println(altura);
        System.out.println(estatura);
        System.out.println(letra);
        System.out.println(letraASCII);

        // parseo
        String numero = String.valueOf(8)+7 ;
        int cosa = Integer.parseInt("9");

        System.out.println(numero);
        System.out.println(cosa+7);*/
        System.out.println("Operadores aritmeticos");
        // + suma
        // - resta
        // * multiplicacion
        // / division
        // % modulo - resto
        int operador1 = 6;
        int operador2 = 9;
        operador2--; // operador2 - 1
        operador1++; // operador1 + 1 7
        int suma = operador1 + operador2;
        int resta = operador1 - operador2;
        int multiplicacion = operador1 * operador2;
        double division = (double) operador2 / operador1;
        int modulo = operador2 % operador1;
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
        System.out.println("El resultado del modulo es " + modulo);

        System.out.println("Operadores de asignacion");
        // = asigna valor
        operador1 = 10;
        operador2 = 5;
        // +=, -=, *=, /=, %=
        // operador1 = operador1+10; // 20
        operador1 += 10; // 20
        operador2 -=4; // 1
        operador1 *=2; // 40
        operador2 /=2; // 0
        operador1 %=4; // 0 40/4 = 10 0
        operador1+=1;
        operador2-=1; // -1
        operador2 = -operador2; // 1
        System.out.println("El valor final del op1 despues de asignar es "+operador1);
        System.out.println("El valor final del op2 despues de asignar es "+operador2);

        System.out.println("Operadores de comparacion");
        // > >= < <= == != -> bool
        operador1 = 7;
        operador2 = 4;
        boolean comparacion = operador1 > operador2; // 7 >4 true
        System.out.println("La comparacion de > es: "+comparacion);
        comparacion = operador2 >= operador1; // 4>=7 false
        System.out.println("La comparacion de >= es: "+comparacion);
        comparacion = operador2<operador1; // 4<7 true
        System.out.println("La comparacion de < es: "+comparacion);
        comparacion = operador2 <= operador1; // 4<=7 true
        System.out.println("La comparacion de <= es: "+comparacion);
        comparacion = operador2 == operador1; // 7 == 4 false
        System.out.println("La comparacion de == es: "+comparacion);
        comparacion = operador2 != operador1; // 7 != 4 true
        System.out.println("La comparacion de != es: "+comparacion);
        comparacion = !comparacion; // cambia el valor de comparacion

        

    }

}
