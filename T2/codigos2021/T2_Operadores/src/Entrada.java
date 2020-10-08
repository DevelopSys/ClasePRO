public class Entrada {

    // primitiva: int, boolean, double, short
    // compleja: String, Scanner, Integer, Boolean

    // constantes: final int NUMERO = 9

    public static void main(String[] args) {


        String MINOMBRE = "Borja";
        System.out.println("Programa de operadores de " + MINOMBRE);

        // Aritméticos: +, -, *, /, %

        int operadorUno = 50, operadorDos = 3;
        int suma = operadorUno + operadorDos;
        int resta = operadorUno - operadorDos;
        int multiplicacion = operadorUno * operadorDos;
        int division = operadorUno / operadorDos;
        int modulo = operadorUno % operadorDos;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        System.out.println("El resultado del módulo es: " + modulo);

        // Unarios: ++, -- => contador

        int operadorUnirio = 10;
        System.out.println("El valor de operadorUnario es " + operadorUnirio);
        operadorUnirio++;
        operadorUnirio++;
        operadorUnirio++;
        operadorUnirio--;
        System.out.println("El valor de operadorUnario es " + operadorUnirio);

        // aritmeticos y unarios => acumuladores
        // op1 = -1
        // op1 *= op2;
        // op1 = 110
        // op1 /= op2;
        // op1 %= op2;
        int op1 = 10, op2 = 5;
        //op1 = op1 + op2;
        op1 += op2;
        // op1 = 15
        // 15 - 5
        System.out.println("Suma contraida: " + op1);
        op1 -= op2;
        // op1 = 10
        System.out.println("Resta contraida: " + op1);
        // op1 = 50
        op1 *= op2;
        System.out.println("Multiplicación contraida: " + op1);
        // op1 = 10
        op1 /= op2;
        System.out.println("División contraida: " + op1);
        // op1 = 0
        op1 %=op2;
        System.out.println("Módulo contraida: " + op1);

        // Operadores comparadores >, >=, <=, <, 1 == "1" (1==="1")

        int numeroCompararUno = 5, numeroCompararDos = 5;
        // 10>5 ????
        boolean resultadoComparacion = numeroCompararUno > numeroCompararDos;
        System.out.println("Comparación mayor que: "+resultadoComparacion);
        // 10 >= 5 ???
        resultadoComparacion = numeroCompararUno>=numeroCompararDos;
        // 10 <= 5 ???
        System.out.println("Comparación mayor-igual que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno < numeroCompararDos;
        // 10 < 5 ??
        System.out.println("Comparación menor que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno <= numeroCompararDos;
        System.out.println("Comparación menor-iguar que: "+resultadoComparacion);
        // 10 == "10"
        resultadoComparacion = numeroCompararUno == numeroCompararUno;
        System.out.println("Comparación iguar que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno != numeroCompararDos;
        System.out.println("Comparación diferente que: "+resultadoComparacion);


        // inversos
        int inverso = -5;
        boolean inversoBool = false;
        inversoBool = !inversoBool;
        System.out.println("El inverso del "+inverso +" es: "+ -inverso);
        System.out.println("El inverso del "+inversoBool +" es: "+ !inversoBool);
        System.out.println("El valor de inversoBool es: "+inversoBool);

        // comparaciones con letras
        String palabraUno = "Hola", palabraDos = "hola";
        boolean palabrasIguales = palabraUno.equals(palabraDos);
        System.out.println("Las palabras son iguales? "+palabrasIguales);

        // Operadores lógicos
        // AND --> &&
        // op1  op2 res
        //  0   0   0
        //  0   1   0
        //  1   0   0
        //  1   1   1
        // n1 = 1   n2 = 10
        // (n1 >= 1 && n2 >= 10 ) -> V
        // OR --> ||
        // op1  op2 res
        //  0   0   0
        //  0   1   1
        //  1   0   1
        //  1   1   1

        // ((C1 AND C2 AND C3) OR C4 OR C5) -->

        int numeroLogicoUno = 5, numeroLogicoDos = 15, numeroLogicoTres = -7;

        boolean cumplir = numeroLogicoUno>11 && numeroLogicoDos<20 && numeroLogicoTres>-10;
        System.out.println("La sentencia AND se cumple?: "+cumplir);
        cumplir = numeroLogicoUno >0 || numeroLogicoDos == 19 || numeroLogicoTres<0;
        System.out.println("La sentencia OR se cumple?: "+cumplir);
        cumplir = (numeroLogicoUno>10 || (numeroLogicoDos>0 && numeroLogicoTres<20) && numeroLogicoTres != -1);
        // F || V && V --> V
    }
}
