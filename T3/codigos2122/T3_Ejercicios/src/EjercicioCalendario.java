import java.util.Calendar;
import java.util.Scanner;

public class EjercicioCalendario {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner lecturaTeclado = new Scanner(System.in);
        String nombre, saludo;
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int anio = calendar.get(Calendar.YEAR);
        System.out.println("Introduce nombre:");
        nombre = lecturaTeclado.next();
        if (hora>=7 && hora<12){
            saludo = "Buenos dias";
        } else if (hora>=12 && hora<20){
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.printf("%s %s %n",saludo,nombre);
        System.out.printf("Son las %d:%d del %d del %d de %d"
        , hora,minutos,dia,mes+1,anio);


    }
}
