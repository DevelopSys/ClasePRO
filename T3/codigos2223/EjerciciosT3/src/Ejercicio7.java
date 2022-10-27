public class Ejercicio7 {

    public static void main(String[] args) {
        int numero = 158;
        if (numero>99 && numero<1000){
            // 1 --> elevar a 3
            // 5 --> elevar a 3
            // 3 --> elevar a 3

            int unidades = numero%10;
            int decenas = (numero%100)/10;
            int centenas = numero/100;

            if (Math.pow(unidades,3) + Math.pow(decenas,3)+Math.pow(centenas,3) == (double) numero){
                System.out.println("Es armstrong");
            } else {
                System.out.println("No es armstrong");
            }
        }
    }
}
