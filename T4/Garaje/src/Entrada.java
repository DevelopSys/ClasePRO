public class Entrada {

    public static void main(String[] args) {
        Object[][] garaje = new Object[5][6];

        garaje[0] = new Object[]{"1234A", "Ford", "Fiesta", 90, 10.0, "motor"};
        garaje[1] = new Object[]{"1234B", "Seat", "Ibiza", 150, 50.0, "aceite"};
        garaje[2] = new Object[]{"1234C", "Seat", "Leon", 90, 00.0, "aceite"};
        garaje[3] = new Object[]{"1234D", "VW", "Tiguan", 150, 00.0, "motor"};
        garaje[4] = new Object[]{"1234E", "Opel", "Astra", 75, 00.0, "motor"};


        // aquellos coches con averia de aceite
        // cv > 100 -> sumar 100 averia
        // cv <= 100 -> sumar 50 averia


        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i][5].equals("aceite")) {
                if ((int) garaje[i][3] > 100) {
                    // sumar 100 averias
                    garaje[i][4] = (double) garaje[i][4] + 100;
                } else {
                    // sumar 50 averias
                    garaje[i][4] = (double) garaje[i][4] + 50;
                }
            }
        }

        for (Object[] coche : garaje) {
            for (Object dato : coche) {
                System.out.print(dato + " ");
            }
            System.out.println();
        }


        // obtener los datos de los coches con averia "motor"

        /*for (Object[] coche: garaje) {
            if ((coche[5]).equals("motor")){
                for (Object dato : coche) {
                    System.out.print(dato+" ");
                }
                System.out.println();
            }
        }

         */

        /*
        double acumulado = 0.0;
        for (Object[] coche : garaje) {
            if (coche[0] != null) {
                acumulado +=  (double)coche[4];
                for (Object dato : coche) {
                    System.out.print(dato + " ");

                }
                System.out.println();
            }
        }
        System.out.println("Las averias acumuladas son: "+acumulado);
        */
        // obtener la suma de averias acumuladas

    }
}
