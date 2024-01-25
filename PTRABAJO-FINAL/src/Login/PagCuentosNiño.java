/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Cuento;
import Login.InicioNiño;
import Login.PagCrudCuentosPsicologo;
import Login.PagPrincipalNiñ;
import com.db4o.*;
import com.db4o.ObjectContainer;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author mauca
 */
public class PagCuentosNiño extends javax.swing.JFrame {

    ObjectContainer Base;

    public PagCuentosNiño() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(jCmbBoxCuentos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblTituloNiñoCuen = new javax.swing.JLabel();
        LblImaNiñoCuenIntrodu = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtConcluNiñoCuen = new javax.swing.JTextArea();
        LblImaNiñoConclu = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtIntroNiñoCuen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtDesarroNiñoCuen = new javax.swing.JTextArea();
        jCmbBoxCuentos = new javax.swing.JComboBox<>();
        LblInformacionNiño = new javax.swing.JLabel();
        LblInformacionNiño1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setText("x");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(520, 833));
        jPanel3.setPreferredSize(new java.awt.Dimension(520, 833));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInfor2Niño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño.setText("HOY TENEMOS EL CUENTO DE:");
        jPanel3.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 10));

        LblTituloNiñoCuen.setFont(new java.awt.Font("Rockwell", 3, 14)); // NOI18N
        LblTituloNiñoCuen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(LblTituloNiñoCuen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 320, 20));
        jPanel3.add(LblImaNiñoCuenIntrodu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 210, 180));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 320, 10));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 210, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 500, 20));

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 810, 240, 10));

        TxtConcluNiñoCuen.setColumns(20);
        TxtConcluNiñoCuen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtConcluNiñoCuen.setLineWrap(true);
        TxtConcluNiñoCuen.setRows(5);
        TxtConcluNiñoCuen.setWrapStyleWord(true);
        TxtConcluNiñoCuen.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        TxtConcluNiñoCuen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtConcluNiñoCuen.setEnabled(false);
        jScrollPane4.setViewportView(TxtConcluNiñoCuen);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 240, 200));
        jPanel3.add(LblImaNiñoConclu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 250, 200));

        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 810, 240, 10));

        TxtIntroNiñoCuen.setColumns(20);
        TxtIntroNiñoCuen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtIntroNiñoCuen.setLineWrap(true);
        TxtIntroNiñoCuen.setRows(5);
        TxtIntroNiñoCuen.setWrapStyleWord(true);
        TxtIntroNiñoCuen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtIntroNiñoCuen.setEnabled(false);
        jScrollPane5.setViewportView(TxtIntroNiñoCuen);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 180));

        TxtDesarroNiñoCuen.setColumns(20);
        TxtDesarroNiñoCuen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtDesarroNiñoCuen.setLineWrap(true);
        TxtDesarroNiñoCuen.setRows(5);
        TxtDesarroNiñoCuen.setWrapStyleWord(true);
        TxtDesarroNiñoCuen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtDesarroNiñoCuen.setEnabled(false);
        jScrollPane2.setViewportView(TxtDesarroNiñoCuen);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 500, 260));

        jCmbBoxCuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbBoxCuentosActionPerformed(evt);
            }
        });
        jPanel3.add(jCmbBoxCuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 140, -1));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 560, 270));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setText("CUENTOS");
        jPanel1.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 20));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setText("BIENVENIDOS AL AREA DE:");
        jPanel1.add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 290, 20));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiñoCuentos.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

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

    private void jCmbBoxCuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBoxCuentosActionPerformed
        if (jCmbBoxCuentos.getSelectedItem() != null) {
            cargar_datos1();
        }
    }//GEN-LAST:event_jCmbBoxCuentosActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed

        Base.close();
        InicioNiño login = new InicioNiño();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void JMnPgPrinNiño2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiño2MouseClicked
        Base.close();
        PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
        principalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiño2MouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(210, 180, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

    
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
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagCuentosNiño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JLabel LblImaNiñoConclu;
    private javax.swing.JLabel LblImaNiñoCuenIntrodu;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblTituloNiñoCuen;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JTextArea TxtConcluNiñoCuen;
    private javax.swing.JTextArea TxtDesarroNiñoCuen;
    private javax.swing.JTextArea TxtIntroNiñoCuen;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> jCmbBoxCuentos;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

public void cargar_combo1(JComboBox jCmbBoxCuentos) {
  
        Cuento CBuscar = new Cuento(null, null, null, null, null, null, null, null, null, null);
        ObjectSet resul = Base.get(CBuscar);
        while (resul.hasNext()) {
            Cuento Dcombo = (Cuento) resul.next();
            jCmbBoxCuentos.addItem(Dcombo.getTitulo_Cuento());
        }
        Base.commit();
    }

    public void cargar_datos1() {
        String tit = String.valueOf(jCmbBoxCuentos.getSelectedItem());

        Cuento CBuscar = new Cuento(null, null, tit , null, null, null, null, null, null, null);
        ObjectSet resul = Base.get(CBuscar);
        Cuento CMostrar = (Cuento) resul.next();
        LblTituloNiñoCuen.setText(CMostrar.getTitulo_Cuento());
        
        TxtIntroNiñoCuen.setText(CMostrar.getIntroduccion_Cuento());
        TxtDesarroNiñoCuen.setText(CMostrar.getNudo_Cuento());
        TxtConcluNiñoCuen.setText(CMostrar.getDesenlace_Cuento());
        
        // Rellena las imágenes en los JLabel correspondientes
                Image introduccionImage = CMostrar.obtenerImagenComoImage();
                LblImaNiñoCuenIntrodu.setIcon(getScaledImageIcon(introduccionImage));

                Image conclusiónImage = CMostrar.obtenerImagenFinalComoImage();
                LblImaNiñoConclu.setIcon(getScaledImageIcon(conclusiónImage));

        Base.commit();
    }
}
