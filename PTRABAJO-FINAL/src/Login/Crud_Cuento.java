/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Cuento;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class Crud_Cuento extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    byte[] imagen;
    ObjectContainer Base;

    public Crud_Cuento() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        lblDesarrollo = new javax.swing.JLabel();
        lblIntroduccion = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Txt_Titulo = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        Txt_Codigo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblCodigo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDesarrollo = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaIntroduccion = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtConclusion = new javax.swing.JTextArea();
        jSeparator9 = new javax.swing.JSeparator();
        lblConclusion = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuentos = new javax.swing.JTable();
        BtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setToolTipText("");
        jScrollPane4.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(520, 833));
        jPanel4.setPreferredSize(new java.awt.Dimension(520, 833));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 10));

        lblDesarrollo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDesarrollo.setText("Desarrollo:");
        jPanel4.add(lblDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lblIntroduccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIntroduccion.setText("Introducción");
        jPanel4.add(lblIntroduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 240, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 10));

        Txt_Titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Titulo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Titulo.setText("Ejem: Las aventuras de...");
        Txt_Titulo.setBorder(null);
        Txt_Titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TituloMousePressed(evt);
            }
        });
        Txt_Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TituloActionPerformed(evt);
            }
        });
        jPanel4.add(Txt_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 20));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTitulo.setText("Titulo:");
        jPanel4.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Txt_Codigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Codigo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Codigo.setText("Ejem: CNT-001");
        Txt_Codigo.setBorder(null);
        Txt_Codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Txt_CodigoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_CodigoMousePressed(evt);
            }
        });
        Txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CodigoActionPerformed(evt);
            }
        });
        jPanel4.add(Txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 20));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 10));

        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCodigo.setText("Codigo:");
        jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("CRUD CUENTOS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        txtDesarrollo.setColumns(20);
        txtDesarrollo.setRows(5);
        jScrollPane5.setViewportView(txtDesarrollo);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 70));

        txtAreaIntroduccion.setColumns(20);
        txtAreaIntroduccion.setRows(5);
        jScrollPane6.setViewportView(txtAreaIntroduccion);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 70));

        txtConclusion.setColumns(20);
        txtConclusion.setRows(5);
        jScrollPane7.setViewportView(txtConclusion);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 240, 70));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 240, 10));

        lblConclusion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblConclusion.setText("Conclusion:");
        jPanel4.add(lblConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setText("Agregar una Imagen");
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 240, 130));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 240, 10));

        jButton1.setText("Agregar Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 240, -1));

        jButton2.setText("Agregar Cuento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 720, -1, -1));

        lblMensaje.setText("jLabel1");
        lblMensaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblMensajeFocusLost(evt);
            }
        });
        jPanel4.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, -1));

        jScrollPane4.setViewportView(jPanel4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Titulo", "Introducción", "Desarrollo", "Conclusión", "RutaImagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCuentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 380));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TituloMousePressed
    
        if (Txt_Titulo.getText().equals("Ejem: Las aventuras de...")) {
            Txt_Titulo.setText("");
            Txt_Titulo.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: CNT-001");
            Txt_Codigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_TituloMousePressed

    private void Txt_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TituloActionPerformed

    private void Txt_CodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMousePressed
        if (Txt_Codigo.getText().equals("Ejem: CNT-001")) {
            Txt_Codigo.setText("");
            Txt_Codigo.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Titulo.getText()).isEmpty()) {
            Txt_Titulo.setText("Ejem: Las aventuras de...");
            Txt_Titulo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_CodigoMousePressed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpng") || archivo.getName().endsWith("jpng") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                imagen = AbrirArchivo(archivo); // Store the selected image in the imagen variable
                lblImagen.setIcon(new ImageIcon(imagen)); // Update the displayed image on the interface
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Txt_CodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoMouseExited

    private void lblMensajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblMensajeFocusLost
        if (Verificar_cuento(Base, Txt_Codigo.getText())==1) {
            lblMensaje.setForeground(Color.red);
            Txt_Codigo.requestFocus();
        }else{
        lblMensaje.setForeground(Color.white);
 
}
    }//GEN-LAST:event_lblMensajeFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cuento elcue=new Cuento();
        elcue.setCod_Cuento(Txt_Codigo.getText());
        elcue.setFK_CodPsicologo(RegistrarsePariente.Calcular_cod_Representante(Base));
        elcue.setTitulo_Cuento(Txt_Titulo.getText());
        elcue.setIntroduccion_Cuento(txtAreaIntroduccion.getText());
        elcue.setNudo_Cuento(txtDesarrollo.getText());
        elcue.setDesenlace_Cuento(txtConclusion.getText());
        elcue.setImagen_Cuento(imagen);
        Base.store(elcue);
        javax.swing.JOptionPane.showMessageDialog(this, "SE GUARDO EN LA BASE");
        MostrarDatos(Base);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PagPrincipalAdmin prinAdmn = new PagPrincipalAdmin();
        prinAdmn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
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
                new Crud_Cuento().setVisible(true);
            }
        });
    }
    
    public void MostrarDatos(ObjectContainer Base) {

        Cuento nacio = new Cuento();
        ObjectSet result = Base.get(nacio);

        DefaultTableModel modelo = (DefaultTableModel) jTableCuentos.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Cuento minaci = (Cuento) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Cuento(),
                minaci.getTitulo_Cuento(),
                minaci.getIntroduccion_Cuento(),
                minaci.getNudo_Cuento(),
                minaci.getDesenlace_Cuento()
                
            });
        }

    }
    public byte[] AbrirArchivo(File archivo) {

        byte[] imagen = new byte[1024 * 683];
        try {
            FileInputStream entrada = new FileInputStream(archivo);
            entrada.read(imagen);
        } catch (IOException e) {
        }
        return imagen;
    }

    public static int Verificar_cuento(ObjectContainer Base, String Codigo) {

        Cuento elInfo = new Cuento();
        elInfo.setCod_Cuento(Codigo);
        ObjectSet repuest = Base.get(elInfo);

        return repuest.size();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableCuentos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConclusion;
    private javax.swing.JLabel lblDesarrollo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblIntroduccion;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaIntroduccion;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextArea txtDesarrollo;
    // End of variables declaration//GEN-END:variables


}
