import java.util.Scanner;

public class EntradaSwitch {

    public static void main(String[] args) {
        // Pide por teclado el mes en el que estas y quiero
        // que por consola se imprima la estacion del año en la que estas
        // mayo-junio-julio-agosto -> verano
        // septiembre-octubre-noviembre -> otoño
        // diciembre-enero-febrero -> invierno
        // marzo - abril -> primavera

        Scanner lector = new Scanner(System.in);
        System.out.println("En que mes estas");
        String mes = lector.nextLine();

        /*String nombre = null;
        switch (mes.toLowerCase()) {
            case "mayo":
                nombre = "Borja Mayo";
            case "junio":
                nombre = "Borja Junio";
                System.out.println(nombre);
            case "julio":
            case "agosto":
                System.out.println("verano");
                break;
            case "diciembre":
            case "enero":
            case "febrero":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("El mes no existe");
        }*/
        String estacion = null;
        switch (mes) {
            case "mayo", "junio", "julio", "agostp" -> {
                estacion = "verano";
            }
            case "septiembre", "octubre", "noviembre" -> {
                estacion = "otoño";
            }
            case "diciembre", "enero", "febrero" -> {
                estacion = "invienrno";
            }
            case "marzo", "abril" -> {
                estacion = "primavera";
            }
            default -> estacion = "sin estacion";
        }
        System.out.println("La estacion es " + estacion.length());
        lector.close();
        System.out.println("Terminando la app de meses");
    }
}
