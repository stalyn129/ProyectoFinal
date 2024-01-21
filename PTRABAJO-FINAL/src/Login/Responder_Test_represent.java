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


/**
 *
 * @author alexa
 */
public class Responder_Test_represent extends javax.swing.JFrame {


    //  boolean Bucle = true;
    UserDataSingleton usarData;
    ObjectContainer Base;
    String codPregunta = "";

    // CountDownLatch latch;
    /**
     * Creates new form Responder_Test_represent
     */
    public Responder_Test_represent() {
        initComponents();
        usarData = UserDataSingleton.getInstance();
        //latch = new CountDownLatch(1);
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        Mostrar_titulo(Base);
        MostrarDatos_Preguntas(Base);
        list_preguntas.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {

                String elementoSeleccionado = list_preguntas.getSelectedValue();
                caracteristicas_ponle(Base, elementoSeleccionado);
                repues_txt_1(Base);
                repues_txt_2(Base);
                repues_txt_3(Base);

            }
        });
        txt_pregunta.setEnabled(false);
        txt_resp1.setEnabled(false);
        txt_resp2.setEnabled(false);
        txt_resp3.setEnabled(false);
        Ingresar_respuesta.setEnabled(false);

    }
    String respue1 = "", respue2 = "", respue3 = "";
    String codResp__1 = "", codResp__2 = "", codResp__3 = "";
    int Que_respondi = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txt_titulo_test = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_preguntas = new javax.swing.JList<>();
        cargar_preg = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 30));

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
                .addContainerGap(20, Short.MAX_VALUE))
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 430, 60));

        list_preguntas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(list_preguntas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 270, 320));

        cargar_preg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cargar_preg.setText("Iniciar a responder");
        cargar_preg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargar_pregActionPerformed(evt);
            }
        });
        jPanel1.add(cargar_preg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 410, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pregunta.setEditable(false);
        txt_pregunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_pregunta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txt_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 370, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pregunta:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txt_resp2.setEditable(false);
        txt_resp2.setBackground(new java.awt.Color(204, 255, 204));
        txt_resp2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        });
        txt_resp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp2ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 160, -1));

        txt_resp1.setEditable(false);
        txt_resp1.setBackground(new java.awt.Color(204, 255, 204));
        txt_resp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        });
        txt_resp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp1ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, -1));

        txt_resp3.setEditable(false);
        txt_resp3.setBackground(new java.awt.Color(204, 255, 204));
        txt_resp3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        });
        txt_resp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_resp3ActionPerformed(evt);
            }
        });
        jPanel3.add(txt_resp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("2.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("3.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("1.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 380, 10));

        Ingresar_respuesta.setBackground(new java.awt.Color(255, 255, 255));
        Ingresar_respuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ingresar_respuesta.setText("Ingresar ");
        Ingresar_respuesta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ingresar_respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_respuestaActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar_respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 210, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 380, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 380, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 440, 280));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preguntas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen de WhatsApp 2024-01-03 a las 07.58.17_8bdfab4c.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_titulo_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_titulo_testActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_titulo_testActionPerformed

    private void txt_resp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resp2ActionPerformed

    private void txt_resp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resp1ActionPerformed

    private void txt_resp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_resp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_resp3ActionPerformed

    private void eliminarElementoSeleccionado() {
        int indiceSeleccionado = list_preguntas.getSelectedIndex();

        if (indiceSeleccionado != -1) {
            DefaultListModel<String> modeloLista = (DefaultListModel<String>) list_preguntas.getModel();

            // Eliminar el elemento del modelo
            modeloLista.remove(indiceSeleccionado);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un elemento para eliminar.");
        }
    }

    public void repues_txt_1(ObjectContainer Base) {
        Opcion_Respuesta op = new Opcion_Respuesta();
        op.setCod_Opciones(respue1);
        op.setFK_CodPregunta(codPregunta);
        ObjectSet resp = Base.get(op);

        while (resp.hasNext()) {
            Opcion_Respuesta opResp = (Opcion_Respuesta) resp.next();
            txt_resp1.setText(opResp.getText_opcional());

        }
        respue1 = "";

    }

    public void repues_txt_2(ObjectContainer Base) {
        Opcion_Respuesta op = new Opcion_Respuesta();
        op.setCod_Opciones(respue2);
        op.setFK_CodPregunta(codPregunta);
        ObjectSet resp = Base.get(op);

        while (resp.hasNext()) {
            Opcion_Respuesta opResp = (Opcion_Respuesta) resp.next();
            txt_resp2.setText(opResp.getText_opcional());

        }
        respue2 = "";

    }

    public void repues_txt_3(ObjectContainer Base) {
        Opcion_Respuesta op = new Opcion_Respuesta();
        op.setCod_Opciones(respue3);
        op.setFK_CodPregunta(codPregunta);
        ObjectSet resp = Base.get(op);

        while (resp.hasNext()) {
            Opcion_Respuesta opResp = (Opcion_Respuesta) resp.next();
            txt_resp3.setText(opResp.getText_opcional());

        }
        respue3 = "";

    }


    private void cargar_pregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargar_pregActionPerformed
        if (list_preguntas.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(this, "No hay preguntas a responder");
        } else {
            
            cargar_preg.setEnabled(false);
            txt_pregunta.setEnabled(true);
            txt_resp1.setEnabled(true);
            txt_resp2.setEnabled(true);
            txt_resp3.setEnabled(true);
            Ingresar_respuesta.setEnabled(true);

        }


    }//GEN-LAST:event_cargar_pregActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Base.close();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Ingresar_respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_respuestaActionPerformed
        respuesta_ususario(Base);

        eliminarElementoSeleccionado();
        txt_pregunta.setText("");
        txt_resp1.setText("");
        txt_resp2.setText("");
        txt_resp3.setText("");
        txt_resp2.setBackground(new Color(204, 255, 204));
        txt_resp1.setBackground(new Color(204, 255, 204));
        txt_resp3.setBackground(new Color(204, 255, 204));
        if (list_preguntas.getModel().getSize() == 0) {
        JOptionPane.showMessageDialog(this, "Las preguntas finalizaron");
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
        txt_resp1.setBackground(new Color(102, 204, 255));
        txt_resp2.setBackground(new Color(204, 255, 204));
        txt_resp3.setBackground(new Color(204, 255, 204));
        /////////////////////////////////////////////////////////////////////////    
        Que_respondi = 1;


    }//GEN-LAST:event_txt_resp1MouseClicked

    private void txt_resp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp2MouseClicked
        txt_resp2.setBackground(new Color(102, 204, 255));
        txt_resp1.setBackground(new Color(204, 255, 204));
        txt_resp3.setBackground(new Color(204, 255, 204));
        ////////////////////////////////////////////////////////////////////////////  
        Que_respondi = 2;


    }//GEN-LAST:event_txt_resp2MouseClicked

    private void txt_resp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_resp3MouseClicked
        txt_resp3.setBackground(new Color(102, 204, 255));
        txt_resp1.setBackground(new Color(204, 255, 204));
        txt_resp2.setBackground(new Color(204, 255, 204));
        /////////////////////////////////////////////////////////////////////////////
        Que_respondi = 3;


    }//GEN-LAST:event_txt_resp3MouseClicked

    public void respuesta_ususario(ObjectContainer Base) {
        if (Que_respondi == 0) {
            JOptionPane.showMessageDialog(this, "Seleccionar alguna respuesta");
        } else {
            String cod = "";

            Respuesta_Usuario respuesta = new Respuesta_Usuario();
            cod = Calcular_IDRespuesra_Usua(Base);
            respuesta.setCod_Respuesta_usuario(cod);
            respuesta.setFK_Cod_text(usarData.getCod_test_repre());

            respuesta.setFK_cod_Opciones(Opcion_seleccionada());
            respuesta.setFK_cod_pregunta(codPregunta);
            respuesta.setFK_cod_tipo_usua("");
            respuesta.setFecha_respuesta(new Date());

            Base.store(respuesta);
            System.out.println("Se guardo " + cod);

        }

    }

    public String Opcion_seleccionada() {
        String codigo = "";

        switch (Que_respondi) {
            case 1:
                codigo = codResp__1;
                return codigo;
            case 2:
                codigo = codResp__2;
                return codigo;
            case 3:
                codigo = codResp__3;
                return codigo;
            default:
                break;
        }
        System.out.println("__El codigo para respuesta_Usa es: " + codigo + " .");
        return codigo;
    }

    public void caracteristicas_ponle(ObjectContainer Base, String titulo) {

        Preguntas mipregunt = new Preguntas();
        mipregunt.setFK_Codigo_Test(usarData.getCod_test_repre());
        mipregunt.setEnunciado(titulo);
        ObjectSet result = Base.get(mipregunt);

        while (result.hasNext()) {

            Preguntas elts = (Preguntas) result.next();
            codPregunta = elts.getCod_Pregunta();
            txt_pregunta.setText(elts.getEnunciado());
            op_respuesta(Base, codPregunta);

        }

    }

    public void op_respuesta(ObjectContainer base, String codp) {
        try {
            Opcion_Respuesta respuesta = new Opcion_Respuesta();
            respuesta.setFK_CodPregunta(codp);

            ObjectSet rest = base.get(respuesta);
           // System.out.println("opcion " + rest.size());

            while (rest.hasNext()) {
                Opcion_Respuesta op = (Opcion_Respuesta) rest.next();
                String codOpcion = op.getCod_Opciones();

                if (respue1.equals("")) {
                    respue1 = codOpcion;
                   // System.out.println("Respuesta 1: " + respue1);
                    codResp__1 = respue1;

                } else if (respue2.equals("")) {
                    respue2 = codOpcion;
                   // System.out.println("Respuesta 2: " + respue2);
                    codResp__2 = respue2;

                } else if (respue3.equals("")) {
                    respue3 = codOpcion;
                   // System.out.println("Respuesta 3: " + respue3);
                    codResp__3 = respue3;

                }
            }
        } catch (DatabaseClosedException | Db4oIOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en opcion_respuesta");

        }

    }

    public void MostrarDatos_Preguntas(ObjectContainer Base) {
        try {
            Preguntas lapreg = new Preguntas();
            lapreg.setFK_Codigo_Test(usarData.getCod_test_repre());
            ObjectSet result = Base.get(lapreg);

            // Asegúrate de que la lista tenga un modelo adecuado (DefaultListModel)
            if (!(list_preguntas.getModel() instanceof DefaultListModel)) {
                // Si el modelo de la lista no es de tipo DefaultListModel, configúralo como tal
                DefaultListModel<String> modeloDefault = new DefaultListModel<>();
                list_preguntas.setModel(modeloDefault);
            }

            DefaultListModel<String> modeloDefault = (DefaultListModel<String>) list_preguntas.getModel();

            // Limpiar el modelo antes de agregar nuevas filas
            modeloDefault.clear();

            javax.swing.JOptionPane.showMessageDialog(this, "Tenemos a disposicion " + result.size() + " Preguntas");

            // Verifica si hay datos en la base de datos antes de iterar sobre ellos
            if (result.size() > 0) {
                while (result.hasNext()) {
                    Preguntas tst = (Preguntas) result.next();
                    modeloDefault.addElement(tst.getEnunciado());
                }

                // Refresca la interfaz gráfica después de agregar elementos
                list_preguntas.repaint(); // o lista_test.revalidate();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay test Dispopnibles");
            }
        } catch (DatabaseClosedException | Db4oIOException | HeadlessException e) {
            // Maneja las excepciones y muestra un mensaje de error
            javax.swing.JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + e.getMessage());
        }

    }

    public void Mostrar_titulo(ObjectContainer Base) {
        Test eltest = new Test();
        eltest.setID_Test(usarData.getCod_test_repre());
        ObjectSet result = Base.get(eltest);

        while (result.hasNext()) {
            Test elt = (Test) result.next();
            txt_titulo_test.setText(elt.getTitulo_Test());
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    /* */
 /*  private void iniciarBusqueda(ObjectContainer base) {
     
     
        Preguntas elpreg = new Preguntas();
        elpreg.setFK_Codigo_Test(usarData.getCod_test_repre());
        //System.out.println("essss: " + usarData.getCod_test_repre());
        ObjectSet result = base.get(elpreg);
        System.out.println("cuantos hay" + result.size());

        while (result.hasNext()) {
            Preguntas preg = (Preguntas) result.next();
            String ccodpre = preg.getCod_Pregunta();
            System.out.println("cod pregunta" + ccodpre);

            CountDownLatch latch = new CountDownLatch(1); // Nuevo CountDownLatch para cada iteración

            Thread thread = new Thread(() -> {
                SwingUtilities.invokeLater(() -> {
                    txt_pregunta.setText(preg.getEnunciado());
                });
                op_respuesta(base, ccodpre);
                latch.countDown(); // Notifica que el hilo ha terminado
            });
            thread.start();

            try {
                latch.await(); // Espera hasta que el hilo secundario haya terminado
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        javax.swing.JOptionPane.showMessageDialog(this, "se acabo el bucle");
       
}*/
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
            java.util.logging.Logger.getLogger(Responder_Test_represent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_represent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_represent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Responder_Test_represent.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Responder_Test_represent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar_respuesta;
    private javax.swing.JButton cargar_preg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList<String> list_preguntas;
    private javax.swing.JTextField txt_pregunta;
    private javax.swing.JTextField txt_resp1;
    private javax.swing.JTextField txt_resp2;
    private javax.swing.JTextField txt_resp3;
    private javax.swing.JTextField txt_titulo_test;
    // End of variables declaration//GEN-END:variables
    public String Calcular_IDRespuesra_Usua(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("RU%04d", Incremental);

            if (Verificar_respuesta_usua(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public int Verificar_respuesta_usua(ObjectContainer Base, String codifo) {
        Respuesta_Usuario usua = new Respuesta_Usuario();
        usua.setCod_Respuesta_usuario(codPregunta);

        ObjectSet result = Base.get(usua);

        return result.size();
    }

}