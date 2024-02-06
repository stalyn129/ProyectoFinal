/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Cuento;
import Login.InicioPsicologo;
import Login.PagPrincipalAdmin;
import Login.PagPrincipalPsicologo;
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
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class PagCrudCuentosPsicologo extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    byte[] imagenInicial;
    byte[] imagenFinal;
    ObjectContainer Base;
    String rutaImagenInicial;
    String rutaImagenFinal;

    public PagCrudCuentosPsicologo() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCuentos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
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
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Titulo", "Introducción", "Desarrollo", "Conclusión"
            }
        ));
        jScrollPane1.setViewportView(jTableCuentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 720, 110));

        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Actualiza los datos existentes en la tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Modifica los datos existentes en la tabla");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina los datos existentes en la tabla");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("Consulta los datos existentes en la tabla");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setToolTipText("");
        jScrollPane4.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(703, 544));
        jPanel4.setPreferredSize(new java.awt.Dimension(703, 544));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, 10));

        lblDesarrollo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDesarrollo.setText("Desarrollo:");
        jPanel4.add(lblDesarrollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblIntroduccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIntroduccion.setText("Introducción:");
        jPanel4.add(lblIntroduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 200, 10));

        Txt_Titulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt_Titulo.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Titulo.setText("Ejem: Las aventuras de...");
        Txt_Titulo.setToolTipText("Escribe el titulo");
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
        jPanel4.add(Txt_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 20));

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTitulo.setText("Titulo:");
        jPanel4.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("CRUD CUENTOS");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 30));

        txtDesarrollo.setColumns(20);
        txtDesarrollo.setLineWrap(true);
        txtDesarrollo.setRows(5);
        txtDesarrollo.setToolTipText("Escribe el contenido de las historias");
        txtDesarrollo.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtDesarrollo);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 290, 70));

        txtAreaIntroduccion.setColumns(20);
        txtAreaIntroduccion.setLineWrap(true);
        txtAreaIntroduccion.setRows(5);
        txtAreaIntroduccion.setToolTipText("Escribe el contenido de las historias");
        txtAreaIntroduccion.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtAreaIntroduccion);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, 70));

        txtConclusion.setColumns(20);
        txtConclusion.setLineWrap(true);
        txtConclusion.setRows(5);
        txtConclusion.setToolTipText("Escribe el contenido de las historias");
        txtConclusion.setWrapStyleWord(true);
        jScrollPane7.setViewportView(txtConclusion);

        jPanel4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 290, 70));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 270, 10));

        lblConclusion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblConclusion.setText("Conclusion:");
        jPanel4.add(lblConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 20));

        lblImagenFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenFinal.setToolTipText("Selecciona la imagen del cuento");
        lblImagenFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagenFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(lblImagenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 270, 130));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 120, 10));

        btnImagenFinal.setText("Agregar Imagen Final");
        btnImagenFinal.setToolTipText("Selecciona la imagen correspondiente");
        btnImagenFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenFinalActionPerformed(evt);
            }
        });
        jPanel4.add(btnImagenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 270, -1));

        btnInsertar.setText("Agregar Cuento");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel4.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 120, 40));

        btnImagenInicial.setText("Agregar Imagen Comienzo");
        btnImagenInicial.setToolTipText("Selecciona la imagen correspondiente");
        btnImagenInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenInicialActionPerformed(evt);
            }
        });
        jPanel4.add(btnImagenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 270, -1));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 270, 10));

        lblImagenInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenInicial.setToolTipText("Selecciona la imagen del cuento");
        lblImagenInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImagenInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(lblImagenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 270, 160));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 240, 10));
        jPanel4.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 290, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jScrollPane4.setViewportView(jPanel4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 280));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 720, 280));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, -1));

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

    private void Txt_TituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TituloMousePressed

        if (Txt_Titulo.getText().equals("Ejem: Las aventuras de...")) {
            Txt_Titulo.setText("");
            Txt_Titulo.setForeground(Color.black);
        }
    }//GEN-LAST:event_Txt_TituloMousePressed

    private void Txt_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TituloActionPerformed

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

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // Validar campos antes de procesar la acción
        if (Txt_Titulo.getText().isEmpty()
                || txtAreaIntroduccion.getText().isEmpty()
                || txtDesarrollo.getText().isEmpty()
                || txtConclusion.getText().isEmpty() || lblImagenInicial == null || lblImagenFinal == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;  // Detener el proceso si los campos no están completos
        }

        try {
            Cuento elcue = new Cuento();
            elcue.setFK_CodPsicologo(RegistrarsePariente.Calcular_cod_Representante(Base));

            String codigoIncremental = calcularIDCuen(Base);

            elcue.setCod_Cuento(codigoIncremental);
            elcue.setTitulo_Cuento(Txt_Titulo.getText());
            elcue.setIntroduccion_Cuento(txtAreaIntroduccion.getText());
            elcue.setNudo_Cuento(txtDesarrollo.getText());
            elcue.setDesenlace_Cuento(txtConclusion.getText());
            elcue.setImagen_Inicial(imagenInicial);
            elcue.setImagen_Final(imagenFinal);

            // Almacena la ruta del archivo seleccionado en la variable rutaImagenFinal
            elcue.setRutaImagen(rutaImagenInicial);
            elcue.setRutaImagen2(rutaImagenFinal);

            Base.store(elcue);
            javax.swing.JOptionPane.showMessageDialog(this, "SE GUARDÓ EN LA BASE");

            // Limpiar campos después de ingresar los datos
            limpiarCampos();

            MostrarDatos(Base);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void limpiarCampos() {
        Txt_Titulo.setText("");
        txtAreaIntroduccion.setText("");
        txtDesarrollo.setText("");
        txtConclusion.setText("");

        lblImagenFinal.setIcon(null);
        lblImagenFinal.setIcon(null);
    }

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
        try {
            // Obtener el código del cuento que se desea modificar
            String codigoCuento = JOptionPane.showInputDialog(this, "Ingrese el código del cuento a modificar:");

            if (codigoCuento != null && !codigoCuento.isEmpty()) {
                // Buscar el cuento con el código proporcionado
                int indiceCuento = buscarCuentoPorCodigo(codigoCuento);

                if (indiceCuento != -1) {
                    // Se encontró el cuento, obtener datos actuales
                    DefaultTableModel modelo = (DefaultTableModel) jTableCuentos.getModel();
                    String nuevoTitulo = validarCampo("Ingrese el nuevo título:", (String) modelo.getValueAt(indiceCuento, 1));
                    String nuevaIntroduccion = validarCampo("Ingrese la nueva introducción:", (String) modelo.getValueAt(indiceCuento, 2));
                    String nuevoDesarrollo = validarCampo("Ingrese el nuevo desarrollo:", (String) modelo.getValueAt(indiceCuento, 3));
                    String nuevaConclusion = validarCampo("Ingrese la nueva conclusión:", (String) modelo.getValueAt(indiceCuento, 4));

                    if (nuevoTitulo != null && nuevaIntroduccion != null && nuevoDesarrollo != null && nuevaConclusion != null) {
                        byte[] nuevaImagen1 = obtenerNuevaImagen();
                        byte[] nuevaImagen2 = obtenerNuevaImagen();

                        // Modificar el cuento con los nuevos valores
                        Modificar_Cuento(Base, codigoCuento, nuevoTitulo, nuevaIntroduccion, nuevoDesarrollo, nuevaConclusion, nuevaImagen1, nuevaImagen2);
                        MostrarDatos(Base);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Todos los campos deben ser ingresados.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error: No se encontró el cuento con el código proporcionado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private int buscarCuentoPorCodigo(String codigoCuento) {
        DefaultTableModel modelo = (DefaultTableModel) jTableCuentos.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String codigoActual = (String) modelo.getValueAt(i, 0);
            if (codigoActual.equals(codigoCuento)) {
                return i; // Se encontró el cuento, devolver el índice de la fila
            }
        }
        return -1;
    }

    private String validarCampo(String mensaje, String valorActual) {
        String nuevoValor = JOptionPane.showInputDialog(this, mensaje, valorActual);
        return (nuevoValor != null && !nuevoValor.isEmpty()) ? nuevoValor : null;
    }
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Mostrar un cuadro de diálogo para que el usuario elija el método de búsqueda
        String[] opciones = {"Código", "Título"};
        int seleccion = JOptionPane.showOptionDialog(this, "Seleccione el método de búsqueda:", "Método de Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion != -1) {
            String consulta = "";

            if (seleccion == 0) {
                // Búsqueda por código
                consulta = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");
            } else {
                // Búsqueda por título
                consulta = JOptionPane.showInputDialog(this, "Ingrese el título a consultar");
            }

            if (consulta != null && !consulta.isEmpty()) {
                ConsultarRegistro(Base, consulta, seleccion);
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un valor válido para la consulta.");
            }
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

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
        this.setState(PagCrudCuentosPsicologo.ICONIFIED);
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
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagCrudCuentosPsicologo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagCrudCuentosPsicologo().setVisible(true);
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
                miCuento.getCod_Cuento(), // Agrega el código incremental a la tabla
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
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JTextField Txt_Titulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImagenFinal;
    private javax.swing.JButton btnImagenInicial;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableCuentos;
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

    public void Modificar_Cuento(ObjectContainer base, String Codigo, String Titulo, String Introduccion, String Desarrollo, String Conclusion, byte[] NuevaImagen1, byte[] NuevaImagen2) {
        try {
            Cuento cuento = new Cuento();
            cuento.setCod_Cuento(Codigo);

            ObjectSet result = base.queryByExample(cuento);

            if (result.hasNext()) {
                Cuento nuevoCuento = (Cuento) result.next();

                nuevoCuento.setTitulo_Cuento(Titulo);
                nuevoCuento.setIntroduccion_Cuento(Introduccion);
                nuevoCuento.setNudo_Cuento(Desarrollo);
                nuevoCuento.setDesenlace_Cuento(Conclusion);

                if (NuevaImagen1 != null) {
                    nuevoCuento.setImagen_Inicial(NuevaImagen1);
                }

                if (NuevaImagen2 != null) {
                    nuevoCuento.setImagen_Final(NuevaImagen2);
                }

                base.store(nuevoCuento);
                JOptionPane.showMessageDialog(this, "Se modificó el cuento correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se encontró el cuento para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar el cuento: " + e.getMessage());
        }
    }

    private void ConsultarRegistro(ObjectContainer base, String consulta, int tipoConsulta) {
        // Creando un objeto de ejemplo para la consulta
        Cuento ejemploConsulta;

        if (tipoConsulta == 0) {
            // Búsqueda por código
            ejemploConsulta = new Cuento(consulta, null, null, null, null, null,null, null, null, null, null, null);
        } else {
            // Búsqueda por título
            ejemploConsulta = new Cuento(null, null, consulta, null, null, null,null, null, null, null, null, null);
        }

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(ejemploConsulta);

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

        Cuento cuen = new Cuento(Cod_Cuento, null, null, null, null, null, null, null, null, null, null, null);

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

    private byte[] obtenerNuevaImagen() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione la nueva imagen");

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                return Files.readAllBytes(selectedFile.toPath());
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al leer la nueva imagen.");
            }
        }

        return null;
    }

    private String obtenerNuevaRuta() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione la nueva ruta de la imagen");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        }

        return null; // Retorna null si no se selecciona ninguna ruta o hay un error.
    }

    public static String calcularIDCuen(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("CUE-%04d", incremental);

            if (VerificarCuento(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }
}
