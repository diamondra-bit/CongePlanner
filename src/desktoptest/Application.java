package desktoptest;


import java.sql.*;
import java.text.ParseException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Application extends javax.swing.JFrame {

    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        action.Affiche(con, table_employe);
        action.Affiche2(con, table_pointage);
        action.Affiche3(con, table_conge);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employe_num = new javax.swing.JTextField();
        employe_nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        employe_prenom = new javax.swing.JTextField();
        employe_poste = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        employe_salaire = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        employe_ajouter = new javax.swing.JPanel();
        ajouterEmpltxt = new javax.swing.JLabel();
        employe_supprimer = new javax.swing.JPanel();
        supprimerEmpltxt = new javax.swing.JLabel();
        employe_annuler = new javax.swing.JPanel();
        annulerEmpltxt = new javax.swing.JLabel();
        employe_modifier = new javax.swing.JPanel();
        modifiertEmplxt = new javax.swing.JLabel();
        search_Nom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_employe = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pointage_date = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        pointage_empl = new javax.swing.JTextField();
        pointage_point = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pointage_ajouter = new javax.swing.JPanel();
        pointageAjoutertxt = new javax.swing.JLabel();
        pointage_supprimer = new javax.swing.JPanel();
        pointageSupprimertxt = new javax.swing.JLabel();
        pointage_modif = new javax.swing.JPanel();
        pointageModifiertxt = new javax.swing.JLabel();
        pointage_annuler = new javax.swing.JPanel();
        pointageAnnulertxt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pointage = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        employebtn = new javax.swing.JPanel();
        emplTxt = new javax.swing.JLabel();
        pointagebtn = new javax.swing.JPanel();
        pointageTxt = new javax.swing.JLabel();
        congebtn = new javax.swing.JPanel();
        congeTxt = new javax.swing.JLabel();
        abscencebtn = new javax.swing.JPanel();
        emplTxt1 = new javax.swing.JLabel();
        congeRestbtn = new javax.swing.JPanel();
        pointageTxt1 = new javax.swing.JLabel();
        pdfbtn = new javax.swing.JPanel();
        congeTxt1 = new javax.swing.JLabel();
        salairebtn = new javax.swing.JPanel();
        congeTxt2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        main = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        Date = new javax.swing.JLabel();
        abscence_envoyer = new javax.swing.JButton();
        abscence_date = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_abscence = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        conge_numemp = new javax.swing.JTextField();
        Envoyer_congedispo1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        conge_text = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        salaire_numemp = new javax.swing.JTextField();
        GetSalaire = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        numconge = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        salaire_nom = new javax.swing.JTextField();
        salaire_absence = new javax.swing.JTextField();
        salaire_SI = new javax.swing.JTextField();
        salaire_SA = new javax.swing.JTextField();
        salaire_prenom = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        conge_numconge = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        conge_ajouter = new javax.swing.JPanel();
        conge_ajouttxt = new javax.swing.JLabel();
        conge_supprimer = new javax.swing.JPanel();
        conge_supprimertxt = new javax.swing.JLabel();
        conge_modif = new javax.swing.JPanel();
        conge_modiftxt = new javax.swing.JLabel();
        conge_annuler = new javax.swing.JPanel();
        conge_annulertxt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_conge = new javax.swing.JTable();
        conge_dateDemande = new com.toedter.calendar.JDateChooser();
        conge_dateRetour = new com.toedter.calendar.JDateChooser();
        conge_nbrjr = new javax.swing.JTextField();
        conge_motif = new javax.swing.JTextField();
        conge_numempl = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion des employés");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Id");

        employe_num.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_num.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_num.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_num.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_numActionPerformed(evt);
            }
        });

        employe_nom.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_nom.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_nom.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_nom.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_nomActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nom");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Prenom");

        employe_prenom.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_prenom.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_prenom.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_prenom.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_prenomActionPerformed(evt);
            }
        });

        employe_poste.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_poste.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_poste.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_poste.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_poste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_posteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Poste");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Salaire");

        employe_salaire.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_salaire.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_salaire.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_salaire.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_salaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_salaireActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        employe_ajouter.setBackground(new java.awt.Color(0, 102, 102));
        employe_ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        employe_ajouter.setForeground(new java.awt.Color(255, 255, 255));
        employe_ajouter.setMaximumSize(new java.awt.Dimension(250, 40));
        employe_ajouter.setMinimumSize(new java.awt.Dimension(250, 40));
        employe_ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employe_ajouterMousePressed(evt);
            }
        });

        ajouterEmpltxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        ajouterEmpltxt.setForeground(new java.awt.Color(255, 255, 255));
        ajouterEmpltxt.setText("AJOUTER");
        ajouterEmpltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajouterEmpltxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout employe_ajouterLayout = new javax.swing.GroupLayout(employe_ajouter);
        employe_ajouter.setLayout(employe_ajouterLayout);
        employe_ajouterLayout.setHorizontalGroup(
            employe_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_ajouterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ajouterEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employe_ajouterLayout.setVerticalGroup(
            employe_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouterEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employe_supprimer.setBackground(new java.awt.Color(0, 102, 102));
        employe_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        employe_supprimer.setForeground(new java.awt.Color(255, 255, 255));
        employe_supprimer.setMaximumSize(new java.awt.Dimension(250, 40));
        employe_supprimer.setMinimumSize(new java.awt.Dimension(250, 40));
        employe_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employe_supprimerMousePressed(evt);
            }
        });

        supprimerEmpltxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        supprimerEmpltxt.setForeground(new java.awt.Color(255, 255, 255));
        supprimerEmpltxt.setText("SUPPRIMER");
        supprimerEmpltxt.setMaximumSize(new java.awt.Dimension(250, 40));
        supprimerEmpltxt.setMinimumSize(new java.awt.Dimension(250, 40));
        supprimerEmpltxt.setPreferredSize(new java.awt.Dimension(250, 40));
        supprimerEmpltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supprimerEmpltxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout employe_supprimerLayout = new javax.swing.GroupLayout(employe_supprimer);
        employe_supprimer.setLayout(employe_supprimerLayout);
        employe_supprimerLayout.setHorizontalGroup(
            employe_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_supprimerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(supprimerEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employe_supprimerLayout.setVerticalGroup(
            employe_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_supprimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supprimerEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employe_annuler.setBackground(new java.awt.Color(0, 102, 102));
        employe_annuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        employe_annuler.setForeground(new java.awt.Color(255, 255, 255));
        employe_annuler.setMaximumSize(new java.awt.Dimension(250, 40));
        employe_annuler.setMinimumSize(new java.awt.Dimension(250, 40));
        employe_annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employe_annulerMousePressed(evt);
            }
        });

        annulerEmpltxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        annulerEmpltxt.setForeground(new java.awt.Color(255, 255, 255));
        annulerEmpltxt.setText("ANNULER");
        annulerEmpltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annulerEmpltxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout employe_annulerLayout = new javax.swing.GroupLayout(employe_annuler);
        employe_annuler.setLayout(employe_annulerLayout);
        employe_annulerLayout.setHorizontalGroup(
            employe_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_annulerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(annulerEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employe_annulerLayout.setVerticalGroup(
            employe_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_annulerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annulerEmpltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        employe_modifier.setBackground(new java.awt.Color(0, 102, 102));
        employe_modifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        employe_modifier.setForeground(new java.awt.Color(255, 255, 255));
        employe_modifier.setMaximumSize(new java.awt.Dimension(250, 40));
        employe_modifier.setMinimumSize(new java.awt.Dimension(250, 40));
        employe_modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employe_modifierMousePressed(evt);
            }
        });

        modifiertEmplxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        modifiertEmplxt.setForeground(new java.awt.Color(255, 255, 255));
        modifiertEmplxt.setText("MODIFIER");
        modifiertEmplxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifiertEmplxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout employe_modifierLayout = new javax.swing.GroupLayout(employe_modifier);
        employe_modifier.setLayout(employe_modifierLayout);
        employe_modifierLayout.setHorizontalGroup(
            employe_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_modifierLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(modifiertEmplxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employe_modifierLayout.setVerticalGroup(
            employe_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employe_modifierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifiertEmplxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employe_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(employe_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employe_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employe_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(employe_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        search_Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_NomActionPerformed(evt);
            }
        });

        table_employe.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        table_employe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro empoyé", "Nom", "Prenom", "Poste", "Salaire"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_employe.setGridColor(new java.awt.Color(0, 102, 102));
        table_employe.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table_employe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_employeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_employeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_employe);

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Rechercher");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addGap(23, 23, 23))
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employe_salaire, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employe_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employe_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employe_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employe_num, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(search_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(183, 183, 183))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(employe_num, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employe_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employe_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employe_poste, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(employe_salaire, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gestion de pointage");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Date de Pointage");

        pointage_date.setDateFormatString("yyyy-MM-dd");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("N° Employé");

        pointage_empl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pointage_empl.setMaximumSize(new java.awt.Dimension(50, 18));
        pointage_empl.setMinimumSize(new java.awt.Dimension(50, 18));
        pointage_empl.setPreferredSize(new java.awt.Dimension(50, 18));
        pointage_empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointage_emplActionPerformed(evt);
            }
        });

        pointage_point.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        pointage_point.setMaximumSize(new java.awt.Dimension(50, 18));
        pointage_point.setMinimumSize(new java.awt.Dimension(50, 18));
        pointage_point.setPreferredSize(new java.awt.Dimension(50, 18));
        pointage_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointage_pointActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Pointage");

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pointage_ajouter.setBackground(new java.awt.Color(0, 102, 102));
        pointage_ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pointage_ajouter.setForeground(new java.awt.Color(255, 255, 255));
        pointage_ajouter.setMaximumSize(new java.awt.Dimension(250, 40));
        pointage_ajouter.setMinimumSize(new java.awt.Dimension(250, 40));
        pointage_ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointage_ajouterMousePressed(evt);
            }
        });

        pointageAjoutertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        pointageAjoutertxt.setForeground(new java.awt.Color(255, 255, 255));
        pointageAjoutertxt.setText("AJOUTER");
        pointageAjoutertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointageAjoutertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pointage_ajouterLayout = new javax.swing.GroupLayout(pointage_ajouter);
        pointage_ajouter.setLayout(pointage_ajouterLayout);
        pointage_ajouterLayout.setHorizontalGroup(
            pointage_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_ajouterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pointageAjoutertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pointage_ajouterLayout.setVerticalGroup(
            pointage_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pointageAjoutertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pointage_supprimer.setBackground(new java.awt.Color(0, 102, 102));
        pointage_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pointage_supprimer.setForeground(new java.awt.Color(255, 255, 255));
        pointage_supprimer.setMaximumSize(new java.awt.Dimension(250, 40));
        pointage_supprimer.setMinimumSize(new java.awt.Dimension(250, 40));
        pointage_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointage_supprimerMousePressed(evt);
            }
        });

        pointageSupprimertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        pointageSupprimertxt.setForeground(new java.awt.Color(255, 255, 255));
        pointageSupprimertxt.setText("SUPPRIMER");
        pointageSupprimertxt.setMaximumSize(new java.awt.Dimension(250, 40));
        pointageSupprimertxt.setMinimumSize(new java.awt.Dimension(250, 40));
        pointageSupprimertxt.setPreferredSize(new java.awt.Dimension(250, 40));
        pointageSupprimertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointageSupprimertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pointage_supprimerLayout = new javax.swing.GroupLayout(pointage_supprimer);
        pointage_supprimer.setLayout(pointage_supprimerLayout);
        pointage_supprimerLayout.setHorizontalGroup(
            pointage_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_supprimerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(pointageSupprimertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pointage_supprimerLayout.setVerticalGroup(
            pointage_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_supprimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pointageSupprimertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pointage_modif.setBackground(new java.awt.Color(0, 102, 102));
        pointage_modif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pointage_modif.setForeground(new java.awt.Color(255, 255, 255));
        pointage_modif.setMaximumSize(new java.awt.Dimension(250, 40));
        pointage_modif.setMinimumSize(new java.awt.Dimension(250, 40));
        pointage_modif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointage_modifMousePressed(evt);
            }
        });

        pointageModifiertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        pointageModifiertxt.setForeground(new java.awt.Color(255, 255, 255));
        pointageModifiertxt.setText("MODIFIER");
        pointageModifiertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointageModifiertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pointage_modifLayout = new javax.swing.GroupLayout(pointage_modif);
        pointage_modif.setLayout(pointage_modifLayout);
        pointage_modifLayout.setHorizontalGroup(
            pointage_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_modifLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pointageModifiertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pointage_modifLayout.setVerticalGroup(
            pointage_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_modifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pointageModifiertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pointage_annuler.setBackground(new java.awt.Color(0, 102, 102));
        pointage_annuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pointage_annuler.setForeground(new java.awt.Color(255, 255, 255));
        pointage_annuler.setMaximumSize(new java.awt.Dimension(250, 40));
        pointage_annuler.setMinimumSize(new java.awt.Dimension(250, 40));
        pointage_annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointage_annulerMousePressed(evt);
            }
        });

        pointageAnnulertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        pointageAnnulertxt.setForeground(new java.awt.Color(255, 255, 255));
        pointageAnnulertxt.setText("ANNULER");
        pointageAnnulertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointageAnnulertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pointage_annulerLayout = new javax.swing.GroupLayout(pointage_annuler);
        pointage_annuler.setLayout(pointage_annulerLayout);
        pointage_annulerLayout.setHorizontalGroup(
            pointage_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_annulerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pointageAnnulertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pointage_annulerLayout.setVerticalGroup(
            pointage_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointage_annulerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pointageAnnulertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pointage_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointage_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointage_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointage_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pointage_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pointage_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pointage_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(pointage_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        table_pointage.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        table_pointage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date de Pointage", "N° Employé", "Pointage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_pointage.setGridColor(new java.awt.Color(0, 102, 102));
        table_pointage.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table_pointage.setShowHorizontalLines(true);
        table_pointage.setShowVerticalLines(true);
        table_pointage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pointageMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_pointageMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(table_pointage);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pointage_point, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pointage_empl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pointage_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(87, 87, 87)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(pointage_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(pointage_empl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12)))
                                        .addComponent(jLabel11))
                                    .addGap(35, 35, 35)
                                    .addComponent(pointage_point, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 700));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entreprise Art'Soa");

        employebtn.setBackground(new java.awt.Color(255, 255, 255));
        employebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                employebtnMousePressed(evt);
            }
        });

        emplTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emplTxt.setForeground(new java.awt.Color(0, 102, 102));
        emplTxt.setText("EMPLOYE");

        javax.swing.GroupLayout employebtnLayout = new javax.swing.GroupLayout(employebtn);
        employebtn.setLayout(employebtnLayout);
        employebtnLayout.setHorizontalGroup(
            employebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
            .addGroup(employebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(employebtnLayout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addComponent(emplTxt)
                    .addGap(0, 52, Short.MAX_VALUE)))
        );
        employebtnLayout.setVerticalGroup(
            employebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(employebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(employebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(emplTxt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pointagebtn.setBackground(new java.awt.Color(255, 255, 255));
        pointagebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pointagebtnMousePressed(evt);
            }
        });

        pointageTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pointageTxt.setForeground(new java.awt.Color(0, 102, 102));
        pointageTxt.setText("POINTAGE");

        javax.swing.GroupLayout pointagebtnLayout = new javax.swing.GroupLayout(pointagebtn);
        pointagebtn.setLayout(pointagebtnLayout);
        pointagebtnLayout.setHorizontalGroup(
            pointagebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pointagebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pointagebtnLayout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(pointageTxt)
                    .addGap(0, 48, Short.MAX_VALUE)))
        );
        pointagebtnLayout.setVerticalGroup(
            pointagebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pointagebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pointagebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pointageTxt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        congebtn.setBackground(new java.awt.Color(255, 255, 255));
        congebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                congebtnMousePressed(evt);
            }
        });

        congeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        congeTxt.setForeground(new java.awt.Color(0, 102, 102));
        congeTxt.setText("CONGE");

        javax.swing.GroupLayout congebtnLayout = new javax.swing.GroupLayout(congebtn);
        congebtn.setLayout(congebtnLayout);
        congebtnLayout.setHorizontalGroup(
            congebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(congebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(congebtnLayout.createSequentialGroup()
                    .addGap(0, 60, Short.MAX_VALUE)
                    .addComponent(congeTxt)
                    .addGap(0, 60, Short.MAX_VALUE)))
        );
        congebtnLayout.setVerticalGroup(
            congebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(congebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(congebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(congeTxt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        abscencebtn.setBackground(new java.awt.Color(255, 255, 255));
        abscencebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abscencebtnMousePressed(evt);
            }
        });

        emplTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emplTxt1.setForeground(new java.awt.Color(0, 102, 102));
        emplTxt1.setText("ABSCENCE");

        javax.swing.GroupLayout abscencebtnLayout = new javax.swing.GroupLayout(abscencebtn);
        abscencebtn.setLayout(abscencebtnLayout);
        abscencebtnLayout.setHorizontalGroup(
            abscencebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(abscencebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(abscencebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(emplTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        abscencebtnLayout.setVerticalGroup(
            abscencebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(abscencebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(abscencebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(emplTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        congeRestbtn.setBackground(new java.awt.Color(255, 255, 255));
        congeRestbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                congeRestbtnMousePressed(evt);
            }
        });

        pointageTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pointageTxt1.setForeground(new java.awt.Color(0, 102, 102));
        pointageTxt1.setText("CONGE RESTANT");

        javax.swing.GroupLayout congeRestbtnLayout = new javax.swing.GroupLayout(congeRestbtn);
        congeRestbtn.setLayout(congeRestbtnLayout);
        congeRestbtnLayout.setHorizontalGroup(
            congeRestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(congeRestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(congeRestbtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pointageTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        congeRestbtnLayout.setVerticalGroup(
            congeRestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(congeRestbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(congeRestbtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pointageTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pdfbtn.setBackground(new java.awt.Color(255, 255, 255));
        pdfbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pdfbtnMousePressed(evt);
            }
        });

        congeTxt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        congeTxt1.setForeground(new java.awt.Color(0, 102, 102));
        congeTxt1.setText("PDF");

        javax.swing.GroupLayout pdfbtnLayout = new javax.swing.GroupLayout(pdfbtn);
        pdfbtn.setLayout(pdfbtnLayout);
        pdfbtnLayout.setHorizontalGroup(
            pdfbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pdfbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pdfbtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(congeTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pdfbtnLayout.setVerticalGroup(
            pdfbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(pdfbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pdfbtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(congeTxt1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        salairebtn.setBackground(new java.awt.Color(255, 255, 255));
        salairebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salairebtnMousePressed(evt);
            }
        });

        congeTxt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        congeTxt2.setForeground(new java.awt.Color(0, 102, 102));
        congeTxt2.setText("SALAIRE");

        javax.swing.GroupLayout salairebtnLayout = new javax.swing.GroupLayout(salairebtn);
        salairebtn.setLayout(salairebtnLayout);
        salairebtnLayout.setHorizontalGroup(
            salairebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(salairebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salairebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(congeTxt2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        salairebtnLayout.setVerticalGroup(
            salairebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
            .addGroup(salairebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(salairebtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(congeTxt2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(congeRestbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pdfbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(abscencebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salairebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(congebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pointagebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(employebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pointagebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(congebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(abscencebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(congeRestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(salairebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(pdfbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 680));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        main.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("GESTION DU PERSONNEL");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Diamondra\\Documents\\NetBeansProjects\\Desktoptest\\src\\desktoptest\\Icones\\banner-img.png")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 243));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 243));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 243));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1)
                .addContainerGap(218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        main.addTab("tab1", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(0, 102, 102));

        Date.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Date de pointage :");

        abscence_envoyer.setText("Envoyer");
        abscence_envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                abscence_envoyerMousePressed(evt);
            }
        });
        abscence_envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abscence_envoyerActionPerformed(evt);
            }
        });

        abscence_date.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abscence_envoyer)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(abscence_date, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abscence_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Date))
                .addGap(23, 23, 23)
                .addComponent(abscence_envoyer)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        table_abscence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date de pointage", "Numéro Employé", "Nom", "Prénom", "Poste", "Pointage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_abscence);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        main.addTab("tab5", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        jLabel21.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Numéro Employé :");

        conge_numemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conge_numempActionPerformed(evt);
            }
        });

        Envoyer_congedispo1.setText("Envoyer");
        Envoyer_congedispo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Envoyer_congedispo1MousePressed(evt);
            }
        });
        Envoyer_congedispo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Envoyer_congedispo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Envoyer_congedispo1)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conge_numemp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conge_numemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Envoyer_congedispo1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 152, 152)));

        conge_text.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        conge_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(conge_text, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(conge_text, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 252, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        main.addTab("tab6", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(0, 102, 102));

        jLabel22.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Numéro Employé :");

        salaire_numemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaire_numempActionPerformed(evt);
            }
        });

        GetSalaire.setText("Envoyer");
        GetSalaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GetSalaireMousePressed(evt);
            }
        });
        GetSalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetSalaireActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("   Numéro Congé");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GetSalaire)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaire_numemp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numconge, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(115, 115, 115))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaire_numemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numconge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GetSalaire)
                .addGap(19, 19, 19))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel24.setText("Salaire actuelle :");

        jLabel25.setText("Nom :");

        jLabel26.setText("Absence :");

        jLabel27.setText("Salaire initiale :");

        salaire_nom.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        salaire_absence.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        salaire_SI.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        salaire_SA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        salaire_prenom.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        salaire_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaire_prenomActionPerformed(evt);
            }
        });

        jLabel28.setText("Prénom :");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salaire_prenom)
                    .addComponent(salaire_nom)
                    .addComponent(salaire_absence)
                    .addComponent(salaire_SI)
                    .addComponent(salaire_SA, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(salaire_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salaire_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaire_absence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaire_SI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salaire_SA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(213, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 252, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        main.addTab("tab7", jPanel8);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("N° Congé");

        conge_numconge.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        conge_numconge.setMaximumSize(new java.awt.Dimension(50, 18));
        conge_numconge.setMinimumSize(new java.awt.Dimension(50, 18));
        conge_numconge.setPreferredSize(new java.awt.Dimension(50, 18));
        conge_numconge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conge_numcongeActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Gestion de congé");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        conge_ajouter.setBackground(new java.awt.Color(0, 102, 102));
        conge_ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        conge_ajouter.setForeground(new java.awt.Color(255, 255, 255));
        conge_ajouter.setMaximumSize(new java.awt.Dimension(250, 40));
        conge_ajouter.setMinimumSize(new java.awt.Dimension(250, 40));
        conge_ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_ajouterMousePressed(evt);
            }
        });

        conge_ajouttxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        conge_ajouttxt.setForeground(new java.awt.Color(255, 255, 255));
        conge_ajouttxt.setText("AJOUTER");
        conge_ajouttxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_ajouttxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout conge_ajouterLayout = new javax.swing.GroupLayout(conge_ajouter);
        conge_ajouter.setLayout(conge_ajouterLayout);
        conge_ajouterLayout.setHorizontalGroup(
            conge_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_ajouterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(conge_ajouttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conge_ajouterLayout.setVerticalGroup(
            conge_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conge_ajouttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conge_supprimer.setBackground(new java.awt.Color(0, 102, 102));
        conge_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        conge_supprimer.setForeground(new java.awt.Color(255, 255, 255));
        conge_supprimer.setMaximumSize(new java.awt.Dimension(250, 40));
        conge_supprimer.setMinimumSize(new java.awt.Dimension(250, 40));
        conge_supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_supprimerMousePressed(evt);
            }
        });

        conge_supprimertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        conge_supprimertxt.setForeground(new java.awt.Color(255, 255, 255));
        conge_supprimertxt.setText("SUPPRIMER");
        conge_supprimertxt.setMaximumSize(new java.awt.Dimension(250, 40));
        conge_supprimertxt.setMinimumSize(new java.awt.Dimension(250, 40));
        conge_supprimertxt.setPreferredSize(new java.awt.Dimension(250, 40));
        conge_supprimertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_supprimertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout conge_supprimerLayout = new javax.swing.GroupLayout(conge_supprimer);
        conge_supprimer.setLayout(conge_supprimerLayout);
        conge_supprimerLayout.setHorizontalGroup(
            conge_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_supprimerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(conge_supprimertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conge_supprimerLayout.setVerticalGroup(
            conge_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_supprimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conge_supprimertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conge_modif.setBackground(new java.awt.Color(0, 102, 102));
        conge_modif.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        conge_modif.setForeground(new java.awt.Color(255, 255, 255));
        conge_modif.setMaximumSize(new java.awt.Dimension(250, 40));
        conge_modif.setMinimumSize(new java.awt.Dimension(250, 40));
        conge_modif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_modifMousePressed(evt);
            }
        });

        conge_modiftxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        conge_modiftxt.setForeground(new java.awt.Color(255, 255, 255));
        conge_modiftxt.setText("MODIFIER");
        conge_modiftxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_modiftxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout conge_modifLayout = new javax.swing.GroupLayout(conge_modif);
        conge_modif.setLayout(conge_modifLayout);
        conge_modifLayout.setHorizontalGroup(
            conge_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_modifLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(conge_modiftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conge_modifLayout.setVerticalGroup(
            conge_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_modifLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conge_modiftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conge_annuler.setBackground(new java.awt.Color(0, 102, 102));
        conge_annuler.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        conge_annuler.setForeground(new java.awt.Color(255, 255, 255));
        conge_annuler.setMaximumSize(new java.awt.Dimension(250, 40));
        conge_annuler.setMinimumSize(new java.awt.Dimension(250, 40));
        conge_annuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_annulerMousePressed(evt);
            }
        });

        conge_annulertxt.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        conge_annulertxt.setForeground(new java.awt.Color(255, 255, 255));
        conge_annulertxt.setText("ANNULER");
        conge_annulertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                conge_annulertxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout conge_annulerLayout = new javax.swing.GroupLayout(conge_annuler);
        conge_annuler.setLayout(conge_annulerLayout);
        conge_annulerLayout.setHorizontalGroup(
            conge_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_annulerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(conge_annulertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conge_annulerLayout.setVerticalGroup(
            conge_annulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conge_annulerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conge_annulertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conge_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conge_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conge_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conge_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(conge_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conge_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(conge_annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conge_supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        table_conge.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        table_conge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Congé", "N° Employé", "Motif", "Nombre de jours", "Date de demande", "Date de retour"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_conge.setGridColor(new java.awt.Color(0, 102, 102));
        table_conge.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table_conge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_congeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_congeMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(table_conge);

        conge_dateDemande.setDateFormatString("yyyy-MM-dd\n");

        conge_dateRetour.setDateFormatString("yyyy-MM-dd");

        conge_nbrjr.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        conge_nbrjr.setMaximumSize(new java.awt.Dimension(50, 18));
        conge_nbrjr.setMinimumSize(new java.awt.Dimension(50, 18));
        conge_nbrjr.setPreferredSize(new java.awt.Dimension(50, 18));
        conge_nbrjr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conge_nbrjrActionPerformed(evt);
            }
        });

        conge_motif.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        conge_motif.setMaximumSize(new java.awt.Dimension(50, 18));
        conge_motif.setMinimumSize(new java.awt.Dimension(50, 18));
        conge_motif.setPreferredSize(new java.awt.Dimension(50, 18));
        conge_motif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conge_motifActionPerformed(evt);
            }
        });

        conge_numempl.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        conge_numempl.setMaximumSize(new java.awt.Dimension(50, 18));
        conge_numempl.setMinimumSize(new java.awt.Dimension(50, 18));
        conge_numempl.setPreferredSize(new java.awt.Dimension(50, 18));
        conge_numempl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conge_numemplActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("N° Employé");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Motif");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Nombre de jours");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Date de demande");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Date de retour");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(conge_numconge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conge_numempl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conge_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conge_nbrjr, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conge_dateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(conge_dateDemande, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(334, 334, 334)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(conge_numconge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(conge_numempl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(conge_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(conge_nbrjr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(conge_dateDemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(conge_dateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap(204, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(jLabel14)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(79, 79, 79)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        main.addTab("tab4", jPanel5);

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -30, 980, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employebtnMousePressed
      main.setSelectedIndex(1);
    }//GEN-LAST:event_employebtnMousePressed

    private void pointagebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointagebtnMousePressed
       main.setSelectedIndex(2);
    }//GEN-LAST:event_pointagebtnMousePressed

    private void congebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congebtnMousePressed
        main.setSelectedIndex(3);
    }//GEN-LAST:event_congebtnMousePressed

    private void abscencebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abscencebtnMousePressed
          main.setSelectedIndex(4);
    }//GEN-LAST:event_abscencebtnMousePressed

    private void congeRestbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congeRestbtnMousePressed
         main.setSelectedIndex(5);
    }//GEN-LAST:event_congeRestbtnMousePressed

    private void pdfbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfbtnMousePressed
        PdfqPayement pdf=new PdfqPayement();
        pdf.setVisible(true);
        
    }//GEN-LAST:event_pdfbtnMousePressed

    private void salairebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salairebtnMousePressed
      main.setSelectedIndex(6);
    }//GEN-LAST:event_salairebtnMousePressed

    private void employe_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_numActionPerformed

    private void employe_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_nomActionPerformed

    private void employe_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_prenomActionPerformed

    private void employe_posteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_posteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_posteActionPerformed

    private void employe_salaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_salaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_salaireActionPerformed

    private void ajouterEmpltxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterEmpltxtMousePressed
       Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche(con, table_employe);
        action.InsertTable(con, employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_ajouterEmpltxtMousePressed

    private void employe_ajouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_ajouterMousePressed
      Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche(con, table_employe);
        action.InsertTable(con, employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_employe_ajouterMousePressed

    private void supprimerEmpltxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerEmpltxtMousePressed
       Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        action.Delete(con, table_employe, employe_num);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_supprimerEmpltxtMousePressed

    private void employe_supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_supprimerMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        action.Delete(con, table_employe, employe_num);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_employe_supprimerMousePressed

    private void annulerEmpltxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerEmpltxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Annuler(employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
   
    }//GEN-LAST:event_annulerEmpltxtMousePressed

    private void employe_annulerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_annulerMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Annuler(employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
    }//GEN-LAST:event_employe_annulerMousePressed

    private void modifiertEmplxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifiertEmplxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche(con, table_employe);
        action.Update_2(con, employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_modifiertEmplxtMousePressed

    private void employe_modifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employe_modifierMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche(con, table_employe);
        action.Update_2(con, employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
        action.Affiche(con, table_employe);
    }//GEN-LAST:event_employe_modifierMousePressed

    private void search_NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_NomActionPerformed

    private void table_employeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_employeMouseClicked

    }//GEN-LAST:event_table_employeMouseClicked

    private void table_employeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_employeMousePressed
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();
            String id=action.getId(con, table_employe);

            action.Affiche(con, table_employe);
            action.Update_1(con, id, table_employe, employe_num, employe_nom, employe_prenom, employe_poste, employe_salaire);
            action.Affiche(con, table_employe);
        } catch (SQLException ex) {
            Logger.getLogger(Employes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_employeMousePressed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        Connection con;
        Functions action=new Functions();
        Functions_2 action2=new Functions_2();
        con=action.Connect_db();

        table_employe.setVisible(false);
        action2.Recherche(con, table_employe, search_Nom);
        table_employe.setVisible(true);

    }//GEN-LAST:event_searchMousePressed

    private void pointage_emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointage_emplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointage_emplActionPerformed

    private void pointage_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointage_pointActionPerformed
        
    }//GEN-LAST:event_pointage_pointActionPerformed

    private void pointageAjoutertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointageAjoutertxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.InsertTable2(con, pointage_date, pointage_empl, pointage_point);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointageAjoutertxtMousePressed

    private void pointage_ajouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointage_ajouterMousePressed
     Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.InsertTable2(con, pointage_date, pointage_empl, pointage_point);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointage_ajouterMousePressed

    private void pointageSupprimertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointageSupprimertxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        action.Delete2(con, table_pointage, pointage_empl);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointageSupprimertxtMousePressed

    private void pointage_supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointage_supprimerMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        action.Delete2(con, table_pointage, pointage_empl);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointage_supprimerMousePressed

    private void pointageModifiertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointageModifiertxtMousePressed
      Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche2(con, table_pointage);
        action.Update_22(con, pointage_date, pointage_empl, pointage_point);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointageModifiertxtMousePressed

    private void pointage_modifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointage_modifMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche2(con, table_pointage);
        action.Update_22(con, pointage_date, pointage_empl, pointage_point);
        action.Affiche2(con, table_pointage);
    }//GEN-LAST:event_pointage_modifMousePressed

    private void pointageAnnulertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointageAnnulertxtMousePressed
   Functions action=new Functions();

        action.Annuler2(pointage_date, pointage_empl, pointage_point);
    }//GEN-LAST:event_pointageAnnulertxtMousePressed

    private void pointage_annulerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointage_annulerMousePressed

        Functions action=new Functions();

        action.Annuler2(pointage_date, pointage_empl, pointage_point);
    }//GEN-LAST:event_pointage_annulerMousePressed

    private void table_pointageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pointageMouseClicked
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();
            String id=action.getId2(con, table_pointage);

            action.Update_12(con, id, table_pointage, pointage_date, pointage_empl, pointage_point);
            action.Affiche2(con, table_pointage);
        } catch (SQLException ex) {
            Logger.getLogger(Pointage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Pointage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_pointageMouseClicked

    private void table_pointageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pointageMousePressed

    }//GEN-LAST:event_table_pointageMousePressed

    private void conge_numcongeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conge_numcongeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conge_numcongeActionPerformed

    private void conge_ajouttxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_ajouttxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche3(con, table_conge);
        action.InsertTable3(con, conge_numconge, conge_numempl, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
        action.Affiche3(con, table_conge);
    }//GEN-LAST:event_conge_ajouttxtMousePressed

    private void conge_ajouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_ajouterMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche3(con, table_conge);
        action.InsertTable3(con,conge_numconge, conge_numempl, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
        System.out.println("SSS");
        action.Affiche3(con, table_conge);
    }//GEN-LAST:event_conge_ajouterMousePressed

    private void conge_supprimertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_supprimertxtMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Delete3(con, table_conge, conge_numempl, conge_numconge);
        action.Affiche3(con, table_conge);
    }//GEN-LAST:event_conge_supprimertxtMousePressed

    private void conge_supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_supprimerMousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Delete3(con, table_conge, conge_numempl, conge_numconge);
        action.Affiche3(con, table_conge);
    }//GEN-LAST:event_conge_supprimerMousePressed

    private void conge_modiftxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_modiftxtMousePressed
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();

            action.Affiche3(con, table_conge);
            action.Modifier23(con, table_conge, conge_numempl, conge_numconge, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
            action.Affiche3(con, table_conge);
        } catch (SQLException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conge_modiftxtMousePressed

    private void conge_modifMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_modifMousePressed
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();

            action.Affiche3(con, table_conge);
            action.Modifier23(con, table_conge, conge_numempl, conge_numconge, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
            action.Affiche3(con, table_conge);
        } catch (SQLException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_conge_modifMousePressed

    private void conge_annulertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_annulertxtMousePressed

        Functions action=new Functions();
        action.Annuler3(conge_numempl,conge_numconge, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
    }//GEN-LAST:event_conge_annulertxtMousePressed

    private void conge_annulerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conge_annulerMousePressed

        Functions action=new Functions();
        action.Annuler3(conge_numempl, conge_numconge, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
    }//GEN-LAST:event_conge_annulerMousePressed

    private void table_congeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_congeMouseClicked
 try {
            Functions action=new Functions();
            Connection con=action.Connect_db();
            String id=action.getId3(con, table_conge);
            action.Update_13(con, id,  conge_numconge,conge_numempl, conge_motif, conge_nbrjr, conge_dateDemande, conge_dateRetour);
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_congeMouseClicked

    private void table_congeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_congeMousePressed
       
    }//GEN-LAST:event_table_congeMousePressed

    private void conge_nbrjrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conge_nbrjrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conge_nbrjrActionPerformed

    private void conge_motifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conge_motifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conge_motifActionPerformed

    private void conge_numemplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conge_numemplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conge_numemplActionPerformed

    private void abscence_envoyerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abscence_envoyerMousePressed

        Functions action=new Functions ();
        Functions_2 action2 = new Functions_2();
        Connection con;
        con=action.Connect_db();

        action2.Presence(con, table_abscence, abscence_date);

    }//GEN-LAST:event_abscence_envoyerMousePressed

    private void abscence_envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abscence_envoyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abscence_envoyerActionPerformed

    private void conge_numempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conge_numempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conge_numempActionPerformed

    private void Envoyer_congedispo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Envoyer_congedispo1MousePressed
        try {
            Functions action=new Functions ();
            Functions_2 action2 = new Functions_2();
            Connection con;
            con=action.Connect_db();

            int conge=action2.CongeDispo(con, conge_numemp);
            action2.CongeDispo(con, conge_numemp);

            
           
            if (conge==0)
            {
                conge_text.setText("Vous ne pouvez plus bénéficier de congés pour cette année");
            }else{
                conge_text.setText("Vous pouvez encore bénéficier de "+conge+" jours de congés");
            }

        } catch (SQLException ex) {
           conge_text.setText("Vous pouvez bénéficier de 30 jours de congés");
        }
    }//GEN-LAST:event_Envoyer_congedispo1MousePressed

    private void Envoyer_congedispo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Envoyer_congedispo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Envoyer_congedispo1ActionPerformed

    private void salaire_numempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaire_numempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaire_numempActionPerformed

    private void GetSalaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetSalaireMousePressed
        try {
            // try {
                Functions action=new Functions ();
                Functions_2 action2 = new Functions_2();
                Connection con;
                con=action.Connect_db();

                String numemp=salaire_numemp.getText();
                int numconge1=Integer.parseInt(numconge.getText());

                String nom=action2.Getnom(con, numemp);
                salaire_nom.setText(nom);

                String prenom=action2.Getprenom(con, numemp);
                salaire_prenom.setText(prenom);

                int salaireA=action2.Salaire(con, numemp);
                salaire_SA.setText(""+salaireA+" Ar");

                int salaireI=action2.Getsalaire(con, numemp);
                salaire_SI.setText(""+salaireI+"Ar");

                int absence=action2.Getnbrjr(con, numemp);
                salaire_absence.setText(""+absence+" jours");

            } catch (SQLException ex) {
                Logger.getLogger(Salaire_actu.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_GetSalaireMousePressed

    private void GetSalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetSalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetSalaireActionPerformed

    private void salaire_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaire_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaire_prenomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton Envoyer_congedispo1;
    private javax.swing.JButton GetSalaire;
    private com.toedter.calendar.JDateChooser abscence_date;
    private javax.swing.JButton abscence_envoyer;
    private javax.swing.JPanel abscencebtn;
    private javax.swing.JLabel ajouterEmpltxt;
    private javax.swing.JLabel annulerEmpltxt;
    private javax.swing.JPanel congeRestbtn;
    private javax.swing.JLabel congeTxt;
    private javax.swing.JLabel congeTxt1;
    private javax.swing.JLabel congeTxt2;
    private javax.swing.JPanel conge_ajouter;
    private javax.swing.JLabel conge_ajouttxt;
    private javax.swing.JPanel conge_annuler;
    private javax.swing.JLabel conge_annulertxt;
    private com.toedter.calendar.JDateChooser conge_dateDemande;
    private com.toedter.calendar.JDateChooser conge_dateRetour;
    private javax.swing.JPanel conge_modif;
    private javax.swing.JLabel conge_modiftxt;
    private javax.swing.JTextField conge_motif;
    private javax.swing.JTextField conge_nbrjr;
    private javax.swing.JTextField conge_numconge;
    private javax.swing.JTextField conge_numemp;
    private javax.swing.JTextField conge_numempl;
    private javax.swing.JPanel conge_supprimer;
    private javax.swing.JLabel conge_supprimertxt;
    private javax.swing.JLabel conge_text;
    private javax.swing.JPanel congebtn;
    private javax.swing.JLabel emplTxt;
    private javax.swing.JLabel emplTxt1;
    private javax.swing.JPanel employe_ajouter;
    private javax.swing.JPanel employe_annuler;
    private javax.swing.JPanel employe_modifier;
    private javax.swing.JTextField employe_nom;
    private javax.swing.JTextField employe_num;
    private javax.swing.JTextField employe_poste;
    private javax.swing.JTextField employe_prenom;
    private javax.swing.JTextField employe_salaire;
    private javax.swing.JPanel employe_supprimer;
    private javax.swing.JPanel employebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane main;
    private javax.swing.JLabel modifiertEmplxt;
    private javax.swing.JTextField numconge;
    private javax.swing.JPanel pdfbtn;
    private javax.swing.JLabel pointageAjoutertxt;
    private javax.swing.JLabel pointageAnnulertxt;
    private javax.swing.JLabel pointageModifiertxt;
    private javax.swing.JLabel pointageSupprimertxt;
    private javax.swing.JLabel pointageTxt;
    private javax.swing.JLabel pointageTxt1;
    private javax.swing.JPanel pointage_ajouter;
    private javax.swing.JPanel pointage_annuler;
    private com.toedter.calendar.JDateChooser pointage_date;
    private javax.swing.JTextField pointage_empl;
    private javax.swing.JPanel pointage_modif;
    private javax.swing.JTextField pointage_point;
    private javax.swing.JPanel pointage_supprimer;
    private javax.swing.JPanel pointagebtn;
    private javax.swing.JTextField salaire_SA;
    private javax.swing.JTextField salaire_SI;
    private javax.swing.JTextField salaire_absence;
    private javax.swing.JTextField salaire_nom;
    private javax.swing.JTextField salaire_numemp;
    private javax.swing.JTextField salaire_prenom;
    private javax.swing.JPanel salairebtn;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_Nom;
    private javax.swing.JLabel supprimerEmpltxt;
    private javax.swing.JTable table_abscence;
    private javax.swing.JTable table_conge;
    private javax.swing.JTable table_employe;
    private javax.swing.JTable table_pointage;
    // End of variables declaration//GEN-END:variables
}
