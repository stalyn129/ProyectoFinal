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
public class PagMiniJuegoNiño extends javax.swing.JFrame {

    /**
     * Creates new form PagMiniJuegoNiño
     */
    public PagMiniJuegoNiño() {
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
        BtnRegresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnMiniJueNiño1 = new javax.swing.JButton();
        BtnInfNiño = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnTestNiño2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuJuegoNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 40, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel1.setText("LOS MINI JUEGOS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell Nova", 1, 20)); // NOI18N
        jLabel3.setText("BIENVENIDOS Al AREA DE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 9)); // NOI18N
        jLabel4.setText("Espero y te diviertas ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel5.setText("Escoje el juego que mas te atraiga");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        BtnMiniJueNiño1.setBackground(new java.awt.Color(255, 255, 255));
        BtnMiniJueNiño1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DiferenciasNiñoJueg.png"))); // NOI18N
        BtnMiniJueNiño1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnMiniJueNiño1.setOpaque(false);
        BtnMiniJueNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMiniJueNiño1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMiniJueNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, 80));

        BtnInfNiño.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LaberintoNiñJueg.png"))); // NOI18N
        BtnInfNiño.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfNiño.setOpaque(false);
        BtnInfNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfNiñoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Laberinto");
        jPanel2.add(jLabel6);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, -1));

        BtnTestNiño2.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CorrectoNiñoJuego.png"))); // NOI18N
        BtnTestNiño2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestNiño2.setOpaque(false);
        BtnTestNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestNiño2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTestNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 130, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setText("Responde lo correcto");
        jPanel3.add(jLabel12);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 130, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel13.setText("Diferencias");
        jPanel4.add(jLabel13);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 100, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiñoJuego.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        JMnItmCerrarNiño.add(jMenuItem1);

        MenuJuegoNiño.add(JMnItmCerrarNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuJuegoNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuJuegoNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        PagPrincipalNiño pagpeincipalniño = new PagPrincipalNiño();
        pagpeincipalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void BtnMiniJueNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMiniJueNiño1ActionPerformed
        /*PagMiniJuegoNiño minijuego = new PagMiniJuegoNiño();
        minijuego.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_BtnMiniJueNiño1ActionPerformed

    private void BtnInfNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfNiñoActionPerformed
        /*PagInfNiño informacion = new PagInfNiño();
        informacion.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_BtnInfNiñoActionPerformed

    private void BtnTestNiño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestNiño2ActionPerformed
        /*PagTestNiño test = new PagTestNiño();
        test.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_BtnTestNiño2ActionPerformed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        PagPrincipalNiño principalniño = new PagPrincipalNiño();
            principalniño.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInfNiño;
    private javax.swing.JButton BtnMiniJueNiño1;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JButton BtnTestNiño2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JMenuBar MenuJuegoNiño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
