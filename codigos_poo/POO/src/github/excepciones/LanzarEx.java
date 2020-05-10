package github.excepciones;

public class LanzarEx {

    public void excecionNull() throws NullPointerException {

        String palabra = null;
        System.out.println(palabra.length());

    }

    public void excecionArray() throws ArrayIndexOutOfBoundsException {
        String[] palabras = new String[]{"uno", "dos", "tres"};

        for (int i = 0; i <= 3; i++) {
            System.out.println(palabras[i]);
        }

    }

    public void excecionOperacion() throws ArithmeticException {

        int division = 4 / 0;

    }

    public void lanzarMiExcepcion() throws MiExcepcion {
        throw new MiExcepcion("Excepción personalizada lanzada");
    }

}
