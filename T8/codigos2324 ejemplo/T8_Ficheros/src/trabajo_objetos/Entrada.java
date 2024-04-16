package trabajo_objetos;

import lecturaJSON.controller.Operaciones;
import trabajo_objetos.controller.OperacionesFicheros;
import trabajo_objetos.model.Tarea;

public class Entrada {

    public static void main(String[] args) {
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        // operacionesFicheros.escribirObjeto();
        operacionesFicheros.lecturaObjeto();
    }
}
