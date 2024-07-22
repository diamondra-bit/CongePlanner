/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desktoptest;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diamondra
 */
public class Pdf {
    public static void main (String[] args) throws DocumentException
    {
        try {
            Document document=new Document();
            PdfWriter.getInstance(document, new FileOutputStream("createPdf.pdf"));
            
            document.open();
            document.add(new Paragraph("Fiche de paie"));
            
           
            
            document.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pdf.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
