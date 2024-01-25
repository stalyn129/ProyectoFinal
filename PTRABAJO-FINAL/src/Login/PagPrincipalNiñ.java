/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author mauca
 */


public class PagPrincipalNiñ extends javax.swing.JFrame {

    /**
     * Creates new form PagPrincipalNiñ
     */
    ObjectContainer Base;
    
    public PagPrincipalNiñ() {
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

        btnExit1 = new javax.swing.JButton();
        btnExit2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cuentos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Consejos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        BtnConseNiño = new javax.swing.JButton();
        BtnCuentosNiño1 = new javax.swing.JButton();
        Test = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnTestNiño2 = new javax.swing.JButton();
        MiniJuegos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnMiniJueNiño1 = new javax.swing.JButton();
        BtnInfNiño = new javax.swing.JButton();
        Inf = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        btnExit1.setText("x");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit2.setText("x");
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cuentos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel14.setText("Cuentos");
        Cuentos.add(jLabel14);

        jPanel1.add(Cuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, -1));

        Consejos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel15.setText("Consejos");
        Consejos.add(jLabel15);

        jPanel1.add(Consejos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 100, -1));

        BtnConseNiño.setBackground(new java.awt.Color(255, 255, 255));
        BtnConseNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consejos.png"))); // NOI18N
        BtnConseNiño.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnConseNiño.setOpaque(false);
        BtnConseNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConseNiñoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConseNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 120, 70));

        BtnCuentosNiño1.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuentosNiño1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CuentosNiño.png"))); // NOI18N
        BtnCuentosNiño1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuentosNiño1.setOpaque(false);
        BtnCuentosNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuentosNiño1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuentosNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, 70));

        Test.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setText("Test");
        Test.add(jLabel12);

        jPanel1.add(Test, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 100, -1));

        BtnTestNiño2.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TestIconoNiño.png"))); // NOI18N
        BtnTestNiño2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestNiño2.setOpaque(false);
        BtnTestNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestNiño2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTestNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 70));

        MiniJuegos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setText("Mini Juegos");
        MiniJuegos.add(jLabel13);

        jPanel1.add(MiniJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 100, -1));

        BtnMiniJueNiño1.setBackground(new java.awt.Color(255, 255, 255));
        BtnMiniJueNiño1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JuegosNiños.png"))); // NOI18N
        BtnMiniJueNiño1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnMiniJueNiño1.setOpaque(false);
        BtnMiniJueNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMiniJueNiño1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMiniJueNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 70));

        BtnInfNiño.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfNiño.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño.setOpaque(false);
        BtnInfNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiñoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, 70));

        Inf.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Información");
        Inf.add(jLabel4);

        jPanel1.add(Inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Puedes elegir entre todas estas opciones");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("¿Qué deseas saber?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel1.setText("Espero y te diviertas aprendiendo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 24)); // NOI18N
        jLabel2.setText("BIENVENIDO A: \" NI UNO MAS\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, 40));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PantallaPrnNiño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-540, 0, 1340, 500));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        JMnItmCerrarNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        JMnItmCerrarNiño2.add(jMenuItem1);

        MenuGenerlNiño.add(JMnItmCerrarNiño2);

        JMnPgPrinNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiño2MouseClicked(evt);
            }
        });
        MenuGenerlNiño.add(JMnPgPrinNiño2);

        setJMenuBar(MenuGenerlNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMnPgPrinNiño2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiño2MouseClicked
        Base.close();
            PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
                principalniño.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiño2MouseClicked

    private void BtnConseNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConseNiñoActionPerformed
        Base.close();    
            PagConsejosNiño consejos = new PagConsejosNiño();
                consejos.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnConseNiñoActionPerformed

    private void BtnCuentosNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuentosNiño1ActionPerformed
        Base.close();    
            PagCuentosNiño cuentos = new PagCuentosNiño();
                cuentos.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnCuentosNiño1ActionPerformed

    private void BtnTestNiño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestNiño2ActionPerformed
        Base.close();
            PagTestNiño test = new PagTestNiño();
                test.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnTestNiño2ActionPerformed

    private void BtnMiniJueNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMiniJueNiño1ActionPerformed
        Base.close();    
            PagMiniJuegoNiño minijuego = new PagMiniJuegoNiño();
                minijuego.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnMiniJueNiño1ActionPerformed

    private void BtnInfNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiñoActionPerformed
        Base.close();
            PagInfNiño informacion = new PagInfNiño();
                informacion.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnInfNiñoActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
    
        Base.close();
            InicioNiño login = new InicioNiño();
                login.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExit2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConseNiño;
    private javax.swing.JButton BtnCuentosNiño1;
    private javax.swing.JButton BtnInfNiño;
    private javax.swing.JButton BtnMiniJueNiño1;
    private javax.swing.JButton BtnTestNiño2;
    private javax.swing.JPanel Consejos;
    private javax.swing.JPanel Cuentos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JPanel Inf;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JPanel MiniJuegos;
    private javax.swing.JPanel Test;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
