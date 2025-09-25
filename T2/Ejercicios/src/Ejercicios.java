import java.util.Scanner;

public class Ejercicios {
    Scanner lectorTeclado; // null
    // nombre completo, dirección de casa (solo calle), número del portal,
    // piso, letra del piso, código postal, localidad, provincia y paí
    public void ejercicio1(){
        System.out.println("Ejercicio 1");
        final String NOMBRE_COMPLETO = "Borja Martin Herrera";
        final String DIRECCION = "C/Estocolmo";
        final String NUMERO_PORTAL = "1A";
        final int PISO = 1;
        final int COD_POSTAL = 28925;
        final String LOCALIDAD = "ALCORCON";
        final String PROVINCIA = "MADRID";
        final String PAIS = "ESPAÑA";
        // hacemos el ejercicio 1
        /*
        Luis González Sanz
        C/ Maria de Molina nº 51, 1A
        91023 Madrid
        España
        */
        System.out.println(NOMBRE_COMPLETO);
        System.out.printf("%s, %s %d\n",DIRECCION,NUMERO_PORTAL,PISO);
        System.out.printf("%d %s %s\n",COD_POSTAL,LOCALIDAD,PROVINCIA);
        System.out.println(PAIS);
    }
    public void ejercicio2(){
        lectorTeclado = new Scanner(System.in);
        System.out.println("Ejercicio 2");
        System.out.println("Indica tu nombre");
        String nombre = lectorTeclado.next();
        System.out.println("Indica tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Indica tu altura");
        double altura = lectorTeclado.nextDouble();
        System.out.println("Indica si tienes carnet");
        boolean carnet = lectorTeclado.nextBoolean();
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Conducir: "+carnet);
        System.out.printf("Puedo conducir: %b",carnet);
        lectorTeclado.close();
    }
}
