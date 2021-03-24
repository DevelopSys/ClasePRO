public class Jugador {

    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;


    public Jugador(String nombre, String apellido, int edad, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
    }

    public void mostarDatos(){
        System.out.println("Nombre "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Edad "+edad);
        System.out.println("Posicion "+posicion);
    }
}
