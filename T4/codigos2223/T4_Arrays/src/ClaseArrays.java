import java.util.Scanner;

public class ClaseArrays {

    public static void main(String[] args) {

        //creacionArrays();
        //accesoArrays();
        //accesoArraysPalabras();
        //ejercicio1Arrays();
        //ejercicio2Arrays();
        //modificarArrays();
        //ejercicio3Arrays();
        //busquedaArray();
        //ejercicio4Arrays();
        ejercicio5Arrays();

    }

    private static void creacionArrays() {

        //arrays de numeros
        int[] numeros = new int[10];
        // 0 0 0 0 0 0 0 0 0 0
        int[] numerosIniciados = new int[]{1,2,3,4,5,6};
        // 1 2 3 4 5 6

        //arrays de booleanos
        boolean[] booleanos = new boolean[5];
        // false false false false false
        boolean[] booleanosIniciados = new boolean[]{true,false,true};
        // false true false

        //arrays de palabras
        String[] palabras = new String[5];
        // null null null null null
        String[] palabrasIniciadas = new String[]{"uno","dos","tres"};
        // "uno" "dos" "tres"

        Object elementosGenericos = new Object[]{1,false,"palabra",5.5,'U'};

    }

    private static void accesoArrays() {

        int[] numeros = new int[]{1,2,8,4,6,54,82,4,7};

        for (int i=0;i<numeros.length;i++){
            System.out.println(""+numeros[i]);
        }

    }

    private static void accesoArraysPalabras() {

        String[] palabras = new String[]{"Palabra 1", "Palabra 2", "Palabra 3"};


        /*for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }*/

        for (String palabra :palabras){
            System.out.println(palabra.length());
        }
    }


    /* 1º: Crea un arrays de 10 numeros, sacar la media de los numeros, el numero más grande, el más pequeño y el sumatorio
    *  2º: Crea un arrays con las letras del abecedario, sacar 5 palabras con 5 letras aleatorias
    *       palabra 1 ; FKLJA
    * */

    private static void ejercicio1Arrays() {

        int[] listaNumeros = new int[]{11,7,92,18,24,53,61,34,82,73};
        int suma=0, numMax=0, numMin=1000, media;

        for (int numero : listaNumeros){

            suma += numero;

            if (numMax<numero){
                numMax=numero;
            } else if (numMin>numero){
                numMin=numero;
            }

        }

        media = suma/listaNumeros.length;
        System.out.println("El número más grande es: "+numMax);
        System.out.println("El número más pequeño es: "+numMin);
        System.out.println("El sumatorio es: "+suma);
        System.out.println("La media es: "+media);

    }

    private static void ejercicio2Arrays() {

        char[] listaLetras = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        for (int i = 0; i < 10; i++){

            int genRan1 = (int)(Math.random()*27);
            int genRan2 = (int)(Math.random()*27);
            int genRan3 = (int)(Math.random()*27);
            int genRan4 = (int)(Math.random()*27);
            int genRan5 = (int)(Math.random()*27);

            System.out.println("Palabra "+(i+1)+": "+listaLetras[genRan1]+listaLetras[genRan2]+listaLetras[genRan3]+listaLetras[genRan4]+listaLetras[genRan5]);

        }

    }

    private static void modificarArrays() {

        int[] listaNumeros = new int[10];
        listaNumeros[9]=10;
        listaNumeros[0]=1;
        listaNumeros[4]=7;
        listaNumeros[7]=4;
        listaNumeros[listaNumeros.length/2]=5;

        for (int numero :
                listaNumeros) {
            System.out.println(numero);
        }

    }

    /*
    Crear una app que me pida cuantos nº quiero introducir, introducirlos
    , sacar por consola los numeros introducidos

    "¿cuantos numeros?" = 7, introduce 7 numeros*/

    private static void ejercicio3Arrays() {

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.printf("¿Cuantos números quieres introducir?: ");
        int numeroLongList = lectorTeclado.nextInt(), x=0;
        int[] listaNumeros = new int[numeroLongList];

        for (int i = 0; i < listaNumeros.length; i++) {

            x++;
            System.out.printf("Introduzca el %d numero: ", x);
            int numeroLeido = lectorTeclado.nextInt();
            listaNumeros[i]=numeroLeido;

        }

        for (int numero :
                listaNumeros) {
            System.out.printf("%d, ",numero);
        }


    }

    //buscar la palabra que tiene 2 letras
    //cuando se encuentre, no se siugue buscando y que me diga la posicion de la palabra en el array

    private static void busquedaArray() {

        String[] palabras = new String[]{"hola","adios","arrays","estoy","en","clase","haciendo","la"};
        int cont = 0,contPos = 0;

        for (String item :
                palabras) {
            if (item.length()==2){
                cont++;
                System.out.println(item);
                contPos++;
                break;
            }
            contPos++;
        }
        System.out.println("El número de palabras es: "+cont);
        System.out.println("El número está en la posición: "+contPos);

    }

    /*
    realiza una app que simule el funcionamiendo de la primitiva
    el usuario dice 5 numeros [2,4,63,33,15] --> entre 0-99
    si no esta en rango volver a pedir
    el sistema genera 5 numeros
    el sistema evalua el premio:
    -1 acierto ->10€
    -2 acierto ->100€
    -3 acierto ->1000€
    -4 acierto ->10000€
    -5 acierto ->100000€
    enhorabuena has acertado x y has ganado x
    */

    private static void ejercicio4Arrays() {

        Scanner lectorTeclado = new Scanner(System.in);
        int[]listaNumeros = new int[5];
        int[]listaGenerados = new int[5];
        int numero, x=0, cont=0, cont2=0, aciertos=0, premio=10;

        System.out.printf("Introduce 5 numeros para jugar: %n");

        for (int i = 0; i < 5; i++) {

            System.out.printf("Introduce el numero %d: ",(i+1));
            numero = lectorTeclado.nextInt();
            listaNumeros[i] = numero;

            if (numero<0 || numero>99){
                i--;
                System.out.println("Número incorrecto, introduzca otro");
            }

        }

        System.out.println("Tu boleto: ");
        for (int num :
                listaNumeros) {
            cont++;
            System.out.println(cont+": "+num);
        }

        for (int j = 0; j < 5; j++) {

            int numGenerado = (int)(Math.random()*100);
            listaGenerados[j] = numGenerado;
        }

        System.out.println("El boleto del sistema: ");
        for (int num2 :
                listaGenerados) {
            cont2++;
            System.out.println(cont2+": "+num2);
        }

        for (int k = 0; k < 5; k++) {

            if (listaGenerados[k]==listaNumeros[k]){
                aciertos++;
            }

        }

        switch (aciertos){

            case 0:
                premio=0;
                break;
            case 1:
                premio=10;
                break;
            case 2:
                premio=100;
                break;
            case 3:
                premio=1000;
                break;
            case 4:
                premio=10000;
                break;
            case 5:
                premio=100000;
                break;

        }

        System.out.printf("Has tenido %d aciertos y has ganado %d€", aciertos, premio);

    }

    private static void ejercicio5Arrays() {

        String[] bombo1 = {"Napoles","Oporto","B.Munich","Tottenham","Chelsea","R.Madrid", "M. City", "Benfica"};
        String[] bombo2 = {"Liverpool","Brujas","Inter","Entracht F.","AC. Milan","RB. Leipzig", "B. Dortmund","PSG"};

        boolean[] checkPos1 = new boolean[8];
        boolean[] checkPos2 = new boolean[8];

        int numGenerado1,numGenerado2,contador=0;

        for (int i = 0; i < 8; i++) {

            do {

                numGenerado1 = (int)(Math.random()*8);
                numGenerado2 = (int)(Math.random()*8);

                if (!checkPos1[numGenerado1] && !checkPos2[numGenerado2]){
                    contador++;
                }

            } while (contador==0);

            contador--;
            checkPos1[numGenerado1]=true;
            checkPos2[numGenerado2]=true;
            System.out.println("Cruce "+(i+1)+": "+bombo1[numGenerado1]+" vs "+bombo2[numGenerado2]);

        }
    }
}
