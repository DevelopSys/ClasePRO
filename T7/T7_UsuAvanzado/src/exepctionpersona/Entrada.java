package exepctionpersona;

import exepctionpersona.model.Persona;

public class Entrada {

    public static void main(String[] args) {
        try {
            Persona persona =
                    new Persona("null", 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*try {
            persona.validarDatos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terminando la validacion");
        }*/
    }
}
