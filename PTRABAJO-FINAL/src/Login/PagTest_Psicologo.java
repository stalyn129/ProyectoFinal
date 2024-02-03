/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.db4o.*;
import com.db4o.ObjectContainer;

/**
 *
 * @author alexa
 */
public class PagTest_Psicologo extends javax.swing.JFrame {

    ObjectContainer Base;
    public PagTest_Psicologo() {
        initComponents();
            Base = Db4o.openFile("src/BBDD/BaseDat.yap");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BtnTestPsico2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnTestPsico3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BtnTestPsico4 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        LblTestPariente1 = new javax.swing.JLabel();
        LblTestPariente2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 140, 10));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REPRESENTANTE Y NIÑO/A");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 10));

        BtnTestPsico2.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestPsico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TestAdmin.png"))); // NOI18N
        BtnTestPsico2.setToolTipText("Haz click aqui para entrar a test");
        BtnTestPsico2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestPsico2.setOpaque(false);
        BtnTestPsico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestPsico2ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnTestPsico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 110, 90));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 280, 10));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gestionar Test");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 20));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NIÑO/A");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 160, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 140, 10));

        BtnTestPsico3.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestPsico3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReportePsicologo.png"))); // NOI18N
        BtnTestPsico3.setToolTipText("Haz click aqui para entrar al reporte del test");
        BtnTestPsico3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestPsico3.setOpaque(false);
        BtnTestPsico3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestPsico3ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnTestPsico3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 120, 90));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REPRESENTANTE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 160, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 10));

        BtnTestPsico4.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestPsico4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ReportePsicologo.png"))); // NOI18N
        BtnTestPsico4.setToolTipText("Haz click aqui para entrar al reporte del test");
        BtnTestPsico4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestPsico4.setOpaque(false);
        BtnTestPsico4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestPsico4ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnTestPsico4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, 90));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 250, 10));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reporte Test");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 250, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 140, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Elije la opción a la que desee ingresar:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 170, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 570, 300));

        BtnCerrarPagina.setBackground(new java.awt.Color(255, 255, 255));
        BtnCerrarPagina.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        BtnCerrarPagina.setText("x");
        BtnCerrarPagina.setToolTipText("Cerrar Pagina dando click aqui");
        BtnCerrarPagina.setBorder(null);
        BtnCerrarPagina.setOpaque(false);
        BtnCerrarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerrarPaginaMouseClicked(evt);
            }
        });
        BtnCerrarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarPaginaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

        btnMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnMinimizar1.setText("—");
        btnMinimizar1.setToolTipText("Minimizar Pagina dando click aqui");
        btnMinimizar1.setBorder(null);
        btnMinimizar1.setOpaque(false);
        btnMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizar1MouseClicked(evt);
            }
        });
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, 30));

        LblTestPariente1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente1.setText("BIENVENIDO AL AREA DE:");
        jPanel1.add(LblTestPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 300, 20));

        LblTestPariente2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTestPariente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente2.setText("TEST");
        jPanel1.add(LblTestPariente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 210, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiñoConsejos.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-880, -50, 1710, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        JMenu3puntitosPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosPsicologo.setToolTipText("Configuración");

        JMnItmCerrarPsicologo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarPsicologo.setText("Cerrar Sesión");
        JMnItmCerrarPsicologo.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarPsicologo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMousePressed(evt);
            }
        });
        JMenu3puntitosPsicologo.add(JMnItmCerrarPsicologo);

        jMenuBar1.add(JMenu3puntitosPsicologo);

        JMnPgPrinPsicolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinPsicolo.setToolTipText("Resgresa a la página principal");
        JMnPgPrinPsicolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinPsicoloMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMnPgPrinPsicolo);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        Base.close();
        InicioPsicologo loginPsicologo = new InicioPsicologo();
        loginPsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void JMnPgPrinPsicoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicoloMouseClicked
        Base.close();
        PagPrincipalPsicologo principal = new PagPrincipalPsicologo();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinPsicoloMouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void BtnTestPsico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestPsico2ActionPerformed
        Base.close();
        PagCrudTestPsicologo pctp =new PagCrudTestPsicologo();
        pctp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnTestPsico2ActionPerformed

    private void BtnTestPsico3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestPsico3ActionPerformed
        Base.close();
        Reporte_test_niño report=new Reporte_test_niño();
        report.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnTestPsico3ActionPerformed

    private void BtnTestPsico4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestPsico4ActionPerformed
        Base.close();
        Reporte_test report=new Reporte_test();
        report.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnTestPsico4ActionPerformed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(PagTest_Psicologo.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(PagTest_Psicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagTest_Psicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagTest_Psicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagTest_Psicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagTest_Psicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnTestPsico2;
    private javax.swing.JButton BtnTestPsico3;
    private javax.swing.JButton BtnTestPsico4;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel LblTestPariente1;
    private javax.swing.JLabel LblTestPariente2;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
