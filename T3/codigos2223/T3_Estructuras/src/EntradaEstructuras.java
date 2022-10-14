import java.util.Scanner;

public class EntradaEstructuras {

    public static void main(String[] args) {

        //estructuraIF();
        //calcularNota();
        //calculoIMC();
        //estrucuturaSwitch();
        //ejercicioMenu();
        estructuraFor();

    }

    private static void estructuraFor() {
        for (int i=0;i<5;i++){
            System.out.println("Incremental");
            System.out.println("Ejecucion "+i);

            for (int x = 10; x < 0; x--) {
                System.out.println("Decremental");
            }

        }


    }

    private static void ejercicioMenu() {
        Scanner lecturaTeclado = new Scanner(System.in);
        int opcion, opcionSubmenu;
        System.out.println("1. Menu1\n2. Menu2\n3. Menu3\n4. Menu4");
        System.out.println("Que opcion quieres ejecutar");
        opcion = lecturaTeclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Imprimiendo menu 1");
                System.out.println("1.1 Submenu\n1.2 Submenu\n1.3 Submenu");
                opcionSubmenu = lecturaTeclado.nextInt();
                switch (opcionSubmenu){
                    case 1:
                        System.out.println("imprimiendo submenu 1.1");
                        break;
                    case 2:
                        System.out.println("imprimiendo submenu 1.2");
                        break;
                    case 3:
                        System.out.println("imprimiendo submenu 1.3");
                        break;
                }
                break;
            case 2:
                System.out.println("Imprimiendo menu 2");
                 break;
            case 3:
                System.out.println("Imprimiendo menu 3");
                break;
            case 4:
                System.out.println("Imprimiendo menu 4");
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
    }

    private static void estrucuturaSwitch() {

        int numero = 4;

        switch (numero) {
            case 1:
                // si numero = 1
                int variableCase = 10;
                System.out.println("El numero tiene un valor de 1");
                System.out.println(variableCase);
                break;
            case 2:
                System.out.println("El numero tiene un valor de 2");
                break;
            case 7:
                System.out.println("El numero tiene un valor de 7");
                break;

            default:
                System.out.println("Caso no contemplado");

        }

        // MODIFICA EL EJERCICIO DEL IMC Y UTILIZAR UN SWITCH

        // REALIZAR UN MENU POR CONSOLA

        /*
        * Que opcion quieres ejerucar: [1-4]
        * MENU OPCION 1
        *   que opcion del menu 1 quieres ejecutar
        *   opcion: [1-3]
        *   SUBMENU 1.1
        *   SUBMENU 1.2
        *   SUBMENU 1.3
        *   Opcion no reconocida
        * MENU OPCION 2
        * MENU OPCION 3
        * MENU OPCION 4
        * Opcion no reconocida
        * */

    }

    private static void calculoIMC() {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad, altura;
        double peso, IMC;
        String sexo;

        System.out.println("Por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Por favor introduce tu apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Por favor introduce tu edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        altura = lecturaTeclado.nextInt();

        System.out.println("Por favor introduce tu peso");
        peso = lecturaTeclado.nextDouble();
        System.out.println("Por favor introduce tu sexo (M/F)");
        sexo = lecturaTeclado.next();
        IMC = calculoIMC(peso, (double) altura / 100); // calcularIMC() -->  valor del retorno
        System.out.printf("Hola Borja tu IMC teniendo en cuenta tu altura de %dcm y tu peso de %.2fkg, tiene\n" +
                "un valor de %.2f%n", altura, peso, IMC);

        if (sexo.equals("M")) {
            // hombres
            /*
            18,5–24,9    Peso normal
            25.0–29.9    Pre-obesidad o Sobrepeso
            30.0–34.9    Obesidad clase I
            35,0–39,9    Obesidad clase II
            Por encima de 40    Obesidad clase III
            * */
            if (IMC < 18.50) {
                System.out.println("Por debajo de lo normal ");
            } else if (IMC < 25) {
                System.out.println("Peso normal ");
            } else if (IMC < 30) {
                System.out.println("Sobrepeso ");
            } else if (IMC < 35) {
                System.out.println("Obesidad clase I ");
            } else if (IMC < 40) {
                System.out.println("Obesidad clase II ");
            } else {
                System.out.println("Obesidad clase III ");
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            // mujeres
            if (IMC < 16.50) {
                System.out.println("Por debajo de lo normal ");
            } else if (IMC < 23) {
                System.out.println("Peso normal ");
            } else if (IMC < 26) {
                System.out.println("Sobrepeso ");
            } else if (IMC < 31) {
                System.out.println("Obesidad clase I ");
            } else if (IMC < 34) {
                System.out.println("Obesidad clase II ");
            } else {
                System.out.println("Obesidad clase III ");
            }
        } else {
            // sexo diferente
            System.out.println("Letra incorrecta");
        }


    }

    private static void calculoIMCSwitch() {

        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad, altura;
        double peso, IMC;
        String sexo;

        System.out.println("Por favor introduce tu nombre");
        nombre = lecturaTeclado.next();
        System.out.println("Por favor introduce tu apellido");
        apellido = lecturaTeclado.next();
        System.out.println("Por favor introduce tu edad");
        edad = lecturaTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        altura = lecturaTeclado.nextInt();

        System.out.println("Por favor introduce tu peso");
        peso = lecturaTeclado.nextDouble();
        System.out.println("Por favor introduce tu sexo (M/F)");
        sexo = lecturaTeclado.next();
        IMC = calculoIMC(peso, (double) altura / 100); // calcularIMC() -->  valor del retorno
        System.out.printf("Hola Borja tu IMC teniendo en cuenta tu altura de %dcm y tu peso de %.2fkg, tiene\n" +
                "un valor de %.2f%n", altura, peso, IMC);

        switch (sexo.charAt(0)){
            case 'M':
                if (IMC < 18.50) {
                    System.out.println("Por debajo de lo normal ");
                } else if (IMC < 25) {
                    System.out.println("Peso normal ");
                } else if (IMC < 30) {
                    System.out.println("Sobrepeso ");
                } else if (IMC < 35) {
                    System.out.println("Obesidad clase I ");
                }
                else if (IMC < 40) {
                    System.out.println("Obesidad clase II ");
                } else {
                    System.out.println("Obesidad clase III ");
                }
                break;
            case 'F':
                if (IMC < 16.50) {
                    System.out.println("Por debajo de lo normal ");
                } else if (IMC < 23) {
                    System.out.println("Peso normal ");
                } else if (IMC < 26) {
                    System.out.println("Sobrepeso ");
                } else if (IMC < 31) {
                    System.out.println("Obesidad clase I ");
                }
                else if (IMC < 34) {
                    System.out.println("Obesidad clase II ");
                } else {
                    System.out.println("Obesidad clase III ");
                }
                break;
            default:
                System.out.println("Letra incorrecta");

        }


    }

    public static double calculoIMC(double peso, double altura) {

        double IMC = peso / (altura * altura);
        //return IMC;
        //return peso / Math.pow(altura,2);
        return peso / (altura * altura);
    }


    public static void estructuraIF() {
        // IF

        int numeroUno = -1, numeroDos = 20;
        System.out.println("Ejecucion de un if simple");
        // que el numeroUno este entre 0 y 15 y que ademas el n2 sea par
        // [0-15]
        if (numeroUno >= 0 && numeroUno <= 15) {

            System.out.println("El número es positivo y por lo tanto ejecuto");
            // no es accesible desde fuera del bloque
            int numeroTres = 50;
            numeroUno++;
        } else {
            System.out.println("No se cumple la condición");
        }

        System.out.println("Continuacion del programa");
        System.out.println("El valor de numeroUno es: " + numeroUno);


        numeroUno = 22;
        numeroDos = 10;

        if (numeroUno > 10) {
            System.out.println("El numero es más grande que 10");
        } else if (numeroUno >= 0 && numeroUno <= 10) {
            System.out.println("El numero está entre 0 y 10");
        } else if (numeroUno < 0 && numeroUno > -10) {
            System.out.println("El numero es negativo");
        } else {
            // siempre el n será <-10
            System.out.println("El numero es un negativo grande");
        }

        // pedir por consola una nota
        // si la nota es valida = [0-10]
        // 0-4.99 --> examen suspenso
        // 5-6.99 --> examen aprobado
        // 7-8.99 --> examen notable
        // 9-9.99 --> examen sobresaliente
        // 10 --> examen de matricula
        // de no serlo avisa
    }

    public static void calcularNota() {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Que nota has sacado");
        double nota = lecturaTeclado.nextDouble();

        if (nota >= 0 && nota <= 10) {
            // 0-10
            if (nota < 5) {
                System.out.println("Examen suspenso");
            } else if (nota < 7) {
                System.out.println("Examen aprobado");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("MH");
            }
        } else {
            System.out.println("Nota no valida");
        }

    }

}


