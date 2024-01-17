/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.Contenedor_Base;
import java.awt.Color;
import Clases.*;
import Login.PagPrincipalAdmin;
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
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Txt_Codigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblDiscapacidad = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 290, 500));

        jTblDiscapacidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 510, 480));

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
            Txt_Observacion.setText("Ejem: Esta discapacidad...");
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

    private void jTblDiscapacidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblDiscapacidadMouseClicked
        int Seleccion = jTblDiscapacidad.getSelectedRow();

        Txt_Codigo.setText(String.valueOf(jTblDiscapacidad.getValueAt(Seleccion, 0)));
        Txt_Discapacidad.setText(String.valueOf(jTblDiscapacidad.getValueAt(Seleccion, 1)));
        Txt_Observacion.setText(String.valueOf(jTblDiscapacidad.getValueAt(Seleccion, 2)));
    }//GEN-LAST:event_jTblDiscapacidadMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTblDiscapacidad.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Modificar_Nacionalidad(Base, Txt_Codigo.getText(),Txt_Discapacidad.getText(), Txt_Observacion.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

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
        IniciaAdmin loginadmin = new IniciaAdmin ();
        loginadmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Base.close();
        PagPrincipalAdmin paginaprinciadmi = new PagPrincipalAdmin();
        paginaprinciadmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

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
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Discapacidad;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
                MostrarDatos(Base);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. La Nacionalidad ya existe en la base de datos.");
            }

        } catch (Exception ex) {
            // Manejar la excepción de validación
            JOptionPane.showMessageDialog(this, ex.getMessage());
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

    public void Modificar_Nacionalidad(ObjectContainer Base, String Codigo, String Nueva_Tipo_Discapacidad, String Nueva_Observacion) {
        // Crear un objeto Nacionalidad con el código proporcionado
        Discapacidad disca = new Discapacidad();
        disca.setCod_Discapacidad(Codigo);

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
            javax.swing.JOptionPane.showMessageDialog(this, "Se modificó la discapacidad correctamente.");
        } else {
            // Mostrar un mensaje de error si no se encontró el objeto
            javax.swing.JOptionPane.showMessageDialog(this, "Error: No se encontró la discapacidad para modificar.");
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
}
