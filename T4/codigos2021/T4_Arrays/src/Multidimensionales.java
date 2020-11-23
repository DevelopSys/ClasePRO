public class Multidimensionales {

    public static void main(String[] args) {
        String[] unidimensional= {"hola","que","tal"};
        String[][]multidimensionalPalabras = {
                {"hola","adios"},{"que ","tal"}, {"asd","asd"}
        };
        int[][] multidimensionalNumeros = {{1,2,3,213},{7,8,234,234,9,10}};
        boolean[][] multidimensionalBool = {{false,true,false},{false,false,false}};
        // sacar el número de filas;
        System.out.println("El número de filas es: "+multidimensionalPalabras.length);
        // acceder a elementos;
        System.out.println(multidimensionalPalabras[0][0]);

        /*for (int i = 0; i < multidimensionalPalabras.length; i++) {
            // saca el elemento de la posicion
            for (int j = 0; j < multidimensionalPalabras[i].length; j++) {
                System.out.println(multidimensionalPalabras[i][j]);
            }
        }*/

        /*for (String[] fila:multidimensionalPalabras) {

            for (String palabra:fila) {
                System.out.printf("%s ",palabra);
            }
            System.out.println();
        }*/

        // sacar el sumatorio de todos los números del array multidimensional
        /*int sumatorio = 0;
        for (int[] fila:multidimensionalNumeros) {
            for (int numero:fila) {
                System.out.printf("%d ",numero);
                sumatorio += numero;
            }
            System.out.println();
        }
        System.out.println(sumatorio);*/

        Object[][] elementos = {{1,"asdasd",true},{false,1,0.0},{9.5,false,true}};
        for (Object[] fila :elementos) {
            System.out.println("Evaluando el elemento "+fila);
            for (Object elemento:fila) {
                if (elemento instanceof String){
                    //String.valueOf(elemento);
                    System.out.println("Soy una palabra "+elemento.toString());
                } else if (elemento instanceof Integer || elemento instanceof Double){
                    int numero = (int)elemento;
                    System.out.println("Soy un numero "+numero);
                } else if (elemento instanceof Boolean){
                    boolean acierto = (boolean) elemento;
                    System.out.println("Soy un booleano "+acierto);
                };
            }
            System.out.println();
        }
        //Object[][] elementosOrdenados = {{1,"asdasd",0.5},{1,"1",0.0},{5,"false",8.9}};
        //(double)elementosOrdenados[0][2];


    }
}
