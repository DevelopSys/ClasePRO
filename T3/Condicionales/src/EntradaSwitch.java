public class EntradaSwitch {

    public static void main(String[] args) {

        int numero = 15;
        switch (numero) {
            case 1:
                // cuerpo del caso
                System.out.println("Ejecutado en caso 1");
                break;
            case 2:
                System.out.println("Ejecutado en caso 2");
                // cuerpo del caso
                break;
            case 3:
                System.out.println("Ejecutado en caso 3");
                // cuerpo del caso
                break;
            case 4:
                System.out.println("Ejecutado en caso 4");
                // cuerpo del caso
                break;
            case 5, 6, 7, 8, 9:
                System.out.println("Comportamiento comun");
                break;
            default:
                System.out.println("Ejecutado en caso por defecto");
                // cuerpo del restante
                break;
        }

        char letra = 'A';
        switch (letra) {
            case 'A':
                // String mensaje = "Esta variable es de bloque";
                System.out.println("Seleccionada la letra A");
                break;
            case 'B':
                // mensaje = "asdasd";
                // System.out.println(mensaje);
                System.out.println("Seleccionada la letra B");
                break;
            case 'C':
                System.out.println("Seleccionada la letra C");
                break;
            default:
                System.out.println("Letra no reconocida");
        }

        String nombre = "BORJA";
        switch (nombre.toLowerCase()) {
            case "borja" -> {
                // mensaje = "Esta variable es de bloque";
                // System.out.println(mensaje);
                System.out.println("El nombre es Borja");
            }
            case "maria" -> {
                // nombre = borja
                // mensaje = "Esta variable es de bloque";
                // System.out.println(mensaje);
                System.out.println("El nombre es Maria");
            }
            case "luis" -> {
                System.out.println("El nombre es Luis");
            }
            case "marta" -> {
                System.out.println("El nombre es Marta");
            }
            default -> {
                System.out.println("El nombre no reconocido");
            }
        }
        System.out.println("Terminando el programa");

    }
}
