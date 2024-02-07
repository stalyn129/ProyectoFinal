/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.*;
import Clases.UserDataSingleton;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author alexa
 */
public class Responder_Test_Niño__1 extends javax.swing.JFrame {

    //  boolean Bucle = true;
    UserDataSingleton usarData;

    ObjectContainer Base;
    String codPregunta = "";
    int seleccion = 0;
    String codSelecccion;

    // CountDownLatch latch;
    /**
     * Creates new form Responder_Test_represent
     */
    public Responder_Test_Niño__1() {
        initComponents();
        ocultarColumna();
        usarData = UserDataSingleton.getInstance();

        //latch = new CountDownLatch(1);
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        Mostrar_titulo(Base);
        MostrarDatos_Preguntas(Base);

        /*  list_preguntas.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {

                String elementoSeleccionado = list_preguntas.getSelectedValue();
                caracteristicas_ponle(Base, elementoSeleccionado);
                repues_txt_1(Base);
                repues_txt_2(Base);
                repues_txt_3(Base);

            }
        });*/
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Mostrar_titulo(ObjectContainer Base) {
        Test eltest = new Test();
        eltest.setID_Test(usarData.getCod_test_repre());
        ObjectSet result = Base.get(eltest);
        if (result.size() != 0) {
            while (result.hasNext()) {
                Test elt = (Test) result.next();
                txt_titulo_test.setText(elt.getTitulo_Test());

            }
        }

    }

    public void MostrarDatos_Preguntas(ObjectContainer Base) {
        Preguntas pre = new Preguntas();
        pre.setFK_Codigo_Test(usarData.getCod_test_repre());

        ObjectSet result = Base.get(pre);
        DefaultTableModel modelo = (DefaultTableModel) tabla_datos.getModel();

        modelo.setRowCount(0);
        if (result.size() != 0) {
            while (result.hasNext()) {
                Preguntas next = (Preguntas) result.next();
                modelo.addRow(new Object[]{
                    next.getCod_Pregunta(),
                    next.getEnunciado()

                });

            }
        } else {
            JOptionPane.showMessageDialog(this, "No se subio Preguntas");
        }

    }
    String codOpcion = "";

    public void Cargar_datos(ObjectContainer Base, String codPregunt) {
        Opcion_Respuesta op = new Opcion_Respuesta();
        op.setFK_CodPregunta(codPregunt);
        ObjectSet Result = Base.get(op);

        while (Result.hasNext()) {
            Opcion_Respuesta next = (Opcion_Respuesta) Result.next();

            String cod = next.getCod_Opciones();
            String text = next.getText_opcional();

            if (txt_resp1.getText().equals("")) {
                txt_resp1.setText(text);
                txt_cod_1.setText(cod);

            } else if (txt_resp2.getText().equals("")) {

                txt_resp2.setText(text);
                txt_cod_2.setText(cod);

            } else if (txt_resp3.getText().equals("")) {
                txt_resp3.setText(text);
                txt_cod_3.setText(cod);

            }

        }

    }

    public String seleccion_preg() {
        String codRespuesra = "";
        if (seleccion == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una respuesta");

        } else if (seleccion == 1) {
            codRespuesra = txt_cod_1.getText();

        } else if (seleccion == 2) {
            codRespuesra = txt_cod_2.getText();

        } else if (seleccion == 3) {
            codRespuesra = txt_cod_3.getText();
        }

        return codRespuesra;
    }

    public boolean guardar_seleccion(ObjectContainer Base) {
        boolean cumpl = false;
        if (seleccion_preg().equals("")) {
            JOptionPane.showMessageDialog(this, "Seleccione una respuesta");
        } else {
            Respuesta_Usuario resp = new Respuesta_Usuario();
            String cod = Calcular_IDRespuesra_Usua(Base);

            System.out.println("Codigo_respuesta: " + cod);

            resp.setCod_Respuesta_usuario(cod);
            resp.setFK_Cod_text(usarData.getCod_test_repre());

            System.out.println("Codigo_PREGUNTA: " + codSelecccion);

            resp.setFK_cod_pregunta(codSelecccion);
            System.out.println("Cod_Opcion: " + seleccion_preg());
            resp.setFK_cod_Opciones(seleccion_preg());
            resp.setFk_Cod_Usuario(usarData.getCod_niño());
            resp.setTipo_usuario("Niño");
            resp.setFecha_respuesta(new Date());
            Base.store(resp);
            cumpl = true;

        }
        return cumpl;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   ///
    public String Calcular_IDRespuesra_Usua(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("RUR%04d", Incremental);

            if (Verificar_respuesta_usua(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public int Verificar_respuesta_usua(ObjectContainer Base, String codifo) {
        Respuesta_Usuario usua = new Respuesta_Usuario();
        usua.setCod_Respuesta_usuario(codifo);

        ObjectSet result = Base.get(usua);
        System.out.println("result" + result.size());

        return result.size();
    }

    private void eliminarElementoSeleccionado() {
        int indiceSeleccionado = tabla_datos.getSelectedRow();

        if (indiceSeleccionado != -1) {
            DefaultTableModel modeloLista = (DefaultTableModel) tabla_datos.getModel();

            // Eliminar el elemento del modelo
            modeloLista.removeRow(indiceSeleccionado);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un elemento para eliminar.");
        }
    }

    private void ocultarColumna() {

        // Obtén el TableColumnModel de la tabla
        TableColumnModel columnModel = tabla_datos.getColumnModel();

        // Obtiene la columna en función del índice proporcionado
        TableColumn columna = columnModel.getColumn(0);

        // Hace que la columna no sea visible
        columna.setMinWidth(0);
        columna.setMaxWidth(0);
        columna.setWidth(0);
        columna.setPreferredWidth(0);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txt_titulo_test = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txt_pregunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_resp2 = new javax.swing.JTextField();
        txt_resp1 = new javax.swing.JTextField();
        txt_resp3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Ingresar_respuesta = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txt_cod_3 = new javax.swing.JTextField();
        txt_cod_1 = new javax.swing.JTextField();
        txt_cod_2 = new javax.swing.JTextField();
        BtnCerrarPagina = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Cod", "Titulo"
            }
        ));
        tabla_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_datosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_datosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_datos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 630, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txt_titulo_test.setEditable(false);
        txt_titulo_test.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        txt_titulo_test.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_titulo_test.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txt_titulo_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_titulo_testActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txt_titulo_test, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_titulo_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 430, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pregunta.setEditable(false);
        txt_pregunta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_pregunta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txt_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 560, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pregunta:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txt_resp2.setEditable(false);
        txt_resp2.setBackground(new java.awt.Color(255, 255, 255));
        txt_resp2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_resp2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_resp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_resp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_resp2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_resp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_resp2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_resp2MousePressed(evt);
            }
        });
        txt_resp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp2ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 500, -1));

        txt_resp1.setEditable(false);
        txt_resp1.setBackground(new java.awt.Color(255, 255, 255));
        txt_resp1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_resp1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_resp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_resp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_resp1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_resp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_resp1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_resp1MousePressed(evt);
            }
        });
        txt_resp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp1ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 500, -1));

        txt_resp3.setEditable(false);
        txt_resp3.setBackground(new java.awt.Color(255, 255, 255));
        txt_resp3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_resp3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_resp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_resp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_resp3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_resp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_resp3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_resp3MousePressed(evt);
            }
        });
        txt_resp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp3ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 500, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("2.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("3.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("1.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 560, 10));

        Ingresar_respuesta.setBackground(new java.awt.Color(255, 255, 255));
        Ingresar_respuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ingresar_respuesta.setText("Ingresar ");
        Ingresar_respuesta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ingresar_respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_respuestaActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar_respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 320, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 380, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 430, 10));

        txt_cod_3.setEditable(false);
        txt_cod_3.setBackground(new java.awt.Color(255, 255, 255));
        txt_cod_3.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        txt_cod_3.setForeground(new java.awt.Color(255, 255, 255));
        txt_cod_3.setBorder(null);
        txt_cod_3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_cod_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 0, 0));

        txt_cod_1.setEditable(false);
        txt_cod_1.setBackground(new java.awt.Color(255, 255, 255));
        txt_cod_1.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txt_cod_1.setForeground(new java.awt.Color(255, 255, 255));
        txt_cod_1.setBorder(null);
        txt_cod_1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_cod_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 0, 0));

        txt_cod_2.setEditable(false);
        txt_cod_2.setBackground(new java.awt.Color(255, 255, 255));
        txt_cod_2.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        txt_cod_2.setForeground(new java.awt.Color(255, 255, 255));
        txt_cod_2.setBorder(null);
        txt_cod_2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_cod_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 122, 0, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 630, 260));

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

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setToolTipText("Regresar a la página de inicio");
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 60, 40));

        btnMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnMinimizar1.setText("—");
        btnMinimizar1.setToolTipText("Cerrar Pagina dando click aqui");
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

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preguntas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoTestRepresentante.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -10, 1690, 490));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        JMnItmCerrarNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMnItmCerrarNiño2.setToolTipText("Configuración");

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
        JMnItmCerrarNiño2.add(jMenuItem1);

        MenuGenerlNiño.add(JMnItmCerrarNiño2);

        JMnPgPrinNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño2.setToolTipText("Regresa a la página principal");
        JMnPgPrinNiño2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiño2MouseClicked(evt);
            }
        });
        MenuGenerlNiño.add(JMnPgPrinNiño2);

        setJMenuBar(MenuGenerlNiño);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_titulo_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_titulo_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_titulo_testActionPerformed

    private void txt_resp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp2ActionPerformed

    }//GEN-LAST:event_txt_resp2ActionPerformed

    private void txt_resp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp1ActionPerformed

    }//GEN-LAST:event_txt_resp1ActionPerformed

    private void txt_resp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp3ActionPerformed

    }//GEN-LAST:event_txt_resp3ActionPerformed

    private void Ingresar_respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_respuestaActionPerformed

        boolean est = guardar_seleccion(Base);
        if (est) {
            eliminarElementoSeleccionado();
            txt_pregunta.setText("");
            txt_resp1.setText("");
            txt_resp2.setText("");
            txt_resp3.setText("");
            txt_resp2.setBackground(new Color(204, 255, 204));
            txt_resp1.setBackground(new Color(204, 255, 204));
            txt_resp3.setBackground(new Color(204, 255, 204));
            if (tabla_datos.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Las preguntas finalizaron");
                Base.close();
                PagTest_Niño pag= new PagTest_Niño();
                pag.setVisible(true);
                this.setVisible(false);
                
            }
        } else {
        }


    }//GEN-LAST:event_Ingresar_respuestaActionPerformed

    private void txt_resp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp1MouseEntered

        txt_resp1.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_txt_resp1MouseEntered

    private void txt_resp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp1MouseExited
        Color col = new Color(153, 204, 255);
        if (txt_resp1.getBackground().equals(col)) {
            txt_resp1.setBackground(new Color(204, 255, 204));
        }

    }//GEN-LAST:event_txt_resp1MouseExited

    private void txt_resp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp2MouseEntered

        txt_resp2.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_txt_resp2MouseEntered

    private void txt_resp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp3MouseEntered
        txt_resp3.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_txt_resp3MouseEntered

    private void txt_resp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp2MouseExited
        Color col = new Color(153, 204, 255);
        if (txt_resp2.getBackground().equals(col)) {
            txt_resp2.setBackground(new Color(204, 255, 204));
        }
    }//GEN-LAST:event_txt_resp2MouseExited

    private void txt_resp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp3MouseExited
        Color col = new Color(153, 204, 255);
        if (txt_resp3.getBackground().equals(col)) {
            txt_resp3.setBackground(new Color(204, 255, 204));
        }

    }//GEN-LAST:event_txt_resp3MouseExited

    private void txt_resp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp1MouseClicked

        /////////////////////////////////////////////////////////////////////////    

    }//GEN-LAST:event_txt_resp1MouseClicked

    private void txt_resp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp2MouseClicked

    }//GEN-LAST:event_txt_resp2MouseClicked

    private void txt_resp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp3MouseClicked

    }//GEN-LAST:event_txt_resp3MouseClicked

    private void tabla_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosMouseClicked

    }//GEN-LAST:event_tabla_datosMouseClicked

    private void tabla_datosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_datosMousePressed
        txt_resp1.setText("");
        txt_resp2.setText("");
        txt_resp3.setText("");
        txt_cod_1.setText("");
        txt_cod_2.setText("");
        txt_cod_3.setText("");
        SwingUtilities.invokeLater(() -> {
            int selecciontabla = tabla_datos.getSelectedRow();
            codSelecccion = String.valueOf(tabla_datos.getValueAt(selecciontabla, 0));

            Cargar_datos(Base, codSelecccion);
            txt_pregunta.setText(String.valueOf(tabla_datos.getValueAt(selecciontabla, 1)));
        });

    }//GEN-LAST:event_tabla_datosMousePressed

    private void txt_resp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp1MousePressed
        txt_resp1.setBackground(new Color(102, 204, 255));
        txt_resp2.setBackground(new Color(204, 255, 204));
        txt_resp3.setBackground(new Color(204, 255, 204));

        seleccion = 1;

        System.out.println("Eleccion: " + seleccion);

    }//GEN-LAST:event_txt_resp1MousePressed

    private void txt_resp2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp2MousePressed
        txt_resp2.setBackground(new Color(102, 204, 255));
        txt_resp1.setBackground(new Color(204, 255, 204));
        txt_resp3.setBackground(new Color(204, 255, 204));
        seleccion = 2;

        System.out.println("Eleccion: " + seleccion);
    }//GEN-LAST:event_txt_resp2MousePressed

    private void txt_resp3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp3MousePressed
        txt_resp3.setBackground(new Color(102, 204, 255));
        txt_resp1.setBackground(new Color(204, 255, 204));
        txt_resp2.setBackground(new Color(204, 255, 204));
        seleccion = 3;

        System.out.println("Eleccion: " + seleccion);
    }//GEN-LAST:event_txt_resp3MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed

        Base.close();
        InicioNiño login = new InicioNiño();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void JMnPgPrinNiño2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiño2MouseClicked
        Base.close();
        PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
        principalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiño2MouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Base.close();
        PagTest_Niño pag = new PagTest_Niño();
        pag.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(Responder_Test_Niño__1.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Responder_Test_Niño__1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_Niño__1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_Niño__1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_Niño__1.class
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
                new Responder_Test_Niño__1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JButton Ingresar_respuesta;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tabla_datos;
    private javax.swing.JTextField txt_cod_1;
    private javax.swing.JTextField txt_cod_2;
    private javax.swing.JTextField txt_cod_3;
    private javax.swing.JTextField txt_pregunta;
    private javax.swing.JTextField txt_resp1;
    private javax.swing.JTextField txt_resp2;
    private javax.swing.JTextField txt_resp3;
    private javax.swing.JTextField txt_titulo_test;
    // End of variables declaration//GEN-END:variables

}
