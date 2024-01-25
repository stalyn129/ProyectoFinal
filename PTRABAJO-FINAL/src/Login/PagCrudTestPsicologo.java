/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.*;
import com.db4o.*;
import com.db4o.ObjectContainer;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.query.Query;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alexa
 */
public final class PagCrudTestPsicologo extends javax.swing.JFrame {
String cod;
    String cod_Tipo_test = "TTR01";
    String codigotest;
    ObjectContainer Base;
UserDataSingleton usarData ;
    /**
     * Creates new form Crud_TEST
     */
    public PagCrudTestPsicologo() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        usarData = UserDataSingleton.getInstance();
        Bloquear_edicion_antes_test();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbx_destino = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pregunta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_respuesta_2 = new javax.swing.JTextField();
        txt_respuesta_1 = new javax.swing.JTextField();
        txt_respuesta_3 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_descrip = new javax.swing.JTextArea();
        lbl_enunciado_guardar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_preguntas = new javax.swing.JTable();
        btn_guardar_test = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");
        jScrollPane3.setDoubleBuffered(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(700, 670));
        jPanel5.setPreferredSize(new java.awt.Dimension(700, 670));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Destino");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        cbx_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niño", "Representante" }));
        cbx_destino.setToolTipText("Seleciona el destinatario");
        cbx_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_destinoActionPerformed(evt);
            }
        });
        jPanel4.add(cbx_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 100, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Respuesta 1: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Ingrese las preguntas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txt_pregunta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txt_pregunta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(txt_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Respuesta 2: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Respueta 3: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 20));

        jLabel14.setText("Codigo:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 20));

        txt_respuesta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_respuesta_2ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_respuesta_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        txt_respuesta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_respuesta_1ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_respuesta_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        txt_respuesta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_respuesta_3ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_respuesta_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 110, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 470, 150));

        btn_guardar1.setText("Guardar");
        btn_guardar1.setToolTipText("Guarda los datos registrados");
        btn_guardar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });
        jPanel5.add(btn_guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 400, 30));

        txtA_descrip.setColumns(20);
        txtA_descrip.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtA_descrip.setRows(5);
        jScrollPane1.setViewportView(txtA_descrip);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 290, 40));

        lbl_enunciado_guardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_enunciado_guardar.setForeground(new java.awt.Color(255, 0, 0));
        lbl_enunciado_guardar.setText("Guarda para poder Ingresa las preguntas");
        jPanel5.add(lbl_enunciado_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 230, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese una descripcion:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el titulo del test:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 160, 20));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(153, 153, 153));
        txt_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tituloActionPerformed(evt);
            }
        });
        jPanel5.add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 290, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("INGRESAR TEST");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 10));

        tabla_preguntas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "PREGUNTA"
            }
        ));
        jScrollPane2.setViewportView(tabla_preguntas);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 550, 90));

        btn_guardar_test.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_guardar_test.setText("Guardar el test");
        btn_guardar_test.setToolTipText("Guarda los datos ingresados");
        btn_guardar_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_testActionPerformed(evt);
            }
        });
        jPanel5.add(btn_guardar_test, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 160, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        jScrollPane3.setViewportView(jPanel5);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 710, 400));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 40, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 810, 520));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tituloActionPerformed

    private void txt_respuesta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_respuesta_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_respuesta_2ActionPerformed

    private void txt_respuesta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_respuesta_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_respuesta_1ActionPerformed

    private void txt_respuesta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_respuesta_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_respuesta_3ActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        try {
            Crear_preguntas(Base);
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo los datos de la pregunta");
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hay un error en crear pregunta");
        }


    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void btn_guardar_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_testActionPerformed
        try {
            Crear_Test(Base);
            javax.swing.JOptionPane.showMessageDialog(this, "Se guardo los datos del test");
            Bloquear_edicion_test();
            Desabilitar_Bloquear_edicion_antes_test();
            lbl_enunciado_guardar.setForeground(Color.white);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_guardar_testActionPerformed

    private void cbx_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_destinoActionPerformed

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

    //////////////////////////////////   TEST
    public void Crear_Test(ObjectContainer Base) {
        try {
            Test eltest = new Test();
            codigotest = Calcular_IDtest(Base);
            eltest.setID_Test(codigotest);
            
                System.out.println("codigo_de Psic_"+usarData.getCod_Psicologo());
            eltest.setFKCod_Psicologo(usarData.getCod_Psicologo());
            eltest.setTitulo_Test(txt_titulo.getText());
            eltest.setDescripcion_Test(txtA_descrip.getText());
            eltest.setCod_destinatario(cbx_destino.getSelectedItem().toString());
            Base.store(eltest);

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hay un error en crear test");
        }

    }

    public static String Calcular_IDtest(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("TS%04d", Incremental);

            if (Verificar_CdoTest(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public static int Verificar_CdoTest(ObjectContainer Base, String codigo) {
        Test elte = new Test();
        elte.setID_Test(codigo);
        ObjectSet result = Base.get(elte);

        return result.size();

    }

    //////////////////////////////////////////  Preguntas
    public void Crear_preguntas(ObjectContainer Base) {
        String cod_opcion_respuest = Calcular_Cod_Op_repuesta(Base);
        if (txt_respuesta_1.getText().trim().isEmpty() || txt_respuesta_2.getText().trim().isEmpty() || txt_respuesta_3.getText().trim().isEmpty() || cod_opcion_respuest == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar al menos una respuesta y el código de opción de respuesta no debe ser nulo.");
            return;
        } else {

            
            try {
                ////////////////Pregunta
                cod = Calcular_IDPregunta(Base);

                Preguntas lapre = new Preguntas();
                lapre.setCod_Pregunta(cod);
                lapre.setFK_Codigo_Test(codigotest);
                lapre.setEnunciado(txt_pregunta.getText());

                Base.store(lapre);

            } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hay un error en crear Pregunta");
            }

            try {
                ////////////// Respuesta 1

                Opcion_Respuesta Opcion1 = new Opcion_Respuesta();
                Opcion1.setCod_Opciones(Calcular_Cod_Op_repuesta(Base));
                Opcion1.setFK_CodPregunta(cod);
                Opcion1.setText_opcional(txt_respuesta_1.getText());
                Base.store(Opcion1);

                ////////////// Respuesta 2
                Opcion_Respuesta Opcion2 = new Opcion_Respuesta();
                Opcion2.setCod_Opciones(Calcular_Cod_Op_repuesta(Base));
                Opcion2.setFK_CodPregunta(cod);
                Opcion2.setText_opcional(txt_respuesta_2.getText());
                Base.store(Opcion2);

                ////////////// Respuesta 3
                Opcion_Respuesta Opcion3 = new Opcion_Respuesta();
                Opcion3.setCod_Opciones(Calcular_Cod_Op_repuesta(Base));
                Opcion3.setFK_CodPregunta(cod);
                Opcion3.setText_opcional(txt_respuesta_3.getText());
                Base.store(Opcion3);

                javax.swing.JOptionPane.showMessageDialog(this, "Se guardo Correctamente");
                Vaciar_textos();
                MostrarDatos(Base, codigotest);
            } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hay un error en crear Respuestas");
            }
        }

    }

    public String Calcular_Cod_Op_repuesta(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("RS%04d", Incremental);

            if (Verificar_Cod_op_Respuesta(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public  String Calcular_IDPregunta(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("PR%04d", Incremental);

            if (Verificar_CodPregunta(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public static int Verificar_CodPregunta(ObjectContainer Base, String codigo) {
        Preguntas elte = new Preguntas();
        elte.setCod_Pregunta(codigo);
        ObjectSet result = Base.get(elte);

        return result.size();

    }

    public static int Verificar_Cod_op_Respuesta(ObjectContainer Base, String codigo) {
        Opcion_Respuesta opcion = new Opcion_Respuesta();
        opcion.setCod_Opciones(codigo);
        ObjectSet result = Base.get(opcion);

        return result.size();

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
            java.util.logging.Logger.getLogger(PagCrudTestPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagCrudTestPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagCrudTestPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagCrudTestPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagCrudTestPsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JToggleButton btn_guardar_test;
    private javax.swing.JComboBox<String> cbx_destino;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_enunciado_guardar;
    private javax.swing.JTable tabla_preguntas;
    private javax.swing.JTextArea txtA_descrip;
    private javax.swing.JTextField txt_pregunta;
    private javax.swing.JTextField txt_respuesta_1;
    private javax.swing.JTextField txt_respuesta_2;
    private javax.swing.JTextField txt_respuesta_3;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables

    public void Vaciar_textos() {
        txt_pregunta.setText("");
        txt_respuesta_1.setText("");
        txt_respuesta_2.setText("");
        txt_respuesta_3.setText("");

    }

    public void Bloquear_edicion_test() {
        btn_guardar_test.setEnabled(false);
        txt_titulo.setEnabled(false);
        txtA_descrip.setEnabled(false);
        cbx_destino.setEnabled(false);

    }

    public void Bloquear_edicion_antes_test() {

        txt_pregunta.setEnabled(false);
        txt_respuesta_1.setEnabled(false);
        txt_respuesta_2.setEnabled(false);
        txt_respuesta_3.setEnabled(false);

    }

    public void Desabilitar_Bloquear_edicion_antes_test() {

        txt_pregunta.setEnabled(true);
        txt_respuesta_1.setEnabled(true);
        txt_respuesta_2.setEnabled(true);
        txt_respuesta_3.setEnabled(true);

    }

    public void MostrarDatos(ObjectContainer Base, String cod_test) {

        Preguntas Pegun = new Preguntas();
        Pegun.setFK_Codigo_Test(cod_test);
        ObjectSet result = Base.get(Pegun);

        DefaultTableModel modelo = (DefaultTableModel) tabla_preguntas.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Preguntas preg = (Preguntas) result.next();
            modelo.addRow(new Object[]{
                preg.getCod_Pregunta(),
                preg.getEnunciado()
            });
        }

    }

}
