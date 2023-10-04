package bloqueif;

public class EstructuraIfElseIf {

    public static void main(String[] args) {
        int nota = 10;
        // si el numero esta entre 0-10
        // suspenso : 0 - 4.99
        // aprobado : 5 - 6.99
        // notable: : 7- 8.99
        // sobresaliente: 9 - 9.99
        // matricula: 10
        // sino un aviso "esa nota no es valida"
        if (nota >= 0 && nota <= 10) {
            if (nota >= 0 && nota < 5) {
                System.out.println("El examen está suspenso");
            } else if (nota >= 5 && nota < 7) {
                System.out.println("El examen está aprobado");
            } else if (nota >= 7 && nota < 9) {
                System.out.println("El examen está aprobado con notable");
            } else if (nota >= 9 && nota < 10) {
                System.out.println("El examen está aprobado con sobresaliente");
            } else {
                System.out.println("El examen está aprobado con matricula");
            }
        } else {
            System.out.println("Nota incorrecta");
        }




        System.out.println("Continuando ejecucion");
    }
}
