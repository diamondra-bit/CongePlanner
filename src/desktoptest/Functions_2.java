/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desktoptest;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.toedter.calendar.JDateChooser;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Functions_2 {
    
   // ------------------------- Liste des employés absents pour une date ------------------------------------------------- Done
     public void Presence(Connection connection,JTable table,JDateChooser date)
     {
        try {
            Statement st;
            ResultSet rs;
            st=connection.createStatement();
            
             String selectdate=((JTextField)date.getDateEditor().getUiComponent()).getText();
          
            
            rs=st.executeQuery("Select pointage.datePointage,pointage.numEmp,Employe.Nom,Employe.Prenom,Employe.poste,pointage.pointage from employe inner join pointage on employe.numemp=pointage.numemp where pointage='Non' and datepointage='"+selectdate+"'");
                
            while (table.getRowCount()>0)
            {
                ((DefaultTableModel)table.getModel()).removeRow(0);
            }
            
            int col=rs.getMetaData().getColumnCount();
            
            while (rs.next())
            {
                Object [] rows= new Object [col];
                
                for (int i=1;i<=col;i++)
                {
                    rows[i-1]=rs.getObject(i);
                }
                 ((DefaultTableModel)table.getModel()).insertRow(rs.getRow() -1,rows);
            }
            
            rs.close();
            st.close();
          
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
// -------------------------------------Nombre de Congés disponibles------------------------------------------ Done
     
     public int CongeDispo (Connection connection,JTextField conge_numemp) throws SQLException
     {
         Statement st;
         ResultSet rs;
         
         String numemp=conge_numemp.getText();
         st= connection.createStatement();
         rs=st.executeQuery("Select * from conge where numemp='"+numemp+"'");
         
         rs.next();
         int nbrjr=rs.getInt("nbrjr");
         
       
        int conge=30-nbrjr;
            
         return conge;
     } 
     
//-------------------------------------------Recherche avec like ---------------------------------------------- Done
     public void Recherche(Connection connection,JTable table,JTextField search_Nom)
     {
         try {
             Statement st;
             ResultSet rs;
              st = connection.createStatement();
              String Nom=search_Nom.getText();
           
            rs= st.executeQuery("Select * from employe where Nom like '%"+Nom+"%' or Prenom like '%"+Nom+"%'");
        
            while (table.getRowCount()>0)
            {
                ((DefaultTableModel)table.getModel()).removeRow(0);
            }
            
            int col=rs.getMetaData().getColumnCount();
            
            while (rs.next())
            {
                Object [] rows= new Object [col];
                
                for (int i=1;i<=col;i++)
                {
                    rows[i-1]=rs.getObject(i);
                }
                 ((DefaultTableModel)table.getModel()).insertRow(rs.getRow() -1,rows);
            }
            
            rs.close();
            st.close();
         } catch (SQLException ex) {
             Logger.getLogger(Functions_2.class.getName()).log(Level.SEVERE, null, ex);
         }
    }  
    //----------------------------------------Salaire d'un employé---------------------------------------------------
    public int Salaire (Connection connection,String numemp) throws SQLException
    {

        int salaire_SI=Getsalaire(connection,numemp);
            System.out.println(salaire_SI);
            int nbrjr =Getnbrjr(connection,numemp);
              System.out.println(nbrjr);
            int salaire_SA=salaire_SI-(10000*nbrjr);
             System.out.println(salaire_SA);
            return salaire_SA;
      
    }
    
   // --------------------------------------------GetDate ------------------------------------------------------
    public String Getdate(Connection connection,JDateChooser datePayement) throws SQLException
    {
        Statement st;
        ResultSet rs;
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String theDate= dateFormat.format(datePayement.getDate());
               
        st=connection.createStatement();
        rs=st.executeQuery("Select * from payement where datepayement='"+theDate+"'");
        rs.next();
        
        String date=rs.getString("datePayement");
       
        return date;
    }
    
    //----------------------------------------------GetNom----------------------------------------------------
    public String Getnom (Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
        st=connection.createStatement();
        rs=st.executeQuery("Select * from employe where numemp='"+numemp+"'");
        rs.next();
        
        String nom=rs.getString("Nom");
         return nom;
    }
    
    //----------------------------------------------GetPrenom----------------------------------------------------
    
     public String Getprenom (Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
        st=connection.createStatement();
        rs=st.executeQuery("Select * from employe where numemp='"+numemp+"'");
        rs.next();
        
        String Prenom=rs.getString("Prenom");
         return Prenom;
    }
    
    //----------------------------------------------GetSalaire----------------------------------------------------
    
    public int Getsalaire(Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
        st=connection.createStatement();
        rs=st.executeQuery("Select * from employe where numemp='"+numemp+"'");
        rs.next();
        int salaire=rs.getInt("salaire");
    return salaire;
    }
    
    //----------------------------------------------GetNbrjours----------------------------------------------------
    
    public int Getnbrjr(Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
        st=connection.createStatement();
        rs=st.executeQuery("Select * from conge where numemp='"+numemp+"'");
        
        if (!rs.next())
        {
           int nbrjr=0;
            return nbrjr;
        }
        
        /*if (numconge==0)
        {int nbrjr=0;
         return nbrjr;}*/
        else {
           int nbrjr= Getconge(connection,numemp);
            return nbrjr;
        
        }
        
    }
    
    //-----------------------------------------------Abscence--------------------------------------------------
     public int Getconge(Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
           st=connection.createStatement();
            rs=st.executeQuery("Select * from conge where numemp='"+numemp+"'");
            rs.next();
             
            int nbrjr=rs.getInt("nbrjr");
          
        return nbrjr;
    }
  
    //----------------------------------------------GetPoste----------------------------------------------------
    
    public String Getposte(Connection connection,String numemp) throws SQLException
    {
        Statement st;
        ResultSet rs;
        
        st=connection.createStatement();
        rs=st.executeQuery("Select * from employe where numemp='"+numemp+"'");
        rs.next();
        String poste=rs.getString("poste");
        System.out.println(poste);
        return poste;
    }
  
    //------------------------------------PDF-----------------------------------------------------------------
    public void imprimer(String numemp,String nom,String prenom,String poste,int nbrjr,int montant) throws IOException, DocumentException
    {
      
         Document document=new Document();
         PdfWriter.getInstance(document, new FileOutputStream("Fiche.pdf"));
            
            document.open();
            Paragraph titrePdf=new Paragraph("Fiche de paie");
            document.add(titrePdf);
            
            Paragraph titre=new Paragraph("----------------");
            document.add(titre);
            
            
             Paragraph EPdf=new Paragraph("  ");
            document.add(EPdf);
            
            Paragraph numPdf=new Paragraph("Numéro   : " +numemp);
            document.add(numPdf);
            
             Paragraph E1Pdf=new Paragraph("  ");
            document.add(E1Pdf);
            
            Paragraph nomPdf=new Paragraph("Nom        : " +nom);
            document.add(nomPdf);
            
             Paragraph E2Pdf=new Paragraph("  ");
            document.add(E2Pdf);
            
            Paragraph prenomPdf=new Paragraph("Prenom   : " +prenom);
            document.add(prenomPdf);
            
             Paragraph E3Pdf=new Paragraph("  ");
            document.add(E3Pdf);
            
            Paragraph postePdf=new Paragraph("Poste       : " +poste);
            document.add(postePdf);
            
             Paragraph E4Pdf=new Paragraph("  ");
            document.add(E4Pdf);
               
             Paragraph E7Pdf=new Paragraph("  ");
            document.add(E7Pdf);
            
            Paragraph abscencePdf=new Paragraph("Nombre d'abscence : " +nbrjr);
            document.add(abscencePdf);
            
             Paragraph E5Pdf=new Paragraph("  ");
            document.add(E5Pdf);
            
            Paragraph montantPdf=new Paragraph("Montant           : " +montant+"Ar");
            document.add(montantPdf);
            
            
            //ouvrir fichier directement
            File file=new File ("Fiche.pdf");
            Desktop.getDesktop().open(file);
            document.close();
            
            System.out.println("Mety");
     
    }

     
//Manidy class

}
