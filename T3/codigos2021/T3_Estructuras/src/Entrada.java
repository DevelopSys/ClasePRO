public class Entrada {

    public static void main(String[] args) {

        System.out.println("Programa de estructuras de control");
        //new Entrada().estructuraIF();
        //new Entrada().estructraELSEIF();
        new Entrada().estructuraIFELSEIF();
    }

    public void estructuraIF(){
        /*
        linea 1
        linea 2
        if (condicion) {
            // ejecuciones
            linea 3
            linea 4
        }
        linea 5
         */
        int numero = 6;
        System.out.println("Ejecución por sentencia IF");
        if(numero>=0 && numero<=10){
            System.out.println("El número está entre 0 y 10");
        }
        if(numero<15){
            System.out.println("El numero es menor que 15");
        }
        System.out.println("Saliedo del IF");
    }
    public void estructraELSEIF(){
        /* linea 1
        * if (condicion){
        *   linea 2
        * } else {
        *   linea 3
        * }
        * linea 4
        * */
        int numero = -7;
        System.out.println("Ejecución por sentencia ELSE-IF");
        if (numero>=0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println("Saliendo de la estructura ELSE-IF");
    }
    public void estructuraIFELSEIF(){
        /*
           linea 1
        * if(condicion){
        *   linea 2
        * } else if(condicion){
        *   linea 3
        * } else if(condicion){
        *   linea 4
        * } else{
        *   linea 5
        * }
        *   linea 6
        * */

        int nota = 6;

        /*if (nota<5 && nota>0){
            System.out.println("Suspenso");
        } else if (nota>=5 && nota<6){
            System.out.println("Aprobado");
        } else if (nota>=6 && nota<9){
            System.out.println("Notable");
        } else if (nota>=9 && nota<10){
            System.out.println("Sobresaliente");
        } else if (nota ==10) {
            System.out.println("MH");
        } else {
            System.out.println("Numero incorrecto");
        }*/
        // -1 11
        if (nota<0 || nota >10){
            System.out.println("Incorrecto");
        } else { // 0-10
            if (nota<5){
                System.out.println("SS");
            } else if (nota>=5 && nota<6){

            } else if (nota>=6 && nota<9){

            } else if (nota>=9 && nota<10){

            } else {
                // 10
            }
        }

        System.out.println("Saliendo de estrucutra IFELSEIF");

    }
}
