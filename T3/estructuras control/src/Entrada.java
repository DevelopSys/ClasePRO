public class Entrada {

    public static void main(String[] args) {
        int nota = -6;
        // if -> 0-10 -> nota correcta
        String mensaje = null;
        if (nota >= 0 && nota <= 10) {
            System.out.println("La nota es correcta");
            if (nota<5){
                System.out.println("SS");
            } else if (nota<7) {
                System.out.println("AP");
            } else if (nota<9) {
                System.out.println("NT");
            } else if (nota<10) {
                System.out.println("SB");
            } else {
                System.out.println("MH");
            }

        } else {
            System.out.println("La nota no es correcta");
        }

        System.out.println("Terminando la ejecucion");
    }
}
