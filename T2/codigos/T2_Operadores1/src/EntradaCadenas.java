public class EntradaCadenas {
    public static void main(String[] args) {
        String frase1 = "Esto es una frase a evaluar";
        String frase2 = "esto es una frase a evaluar";
        String frase3 = ""; // null
        String nombre = "Borja";
        String correo = "micorreopersonal@gmail.com";
        String nombreCorreo = "";
        String dominioCorreo = "";
        // boolean comparacionFrases = frase1 == frase2;
        // boolean comparacionFrases = frase1.equals(frase2);
        // boolean comparacionFrases = frase1.equalsIgnoreCase(frase2);
        boolean comparacionFrases = frase1.toUpperCase().equals(frase2.toUpperCase());
        int comparacionInt = frase1.compareTo(frase2);
        int numeroCaracteres =  frase1.length();
        int numeroCaracteresFrase3 =  frase3.length();
        boolean comprobarFrase = numeroCaracteresFrase3>0; // false
        char letraIncial = nombre.charAt(0);
        char letraFinal = nombre.charAt(nombre.length()-1);
        int posicionArroba = correo.indexOf("@");
        nombreCorreo = correo.substring(0,posicionArroba);
        dominioCorreo = correo.substring(posicionArroba+1,correo.indexOf("."));

        System.out.println("El dominio del correo es "+dominioCorreo);
        System.out.println("El nombre del correo es "+nombreCorreo);
        System.out.println("La posicion de la @ es "+posicionArroba);
        System.out.println("La letra inicial del nombre es "+letraIncial);
        System.out.println("La letra final del nombre es "+letraFinal);
        System.out.println("El numero de caracteres de frase 3 es: "+numeroCaracteresFrase3);
        System.out.println("El numero de caracteres es: "+numeroCaracteres);
        System.out.println(comparacionFrases);
        frase1 = frase1.toUpperCase();
        System.out.println(frase1);
    }
}
