/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Juego_Laberinto;
import Clases.RespuestasLab;
import Clases.UserDataSingleton;
import Login.InicioNiño;
import Login.PagMiniJuegoNiño;
import Login.PagPrincipalNiñ;
import Login.Pag_Crud_JLaberinto;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class PagJuego1Niño extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;
    public PagJuego1Niño() {
        initComponents();
        usarData = UserDataSingleton.getInstance();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(jComboJuego);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrupLaberinRespNiño = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LblTituloLabeNiño2 = new javax.swing.JLabel();
        LblPreguntaLabeNiño = new javax.swing.JLabel();
        LblImaNiñoLaberintoJueg = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        LblTituloLabeNiño1 = new javax.swing.JLabel();
        LblSubTituLabeJuegNiño = new javax.swing.JLabel();
        BtnALabeNiño1 = new javax.swing.JRadioButton();
        BtnALabeNiño2 = new javax.swing.JRadioButton();
        BtnALabeNiño3 = new javax.swing.JRadioButton();
        BtnALabeNiño4 = new javax.swing.JRadioButton();
        jComboJuego = new javax.swing.JComboBox<>();
        BtnRegresar1 = new javax.swing.JButton();
        LblInformacionNiño1 = new javax.swing.JLabel();
        LblInformacionNiño = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JTextField();
        lblPuntuacion = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(520, 486));
        jPanel3.setPreferredSize(new java.awt.Dimension(520, 486));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblTituloLabeNiño2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTituloLabeNiño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloLabeNiño2.setText("EL LABERINTO");
        jPanel3.add(LblTituloLabeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 160, -1));

        LblPreguntaLabeNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblPreguntaLabeNiño.setText("¿Cuál de estos caminos es el correcto?");
        jPanel3.add(LblPreguntaLabeNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 230, 20));

        LblImaNiñoLaberintoJueg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImaNiñoLaberintoJueg.setText("      ");
        LblImaNiñoLaberintoJueg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(LblImaNiñoLaberintoJueg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 440, 280));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 470, 10));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 440, 10));

        LblTituloLabeNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTituloLabeNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTituloLabeNiño1.setText("HOY TENEMOS EL JUEGO DE:");
        jPanel3.add(LblTituloLabeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 330, -1));

        LblSubTituLabeJuegNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblSubTituLabeJuegNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblSubTituLabeJuegNiño.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(LblSubTituLabeJuegNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 410, 20));

        BtnGrupLaberinRespNiño.add(BtnALabeNiño1);
        BtnALabeNiño1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnALabeNiño1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnALabeNiño1ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnALabeNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 70, 30));

        BtnGrupLaberinRespNiño.add(BtnALabeNiño2);
        BtnALabeNiño2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnALabeNiño2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnALabeNiño2ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnALabeNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 60, 30));

        BtnGrupLaberinRespNiño.add(BtnALabeNiño3);
        BtnALabeNiño3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnALabeNiño3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnALabeNiño3ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnALabeNiño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 60, 30));

        BtnGrupLaberinRespNiño.add(BtnALabeNiño4);
        BtnALabeNiño4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        BtnALabeNiño4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnALabeNiño4ActionPerformed(evt);
            }
        });
        jPanel3.add(BtnALabeNiño4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 60, 30));

        jComboJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jComboJuego.setToolTipText("Selecciona el que mas te guste");
        jComboJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboJuegoActionPerformed(evt);
            }
        });
        jPanel3.add(jComboJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, -1));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 260));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 570, 250));

        BtnRegresar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar1.setToolTipText("Regresa a la pestaña de los minijuegos");
        BtnRegresar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar1.setOpaque(false);
        BtnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 40, 30));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setText("BIENVENIDOS AL JUEGO DEL:");
        jPanel1.add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 300, 20));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setText("LABERINTO");
        jPanel1.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 120, 20));

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

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 70));
        jPanel1.add(txtPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 60, 30));

        lblPuntuacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPuntuacion.setText("Puntuación:");
        jPanel1.add(lblPuntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoJuego1Niño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1690, 510));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

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
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar1ActionPerformed
        Base.close();
        PagMiniJuegoNiño Juego1 = new PagMiniJuegoNiño();
        Juego1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar1ActionPerformed

    private void jComboJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboJuegoActionPerformed
        if (jComboJuego.getSelectedItem() != null) {
            cargar_datos1();
        }
    }//GEN-LAST:event_jComboJuegoActionPerformed

    private void BtnALabeNiño1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnALabeNiño1ActionPerformed
        verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), BtnALabeNiño1.getText().charAt(3));
    }//GEN-LAST:event_BtnALabeNiño1ActionPerformed

    private void BtnALabeNiño3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnALabeNiño3ActionPerformed
       verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), BtnALabeNiño3.getText().charAt(3));
    }//GEN-LAST:event_BtnALabeNiño3ActionPerformed

    private void BtnALabeNiño2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnALabeNiño2ActionPerformed
         verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), BtnALabeNiño2.getText().charAt(3));
    }//GEN-LAST:event_BtnALabeNiño2ActionPerformed

    private void BtnALabeNiño4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnALabeNiño4ActionPerformed
      verificarRespuesta(Base, String.valueOf(jComboJuego.getSelectedItem()), BtnALabeNiño4.getText().charAt(3));
    }//GEN-LAST:event_BtnALabeNiño4ActionPerformed

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

    public void cargar_combo1(JComboBox jComboJuego) {

        Juego_Laberinto JBuscar = new Juego_Laberinto(null, null, null, '\0', '\0', '\0', '\0', null, null);
        ObjectSet resul = Base.get(JBuscar);
        while (resul.hasNext()) {
            Juego_Laberinto JCombo = (Juego_Laberinto) resul.next();
            jComboJuego.addItem(JCombo.getDescripcion_Juego());
        }
        //System.out.println(resul);
    }

    public void cargar_datos1() {

        String descrip = String.valueOf(jComboJuego.getSelectedItem());
        Juego_Laberinto JBuscar = new Juego_Laberinto(null, null, descrip, '\0', '\0', '\0', '\0', null, null);
        ObjectSet resul = Base.get(JBuscar);

        // Verificar si hay al menos un resultado
        if (!resul.isEmpty()) {
            // Iterar sobre los resultados
            while (resul.hasNext()) {
                Juego_Laberinto Jmostrar = (Juego_Laberinto) resul.next();
                LblSubTituLabeJuegNiño.setText(Jmostrar.getDescripcion_Juego());
                System.out.println(Jmostrar);

                // Rellena las imágenes en los JLabel correspondientes
                Image imagenJuego = Jmostrar.obtenerImagenComoImage();
                LblImaNiñoLaberintoJueg.setIcon(getScaledImageIcon(imagenJuego));

                // Obtén las respuestas incorrectas y correctas
                char respuestaIncorrecta1 = Jmostrar.getRespuestas_Incorrecta1();
                char respuestaIncorrecta2 = Jmostrar.getRespuestas_Incorrecta2();
                char respuestaIncorrecta3 = Jmostrar.getRespuestas_Incorrecta3();
                char respuestaCorrecta = Jmostrar.getRespuesta_Correcta();

                // Coloca las respuestas en un ArrayList para facilitar el reordenamiento aleatorio
                List<Character> respuestas = Arrays.asList(respuestaIncorrecta1, respuestaIncorrecta2, respuestaIncorrecta3, respuestaCorrecta);

                // Mezcla aleatoriamente las respuestas
                Collections.shuffle(respuestas);

                // Asigna las respuestas a los botones
                BtnALabeNiño1.setText("1. " + respuestas.get(0));
                BtnALabeNiño2.setText("2. " + respuestas.get(1));
                BtnALabeNiño3.setText("3. " + respuestas.get(2));
                BtnALabeNiño4.setText("4. " + respuestas.get(3));
                
                txtPuntuacion.setEditable(false);

                // Establecer el texto en "10"
                txtPuntuacion.setText("10");

                // Asegurarse de que la puntuación se muestre correctamente en el campo
                txtPuntuacion.repaint();
            }
        } else {

            System.out.println("No se encontraron datos para el juego seleccionado.");
        }

        Base.commit();
    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(440, 280, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }
    
    private void verificarRespuesta(ObjectContainer Base, String Descrip, int respuestaUsuario) {
        // Obtén la información del juego desde la base de datos u otras fuentes según tu implementación
        Juego_Laberinto juego = obtenerInformacionDelJuego(Base, Descrip);

        // Verifica la respuesta y muestra el mensaje correspondiente
        if (respuestaUsuario == juego.getRespuesta_Correcta()) {
            JOptionPane.showMessageDialog(this, "¡Felicidades! Respuesta correcta. Prueba otro laberinto.", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            // Aquí puedes agregar lógica para cargar el próximo laberinto o realizar cualquier otra acción necesaria.

            // Llama al método para realizar acciones al terminar, que incluye guardar la puntuación
            realizarAccionesAlTerminar();
        } else {
            // Restar puntuación al seleccionar una opción incorrecta
            int puntuacionActual = Integer.parseInt(txtPuntuacion.getText());
            puntuacionActual -= 3;
            txtPuntuacion.setText(String.valueOf(puntuacionActual));

            // Actualizar la visualización de la puntuación en el JTextField
            txtPuntuacion.repaint();

            JOptionPane.showMessageDialog(this, "Respuesta incorrecta. Inténtelo de nuevo.", "Incorrecto", JOptionPane.ERROR_MESSAGE);
            // Aquí puedes agregar lógica adicional si deseas realizar alguna acción cuando la respuesta es incorrecta.
        }
    }
    
    private Juego_Laberinto obtenerInformacionDelJuego(ObjectContainer Base, String Descrip) {
    Juego_Laberinto juego = new Juego_Laberinto(null, null, Descrip, '\0', '\0', '\0', '\0', null, null);

    // Realiza la consulta en la base de datos para obtener la información del juego
    ObjectSet result = Base.get(juego);

    // Verifica si se encontró un juego
    if (result.hasNext()) {
        return (Juego_Laberinto) result.next();
    } else {
        // Puedes manejar la situación en la que no se encuentra el juego, por ejemplo, lanzando una excepción o devolviendo un valor predeterminado.
        throw new IllegalStateException("No se encontró información del juego.");
    }
}


    public static String Calcular_ID_Puntuacion(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo = "";
        try {
            do {
                Incremental++;
                Codigo = String.format("PJL-%04d", Incremental);

                if (Verificar_CodigoPutuacion(Base, Codigo) == 0) {
                    rest = false;
                }
            } while (rest);
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
        }
        return Codigo;
    }

    public static int Verificar_CodigoPutuacion(ObjectContainer Base, String Codigo) {

        try {
            RespuestasLab miPuntuacion = new RespuestasLab();
            miPuntuacion.setID_Respuesta(Codigo);

            ObjectSet result = Base.get(miPuntuacion);

            return result.size();
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private void realizarAccionesAlTerminar() {
        try {
            RespuestasLab puntuacion = new RespuestasLab();

            // Obtener código de niño
            String Cod_Niño = usarData.getCod_niño();

            // Obtener descripción del juego seleccionado
            String descrip = String.valueOf(jComboJuego.getSelectedItem());
            Juego_Laberinto juego = obtenerInformacionDelJuego(Base, descrip);

            // Obtener el código del juego
            String codigoJuego = juego.getCod_Juego();

            // Verificar si ya existe una puntuación para este juego y niño
            RespuestasLab puntuacionExistente = obtenerPuntuacionExistente(Base, Cod_Niño, codigoJuego);

            if (puntuacionExistente == null) {
                // No hay puntuación existente, procede a almacenar la nueva puntuación
                guardarNuevaPuntuacion(puntuacion, Cod_Niño, codigoJuego);
            } else {
                // Hay puntuación existente, compara con la nueva y actualiza si es mayor
                int nuevaPuntuacion = Integer.parseInt(txtPuntuacion.getText());
                int puntuacionExistenteValor = puntuacionExistente.getPuntuacion();

                if (nuevaPuntuacion > puntuacionExistenteValor) {
                    // La nueva puntuación es mayor, actualiza la puntuación existente
                    actualizarPuntuacionExistente(puntuacionExistente, nuevaPuntuacion);
                }
            }

        } catch (DatabaseClosedException | DatabaseReadOnlyException | NullPointerException e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la puntuación: " + e.getMessage());
        } finally {
            // Asegúrate de cerrar la base de datos adecuadamente
        }
    }

    private void guardarNuevaPuntuacion(RespuestasLab puntuacion, String Cod_Niño, String codigoJuego) {
        try {
            // Generar ID de puntuación
            String Codigo = Calcular_ID_Puntuacion(Base);
            puntuacion.setID_Respuesta(Codigo);
            System.out.println("ID de Puntuación: " + Codigo);

            puntuacion.setFK_Cod_Niño(Cod_Niño);
            System.out.println("Código de Niño: " + Cod_Niño);

            puntuacion.setFK_Cod_Minijuego(codigoJuego);
            System.out.println("Código de Juego: " + codigoJuego);

            // Obtener y asignar la fecha de juego
            Date FechaJugado = new Date();
            puntuacion.setFecha_Jugado(FechaJugado);
            System.out.println("Fecha de Juego: " + FechaJugado);

            // Obtener la puntuacionActual
            int punt = Integer.parseInt(txtPuntuacion.getText());
            puntuacion.setPuntuacion(punt);

            // Almacenar la puntuación en la base de datos
            Base.store(puntuacion);

            // Mensajes de depuración adicionales
            System.out.println("Puntuación almacenada correctamente:");
            System.out.println(puntuacion);

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la puntuación: " + e.getMessage());
        }
    }

    private RespuestasLab obtenerPuntuacionExistente(ObjectContainer Base, String Cod_Niño, String codigoJuego) {
        try {
            RespuestasLab respuesta = new RespuestasLab();
            respuesta.setFK_Cod_Niño(Cod_Niño);
            respuesta.setFK_Cod_Minijuego(codigoJuego);

            ObjectSet result = Base.get(respuesta);

            if (result.hasNext()) {
                return (RespuestasLab) result.next();
            } else {
                return null;
            }
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void actualizarPuntuacionExistente(RespuestasLab puntuacionExistente, int nuevaPuntuacion) {
        try {
            puntuacionExistente.setPuntuacion(nuevaPuntuacion);
            // Actualizar la fecha o cualquier otro campo si es necesario
            puntuacionExistente.setFecha_Jugado(new Date());

            // Almacenar la puntuación actualizada en la base de datos
            Base.store(puntuacionExistente);

            // Mensaje de depuración
            System.out.println("Puntuación existente actualizada correctamente:");
            System.out.println(puntuacionExistente);

        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            System.err.println("Excepción al actualizar la puntuación: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(Pag_Crud_JLaberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JLaberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JLaberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag_Crud_JLaberinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagJuego1Niño().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnALabeNiño1;
    private javax.swing.JRadioButton BtnALabeNiño2;
    private javax.swing.JRadioButton BtnALabeNiño3;
    private javax.swing.JRadioButton BtnALabeNiño4;
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.ButtonGroup BtnGrupLaberinRespNiño;
    private javax.swing.JButton BtnRegresar1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JLabel LblImaNiñoLaberintoJueg;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblPreguntaLabeNiño;
    private javax.swing.JLabel LblSubTituLabeJuegNiño;
    private javax.swing.JLabel LblTituloLabeNiño1;
    private javax.swing.JLabel LblTituloLabeNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JComboBox<String> jComboJuego;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JTextField txtPuntuacion;
    // End of variables declaration//GEN-END:variables
}
