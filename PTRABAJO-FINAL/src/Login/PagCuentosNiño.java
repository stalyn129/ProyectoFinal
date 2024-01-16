/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Cuento;
import Login.PagPrincipalNiñ;
import com.db4o.*;
import com.db4o.ObjectContainer;
import com.db4o.query.Query;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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

        jPanel1 = new javax.swing.JPanel();
        BtnRegresar1 = new javax.swing.JButton();
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
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        LblTituloNiñoCuen.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
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
        TxtDesarroNiñoCuen.setLineWrap(true);
        TxtDesarroNiñoCuen.setRows(5);
        TxtDesarroNiñoCuen.setWrapStyleWord(true);
        TxtDesarroNiñoCuen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtDesarroNiñoCuen.setEnabled(false);
        jScrollPane2.setViewportView(TxtDesarroNiñoCuen);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 500, 260));

        jCmbBoxCuentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
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

        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuCuentosNiño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuCuentosNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuCuentosNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        PagPrincipalNiñ pagpeincipalniño = new PagPrincipalNiñ();
        pagpeincipalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
        principalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

    private void jCmbBoxCuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbBoxCuentosActionPerformed
        if (jCmbBoxCuentos.getSelectedItem() != null) {
            cargar_datos1();
        }
    }//GEN-LAST:event_jCmbBoxCuentosActionPerformed

//    private void cargarDatos() {
//        try {
//            // Obtén el mapa de códigos y títulos del JComboBox
//            Map<String, String> codigoTituloMap = (Map<String, String>) jCmbBoxCuentos.getClientProperty("codigoTituloMap");
//
//            // Obtiene el código seleccionado del combo box
//            String tituloSeleccionado = jCmbBoxCuentos.getSelectedItem().toString();
//            String codigoSeleccionado = codigoTituloMap.get(tituloSeleccionado);
//
//            // Realiza la consulta en la base de datos utilizando el código
//            Cuento cuentoEncontrado = obtenerCuentoPorCodigo(codigoSeleccionado);
//
//            if (cuentoEncontrado != null) {
//                // Si se encuentra el cuento, obtiene la información
//                LblTituloNiñoCuen.setText(cuentoEncontrado.getTitulo_Cuento());
//                TxtIntroNiñoCuen.setText(cuentoEncontrado.getIntroduccion_Cuento());
//                TxtDesarroNiñoCuen.setText(cuentoEncontrado.getNudo_Cuento());
//                TxtConcluNiñoCuen.setText(cuentoEncontrado.getDesenlace_Cuento());
//
//                // Rellena las imágenes en los JLabel correspondientes
//                Image introduccionImage = cuentoEncontrado.obtenerImagenComoImage();
//                LblImaNiñoCuenIntrodu.setIcon(getScaledImageIcon(introduccionImage));
//
//                Image conclusiónImage = cuentoEncontrado.obtenerImagenFinalComoImage();
//                LblImaNiñoConclu.setIcon(getScaledImageIcon(conclusiónImage));
//            } else {
//                // Si no se encuentra, muestra un mensaje de error
//                JOptionPane.showMessageDialog(null, "El cuento con el código '" + codigoSeleccionado + "' no ha sido encontrado en la base de datos");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error al cargar los datos del cuento");
//        }
//    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(210, 180, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

//    public void cargarCuentos() {
//        try {
//            Query query = Base.query();
//            query.constrain(Cuento.class);
//            ObjectSet<Cuento> result = query.execute();
//
//            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
//
//            // Mapeo entre códigos y títulos
//            Map<String, String> codigoTituloMap = new HashMap<>();
//
//            while (result.hasNext()) {
//                Cuento cuento = result.next();
//                String codigo = cuento.getCod_Cuento();
//                String titulo = cuento.getTitulo_Cuento();
//
//                // Imprimir información (para depuración)
//                System.out.println("Código: " + codigo + ", Título: " + titulo);
//
//                // Agregar título al modelo y al mapeo
//                model.addElement(titulo);
//                codigoTituloMap.put(codigo, titulo);
//            }
//
//            // Agregar el mapeo como un atributo del JComboBox
//            jCmbBoxCuentos.putClientProperty("codigoTituloMap", codigoTituloMap);
//
//            // Configurar el modelo después de haber construido el mapa
//            jCmbBoxCuentos.setModel(model);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error al cargar los cuentos desde la base de datos");
//        }
//    }

//    private Cuento obtenerCuentoPorCodigo(String codigo) {
//        try {
//            Cuento example = new Cuento();
//            example.setCod_Cuento(codigo);
//
//            ObjectSet<Cuento> result = Base.queryByExample(example);
//
//            return result.hasNext() ? result.next() : null;
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error al obtener el cuento desde la base de datos");
//            return null;
//        }
//    }
    
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
            java.util.logging.Logger.getLogger(Crud_Cuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Cuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Cuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Cuento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JLabel LblImaNiñoConclu;
    private javax.swing.JLabel LblImaNiñoCuenIntrodu;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblTituloNiñoCuen;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JTextArea TxtConcluNiñoCuen;
    private javax.swing.JTextArea TxtDesarroNiñoCuen;
    private javax.swing.JTextArea TxtIntroNiñoCuen;
    private javax.swing.JComboBox<String> jCmbBoxCuentos;
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
