import java.util.Scanner;

public class Ejercicios {
    Scanner lectorTeclado; // null

    // nombre completo, dirección de casa (solo calle), número del portal,
    // piso, letra del piso, código postal, localidad, provincia y paí
    public void ejercicio1() {
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
        System.out.printf("%s, %s %d\n", DIRECCION, NUMERO_PORTAL, PISO);
        System.out.printf("%d %s %s\n", COD_POSTAL, LOCALIDAD, PROVINCIA);
        System.out.println(PAIS);
    }

    public void ejercicio2() {
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
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Conducir: " + carnet);
        System.out.printf("Puedo conducir: %b", carnet);
        lectorTeclado.close();
    }

    public void ejercicio3() {
        // Hágase un programa que lea dos variables enteras
        // y obtenga las siguientes operaciones:
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el primer numero de las operaciones");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Indica el segundo numero de las operaciones");
        int operando2 = lectorTeclado.nextInt();

        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multi = operando1 * operando2;
        double div = operando1 / operando2;
        double divReal = (double) operando1 / operando2;
        int modulo = operando1 % operando2;

        System.out.println("La suma de los operandos es " + (operando1 + operando2));
        System.out.println("La resta de los operandos es " + (operando1 - operando2));
        System.out.println("La multi de los operandos es " + multi);
        System.out.println("La div de los operandos es " + div);
        System.out.println("La div real de los operandos es " + divReal);
        System.out.println("La modulo de los operandos es " + modulo);
    }

    public void calcularaMenu() {
        // Hágase un programa que lea dos variables enteras
        // y obtenga las siguientes operaciones:
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el primer numero de las operaciones");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Indica el segundo numero de las operaciones");
        int operando2 = lectorTeclado.nextInt();

        if (operando1 < 0 || operando2 < 0) {
            System.out.println("Operandos no validos");
        } else {
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multi");
            System.out.println("4- Divi");
            System.out.println("5- Divi Real");
            System.out.println("6- Modulo");
            System.out.println("7- Salir");
            System.out.println("Por favor introduce la opcion a realizar");
            int opcion = lectorTeclado.nextInt();
            double resultado = 0.0;
            switch (opcion) {
                case 1:
                    resultado = operando1 + operando2;
                    break;
                case 2:
                    resultado = operando1 - operando2;
                    break;
                case 3:
                    resultado = operando1 * operando2;
                    break;
                case 4:
                    if (operando2 == 0) {
                        System.out.println("no se puede dividir");
                    } else {
                        resultado = operando1 / operando2;
                    }
                    break;
                case 5:
                    if (operando2 != 0) {
                        resultado = (double) operando1 / operando2;

                    } else {
                        System.out.println("no se puede dividir");
                    }
                    break;
                case 6:
                    resultado = operando1 % operando2;

                    break;
                case 7:
                    System.out.println("Seleccionado salir");
                    break;
                default:
                    System.out.println("Opcion no contemplada");
                    break;
            }
            if (opcion == 5) {
                System.out.printf("El resultado de la operacion seleccionada es: %.2f\n",resultado);
            } else {
                System.out.println("El resultado de la operacion seleccionada es: " + (int) resultado);
            }
        }


    }

    // modificado con ejercicio 9
    public void ejercicio4() {
        lectorTeclado = new Scanner(System.in);
        final double PRECIO_BOCATA = 2.05;
        final double PRECIO_BEBIDA = 1.25;
        System.out.println("Cuantas bebidas quereis");
        int numeroBebidas = lectorTeclado.nextInt();
        System.out.println("Cuantos bocatas quereis");
        int numeroBocatas = lectorTeclado.nextInt();
        System.out.println("Indica cuantos comensales sois");
        int comensales = lectorTeclado.nextInt();

        double precioTotalBocatas = numeroBocatas * PRECIO_BOCATA;
        double precioTotalBebidas = numeroBebidas * PRECIO_BEBIDA;
        double precioTotal = precioTotalBocatas + precioTotalBebidas;

        /*
        System.out.println("Los bocatas han costado " + precioTotalBocatas);
        System.out.println("Los bebidas han costado " + precioTotalBebidas);
        System.out.println("La cuenta total es " + precioTotal);
        */

        System.out.println("ARTICULO\t\t\t\t\t\tCANTIDAD\t\t\t\t\t\tPRECIO\t\t\t\t\t\tCOSTE");
        System.out.println("========\t\t\t\t\t\t========\t\t\t\t\t\t=======\t\t\t\t\t\t=====");
        System.out.printf("Bebidas  \t\t\t\t\t\t      %d\t\t\t\t\t\t    %.2f\t\t\t\t\t\t   %.2f%n", numeroBebidas, PRECIO_BEBIDA, precioTotalBebidas);
        System.out.printf("Bocatas  \t\t\t\t\t\t      %d\t\t\t\t\t\t    %.2f\t\t\t\t\t\t   %.2f%n", numeroBocatas, PRECIO_BOCATA, precioTotalBocatas);
        System.out.println("        \t\t\t\t\t\t        \t\t\t\t\t\t      \t\t\t\t\t\t=====");
        System.out.printf("TOTAL    \t\t\t\t\t\t        \t\t\t\t\t\t     \t\t\t\t\t\t%.2f%n", precioTotal);
        System.out.printf("TOTAL P.P \t\t\t\t\t\t        \t\t\t\t\t\t      \t\t\t\t\t\t%.2f%n", precioTotal / comensales);

        lectorTeclado.close();

    }

    public void ejercicio5() {
        // leido por scanner
        int segundosTotales = 24970;

        int horas = segundosTotales / 3600;
        int restoHoras = segundosTotales % 3600;
        int miutos = restoHoras / 60;
        int segundos = restoHoras % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + miutos);
        System.out.println("Segundos: " + segundos);

    }

    public void ejercicio6() {
        // Valor de la compra (entre 0.00 y 500.00):**298,45**
        // IVA (entre 0 y 25%):**12**
        lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor, cuanto te has gastando (CON IVA)");
        double precioArticulo = lectorTeclado.nextDouble(); // 376.65
        System.out.println("Que IVA tiene el producto");
        double iva = lectorTeclado.nextDouble() / 100;
        double precioIVA = precioArticulo * iva;
        double precioLibre = precioArticulo - precioIVA;
        System.out.println("Te han cobrado de IVA " + iva);
        System.out.println("El precio sin impuesto " + precioLibre);
        System.out.println("Has pagado un total de " + precioArticulo);

    }

    public void ejercicio7() {
        lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor dime el radio de la circunferencia");
        double radio = lectorTeclado.nextDouble();

        // 2*PI*r
        double longitud = 2 * Math.PI * radio;
        // PI*radio2
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area de la circuferencia es: %.3f\n", area);
        System.out.printf("La longitud de la circuferencia es: %.2f\n", longitud);

    }

    public void ejercicio8() {
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica que grados centigrados quieres calcular");
        double gradosC = lectorTeclado.nextDouble();
        double gradosf = ((9 * gradosC) / 5) + 5;
        double gradosk = 273.15 + gradosC;
        System.out.printf("Los grados %.2fC son %.2fK y %.2fK\n", gradosC, gradosk, gradosf);

        System.out.println("Indica que grados kelvin quieres calcular");

        gradosk = lectorTeclado.nextDouble();
        gradosC = gradosk - 273.15;
        gradosf = (9 * (gradosk - 273 - 15) / 5) + 32;
        System.out.printf("Los grados %.2fK son %.2fC y %.2fF\n", gradosk, gradosC, gradosf);


        System.out.println("Indica que grados farenheit quieres calcular");

        gradosf = lectorTeclado.nextDouble();
        gradosk = ((5 * (gradosf - 32)) / 9) + 273.15;
        gradosC = (5 * (gradosf - 32)) / 9;

        System.out.printf("Los grados %.2fF son %.2fK y %.2fC\n", gradosf, gradosk, gradosC);
        lectorTeclado.close();
    }

    public void ejercicio10() {
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica un numero de 5 digitos");
        int numero = lectorTeclado.nextInt();
        System.out.println("El numero a analizar es " + numero);
        // 12345
        int unidades = numero % 10;
        int decenas = (numero / 10) % 10;
        int centenas = (numero / 100) % 10;
        int millares = (numero / 1000) % 10;
        int dMillares = numero / 10000;
        System.out.println("Decenas de M " + numero / 10000);
        System.out.println("Millares " + (numero / 1000) % 10);
        System.out.println("Centenas " + (numero / 100) % 10);
        System.out.println("Decenas " + (numero / 10) % 10);
        System.out.println("Unidades " + numero % 10);
        lectorTeclado.close();
    }

    public void ejercicio11() {
        lectorTeclado = new Scanner(System.in);
        System.out.println("Lee el primer numero");
        int numero1 = lectorTeclado.nextInt();


        boolean comprobacion1 = numero1 % 2 == 0;
        boolean comprobacion2 = numero1 > 50;

        System.out.println("La primera comprobacion da como resultado " + comprobacion1);
        System.out.println("La segundo comprobacion da como resultado " + comprobacion2);
        lectorTeclado.close();
    }

    public void ejercicio12() {
        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica la primera palabra");
        String palabra1 = lectorTeclado.next();
        System.out.println("Indica la segunda palabra");
        String palabra2 = lectorTeclado.next();

        boolean iguales = palabra1.equals(palabra2);
        boolean primeraMenor = palabra1.length() < palabra2.length();
        boolean diferentes = !palabra1.equals(palabra2);

        System.out.println("Las palabra son iguales " + iguales);
        System.out.println("La primera es menor que la segunda" + primeraMenor);
        System.out.println("Son diferentes" + !iguales);
    }

    public void metodosPalabras() {
        String palabra = "Hola que tal estas yo muy bien";
        // tamaño de la palabra (numero de caracteres)
        System.out.println(palabra.length());
        System.out.println("Son iguales " + palabra.equalsIgnoreCase("Hola que tal"));
        System.out.println("Son iguales " + palabra.toLowerCase().equals("hola que tal"));
        System.out.println("Son iguales " + palabra.toUpperCase().equals("HOLA QUE TAL"));
        int numeroLetras = palabra.replaceAll(" ", "").length(); //Holaquetal
        System.out.println("El numero de letras es " + numeroLetras);
        String[] palabras = palabra.split(" ");
        System.out.println("El numero de palabras es " + palabras.length);
        // si contiene algo
        boolean contieneA = palabra.contains("A");
        // obtener una letra concreta
        //  Hola que tal estas yo muy bien
        char letra = palabra.charAt(palabra.length() - 1);
        System.out.println(letra);

    }
}
