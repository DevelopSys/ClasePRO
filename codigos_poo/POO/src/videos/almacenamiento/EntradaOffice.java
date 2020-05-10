package videos.almacenamiento;

import java.io.File;

public class EntradaOffice {

    public static void main(String[] args) {
        FicheroExcel ficheroExcel = new FicheroExcel();
        //ficheroExcel.leerFichero(new File("src/videos/almacenamiento/documentos/archivo_listado.xlsx"));
        //ficheroExcel.escribirFichero();
        FicherosWord ficherosWord = new FicherosWord();
        //ficherosWord.escritura(new File("src/videos/almacenamiento/documentos/fichero_word_escritura.docx"));
        ficherosWord.lectura(new File("src/videos/almacenamiento/documentos/fichero_word_escritura.docx"));
    }
}
