package ejercicios;

public class Ejercicio15 {

    public static void main(String[] args) {
        Object[][] alumnos = new Object[3][5];
        alumnos[0][0]="Borja";
        alumnos[0][1]=6;
        alumnos[0][2]=5;
        alumnos[0][3]=9;
        alumnos[0][4] = false;

        alumnos[1][0]="Pedro";
        alumnos[1][1]=4;
        alumnos[1][2]=7;
        alumnos[1][3]=9;
        alumnos[1][4] = true;

        alumnos[2][0]="Jose";
        alumnos[2][1]=7;
        alumnos[2][2]=1;
        alumnos[2][3]=2;
        alumnos[2][4] = true;


        // como se si en la primera fila hay alumnos regitrado??

        if (alumnos[0][0] != null){
            // nunca han metido alumnos en la primera posicion
        }


        for (int i = 0; i < alumnos.length; i++) {

            int sumatorio=0;
            int suspensas=0;
            double media=0.0;

            for (int j = 1; j <  4; j++) {
                System.out.println((alumnos[i][j]));
                sumatorio +=(int) (alumnos[i][j]);
                if ((int)alumnos[i][j]<5){
                    suspensas++;
                }
            }
            media = (double) sumatorio / (double) alumnos.length;

            boolean conv = (boolean)(alumnos[i][alumnos[i].length-1]);
            String nombre = (String) alumnos[i][0];
            if (conv== true){
                System.out.printf("%s tiene una media de %.2f, %d suspensas y tiene asignaturas cv",nombre,media,suspensas  );
            } else {
                System.out.printf("%s tiene una media de %.2f, %d suspensas y y no tiene asignaturas cv",nombre,media,suspensas );
            }

        }





    }
}
