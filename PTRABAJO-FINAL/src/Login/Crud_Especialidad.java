/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.Contenedor_Base;
import java.awt.Color;
import Clases.Especializacion;
import Login.PagPrincipalAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Login.Seleccion;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import java.awt.HeadlessException;

public class Crud_Especialidad extends javax.swing.JFrame {

    Object[] columna = new Object[4];
    Especializacion miNaci = new Especializacion();
    DefaultTableModel Modelo = new DefaultTableModel() {
        public boolean isCellEditable(int Fila, int Columna) {
            return false;
        }
    };
    ObjectContainer Base;

    public Crud_Especialidad() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_Codigo = new javax.swing.JTextField();
        Txt_Especializacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        BtnRegresar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 148, 215, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Codigo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, -1, -1));

        jTextField1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jTextField1.setText("CRUD ESPECIALIDAD");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, 215, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Especialización:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 169, -1, -1));

        Txt_Codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Codigo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Codigo.setText("Ejem: ESP-001");
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
        jPanel2.add(Txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 108, 215, 34));

        Txt_Especializacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Especializacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Especializacion.setText("Ejem: Escolar");
        Txt_Especializacion.setBorder(null);
        Txt_Especializacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_EspecializacionMousePressed(evt);
            }
        });
        Txt_Especializacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_EspecializacionActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Especializacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 197, 215, 32));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 215, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 268, -1, -1));

        BtnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 40, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 284, 503));

        jTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Especializacion "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEspecialidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEspecialidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 48, 477, 401));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Txt_EspecializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EspecializacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_EspecializacionActionPerformed

    private void Txt_CodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMousePressed
        if (Txt_Codigo.getText().equals("Ejem: ESP-001")) {
            Txt_Codigo.setText("");
            Txt_Codigo.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Especializacion.getText()).isEmpty()) {
            Txt_Especializacion.setText("Ejem: Escolar");
            Txt_Especializacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_CodigoMousePressed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

    private void Txt_EspecializacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EspecializacionMousePressed
        if (Txt_Especializacion.getText().equals("Ejem: Escolar")) {
            Txt_Especializacion.setText("");
            Txt_Especializacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: ESP-001");
            Txt_Codigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_EspecializacionMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableEspecialidad.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Codigo.getText().equals("Ejem: ESP-001") || Txt_Especializacion.getText().equals("Ejem: Escolar")) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            Ingresar_Datos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEspecialidadMouseClicked
        int Seleccion = jTableEspecialidad.getSelectedRow();

        Txt_Codigo.setText(String.valueOf(jTableEspecialidad.getValueAt(Seleccion, 0)));
        Txt_Especializacion.setText(String.valueOf(jTableEspecialidad.getValueAt(Seleccion, 1)));
    }//GEN-LAST:event_jTableEspecialidadMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar_Especializacion(Base, Txt_Codigo.getText(), Txt_Especializacion.getText());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        PagPrincipalAdmin prinAdmn = new PagPrincipalAdmin();
        prinAdmn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void Btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }
    }//GEN-LAST:event_Btn_ConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Especialidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Especialidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Especializacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableEspecialidad;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public void Ingresar_Datos(ObjectContainer Base) {
        try {
            String codEspecializacion = Txt_Codigo.getText();
            String Especializacion = Txt_Especializacion.getText();

            // Validar los datos antes de ingresarlos
            ValidaCodigo(Especializacion);
            ValidaEspecializacion(Especializacion);

            Especializacion miEspe = new Especializacion(codEspecializacion, Especializacion);

            // Verificar si la Nacionalidad ya existe en la base de datos
            if (Verificacion(Base) == 0) {
                Base.set(miEspe);
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(Base); // Mostrar los datos actualizados
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. La Especializacion ya existe en la base de datos.");
            }

        } catch (Exception ex) {
            // Manejar la excepción de validación
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    public void MostrarDatos(ObjectContainer base) {
        Especializacion Especi = new Especializacion();
        ObjectSet result = base.get(Especi);

        DefaultTableModel modelo = (DefaultTableModel) jTableEspecialidad.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Especializacion miespe = (Especializacion) result.next();
            modelo.addRow(new Object[]{
                miespe.getCod_Especializacion(),
                miespe.getEspecializacion()
            });
        }
    }

    public void Modificar_Especializacion(ObjectContainer base, String Codigo, String Especializacion) {
        // Crear un objeto Nacionalidad con el código proporcionado
        Especializacion laespe = new Especializacion();
        laespe.setCod_Especializacion(Codigo);

        // Buscar el objeto correspondiente en la base de datos
        ObjectSet result = Base.get(laespe);

        // Verificar si se encontró un objeto para modificar
        if (result.hasNext()) {
            Especializacion nueEspe = (Especializacion) result.next();

            // Actualizar los campos del objeto con los nuevos valores
            nueEspe.setEspecializacion(Especializacion);

            // Almacenar los cambios en la base de datos
            Base.store(nueEspe);

            // Mostrar un mensaje de confirmación al usuario
            javax.swing.JOptionPane.showMessageDialog(this, "Se modificó la especialidad correctamente.");
        } else {
            // Mostrar un mensaje de error si no se encontró el objeto
            javax.swing.JOptionPane.showMessageDialog(this, "Error: No se encontró la especialidad para modificar.");
        }
    }

    public void ConsultarDatos(ObjectContainer base, Especializacion consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableEspecialidad.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Especializacion(),
                consulta.getEspecializacion()
            });
        }
    }

    private void EliminarRegistro(ObjectContainer base, String Cod_Especializacion) {

            Especializacion especializacion = new Especializacion(Cod_Especializacion, null);

            // Mensaje de depuración
            System.out.println("Buscando el registro en la base de datos...");

            ObjectSet result = base.queryByExample(especializacion);

            if (result.hasNext()) {
                // Mensaje de depuración
                System.out.println("Eliminando el registro de la base de datos...");

                base.delete(result.next());
                JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
                Limpiar();
                MostrarDatos(base); // Actualizar la tabla después de la eliminación
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
            }
        } 

    private void ConsultarRegistro(ObjectContainer base, String Cod_Especializacion) {

            // Creando un objeto de ejemplo para la consulta
            Especializacion especializacion = new Especializacion(Cod_Especializacion, null);

            // Consultando la base de datos
            ObjectSet result = base.queryByExample(especializacion);

            if (result.hasNext()) {
                // Manejando el resultado (puedes querer mostrarlo o procesarlo)
                Especializacion registroConsultado = (Especializacion) result.next();
                System.out.println("Registro consultado: " + registroConsultado);
                JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

                // Llamar al método ConsultarDatos para mostrar el registro en la tabla
                ConsultarDatos(Base, registroConsultado);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
            }
        } 

    //Verificacion
    public int Verificacion(ObjectContainer Base) {
        String codEspecializacion = Txt_Codigo.getText();
        Especializacion Cod = new Especializacion(codEspecializacion, null);
        ObjectSet result = Base.get(Cod);
        return result.size();
    }

    public void ValidaCodigo(String Codigo) throws Exception {
        if (!Codigo.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("Ingrese un codigo valido");
        }

    }

    public void ValidaEspecializacion(String Espe) throws Exception {
        if (!Espe.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese un país valido");
        }

    }

    public void Limpiar() {
        Txt_Codigo.setText("");
        Txt_Especializacion.setText("");

    }
}
