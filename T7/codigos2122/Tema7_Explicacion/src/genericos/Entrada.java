package genericos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Entrada {

    public static void main(String[] args) {

        // discos para poder organizarlos --> double
        // listar retorna un boolean
        Coleccion<Disco,Double,Boolean> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());




        // camisetas para poder organizarlos --> char
        // listar retorna un String
        Coleccion<Camiseta,Character,String> coleccionCamisetas = new Coleccion();
        coleccionCamisetas.agregarCosas(new Camiseta());



        // partidos para poder organizarlos --> Integer
        // listar retorna un Integet
        /*Coleccion<Partido> coleccionPartidos = new Coleccion();
        coleccionPartidos.agregarCosas(new Partido());

        // coche para poder organizarlos --> object
        // listar retorna un object
        //Coleccion<Coche> coleccionCoches = new Coleccion();
        coleccionCoches.agregarCosas(new Coche());


        //Coleccion<Coleccionable> coleccionColeccionables = new Coleccion();
        coleccionColeccionables.agregarCosas(new Disco());
        coleccionColeccionables.agregarCosas(new Camiseta());



        Coleccion<Integer> coleccionNumeros = new Coleccion<>();

        ColeccionEspecifica<Disco> listaEspecifica1 = new ColeccionEspecifica<Disco>();
        ColeccionEspecifica<Camiseta> listaEspecifica2 = new ColeccionEspecifica<Camiseta>();*/




    }
}
