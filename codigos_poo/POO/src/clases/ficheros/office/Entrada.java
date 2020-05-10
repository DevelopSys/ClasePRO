package clases.ficheros.office;

import java.io.File;

public class Entrada {

    public static void main(String[] args) {

        TrabajoExcelPOI trabajoExcelPOI = new TrabajoExcelPOI();
        //trabajoExcelPOI.leerExcel(new File("src/clases/ficheros/office/documentos/ejemplo_lectura.xlsx"));
        //trabajoExcelPOI.leerExcelCompleto(new File("src/clases/ficheros/office/documentos/ejemplo_lectura.xlsx"));
        //trabajoExcelPOI.escrituraExcel("src/clases/ficheros/office/documentos/ejemplo_escritura.xlsx");
        //trabajoExcelPOI.escrituraColeccionCompleta("src/clases/ficheros/office/documentos/ejemplo_escritura_lista.xlsx");
        TrabajoWordPOI trabajoWordPOI = new TrabajoWordPOI();
        //trabajoWordPOI.lecturaWord(new File("src/clases/ficheros/office/documentos/ejemplo_lectura_w.docx"));
        trabajoWordPOI.escrituraWord(new File("src/clases/ficheros/office/documentos/ejemplo_escritura_w.docx"));
    }
}
