/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desktoptest;

import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conge extends javax.swing.JFrame {

    /**
     * Creates new form Conge
     */
    public Conge() {
        initComponents();
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
        
       action.Affiche3(con, table3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnumConge5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pconge = new javax.swing.JPanel();
        conge = new javax.swing.JLabel();
        Empl = new javax.swing.JPanel();
        empl2 = new javax.swing.JLabel();
        Pointage = new javax.swing.JPanel();
        point2 = new javax.swing.JLabel();
        CONGE = new javax.swing.JPanel();
        Conge2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateRetour = new com.toedter.calendar.JDateChooser();
        dateDemande = new com.toedter.calendar.JDateChooser();
        chmotif3 = new javax.swing.JTextField();
        chnumemp3 = new javax.swing.JTextField();
        chnbrjr3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        pajouter3 = new javax.swing.JPanel();
        ajouter3 = new javax.swing.JLabel();
        psupprimer3 = new javax.swing.JPanel();
        supprimer3 = new javax.swing.JLabel();
        pmodifier3 = new javax.swing.JPanel();
        modifier3 = new javax.swing.JLabel();
        pannuler2 = new javax.swing.JPanel();
        annuler2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        employe_numconge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMaximumSize(new java.awt.Dimension(254, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(254, 600));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entreprise Art'Soa");

        pconge.setBackground(new java.awt.Color(255, 255, 255));
        pconge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pcongeMousePressed(evt);
            }
        });

        conge.setBackground(new java.awt.Color(255, 255, 255));
        conge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conge.setForeground(new java.awt.Color(0, 102, 102));
        conge.setText("CONGE RESTANT");
        conge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                congeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pcongeLayout = new javax.swing.GroupLayout(pconge);
        pconge.setLayout(pcongeLayout);
        pcongeLayout.setHorizontalGroup(
            pcongeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
            .addGroup(pcongeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pcongeLayout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(conge)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );
        pcongeLayout.setVerticalGroup(
            pcongeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(pcongeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pcongeLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(conge)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        Empl.setBackground(new java.awt.Color(255, 255, 255));
        Empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmplMousePressed(evt);
            }
        });
        Empl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmplKeyReleased(evt);
            }
        });

        empl2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empl2.setForeground(new java.awt.Color(0, 102, 102));
        empl2.setText("EMPLOYE");
        empl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                empl2MousePressed(evt);
            }
        });
        empl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empl2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout EmplLayout = new javax.swing.GroupLayout(Empl);
        Empl.setLayout(EmplLayout);
        EmplLayout.setHorizontalGroup(
            EmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(EmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmplLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(empl2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        EmplLayout.setVerticalGroup(
            EmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(EmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(EmplLayout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(empl2)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        Pointage.setBackground(new java.awt.Color(255, 255, 255));
        Pointage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PointageMousePressed(evt);
            }
        });
        Pointage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PointageKeyReleased(evt);
            }
        });

        point2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        point2.setForeground(new java.awt.Color(0, 102, 102));
        point2.setText("POINTAGE");
        point2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                point2MousePressed(evt);
            }
        });
        point2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                point2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout PointageLayout = new javax.swing.GroupLayout(Pointage);
        Pointage.setLayout(PointageLayout);
        PointageLayout.setHorizontalGroup(
            PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
            .addGroup(PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointageLayout.createSequentialGroup()
                    .addGap(0, 59, Short.MAX_VALUE)
                    .addComponent(point2)
                    .addGap(0, 59, Short.MAX_VALUE)))
        );
        PointageLayout.setVerticalGroup(
            PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointageLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(point2)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        CONGE.setBackground(new java.awt.Color(255, 255, 255));
        CONGE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONGEMousePressed(evt);
            }
        });

        Conge2.setBackground(new java.awt.Color(255, 255, 255));
        Conge2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Conge2.setForeground(new java.awt.Color(0, 102, 102));
        Conge2.setText("CONGE");
        Conge2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Conge2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout CONGELayout = new javax.swing.GroupLayout(CONGE);
        CONGE.setLayout(CONGELayout);
        CONGELayout.setHorizontalGroup(
            CONGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(CONGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CONGELayout.createSequentialGroup()
                    .addGap(0, 71, Short.MAX_VALUE)
                    .addComponent(Conge2)
                    .addGap(0, 72, Short.MAX_VALUE)))
        );
        CONGELayout.setVerticalGroup(
            CONGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(CONGELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CONGELayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(Conge2)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pointage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Empl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CONGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pconge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(Empl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Pointage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(CONGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pconge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gestion de congé");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("N° Employé");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Motif");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nombre de jours");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Date de demande");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Date de retour");

        dateRetour.setDateFormatString("yyyy-MM-dd");

        dateDemande.setDateFormatString("yyyy-MM-dd\n");

        chmotif3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chmotif3.setMaximumSize(new java.awt.Dimension(50, 18));
        chmotif3.setMinimumSize(new java.awt.Dimension(50, 18));
        chmotif3.setPreferredSize(new java.awt.Dimension(50, 18));
        chmotif3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chmotif3ActionPerformed(evt);
            }
        });

        chnumemp3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chnumemp3.setMaximumSize(new java.awt.Dimension(50, 18));
        chnumemp3.setMinimumSize(new java.awt.Dimension(50, 18));
        chnumemp3.setPreferredSize(new java.awt.Dimension(50, 18));
        chnumemp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chnumemp3ActionPerformed(evt);
            }
        });

        chnbrjr3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        chnbrjr3.setMaximumSize(new java.awt.Dimension(50, 18));
        chnbrjr3.setMinimumSize(new java.awt.Dimension(50, 18));
        chnbrjr3.setPreferredSize(new java.awt.Dimension(50, 18));
        chnbrjr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chnbrjr3ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        pajouter3.setBackground(new java.awt.Color(0, 102, 102));
        pajouter3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pajouter3.setForeground(new java.awt.Color(255, 255, 255));
        pajouter3.setMaximumSize(new java.awt.Dimension(250, 40));
        pajouter3.setMinimumSize(new java.awt.Dimension(250, 40));
        pajouter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pajouter3MousePressed(evt);
            }
        });

        ajouter3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        ajouter3.setForeground(new java.awt.Color(255, 255, 255));
        ajouter3.setText("AJOUTER");
        ajouter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajouter3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pajouter3Layout = new javax.swing.GroupLayout(pajouter3);
        pajouter3.setLayout(pajouter3Layout);
        pajouter3Layout.setHorizontalGroup(
            pajouter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pajouter3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ajouter3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pajouter3Layout.setVerticalGroup(
            pajouter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pajouter3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajouter3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        psupprimer3.setBackground(new java.awt.Color(0, 102, 102));
        psupprimer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        psupprimer3.setForeground(new java.awt.Color(255, 255, 255));
        psupprimer3.setMaximumSize(new java.awt.Dimension(250, 40));
        psupprimer3.setMinimumSize(new java.awt.Dimension(250, 40));
        psupprimer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psupprimer3MousePressed(evt);
            }
        });

        supprimer3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        supprimer3.setForeground(new java.awt.Color(255, 255, 255));
        supprimer3.setText("SUPPRIMER");
        supprimer3.setMaximumSize(new java.awt.Dimension(250, 40));
        supprimer3.setMinimumSize(new java.awt.Dimension(250, 40));
        supprimer3.setPreferredSize(new java.awt.Dimension(250, 40));
        supprimer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supprimer3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout psupprimer3Layout = new javax.swing.GroupLayout(psupprimer3);
        psupprimer3.setLayout(psupprimer3Layout);
        psupprimer3Layout.setHorizontalGroup(
            psupprimer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psupprimer3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(supprimer3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        psupprimer3Layout.setVerticalGroup(
            psupprimer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(psupprimer3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supprimer3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pmodifier3.setBackground(new java.awt.Color(0, 102, 102));
        pmodifier3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pmodifier3.setForeground(new java.awt.Color(255, 255, 255));
        pmodifier3.setMaximumSize(new java.awt.Dimension(250, 40));
        pmodifier3.setMinimumSize(new java.awt.Dimension(250, 40));
        pmodifier3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pmodifier3MousePressed(evt);
            }
        });

        modifier3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        modifier3.setForeground(new java.awt.Color(255, 255, 255));
        modifier3.setText("MODIFIER");
        modifier3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifier3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pmodifier3Layout = new javax.swing.GroupLayout(pmodifier3);
        pmodifier3.setLayout(pmodifier3Layout);
        pmodifier3Layout.setHorizontalGroup(
            pmodifier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pmodifier3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(modifier3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pmodifier3Layout.setVerticalGroup(
            pmodifier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pmodifier3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifier3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pannuler2.setBackground(new java.awt.Color(0, 102, 102));
        pannuler2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pannuler2.setForeground(new java.awt.Color(255, 255, 255));
        pannuler2.setMaximumSize(new java.awt.Dimension(250, 40));
        pannuler2.setMinimumSize(new java.awt.Dimension(250, 40));
        pannuler2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pannuler2MousePressed(evt);
            }
        });

        annuler2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        annuler2.setForeground(new java.awt.Color(255, 255, 255));
        annuler2.setText("ANNULER");
        annuler2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                annuler2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pannuler2Layout = new javax.swing.GroupLayout(pannuler2);
        pannuler2.setLayout(pannuler2Layout);
        pannuler2Layout.setHorizontalGroup(
            pannuler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannuler2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(annuler2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannuler2Layout.setVerticalGroup(
            pannuler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannuler2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annuler2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannuler2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psupprimer3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pajouter3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pmodifier3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pajouter3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pmodifier3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pannuler2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(psupprimer3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        table3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        table3.setModel(new javax.swing.table.DefaultTableModel(
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
        table3.setGridColor(new java.awt.Color(0, 102, 102));
        table3.setSelectionBackground(new java.awt.Color(0, 102, 102));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table3MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        employe_numconge.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        employe_numconge.setMaximumSize(new java.awt.Dimension(50, 18));
        employe_numconge.setMinimumSize(new java.awt.Dimension(50, 18));
        employe_numconge.setPreferredSize(new java.awt.Dimension(50, 18));
        employe_numconge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_numcongeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("N° Congé");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(dateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chnumemp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(chmotif3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(chnbrjr3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dateDemande, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(employe_numconge, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(86, 86, 86)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employe_numconge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chnumemp3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(chmotif3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(chnbrjr3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateDemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MousePressed
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();
            String id=action.employe_numconge, table3);
            action.Affiche3(con, table3);
            action.Update_13(con, id, chnumemp3, chnumconge, chmotif3, chnbrjr3, dateDemande, dateRetour);
            action.Affiche3(con, table3);
        } catch (SQLException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, employe_numconge
        }
    }//GEN-LAST:event_table3MousePressed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked

    }//GEN-LAST:event_table3MouseClicked

    private void pannuler2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pannuler2MousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();
       action.Annuler3(chnumemp3, chnumconge, chmotif3, chnbrjr3, dateDemande, dateRetour);

    }//GEN-LAST:event_pannuler2MousePressed

    private void annuler2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annuler2MousePressed
        Connection con;
        Functions action=new Funcemploye_numconge       con=action.Connect_db();
        action.Annuler3(chnumemp3,chnumconge, chmotif3, chnbrjr3, dateDemande, dateRetour);
    }//GEN-LAST:event_annuler2MousePressed

    private void pmodifier3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pmodifier3MousePressed
        try {
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();

            action.Affiche3(con, table3);
            action.Modifier23(con, table3, chnumemp3, chnumconge, chmotif3, chnbrjr3, dateDemande, dateRetour);
            action.Affiche3(con, table3);
        } catch (SQLException ex) {
    employe_numcongegger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pmodifier3MousePressed

    private void modifier3MousePressed(java.awt.event.MouseEvent evt) {                                  employe_numconge    try {//GEN-FIRST:event_modifier3MousePressed
            Connection con;
            Functions action=new Functions();
            con=action.Connect_db();

            action.Affiche3(con, table3);
            action.Modifier23(con, table3, chnumemp3, chnumconge, chmotif3, chnbrjr3, dateDemande, dateRetour);
            action.Affiche3(con, table3);
        } catch (SQLException ex) {
            Loemploye_numcongegger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Conge.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifier3MousePressed

    private void psupprimer3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psupprimer3MousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        actemploye_numconge3(con, table3, chnumemp3, chnumconge);
        action.Affiche3(con, table3);
    }//GEN-LAST:event_psupprimer3MousePressed

    private void supprimer3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimer3MousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

       action.Delete3(con, table3, chnumemp3, chnumconge);
        action.Affiche3(con, table3);
    }//GEN-LAST:event_supprimer3MousePressed

    private void pajouter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pajouter3MousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche3(con, table3);
        action.InsertTable3(con,chnumconge, chnumemp3, chmotif3, chnbrjr3, dateDemande, dateRetour);
        System.out.println("SSS");
        action.Affiche3(con, table3);
    }//GEN-LAST:event_pajouter3MousePressed

    private void ajouter3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouter3MousePressed
        Connection con;
        Functions action=new Functions();
        con=action.Connect_db();

        action.Affiche3(con, table3);
        action.InsertTable3(con, chnumconge, chnumemp3, chmotif3, chnbrjr3, dateDemande, dateRetour);
        action.Affiche3(con, table3);
    }//GEN-LAST:event_ajouter3MousePressed

    private void chnbrjr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chnbrjr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chnbrjr3ActionPerformed

    private void chmotif3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chmotif3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chmotif3ActionPerformed

    private void CONGEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONGEMousePressed
        Conge au=new Conge();
        au.setVisible(true);
    }//GEN-LAST:event_CONGEMousePressed

    private void Conge2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Conge2MousePressed
        Conge au=new Conge();
        au.setVisible(true);
    }//GEN-LAST:event_Conge2MousePressed

    private void PointageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PointageKeyReleased

    }//GEN-LAST:event_PointageKeyReleased

    private void PointageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PointageMousePressed
        Pointage au=new Pointage();
        au.setVisible(true);
    }//GEN-LAST:event_PointageMousePressed

    private void point2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_point2KeyReleased

    }//GEN-LAST:event_point2KeyReleased

    private void point2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_point2MousePressed
        Pointage au=new Pointage();
        au.setVisible(true);
    }//GEN-LAST:event_point2MousePressed

    private void EmplKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmplKeyReleased

    }//GEN-LAST:event_EmplKeyReleased

    private void EmplMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmplMousePressed
        Employes au=new Employes();
        au.setVisible(true);
    }//GEN-LAST:event_EmplMousePressed

    private void empl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empl2KeyReleased

    }//GEN-LAST:event_empl2KeyReleased

    private void empl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empl2MousePressed
        Employes au=new Employes();
        au.setVisible(true);
    }//GEN-LAST:event_empl2MousePressed

    private void pcongeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcongeMousePressed
        CongeDispo conge= new CongeDispo();
        conge.setVisible(true);
    }//GEN-LAST:event_pcongeMousePressed

    private void congeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congeMousePressed
        CongeDispo conge= new CongeDispo();
        conge.setVisible(true);
    }//GEN-LAST:event_congeMousePressed

    private void chnumemp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chnumemp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chnumemp3ActionPerformed

    private void employe_numcongeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_numcongeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_numcongeActionPerformed

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
            java.util.logging.Logger.getLogger(Conge.class.getNemploye_numconge(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONGE;
    private javax.swing.JLabel Conge2;
    private javax.swing.JPanel Empl;
    private javax.swing.JPanel Pointage;
    private javax.swing.JLabel ajouter3;
    private javax.swing.JLabel annuler2;
    private javax.swing.JTextField chmotif3;
    private javax.swing.JTextField chnbrjr3;
    private javax.swing.JTextField chnumemp3;
    private javax.swing.JLabel conge;
    private com.toedter.calendar.JDateChooser dateDemande;
    private com.toedter.calendar.JDateChooser dateRetour;
    private javax.swing.JLabel empl2;
    private javax.swing.JTextField employe_numconge;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modifier3;
    private javax.swing.JPanel pajouter3;
    private javax.swing.JPanel pannuler2;
    private javax.swing.JPanel pconge;
    private javax.swing.JPanel pmodifier3;
    private javax.swing.JLabel point2;
    private javax.swing.JPanel psupprimer3;
    private javax.swing.JLabel supprimer3;
    private javax.swing.JTable table3;
    private javax.swing.JTextField txtnumConge5;
    // End of variables declaration//GEN-END:variables
}
