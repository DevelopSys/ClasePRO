public class Entrada {

    /**
     * Funcionalidad del metodo
     * @param args
     */
    // esta es la definicion de una variable
    public static void main(String[] args){
        /*

         */


        String apellido1 = "Martin";
        String apellido2 = "Herrera";
        String correo = "borja.martin@cesjunapablosegundo.es";
        String nombre = "Borja";
        final String DNI = "123A";
        System.out.printf(DNI);
        // TODO este codigo hay que mejorarlo
        int edad = 41;
        edad = edad +2;
        float alturaFloat = 1.79f;
        double altura = 1.79;
        char letraDNI = 'A';
        boolean experiencia = true;
        Object cosa = "Borja";
        System.out.println("Hola me llamo "+nombre+" "+apellido1+" "+apellido2);
        System.out.println("Mi correo es "+correo);
        // TODO este otro comentario es un cambio
        System.out.printf("Mi nombre es %s mis apellidos son %s %s y tengo %d %s",
                nombre,apellido1,apellido2,edad, "años");

    }

    // asdasd
    /*
    dsaasd
    asd
     */

    /**
     * @version 1.0
     * @author Borja Martin Herrera
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int metodoEjemploDoc(int a, int b, String c){
        return 5;
    }


}





