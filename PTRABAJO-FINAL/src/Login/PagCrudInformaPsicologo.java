/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.*;
import Clases.*;
import Login.PagPrincipalPsicologo;
import Login.RegistrarsePsicologo;
import Login.RegistrarsePsicologo;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class PagCrudInformaPsicologo extends javax.swing.JFrame {

    public static String cedula_pasada_interfaz;
    JFileChooser seleccionar = new JFileChooser();
    byte[] imagen;
    ObjectContainer Base;
    String cod;
    UserDataSingleton usarData;

    /**
     * Creates new form Informacion
     */
    public PagCrudInformaPsicologo() {
        initComponents();
        usarData = UserDataSingleton.getInstance();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        MostrarDatos(Base);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        LblTitulo3InfNiño = new javax.swing.JLabel();
        LblImagen4InfoNiño = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txA_text_info1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_mostrar = new javax.swing.JTable();
        btn_ingresar = new javax.swing.JButton();
        imagen_1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_Ingresar_imagen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_Titulo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btn_eliminar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_modifi = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(711, 598));
        jPanel4.setPreferredSize(new java.awt.Dimension(711, 598));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTitulo3InfNiño.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel4.add(LblTitulo3InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 240, 20));
        jPanel4.add(LblImagen4InfoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1050, 250, 200));

        txA_text_info1.setColumns(20);
        txA_text_info1.setRows(5);
        txA_text_info1.setToolTipText("Ingresa el contenido");
        txA_text_info1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txA_text_info1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 220));

        tabla_mostrar.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Text"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_mostrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_mostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_mostrar);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 380, 130));

        btn_ingresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setToolTipText("Ingresa Datos nuevos a la tabla");
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseClicked(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 280, 20));

        imagen_1.setForeground(new java.awt.Color(204, 204, 204));
        imagen_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_1.setText(" Ingresar Imagen");
        imagen_1.setToolTipText("Selecciona la imagen");
        imagen_1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(imagen_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 220, 230));

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 30, 300));

        btn_Ingresar_imagen.setText("Ingresar Imagen");
        btn_Ingresar_imagen.setToolTipText("Selecciona la imagen ");
        btn_Ingresar_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar_imagenActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Ingresar_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 220, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Ingresar su informacion:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 130, 200, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, 10));

        txt_Titulo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_Titulo1.setForeground(new java.awt.Color(102, 102, 102));
        txt_Titulo1.setText("Ingrese el titulo de la información");
        txt_Titulo1.setToolTipText("Ingresa el titulo");
        txt_Titulo1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_Titulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_Titulo1MousePressed(evt);
            }
        });
        jPanel4.add(txt_Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 270, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Ingresar el titulo de la información 1:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 70, 260, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 0, 24)); // NOI18N
        jLabel2.setText("Información");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 37));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 240, 10));

        btn_eliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setToolTipText("Elimina los datos existentes en la tabla");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 220, 30));

        btn_consultar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_consultar.setText("Consultar");
        btn_consultar.setToolTipText("Consulta los datos existentes en la tabla");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 220, 30));

        btn_modifi.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_modifi.setText("Modificar");
        btn_modifi.setToolTipText("Modifica los datos existentes en la tabla");
        btn_modifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifiActionPerformed(evt);
            }
        });
        jPanel4.add(btn_modifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 220, 30));

        btn_actualizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setToolTipText("Actualiza los datos existentes en la tabla");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 220, 30));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 230, 10));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jScrollPane3.setViewportView(jPanel4);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 730, 420));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 500));

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

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed


    }//GEN-LAST:event_btn_ingresarActionPerformed

    public void Ingresa_Info_Publicacion(ObjectContainer Base, String codigoPublic, String codd, String codPsico, Date fecha) {
        try {
            Publicacion_Info publi = new Publicacion_Info();
            publi.setCod_Publicacion(codigoPublic);
            publi.setFK_Cod_Informacion(codd);
            publi.setFK_Cod_Psicologo(codPsico);
            publi.setFecha_Publicacion(fecha);

            Base.store(publi);
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en la publicacion");
        }

    }

    public void MostrarDatos(ObjectContainer Base) {

        Informacion nacio = new Informacion();
        ObjectSet result = Base.get(nacio);

        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrar.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Informacion minaci = (Informacion) result.next();
            modelo.addRow(new Object[]{
                minaci.getCod_Info(),
                minaci.getTitulo_Info(),
                minaci.getTexto_Info(),});
        }

    }

    private void btn_Ingresar_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar_imagenActionPerformed
        if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionar.getSelectedFile();
            try {
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpeg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    imagen = AbrirArchivo(archivo); // Almacena la imagen seleccionada en la variable imagen
                    imagen_1.setIcon(new ImageIcon(imagen));
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } catch (HeadlessException e) {
                e.printStackTrace(); // Manejo básico de errores, imprime la traza de la excepción
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
            }
        }
    }//GEN-LAST:event_btn_Ingresar_imagenActionPerformed

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked

        try {
            Informacion info = new Informacion();
            cod = Crear_codigo_info(Base);
            info.setCod_Info(cod);

            info.setTitulo_Info(txt_Titulo1.getText());
            info.setTexto_Info(txA_text_info1.getText());
            info.setImagen(imagen);
            Base.store(info);
            if (usarData.getCod_Psicologo() == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "La cedula estraida del psicologo esta vacia");
            }

            Ingresa_Info_Publicacion(Base, Crear_codigo_public(Base), cod, usarData.getCod_Psicologo(), new Date());
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo la Informacion");

            MostrarDatos(Base);
            Vaciar_datos();
        } catch (DatabaseClosedException | DatabaseReadOnlyException | HeadlessException e) {

        }


    }//GEN-LAST:event_btn_ingresarMouseClicked

    private void txt_Titulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_Titulo1MousePressed
        if (txt_Titulo1.getText().equals("Ingrese el titulo de la información")) {
            txt_Titulo1.setText("");
            txt_Titulo1.setForeground(Color.black);
        }

    }//GEN-LAST:event_txt_Titulo1MousePressed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        MostrarDatos(Base);
        Vaciar_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void tabla_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_mostrarMouseClicked

    }//GEN-LAST:event_tabla_mostrarMouseClicked

    private void btn_modifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifiActionPerformed

        Modificar(Base);
        MostrarDatos(Base);

    }//GEN-LAST:event_btn_modifiActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if (cod_info_mod.equals("")) {

        } else {
            int resultado = JOptionPane.showConfirmDialog(
                    null,
                    "Seguro que desea eliminar a la informacion\ncon el codigo: " + cod_info_mod,
                    "Confirmación",
                    JOptionPane.OK_CANCEL_OPTION);

            // Verificar la opción seleccionada por el usuario
            if (resultado == JOptionPane.OK_OPTION) {
                // El usuario hizo clic en "Aceptar"
                Eliminar(Base);
                Vaciar_datos();
                MostrarDatos(Base);
            } else {
                // El usuario hizo clic en "Cancelar" o cerró la ventana
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
            }
        }


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        String userInput = JOptionPane.showInputDialog("Ingresa el codigo de la informacion");
        consulta(Base, userInput);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void JMnPgPrinPsicoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicoloMouseClicked
        Base.close();
        PagPrincipalPsicologo principal = new PagPrincipalPsicologo();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinPsicoloMouseClicked

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        Base.close();
        InicioPsicologo loginPsicologo = new InicioPsicologo();
        loginPsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void tabla_mostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_mostrarMousePressed
        imagen_1.setIcon(null);
        txt_Titulo1.setText("");
        txA_text_info1.setText("");

        int seleccion = tabla_mostrar.getSelectedRow();
        String codTabla = String.valueOf(tabla_mostrar.getValueAt(seleccion, 0));
        Mostrar_datos_rec(Base, codTabla);
    }//GEN-LAST:event_tabla_mostrarMousePressed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(PagCrudInformaPsicologo.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    public void Eliminar(ObjectContainer Base) {
        Informacion inf = new Informacion();
        inf.setCod_Info(cod_info_mod);

        ObjectSet resul = Base.get(inf);
        while (resul.hasNext()) {
            Informacion nextElement = (Informacion) resul.next();
            String codInf = nextElement.getCod_Info();

            publicacion(Base, codInf);

            Base.delete(nextElement);
            JOptionPane.showMessageDialog(this, "Se elimino la informacion");

        }

    }

    public void publicacion(ObjectContainer Base, String cod) {
        Publicacion_Info publ = new Publicacion_Info();
        publ.setFK_Cod_Informacion(cod);

        ObjectSet result = Base.get(publ);

        while (result.hasNext()) {
            Publicacion_Info pub = (Publicacion_Info) result.next();
            Base.delete(pub);
        }

    }

    public void consulta(ObjectContainer Base, String cod) {
        Informacion inf = new Informacion();
        inf.setCod_Info(cod);
        ObjectSet result = Base.get(inf);
        while (result.hasNext()) {
            Informacion next = (Informacion) result.next();
            cod_info_mod = next.getCod_Info();
            txt_Titulo1.setText(next.getTitulo_Info());
            txA_text_info1.setText(next.getTexto_Info());

            if (imagen != null) {
                ImageIcon icon = new ImageIcon(imagen);
                imagen_1.setIcon(icon);
            } else {
                // Manejar el caso en el que no hay imagen.
                imagen_1.setIcon(null); // Puedes establecer el icono a null o configurar un icono predeterminado.
            }
        }
        cod_info_mod = "";

    }

    public void Modificar(ObjectContainer Base) {
        if (!cod_info_mod.isEmpty()) {

            Informacion inf = new Informacion();
            inf.setCod_Info(cod_info_mod);
            ObjectSet result = Base.get(inf);

            Informacion ModInfo = (Informacion) result.next();

            ModInfo.setTitulo_Info(txt_Titulo1.getText());
            ModInfo.setTexto_Info(txA_text_info1.getText());

            ModInfo.setImagen(imagen);
            Base.store(ModInfo);
            Base.commit();
            Vaciar_datos();
            JOptionPane.showMessageDialog(this, "Se Modificó exitosamente");
            cod_info_mod = "";
        } else {
            JOptionPane.showMessageDialog(this, "Primero seleccionar la información");
        }
    }
    String cod_info_mod = "";

//    public void Mostrar_datos_rec(ObjectContainer Base, String CodInfo) {
//
//        Informacion info = new Informacion();
//        info.setCod_Info(CodInfo);
//
//        ObjectSet result = Base.get(info);
//
//        if (result.hasNext()) {
//            Informacion next = (Informacion) result.next();
//            cod_info_mod = next.getCod_Info();
//            txt_Titulo1.setText(next.getTitulo_Info());
//            txA_text_info1.setText(next.getTexto_Info());
//
//            imagen=next.getImagen();
//           
//               imagen_1.setIcon(new ImageIcon(imagen));  
//            
//           
//
//        } else {
//            
//            JOptionPane.showMessageDialog(null, "No se encontró información con el código especificado.");
//        }
//    }
    public void Mostrar_datos_rec(ObjectContainer Base, String CodInfo) {
        Informacion info = new Informacion();
        info.setCod_Info(CodInfo);

        ObjectSet result = Base.get(info);

        if (result.hasNext()) {
            Informacion next = (Informacion) result.next();
            cod_info_mod = next.getCod_Info();
            txt_Titulo1.setText(next.getTitulo_Info());
            txA_text_info1.setText(next.getTexto_Info());

            // Asegúrate de manejar casos en los que la imagen puede ser null
            imagen = next.getImagen();
            if (imagen != null && imagen.length > 0) {
                // Convierte el array de bytes a ImageIcon y establece el icono en tu JLabel
                ImageIcon imageIcon = new ImageIcon(imagen);
                imagen_1.setIcon(imageIcon);
            } else {
                // Si la imagen es null, puedes establecer un icono predeterminado o limpiar el JLabel
                imagen_1.setIcon(null);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró información con el código especificado.");
        }
    }

    public void Vaciar_datos() {
        txt_Titulo1.setText("");
        txA_text_info1.setText("");
        imagen_1.setIcon(null);

    }

    public byte[] AbrirArchivo(File archivo) {

        byte[] imagen = new byte[220 * 160];
        try {
            FileInputStream entrada = new FileInputStream(archivo);
            entrada.read(imagen);
        } catch (IOException e) {
        }
        return imagen;
    }

    public static String Crear_codigo_info(ObjectContainer Base) {

        boolean sall = true;
        int calcular = 0;
        String Codigo;
        do {
            calcular++;

            Codigo = String.format("I%04d", calcular);

            if (Verificar_infor(Base, Codigo) == 0) {
                sall = false;
            }

        } while (sall);

        return Codigo;
    }

    public static String Crear_codigo_public(ObjectContainer Base) {

        boolean sall = true;
        int calcular = 0;
        String Codigo;
        do {
            calcular++;

            Codigo = String.format("PI%04d", calcular);

            if (Verificar_infor_publi(Base, Codigo) == 0) {
                sall = false;
            }

        } while (sall);

        return Codigo;
    }

    public static int Verificar_infor_publi(ObjectContainer Base, String Codigo) {

        Publicacion_Info elInfo = new Publicacion_Info();
        elInfo.setCod_Publicacion(Codigo);
        ObjectSet repuest = Base.get(elInfo);

        return repuest.size();

    }

    public static int Verificar_infor(ObjectContainer Base, String Codigo) {

        Informacion elInfo = new Informacion();
        elInfo.setCod_Info(Codigo);
        ObjectSet repuest = Base.get(elInfo);

        return repuest.size();

    }

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
            java.util.logging.Logger.getLogger(PagCrudInformaPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagCrudInformaPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagCrudInformaPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagCrudInformaPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new PagCrudInformaPsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel LblImagen4InfoNiño;
    private javax.swing.JLabel LblTitulo3InfNiño;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btn_Ingresar_imagen;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_modifi;
    private javax.swing.JLabel imagen_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tabla_mostrar;
    private javax.swing.JTextArea txA_text_info1;
    private javax.swing.JTextField txt_Titulo1;
    // End of variables declaration//GEN-END:variables
}
