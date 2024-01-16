/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Cuento;
import Login.PagPrincipalAdmin;
import Login.RegistrarsePariente;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    byte[] imagenInicial;
    byte[] imagenFinal;
    ObjectContainer Base;
    String rutaImagenInicial;
    String rutaImagenFinal;

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
        lblImagenFinal = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        btnImagenFinal = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnImagenInicial = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        lblImagenInicial = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuentos = new javax.swing.JTable();
        BtnRegresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
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
        jPanel4.setMinimumSize(new java.awt.Dimension(330, 1000));
        jPanel4.setPreferredSize(new java.awt.Dimension(330, 1000));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 240, 10));

        lblDesarrollo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDesarrollo.setText("Desarrollo:");
        jPanel4.add(lblDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        lblIntroduccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIntroduccion.setText("Introducción");
        jPanel4.add(lblIntroduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 240, 10));
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
        lblCodigo.setText("Código:");
        jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("CRUD CUENTOS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        txtDesarrollo.setColumns(20);
        txtDesarrollo.setRows(5);
        jScrollPane5.setViewportView(txtDesarrollo);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 240, 70));

        txtAreaIntroduccion.setColumns(20);
        txtAreaIntroduccion.setRows(5);
        jScrollPane6.setViewportView(txtAreaIntroduccion);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 240, 70));

        txtConclusion.setColumns(20);
        txtConclusion.setRows(5);
        jScrollPane7.setViewportView(txtConclusion);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 240, 70));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 870, 240, 10));

        lblConclusion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblConclusion.setText("Conclusion:");
        jPanel4.add(lblConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        lblImagenFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagenFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(lblImagenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 240, 130));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 240, 10));

        btnImagenFinal.setText("Agregar Imagen Final");
        btnImagenFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenFinalActionPerformed(evt);
            }
        });
        jPanel4.add(btnImagenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, 240, -1));

        btnInsertar.setText("Agregar Cuento");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel4.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 930, -1, -1));

        btnImagenInicial.setText("Agregar Imagen Comienzo");
        btnImagenInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenInicialActionPerformed(evt);
            }
        });
        jPanel4.add(btnImagenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, -1));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 10));

        lblImagenInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagenInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(lblImagenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 130));

        jScrollPane4.setViewportView(jPanel4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Titulo", "Introducción", "Desarrollo", "Conclusión", "RutaImagen", "RutaImagen2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

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

    private void btnImagenFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenFinalActionPerformed
        if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpeg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                imagenFinal = AbrirArchivo(archivo);

                // Convierte el array de bytes a un objeto Image
                Image imagenOriginal = convertirBytesAImagen(imagenFinal);

                // Redimensiona la imagen a 96x15
                Image imagenRedimensionada = imagenOriginal.getScaledInstance(240, 130, Image.SCALE_SMOOTH);

                // Crea un ImageIcon a partir de la imagen redimensionada
                ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

                lblImagenFinal.setIcon(iconoRedimensionado);

                // Almacena la ruta del archivo seleccionado en la variable rutaImagenFinal
                rutaImagenFinal = archivo.getAbsolutePath();
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btnImagenFinalActionPerformed

    private Image convertirBytesAImagen(byte[] bytes) {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
            return ImageIO.read(bis);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void Txt_CodigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_CodigoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_CodigoMouseExited

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Cuento elcue = new Cuento();
        elcue.setCod_Cuento(Txt_Codigo.getText());
        elcue.setFK_CodPsicologo(RegistrarsePariente.Calcular_cod_Representante(Base));
        elcue.setTitulo_Cuento(Txt_Titulo.getText());
        elcue.setIntroduccion_Cuento(txtAreaIntroduccion.getText());
        elcue.setNudo_Cuento(txtDesarrollo.getText());
        elcue.setDesenlace_Cuento(txtConclusion.getText());
        elcue.setImagen_Inicial(imagenInicial);
        elcue.setImagen_Final(imagenFinal);

        // Almacena la ruta de la imagen en la propiedad de la entidad Cuento
        elcue.setRutaImagen(rutaImagenInicial);
        elcue.setRutaImagen2(rutaImagenFinal);

        Base.store(elcue);
        javax.swing.JOptionPane.showMessageDialog(this, "SE GUARDÓ EN LA BASE");
        MostrarDatos(Base);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        PagPrincipalAdmin prinAdmn = new PagPrincipalAdmin();
        prinAdmn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnImagenInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenInicialActionPerformed
        if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpeg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                imagenInicial = AbrirArchivo(archivo);

                // Convierte el array de bytes a un objeto Image
                Image imagenOriginal = convertirBytesAImagen(imagenInicial);

                // Redimensiona la imagen a 96x15
                Image imagenRedimensionada = imagenOriginal.getScaledInstance(240, 130, Image.SCALE_SMOOTH);

                // Crea un ImageIcon a partir de la imagen redimensionada
                ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

                lblImagenInicial.setIcon(iconoRedimensionado);

                // Almacena la ruta del archivo seleccionado en la variable rutaImagenInicial
                rutaImagenInicial = archivo.getAbsolutePath();
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btnImagenInicialActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        jTableCuentos.setVisible(true);
        MostrarDatos(Base);

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar_Cuento(Base, rutaImagenFinal, rutaImagenFinal, rutaImagenFinal, rutaImagenFinal, rutaImagenFinal, rutaImagenFinal, rutaImagenFinal);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

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
            Cuento miCuento = (Cuento) result.next();
            modelo.addRow(new Object[]{
                miCuento.getCod_Cuento(),
                miCuento.getTitulo_Cuento(),
                miCuento.getIntroduccion_Cuento(),
                miCuento.getNudo_Cuento(),
                miCuento.getDesenlace_Cuento(),
                miCuento.getRutaImagen(),
                miCuento.getRutaImagen2()

            });
        }

    }

    public byte[] AbrirArchivo(File archivo) {
        try ( FileInputStream entrada = new FileInputStream(archivo)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = entrada.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;  // Devuelve null si hay algún error al leer la imagen
        }
    }

    public static int VerificarCuento(ObjectContainer Base, String Codigo) {
        Cuento elInfo = new Cuento();
        elInfo.setCod_Cuento(Codigo);
        ObjectSet result = Base.get(elInfo);
        return result.size();
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTextField Txt_Codigo;
    private javax.swing.JTextField Txt_Titulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImagenFinal;
    private javax.swing.JButton btnImagenInicial;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
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
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableCuentos;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConclusion;
    private javax.swing.JLabel lblDesarrollo;
    private javax.swing.JLabel lblImagenFinal;
    private javax.swing.JLabel lblImagenInicial;
    private javax.swing.JLabel lblIntroduccion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaIntroduccion;
    private javax.swing.JTextArea txtConclusion;
    private javax.swing.JTextArea txtDesarrollo;
    // End of variables declaration//GEN-END:variables

    public void Modificar_Cuento(ObjectContainer base, String Codigo, String Titulo, String Ruta1, String Introduccion, String Desarrollo, String Conclusion, String Ruta2) {
        try {
            // Crear un objeto Cuento con el código proporcionado
            Cuento cuento = new Cuento();
            cuento.setCod_Cuento(Codigo);

            // Buscar el objeto correspondiente en la base de datos
            ObjectSet<Cuento> result = base.queryByExample(cuento);

            // Verificar si se encontró un objeto para modificar
            if (result.hasNext()) {
                Cuento nueCuen = result.next();

                // Actualizar los campos del objeto con los nuevos valores
                nueCuen.setTitulo_Cuento(Titulo);
                nueCuen.setRutaImagen(Ruta1);
                nueCuen.setIntroduccion_Cuento(Introduccion);
                nueCuen.setNudo_Cuento(Desarrollo);
                nueCuen.setDesenlace_Cuento(Conclusion);
                nueCuen.setRutaImagen2(Ruta2);

                // Almacenar los cambios en la base de datos
                base.store(nueCuen);

                // Mostrar un mensaje de confirmación al usuario
                javax.swing.JOptionPane.showMessageDialog(null, "Se modificó el cuento correctamente.");
            } else {
                // Mostrar un mensaje de error si no se encontró el objeto
                javax.swing.JOptionPane.showMessageDialog(null, "Error: No se encontró el cuento para modificar.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error al modificar el cuento.");
        }
    }

    private void ConsultarRegistro(ObjectContainer base, String CodCuento) {

        // Creando un objeto de ejemplo para la consulta
        Cuento especializacion = new Cuento(CodCuento, null, null, null, null, null, null, null, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(especializacion);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Cuento registroConsultado = (Cuento) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(Base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

        public void ConsultarDatos(ObjectContainer base, Cuento consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableCuentos.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Cuento(),
                consulta.getTitulo_Cuento(),
                consulta.getRutaImagen(),
                consulta.getIntroduccion_Cuento(),
                consulta.getNudo_Cuento(),
                consulta.getDesenlace_Cuento(),
                consulta.getRutaImagen2()
                
            });
        }
    }
        
        private void EliminarRegistro(ObjectContainer base, String Cod_Cuento) {

            Cuento cuen = new Cuento(Cod_Cuento, null, null, null, null, null, null, null, null, null);

            // Mensaje de depuración
            System.out.println("Buscando el registro en la base de datos...");

            ObjectSet result = base.queryByExample(cuen);

            if (result.hasNext()) {
                // Mensaje de depuración
                System.out.println("Eliminando el registro de la base de datos...");

                base.delete(result.next());
                JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
                MostrarDatos(base); // Actualizar la tabla después de la eliminación
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
            }
        } 



}
