/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;

/**
 *
 * @author mauca
 */
public class PagCrudConsejosPsicologo extends javax.swing.JFrame {

    /**
     * Creates new form PagCrudConsejosPsicologo
     */
    public PagCrudConsejosPsicologo() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_TituloConsejPsicologo2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        imagen_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txA_text_info = new javax.swing.JTextArea();
        btn_Ingresar_imagen = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        txA_text_info1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Txt_TituloConsejPsicologo1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        imagen_1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btn_Ingresar_imagen1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_ingresar = new javax.swing.JButton();
        btn_ingresar1 = new javax.swing.JButton();
        btn_ingresar2 = new javax.swing.JButton();
        btn_ingresar3 = new javax.swing.JButton();
        btn_ingresar4 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicologo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(743, 1088));
        jPanel4.setPreferredSize(new java.awt.Dimension(743, 1088));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese la imagen para el consejo 2:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 20));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Creación de los Consejos Para El Niño");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        Txt_TituloConsejPsicologo2.setForeground(new java.awt.Color(102, 102, 102));
        Txt_TituloConsejPsicologo2.setText("Ingrese el Titulo");
        Txt_TituloConsejPsicologo2.setBorder(null);
        Txt_TituloConsejPsicologo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TituloConsejPsicologo2MousePressed(evt);
            }
        });
        jPanel4.add(Txt_TituloConsejPsicologo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 310, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 310, 10));

        imagen_.setForeground(new java.awt.Color(204, 204, 204));
        imagen_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_.setText(" Ingresar Imagen");
        imagen_.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(imagen_, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 260, 190));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Titulo del Consejo Número 2:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txA_text_info.setColumns(20);
        txA_text_info.setRows(5);
        txA_text_info.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(txA_text_info);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 310, 170));

        btn_Ingresar_imagen.setText("Ingresar Imagen");
        btn_Ingresar_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar_imagenActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Ingresar_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 160, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 260, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el texto del consejo Número 2:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, 260, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 700, 20));

        txA_text_info1.setColumns(20);
        txA_text_info1.setRows(5);
        txA_text_info1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(txA_text_info1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 310, 170));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese el texto del consejo Número 1:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 310, 10));

        Txt_TituloConsejPsicologo1.setForeground(new java.awt.Color(102, 102, 102));
        Txt_TituloConsejPsicologo1.setText("Ingrese el Titulo");
        Txt_TituloConsejPsicologo1.setBorder(null);
        Txt_TituloConsejPsicologo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_TituloConsejPsicologo1MousePressed(evt);
            }
        });
        Txt_TituloConsejPsicologo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TituloConsejPsicologo1ActionPerformed(evt);
            }
        });
        jPanel4.add(Txt_TituloConsejPsicologo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Titulo del Consejo Número 1:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese la imagen para el consejo 1:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, 20));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 260, 10));

        imagen_1.setForeground(new java.awt.Color(204, 204, 204));
        imagen_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_1.setText(" Ingresar Imagen");
        imagen_1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(imagen_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 260, 190));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 260, 10));

        btn_Ingresar_imagen1.setText("Ingresar Imagen");
        btn_Ingresar_imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingresar_imagen1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Ingresar_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 160, -1));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 700, 20));
        jPanel4.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1050, 700, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Titulo1", "Titulo 2", "Texto 1", "Texto 2", "Imagen 1", "Imagen 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable1);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 700, 240));

        btn_ingresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar.setText("Eliminar");
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
        jPanel4.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 1010, 100, -1));

        btn_ingresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar1.setText("Ingresar");
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
        jPanel4.add(btn_ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 100, -1));

        btn_ingresar2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar2.setText("Actualizar");
        btn_ingresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar2MouseClicked(evt);
            }
        });
        btn_ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ingresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 1010, 100, -1));

        btn_ingresar3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar3.setText("Consultar");
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
        jPanel4.add(btn_ingresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1010, 100, -1));

        btn_ingresar4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ingresar4.setText("Modificar");
        btn_ingresar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ingresar4MouseClicked(evt);
            }
        });
        btn_ingresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ingresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1010, 100, -1));

        jScrollPane1.setViewportView(jPanel4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 430));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 760, 430));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        JMenu3puntitosPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        JMnItmCerrarPsicologo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarPsicologo.setText("Cerrar Sesión");
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

        JMnPgPrinPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinPsicologo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinPsicologoMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMnPgPrinPsicologo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        InicioPsicologo loginPsicologo = new InicioPsicologo();
            loginPsicologo.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void JMnPgPrinPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicologoMouseClicked
        PagPrincipalPsicologo principalpsicologo = new PagPrincipalPsicologo();
           principalpsicologo.setVisible(true); 
              this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinPsicologoMouseClicked

    private void btn_ingresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar3ActionPerformed

    private void btn_ingresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar3MouseClicked

    private void btn_ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar2ActionPerformed

    private void btn_ingresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar2MouseClicked

    private void btn_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar1ActionPerformed

    private void btn_ingresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar1MouseClicked

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseClicked
//
//        try {
//            Informacion info = new Informacion();
//            cod = Crear_codigo_info(Base);
//            info.setCod_Info(cod);
//
//            info.setTitulo_Info(txt_Titulo.getText());
//            info.setTexto_Info(txA_text_info.getText());
//            info.setImagen(imagen);
//            Base.store(info);
//            if (RegistrarsePsicologo.cedula_pasada_interfaz==null) {
//                javax.swing.JOptionPane.showMessageDialog(this, "La cedula estraida del psicologo esta vacia");
//            }
//
//            Ingresa_Info_Publicacion(Base, Crear_codigo_public(Base), cod, RegistrarsePsicologo.cedula_pasada_interfaz, new Date());
//            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo la Informacion");
//
//            MostrarDatos(Base);
//            Vaciar_datos();
//        } catch (Exception e) {
//
//        }finally{
//            Base.close();
//
//        }
    }//GEN-LAST:event_btn_ingresarMouseClicked

    private void btn_Ingresar_imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar_imagen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Ingresar_imagen1ActionPerformed

    private void btn_Ingresar_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingresar_imagenActionPerformed
        //        if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            //            File archivo = seleccionar.getSelectedFile();
            //            if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("jpng") || archivo.getName().endsWith("jpng") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                //                imagen = AbrirArchivo(archivo); // Store the selected image in the imagen variable
                //                imagen_.setIcon(new ImageIcon(imagen)); // Update the displayed image on the interface
                //            } else {
                //                JOptionPane.showMessageDialog(null, "Archivo no compatible");
                //            }
            //        }
    }//GEN-LAST:event_btn_Ingresar_imagenActionPerformed

    private void btn_ingresar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresar4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar4MouseClicked

    private void btn_ingresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresar4ActionPerformed

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        InicioPsicologo loginPsicologo = new InicioPsicologo();
            loginPsicologo.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void Txt_TituloConsejPsicologo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TituloConsejPsicologo1MousePressed
        if (Txt_TituloConsejPsicologo1.getText().equals("Ingrese el Titulo")) {
            Txt_TituloConsejPsicologo1.setText("");
            Txt_TituloConsejPsicologo1.setForeground(Color.black);
        }
        if (Txt_TituloConsejPsicologo2.getText().isEmpty()) {
            Txt_TituloConsejPsicologo2.setText("Ingrese el Titulo");
            Txt_TituloConsejPsicologo2.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_TituloConsejPsicologo1MousePressed

    private void Txt_TituloConsejPsicologo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_TituloConsejPsicologo2MousePressed
        if (Txt_TituloConsejPsicologo2.getText().equals("Ingrese el Titulo")) {
            Txt_TituloConsejPsicologo2.setText("");
            Txt_TituloConsejPsicologo2.setForeground(Color.black);
        }
        if (Txt_TituloConsejPsicologo1.getText().isEmpty()) {
            Txt_TituloConsejPsicologo1.setText("Ingrese el Titulo");
            Txt_TituloConsejPsicologo1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_Txt_TituloConsejPsicologo2MousePressed

    private void Txt_TituloConsejPsicologo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TituloConsejPsicologo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TituloConsejPsicologo1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicologo;
    private javax.swing.JTextField Txt_TituloConsejPsicologo1;
    private javax.swing.JTextField Txt_TituloConsejPsicologo2;
    private javax.swing.JButton btn_Ingresar_imagen;
    private javax.swing.JButton btn_Ingresar_imagen1;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JButton btn_ingresar2;
    private javax.swing.JButton btn_ingresar3;
    private javax.swing.JButton btn_ingresar4;
    private javax.swing.JLabel imagen_;
    private javax.swing.JLabel imagen_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txA_text_info;
    private javax.swing.JTextArea txA_text_info1;
    // End of variables declaration//GEN-END:variables
}
