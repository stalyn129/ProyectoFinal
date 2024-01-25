/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import Clases.*;
import Login.IniciaAdmin;
import Login.PagPrincipalAdmin;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class Crud_Discapacidad extends javax.swing.JFrame {

    ObjectContainer Base;
    String Cod_Discapacidad = "";

    public Crud_Discapacidad() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
    }

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
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDiscapacidad = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
        BtnCerrarPagina = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(290, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(290, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 70));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Discapacidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Txt_Discapacidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Discapacidad.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Discapacidad.setText("Ejem: Motora");
        Txt_Discapacidad.setToolTipText("Ingrese la discapacidad");
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
        jPanel2.add(Txt_Discapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Observación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        Txt_Observacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Esta discapacidad esta asoc...");
        Txt_Observacion.setToolTipText("Ingrese el contexto de la discapacidad");
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
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda los datos ingresados");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("CRUD DISCAPACIDAD");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 300));

        jTblDiscapacidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Discapacidad", "Observación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblDiscapacidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblDiscapacidadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblDiscapacidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 400));

        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Actualiza los datos que exista en la tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modifica los datos que existen");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina los datos que exista en la tabla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 90, -1));

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.setToolTipText("Consulta los datos que exista en la tabla");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

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
        getContentPane().add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 90, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 70, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 80, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        jMenu1.setToolTipText("Configuracion");

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
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.setToolTipText("Regresa a la página principal");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_DiscapacidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_DiscapacidadMousePressed
        if (Txt_Discapacidad.getText().equals("Ejem: Motora")) {
            Txt_Discapacidad.setText("");
            Txt_Discapacidad.setForeground(Color.black);
        }

        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Esta discapacidad esta asoc...");
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
    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void Txt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ObservacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (Txt_Discapacidad.getText().isEmpty() || Txt_Discapacidad.getText().equals("Ejem:Motora") || Txt_Observacion.getText().equals("Ejem: Esta discapacidad esta asoc...") || Txt_Observacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Algunos campos estan vacios o o no son validos");
            } else {
                IngresarDatos(Base);
            }
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTblDiscapacidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblDiscapacidadMouseClicked
        int seleccion = jTblDiscapacidad.getSelectedRow();

        if (seleccion >= 0) { // Verificar que haya una fila seleccionada
            // Obtén los valores de las celdas seleccionadas y establece en los campos de texto
            Txt_Discapacidad.setText(String.valueOf(jTblDiscapacidad.getValueAt(seleccion, 1)));
            Txt_Observacion.setText(String.valueOf(jTblDiscapacidad.getValueAt(seleccion, 2)));
        }
    }//GEN-LAST:event_jTblDiscapacidadMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTblDiscapacidad.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTblDiscapacidad.getModel();
            int filaSeleccionada = jTblDiscapacidad.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoDiscapacidad = (String) modelo.getValueAt(filaSeleccionada, 0);
            String tipoDiscapacidad = JOptionPane.showInputDialog(this, "Ingrese el nuevo tipo de discapacidad:", modelo.getValueAt(filaSeleccionada, 1));
            String observacion = JOptionPane.showInputDialog(this, "Ingrese la nueva observación:", modelo.getValueAt(filaSeleccionada, 2));

            if (tipoDiscapacidad != null && observacion != null) {
                Modificar_Discapacidad(Base, codigoDiscapacidad, tipoDiscapacidad, observacion);
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

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Discapacidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JTextField Txt_Discapacidad;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTblDiscapacidad;
    // End of variables declaration//GEN-END:variables
public void IngresarDatos(ObjectContainer base) {
        try {
            String codDiscapacidad = calcularIDDisc(base);
            String tipoDiscapacidad = Txt_Discapacidad.getText();
            String observacion = Txt_Observacion.getText();

            if (Verificacion_disca(base, codDiscapacidad) == 0) {
                Discapacidad nuevaDiscapacidad = new Discapacidad(codDiscapacidad, tipoDiscapacidad, observacion);
                base.set(nuevaDiscapacidad);
                base.commit();
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(base);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. La discapacidad ya existe en la base de datos.");
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al crear la discapacidad");
        }
    }

    public void MostrarDatos(ObjectContainer Base) {

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

    public void ConsultarDatos(ObjectContainer base, Discapacidad consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTblDiscapacidad.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Discapacidad(),
                consulta.getObservacion(),
                consulta.getTipo_Discapacidad(),});
        }
    }

    public void Modificar_Discapacidad(ObjectContainer Base, String CodigoDiscapacidad, String Nueva_Tipo_Discapacidad, String Nueva_Observacion) {
        try {
            ValidaDiscapacidad(Nueva_Tipo_Discapacidad);
            ValidaObservacion(Nueva_Observacion);

            // Crear un objeto Discapacidad con el código proporcionado
            Discapacidad disca = new Discapacidad();
            disca.setCod_Discapacidad(CodigoDiscapacidad);

            // Buscar el objeto correspondiente en la base de datos
            ObjectSet result = Base.get(disca);

            // Verificar si se encontró un objeto para modificar
            if (result.hasNext()) {
                Discapacidad nuedisca = (Discapacidad) result.next();

                // Actualizar los campos del objeto con los nuevos valores
                nuedisca.setTipo_Discapacidad(Nueva_Tipo_Discapacidad);
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

        Discapacidad nacio = new Discapacidad(Cod_Discapacidad, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(nacio);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Discapacidad registroConsultado = (Discapacidad) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    private void EliminarRegistro(ObjectContainer base, String codigoDiscapacidad) {

        Discapacidad midisca = new Discapacidad(codigoDiscapacidad, null, null);

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
        Discapacidad miDis = new Discapacidad();
        miDis.setCod_Discapacidad(Codigo);
        ObjectSet result = Base.get(miDis);

        return result.size();
    }

    public void ValidaDiscapacidad(String Discapacidad) throws Exception {
        // La expresión regular permite letras mayúsculas y minúsculas.
        if (!Discapacidad.matches("^[A-Za-z ]+$")) {
            throw new Exception("Ingrese una discapacidad válida. Solo letras y espacios son permitidos.");
        }
    }

    public void ValidaObservacion(String Observacion) throws Exception {
        // La expresión regular permite letras mayúsculas, minúsculas, números y espacios.
        if (!Observacion.matches("^[A-Za-z0-9 ]+$")) {
            throw new Exception("Ingrese una observación válida. Solo letras, números y espacios son permitidos.");
        }
    }

    public void Limpiar() {

        Txt_Discapacidad.setText("");
        Txt_Observacion.setText("");

    }

    public static String calcularIDDisc(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("DISC-%04d", incremental);

            if (Verificacion_disca(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }
}
