/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Juego_Diferencias;
import Login.InicioNiño;
import Login.PagMiniJuegoNiño;
import Login.PagPrincipalNiñ;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class PagJuego2Niño extends javax.swing.JFrame {

    /**
     * Creates new form PagJuego2Niño
     */
    ObjectContainer Base;

    public PagJuego2Niño() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(jComboJuego);
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
        BtnRegresar1 = new javax.swing.JButton();
        LblInformacionNiño = new javax.swing.JLabel();
        LblInformacionNiño1 = new javax.swing.JLabel();
        jComboJuego = new javax.swing.JComboBox<>();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuJuego1Niño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        LblTituloDifeNiño2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTituloDifeNiño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloDifeNiño2.setText("LAS DIFERENCIAS");
        jPanel3.add(LblTituloDifeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 630, -1));

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

        LblTituloDifeNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTituloDifeNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloDifeNiño1.setText("HOY TENEMOS EL JUEGO DE:");
        jPanel3.add(LblTituloDifeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 630, -1));

        LblSubTituDiferenJuegNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        jPanel3.add(LblSubTituDiferenJuegNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 590, 20));

        BtnGrupDifeJuego2.add(BtnADifeNiño1);
        BtnADifeNiño1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño2);
        BtnADifeNiño2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño2ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 60, 30));

        BtnGrupDifeJuego2.add(BtnADifeNiño3);
        BtnADifeNiño3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnADifeNiño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnADifeNiño3ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnADifeNiño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 60, 30));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 310));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 650, 310));

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

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInformacionNiño.setText("LAS DIFERENCIAS");
        jPanel1.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 30));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInformacionNiño1.setText("BIENVENIDOS AL JUEGO DEL:");
        jPanel1.add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 20));

        jComboJuego.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 190, 30));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego2Niño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        MenuJuego1Niño.setBackground(new java.awt.Color(255, 255, 255));

        JMenu3puntitosNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMnItmCerrarNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarNiñoMousePressed(evt);
            }
        });
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuJuego1Niño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuJuego1Niño.add(JMnPgPrinNiño);

        setJMenuBar(MenuJuego1Niño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        Base.close();
        PagMiniJuegoNiño Juego2 = new PagMiniJuegoNiño();
        Juego2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void JMnItmCerrarNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarNiñoMousePressed
        Base.close();
        InicioNiño login = new InicioNiño();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarNiñoMousePressed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        Base.close();
        PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
        principalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

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
    private javax.swing.ButtonGroup BtnGrupDifeJuego2;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JLabel LblImaNiñoDiferenciasJueg;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblPreguntaDifeNiño;
    private javax.swing.JLabel LblSubTituDiferenJuegNiño;
    private javax.swing.JLabel LblTituloDifeNiño1;
    private javax.swing.JLabel LblTituloDifeNiño2;
    private javax.swing.JMenuBar MenuJuego1Niño;
    private javax.swing.JComboBox<String> jComboJuego;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
public void cargar_combo1(JComboBox jComboJuego) {

        Juego_Diferencias JBuscar = new Juego_Diferencias(null, null, null, 0, null, null);
        ObjectSet resul = Base.get(JBuscar);
        while (resul.hasNext()) {
            Juego_Diferencias JCombo = (Juego_Diferencias) resul.next();
            jComboJuego.addItem(JCombo.getDescripcion_Juego());
        }
        //System.out.println(resul);
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

                // Obtén las respuestas incorrectas y correctas
                int respuestaCorrecta = Jmostrar.getRespuesta_Correcta();

                // Genera dos números aleatorios
                int[] numerosAleatorios = generarDosNumerosAleatorios();

                // Coloca las respuestas en un ArrayList para facilitar el reordenamiento aleatorio
                List<Integer> respuestas = Arrays.asList(respuestaCorrecta, numerosAleatorios[0], numerosAleatorios[1]);

                // Mezcla aleatoriamente las respuestas
                Collections.shuffle(respuestas);

                // Asigna las respuestas a los botones
                BtnADifeNiño1.setText("1. " + respuestas.get(0));
                BtnADifeNiño2.setText("2. " + respuestas.get(1));
                BtnADifeNiño3.setText("3. " + respuestas.get(2));
            }
        } else {
            System.out.println("No se encontraron datos para el juego seleccionado.");
        }

        Base.commit();
    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(440, 280, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

    private Juego_Diferencias obtenerInformacionDelJuego(ObjectContainer Base, String Descrip) {
        Juego_Diferencias juego = new Juego_Diferencias(null, null, null, 0, null, null);

        ObjectSet result = Base.get(juego);

        if (result.hasNext()) {
            return (Juego_Diferencias) result.next();
        } else {

            throw new IllegalStateException("No se encontró información del juego.");
        }
    }

    public static int[] generarDosNumerosAleatorios() {
        Random random = new Random();
        int numerorandom1 = random.nextInt(20) + 1;
        int numerorandom2 = random.nextInt(20) + 1;

        // Puedes devolver los números en un array, por ejemplo
        return new int[]{numerorandom1, numerorandom2};
    }

    private void verificarRespuesta(ObjectContainer Base, String Descrip, int respuestaUsuario) {
        // Obtén la información del juego desde la base de datos u otras fuentes según tu implementación
        Juego_Diferencias juego = obtenerInformacionDelJuego(Base, Descrip);

        // Verifica la respuesta y muestra el mensaje correspondiente
        if (respuestaUsuario == juego.getRespuesta_Correcta()) {
            JOptionPane.showMessageDialog(this, "¡Felicidades! Respuesta correcta. Prueba otro laberinto.", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            // Aquí puedes agregar lógica para cargar el próximo laberinto o realizar cualquier otra acción necesaria.
        } else {
            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Inténtelo de nuevo.", "Incorrecto", JOptionPane.ERROR_MESSAGE);
            // Aquí puedes agregar lógica adicional si deseas realizar alguna acción cuando la respuesta es incorrecta.
        }
    }

}
