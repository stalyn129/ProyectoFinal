/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author mauca
 */
public class PagPrincipalPsicologo extends javax.swing.JFrame {

    /**
     * Creates new form PagPrincipalPsicologo
     */
    public PagPrincipalPsicologo() {
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
        jLabel4 = new javax.swing.JLabel();
        BtnCuenPsico = new javax.swing.JButton();
        BtnInfPsico = new javax.swing.JButton();
        BtnForoPsico = new javax.swing.JButton();
        BtnTestPsico = new javax.swing.JButton();
        BtnConsePsico = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
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
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, 40));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDO A: \" NI UNO MAS\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Puedes elegir entre todas estas opciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));

        BtnCuenPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuenPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro.png"))); // NOI18N
        BtnCuenPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuenPsico.setOpaque(false);
        BtnCuenPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuenPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuenPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 70));

        BtnInfPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfPsico.setOpaque(false);
        BtnInfPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 70));

        BtnForoPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnForoPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foro.png"))); // NOI18N
        BtnForoPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnForoPsico.setOpaque(false);
        BtnForoPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnForoPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnForoPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 70));

        BtnTestPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Test.png"))); // NOI18N
        BtnTestPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestPsico.setOpaque(false);
        BtnTestPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTestPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, 70));

        BtnConsePsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnConsePsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consejos_1.png"))); // NOI18N
        BtnConsePsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnConsePsico.setOpaque(false);
        BtnConsePsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsePsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConsePsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 120, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Información");
        jPanel2.add(jLabel5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Cuentos");
        jPanel3.add(jLabel6);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 100, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Foros");
        jPanel4.add(jLabel7);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Test");
        jPanel5.add(jLabel8);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 100, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Consejos");
        jPanel6.add(jLabel9);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 100, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPsicologo.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -50, 1370, 590));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
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

    private void BtnCuenPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuenPsicoActionPerformed

    }//GEN-LAST:event_BtnCuenPsicoActionPerformed

    private void BtnInfPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfPsicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnInfPsicoActionPerformed

    private void BtnForoPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnForoPsicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnForoPsicoActionPerformed

    private void BtnTestPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestPsicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTestPsicoActionPerformed

    private void BtnConsePsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsePsicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConsePsicoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsePsico;
    private javax.swing.JButton BtnCuenPsico;
    private javax.swing.JButton BtnForoPsico;
    private javax.swing.JButton BtnInfPsico;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnTestPsico;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
