package github.office;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrabajoWord {


    public void leerWord(File f) {
        FileInputStream fis = null;
        XWPFDocument documentoWord = null;
        try {
            fis = new FileInputStream(f);
            documentoWord = new XWPFDocument(fis);
            List<XWPFParagraph> parrafos = documentoWord.getParagraphs();
            for (XWPFParagraph paragraph : parrafos) {
                System.out.println(paragraph.getText());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                documentoWord.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribirWord(File f) throws IOException {
        XWPFDocument documento = null;
        FileOutputStream fos = null;
        try {
            documento = new XWPFDocument();
            XWPFParagraph titulo_doc = documento.createParagraph();
            XWPFRun run = titulo_doc.createRun();
            run.setText("Ejemplo de escritura en word");

            fos = new FileOutputStream(f);
            documento.write(fos);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                documento.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

}


