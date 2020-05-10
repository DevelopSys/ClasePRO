package ejercicios;

import java.io.File;

public class Entrada {

    public static void main(String[] args) {

        DatosBasicos datosBasicos = new DatosBasicos();
        //datosBasicos.agregarUsuarios();
        LecturaBasica lecturaBasica = new LecturaBasica();
        //lecturaBasica.leerContenido();
        PalabrasOraciones palabrasOraciones = new PalabrasOraciones();
        //palabrasOraciones.leerContenido();
        TextoASCII textoASCII = new TextoASCII();
        //textoASCII.traducirTextoASCII();
        ASCIITexto asciiTexto = new ASCIITexto();
        //asciiTexto.leerContenidoASCII();
        JuegoAdivinar juegoAdivinar = new JuegoAdivinar();
        //juegoAdivinar.iniciarJuego();
        ListadoRecursivo listadoRecursivo = new ListadoRecursivo();
        //listadoRecursivo.listarPeticion(new File("src"));
        ListaObjetos listaObjetos = new ListaObjetos();
        listaObjetos.agregarUsuario();
    }
}
