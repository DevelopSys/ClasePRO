package videos.almacenamiento;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.*;
import java.util.List;

public class FicherosWord {

    public void escritura(File f){

        XWPFDocument document = null;
        FileOutputStream fos = null;

        try{

            document = new XWPFDocument();
            XWPFParagraph parrafo = document.createParagraph();
            parrafo.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun escritor = parrafo.createRun();
            escritor.setText("Primer parrafo");
            escritor.addCarriageReturn();

            XWPFParagraph parrafo1 = document.createParagraph();
            parrafo1.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun escritor1 = parrafo1.createRun();
            escritor1.setBold(true);
            escritor1.setItalic(true);
            escritor1.setText("segundp parrafo");

            fos = new FileOutputStream(f);
            document.write(fos);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void lectura(File f){

        FileInputStream fis = null;
        XWPFDocument document = null;

        try {
            fis = new FileInputStream(f);
            document = new XWPFDocument(fis);
            List<XWPFParagraph> parrafos = document.getParagraphs();
            for (XWPFParagraph parrafo :parrafos) {
                System.out.println(parrafo.getText());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                document.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
