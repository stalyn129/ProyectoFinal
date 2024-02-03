/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Juego_Diferencias;
import Clases.Puntuaciones;
import Clases.UserDataSingleton;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PagJuego2Niño extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;
    private Puntuaciones puntuacionActual;

    public PagJuego2Niño() {
        initComponents();
        usarData = UserDataSingleton.getInstance();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(jComboJuego);

        // Inicializar puntuacionActual
        puntuacionActual = new Puntuaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrupDifeJuego2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LblTituloDifeNiño2 = new javax.swing.JLabel();
        LblPreguntaDifeNiño = new javax.swing.JLabel();
        LblImaNiñoDiferenciasJueg = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        LblTituloDifeNiño1 = new javax.swing.JLabel();
        LblSubTituDiferenJuegNiño = new javax.swing.JLabel();
        BtnADifeNiño1 = new javax.swing.JRadioButton();
        BtnADifeNiño2 = new javax.swing.JRadioButton();
        BtnADifeNiño3 = new javax.swing.JRadioButton();
        BtnADifeNiño4 = new javax.swing.JRadioButton();
        BtnADifeNiño5 = new javax.swing.JRadioButton();
        jComboJuego = new javax.swing.JComboBox<>();
        BtnRegresar1 = new javax.swing.JButton();
        LblInformacionNiño = new javax.swing.JLabel();
        LblInformacionNiño1 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JTextField();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.setMinimumSize(new java.awt.Dimension(520, 486));
        jPanel3.setPreferredSize(new java.awt.Dimension(520, 486));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTituloDifeNiño2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTituloDifeNiño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloDifeNiño2.setText("LAS DIFERENCIAS");
        jPanel3.add(LblTituloDifeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 480, -1));

        LblPreguntaDifeNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblPreguntaDifeNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblPreguntaDifeNiño.setText("¿Cuántas diferencias encontraste?");
        jPanel3.add(LblPreguntaDifeNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 630, 20));

        LblImaNiñoDiferenciasJueg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImaNiñoDiferenciasJueg.setText("      ");
        LblImaNiñoDiferenciasJueg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(LblImaNiñoDiferenciasJueg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 580, 280));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 600, 10));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 590, 10));

        LblTituloDifeNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTituloDifeNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloDifeNiño1.setText("HOY TENEMOS EL JUEGO DE:");
        jPanel3.add(LblTituloDifeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 480, -1));

        LblSubTituDiferenJuegNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel3.add(LblSubTituDiferenJuegNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 590, 20));

        BtnGrupDifeJuego2.add(BtnADifeNiño1);
        BtnADifeNiño1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño2);
        BtnADifeNiño2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño2ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño3);
        BtnADifeNiño3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño3ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño4);
        BtnADifeNiño4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño4ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño5);
        BtnADifeNiño5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño5ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 60, 30));

        jComboJuego.setToolTipText("Selecciona la que mas te guste");
        jComboJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboJuegoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 20));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 650, 250));

        BtnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar1.setToolTipText("Regresa a la pestaña de los minijuegos");
        BtnRegresar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 40, 30));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInformacionNiño.setText("LAS DIFERENCIAS");
        jPanel1.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 30));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInformacionNiño1.setText("BIENVENIDOS AL JUEGO DEL:");
        jPanel1.add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 20));

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

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 70));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setText("Tu puntuación es:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 100, 20));

        txtPuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntuacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 40, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego2Niño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        JMnItmCerrarNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMnItmCerrarNiño2.setToolTipText("Configuración");

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
        JMnItmCerrarNiño2.add(jMenuItem1);

        MenuGenerlNiño.add(JMnItmCerrarNiño2);

        JMnPgPrinNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño2.setToolTipText("Regresa a la página principal");
        JMnPgPrinNiño2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiño2MouseClicked(evt);
            }
        });
        MenuGenerlNiño.add(JMnPgPrinNiño2);

        setJMenuBar(MenuGenerlNiño);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        Base.close();
        PagMiniJuegoNiño Juego2 = new PagMiniJuegoNiño();
        Juego2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void jComboJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboJuegoActionPerformed
        if (jComboJuego.getSelectedItem() != null) {
            cargar_datos1();
        }
    }//GEN-LAST:event_jComboJuegoActionPerformed

    private void BtnADifeNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnADifeNiño1ActionPerformed
        int respuestaUsuario = Integer.parseInt(BtnADifeNiño1.getText().split("\\.")[1].trim());
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), respuestaUsuario);
    }//GEN-LAST:event_BtnADifeNiño1ActionPerformed

    private void BtnADifeNiño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnADifeNiño2ActionPerformed
        int respuestaUsuario = Integer.parseInt(BtnADifeNiño2.getText().split("\\.")[1].trim());
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), respuestaUsuario);
    }//GEN-LAST:event_BtnADifeNiño2ActionPerformed

    private void BtnADifeNiño3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnADifeNiño3ActionPerformed
        int respuestaUsuario = Integer.parseInt(BtnADifeNiño3.getText().split("\\.")[1].trim());
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), respuestaUsuario);
    }//GEN-LAST:event_BtnADifeNiño3ActionPerformed

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

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void txtPuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntuacionActionPerformed

    }//GEN-LAST:event_txtPuntuacionActionPerformed

    private void BtnADifeNiño4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnADifeNiño4ActionPerformed
        int respuestaUsuario = Integer.parseInt(BtnADifeNiño4.getText().split("\\.")[1].trim());
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), respuestaUsuario);
    }//GEN-LAST:event_BtnADifeNiño4ActionPerformed

    private void BtnADifeNiño5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnADifeNiño5ActionPerformed
        int respuestaUsuario = Integer.parseInt(BtnADifeNiño5.getText().split("\\.")[1].trim());
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), respuestaUsuario);
    }//GEN-LAST:event_BtnADifeNiño5ActionPerformed

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
            java.util.logging.Logger.getLogger(PagJuego2Niño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagJuego2Niño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagJuego2Niño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagJuego2Niño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagJuego2Niño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnADifeNiño1;
    private javax.swing.JRadioButton BtnADifeNiño2;
    private javax.swing.JRadioButton BtnADifeNiño3;
    private javax.swing.JRadioButton BtnADifeNiño4;
    private javax.swing.JRadioButton BtnADifeNiño5;
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.ButtonGroup BtnGrupDifeJuego2;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JLabel LblImaNiñoDiferenciasJueg;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblPreguntaDifeNiño;
    private javax.swing.JLabel LblSubTituDiferenJuegNiño;
    private javax.swing.JLabel LblTituloDifeNiño1;
    private javax.swing.JLabel LblTituloDifeNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JComboBox<String> jComboJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtPuntuacion;
    // End of variables declaration//GEN-END:variables
public void cargar_combo1(JComboBox jComboJuego) {
        Juego_Diferencias JBuscar = new Juego_Diferencias(null, null, null, 0, null, null);
        ObjectSet resul = Base.get(JBuscar);

        while (resul.hasNext()) {
            Juego_Diferencias JCombo = (Juego_Diferencias) resul.next();
            jComboJuego.addItem(JCombo.getDescripcion_Juego());
        }
    }

    public void cargar_datos1() {
        String descrip = String.valueOf(jComboJuego.getSelectedItem());
        Juego_Diferencias JBuscar = new Juego_Diferencias(null, null, descrip, 0, null, null);
        ObjectSet resul = Base.get(JBuscar);

        // Verificar si hay al menos un resultado
        if (!resul.isEmpty()) {
            // Iterar sobre los resultados
            while (resul.hasNext()) {
                Juego_Diferencias Jmostrar = (Juego_Diferencias) resul.next();
                LblSubTituDiferenJuegNiño.setText(Jmostrar.getDescripcion_Juego());
                System.out.println(Jmostrar);

                // Rellena las imágenes en los JLabel correspondientes
                Image imagenJuego = Jmostrar.obtenerImagenComoImage();
                LblImaNiñoDiferenciasJueg.setIcon(getScaledImageIcon(imagenJuego));

                // Obtén la respuesta correcta
                int respuestaCorrecta = Jmostrar.getRespuesta_Correcta();

                // Genera dos números aleatorios diferentes al número correcto
                int[] numerosAleatorios = generarNumerosAleatorios(respuestaCorrecta);

                // Coloca las respuestas en un ArrayList para facilitar el reordenamiento aleatorio
                List<Integer> respuestas = Arrays.asList(respuestaCorrecta, numerosAleatorios[0], numerosAleatorios[1], numerosAleatorios[2], numerosAleatorios[3]);

                // Mezcla aleatoriamente las respuestas
                Collections.shuffle(respuestas);

                // Asigna las respuestas a los botones
                BtnADifeNiño1.setText("A. " + respuestas.get(0));
                BtnADifeNiño2.setText("B. " + respuestas.get(1));
                BtnADifeNiño3.setText("C. " + respuestas.get(2));
                BtnADifeNiño4.setText("D. " + respuestas.get(3));
                BtnADifeNiño5.setText("E. " + respuestas.get(4));

                txtPuntuacion.setEditable(false);

                // Establecer el texto en "10"
                txtPuntuacion.setText("10");

                // Asegurarse de que la puntuación se muestre correctamente en el campo
                txtPuntuacion.repaint();
            }
        } else {
            System.out.println("No se encontraron datos para el juego seleccionado.");
        }

        Base.commit();
    }

    private int[] generarNumerosAleatorios(int numeroCorrecto) {
        Random random = new Random();
        int numerorandom1 = random.nextInt(20) + 1;
        int numerorandom2 = random.nextInt(20) + 1;
        int numerorandom3 = random.nextInt(20) + 1;
        int numerorandom4 = random.nextInt(20) + 1;

        // Verifica si los números aleatorios son iguales al número correcto
        while (numerorandom1 == numeroCorrecto || numerorandom2 == numeroCorrecto || numerorandom3 == numeroCorrecto || numerorandom4 == numeroCorrecto
                || numerorandom1 == numerorandom2 || numerorandom1 == numerorandom3 || numerorandom1 == numerorandom4
                || numerorandom2 == numerorandom3 || numerorandom2 == numerorandom4 || numerorandom3 == numerorandom4) {
            numerorandom1 = random.nextInt(20) + 1;
            numerorandom2 = random.nextInt(20) + 1;
            numerorandom3 = random.nextInt(20) + 1;
            numerorandom4 = random.nextInt(20) + 1;
        }

        // Devuelve los números en un array
        return new int[]{numerorandom1, numerorandom2, numerorandom3, numerorandom4};
    }

    private void verificarRespuesta(ObjectContainer Base, String Descrip, int respuestaUsuario) {
        // Obtén la información del juego desde la base de datos u otras fuentes según tu implementación
        Juego_Diferencias juego = obtenerInformacionDelJuego(Base, Descrip);

        // Verifica la respuesta y muestra el mensaje correspondiente
        if (respuestaUsuario == juego.getRespuesta_Correcta()) {
            JOptionPane.showMessageDialog(this, "¡Felicidades! Respuesta correcta. Prueba otro laberinto.", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            // Aquí puedes agregar lógica para cargar el próximo laberinto o realizar cualquier otra acción necesaria.

            // Llama al método para realizar acciones al terminar, que incluye guardar la puntuación
            realizarAccionesAlTerminar();
        } else {
            // Restar puntuación al seleccionar una opción incorrecta
            int puntuacionActual = Integer.parseInt(txtPuntuacion.getText());
            puntuacionActual -= 2;
            txtPuntuacion.setText(String.valueOf(puntuacionActual));

            // Actualizar la visualización de la puntuación en el JTextField
            txtPuntuacion.repaint();

            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Inténtelo de nuevo.", "Incorrecto", JOptionPane.ERROR_MESSAGE);
            // Aquí puedes agregar lógica adicional si deseas realizar alguna acción cuando la respuesta es incorrecta.
        }
    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(440, 280, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

    private Juego_Diferencias obtenerInformacionDelJuego(ObjectContainer Base, String Descrip) {
        Juego_Diferencias juego = new Juego_Diferencias(null, null, Descrip, 0, null, null);

        ObjectSet result = Base.get(juego);

        if (result.hasNext()) {
            return (Juego_Diferencias) result.next();
        } else {
            throw new IllegalStateException("No se encontró información del juego.");
        }
    }

    public static String Calcular_ID_Puntuacion(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo = "";
        try {
            do {
                Incremental++;
                Codigo = String.format("PJD-%04d", Incremental);

                if (Verificar_CodigoPutuacion(Base, Codigo) == 0) {
                    rest = false;
                }
            } while (rest);
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
        }
        return Codigo;
    }

    public static int Verificar_CodigoPutuacion(ObjectContainer Base, String Codigo) {

        try {
            Puntuaciones miPuntuacion = new Puntuaciones();
            miPuntuacion.setID_Puntuacion(Codigo);

            ObjectSet result = Base.get(miPuntuacion);

            return result.size();
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private void realizarAccionesAlTerminar() {
        try {
            Puntuaciones puntuacion = new Puntuaciones();

            // Obtener código de niño
            String Cod_Niño = usarData.getCod_niño();

            // Obtener descripción del juego seleccionado
            String descrip = String.valueOf(jComboJuego.getSelectedItem());
            Juego_Diferencias juego = obtenerInformacionDelJuego(Base, descrip);

            // Obtener el código del juego
            String codigoJuego = juego.getCod_Juego();

            // Verificar si ya existe una puntuación para este juego y niño
            Puntuaciones puntuacionExistente = obtenerPuntuacionExistente(Base, Cod_Niño, codigoJuego);

            if (puntuacionExistente == null) {
                // No hay puntuación existente, procede a almacenar la nueva puntuación
                guardarNuevaPuntuacion(puntuacion, Cod_Niño, codigoJuego);
            } else {
                // Hay puntuación existente, compara con la nueva y actualiza si es mayor
                int nuevaPuntuacion = Integer.parseInt(txtPuntuacion.getText());
                int puntuacionExistenteValor = puntuacionExistente.getPuntuacion();

                if (nuevaPuntuacion > puntuacionExistenteValor) {
                    // La nueva puntuación es mayor, actualiza la puntuación existente
                    actualizarPuntuacionExistente(puntuacionExistente, nuevaPuntuacion);
                }
            }

        } catch (DatabaseClosedException | DatabaseReadOnlyException | NullPointerException e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la puntuación: " + e.getMessage());
        } finally {
            // Asegúrate de cerrar la base de datos adecuadamente
        }
    }

    private void guardarNuevaPuntuacion(Puntuaciones puntuacion, String Cod_Niño, String codigoJuego) {
        try {
            // Generar ID de puntuación
            String Codigo = Calcular_ID_Puntuacion(Base);
            puntuacion.setID_Puntuacion(Codigo);
            System.out.println("ID de Puntuación: " + Codigo);

            puntuacion.setFK_Cod_Niño(Cod_Niño);
            System.out.println("Código de Niño: " + Cod_Niño);

            puntuacion.setFK_Cod_Minijuego(codigoJuego);
            System.out.println("Código de Juego: " + codigoJuego);

            // Obtener y asignar la fecha de juego
            Date FechaJugado = new Date();
            puntuacion.setFecha_Jugado(FechaJugado);
            System.out.println("Fecha de Juego: " + FechaJugado);

            // Obtener la puntuacionActual
            int punt = Integer.parseInt(txtPuntuacion.getText());
            puntuacion.setPuntuacion(punt);

            // Almacenar la puntuación en la base de datos
            Base.store(puntuacion);

            // Mensajes de depuración adicionales
            System.out.println("Puntuación almacenada correctamente:");
            System.out.println(puntuacion);

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la puntuación: " + e.getMessage());
        }
    }

    private Puntuaciones obtenerPuntuacionExistente(ObjectContainer Base, String Cod_Niño, String codigoJuego) {
        try {
            Puntuaciones puntuacion = new Puntuaciones();
            puntuacion.setFK_Cod_Niño(Cod_Niño);
            puntuacion.setFK_Cod_Minijuego(codigoJuego);

            ObjectSet result = Base.get(puntuacion);

            if (result.hasNext()) {
                return (Puntuaciones) result.next();
            } else {
                return null;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void actualizarPuntuacionExistente(Puntuaciones puntuacionExistente, int nuevaPuntuacion) {
        try {
            puntuacionExistente.setPuntuacion(nuevaPuntuacion);
            // Actualizar la fecha o cualquier otro campo si es necesario
            // puntuacionExistente.setFecha_Jugado(new Date());

            // Almacenar la puntuación actualizada en la base de datos
            Base.store(puntuacionExistente);

            // Mensaje de depuración
            System.out.println("Puntuación existente actualizada correctamente:");
            System.out.println(puntuacionExistente);

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            System.err.println("Excepción al actualizar la puntuación: " + e.getMessage());
        }
    }
}
