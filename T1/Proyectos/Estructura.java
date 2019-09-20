/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01_estructura;

/**
 *
 * @author Profesor
 */
public class Estructura {

    // metodo_acceso public (todas las clases)
    // metodo_acceso protected (solo las clases del paquete)
    // metodo_acceso private (solo la clase)
    // metodo_acceso tipo_variable id_variable = valor
    public static String nombre = "Pepe";
    protected static String nombreNuevo = "Borja";
    private static String nombreDiferente = "Luis";
    // constante 
    final static int NUMEROCONSTANTE = 1;
    final String PALABRACONSTANE = "Palabra";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // nombre = "Nuevo";
        // no puedo cambiar el valor porque es final numeroConstante = 5;
        /*System.out.println(nombre);
        int intMax = Integer.MAX_VALUE;
        System.out.println("El valor max de Integer es: "+intMax
                + " el valor min es: "+Integer.MIN_VALUE);  
        System.out.println("El valor max de Short es: "+Short.MAX_VALUE
                + " el valor min es: "+Short.MIN_VALUE);
        System.out.println("El valor max de byte es: "+Byte.MAX_VALUE
                + " el valor min es: "+Byte.MIN_VALUE);
        System.out.println("El valor max de Long es: "+Long.MAX_VALUE
                + " el valor min es: "+Long.MIN_VALUE);*/
        // metodoVacio();
        // System.out.println(metodoPalabra());
        // System.out.println(metodoNumero());
        // System.out.println(metodoMixto());
        boolean respuesta = metodoMixto();
        System.out.println(respuesta);
        /*public static boolean metodoMixto(){
            System.out.println("saludo ejecutado desde método mixto");
            return true;
        }*/
        metodoSaludo("Saludo desde parámetro");
        metodoSaludo("Saludo diferente");
        metodoSaludo("Saludo aún más diferente");
        /*public static void metodoSaludo(String saludo){
            System.out.println(saludo);
        }*/
        metodoDosArgumentos("Borja",18 );
        /*public static void metodoDosArgumentos(String nombre, int edad){
            System.out.println("Hola "+nombre+", tengo "+edad+" años");
        }*/
    }

    public static void metodoVacio() {
        System.out.println("Saludo desde el método vacío modificado diferente");
    }


    public static String metodoPalabra() {
        String saludo = "Saludo desde método palabra";
        return saludo;
    }

    public static int metodoNumero() {
        return 5;
    }

    public static boolean metodoMixto() {
        System.out.println("saludo ejecutado desde método mixto");
        return true;
    }

    public static void miMetodo() {
        System.out.println(nombre);
    }
    
    public static void metodoSaludo(String saludo){
        System.out.println(saludo);
    }
    
    public static void metodoDosArgumentos(String nombre, int edad){
        System.out.println("Hola "+nombre+", tengo "+edad+" años");
    }

    public void noAuto() {
        System.out.println(PALABRACONSTANE);
        int intMax = Integer.MAX_VALUE;
        System.out.println("El valor max de Integer es: " + intMax
                + " el valor min es: " + Integer.MIN_VALUE);
        System.out.println("El valor max de Short es: " + Short.MAX_VALUE
                + " el valor min es: " + Short.MIN_VALUE);
        System.out.println("El valor max de byte es: " + Byte.MAX_VALUE
                + " el valor min es: " + Byte.MIN_VALUE);
        System.out.println("El valor max de Long es: " + Long.MAX_VALUE
                + " el valor min es: " + Long.MIN_VALUE);

    }

}
