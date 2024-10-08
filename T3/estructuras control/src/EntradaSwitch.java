public class EntradaSwitch {

    public static void main(String[] args) {

        int numero = 0;
        switch (numero) {
            case 0:
                int edad = 10;
                System.out.println("El valor es 0");
                break;
            case 5:
                // puedo acceder a edad??????
                // System.out.println(edad);
                // edad = 10;
                System.out.println("El valor es 5");
                break;
            case 10:
                System.out.println("El valor es 10");
                break;
            default:
                System.out.println("El valor no esta contemplado");
        }

        String mes = "Enero";
        switch (mes){
            case "Enero":
                break;
            case "Febrero":
                break;
            case "Marzo":
                break;
        }

        char letra = 'Z';
        switch (letra){
            case 'A':
                break;
            case 'Z':
                break;
            case 'R':
                break;
        }
        System.out.println("Terminando bloque");
    }
}
