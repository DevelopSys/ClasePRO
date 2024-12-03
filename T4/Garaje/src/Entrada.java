public class Entrada {

    // VISTA
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Garaje garaje2 = new Garaje();
        System.out.println("Bienvenido a la app de gestion de coches");
        garaje.anadirCoche("Mercedes","c220",200,"1234A");
        garaje.anadirCoche("Ford","Fiesta",100,"1234B");
        //garaje2.mostrarCoches();
        garaje.listarMarca("mercedes");
    }
}
