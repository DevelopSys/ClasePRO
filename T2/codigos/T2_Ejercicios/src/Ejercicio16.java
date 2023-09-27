public class Ejercicio16 {
    public static void main(String[] args) {
        int totalSegundos = 234567898;
        totalSegundos = 234567890;
        int horas = totalSegundos/3600;
        System.out.println("Las horas son: "+horas);
        int restanteHoras = totalSegundos%3600;
        int minutos = restanteHoras/60;
        System.out.println("Los minutos son: "+minutos);
        int restanteMinutos = restanteHoras%60;
        System.out.println("Los segundos son :"+restanteMinutos);
    }
}
