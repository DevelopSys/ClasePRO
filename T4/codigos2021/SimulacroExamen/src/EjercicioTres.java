import java.util.Scanner;

public class EjercicioTres {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Object[][] taller = new Object[10][3]; // cada fila tiene valores null
        int coches = 0;
        int opcion = 0;
        // cada fila es un coche -- array > objeto
        // cada columna de cada fila es una característica o atributo

        do {

            System.out.println("1. Registrar coche");
            System.out.println("2. Listar");
            System.out.println("3. Busca coche");
            System.out.println("4. Arreglos totales");
            System.out.println("5. Salir");
            System.out.println("Opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    if (coches == taller.length) {
                        System.out.println("Taller lleno");
                    } else {

                        taller[coches] = new EjercicioTres().registrarCoche();
                        coches++;

                        /*System.out.println("Cual es el modelo?");
                        String modelo = teclado.next();
                        System.out.println("Cuales son sus CV?");
                        int cv = teclado.nextInt();
                        System.out.println("Cuando vale arreglarlo?");
                        double arreglo = teclado.nextDouble();
                        taller[coches][0] = modelo;
                        taller[coches][1] = cv;
                        taller[coches][2] = arreglo;
                        coches++;*/
                    }
                    break;

                case 2:

                    if (coches != 0) {

                        for (int i = 0; i < taller.length; i++) {

                            if (taller[i][0]!=null){
                                for (int j = 0; j < taller[i].length; j++) {
                                    System.out.println(taller[i][j]);
                                }
                            }

                        }

                        /*for (Object[] cocheFila : taller) {
                            //System.out.println("Evaluando coche");
                            //System.out.println(cocheFila);
                            if (cocheFila[0] != null) {
                                System.out.println("Evaluando coche");
                                for (Object item : cocheFila) {
                                    System.out.println(item);
                                }
                            }
                        }*/
                    }

                    break;
                case 3:
                    if (coches > 0) {
                        System.out.println("Que modelo quieres buscar");
                        String modelo = teclado.next();

                        for (int i = 0; i < taller.length ; i++) {

                            // las filas taller[i]
                            if (taller[i][0] != null){
                                if (taller[i][0].toString().equals(modelo)){
                                    for (int j = 0; j < taller[i].length; j++) {
                                      // recorre caracteristicas
                                        System.out.println(taller[i][j]);
                                    }
                                }
                            }

                        }

                        /*for ( Object[] cocheFila : taller ) {
                            if (cocheFila[0]!=null) {
                                if (cocheFila[0].toString().equals(modelo)) {
                                    for (Object item : cocheFila) {
                                        System.out.println("El dato del coche es: " + item);
                                    }
                                }
                            }
                        }*/
                    }
                    break;
                case 4:
                    double contadorArreglos = 0.0;
                    for (int i = 0; i < taller.length ; i++) {

                        if (taller[i][0] != null){
                            double arreglo = (double) taller[i][2];
                            contadorArreglos = contadorArreglos +arreglo;
                        }
                    }
                    System.out.println("El total de arreglos es: "+contadorArreglos);

                    break;
            }


        } while (opcion != 5);

    }

    public Object[] registrarCoche(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Modelo");
        String modelo = teclado.next();
        System.out.println("CV");
        int cv = teclado.nextInt();
        System.out.println("Arreglo");
        double arreglos = teclado.nextDouble();
        Object[] coche = new Object[3];
        coche[0] = modelo;
        coche[1] = cv;
        coche[2] = arreglos;

        return coche;
    }
}
