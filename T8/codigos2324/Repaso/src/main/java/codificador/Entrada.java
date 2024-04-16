package codificador;

import codificador.controller.OperacionesCifrado;

public class Entrada {

    public static void main(String[] args) {
        OperacionesCifrado operacionesCifrado = new OperacionesCifrado();
        //operacionesCifrado.cifrarMensaje("Esto es un mensaje a cifrar");
        operacionesCifrado.descifrarMensaje();
    }
}
