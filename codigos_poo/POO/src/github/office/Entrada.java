package github.office;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        //TrabajoExcel trabajoExcel = new TrabajoExcel();
        //trabajoExcel.leerContenidoCompleto(new File("src/github/office/documentos/archivo.xlsx"));
        //trabajoExcel.escribirFichero();
        //trabajoExcel.escribirListaCompleta();

        TrabajoWord trabajoWord = new TrabajoWord();
        /*try {
            trabajoWord.escribirWord(new File("/Users/borja/IdeaProjects/POO/src/github/office/documentos/ejemplo.docx"));
            Desktop.getDesktop().open(new File("/Users/borja/IdeaProjects/POO/src/github/office/documentos/ejemplo.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        trabajoWord.leerWord(new File("/Users/borja/IdeaProjects/POO/src/github/office/documentos/ejemplo.docx"));


    }
}
