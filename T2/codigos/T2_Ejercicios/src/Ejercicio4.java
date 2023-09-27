public class Ejercicio4 {

    public static void main(String[] args) {
        //mostrarDatos();
        System.out.println(mostrarNombre()); // Borja
        System.out.println(mostrarApellido1()); // Borja
        System.out.println(mostrarApellido2()); // Borja
    }


    public static String mostrarNombre(){
        // tantas lineas como quiera
        final String NOMBRE = "Borja";
        return NOMBRE;
    }

    public static String mostrarApellido1(){
        // tantas lineas como quiera
        final String APELLIDO1 = "MArtin";
        return APELLIDO1;
    }

    public static String mostrarApellido2(){
        // tantas lineas como quiera
        final String APELLIDO2 = "Herrera";
        return APELLIDO2;
    }
    public static void mostrarDatos(){
        final String NOMBRE = "Borja";
        final String APELLIDO1 = "Martin";
        final String APELLIDO2 = "Herrera";
        System.out.println(NOMBRE +" "+APELLIDO1+" "+APELLIDO2);
    }
}
