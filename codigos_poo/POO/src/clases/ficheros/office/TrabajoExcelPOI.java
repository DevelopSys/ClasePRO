package clases.ficheros.office;

import clases.ficheros.office.utils.Usuario;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class TrabajoExcelPOI {

    // File --> FileInputStream --> XSSF / HSSFWorkook --> XSSF / HSSFSheet --> XSSF / HSSFRow --> XSSFCell / HSSFCell

    public void leerExcel(File f) {

        FileInputStream fis = null;
        XSSFWorkbook ficheroExcel = null;

        try {
            fis = new FileInputStream(f);
            ficheroExcel = new XSSFWorkbook(fis);
            //XSSFSheet hojaExcel = ficheroExcel.getSheet("alumnos");
            XSSFSheet hojaExcel = ficheroExcel.getSheetAt(0);
            XSSFRow filaExcel = hojaExcel.getRow(0);
            XSSFCell celda = filaExcel.getCell(3);
            if (celda.getCellType() == CellType.STRING) {
                System.out.println(celda.getStringCellValue());
            } else if (celda.getCellType() == CellType.NUMERIC) {
                System.out.println(celda.getNumericCellValue());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void leerExcelCompleto(File f) {
        FileInputStream fis = null;
        XSSFWorkbook ficheroExcel = null;

        try {
            fis = new FileInputStream(f);
            ficheroExcel = new XSSFWorkbook(fis);
            // conjunto de hojas de un fichero xlsx
            Iterator<Sheet> iteratorHojas = ficheroExcel.iterator();
            while (iteratorHojas.hasNext()) {
                Sheet hojaActual = iteratorHojas.next();
                Iterator<Row> iteratorFilas = hojaActual.iterator();
                while (iteratorFilas.hasNext()) {
                    Row filaActual = iteratorFilas.next();
                    Iterator<Cell> iteratorCelda = filaActual.iterator();
                    while (iteratorCelda.hasNext()) {
                        Cell celdaActual = iteratorCelda.next();
                        if (celdaActual.getCellType() == CellType.STRING) {
                            System.out.print(celdaActual.getStringCellValue() + " ");
                        } else if (celdaActual.getCellType() == CellType.NUMERIC) {
                            System.out.print(celdaActual.getNumericCellValue() + " ");
                        }
                    }
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escrituraExcel(String ruta) {

        // XSSF / HSSFWorkook --> XSSF / HSSFSheet --> XSSF / HSSFRow --> XSSFCell / HSSFCell / FileOutputStream (write)

        XSSFWorkbook ficheroExcel = null;
        FileOutputStream fos = null;

        try {
            ficheroExcel = new XSSFWorkbook();
            XSSFSheet hojaFichero = ficheroExcel.createSheet("ejemplo");
            XSSFRow filaFichero = hojaFichero.createRow(0);
            XSSFCell celdaFichero = filaFichero.createCell(0);
            celdaFichero.setCellValue("Ejemplo de contenido");
            fos = new FileOutputStream(ruta);
            ficheroExcel.write(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                ficheroExcel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escrituraColeccionCompleta(String ruta) {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Borja", "Martin", 23));
        usuarios.add(new Usuario("dfg", "jghf", 63));
        usuarios.add(new Usuario("w4rt", "nvb", 43));
        usuarios.add(new Usuario("u76ty", "hr", 45));

        String[] cabeceras = new String[]{"Nombre", "Apellido", "Edad"};

        XSSFWorkbook ficheroExcel = null;
        FileOutputStream fos = null;
        try {
            ficheroExcel = new XSSFWorkbook();
            XSSFSheet hojaExcel = ficheroExcel.createSheet("coleccion");
            
            // 0,1,2,3,4
            for (int i = 0; i < usuarios.size() + 1; i++) {
                XSSFRow fila = hojaExcel.createRow(i);
                // con la fila 0
                if (i == 0) {

                    for (int j = 0; j < cabeceras.length; j++) {
                        XSSFCell celda = fila.createCell(j);
                        celda.setCellValue(cabeceras[j]);
                    }

                }
                // con las filas 1,2,3,4
                else {

                    // usuario que le toca a la fila
                    // fila 1 --> usuario 0
                    Usuario usuarioActual = usuarios.get(i - 1);

                    for (int j = 0; j < cabeceras.length; j++) {
                        XSSFCell celda = null;
                        switch (j) {
                            // columna 0
                            case 0:
                                celda = fila.createCell(0, CellType.STRING);
                                celda.setCellValue(usuarioActual.getNombre());
                                break;
                            // columna 1
                            case 1:
                                celda = fila.createCell(1, CellType.STRING);
                                celda.setCellValue(usuarioActual.getApellido());
                                break;
                            // columna 2
                            case 2:
                                celda = fila.createCell(2, CellType.NUMERIC);
                                celda.setCellValue(usuarioActual.getEdad());
                                break;
                        }
                    }
                }
            }

            fos = new FileOutputStream(ruta);
            ficheroExcel.write(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                ficheroExcel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

