/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import Clases.Especializacion;
import Login.IniciaAdmin;
import Login.PagPrincipalAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

public class Crud_Especialidad extends javax.swing.JFrame {

    Object[] columna = new Object[4];
    Especializacion miNaci = new Especializacion();
    String Cod_Especializacion = "";
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
        Txt_Descripcion = new javax.swing.JTextField();
        Txt_Especializacion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(245, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(245, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Descripción");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

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
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Txt_Descripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Descripcion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Descripcion.setText("Ejem: Esta esp...");
        Txt_Descripcion.setBorder(null);
        Txt_Descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_DescripcionMousePressed(evt);
            }
        });
        Txt_Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_DescripcionActionPerformed(evt);
            }
        });
        jPanel2.add(Txt_Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 215, 20));

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
        jPanel2.add(Txt_Especializacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 215, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 268, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 284, 500));

        jTableEspecialidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Especializacion ", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 477, 401));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Txt_EspecializacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EspecializacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_EspecializacionActionPerformed

    private void Txt_DescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DescripcionMousePressed
        if (Txt_Descripcion.getText().equals("Ejem: Esta esp...")) {
            Txt_Descripcion.setText("");
            Txt_Descripcion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Especializacion.getText()).isEmpty()) {
            Txt_Especializacion.setText("Ejem: Escolar");
            Txt_Especializacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_DescripcionMousePressed

    private void Txt_DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_DescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_DescripcionActionPerformed

    private void Txt_EspecializacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_EspecializacionMousePressed
        if (Txt_Especializacion.getText().equals("Ejem: Escolar")) {
            Txt_Especializacion.setText("");
            Txt_Especializacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Descripcion.getText()).isEmpty()) {
            Txt_Descripcion.setText("Ejem: Esta esp...");
            Txt_Descripcion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_EspecializacionMousePressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableEspecialidad.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Descripcion.getText().equals("Ejem: Esta esp...") || Txt_Descripcion.getText().isEmpty() || Txt_Especializacion.getText().equals("Ejem: Escolar") || Txt_Especializacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            Ingresar_Datos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEspecialidadMouseClicked
        int seleccion = jTableEspecialidad.getSelectedRow();

        if (seleccion >= 0) { // Verificar que haya una fila seleccionada
            // Obtén los valores de las celdas seleccionadas y establece en los campos de texto
            Txt_Especializacion.setText(String.valueOf(jTableEspecialidad.getValueAt(seleccion, 1)));
            Txt_Descripcion.setText(String.valueOf(jTableEspecialidad.getValueAt(seleccion, 2)));
        }

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
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableEspecialidad.getModel();
            int filaSeleccionada = jTableEspecialidad.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoEspecializacion = (String) modelo.getValueAt(filaSeleccionada, 0);
            String nuevaEspecializacion = JOptionPane.showInputDialog(this, "Ingrese la nueva especialización:", modelo.getValueAt(filaSeleccionada, 1));
            String nuevaDescripcion = JOptionPane.showInputDialog(this, "Ingrese la nueva descripción:", modelo.getValueAt(filaSeleccionada, 2));

            if (nuevaEspecializacion != null && nuevaDescripcion != null) {
                Modificar_Especializacion(Base, codigoEspecializacion, nuevaEspecializacion, nuevaDescripcion);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void Btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConsultarActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }
    }//GEN-LAST:event_Btn_ConsultarActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        Base.close();
        IniciaAdmin loginadmin = new IniciaAdmin();
        loginadmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Base.close();
        PagPrincipalAdmin paginaprinciadmi = new PagPrincipalAdmin();
        paginaprinciadmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JTextField Txt_Descripcion;
    private javax.swing.JTextField Txt_Especializacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableEspecialidad;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public void Ingresar_Datos(ObjectContainer Base) {
        try {
            // Calcular el ID de la discapacidad
            Cod_Especializacion = CalcularIDEspe(Base);

            // Obtener los datos de los campos de texto
            String Especializacion = Txt_Especializacion.getText();
            String Descricpion = Txt_Descripcion.getText();

            // Verificar si la discapacidad ya existe en la base de datos
            if (Verificacion_Esp(Base, Cod_Especializacion) == 0) {
                // Guardar el objeto en la base de datos
                // Crear un objeto Discapacidad
                Especializacion miEspe = new Especializacion();
                miEspe.setCod_Especializacion(Cod_Especializacion);
                miEspe.setEspecializacion(Especializacion);
                miEspe.setDescripcion_Esp(Descricpion);
                Base.set(miEspe);
                Base.commit(); // Commit para confirmar la transacción
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(Base);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. La discapacidad ya existe en la base de datos.");
            }

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al crear la discapacidad");
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
                miespe.getEspecializacion(),
                miespe.getDescripcion_Esp()
            });
        }
    }

    public void Modificar_Especializacion(ObjectContainer base, String codigoEspecializacion, String Nv_Especializacion, String Nv_Descripcion) {
        try {
            ValidaEspecializacion(Nv_Especializacion);
            ValidaDescripcion(Nv_Descripcion);

            Especializacion esp = new Especializacion();
            esp.setCod_Especializacion(codigoEspecializacion);

            ObjectSet result = base.get(esp);

            if (result.hasNext()) {
                Especializacion nueEsp = (Especializacion) result.next();

  
                nueEsp.setEspecializacion(Nv_Especializacion);
                nueEsp.setDescripcion_Esp(Nv_Descripcion);


                base.store(nueEsp);

                JOptionPane.showMessageDialog(this, "Se modificaron los datos correctamente.");

                MostrarDatos(base);

                Limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se encontró la especialización para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public void ConsultarDatos(ObjectContainer base, Especializacion consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableEspecialidad.getModel();

        modelo.setRowCount(0);

        if (consulta != null) {
            modelo.addRow(new Object[]{
                consulta.getCod_Especializacion(),
                consulta.getEspecializacion()
            });
        }
    }

    private void EliminarRegistro(ObjectContainer base, String Cod_Especializacion) {

        Especializacion especializacion = new Especializacion(Cod_Especializacion, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = base.queryByExample(especializacion);

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

    private void ConsultarRegistro(ObjectContainer base, String Cod_Especializacion) {

        // Creando un objeto de ejemplo para la consulta
        Especializacion especializacion = new Especializacion(Cod_Especializacion, null, null);

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
    public static int Verificacion_Esp(ObjectContainer Base, String Codigo) {
        Especializacion miDis = new Especializacion();
        miDis.setCod_Especializacion(Codigo);
        ObjectSet result = Base.get(miDis);

        return result.size();
    }

    public void ValidaEspecializacion(String Espe) throws Exception {
        if (!Espe.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese un país valido");
        }

    }

    public void ValidaDescripcion(String Observacion) throws Exception {
        // La expresión regular permite letras mayúsculas, minúsculas, números y espacios.
        if (!Observacion.matches("^[A-Za-z0-9 ]+$")) {
            throw new Exception("Ingrese una observación válida. Solo letras, números y espacios son permitidos.");
        }
    }

    public void Limpiar() {
        Txt_Descripcion.setText("");
        Txt_Especializacion.setText("");

    }

    public static String CalcularIDEspe(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("ESP-%04d", Incremental);

            if (Verificacion_Esp(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }
}
