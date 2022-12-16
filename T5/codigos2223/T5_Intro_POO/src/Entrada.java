import objetos.*;

public class Entrada {

    public static void main(String[] args) {

        Coche cocheDefecto1 = new Coche();
        // marca = por defecto modelo = por defecto cv = 0 numeroPuertas = 0 precio = 0
        Coche cocheDefecto2 = new Coche();
        // marca = por defecto modelo = por defecto cv = 0 numeroPuertas = 0 precio = 0
        Coche cochePrecio = new Coche("Mercedes","C220",5,500,60000);
        // marca = Mercedes modelo = C220 cv = 500 numeroPuertas = 5 precio = 60000
        Coche cocheSinPrecio1 = new Coche("Ford","Focus",3,200);
        // marca = Ford modelo = Focus cv = 200 numeroPuertas = 3 precio = 5000
        Coche cocheSinPrecio2 = new Coche("Ford","Mustang",3,400);
        // marca = Ford modelo = Mustang cv = 400 numeroPuertas = 3 precio = 5000

        cocheSinPrecio2.setMarca("FordGT");
        System.out.println(cocheSinPrecio2.getMarca());
        System.out.println(cochePrecio.getMarca());
        System.out.println(cocheDefecto1.getMarca().equals("Mercedes"));




    }

}
