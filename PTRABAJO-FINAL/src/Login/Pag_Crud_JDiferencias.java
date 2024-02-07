/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Juego_Diferencias;
import Clases.Puntuaciones;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Pag_Crud_JDiferencias extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    String Codigo_JLab = "";
    byte[] imagen;
    ObjectContainer Base;
    String rutaImagen;

    public Pag_Crud_JDiferencias() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        MostrarDatos(Base);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        lblImagenDiferencias = new javax.swing.JLabel();
        btn_Ingresar_imagen1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_ingresar1 = new javax.swing.JButton();
        btn_ingresar3 = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        bnt_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        txtNumDiferencias = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableJDif = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        LblInfor2Niño = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(623, 1043));
        jPanel3.setPreferredSize(new java.awt.Dimension(623, 1043));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagenDiferencias.setForeground(new java.awt.Color(204, 204, 204));
        lblImagenDiferencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenDiferencias.setText(" Ingresar Imagen");
        lblImagenDiferencias.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.add(lblImagenDiferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 550, 330));

        btn_Ingresar_imagen1.setText("Ingresar Imagen");
        btn_Ingresar_imagen1.setToolTipText("Selecciona la imagen que necesites");
        btn_Ingresar_imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar_imagen1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Ingresar_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 160, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 520, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("<html>Ingrese el número de diferencias que existen:<html>");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 220, 40));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 550, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese la imagen");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 550, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 350, 10));

        btn_ingresar1.setText("Ingresar");
        btn_ingresar1.setToolTipText("Ingresa datos nuevos a la tabla");
        btn_ingresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar1MouseClicked(evt);
            }
        });
        btn_ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 100, -1));

        btn_ingresar3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar3.setText("Consultar");
        btn_ingresar3.setToolTipText("Consulta los datos existentes en la tabla");
        btn_ingresar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar3MouseClicked(evt);
            }
        });
        btn_ingresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar3ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_ingresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 980, 100, -1));

        btn_Modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.setToolTipText("Modifica los datos existentes en la tabla");
        btn_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ModificarMouseClicked(evt);
            }
        });
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 980, 100, -1));

        bnt_Actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bnt_Actualizar.setText("Actualizar");
        bnt_Actualizar.setToolTipText("Actualiza los datos existentes en la tabla");
        bnt_Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnt_ActualizarMouseClicked(evt);
            }
        });
        bnt_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(bnt_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 980, 100, -1));

        btn_Eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setToolTipText("Elimina los datos existentes en la tabla");
        btn_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EliminarMouseClicked(evt);
            }
        });
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 980, 100, -1));
        jPanel3.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1020, 600, 10));

        txtNumDiferencias.setBorder(null);
        txtNumDiferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumDiferenciasActionPerformed(evt);
            }
        });
        txtNumDiferencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumDiferenciasKeyPressed(evt);
            }
        });
        jPanel3.add(txtNumDiferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 340, 40));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 570, 10));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 580, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Descripción:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel3.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 400, -1));

        jTableJDif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Respuesta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableJDif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableJDifMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableJDif);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 590, 280));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 260));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiñoConsejos.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -290, 1570, 960));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 640, 260));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 30));

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
        jPanel1.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 30, 30));

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 24)); // NOI18N
        LblInfor2Niño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño.setText("Juego de las Diferencias");
        jPanel1.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 330, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego1Niño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        JMenu3puntitosPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosPsicologo.setToolTipText("Configuración");

        JMnItmCerrarPsicologo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarPsicologo.setText("Cerrar Sesión");
        JMnItmCerrarPsicologo.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarPsicologo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMousePressed(evt);
            }
        });
        JMenu3puntitosPsicologo.add(JMnItmCerrarPsicologo);

        jMenuBar1.add(JMenu3puntitosPsicologo);

        JMnPgPrinPsicolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinPsicolo.setToolTipText("Resgresa a la página principal");
        JMnPgPrinPsicolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinPsicoloMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMnPgPrinPsicolo);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Ingresar_imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar_imagen1ActionPerformed
        if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpeg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                imagen = AbrirArchivo(archivo);

                // Convierte el array de bytes a un objeto Image
                Image imagenOriginal = convertirBytesAImagen(imagen);

                // Redimensiona la imagen a 96x15
                Image imagenRedimensionada = imagenOriginal.getScaledInstance(550, 330, Image.SCALE_SMOOTH);

                // Crea un ImageIcon a partir de la imagen redimensionada
                ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

                lblImagenDiferencias.setIcon(iconoRedimensionado);

                // Almacena la ruta del archivo seleccionado en la variable rutaImagenFinal
                rutaImagen = archivo.getAbsolutePath();
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btn_Ingresar_imagen1ActionPerformed

    private void btn_ingresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar1MouseClicked

    private void btn_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar1ActionPerformed
        // Validar campos antes de procesar la acción
        if (txtDescripcion.getText().isEmpty() || txtNumDiferencias.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;  // Detener el proceso si los campos no están completos
        }

        Juego_Diferencias Juego_Dif = new Juego_Diferencias();
        String codigoJDif = CalcularIDJuego(Base);
        Juego_Dif.setCod_Juego(codigoJDif);
        Juego_Dif.setFK_CodPsicologo(RegistrarsePariente.Calcular_cod_Representante(Base));
        Juego_Dif.setDescripcion_Juego(txtDescripcion.getText());

        try {
            int respuestaCorrecta = Integer.parseInt(txtNumDiferencias.getText());
            Juego_Dif.setRespuesta_Correcta(respuestaCorrecta);
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir el texto a entero: " + e.getMessage());
        }

        Juego_Dif.setImagen_Dif(imagen);
        Juego_Dif.setRutaImagen(rutaImagen);

        Base.store(Juego_Dif);
        javax.swing.JOptionPane.showMessageDialog(this, "SE GUARDÓ EN LA BASE");

        // Limpiar campos después de ingresar los datos
        limpiarCampos();

        MostrarDatos(Base);
    }//GEN-LAST:event_btn_ingresar1ActionPerformed

    private void limpiarCampos() {
        txtDescripcion.setText("");
        txtNumDiferencias.setText("");
        lblImagenDiferencias.setIcon(null);
    }

    private void btn_ingresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar3MouseClicked

    private void btn_ingresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar3ActionPerformed
        String codigoAConsultar = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");

        if (codigoAConsultar != null && !codigoAConsultar.isEmpty()) {
            ConsultarRegistro(Base, codigoAConsultar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para consultar.");
        }
    }//GEN-LAST:event_btn_ingresar3ActionPerformed

    private void btn_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ModificarMouseClicked

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTableJDif.getModel();
            int filaSeleccionada = jTableJDif.getSelectedRow();

            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
                return;
            }

            String codigoJuego = (String) modelo.getValueAt(filaSeleccionada, 0);
            String nuevaDescripcion = JOptionPane.showInputDialog(this, "Ingrese la nueva descripción:", modelo.getValueAt(filaSeleccionada, 1));

            if (nuevaDescripcion == null) {
                JOptionPane.showMessageDialog(this, "Error: La descripción no puede ser nula.");
                return;
            }

            String input = JOptionPane.showInputDialog(this, "Ingrese la nueva opción correcta:", modelo.getValueAt(filaSeleccionada, 2));

            if (input == null) {
                JOptionPane.showMessageDialog(this, "Error: La opción correcta no puede ser nula.");
                return;
            }

            int nuevaOpCorrecta = 0;

            try {
                nuevaOpCorrecta = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error al ingresar la opción correcta. Asegúrese de ingresar un número entero.");
                return;
            }

            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png", "gif");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String nuevaRutaImagen = selectedFile.getAbsolutePath();
                byte[] nuevaImagen = AbrirArchivo(selectedFile); // Utiliza el método AbrirArchivo para obtener el arreglo de bytes

                if (nuevaImagen != null) {
                    ModificarJuego(Base, codigoJuego, nuevaDescripcion, nuevaOpCorrecta, nuevaImagen, nuevaRutaImagen);
                    MostrarDatos(Base);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void bnt_ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnt_ActualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bnt_ActualizarMouseClicked

    private void bnt_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_ActualizarActionPerformed

    }//GEN-LAST:event_bnt_ActualizarActionPerformed

    private void btn_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EliminarMouseClicked

    }//GEN-LAST:event_btn_EliminarMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void txtNumDiferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumDiferenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumDiferenciasActionPerformed

    private void txtNumDiferenciasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumDiferenciasKeyPressed

    }//GEN-LAST:event_txtNumDiferenciasKeyPressed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void jTableJDifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableJDifMouseClicked
        int filaSeleccionada = jTableJDif.getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener el valor de la columna que contiene la descripción de la imagen
            String descripcionImagen = (String) jTableJDif.getValueAt(filaSeleccionada, 1);

            // Extraer la ruta de la imagen de la descripción
            String rutaImagen = extraerRutaDesdeDescripcion(descripcionImagen);

            if (rutaImagen != null) {
                // Actualizar el JLabel con la imagen correspondiente
                actualizarImagenEnJLabel(rutaImagen);
            }
        }

    }//GEN-LAST:event_jTableJDifMouseClicked

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        Base.close();
        InicioPsicologo loginPsicologo = new InicioPsicologo();
        loginPsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void JMnPgPrinPsicoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicoloMouseClicked
        Base.close();
        PagPrincipalPsicologo principal = new PagPrincipalPsicologo();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinPsicoloMouseClicked

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
        this.setState(Pag_Crud_JDiferencias.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pag_Crud_JDiferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JDiferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JDiferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JDiferencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pag_Crud_JDiferencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JButton bnt_Actualizar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Ingresar_imagen1;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JButton btn_ingresar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTableJDif;
    private javax.swing.JLabel lblImagenDiferencias;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNumDiferencias;
    // End of variables declaration//GEN-END:variables

    public static String CalcularIDJuego(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("JDIF-%04d", Incremental);

            if (Verificar_JDif(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public static int Verificar_JDif(ObjectContainer Base, String Codigo) {
        Juego_Diferencias miJDif = new Juego_Diferencias();
        miJDif.setCod_Juego(Codigo);
        ObjectSet result = Base.get(miJDif);

        return result.size();

    }

    public byte[] AbrirArchivo(File archivo) {
        try (FileInputStream entrada = new FileInputStream(archivo)) {
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

    private Image convertirBytesAImagen(byte[] bytes) {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
            return ImageIO.read(bis);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void MostrarDatos(ObjectContainer Base) {

        Juego_Diferencias mostrarJuegoLab = new Juego_Diferencias();
        ObjectSet result = Base.get(mostrarJuegoLab);

        DefaultTableModel modelo = (DefaultTableModel) jTableJDif.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Juego_Diferencias miJuegoDif = (Juego_Diferencias) result.next();
            modelo.addRow(new Object[]{
                miJuegoDif.getCod_Juego(),
                miJuegoDif.getDescripcion_Juego(),
                miJuegoDif.getRespuesta_Correcta(),
                miJuegoDif.getRutaImagen()

            });
        }

    }

    private void ConsultarRegistro(ObjectContainer base, String CodLab) {

        // Creando un objeto de ejemplo para la consulta
        Juego_Diferencias juegoDif = new Juego_Diferencias(CodLab, null, null, 0, null, null);

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(juegoDif);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Juego_Diferencias registroConsultado = (Juego_Diferencias) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            MostrarDatos(Base);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }

    public void ModificarJuego(ObjectContainer Base, String CodigoJuego, String Nueva_Descripcion, int NuevaOpCorrecta, byte[] NuevaImagen, String NuevaRuta) {
        try {
            if (Nueva_Descripcion == null || NuevaRuta == null) {
                JOptionPane.showMessageDialog(this, "Error: La descripción y la ruta de la imagen no pueden ser nulas.");
                return;
            }

            Juego_Diferencias JDif = new Juego_Diferencias();
            JDif.setCod_Juego(CodigoJuego);

            ObjectSet result = Base.get(JDif);

            if (result.hasNext()) {
                Juego_Diferencias nuevoJuego = (Juego_Diferencias) result.next();

                nuevoJuego.setDescripcion_Juego(Nueva_Descripcion);
                nuevoJuego.setRespuesta_Correcta(NuevaOpCorrecta);
                nuevoJuego.setImagen_Dif(NuevaImagen);
                nuevoJuego.setRutaImagen(NuevaRuta);
                Base.store(nuevoJuego);

                JOptionPane.showMessageDialog(this, "Se modificó los datos del juego correctamente.");

                MostrarDatos(Base);

            } else {
                JOptionPane.showMessageDialog(this, "Error: No se encontró el juego para modificar.");
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException | Db4oIOException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public void ValidaDescripcion(String Descripcion) throws Exception {
        // La expresión regular permite letras mayúsculas y minúsculas.
        if (!Descripcion.matches("^[A-Za-z]+\\s[0-9\\s]+$")) {
            throw new Exception("Ingrese una descripcion válida.");
        }
    }

    private void EliminarRegistro(ObjectContainer base, String Cod_Dif) {

        // Crear un objeto Juego_Diferencias con el código de diferencia proporcionado
    Juego_Diferencias elimJue = new Juego_Diferencias(Cod_Dif, null, null, 0, null, null);

    // Consultar la base de datos para obtener el objeto correspondiente al código de diferencia
    ObjectSet<Juego_Diferencias> result = base.queryByExample(elimJue);

    // Verificar si se encontró un resultado
    if (result.hasNext()) {
        // Obtener el primer objeto encontrado
        Juego_Diferencias elimJ = result.next();
        String codj = elimJ.getCod_Juego();

        // Crear un objeto Puntuaciones relacionado con el código de juego
        Puntuaciones punts = new Puntuaciones();
        punts.setFK_Cod_Minijuego(codj);

        // Consultar la base de datos para verificar si hay datos relacionados
        ObjectSet<Puntuaciones> rest = base.queryByExample(punts);

        // Verificar si no hay datos relacionados
        if (rest.isEmpty()) {
            // Mensaje de depuración
            System.out.println("Eliminando el registro de la base de datos...");

            // Eliminar el objeto encontrado de la base de datos
            base.delete(elimJ);
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
            // Actualizar la tabla después de la eliminación
            MostrarDatos(base);
        } else {
            // Mostrar un mensaje de error si hay datos relacionados
            JOptionPane.showMessageDialog(this, "No se puede eliminar porque contiene datos relacionados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Mostrar un mensaje si no se encuentra el registro en la base de datos
        JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
    }
    }

    private void actualizarImagenEnJLabel(String rutaImagen) {
        try {
            // Obtener la imagen desde la base de datos como un conjunto de bytes
            byte[] imagenBytes = obtenerBytesDesdeRuta(rutaImagen);

            // Convierte el array de bytes a un objeto Image
            Image imagenOriginal = convertirBytesAImagen(imagenBytes);

            if (imagenOriginal != null) {
                // Redimensiona la imagen según sea necesario
                Image imagenRedimensionada = imagenOriginal.getScaledInstance(550, 330, Image.SCALE_SMOOTH);

                // Crea un ImageIcon a partir de la imagen redimensionada
                ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

                lblImagenDiferencias.setIcon(iconoRedimensionado);
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se pudo convertir la imagen a formato válido.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + e.getMessage());
        }
    }

    private byte[] obtenerBytesDesdeRuta(String rutaImagen) throws IOException {
        // Obtener los bytes desde la ruta de la imagen
        Path path = Paths.get(rutaImagen);
        return Files.readAllBytes(path);
    }

    private String extraerRutaDesdeDescripcion(String descripcionImagen) {
        // Separar la descripción usando el carácter '|'
        String[] partes = descripcionImagen.split("\\|");

        // Verificar si hay al menos dos partes (Descripción y Ruta de la imagen)
        if (partes.length > 1) {
            // La ruta de la imagen está en la segunda parte
            return partes[1];
        } else {
            // Devuelve null si no se pudo extraer la ruta de la imagen
            return null;
        }
    }

    private String modificarImagen(String rutaImagen) {
        try {
            // Cargar la imagen desde la ruta
            BufferedImage originalImage = ImageIO.read(new File(rutaImagen));

            // Modificar la imagen según sea necesario (en este caso, invertir los colores)
            BufferedImage modifiedImage = modificarColores(originalImage);

            // Generar un nombre único para la imagen modificada
            String nombreModificado = "modified_" + System.currentTimeMillis() + ".jpg";

            // Obtener la ruta del directorio donde se guarda la imagen modificada
            String directorioImagenesModificadas = "ruta/del/directorio/de/imagenes/modificadas/";

            // Guardar la imagen modificada en un nuevo archivo en el directorio especificado
            File outputFile = new File(directorioImagenesModificadas + nombreModificado);
            ImageIO.write(modifiedImage, "jpg", outputFile);

            // Devolver la ruta completa de la imagen modificada
            return outputFile.getAbsolutePath();
        } catch (IOException e) {
            // Manejar cualquier excepción relacionada con la carga o modificación de la imagen
            JOptionPane.showMessageDialog(this, "Error al cargar o modificar la imagen: " + e.getMessage());
            return null;
        }
    }

    private BufferedImage modificarColores(BufferedImage originalImage) {
        // Implementa aquí la lógica para modificar los colores de la imagen según tus necesidades
        // En este ejemplo, se invierten los colores

        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        BufferedImage modifiedImage = new BufferedImage(width, height, originalImage.getType());

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color originalColor = new Color(originalImage.getRGB(x, y));
                Color modifiedColor = new Color(255 - originalColor.getRed(),
                        255 - originalColor.getGreen(),
                        255 - originalColor.getBlue());
                modifiedImage.setRGB(x, y, modifiedColor.getRGB());
            }
        }
        return modifiedImage;
    }
}
