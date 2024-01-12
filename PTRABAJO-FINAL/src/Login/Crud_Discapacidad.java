/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import Clases.*;
import Login.Seleccion;
import com.db4o.*;
import com.db4o.ObjectContainer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Joel
 */
public class Crud_Discapacidad extends javax.swing.JFrame {

    ObjectContainer Base;
    public Crud_Discapacidad() {
        initComponents();
          Base = Db4o.openFile("src/BBDD/BaseDat.yap");
    }
////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Discapacidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Txt_Observacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BtnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Txt_Codigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDiscapacidad = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("CRUD DISCAPACIDAD");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 44, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Discapacidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Txt_Discapacidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Discapacidad.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Discapacidad.setText("Ejem: Motora");
        Txt_Discapacidad.setBorder(null);
        Txt_Discapacidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_DiscapacidadMousePressed(evt);
            }
        });
        Txt_Discapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DiscapacidadActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Discapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Observación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        Txt_Observacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Esta discapacidad esta asoc...");
        Txt_Observacion.setBorder(null);
        Txt_Observacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ObservacionMousePressed(evt);
            }
        });
        Txt_Observacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ObservacionActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 270, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 10));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 50, 40));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Código:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Txt_Codigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Codigo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Codigo.setText("Ejem: DIS-001");
        Txt_Codigo.setBorder(null);
        Txt_Codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_CodigoMousePressed(evt);
            }
        });
        Txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_CodigoActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jTblDiscapacidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblDiscapacidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_DiscapacidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DiscapacidadMousePressed
        if (Txt_Discapacidad.getText().equals("Ejem: Motora")) {
            Txt_Discapacidad.setText("");
            Txt_Discapacidad.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: DIS-001");
            Txt_Codigo.setForeground(Color.gray);

        }
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Este país...");
            Txt_Observacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_DiscapacidadMousePressed

    private void Txt_DiscapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DiscapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DiscapacidadActionPerformed

    private void Txt_ObservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ObservacionMousePressed
        if (Txt_Observacion.getText().equals("Ejem: Esta discapacidad esta asoc...")) {
            Txt_Observacion.setText("");
            Txt_Observacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Discapacidad.getText()).isEmpty()) {
            Txt_Discapacidad.setText("Ejem: Motora");
            Txt_Discapacidad.setForeground(Color.gray);

        }
        
        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: DIS-001");
            Txt_Codigo.setForeground(Color.gray);

        }

    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void Txt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ObservacionActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PagPrincipalAdmin prinAdmn = new PagPrincipalAdmin();
        prinAdmn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Codigo.getText().equals("Ejem: DIS-001") || Txt_Discapacidad.getText().equals("Ejem: Motora") || Txt_Observacion.getText().equals("Ejem: Esta discapacidad esta asoc...")) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            Ingresar_Datos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void Txt_CodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMousePressed
    if (Txt_Codigo.getText().equals("Ejem: DIS-001")) {
            Txt_Codigo.setText("");
            Txt_Codigo.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Discapacidad.getText()).isEmpty()) {
            Txt_Discapacidad.setText("Ejem: Motora");
            Txt_Discapacidad.setForeground(Color.gray);

        }
        
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Esta discapacidad esta asoc...");
            Txt_Observacion.setForeground(Color.gray);

        }
    }//GEN-LAST:event_Txt_CodigoMousePressed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Discapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Discapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Discapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Discapacidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Discapacidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Discapacidad;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTblDiscapacidad;
    // End of variables declaration//GEN-END:variables
public void Ingresar_Datos(ObjectContainer Base) {
        try {
            String codDiscapacidad = Txt_Codigo.getText();
            String discapacidad = Txt_Discapacidad.getText();;
            String observacion = Txt_Observacion.getText();

            // Validar los datos antes de ingresarlos
            ValidaCodigo(codDiscapacidad);
            ValidaDiscapacidad(discapacidad);
            ValidaObservacion(observacion);

            Discapacidad miNaci = new Discapacidad(codDiscapacidad, discapacidad, observacion);

            // Verificar si la Nacionalidad ya existe en la base de datos
            if (Verificacion(Base) == 0) {
                Base.set(miNaci);
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(); // Mostrar los datos actualizados
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. La Nacionalidad ya existe en la base de datos.");
            }

        } catch (Exception ex) {
            // Manejar la excepción de validación
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }

    public int Verificacion(ObjectContainer Base) {
        String Cod_Discapacidad = Txt_Codigo.getText();
        Discapacidad Cod = new Discapacidad(Cod_Discapacidad, null, null);
        ObjectSet result = Base.get(Cod);
        return result.size();
    }

    public void ValidaCodigo(String Codigo) throws Exception {
        if (!Codigo.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("Ingrese un codigo valido");
        }

    }

    public void ValidaDiscapacidad(String Discapacidad) throws Exception {
        if (!Discapacidad.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese una discapacidad valida");
        }
    }

    public void ValidaObservacion(String Observacion) throws Exception {
        if (!Observacion.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("Ingrese una observacion valida");
        }
    }

    
    public void Limpiar() {
        Txt_Codigo.setText("");
        Txt_Discapacidad.setText("");
        Txt_Observacion.setText("");

    }
    
    public void MostrarDatos() {

        Discapacidad dis = new Discapacidad();
        ObjectSet result = Base.get(dis);

        DefaultTableModel modelo = (DefaultTableModel) jTblDiscapacidad.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Discapacidad minaci = (Discapacidad) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Discapacidad(),
                minaci.getTipo_Discapacidad(),
                minaci.getObservacion()
            });
        }
        
    }
}
