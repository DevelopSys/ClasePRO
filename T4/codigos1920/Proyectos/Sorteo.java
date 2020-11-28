/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author borjamartin
 */
public class Sorteo {

    public static void main(String[] args) {

        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};

        int[] generadosBombo1 = {10, 10, 10, 10, 10, 10, 10, 10};
        int[] generadosBombo2 = {10, 10, 10, 10, 10, 10, 10, 10};

        for (int i = 0; i < bombo1.length; i++) {

            int aleatorio;

            do {
                aleatorio = generarAleatorio(8);
            } while (encontrarNumero(aleatorio, generadosBombo1));
            generadosBombo1[i] = aleatorio;
        }

        for (int i = 0; i < bombo2.length; i++) {

            int aleatorio;

            do {
                aleatorio = generarAleatorio(8);
            } while (encontrarNumero(aleatorio, generadosBombo2));
            generadosBombo2[i] = aleatorio;
        }

        listarArray(generadosBombo1, bombo1, generadosBombo2, bombo2);

    }

    public static boolean encontrarNumero(int n, int[] coleccion) {
        boolean encontrado = false;
        for (int x = 0; x < coleccion.length; x++) {
            if (coleccion[x] == n) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static void listarArray(int[] coleccion, String[] equipos1, int[] coleccion2, String[] equipos2) {

        for (int i = 0; i < coleccion.length; i++) {
            System.out.println(equipos1[coleccion[i]] + " - " + equipos2[coleccion2[i]]);

        }

    }

    public static int generarAleatorio(int longitud) {
        int aleatorio = (int) (Math.random() * (longitud));
        return aleatorio;
    }

}
