import java.util.Scanner;

public class EntradaTeclado {

    static Scanner lectorTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre; // null
        System.out.println("Por favor introduce tu nombre");
        // el usuario introduzca el nombre por el teclado
        nombre = lectorTeclado.next();
        System.out.println("Por favor introduce tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Por favor introduce tu altura");
        float altura = lectorTeclado.nextFloat();
        System.out.printf("Mi nombre es: %s tengo %d años y mido %.1fm\n",
                nombre,edad,altura);
        // System.out.println("Mi nombre es "+nombre);
        // Mi nombre es XXX(Borja) tengo XXX(40) mido XXX(1.73)
        // y tengo experiencia trabajando XXX(true)
    }

}
