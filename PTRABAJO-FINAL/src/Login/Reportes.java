/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login;

/**
 *
 * @author Joel
 */
public class Reportes extends javax.swing.JFrame {

    /** Creates new form Reportes */
    public Reportes() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnInfNiño = new javax.swing.JButton();
        BtnInfNiño1 = new javax.swing.JButton();
        BtnInfNiño2 = new javax.swing.JButton();
        BtnInfNiño3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        LblInformacionNiño = new javax.swing.JLabel();
        LblInformacionNiño1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnInfNiño.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CuentosNiño.png"))); // NOI18N
        BtnInfNiño.setToolTipText("Haz click aqui para entrar a información");
        BtnInfNiño.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño.setOpaque(false);
        BtnInfNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiñoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 70));

        BtnInfNiño1.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consejos.png"))); // NOI18N
        BtnInfNiño1.setToolTipText("Haz click aqui para entrar a información");
        BtnInfNiño1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño1.setOpaque(false);
        BtnInfNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiño1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 120, 70));

        BtnInfNiño2.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfNiño2.setToolTipText("Haz click aqui para entrar a información");
        BtnInfNiño2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño2.setOpaque(false);
        BtnInfNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiño2ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, 70));

        BtnInfNiño3.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JuegosNiños.png"))); // NOI18N
        BtnInfNiño3.setToolTipText("Haz click aqui para entrar a información");
        BtnInfNiño3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño3.setOpaque(false);
        BtnInfNiño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiño3ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInfNiño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 120, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 120, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 110, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 110, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, 10));

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
        getContentPane().add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel5.setText("CUENTOS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel6.setText("MINI JUEGOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 100, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel4.setText("INFORMACIÓN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel3.setText("CONSEJOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, 30));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoTestRepresentante.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setText("REPORTES");
        getContentPane().add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 20));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setText("BIENVENIDOS AL AREA DE:");
        getContentPane().add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 290, 20));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        jMenu1.setToolTipText("Configuracion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.setToolTipText("Cierra la sesión iniciada");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.setToolTipText("Regresa a la página principal");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInfNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiñoActionPerformed
////        Base.close();
//        PagInfNiño informacion = new PagInfNiño();
//        informacion.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_BtnInfNiñoActionPerformed

    private void BtnInfNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiño1ActionPerformed
        ReporteConsejos pagRep = new ReporteConsejos();
            pagRep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnInfNiño1ActionPerformed

    private void BtnInfNiño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiño2ActionPerformed
        Reporte_Informacion reportin=new Reporte_Informacion();
        reportin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnInfNiño2ActionPerformed

    private void BtnInfNiño3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiño3ActionPerformed
        PagReporteJ Juge =new PagReporteJ();
        Juge.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnInfNiño3ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
//        Base.close();
        IniciaAdmin loginadmin = new IniciaAdmin();
        loginadmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
//        Base.close();
        PagPrincipalAdmin paginaprinciadmi = new PagPrincipalAdmin();
        paginaprinciadmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnInfNiño;
    private javax.swing.JButton BtnInfNiño1;
    private javax.swing.JButton BtnInfNiño2;
    private javax.swing.JButton BtnInfNiño3;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

}