package github.office;

import github.office.utils.Usuario;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TrabajoExcel {

    public void leerFicheroExcel(File f) {
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow filaExcel = null;
        XSSFCell celda = null;

        try {
            fileInputStream = new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = archivoExcel.getSheetAt(0);
            filaExcel = hojaExcel.getRow(0);
            celda = filaExcel.getCell(0);
            if (celda.getCellType() == CellType.STRING) {
                System.out.println(celda.getStringCellValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                archivoExcel.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerContenidoCompleto(File file) {
        FileInputStream ficheroInput = null;
        XSSFWorkbook ficheroExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow fileExcel = null;
        XSSFCell celadaExcel = null;

        try {
            ficheroInput = new FileInputStream(file);
            ficheroExcel = new XSSFWorkbook(ficheroInput);

            Iterator<Sheet> hojaIterator = ficheroExcel.iterator();
            while (hojaIterator.hasNext()) {
                Sheet hoja = hojaIterator.next();
                Iterator<Row> filaIterator = hoja.iterator();
                while (filaIterator.hasNext()) {
                    Row fila = filaIterator.next();
                    Iterator<Cell> celdaIterator = fila.cellIterator();
                    while (celdaIterator.hasNext()) {
                        Cell celda = celdaIterator.next();
                        if (celda.getCellType() == CellType.NUMERIC) {
                            System.out.println(celda.getNumericCellValue());
                        } else if (celda.getCellType() == CellType.STRING) {
                            System.out.println(celda.getStringCellValue());
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ficheroExcel.close();
                ficheroInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirFichero(){

        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet();
        XSSFRow fila = hoja.createRow(0);
        XSSFCell celda = fila.createCell(0);
        Cell celdaTipo = fila.createCell(1, CellType.NUMERIC);
        celda.setCellValue("Ejemplo");
        celdaTipo.setCellValue(1);
        try {
            FileOutputStream fileOut = new FileOutputStream("src/github/office/documentos/archivo_creado.xlsx");
            ficheroExcel.write(fileOut);
            fileOut.close();
            ficheroExcel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirListaCompleta(){

        XSSFWorkbook ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet("usuarios");
        XSSFRow fila = hoja.createRow(0);
        XSSFCell celda;
        int numFilas=0;
        ArrayList<Usuario> lista = getUsuarios();
        String[]cabeceras = new String[]{"Nombre","Apellido","Télefono"};

        for (int i=0;i<cabeceras.length;i++){
            celda = fila.createCell(i);
            celda.setCellValue(cabeceras[i]);
        }
        numFilas++;

        for (Usuario u:lista) {
            int numPosicionCelda = 1;
            fila = hoja.createRow(numFilas);
            celda = fila.createCell(numPosicionCelda);
            celda.setCellValue(u.getNombre());
            celda = fila.createCell(numPosicionCelda++);
            celda.setCellValue(u.getApellido());
            celda = fila.createCell(numPosicionCelda++, CellType.NUMERIC);
            celda.setCellValue(u.getTelefono());
            numFilas++;
        }

        try {
            FileOutputStream fileOutput = new FileOutputStream("src/github/office/documentos/archivo_listado.xlsx");
            ficheroExcel.write(fileOutput);
            fileOutput.close();
            ficheroExcel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> getUsuarios(){
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("Borja", "Martin",111111));
        listaUsuarios.add(new Usuario("Jose", "Lopez",222222));
        listaUsuarios.add(new Usuario("Luis", "Urbano",333333));
        listaUsuarios.add(new Usuario("Maria", "Fuentes",444444));
        listaUsuarios.add(new Usuario("Rebeca", "Bordona",555555));
        listaUsuarios.add(new Usuario("Carlos", "Baonza",666666));
        return listaUsuarios;
    }

}
