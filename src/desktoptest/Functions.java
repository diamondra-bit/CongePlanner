/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desktoptest;

import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diamondra
 */
public class Functions {
    
        
    //Connection
    public Connection Connect_db(){
        Connection con=null;
        try{
            //Connexion
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/gestion_personnel","postgres","admin");
            System.out.println("Connecté");
        }catch(ClassNotFoundException | SQLException e){
        e.getMessage();
        }
        return con;
    }
//-------------------------------------------------Table Employe--------------------------------------------------------------
    
    //Pour Afficher
    public  void Affiche(Connection con,JTable table)
    {
        Statement st;
        ResultSet rs;
        
        try{
           
            //Affichage requetes
            st = con.createStatement();
            rs= st.executeQuery("Select * from employe");
        
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
          
        }catch(SQLException e){
        System.out.println("Failed");
        }
    }
    
    //Pour Ajouter
      public void InsertTable (Connection connection,JTextField chnum,JTextField chnom,JTextField chprenom,JTextField chposte,JTextField chsalaire)
    { 
       PreparedStatement pst;
      
      
            try{
                pst=connection.prepareStatement("insert into employe (numemp,Nom,Prenom,poste,salaire)values (?,?,?,?,?)");
                System.out.println("Mandeha");
               
                pst.setString(1, chnum.getText());
                pst.setString(2, chnom.getText());
                pst.setString(3, chprenom.getText());
                pst.setString(4, chposte.getText());
                pst.setInt(5, Integer.parseInt(chsalaire.getText()));
                    
                System.out.println("Mandeha ny pst1");
                pst.executeUpdate();
                System.out.println("Mandeha ny execute");
              
            } catch(SQLException e){
               e.getMessage();
            }
    }
      
      //Modification 2
      public String getId(Connection connection,JTable jTable)
      {
            String id=jTable.getValueAt(jTable.getSelectedRow(),0 ).toString();
            System.out.println(id);
              return id;
      }
      
      public void Update_1(Connection connection,String id,JTable jTable,JTextField chnum,JTextField chnom,JTextField chprenom,JTextField chposte,JTextField chsalaire) throws SQLException
    { 
        Statement st;
        ResultSet rs;
        
        try {
              
              st=connection.createStatement();               
              rs=st.executeQuery("Select * from employe where numemp='"+id+"'");
              
              if (rs.next()){
                  chnum.setText(rs.getString(1));
                  chnom.setText(rs.getString(2));
                  chprenom.setText(rs.getString(3));
                  chposte.setText(rs.getString(4));
                  chsalaire.setText(rs.getInt(5)+"");
              }
          
              rs.close();
              st.close();
              
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public void Update_2 (Connection connection,JTextField chnum,JTextField chnom,JTextField chprenom,JTextField chposte,JTextField chsalaire){
    
        try {
            Statement st;
            String numemp=chnum.getText();
            String nom=chnom.getText();
            String prenom=chprenom.getText();
            String poste=chposte.getText();
            int salaire=Integer.parseInt(chsalaire.getText());
            
            st=connection.createStatement();
            st.executeQuery("Update employe set  Nom='"+nom+"',Prenom='"+prenom+"',poste='"+poste+"',salaire="+salaire+" where numemp='"+numemp+"'");
            
                    } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

//Pour annuler
    public void Annuler(JTextField chnum,JTextField chnom,JTextField chprenom,JTextField chposte,JTextField chsalaire)
    {
            chnum.setText("");
            chnom.setText("");
            chprenom.setText("");
            chposte.setText("");
            chsalaire.setText("");
    }
    
//Pour effacer dans une table
    public void Delete(Connection connection,JTable jTable,JTextField chnum)
    {
        try {
           
            Statement st;
            st=connection.createStatement();
            String numemp=chnum.getText();
            System.out.println("Delete N°"+numemp);
           
            st.executeUpdate("Delete from employe where numemp='"+numemp+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

   
   
//------------------------------------------Table Pointage-----------------------------------------------------------------
   
   
//Pour Ajouter
      public void InsertTable2 (Connection connection,JDateChooser datepointage,JTextField chnum,JTextField chpointage)
    { 
       PreparedStatement pst;
      
      
            try{
                pst=connection.prepareStatement("insert into pointage values (?,?,?)");
                
               
            
                SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                String theDate= dateFormat.format(datepointage.getDate());
                pst.setString(1,theDate);
                
                pst.setString(2, chnum.getText());
                  
                pst.setString(3, chpointage.getText());
                
                
                pst.executeUpdate();
                System.out.println("Ajout avec succès");
              
            } catch(SQLException e){
               e.getMessage();
            }
    }
      
       //Pour Afficher
    public void Affiche2(Connection con,JTable table)
    {
        Statement st;
        ResultSet rs;
        
        try{
           
            //Affichage requetes
            st = con.createStatement();
            rs= st.executeQuery("Select * from pointage");
        
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
          
        }catch(SQLException e){
        System.out.println("Failed");
        }
    }
    
    
    //Pour modifier
    public String getId2(Connection connection,JTable jTable)
      {
            String id=jTable.getValueAt(jTable.getSelectedRow(),1).toString();
              return id;
      }
    
      
      public void Update_12(Connection connection,String id,JTable table,JDateChooser date,JTextField chnum,JTextField chpointage) throws SQLException, ParseException
    { 
        Statement st;
        ResultSet rs;
        
        try {
            
              st=connection.createStatement();               
              rs=st.executeQuery("Select * from pointage where numemp='"+id+"'");
              
              if (rs.next()){
            DefaultTableModel model= (DefaultTableModel)table.getModel();
            int selectedRow=table.getSelectedRow();
            
            String var=(String)model.getValueAt(selectedRow, 0).toString();
            java.util.Date dateA=new SimpleDateFormat("yyyy-MM-dd").parse(var);
            date.setDate(dateA);
                  
            chnum.setText(rs.getString(2));
            chpointage.setText(rs.getString(3));
              }
          
              rs.close();
              st.close();
              
        } catch (SQLException ex) {
           
        }
    }
 
    public void Update_22 (Connection connection,JDateChooser chdate,JTextField chnum,JTextField chpointage){
    
        try {
            Statement st;
            String numemp=chnum.getText();
            String selectdate=((JTextField)chdate.getDateEditor().getUiComponent()).getText();
            String pointage=chpointage.getText();
            
            //???
            
            st=connection.createStatement();
            st.executeQuery("Update pointage set datePointage='"+selectdate+"',pointage='"+pointage+"' where numemp='"+numemp+"'");
            
                    } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    
      
    //Pour annuler
    public void Annuler2(JDateChooser datepointage,JTextField chnum,JTextField chpointage)
    {
           
            chnum.setText("");
            chpointage.setText("");
            datepointage.setDate(null);
    }
    
    //Pour effacer
     public void Delete2(Connection connection,JTable jTable,JTextField chnum)
    {
        try {
           
            Statement st;
            st=connection.createStatement();
            String numemp=chnum.getText();
        
           
            st.executeUpdate("Delete from pointage where numemp='"+numemp+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
     
     
    
     //----------------------------------Table Conge -------------------------------------------------------
     
     //Pour Ajouter
 public void InsertTable3 (Connection connection,JTextField chnumconge,JTextField chnum,JTextField chmotif,JTextField chnbrjr,JDateChooser dateDemande,JDateChooser dateRetour)
    { 
       PreparedStatement pst;
      
      
            try{
                pst=connection.prepareStatement("insert into conge  values (?,?,?,?,?,?)");
                
               
                pst.setInt(1, Integer.parseInt(chnumconge.getText()));            
                 pst.setString(2, chnum.getText());
                pst.setString(3, chmotif.getText());
                pst.setInt(4, Integer.parseInt(chnbrjr.getText()));
                String selectdateDemande=((JTextField)dateDemande.getDateEditor().getUiComponent()).getText();
                String selectdateRetour=((JTextField)dateRetour.getDateEditor().getUiComponent()).getText();
                
                pst.setString(5, selectdateDemande);
                pst.setString(6, selectdateRetour);

                pst.executeUpdate();
             
            } catch(SQLException e){
               e.getMessage();
            }
    }
     
      //Pour Afficher
    public void Affiche3(Connection con,JTable table)
    {
        Statement st;
        ResultSet rs;
        
        try{
           
            //Affichage requetes
            st = con.createStatement();
            rs= st.executeQuery("Select * from conge");
        
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
          
        }catch(SQLException e){
        System.out.println("Failed");
        }
    }
    
    public String getId3(Connection connection,JTable jTable)
      {
            String id=jTable.getValueAt(jTable.getSelectedRow(),1).toString();
              return id;
      }
    
      public void Update_13(Connection connection,String id,JTextField chnumconge,JTextField chnumemp,JTextField chmotif,JTextField chnbrjr,JDateChooser dateD,JDateChooser dateR) throws SQLException, ParseException
    { 
        Statement st;
        ResultSet rs;
        
        try {
            
              st=connection.createStatement();               
              rs=st.executeQuery("Select * from conge where numemp='"+id+"'");
              
              if (rs.next()){
            chnumconge.setText(rs.getString(1)+"");
            chnumemp.setText(rs.getString(2));
            chmotif.setText(rs.getString(3));
            chnbrjr.setText(rs.getInt(4)+"");  
            dateD.setDate(rs.getDate(5));
            dateR.setDate(rs.getDate(6));
                  
            
              }
          
              rs.close();
              st.close();
              
        } catch (SQLException ex) {
           
        }
    }
 
    public void Modifier23(Connection connection,JTable table,JTextField chnumemp,JTextField chnumconge,JTextField chmotif,JTextField chnbrjr,JDateChooser dateD,JDateChooser dateR) throws SQLException, ParseException
    { 
            Statement st;
         String numemp=chnumemp.getText();
          
         String motif=chmotif.getText();
           int nombre=Integer.parseInt(chnbrjr.getText());
           int numconge=Integer.parseInt(chnumconge.getText());
           
            String dateDemande=((JTextField)dateD.getDateEditor().getUiComponent()).getText();
            String dateRetour=((JTextField)dateR.getDateEditor().getUiComponent()).getText();
           
           
            st=connection.createStatement();
            
            st.executeQuery("Update conge set  motif='"+motif+"',nbrjr="+nombre+",dateDemande='"+dateDemande+"',dateRetour='"+dateRetour+"' where numemp='"+numemp+"' and numconge="+numconge);
            
            
                   
    } 

    
    //Pour effacer
     public void Delete3(Connection connection,JTable jTable,JTextField chnum,JTextField chnumconge)
    {
        try {
           
            Statement st;
            
            st=connection.createStatement();
           
            String numemp=chnum.getText();
           int numconge=Integer.parseInt(chnumconge.getText());
           
            st.executeUpdate("Delete from conge where numemp='"+numemp+"' and numconge="+numconge);
        } catch (SQLException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
     
     //Pour annuler
    public void Annuler3 (JTextField chnum,JTextField chnumconge,JTextField chmotif,JTextField chnbrjr,JDateChooser dateDemande,JDateChooser dateRetour)
    
    {
           chnumconge.setText("");
            chnum.setText("");
            chmotif.setText("");
            chnbrjr.setText("");
            
            dateDemande.setDate(null);
            dateRetour.setDate(null);
    }
    
    //Get numconge
    public int numconge(Connection connection,String numemp) throws SQLException
    {
    Statement st;
    ResultSet rs;
    
    st=connection.createStatement();
    rs=st.executeQuery("Select * from conge where numemp='"+numemp+"'");
    rs.next();
    int numconge=rs.getInt("numconge");
    return numconge;  
    }
    
    //----------------------------PDF -----------------------------------------
    public void imprimer()
    {
    System.out.println("Mety");
    }
//Manidy class      
}
