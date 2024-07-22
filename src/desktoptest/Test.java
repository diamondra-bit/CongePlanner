/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desktoptest;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diamondra
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Empl = new javax.swing.JPanel();
        empl2 = new javax.swing.JLabel();
        CONGE = new javax.swing.JPanel();
        Conge2 = new javax.swing.JLabel();
        psalaire = new javax.swing.JPanel();
        salaire = new javax.swing.JLabel();
        ppdf = new javax.swing.JPanel();
        pdf = new javax.swing.JLabel();
        pabsence = new javax.swing.JPanel();
        absence = new javax.swing.JLabel();
        pconge = new javax.swing.JPanel();
        conge = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        Pointage = new javax.swing.JPanel();
        point2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entreprise Art'Soa");

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

        psalaire.setBackground(new java.awt.Color(255, 255, 255));
        psalaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psalaireMousePressed(evt);
            }
        });

        salaire.setBackground(new java.awt.Color(255, 255, 255));
        salaire.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salaire.setForeground(new java.awt.Color(0, 102, 102));
        salaire.setText("SALAIRE");
        salaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salaireMousePressed(evt);
            }
        });

        javax.swing.GroupLayout psalaireLayout = new javax.swing.GroupLayout(psalaire);
        psalaire.setLayout(psalaireLayout);
        psalaireLayout.setHorizontalGroup(
            psalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
            .addGroup(psalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(psalaireLayout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(salaire)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        psalaireLayout.setVerticalGroup(
            psalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(psalaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(psalaireLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(salaire)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        ppdf.setBackground(new java.awt.Color(255, 255, 255));
        ppdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ppdfMousePressed(evt);
            }
        });

        pdf.setBackground(new java.awt.Color(255, 255, 255));
        pdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pdf.setForeground(new java.awt.Color(0, 102, 102));
        pdf.setText("PDF");
        pdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pdfMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ppdfLayout = new javax.swing.GroupLayout(ppdf);
        ppdf.setLayout(ppdfLayout);
        ppdfLayout.setHorizontalGroup(
            ppdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
            .addGroup(ppdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppdfLayout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );
        ppdfLayout.setVerticalGroup(
            ppdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(ppdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppdfLayout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(pdf)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        pabsence.setBackground(new java.awt.Color(255, 255, 255));
        pabsence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pabsenceMousePressed(evt);
            }
        });

        absence.setBackground(new java.awt.Color(255, 255, 255));
        absence.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        absence.setForeground(new java.awt.Color(0, 102, 102));
        absence.setText("ABSENCE");
        absence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                absenceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pabsenceLayout = new javax.swing.GroupLayout(pabsence);
        pabsence.setLayout(pabsenceLayout);
        pabsenceLayout.setHorizontalGroup(
            pabsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
            .addGroup(pabsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pabsenceLayout.createSequentialGroup()
                    .addGap(0, 67, Short.MAX_VALUE)
                    .addComponent(absence)
                    .addGap(0, 68, Short.MAX_VALUE)))
        );
        pabsenceLayout.setVerticalGroup(
            pabsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(pabsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pabsenceLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(absence)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pcongeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pcongeLayout.createSequentialGroup()
                    .addGap(0, 32, Short.MAX_VALUE)
                    .addComponent(conge)
                    .addGap(0, 33, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pabsence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Empl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CONGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(psalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pconge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ppdf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Empl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(CONGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(psalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pabsence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pconge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ppdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 600));

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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointageLayout.createSequentialGroup()
                    .addGap(0, 59, Short.MAX_VALUE)
                    .addComponent(point2)
                    .addGap(0, 59, Short.MAX_VALUE)))
        );
        PointageLayout.setVerticalGroup(
            PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
            .addGroup(PointageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointageLayout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(point2)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("tab1", Pointage);

        jPanel3.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 820, 540));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void point2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_point2MousePressed
          jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_point2MousePressed

    private void point2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_point2KeyReleased
        try {
            Functions action=new Functions();
            Functions_2 action2=new Functions_2();
            Connection con=action.Connect_db();
            String numemp="2604";
            int numeconge=1;
            
            action2.Getconge(con, numemp, SOMEBITS);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_point2KeyReleased

    private void PointageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PointageMousePressed
        jTabbedPane3.setSelectedIndex(1);
    }//GEN-LAST:event_PointageMousePressed

    private void PointageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PointageKeyReleased

    }//GEN-LAST:event_PointageKeyReleased

    private void empl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empl2MousePressed
        jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_empl2MousePressed

    private void empl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empl2KeyReleased

    }//GEN-LAST:event_empl2KeyReleased

    private void EmplMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmplMousePressed
       jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_EmplMousePressed

    private void EmplKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmplKeyReleased

    }//GEN-LAST:event_EmplKeyReleased

    private void Conge2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Conge2MousePressed
        jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_Conge2MousePressed

    private void CONGEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONGEMousePressed
       jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_CONGEMousePressed

    private void salaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaireMousePressed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_salaireMousePressed

    private void psalaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psalaireMousePressed
       jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_psalaireMousePressed

    private void pdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfMousePressed
        jTabbedPane3.setSelectedIndex(6);
    }//GEN-LAST:event_pdfMousePressed

    private void ppdfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppdfMousePressed
          jTabbedPane3.setSelectedIndex(6);
    }//GEN-LAST:event_ppdfMousePressed

    private void absenceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_absenceMousePressed
        jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_absenceMousePressed

    private void pabsenceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pabsenceMousePressed
        Abscence absence= new Abscence();
        absence.setVisible(true);
    }//GEN-LAST:event_pabsenceMousePressed

    private void congeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congeMousePressed
        CongeDispo conge= new CongeDispo();
        conge.setVisible(true);
    }//GEN-LAST:event_congeMousePressed

    private void pcongeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcongeMousePressed
        CongeDispo conge= new CongeDispo();
        conge.setVisible(true);
    }//GEN-LAST:event_pcongeMousePressed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONGE;
    private javax.swing.JLabel Conge2;
    private javax.swing.JPanel Empl;
    private javax.swing.JPanel Pointage;
    private javax.swing.JLabel absence;
    private javax.swing.JLabel conge;
    private javax.swing.JLabel empl2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel pabsence;
    private javax.swing.JPanel pconge;
    private javax.swing.JLabel pdf;
    private javax.swing.JLabel point2;
    private javax.swing.JPanel ppdf;
    private javax.swing.JPanel psalaire;
    private javax.swing.JLabel salaire;
    // End of variables declaration//GEN-END:variables
}
