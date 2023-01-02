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


        //System.out.println(cochePrecio.getVelocidad());
        // acelero el coche
        cocheSinPrecio1.mostrarDatos();
        cocheSinPrecio1.cargarGasolina(150);
        cocheSinPrecio1.acelerar(60);
        cocheSinPrecio1.frenar(20);
        cocheSinPrecio1.mostrarDatos();



        // modificar el metodo acelerar para que
        //  no pueda acelerar si no tengo al menos la misma cantidad de gasolina
        //  que lo que se intenta acelerar
        //  al acelarar se le sume a la velocidad lo que tenemos mas 1/100 de la
        //  velocidad *  los cv (0,05 * cv)

        // crear un método que permita poner gasolina a los coches





    }

}
