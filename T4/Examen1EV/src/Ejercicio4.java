public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] jornadas = new int[][]{
                {3, 5, 1, 6, 2},
                {1, 4, 2, 3, 3},
                {2, 1, 1, 2, 1},
                {5, 2, 0, 2, 2,}};
        String[] equipos = new String[]{"Barsa", "Madrid", "Atleti", "Betis"};

        // Goles total equipo
        // Goles media equipo
        for (int i = 0; i < equipos.length; i++) {
            int totalGoles = 0;
            for (int j = 0; j < jornadas.length; j++) {
                totalGoles += jornadas[i][j];
            }
            System.out.println("Total goles " + equipos[i] + " tiene un total del goles de " + totalGoles);
            System.out.println("La media es de " + totalGoles / jornadas.length);

        }


        for (int i = 0; i < jornadas.length; i++) {
            int totalGoles = 0;
            for (int j = 0; j < equipos.length; j++) {
                totalGoles += jornadas[i][j];
            }
            System.out.println("Total goles de la jornada "+totalGoles+" es de "+totalGoles);
            System.out.println("La media es de " + totalGoles / equipos.length);

        }

        // Goles total joranada
        // Goles media jornada

    }
}
