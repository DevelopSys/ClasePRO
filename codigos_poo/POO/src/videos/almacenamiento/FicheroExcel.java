package videos.almacenamiento;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class FicheroExcel {

    public void leerFichero(File f) {

        FileInputStream fileInputStream = null;
        Workbook ficheroExcel = null;
        Sheet hojaExcel = null;
        Row fileFichero = null;
        Cell celda = null;
        try {
            fileInputStream = new FileInputStream(f);
            ficheroExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = ficheroExcel.getSheetAt(0);
            fileFichero = hojaExcel.getRow(1);
            celda = fileFichero.getCell(1);
            if (celda.getCellType() == CellType.NUMERIC) {
                System.out.println(celda.getNumericCellValue());
            } else if (celda.getCellType() == CellType.STRING) {
                System.out.println(celda.getStringCellValue());
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
    public void escribirFichero(){
        FileOutputStream fileOutputStream = null;
        Workbook ficheroExcel = null;
        Sheet hojaFichero = null;
        Row filaFichero = null;
        Cell celdaFichero = null;

        ficheroExcel = new XSSFWorkbook();
        hojaFichero = ficheroExcel.createSheet("ejemplo");
        filaFichero = hojaFichero.createRow(0);
        celdaFichero = filaFichero.createCell(1);
        celdaFichero.setCellValue(1);

        try {
            fileOutputStream = new FileOutputStream(new File("src/videos/almacenamiento/documentos/archivo_escrito.xlsx"),true);
            ficheroExcel.write(fileOutputStream);
            fileOutputStream.close();
            ficheroExcel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
