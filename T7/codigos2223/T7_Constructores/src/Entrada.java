import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        //Coche coche = new Coche("Marca1","Modelo1",123);
        //coche.mostrarDatos();
        // Coche.metodoDirecto();
        //Coche coche = Coche.newInstance("Marca","Modelo",123); // me de un coche
        //coche.mostrarDatos();

        //Coche.newInstance("Marca","Modelo",123).mostrarDatos();
        //DataSet.newInstance(); // DataSet
        // todos los equipos del dataset
        // todos los equipos de una liga en concreto

        // COMO OBTENGO LOS EQUIPOS DE ESPAÑA????

        System.out.println("Que liga quieres consultar");
        String liga = new Scanner(System.in).next();
        for ( Equipo equipo: DataSet.newInstance().getEquiposLiga(liga) ) {
            System.out.println(equipo);
        }
    }
}
