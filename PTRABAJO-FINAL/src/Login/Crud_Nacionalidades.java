/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.Contenedor_Base;
import Clases.Especializacion;
import com.db4o.*;
import Clases.Nacionalidad;
import Clases.Persona;
import Login.IniciaAdmin;
import Login.PagPrincipalAdmin;
import Login.PagPrincipalAdmin;
import Login.Seleccion;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
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
    String Codigo_Nac = "";
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
        Btn_Modificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        Btn_Consultar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNacionalidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 460, 400));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina los datos existentes en la tabla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 100, -1));

        Btn_Modificar.setText("Modificar");
        Btn_Modificar.setToolTipText("Modifica los datos existentes en la tabla");
        Btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 100, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Actializa los datos existentes en la tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, -1));

        btnMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnMinimizar1.setText("—");
        btnMinimizar1.setToolTipText("Minimizar Pagina dando click aqui");
        btnMinimizar1.setBorder(null);
        btnMinimizar1.setOpaque(false);
        btnMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizar1MouseClicked(evt);
            }
        });
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 30, 30));

        jButton1.setText("Consultar");
        jButton1.setToolTipText("Consulta los datos existentes en la tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 460, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("GESTIÓN NACIONALIDADES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Nacionalidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        Txt_Nacionalidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Nacionalidad.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Nacionalidad.setText("Ejem: Ecuatoriano");
        Txt_Nacionalidad.setToolTipText("Ingrese la nacionalidad");
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
        jPanel2.add(Txt_Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 210, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("País:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        Txt_Pais.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Pais.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Pais.setText("Ejem: Ecuador");
        Txt_Pais.setToolTipText("Ingrese el país");
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
        jPanel2.add(Txt_Pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 10));

        Txt_Observacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Observacion.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Observacion.setText("Ejem: Este país...");
        Txt_Observacion.setToolTipText("Ingrese la observación del país");
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
        jPanel2.add(Txt_Observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 210, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Observación:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guarda los datos ingresados");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 210, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 270, 340));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 100, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 100, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 100, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 100, 10));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setToolTipText("Regresa al iniciar sesión");
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 50, 40));

        Btn_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(Btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 810, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -25, -1, 510));

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
        setLocationRelativeTo(null);
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

    }//GEN-LAST:event_Txt_ObservacionMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (Txt_Nacionalidad.getText().equals("Ejem: Ecuatoriano") || Txt_Nacionalidad.getText().isEmpty() || Txt_Pais.getText().equals("Ejem: Ecuador") || Txt_Pais.getText().isEmpty() || Txt_Observacion.getText().equals("Ejem: Este país...") || Txt_Observacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llene los campos por favor");
        } else {
            Ingresar_Datos(Base);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTableNacionalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNacionalidadesMouseClicked
        int seleccion = jTableNacionalidades.getSelectedRow();

        if (seleccion >= 0) { // Verificar que haya una fila seleccionada
            // Obtén los valores de las celdas seleccionadas y establece en los campos de texto
            Txt_Nacionalidad.setText(String.valueOf(jTableNacionalidades.getValueAt(seleccion, 1)));
            Txt_Pais.setText(String.valueOf(jTableNacionalidades.getValueAt(seleccion, 2)));
            Txt_Observacion.setText(String.valueOf(jTableNacionalidades.getValueAt(seleccion, 3)));

        }
    }//GEN-LAST:event_jTableNacionalidadesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableNacionalidades.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void Btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ModificarActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableNacionalidades.getModel();
            int filaSeleccionada = jTableNacionalidades.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoNacionalidad = (String) modelo.getValueAt(filaSeleccionada, 0);
            String tipoPais = JOptionPane.showInputDialog(this, "Ingrese el nuevo Pais:", modelo.getValueAt(filaSeleccionada, 1));
            String Nacionalidad = JOptionPane.showInputDialog(this, "Ingrese la nueva nacionalidad:", modelo.getValueAt(filaSeleccionada, 2));
            String observacion = JOptionPane.showInputDialog(this, "Ingrese la nueva observación:", modelo.getValueAt(filaSeleccionada, 3));

            if (tipoPais != null && observacion != null) {
                Modificar_Nacionalidad(Base, codigoNacionalidad, tipoPais, Nacionalidad, observacion);
                MostrarDatos(Base);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }
    }//GEN-LAST:event_Btn_ModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(Crud_Nacionalidades.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Base.close();
        PagPrincipalAdmin prin = new PagPrincipalAdmin();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Nacionalidades().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Btn_Consultar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JTextField Txt_Nacionalidad;
    private javax.swing.JTextField Txt_Observacion;
    private javax.swing.JTextField Txt_Pais;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableNacionalidades;
    // End of variables declaration//GEN-END:variables

    public void Ingresar_Datos(ObjectContainer Base) {
        try {
            // Calcular el ID de la discapacidad
            Codigo_Nac = CalcularIDNac(Base);

            // Obtener los datos de los campos de texto
            String Nacional = Txt_Nacionalidad.getText();
            String Pais = Txt_Pais.getText();
            String Observac = Txt_Observacion.getText();

            // Verificar si la discapacidad ya existe en la base de datos
            if (Verificar_Nac(Base, Codigo_Nac) == 0) {
                // Guardar el objeto en la base de datos
                // Crear un objeto Discapacidad
                Nacionalidad miNaci = new Nacionalidad();
                miNaci.setCod_Nacionalidad(Codigo_Nac);
                miNaci.setNacionalidad(Nacional);
                miNaci.setPais_Origen(Pais);
                miNaci.setObservacion(Observac);

                Base.set(miNaci);
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

    public void MostrarDatos(ObjectContainer Base) {

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

    public void ConsultarDatos(ObjectContainer base, Nacionalidad consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableNacionalidades.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Nacionalidad(),
                consulta.getNacionalidad(),
                consulta.getObservacion(),
                consulta.getPais_Origen(),});
        }
    }

    public void Modificar_Nacionalidad(ObjectContainer Base, String CodNacionalidad, String nuevaNacionalidad, String nuevoPais, String nuevaObservacion) {
        try {
            int filaSeleccionada = jTableNacionalidades.getSelectedRow();

            if (filaSeleccionada != -1) {
                // Obtener el código de la Nacionalidad desde la fila seleccionada
                String codigoNacionalidad = (String) jTableNacionalidades.getValueAt(filaSeleccionada, 0);

                Nacionalidad nac = new Nacionalidad(codigoNacionalidad, null, null, null);
                ObjectSet result = Base.queryByExample(nac);

                if (result.hasNext()) {
                    Nacionalidad nueNac = (Nacionalidad) result.next();

                    // Validar los nuevos valores
                    ValidaNacionalidad(nuevaNacionalidad);
                    ValidaPais(nuevoPais);
                    ValidaObservacion(nuevaObservacion);

                    // Actualizar los valores en el objeto Nacionalidad
                    nueNac.setNacionalidad(nuevaNacionalidad);
                    nueNac.setPais_Origen(nuevoPais);
                    nueNac.setObservacion(nuevaObservacion);

                    // Actualizar la base de datos
                    Base.store(nueNac);

                    JOptionPane.showMessageDialog(this, "Se modificaron los datos correctamente.");

                    // Limpiar los campos de texto si es necesario
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Error: No se encontraron los datos para modificar.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

//    private void EliminarRegistro2(ObjectContainer base, String codigoNacionalidad) {
//
//        Nacionalidad nacionalidad = new Nacionalidad(codigoNacionalidad, null, null, null);
//
//        // Mensaje de depuración
//        System.out.println("Buscando el registro en la base de datos...");
//
//        ObjectSet result = base.queryByExample(nacionalidad);
//
//        if (result.hasNext()) {
//            // Mensaje de depuración
//            System.out.println("Eliminando el registro de la base de datos...");
//
//            base.delete(result.next());
//            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
//            Limpiar();
//            MostrarDatos(base); // Actualizar la tabla después de la eliminación
//        } else {
//            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
//        }
//    }
    private void EliminarRegistro(ObjectContainer base, String codigoNacionalidad) {

        Nacionalidad nacionalidad = new Nacionalidad(codigoNacionalidad, null, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = base.queryByExample(nacionalidad);
        if (result.hasNext()) {
            Nacionalidad midiscas = (Nacionalidad) result.next();
            String dis = midiscas.getCod_Nacionalidad();

            Persona per = new Persona();
            per.setCod_Nacionalidad(dis);

            ObjectSet rest = base.get(per);

            if (rest.size() == 0) {

                System.out.println("Eliminando el registro de la base de datos...");

                base.delete(midiscas);
                JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
                Limpiar();
                MostrarDatos(base);

            } else {
                JOptionPane.showMessageDialog(this, "No se Puede eliminar a esta Nacionalidad \n"
                        + "Ya se encuentra registra con " + rest.size() + " Usuarios");
            }

            // Mensaje de depuración
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    private void ConsultarRegistro(ObjectContainer base, String Cod_Nacionalidad) {

        Nacionalidad nacio = new Nacionalidad(Cod_Nacionalidad, null, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(nacio);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Nacionalidad registroConsultado = (Nacionalidad) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    //Verificacion
    public static int Verificar_Nac(ObjectContainer Base, String Codigo) {
        Nacionalidad miNac = new Nacionalidad();
        miNac.setCod_Nacionalidad(Codigo);
        ObjectSet result = Base.get(miNac);

        return result.size();
    }

    public void ValidaPais(String Pais) throws Exception {
        if (!Pais.matches("^[A-Za-z ]+$")) {
            throw new Exception("Ingrese un país valido");
        }

    }

    public void ValidaNacionalidad(String Nacionalidad) throws Exception {
        if (!Nacionalidad.matches("^[A-Za-z]+$")) {
            throw new Exception("Ingrese una nacionalidad valida");
        }
    }

    public void ValidaObservacion(String Observacion) throws Exception {
        if (!Observacion.matches("^[A-Za-z0-9 ]+$")) {
            throw new Exception("Ingrese una observacion valida");
        }

    }

    public void Limpiar() {
        Txt_Nacionalidad.setText("");
        Txt_Pais.setText("");
        Txt_Observacion.setText("");

    }

    public static String CalcularIDNac(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("NAC-%04d", Incremental);

            if (Verificar_Nac(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

}
