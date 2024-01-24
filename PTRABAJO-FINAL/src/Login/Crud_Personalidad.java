/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import javax.swing.JOptionPane;
import Clases.Personalidad;
import javax.swing.table.DefaultTableModel;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

/**
 *
 * @author Usuario
 */
public class Crud_Personalidad extends javax.swing.JFrame {

    ObjectContainer Base;
    String Cod_Personalidad = "";

    public Crud_Personalidad() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_Observacion = new javax.swing.JTextField();
        Txt_Parentesco = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParentesco = new javax.swing.JTable();
        btnActualizar1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        Btn_Consultar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(245, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(245, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Observacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Personalidad:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Txt_Observacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Soy muy....");
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
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 215, 20));

        Txt_Parentesco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Parentesco.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Parentesco.setText("Ejem: Feliz");
        Txt_Parentesco.setBorder(null);
        Txt_Parentesco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_ParentescoMousePressed(evt);
            }
        });
        Txt_Parentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ParentescoActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 215, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 268, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("CRUD PERSONALIDAD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 284, 500));

        jTableParentesco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Personalidad ", "Observacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableParentesco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableParentescoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableParentesco);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 477, 401));

        btnActualizar1.setText("Actualizar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        Btn_Consultar1.setText("Consultar");
        Btn_Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Consultar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Consultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ObservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ObservacionMousePressed
        if (Txt_Observacion.getText().equals("Ejem: Soy muy....")) {
            Txt_Observacion.setText("");
            Txt_Observacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Parentesco.getText()).isEmpty()) {
            Txt_Parentesco.setText("Ejem: Feliz");
            Txt_Parentesco.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void Txt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ObservacionActionPerformed

    private void Txt_ParentescoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ParentescoMousePressed
        if (Txt_Parentesco.getText().equals("Ejem: Feliz")) {
            Txt_Parentesco.setText("");
            Txt_Parentesco.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Soy muy....");
            Txt_Observacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_ParentescoMousePressed

    private void Txt_ParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ParentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ParentescoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Observacion.getText().equals("Ejem: Soy muy....") || Txt_Observacion.getText().isEmpty() || Txt_Parentesco.getText().equals("Ejem: Feliz") || Txt_Parentesco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            IngresarDatos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableParentescoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParentescoMouseClicked
        int seleccion = jTableParentesco.getSelectedRow();

        if (seleccion >= 0) { // Verificar que haya una fila seleccionada
            // Obtén los valores de las celdas seleccionadas y establece en los campos de texto
            Txt_Parentesco.setText(String.valueOf(jTableParentesco.getValueAt(seleccion, 1)));
            Txt_Observacion.setText(String.valueOf(jTableParentesco.getValueAt(seleccion, 2)));
        }
    }//GEN-LAST:event_jTableParentescoMouseClicked

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        jTableParentesco.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();
            int filaSeleccionada = jTableParentesco.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoEspecializacion = (String) modelo.getValueAt(filaSeleccionada, 0);
            String nuevaEspecializacion = JOptionPane.showInputDialog(this, "Ingrese la nueva Personalidad:", modelo.getValueAt(filaSeleccionada, 1));
            String nuevaDescripcion = JOptionPane.showInputDialog(this, "Ingrese la nueva descripción:", modelo.getValueAt(filaSeleccionada, 2));

            if (nuevaEspecializacion != null && nuevaDescripcion != null) {
                Modificar_Discapacidad(Base, codigoEspecializacion, nuevaEspecializacion, nuevaDescripcion);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void Btn_Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Consultar1ActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }
    }//GEN-LAST:event_Btn_Consultar1ActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Personalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Consultar1;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JTextField Txt_Parentesco;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableParentesco;
    // End of variables declaration//GEN-END:variables
public void IngresarDatos(ObjectContainer base) {
        try {
            String codPersonalidad = calcularIDPerso(base);
            String tipoParentesco = Txt_Parentesco.getText();
            String observacion = Txt_Observacion.getText();

            if (Verificacion_disca(base, codPersonalidad) == 0) {
                Personalidad nuevaDiscapacidad = new Personalidad(codPersonalidad, tipoParentesco, observacion);
                base.set(nuevaDiscapacidad);
                base.commit();
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(base);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. el parentesco ya existe en la base de datos.");
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al crear el parentesco");
        }
    }

    public void MostrarDatos(ObjectContainer Base) {

        Personalidad dis = new Personalidad();
        ObjectSet result = Base.get(dis);

        DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Personalidad minaci = (Personalidad) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Personalidad(),
                minaci.getPersonalidad(),
                minaci.getObservacion()
            });
        }

    }

    public void ConsultarDatos(ObjectContainer base, Personalidad consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Personalidad(),
                consulta.getCod_Personalidad(),
                consulta.getObservacion(),});
        }
    }

    public void Modificar_Discapacidad(ObjectContainer Base, String CodigoParentesco, String Nuevo_Tipo_Parentesco, String Nueva_Observacion) {
        try {
            ValidaDiscapacidad(Nuevo_Tipo_Parentesco);
            ValidaObservacion(Nueva_Observacion);

            // Crear un objeto Discapacidad con el código proporcionado
            Personalidad miperso = new Personalidad();
            miperso.setCod_Personalidad(CodigoParentesco);

            // Buscar el objeto correspondiente en la base de datos
            ObjectSet result = Base.get(miperso);

            // Verificar si se encontró un objeto para modificar
            if (result.hasNext()) {
                Personalidad nuedisca = (Personalidad) result.next();

                // Actualizar los campos del objeto con los nuevos valores
                nuedisca.setPersonalidad(Nuevo_Tipo_Parentesco);
                nuedisca.setObservacion(Nueva_Observacion);

                // Almacenar los cambios en la base de datos
                Base.store(nuedisca);

                // Mostrar un mensaje de confirmación al usuario
                JOptionPane.showMessageDialog(this, "Se modificó la discapacidad correctamente.");

                // Actualizar la tabla después de la modificación
                MostrarDatos(Base);

                // Limpiar los campos
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se encontró la discapacidad para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void ConsultarRegistro(ObjectContainer base, String Cod_Discapacidad) {

        Personalidad nacio = new Personalidad(Cod_Discapacidad, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(nacio);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Personalidad registroConsultado = (Personalidad) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    private void EliminarRegistro(ObjectContainer base, String codigoParentesco) {

        Personalidad midisca = new Personalidad(codigoParentesco, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = base.queryByExample(midisca);

        if (result.hasNext()) {
            // Mensaje de depuración
            System.out.println("Eliminando el registro de la base de datos...");

            base.delete(result.next());
            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
            Limpiar();
            MostrarDatos(base);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    //Verificacion
    public static int Verificacion_disca(ObjectContainer Base, String Codigo) {
        Personalidad miDis = new Personalidad();
        miDis.setCod_Personalidad(Codigo);
        ObjectSet result = Base.get(miDis);

        return result.size();
    }

    public void ValidaDiscapacidad(String Discapacidad) throws Exception {
        // La expresión regular permite letras mayúsculas y minúsculas.
        if (!Discapacidad.matches("^[A-Za-z ]+$")) {
            throw new Exception("Ingrese el parentesco válido. Solo letras y espacios son permitidos.");
        }
    }

    public void ValidaObservacion(String Observacion) throws Exception {
        // La expresión regular permite letras mayúsculas, minúsculas, números y espacios.
        if (!Observacion.matches("^[A-Za-z0-9 ]+$")) {
            throw new Exception("Ingrese una observación válida. Solo letras, números y espacios son permitidos.");
        }
    }

    public void Limpiar() {

        Txt_Parentesco.setText("");
        Txt_Observacion.setText("");

    }

    public static String calcularIDPerso(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("PER-%04d", incremental);

            if (Verificacion_disca(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }
}