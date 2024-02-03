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
 * @author Usuario
 */
public class PagPrincipalRepresentante extends javax.swing.JFrame {

    ObjectContainer Base;
    
    public PagPrincipalRepresentante() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnForoRepre = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        BtnInfRepre = new javax.swing.JButton();
        BtnTestRepre = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BtnCuenRepre = new javax.swing.JButton();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        BtnForoRepre.setToolTipText("Haz click aqui para entrar a foros");
        BtnForoRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnForoRepre.setOpaque(false);
        BtnForoRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnForoRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnForoRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 120, 70));

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

        BtnInfRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfRepre.setToolTipText("Haz click aqui para entrar a Información");
        BtnInfRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfRepre.setOpaque(false);
        BtnInfRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 70));

        BtnTestRepre.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestRepre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InfAdmin.png"))); // NOI18N
        BtnTestRepre.setToolTipText("Haz click aqui para entrar a test");
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
        BtnCuenRepre.setToolTipText("Haz click aqui para entrar a cuentos");
        BtnCuenRepre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuenRepre.setOpaque(false);
        BtnCuenRepre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuenRepreActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuenRepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 120, 70));

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

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoRepre.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-570, -40, 1370, 550));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosNiño.setToolTipText("Configuración");

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMnItmCerrarNiño.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarNiñoMousePressed(evt);
            }
        });
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuCuentosNiño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.setToolTipText("Resgresa a la página principal");
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuCuentosNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuCuentosNiño);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInfRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfRepreActionPerformed
    Base.close();
        PagInfRepre inf = new PagInfRepre();
            inf.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnInfRepreActionPerformed

    private void BtnForoRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnForoRepreActionPerformed
    Base.close();    
        PagForoPariente foropariente = new PagForoPariente();
            foropariente.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnForoRepreActionPerformed

    private void BtnTestRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestRepreActionPerformed
    Base.close();
        PagTestPariente tes=new PagTestPariente();
            tes.setVisible(true);
                this.setVisible(false);

    }//GEN-LAST:event_BtnTestRepreActionPerformed

    private void BtnCuenRepreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuenRepreActionPerformed
    Base.close();
        PagCuentosRepre cuentospariente = new PagCuentosRepre();
            cuentospariente.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnCuenRepreActionPerformed

    private void JMnItmCerrarNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarNiñoMousePressed
        Base.close();
            InicioRepresentante loginrepre = new InicioRepresentante();
                loginrepre.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarNiñoMousePressed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        Base.close();
            PagPrincipalRepresentante principalrepresetante = new PagPrincipalRepresentante();
                principalrepresetante.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(PagPrincipalRepresentante.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnCuenRepre;
    private javax.swing.JButton BtnForoRepre;
    private javax.swing.JButton BtnInfRepre;
    private javax.swing.JButton BtnTestRepre;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
