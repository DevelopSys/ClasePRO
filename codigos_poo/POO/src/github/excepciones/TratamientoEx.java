package github.excepciones;

public class TratamientoEx {

    public void excecionNull() {

        try {
            String palabra = null;
            System.out.println(palabra.length());
        } catch (NullPointerException e) {
            System.out.println("Objeto nulo");
        }
    }

    public void excecionArray() {
        String[] palabras = new String[]{"uno", "dos", "tres"};

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(palabras[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posición incorrecta");

        }
    }

    public void excecionOperacion() {

        try {
            int division = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("operación incorrecta");
        }
    }

}
