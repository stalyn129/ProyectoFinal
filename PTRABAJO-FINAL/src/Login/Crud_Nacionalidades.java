/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.Contenedor_Base;
import com.db4o.*;
import Clases.Nacionalidad;
import Login.Seleccion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class Crud_Nacionalidades extends javax.swing.JFrame {

    Object[] columna = new Object[4];
    Nacionalidad miNaci = new Nacionalidad();
    DefaultTableModel Modelo = new DefaultTableModel() {
        public boolean isCellEditable(int Fila, int Columna) {
            return false;
        }
    };
    ObjectContainer Base;

    public Crud_Nacionalidades() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNacionalidades = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Nacionalidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Txt_Pais = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Txt_Observacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Txt_Codigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNacionalidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Pais", "Nacionalidad", "Observación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNacionalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNacionalidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNacionalidades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 470, 400));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        jButton2.setText("Modificar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("CRUD NACIONALIDADES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 44, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nacionalidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        Txt_Nacionalidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Nacionalidad.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Nacionalidad.setText("Ejem: Ecuatoriano");
        Txt_Nacionalidad.setBorder(null);
        Txt_Nacionalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_NacionalidadMousePressed(evt);
            }
        });
        Txt_Nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NacionalidadActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("País:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        Txt_Pais.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Pais.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Pais.setText("Ejem: Ecuador");
        Txt_Pais.setBorder(null);
        Txt_Pais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_PaisMousePressed(evt);
            }
        });
        Txt_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PaisActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 10));

        Txt_Observacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Este país...");
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
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Observación:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

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
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Codigo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Txt_Codigo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Codigo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Codigo.setText("Ejem: NAC-001");
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
        jPanel2.add(Txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 20));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen de WhatsApp 2024-01-03 a las 07.58.17_8bdfab4c.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void Txt_NacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NacionalidadActionPerformed

    private void Txt_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_PaisActionPerformed

    private void Txt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ObservacionActionPerformed

    private void Txt_NacionalidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_NacionalidadMousePressed
        if (Txt_Nacionalidad.getText().equals("Ejem: Ecuatoriano")) {
            Txt_Nacionalidad.setText("");
            Txt_Nacionalidad.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Pais.getText()).isEmpty()) {
            Txt_Pais.setText("Ejem: Ecuador");
            Txt_Pais.setForeground(Color.gray);

        }
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Este país...");
            Txt_Observacion.setForeground(Color.gray);
        }

        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: NAC-001");
            Txt_Codigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_NacionalidadMousePressed

    private void Txt_PaisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_PaisMousePressed
        if (Txt_Pais.getText().equals("Ejem: Ecuador")) {
            Txt_Pais.setText("");
            Txt_Pais.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Nacionalidad.getText()).isEmpty()) {
            Txt_Nacionalidad.setText("Ejem: Ecuatoriano");
            Txt_Nacionalidad.setForeground(Color.gray);

        }
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Este país...");
            Txt_Observacion.setForeground(Color.gray);
        }

        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: NAC-001");
            Txt_Codigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_PaisMousePressed

    private void Txt_ObservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ObservacionMousePressed
        if (Txt_Observacion.getText().equals("Ejem: Este país...")) {
            Txt_Observacion.setText("");
            Txt_Observacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Pais.getText()).isEmpty()) {
            Txt_Pais.setText("Ejem: Ecuador");
            Txt_Pais.setForeground(Color.gray);

        }
        if (String.valueOf(Txt_Nacionalidad.getText()).isEmpty()) {
            Txt_Nacionalidad.setText("Ejem: Ecuatoriano");
            Txt_Nacionalidad.setForeground(Color.gray);
        }

        if (String.valueOf(Txt_Codigo.getText()).isEmpty()) {
            Txt_Codigo.setText("Ejem: NAC-001");
            Txt_Codigo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PagPrincipalAdmin prinAdmn = new PagPrincipalAdmin();
        prinAdmn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Codigo.getText().equals("Ejem: NAC-001") || Txt_Nacionalidad.getText().equals("Ejem: Ecuatoriano") || Txt_Pais.getText().equals("Ejem: Ecuador") || Txt_Observacion.getText().equals("Ejem: Este país...")) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            Ingresar_Datos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableNacionalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNacionalidadesMouseClicked
        int Seleccion = jTableNacionalidades.getSelectedRow();

        Txt_Codigo.setText(String.valueOf(jTableNacionalidades.getValueAt(Seleccion, 0)));
        Txt_Pais.setText(String.valueOf(jTableNacionalidades.getValueAt(Seleccion, 1)));
        Txt_Nacionalidad.setText(String.valueOf(jTableNacionalidades.getValueAt(Seleccion, 2)));
        Txt_Observacion.setText(String.valueOf(jTableNacionalidades.getValueAt(Seleccion, 3)));
    }//GEN-LAST:event_jTableNacionalidadesMouseClicked

    private void Txt_CodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMousePressed
        if (Txt_Codigo.getText().equals("Ejem: NAC-001")) {
            Txt_Codigo.setText("");
            Txt_Codigo.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Pais.getText()).isEmpty()) {
            Txt_Pais.setText("Ejem: Ecuador");
            Txt_Pais.setForeground(Color.gray);

        }
        if (String.valueOf(Txt_Nacionalidad.getText()).isEmpty()) {
            Txt_Nacionalidad.setText("Ejem: Ecuatoriano");
            Txt_Nacionalidad.setForeground(Color.gray);
        }

        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Este país...");
            Txt_Observacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_CodigoMousePressed

    private void Txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = jTableNacionalidades.getSelectedRow();

    if (selectedRow != -1) {
        String codigoNacionalidad = (String) jTableNacionalidades.getValueAt(selectedRow, 0);

        try {
            EliminarRegistro(codigoNacionalidad.toUpperCase());
            // Mueve la cerradura de la base de datos aquí
            Base.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar");
}

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableNacionalidades.setVisible(true);
        MostrarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Nacionalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Nacionalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Nacionalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Nacionalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Nacionalidades().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Nacionalidad;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JTextField Txt_Pais;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableNacionalidades;
    // End of variables declaration//GEN-END:variables

    public void Ingresar_Datos(ObjectContainer Base) {
        try {
            String codNacionalidad = Txt_Codigo.getText();
            String nacionalidad = Txt_Nacionalidad.getText();
            String paisOrigen = Txt_Pais.getText();
            String observacion = Txt_Observacion.getText();

            // Validar los datos antes de ingresarlos
            ValidaCodigo(codNacionalidad);
            ValidaPais(paisOrigen);
            ValidaNacionalidad(nacionalidad);
            ValidaObservacion(observacion);

            Nacionalidad miNaci = new Nacionalidad(codNacionalidad, paisOrigen, nacionalidad, observacion);

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
        String Cod_Nacionalidad = Txt_Codigo.getText();
        Nacionalidad Cod = new Nacionalidad(Cod_Nacionalidad, null, null, null);
        ObjectSet<Nacionalidad> result = Base.get(Cod);
        return result.size();
    }

    public void ValidaCodigo(String Codigo) throws Exception {
        if (!Codigo.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("Ingrese un codigo valido");
        }

    }

    public void ValidaPais(String Pais) throws Exception {
        if (!Pais.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese un país valido");
        }

    }

    public void ValidaNacionalidad(String Nacionalidad) throws Exception {
        if (!Nacionalidad.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese una nacionalidad valida");
        }
    }

    public void ValidaObservacion(String Observacion) throws Exception {
        if (!Observacion.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("Ingrese una observacion valida");
        }

    }

    public void Limpiar() {
        Txt_Codigo.setText("");
        Txt_Nacionalidad.setText("");
        Txt_Pais.setText("");
        Txt_Observacion.setText("");

    }

    public void MostrarDatos() {

        Nacionalidad nacio = new Nacionalidad();
        ObjectSet result = Base.get(nacio);

        DefaultTableModel modelo = (DefaultTableModel) jTableNacionalidades.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Nacionalidad minaci = (Nacionalidad) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Nacionalidad(),
                minaci.getPais_Origen(),
                minaci.getNacionalidad(),
                minaci.getObservacion()
            });
        }
        
    }

    private void EliminarRegistro(String codigoNacionalidad) {
        ObjectContainer base = null;

    try {
        // Mensaje de depuración
        System.out.println("Conectando a la base de datos...");

        base = Contenedor_Base.ConectarBase();
        Nacionalidad nacionalidad = new Nacionalidad(codigoNacionalidad, null, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet<Nacionalidad> result = base.queryByExample(nacionalidad);

        if (result.hasNext()) {
            // Mensaje de depuración
            System.out.println("Eliminando el registro de la base de datos...");

            base.delete(result.next());
            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
            Limpiar();
            MostrarDatos(); // Actualizar la tabla después de la eliminación
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    } catch (Exception ex) {
        // Mensaje de depuración
        System.err.println("Error al eliminar el registro: " + ex.getMessage());
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + ex.getMessage());
    } finally {
        if (base != null) {
            // Mensaje de depuración
            System.out.println("Cerrando la conexión a la base de datos...");

            base.close();
     }
    }
    }

}
