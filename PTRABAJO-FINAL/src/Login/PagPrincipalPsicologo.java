/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.internal.ObjectContainerBase;

/**
 *
 * @author mauca
 */
public class PagPrincipalPsicologo extends javax.swing.JFrame {

    /**
     * Creates new form PagPrincipalPsicologo
     */
    ObjectContainer Base;

    public PagPrincipalPsicologo() {
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
        jLabel4 = new javax.swing.JLabel();
        BtnTestPsico = new javax.swing.JButton();
        BtnInfPsico = new javax.swing.JButton();
        BtnForoPsico = new javax.swing.JButton();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BtnCuenPsico1 = new javax.swing.JButton();
        BtnCerrarPagina = new javax.swing.JButton();
        BtnCuenPsico2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDO A: \" NI UNO MAS\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Puedes elegir entre todas estas opciones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));

        BtnTestPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnTestPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TestIconoNiño.png"))); // NOI18N
        BtnTestPsico.setToolTipText("Haz click aqui para entrar a cuentos");
        BtnTestPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnTestPsico.setOpaque(false);
        BtnTestPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTestPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTestPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 120, 70));

        BtnInfPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/InformacionNiño.png"))); // NOI18N
        BtnInfPsico.setToolTipText("Haz click aqui para entrar a información");
        BtnInfPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnInfPsico.setOpaque(false);
        BtnInfPsico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInfPsicoMouseClicked(evt);
            }
        });
        BtnInfPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, 70));

        BtnForoPsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnForoPsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Foro.png"))); // NOI18N
        BtnForoPsico.setToolTipText("Haz click aqui para entrar a Foros");
        BtnForoPsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnForoPsico.setOpaque(false);
        BtnForoPsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnForoPsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnForoPsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 120, 70));

        BtnConsePsico.setBackground(new java.awt.Color(255, 255, 255));
        BtnConsePsico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consejos_1.png"))); // NOI18N
        BtnConsePsico.setToolTipText("Haz click aqui para entrar a consejos");
        BtnConsePsico.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnConsePsico.setOpaque(false);
        BtnConsePsico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsePsicoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConsePsico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Información");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 120, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Cuentos");
        jPanel3.add(jLabel6);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("Foros");
        jPanel4.add(jLabel7);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 120, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Test");
        jPanel5.add(jLabel8);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Consejos");
        jPanel6.add(jLabel9);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 120, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("MiniJuegos");
        jPanel7.add(jLabel10);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 120, -1));

        BtnCuenPsico1.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuenPsico1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JuegosNiños.png"))); // NOI18N
        BtnCuenPsico1.setToolTipText("Haz click aqui para entrar a minijuegos");
        BtnCuenPsico1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuenPsico1.setOpaque(false);
        BtnCuenPsico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuenPsico1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuenPsico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 120, 70));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 40, 30));

        BtnCuenPsico2.setBackground(new java.awt.Color(255, 255, 255));
        BtnCuenPsico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro.png"))); // NOI18N
        BtnCuenPsico2.setToolTipText("Haz click aqui para entrar a cuentos");
        BtnCuenPsico2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnCuenPsico2.setOpaque(false);
        BtnCuenPsico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCuenPsico2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCuenPsico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 70));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPsicologo.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -60, 1370, 600));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTestPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTestPsicoActionPerformed
        Base.close(); 
        PagTest_Psicologo eltes = new PagTest_Psicologo(); 
            eltes.setVisible(true); 
                this.setVisible(false);
    }//GEN-LAST:event_BtnTestPsicoActionPerformed

    private void BtnInfPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfPsicoActionPerformed
        Base.close();
        PagCrudInformaPsicologo informacion = new PagCrudInformaPsicologo();
        informacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnInfPsicoActionPerformed

    private void BtnForoPsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnForoPsicoActionPerformed
        Base.close();
        PagCrudForoPsicologo foro = new PagCrudForoPsicologo();
        foro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnForoPsicoActionPerformed

    private void BtnConsePsicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsePsicoActionPerformed
        Base.close();
        PagCrudConsejosPsicologo consejospsicologo = new PagCrudConsejosPsicologo();
        consejospsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnConsePsicoActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void BtnInfPsicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInfPsicoMouseClicked

    }//GEN-LAST:event_BtnInfPsicoMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Base.close();
        PagTest_Psicologo PTP = new PagTest_Psicologo();
        PTP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void JMnPgPrinPsicoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicoloMouseClicked
        Base.close();
        PagPrincipalPsicologo principal = new PagPrincipalPsicologo();
        principal.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_JMnPgPrinPsicoloMouseClicked

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        Base.close();
        InicioPsicologo loginPsicologo = new InicioPsicologo();
        loginPsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void BtnCuenPsico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuenPsico1ActionPerformed
        Base.close();
        PagIngresarTipoJuegoPsico juegos = new PagIngresarTipoJuegoPsico();
        juegos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCuenPsico1ActionPerformed

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void BtnCuenPsico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCuenPsico2ActionPerformed
        Base.close();
        PagCrudCuentosPsicologo cuentos = new PagCrudCuentosPsicologo();
        cuentos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCuenPsico2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnConsePsico;
    private javax.swing.JButton BtnCuenPsico1;
    private javax.swing.JButton BtnCuenPsico2;
    private javax.swing.JButton BtnForoPsico;
    private javax.swing.JButton BtnInfPsico;
    private javax.swing.JButton BtnTestPsico;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
