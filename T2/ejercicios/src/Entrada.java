import java.util.Scanner;

public class Entrada {

    static Scanner lectorTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        ejercicio6();
    }

    public static void ejercicio1(){

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
        System.out.printf("%s \tnº%d\t\t %d%c\n",DIRECCION,PORTAL,PISO,LETRA);
        System.out.printf("%d,\t\t\t%s %s\n",CODIGO, POBLACION, PROVINCIA);
        System.out.println(PAIS);

    }

    public static void ejercicio2(){
        System.out.println("Por favor introduce tu nombre completo");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Por favor introduce tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Te llamas "+nombre);
        System.out.printf("Tienes %d años\n",edad);
    }

    public static void ejercicio3(){
        System.out.println("Por favor introduce el primer operando");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Por favor introduce el segundo operando");
        int operando2 = lectorTeclado.nextInt();
        int suma = operando1+operando2;
        int resta = operando1-operando2;
        int multi = operando1*operando2;
        int divInt = operando1/operando2;
        float divReal = (float) operando1/operando2;
        int modul = operando1%operando2;
        float modulReal = (float)operando1%operando2;

        System.out.printf("El resultado de sumar %d y %d es %d\n",operando1,operando2,suma);
        System.out.printf("El resultado de resta %d y %d es %d\n",operando1,operando2,resta);
        System.out.printf("El resultado de multi %d y %d es %d\n",operando1,operando2,multi);
        System.out.printf("El resultado de divInt %d y %d es %d\n",operando1,operando2,divInt);
        System.out.printf("El resultado de divReal %d y %d es %f\n",operando1,operando2,divReal);
        System.out.printf("El resultado de mod %d y %d es %d\n",operando1,operando2,modul);
        System.out.printf("El resultado de modReal %d y %d es %f\n",operando1,operando2,modulReal);

    }

    public static void ejercicio4(){
        System.out.println("Por favor dime cuantos bocatas quieres");
        int nBocadillos = lectorTeclado.nextInt();
        System.out.println("Por favor dime cuantas bebidas quieres");
        int nBebidas = lectorTeclado.nextInt();
        System.out.println("Cuanto vas a pagar por los bocatas");
        float precioBocata = lectorTeclado.nextFloat();
        System.out.println("Cuanto vas a pagar por los bebidas");
        float precioBebidas = lectorTeclado.nextFloat();
        float total = (nBocadillos*precioBocata)+(nBebidas*precioBebidas);
        System.out.println("Coste total "+total);
    }
    public static void ejercicio5(){
        // resuelvo el ejercicio1
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor dime cuantos segundos quieres pasar");
        int segundosTotales = lectorTeclado.nextInt();
        int horas = segundosTotales/3600;
        segundosTotales = segundosTotales%3600;
        int minutos = segundosTotales/60;
        //System.out.println("segundo restantes: "+segundosTotales);
        segundosTotales = segundosTotales%60;
        System.out.println("horas: "+horas);
        System.out.println("minutos: "+minutos);
        System.out.println("segundos: "+segundosTotales);

    }
    public static void ejercicio6(){
        System.out.println("Cuanto te ha costado el articulo");
        float precioArticulo = lectorTeclado.nextFloat();
        System.out.println("Cuanto IVA has pagado");
        int iva = lectorTeclado.nextInt();
        // 400 -> 400 - (400*21%)
        float ivaPagado = precioArticulo * ((float) iva/100);
        float precioNeto = precioArticulo - ivaPagado;
        System.out.println("IVA: "+ivaPagado);
        System.out.println("Producto sin IVA: "+precioNeto);
    }
}
