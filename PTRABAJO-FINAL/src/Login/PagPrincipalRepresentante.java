/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Usuario
 */
public class PagPrincipalRepresentante extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipalRepresentante
     */
    public PagPrincipalRepresentante() {
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

        jPanel1 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnForoRepre = new javax.swing.JButton();
        BtnInfRepre = new javax.swing.JButton();
        BtnTestRepre = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BtnCuenRepre = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 40, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDO A: \" NI UNO MAS\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("¿Qué deseas saber?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Puedes elegir entre todas estas opciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Información");
        jPanel2.add(jLabel5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Foros");
        jPanel3.add(jLabel6);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, -1));

        BtnForoRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnForoRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foro.png"))); // NOI18N
        BtnForoRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnForoRepre.setOpaque(false);
        BtnForoRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnForoRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnForoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 120, 70));

        BtnInfRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfRepre.setOpaque(false);
        BtnInfRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 70));

        BtnTestRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Test.png"))); // NOI18N
        BtnTestRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestRepre.setOpaque(false);
        BtnTestRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTestRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 120, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Test");
        jPanel4.add(jLabel7);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Cuentos");
        jPanel5.add(jLabel8);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, -1));

        BtnCuenRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuenRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro.png"))); // NOI18N
        BtnCuenRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuenRepre.setOpaque(false);
        BtnCuenRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuenRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuenRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRepre.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-570, -40, 1370, 550));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnInfRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfRepreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInfRepreActionPerformed

    private void BtnForoRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnForoRepreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnForoRepreActionPerformed

    private void BtnTestRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestRepreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTestRepreActionPerformed

    private void BtnCuenRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuenRepreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCuenRepreActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCuenRepre;
    private javax.swing.JButton BtnForoRepre;
    private javax.swing.JButton BtnInfRepre;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnTestRepre;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
