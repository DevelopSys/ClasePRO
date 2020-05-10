package clases.ficheros.office;

import ejercicios.utils.Usuario;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.*;

public class TrabajoWordPOI {


    public void escrituraWord(File f) {

        // File --> FileOutput --> XWPFDocument --> XWPfParagraph --> Run

        FileOutputStream fos = null;
        XWPFDocument documento = null;

        try {

            documento = new XWPFDocument();

            /*XWPFParagraph parrafo1 = documento.createParagraph();
            XWPFRun linea = parrafo1.createRun();
            linea.setText("Título del documento");

            XWPFParagraph parrafo2 = documento.createParagraph();
            XWPFRun linea2 = parrafo2.createRun();
            linea2.setText("Primera linea del documento");*/

            escribirParrafo(documento, "Titulo del documento", 1);
            escribirParrafo(documento, null, 2);
            escribirParrafo(documento, "Tercera linea del documento", 2);

            fos = new FileOutputStream(f);
            documento.write(fos);

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                documento.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirParrafo(XWPFDocument documento, String lineaEscribir, int estilo) {
        XWPFParagraph parrafo = documento.createParagraph();
        XWPFRun linea = parrafo.createRun();
        switch (estilo) {
            case 1:

                linea.setBold(true);
                parrafo.setAlignment(ParagraphAlignment.CENTER);
                linea.setFontSize(15);

                break;

            case 2:

                linea.setBold(false);
                linea.setItalic(true);
                linea.setCapitalized(true);
                parrafo.setAlignment(ParagraphAlignment.LEFT);
                linea.setFontSize(10);
                break;
        }

        if (lineaEscribir !=null ){
            linea.setText(lineaEscribir);
        } else {
            Scanner teclado = new Scanner(System.in);
            lineaEscribir = teclado.next();
            linea.setText(lineaEscribir);
            linea.addCarriageReturn();
            linea.setText("ejemplo de saldo de linea");
        }

    }

    public void lecturaWord(File f) {

        // File --> FileInput --> XWPFDocument --> XWPfParagraph --> Run

        FileInputStream fis = null;
        XWPFDocument documento = null;

        try {
            fis = new FileInputStream(f);
            documento = new XWPFDocument(fis);

            List<XWPFParagraph> parrafos = documento.getParagraphs();
            for (XWPFParagraph parrafo : parrafos) {
                System.out.println(parrafo.getText());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                documento.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
