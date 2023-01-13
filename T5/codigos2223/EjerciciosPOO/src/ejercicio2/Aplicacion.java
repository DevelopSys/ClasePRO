package ejercicio2;

public class Aplicacion {
    public static void main(String[] args) {

        /*Coche c = new Coche("MarcaVacio","ModeloVacio");
        c.mostrarDatos();*/

        // Marca: MarcaVacio
        // Modelo: ModeloVacio
        // Motor:
        // CV:null
        // litros aceite: null
        Motor m = new Motor(100);


        Coche c = new Coche("MarcaDiferente", "ModeloDiferente", m);
        // marca = "Marca" modelo="Modelo" motor=[Motor(cv=100,litrosAceite=0)]
        //c.mostrarDatos();
        Coche c1 = new Coche("Marca", "Modelo", m);
        // marca = "Marca" modelo="Modelo" motor=[Motor(cv=200,litrosAceite=0)]
        //c1.mostrarDatos();
        /*c1.acumularAveria();
        c1.acumularAveria();
        c1.acumularAveria();*/
        Coche c2 = new Coche("Marca", "Modelo", new Motor(150));
        // marca = "Marca" modelo="Modelo" motor=[Motor(cv=150,litrosAceite=0)]
        //c2.acumularAveria();
        //c2.acumularAveria();
        //c2.mostrarDatos();
        Coche c3 = new Coche("Marca", "Modelo", 200);
        //c3.acumularAveria();
        //c3.mostrarDatos();
        // marca = "Marca" modelo="Modelo" motor=[Motor(cv=200,litrosAceite=0)]

        Garaje garaje = new Garaje();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c2,"motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(c1,"aceite");
        garaje.aceptarCoche(c1,"aceite");


        c1.mostrarDatos();
        //c1.mostrarDatos();
        //garaje.devolverCoche();
        //garaje.aceptarCoche(c2,"aceite");

        //garaje.devolverCoche();

    }
}
