/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;
import Clases.Parentesco;
import Login.IniciaAdmin;
import Login.IniciaAdmin;
import Login.IniciaAdmin;
import Login.PagPrincipalAdmin;
import Login.PagPrincipalAdmin;
import Login.PagPrincipalAdmin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;

/**
 *
 * @author Usuario
 */
public class Crud_Parentesco extends javax.swing.JFrame {

    ObjectContainer Base;
    String Cod_Parentesco = "";

    public Crud_Parentesco() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidad = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_Observacion = new javax.swing.JTextField();
        Txt_Parentesco = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableParentesco = new javax.swing.JTable();
        btnActualizar1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        Btn_Consultar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        Btn_Consultar.setText("Consultar");
        Btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(245, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(245, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Observacion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Parentesco:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Txt_Observacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Soy...");
        Txt_Observacion.setToolTipText("Ingrese la observacion ");
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
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 215, 20));

        Txt_Parentesco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Txt_Parentesco.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Parentesco.setText("Ejem: Madre");
        Txt_Parentesco.setToolTipText("Ingrese el tipo de parentesco");
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
        jPanel2.add(Txt_Parentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 215, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, 10));

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda los datos registrados");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CRUD PARENTESCO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 210, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 310));

        jTableParentesco.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Parentesco  ", "Observacion"
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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 470, 410));

        btnActualizar1.setText("Actualizar");
        btnActualizar1.setToolTipText("Actuzaliza la tabla con sus datos");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        btnModificar1.setText("Modificar");
        btnModificar1.setToolTipText("Modifica los datos que exista en la tabla");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 370, 90, -1));

        Btn_Consultar1.setText("Consultar");
        Btn_Consultar1.setToolTipText("Consulta en la tabla los datos");
        Btn_Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Consultar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Consultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btnEliminar1.setText("Eliminar");
        btnEliminar1.setToolTipText("Elimina los datos que exista en la tabla");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 80, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 80, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 80, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 80, 10));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        jMenu1.setToolTipText("Configuración");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.setToolTipText("Cierra la Sesión iniciada");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.setToolTipText("Regresar a la página principal");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_ObservacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ObservacionMousePressed
        if (Txt_Observacion.getText().equals("Ejem: Soy...")) {
            Txt_Observacion.setText("");
            Txt_Observacion.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Parentesco.getText()).isEmpty()) {
            Txt_Parentesco.setText("Ejem: Madre");
            Txt_Parentesco.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void Txt_ObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ObservacionActionPerformed

    private void Txt_ParentescoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_ParentescoMousePressed
        if (Txt_Parentesco.getText().equals("Ejem: Madre")) {
            Txt_Parentesco.setText("");
            Txt_Parentesco.setForeground(Color.black);
        }
        if (String.valueOf(Txt_Observacion.getText()).isEmpty()) {
            Txt_Observacion.setText("Ejem: Soy...");
            Txt_Observacion.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_ParentescoMousePressed

    private void Txt_ParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ParentescoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ParentescoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Observacion.getText().equals("Ejem: Soy...") || Txt_Observacion.getText().isEmpty() || Txt_Parentesco.getText().equals("Ejem: Madre") || Txt_Parentesco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            IngresarDatos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEspecialidadMouseClicked
        int seleccion = jTableParentesco.getSelectedRow();

        if (seleccion >= 0) {

            Txt_Parentesco.setText(String.valueOf(jTableParentesco.getValueAt(seleccion, 1)));
            Txt_Observacion.setText(String.valueOf(jTableParentesco.getValueAt(seleccion, 2)));
        }
    }//GEN-LAST:event_jTableEspecialidadMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableParentesco.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();
            int filaSeleccionada = jTableParentesco.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoEspecializacion = (String) modelo.getValueAt(filaSeleccionada, 0);
            String nuevaEspecializacion = JOptionPane.showInputDialog(this, "Ingrese el nuevo parentesco:", modelo.getValueAt(filaSeleccionada, 1));
            String nuevaDescripcion = JOptionPane.showInputDialog(this, "Ingrese la nueva descripción:", modelo.getValueAt(filaSeleccionada, 2));

            if (nuevaEspecializacion != null && nuevaDescripcion != null) {
                Modificar_Discapacidad(Base, codigoEspecializacion, nuevaEspecializacion, nuevaDescripcion);
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableParentescoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableParentescoMouseClicked
        int seleccion = jTableParentesco.getSelectedRow();

        if (seleccion >= 0) {
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
            String nuevaEspecializacion = JOptionPane.showInputDialog(this, "Ingrese la nueva especialización:", modelo.getValueAt(filaSeleccionada, 1));
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
            java.util.logging.Logger.getLogger(Crud_Parentesco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Parentesco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Parentesco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Parentesco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Parentesco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton Btn_Consultar;
    private javax.swing.JButton Btn_Consultar1;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JTextField Txt_Parentesco;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTableEspecialidad;
    private javax.swing.JTable jTableParentesco;
    // End of variables declaration//GEN-END:variables
public void IngresarDatos(ObjectContainer base) {
        try {
            String codParentesco = calcularIDPare(base);
            String tipoParentesco = Txt_Parentesco.getText();
            String observacion = Txt_Observacion.getText();

            if (Verificacion_Paren(base, codParentesco) == 0) {
                Parentesco miPare = new Parentesco();
                miPare.setCod_Parentesco(codParentesco);  // Corregir esta línea
                miPare.setParentesco(tipoParentesco);
                miPare.setObservacion(observacion);

                base.set(miPare);
                base.commit();
                JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");
                Limpiar();
                MostrarDatos(base);
            } else {
                JOptionPane.showMessageDialog(this, "Los datos no se han guardado. El parentesco ya existe en la base de datos.");
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al crear el parentesco");
        }
    }

    public void MostrarDatos(ObjectContainer Base) {

        Parentesco dis = new Parentesco();
        ObjectSet result = Base.get(dis);

        DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Parentesco minaci = (Parentesco) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Parentesco(),
                minaci.getParentesco(),
                minaci.getObservacion()
            });
        }

    }

    public void ConsultarDatos(ObjectContainer base, Parentesco consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableParentesco.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Parentesco(),
                consulta.getObservacion(),
                consulta.getParentesco(),});
        }
    }

    public void Modificar_Discapacidad(ObjectContainer Base, String CodigoParentesco, String Nuevo_Tipo_Parentesco, String Nueva_Observacion) {
        try {
            ValidaDiscapacidad(Nuevo_Tipo_Parentesco);
            ValidaObservacion(Nueva_Observacion);

            // Crear un objeto Discapacidad con el código proporcionado
            Parentesco disca = new Parentesco();
            disca.setCod_Parentesco(CodigoParentesco);

            // Buscar el objeto correspondiente en la base de datos
            ObjectSet result = Base.get(disca);

            // Verificar si se encontró un objeto para modificar
            if (result.hasNext()) {
                Parentesco nuedisca = (Parentesco) result.next();

                // Actualizar los campos del objeto con los nuevos valores
                nuedisca.setParentesco(Nuevo_Tipo_Parentesco);
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

        Parentesco nacio = new Parentesco(Cod_Discapacidad, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(nacio);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Parentesco registroConsultado = (Parentesco) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    private void EliminarRegistro(ObjectContainer base, String codigoParentesco) {

        Parentesco midisca = new Parentesco(codigoParentesco, null, null);

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
    public static int Verificacion_Paren(ObjectContainer Base, String Codigo) {
        Parentesco miDis = new Parentesco();
        miDis.setCod_Parentesco(Codigo);
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

    public static String calcularIDPare(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("PARE-%04d", incremental);

            if (Verificacion_Paren(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }
}
