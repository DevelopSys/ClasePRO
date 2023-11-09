package array;

public class EjercicioChampion {

    public static void main(String[] args) {
        String[] bombo1 = new String[]{"Equipo1","Equipo2","Equipo3","Equipo4","Equipo5"};
        String[] bombo2 = new String[]{"Equipo6","Equipo7","Equipo8","Equipo9","Equipo10"};
        int[] numerosSalidos = new int[10];
        // -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
        // 0-4
        for (int i = 0; i < bombo1.length; i++) {
            int aleatorio1, aleatorio2;
            do{
                aleatorio1 = (int) (Math.random()*5);
            }while (bombo1[aleatorio1]==null);
            do{
                aleatorio2 = (int) (Math.random()*5);
            }while (bombo2[aleatorio2]==null);

            String equipo1 = bombo1[aleatorio1];
            String equipo2 = bombo2[aleatorio2];
            System.out.println(equipo1 + " vs " +equipo2);

            bombo1[aleatorio1] = null;
            bombo1[aleatorio2] = null;

        }


    }
}
