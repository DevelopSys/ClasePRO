public class Entrada {

    public static void main(String[] args) {
        int numeroUno = 10;
        int numeroDos = 6;
        int numeroTres =30;
        int numeroCuatro = 26;
        /*
        OPERADORES ARITMETICOS
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero++;
        numero--;
        numero--;
        numero--;
        numero = -numero;
        int suma = numeroUno+numeroDos;
        int resta = numeroUno-numeroDos;
        int multi = numeroUno*numeroDos;
        double division = (double)numeroUno/numeroDos;
        int modulo = numeroUno%numeroDos;
        System.out.printf("El resultado de la suma es %d\n",suma);
        System.out.printf("El resultado de la resta es %d\n",resta);
        System.out.printf("El resultado de la multip es %d\n",multi);
        System.out.printf("El resultado de la division es %.2f\n",division);
        System.out.printf("El resultado de la modulo es %d\n",modulo);*/
        /*
        // OPERADORES ASIGNACION
        numeroUno += numeroDos; // numeroUno = numeroUno + numeroDos numeroUno = 6 +10
        // numeroUno = 16
        numeroUno-=2; // numeroUno = numeroUno - 2 numeroUno = 16-2
        // numeroUno = 14
        numeroUno*=1; // numeroUno = numeroUno * 1 numeroUno = 14*1
        // numeroUno =14
        numeroUno/=2; // numeroUno = numeroUno / 2 numeroUno = 14/2
        // numeroUno =7
        numeroUno%=3; // numeroUno = numeroUno % 3 numeroUno = 7%3
        // numeroUno = 1
        System.out.println(numeroUno);*/
        /*
        // OPERADORES RELACIONALES
        // > : el numero de la izq es más grande que el numero que esta en la derecha
        boolean relacionUno = numeroUno>numeroDos; // 10>6 -> true
        // >= : el numero de la izq es más grande o igual que el numero que esta en la derecha
        numeroDos=10;
        boolean relacionDos = numeroUno >= numeroDos; // 10>10 ->true
        // < : el numero de la izq es más pequeño que el numero que esta en la derecha
        numeroDos = 17;
        boolean relacionTres = numeroDos<numeroUno; // 17<10 -> false
        // <= : el numero de la izq es más pequeño o igual que el numero que esta en la derecha
        boolean relacionCuatro = numeroUno<=numeroDos; // 10<=17 -> true
        // ==: los dos numeros tienen el mismo valor
        boolean relacionCinco = numeroDos == numeroUno; // 17 == 10 -> false
        // !=; los dos numeros son diferentes
        numeroDos=10;
        boolean relacionSeis = numeroUno!=numeroDos; // 10 != 10 -> false
        */
        /*
        // OPERADORES LOGICOS
        // && solo es true si todos se cumplen
        boolean relacionUno = numeroUno>0 && numeroDos<numeroTres; // 10>0 && 6<30 -> true
        // | solo es false si todos son false
        boolean relacionDos = numeroDos<0 || numeroDos<numeroCuatro; // 6<0 || 6<26 -> true
        // ! cambia el valor de la condicion
        boolean relacionTres =  numeroCuatro> 2*numeroUno && !(numeroTres>numeroCuatro)&& !false; // !(30>26) && 26>20
        boolean relacionCuatro =  ( (numeroCuatro> 2*numeroUno  || numeroCuatro> 2*numeroUno) && (numeroTres>numeroCuatro || false)) || true; // !(30>26) && 26>20
        */
    }
}
