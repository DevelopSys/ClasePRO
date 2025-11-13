public class Main {

    public static void main(String[] args) {
        GarajeController garajeController = new GarajeController();
        garajeController.anadirCoche(new Object[]{"1234A", "Opel", "Corsa", 120, 20000});
        garajeController.anadirCoche(new Object[]{"1234B", "Ford", "Corsa", 90, 30000});
        garajeController.anadirCoche(new Object[]{"1234C", "Opel", "Corsa", 70, 5000});
        garajeController.anadirCoche(new Object[]{"1234D", "Ford", "Corsa", 130, 12000});
        garajeController.anadirCoche(new Object[]{"1234E", "Seat", "Corsa", 110, 14000});
        garajeController.anadirCoche(new Object[]{"1234F", "Ford", "Corsa", 150, 23000});

        // Todos aquellos coches que valgan menos de 20mil y tengan un cv > 100
        
        garajeController.listarCoches();
        // garajeController.buscarCoche("1234C");
        // garajeController.obtenerTamanio();
        // garajeController.eliminarCoche("1234B");
        // garajeController.obtenerTamanio();
    }
}
