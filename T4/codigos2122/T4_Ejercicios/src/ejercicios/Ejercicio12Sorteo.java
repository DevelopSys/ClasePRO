package ejercicios;

public class Ejercicio12Sorteo {

    public static void main(String[] args) {
        String[] bomboUno = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bomboDos = {"Real Madrid", "Tottenham", "Nápoles", "B. Dortmund", "O. Lyon", "Chelsea", "Atalanta", "Atético de Madrid"};

        String[] equiposSalidosB1 = new String[bomboUno.length];
        String[] equiposSalidosB2 = new String[bomboDos.length];

        for (int i = 0; i < bomboDos.length; i++) {
            int aleatorioUno = (int) (Math.random()*bomboUno.length);
            int aleatorioDos = (int) (Math.random()*bomboUno.length);
            String equipoGenerado1 = bomboUno[aleatorioUno];
            String equipoGenerado2 = bomboDos[aleatorioDos];

            for (int x =0;x<equiposSalidosB1.length;x++){
                if (equipoGenerado1.equalsIgnoreCase(equiposSalidosB1[i])){
                    aleatorioUno = (int) (Math.random()*bomboUno.length);
                }
            }




            //System.out.println(bomboUno[aleatorioUno] + "-" + bomboDos[aleatorioDos]);
        }


    }

}
