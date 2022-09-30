import prueba.ClasePrueba;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        // operarAritmeticos();
        // operadoresAsignacion();
        // operadoresRelacionales();
        // operadoresLogicos();
        /*ClasePrueba clasePrueba = new ClasePrueba();
        clasePrueba.metodoPublico();
        ClasePrueba.metodoEstatico();*/
        //metodoSinRetorno();
        //metodoConRetorno(); // 10
        // System.out.println(metodoConRetorno());
        // metodos: sumar, restar, multiplicar, dividir y módular
        // dentro de cada uno de los métodos definis los operandos
        // retornan un numero

        // En el main se definen dos operadores
        // En los métodos s,r,m,d,m pero los operadores son los que me dé el main

        // El resultado de la suma es XXXX
        // El resultado de la suma es 40
        /*System.out.printf("El resultado de la suma es: %d%n",sumar());
        System.out.printf("El resultado de la resta es: %d%n",restar());
        System.out.printf("El resultado de la multiplicación es: %d%n",multiplicar());
        System.out.printf("El resultado de la división es: %.2f%n",dividir());
        System.out.printf("El resultado del módulo es: %.2f%n",modular());*/
        /*metodoConParametros("Borja",10);
        System.out.println("Otra ejecución del método");
        metodoConParametros("Juan",9);*/

        // Scanner --> complejo --> muchas funcionalidades
        // Tipo nombre = new Tipo()
        // String nombre = new String("asdasdasd");

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Por favor introduce el número que quieres leer");
        int numeroLeido = lecturaTeclado.nextInt();
        System.out.println("El numero leido es: "+numeroLeido);

        // realizar las operaciones matemáticas, donde se pida por teclado
        // los operandos que necesito (en cada operación)

        // saludar() // nombre, apellido, edad
        // Introduce tu nombre
        // Introduce tu apellido
        // Introduce tu edad
        // Bienvenido a la clase de programacion, los datos pasados son
        // nombre: XXX
        // apellido: XXX
        // edad: XXX

        //int operandoUno = 20, operandoDos = 10;
        //System.out.printf("El resultado de la suma es %d%n", sumar(operandoUno, operandoDos));



    }

    public static void operarAritmeticos() {

        int numeroUno = 0;
        // monarios
        // ++ incremento en 1 a la variable que se aplique
        // -- decremento en 1 a la variable que se aplique
        // - cambio de signo
        numeroUno++; // 1
        numeroUno++; // 2
        numeroUno++; // 3
        numeroUno++; // 4
        System.out.println("El valor del número es: " + numeroUno);
        numeroUno = -8;
        numeroUno--; // -9
        numeroUno--; // -10
        System.out.println("El valor del número es: " + numeroUno);
        // solo útil con una asignacion -numeroUno; // -2
        // binarios
        numeroUno = 5;
        int numeroDos = 10;

        // suma +
        int suma = numeroUno + numeroDos;
        // La suma entre 5 y 10 es 15
        System.out.printf("La suma entre %d y %d es %d%n", numeroUno, numeroDos, suma);
        // resta -
        int resta = numeroUno - numeroDos;
        System.out.printf("La resta entre %d y %d es %d%n", numeroUno, numeroDos, resta);
        // multiplicación *
        int multiplicacion = numeroUno * numeroDos;
        System.out.printf("La multi entre %d y %d es %d%n", numeroUno, numeroDos, multiplicacion);
        // división /
        // 5/10 = 0.500000
        double division = (double) numeroUno / (double) numeroDos;
        System.out.printf("La división entre %d y %d es %.2f%n", numeroUno, numeroDos, division);
        // resto - módulo %
        int modulo = numeroDos % numeroUno;
        System.out.printf("Módulo entre %d y %d es %d%n", numeroDos, numeroUno, modulo);
        modulo = numeroUno % numeroDos;
        System.out.printf("Módulo entre %d y %d es %d%n", numeroUno, numeroDos, modulo);
    }

    public static void operadoresAsignacion() {
        // asignacion =
        int numeroUno = 10, numeroDos = 20;
        // +=
        numeroUno += numeroDos; // numero1 = 30 numero1 = numero1 + numero2
        System.out.printf("El valor de n1 es %d%n", numeroUno);
        // -=
        numeroUno -= 6; // numero1 = 30 - 6 // numero1 = 24
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno *= 2; // numero1 = 24 * 2
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno /= 2; // numero1 = 48/2
        System.out.printf("El valor de n1 es %d%n", numeroUno);

        numeroUno %= 5; // numero1 = 24%5
        System.out.printf("El valor de n1 es %d%n", numeroUno);

    }

    public static void operadoresRelacionales() {
        // relacionales o de comparación --> true / false
        int numeroUno = 9, numeroDos = 9;
        boolean resultado; // false
        // n1 > n2 --> ¿El n1 es más grande que el n2?
        resultado = numeroUno > numeroDos; // 10 > 9
        System.out.printf("El resultado de comparar (>) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);

        numeroUno = 10;
        numeroDos = 10;
        // >=
        resultado = numeroUno >= numeroDos; // 10 >= 10
        System.out.printf("El resultado de comparar (>=) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);


        // < n1 < n2
        numeroUno = 19;
        numeroDos = 10;
        resultado = numeroUno < numeroDos; // 19 < 10
        System.out.printf("El resultado de comparar (<) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);

        // <= n1 <= n2
        numeroUno = 9;
        numeroDos = 10;
        resultado = numeroUno <= numeroDos; // 9 <= 10
        System.out.printf("El resultado de comparar (<=) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);


        numeroUno = 10;
        numeroDos = 10;
        // ==
        resultado = numeroUno == numeroDos; // 10 == "10" // 10 === "10"
        System.out.printf("El resultado de comparar (==) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);

        // != n1 != n2
        numeroUno = 10;
        numeroDos = 10;
        resultado = numeroUno != numeroUno; // 10 != 10
        System.out.printf("El resultado de comparar (!=) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);

        // ! cambio de relación
        numeroUno = 7;
        numeroDos = 10;
        resultado = !(numeroUno < numeroDos); // 7 < 10 --> !(true) --> false
        System.out.printf("El resultado de comparar (!) %d con el %d es %b%n"
                , numeroUno, numeroDos, resultado);

    }

    public static void operadoresLogicos() {
        // && --> cuando es verdadera: cuando todas son verdaderas en caso contrario, resultado false
        // || --> cuando es verdadera: cunado hay una verdadera el caso es verdadero, solo es falso cuando todas son falsas

        int numeroUno = 10, numeroDos = 6, numeroTres = 3;
        boolean acierto = false, resultado; // resultado = false
        String nombre; // se inicializan a null

        resultado = (numeroDos < 6) && (numeroTres != numeroUno) || numeroUno > 10;
        //          F                       V                       F = V
        System.out.printf("El resultado de la sentencia lógica es %b%n", resultado);

        resultado = numeroUno > 0 && !(numeroTres < numeroDos) && !acierto;
        //          V                  F                    V = F
        System.out.printf("El resultado de la sentencia lógica es %b%n", resultado);

    }

    // mod_acceso (public, protected, private)
    // static
    // void --> retorno vacío: solo ejecuta lo que está definido dentro
    // int,double,String,float,boolean,cualquier_tipo --> retorno tipo: se ejecuta todo lo que hay en el metodo y al final me dá un resultado
    // si tiene retono, la última palabra del método es return
    public static void metodoSinRetorno() {
        System.out.println("Esto es un método que no tiene retorno");
        System.out.println("Solo tiene ejecuciones");
    }

    public static int metodoConRetorno() {
        System.out.println("Este si es un método con retorno");
        System.out.println("y en concreto retornas un número");
        int numero = 10;
        return numero;
    }

    public static void metodoSinParametros() {

    }

    // tipo nombreTemporal, tipo nombreTemporal
    public static void metodoConParametros(String nombre, int numero) {
        System.out.printf("El nombre pasado es %s%n", nombre);
        System.out.printf("El numero pasado es %d%n", numero);
    }

    public static int sumar() {

        int numeroUno = 20, numeroDos = 20;
        //int suma = numeroUno + numeroDos;
        return numeroUno + numeroDos;
    }

    public static int sumar(int operando1, int operando2) {
        return operando1 + operando2;
    }

    public static int sumar(int operando1, String operando2) {
        return 9;
    }

    public static int sumar(int op1, int op2, int op3) {
        return op1 + op2 + op3;
    }

    public static int restar() {

        int numeroUno = 20, numeroDos = 20;
        //int suma = numeroUno + numeroDos;
        return numeroUno - numeroDos;
    }

    public static int multiplicar() {

        int numeroUno = 20, numeroDos = 20;
        //int suma = numeroUno + numeroDos;
        return numeroUno * numeroDos;
    }

    public static double dividir() {

        int numeroUno = 20, numeroDos = 20;
        //int suma = numeroUno + numeroDos;
        return (double) numeroUno / (double) numeroDos;
    }

    public static double modular() {

        int numeroUno = 20, numeroDos = 20;
        //int suma = numeroUno + numeroDos;
        return (double) numeroUno % (double) numeroDos;
    }

}
