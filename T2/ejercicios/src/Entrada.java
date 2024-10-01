import java.util.Objects;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);
    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        // ejercicio9();
        ejercicio10();
    }

    public static void ejercicio1() {

        final String NOMBRE = "Borja Martin Herrera";
        final String DIRECCION = "C/Estocolmo 1";
        final int PORTAL = 1;
        final int PISO = 1;
        final char LETRA = 'A';
        final int CODIGO = 28942;
        final String POBLACION = "Alcorcon";
        final String PROVINCIA = "Madrid";
        final String PAIS = "España";

        System.out.println(NOMBRE);
        System.out.printf("%s \tnº%d\t\t %d%c\n", DIRECCION, PORTAL, PISO, LETRA);
        System.out.printf("%d,\t\t\t%s %s\n", CODIGO, POBLACION, PROVINCIA);
        System.out.println(PAIS);

    }

    public static void ejercicio2() {
        System.out.println("Por favor introduce tu nombre completo");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Por favor introduce tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Te llamas " + nombre);
        System.out.printf("Tienes %d años\n", edad);
    }

    public static void ejercicio3() {
        System.out.println("Por favor introduce el primer operando");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Por favor introduce el segundo operando");
        int operando2 = lectorTeclado.nextInt();
        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multi = operando1 * operando2;
        int divInt = operando1 / operando2;
        float divReal = (float) operando1 / operando2;
        int modul = operando1 % operando2;
        float modulReal = (float) operando1 % operando2;

        System.out.printf("El resultado de sumar %d y %d es %d\n", operando1, operando2, suma);
        System.out.printf("El resultado de resta %d y %d es %d\n", operando1, operando2, resta);
        System.out.printf("El resultado de multi %d y %d es %d\n", operando1, operando2, multi);
        System.out.printf("El resultado de divInt %d y %d es %d\n", operando1, operando2, divInt);
        System.out.printf("El resultado de divReal %d y %d es %f\n", operando1, operando2, divReal);
        System.out.printf("El resultado de mod %d y %d es %d\n", operando1, operando2, modul);
        System.out.printf("El resultado de modReal %d y %d es %f\n", operando1, operando2, modulReal);

    }

    public static void ejercicio4() {
        System.out.println("Por favor dime cuantos bocatas quieres");
        int nBocadillos = lectorTeclado.nextInt();
        System.out.println("Por favor dime cuantas bebidas quieres");
        int nBebidas = lectorTeclado.nextInt();
        System.out.println("Cuanto vas a pagar por los bocatas");
        float precioBocata = lectorTeclado.nextFloat();
        System.out.println("Cuanto vas a pagar por los bebidas");
        float precioBebidas = lectorTeclado.nextFloat();
        float total = (nBocadillos * precioBocata) + (nBebidas * precioBebidas);
        System.out.println("Coste total " + total);
    }

    public static void ejercicio5() {
        // resuelvo el ejercicio1
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor dime cuantos segundos quieres pasar");
        int segundosTotales = lectorTeclado.nextInt();
        int horas = segundosTotales / 3600;
        segundosTotales = segundosTotales % 3600;
        int minutos = segundosTotales / 60;
        //System.out.println("segundo restantes: "+segundosTotales);
        segundosTotales = segundosTotales % 60;
        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundosTotales);

    }

    public static void ejercicio6() {
        System.out.println("Cuanto te ha costado el articulo");
        float precioArticulo = lectorTeclado.nextFloat();
        System.out.println("Cuanto IVA has pagado");
        int iva = lectorTeclado.nextInt();
        // 400 -> 400 - (400*21%)
        float ivaPagado = precioArticulo * ((float) iva / 100);
        float precioNeto = precioArticulo - ivaPagado;
        System.out.println("IVA: " + ivaPagado);
        System.out.println("Producto sin IVA: " + precioNeto);
    }

    public static void ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce el radio del circulo");
        int radio = scanner.nextInt();
        // boolean correcto = radio>=0 && radio<=100;
        double area = Math.PI * Math.pow(radio, 2); // radio*radio
        double longitud = 2 * radio * Math.PI;
        System.out.printf("El area del circulo es: %.2f\n", area);
        System.out.printf("El area del longitud es: %.2f\n", longitud);
    }

    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduce los Centigrados a pasar a F y K");
        double gradosC = scanner.nextDouble();
        double gradosK = gradosC + 273.15;
        double gradosF = (9 * gradosC) / 5 + 32;
        System.out.printf("Los grados centrigrado son %.2f grados K\n", gradosK);
        System.out.printf("Los grados centrigrado son %.2f grados F\n", gradosF);
    }

    public static void ejercicio9() {
        System.out.println("Cuantos bocadillos quieres");
        int cantidadBocadillos = scanner.nextInt();
        System.out.println("Cuantas bebidas quieres");
        int cantidadBebidas = scanner.nextInt();
        ;
        final double PRECIO_BOCATA = 2.5;
        final double PRECIO_BEBIDA = 1.25;
        System.out.println("Dime cuantos sois");
        int numeroComensales = scanner.nextInt();
        double total = PRECIO_BEBIDA * cantidadBebidas + PRECIO_BOCATA * cantidadBocadillos;
        double precioUsuarios = total / numeroComensales;
        System.out.printf("ARTICULO\t\t\t\t\tCANTIDAD\t\t\t\t\tPRECIO\t\t\t\t\tCOSTE\n");
        System.out.printf("Bocadillos\t\t\t\t\t%d\t\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n",
                cantidadBocadillos, PRECIO_BOCATA, PRECIO_BOCATA * cantidadBocadillos);
        System.out.printf("Bebidas\t\t\t\t\t\t%d\t\t\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n",
                cantidadBebidas, PRECIO_BEBIDA, PRECIO_BEBIDA * cantidadBebidas);
        System.out.printf("TOTAL\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n",
                total);
        System.out.printf("P.Persona\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n",
                precioUsuarios);
    }

    public static void ejercicio10(){
        System.out.println("Introduce numero unidades");
        int unidades = scanner.nextInt();
        System.out.println("Introduce numero decenas");
        int decenas = scanner.nextInt();
        System.out.println("Introduce numero centenas");
        int centenas = scanner.nextInt();
        System.out.println("Introduce numero unidades de millar");
        int unidadesMillar = scanner.nextInt();
        System.out.println("Introduce numero decenas de millar");
        int decenasMillar = scanner.nextInt();
        System.out.println("El numero introducido es "+decenasMillar+unidadesMillar+centenas+decenas+unidades);
    }

    public static void ejercicio11(){
        System.out.println("Por favor introduce el numero a evaluar");
        int numero = scanner.nextInt();
        boolean par = numero%2==0;
        boolean mayor50 = numero>50;
        System.out.println("Numero par: "+par);
        System.out.println("Numero mayor: "+mayor50);
    }

    public static void ejercicio12(){
        System.out.println("Introduce la primera frase");
        String frase1 = scanner.nextLine();
        System.out.println("Introduce la primera frase");
        String frase2 = scanner.nextLine();
        // f1 = "hola"
        // f2 = "hola"
        boolean palabrasIguales = frase1.equals(frase2);
        // boolean palabrasDistintas = !frase1.equals(frase2);
        boolean primeraMenor = frase1.length() < frase2.length();
        System.out.println("Son iguales: "+palabrasIguales);
        System.out.println("Primera menor: "+primeraMenor);
        System.out.println("Son distintas: "+!palabrasIguales);

    }

    public static void ejercicio13(){
        System.out.println("Introduce el primer numero");
        int primerNumero = scanner.nextInt();
        System.out.println("Introduce el segundo numero");
        int segundoNumero = scanner.nextInt();
        boolean condicion1 = primerNumero%2==0 && segundoNumero%2!=0;
        boolean condicion2 = primerNumero<8 && primerNumero> segundoNumero*2;
        boolean condicion3 = primerNumero==segundoNumero||(primerNumero-segundoNumero)<2;
        System.out.println("Condicion1: "+condicion1);
        System.out.println("Condicion2: "+condicion2);
        System.out.println("Condicion3: "+condicion3);
    }

    public static void ejercicio14(){
        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();
        System.out.println("Dime tu nivel de estudios");
        int estudios = scanner.nextInt();
        System.out.println("Dime tu salario");
        int salario = scanner.nextInt();
        boolean condicion = edad>40 && (estudios>=5&&estudios<=8) && salario<15000;
        System.out.println("Condicion "+condicion);
    }

    public static void ejercicio15(){
        System.out.println("Introduce numero");
        int numero = scanner.nextInt();
        numero+=5;
        System.out.println("El resultado es:"+numero);
        numero-=3;
        System.out.println("El resultado es:"+numero);
        // numero = numero*10
        numero*=10;
        System.out.println("El resultado es:"+numero);
        numero/=2;
        System.out.println("El resultado es:"+numero);
    }

    public static void dudas (){
        // String -> int: Forzado -> parseo Integer.parseInt("sdfghjkl")
        // int -> double: Natural -> casting (double) variable


    }




}
