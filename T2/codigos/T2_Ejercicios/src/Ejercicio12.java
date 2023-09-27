public class Ejercicio12 {

    public static void main(String[] args) {
        double numero = 98.87;
        System.out.println("Expresado en double "+numero);
        // casteo
        System.out.println("Expresado en double "+(int)numero);
        System.out.println("Expresado en double "+(byte)numero);
        System.out.println("Expresado en double "+(short)numero);
        // parse
        System.out.println(Double.parseDouble("1.90"));
    }
}
