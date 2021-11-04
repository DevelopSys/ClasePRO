public class EjercicioAmstrong {

    public static void main(String[] args) {

        int numero = 157;

        int centenas=0, decenas=0, unidades=0;

        if (numero >= 100 && numero <= 999) {
            // centenas
            centenas = numero/100;
            // las elevo a 3
            int centenasCubo = (int) Math.pow(centenas,3);

            // decenas
            decenas = (numero%100)/10;
            // las elevo a 3
            int decenasCubo = (int) Math.pow(decenas,3);

            // unidades
            unidades = (int)numero%10;
            // las elevo a 3
            int unidadesCubo = (int) Math.pow(unidades,3);

            if (unidadesCubo+decenasCubo+centenasCubo == numero){
                System.out.println("El numero es amstrong");
            } else {
                System.out.println("El numero no es amstrong");
            }
        } else {
            System.out.println("El numero no tiene 3 digitos");
        }

    }
}
