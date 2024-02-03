/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Comentario;
import Clases.Foro;
import Clases.Persona;
import Clases.Psicologo;
import Clases.Representante;
import Clases.UserDataSingleton;
import com.db4o.*;
import com.db4o.ObjectContainer;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PagForoPsicologo extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;

    public PagForoPsicologo() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(jComboForos);
        usarData = UserDataSingleton.getInstance();
        Comentario comen = new Comentario();
        System.out.println(comen);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtParticipaciones = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea_Comentario = new javax.swing.JTextArea();
        btnPublicar = new javax.swing.JButton();
        jComboForos = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 670));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 670));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("Comentar:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));
        jPanel3.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 560, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 560, 10));

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 510, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel13.setText("Descripción:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        txtParticipaciones.setColumns(20);
        txtParticipaciones.setLineWrap(true);
        txtParticipaciones.setRows(5);
        txtParticipaciones.setWrapStyleWord(true);
        txtParticipaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtParticipacionesMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtParticipaciones);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 390, 290));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setText("Participaciones:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, 20));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel15.setText("Título:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        txtArea_Comentario.setColumns(20);
        txtArea_Comentario.setLineWrap(true);
        txtArea_Comentario.setRows(5);
        txtArea_Comentario.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtArea_Comentario);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 100));

        btnPublicar.setText("Publicar Comentario");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });
        jPanel3.add(btnPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 20));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 710, 330));

        jComboForos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jComboForos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboForosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboForos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 550, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Selecciona aqui el foro en el que desees participar:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 550, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMnItmCerrarNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarNiñoMousePressed(evt);
            }
        });
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuCuentosNiño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuCuentosNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuCuentosNiño);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        Base.close();
        PagPrincipalRepresentante principalrepresetante = new PagPrincipalRepresentante();
        principalrepresetante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

    private void JMnItmCerrarNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarNiñoMousePressed
        Base.close();
        InicioRepresentante loginrepre = new InicioRepresentante();
        loginrepre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarNiñoMousePressed

    private void jComboForosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboForosActionPerformed
        if (jComboForos.getSelectedItem() != null) {
            cargar_datos1();
            String tit = String.valueOf(jComboForos.getSelectedItem());

            // Obtener el código del foro seleccionado
            Foro CBuscar = new Foro(null, tit, null, null);
            ObjectSet<Foro> result = Base.get(CBuscar);

            if (result != null && result.hasNext()) {
                Foro FMostrar = result.next();
                String codigoForo = FMostrar.getCod_Foro();

                // Llamar a cargarComentariosEnTxtParticipaciones con el código del foro y, opcionalmente, del comentario
                cargarComentariosEnTxtParticipaciones(codigoForo);
            } else {
                System.out.println("No se encontraron resultados para la búsqueda del foro.");
            }
        }
    }//GEN-LAST:event_jComboForosActionPerformed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        Comentario elComent = new Comentario();

    try {
        // Validar campos antes de procesar la acción
        if (txtArea_Comentario.getText().isEmpty()) {
            throw new IllegalArgumentException("Por favor, complete todos los campos.");
        }

        // Procesar la acción
        String codigoIncremental = calcularIDComent(Base);
        elComent.setID_Comentario(codigoIncremental);
        elComent.setContenido_Comen(txtArea_Comentario.getText());

        String tit = String.valueOf(jComboForos.getSelectedItem());
        Foro CBuscar = new Foro(null, tit, null, null);
        ObjectSet<Foro> result = Base.get(CBuscar);

        if (result != null && result.hasNext()) {
            Foro CMostrar = result.next();
            String codigoForo = CMostrar.getCod_Foro();
            elComent.setFK_Cod_Foro(codigoForo);
            elComent.setFecha_Comen(new Date());

            // Obtener el código del participante correctamente
            String codigoParticipante = obtenerCodigoParticipante(usarData);

            // Verificar si se pudo obtener el código del participante
            if (!codigoParticipante.isEmpty()) {
                elComent.setFK_Cod_Participante(codigoParticipante);

                // Obtener el nombre del usuario
                String nombreUsuario = obtenerNombreUsuario(codigoParticipante);
                System.out.println("Nombre del usuario: " + nombreUsuario);
                elComent.setNombre_Usario(nombreUsuario);

                // Almacenar el comentario en la base de datos
                Base.store(elComent);
                javax.swing.JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIDO GUARDADOS EXITOSAMENTE");

                // Obtener todos los comentarios de la base de datos y cargar solo los del foro actual
                String cod_com = elComent.getID_Comentario();
                cargarComentariosEnTxtParticipaciones(codigoForo);
            } else {
                System.out.println("Error al obtener el código del participante.");
            }
        } else {
            System.out.println("No se encontraron resultados para la búsqueda del foro.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        e.printStackTrace();  // Imprimir la traza de la excepción
    } finally {
        System.out.println(elComent);
    }
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void txtParticipacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParticipacionesMousePressed
        txtParticipaciones.setEditable(false);
    }//GEN-LAST:event_txtParticipacionesMousePressed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
        txtDescripcion.setEditable(false);
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void cargarComentariosEnTxtParticipaciones(String codigoForoActual) {
        // Obtener todos los comentarios de la base de datos
        ObjectSet<Comentario> comentarios = Base.query(Comentario.class);

        // Filtrar comentarios solo para el foro y el comentario actual (si es necesario)
        List<Comentario> comentariosForoYComentario = comentarios.stream()
                .filter(comentario -> codigoForoActual.equals(comentario.getFK_Cod_Foro())
                /*&& codigoComentario.equals(comentario.getID_Comentario())*/)
                .sorted(Comparator.comparing(Comentario::getFecha_Comen))
                .collect(Collectors.toList());

        // Limpiar el contenido actual del txtParticipaciones
        txtParticipaciones.setText("");

        // Iterar sobre los comentarios ordenados y agregar solo aquellos del foro y comentario actual al txtParticipaciones
        for (Comentario comentario : comentariosForoYComentario) {
            // Formatear la información del comentario
            String nombreUsuario = obtenerNombreUsuario(comentario.getFK_Cod_Participante());
            String contenidoComentario = comentario.getContenido_Comen();
            String fechaComentario = formatoFecha(comentario.getFecha_Comen());

            // Crear el formato deseado
            String comentarioFormateado = String.format(
                    "Nombre: %s\nContenido del comentario: %s\nFecha del comentario: %s\n\n",
                    nombreUsuario, contenidoComentario, fechaComentario
            );

            // Agregar el comentario formateado al txtParticipaciones
            txtParticipaciones.append(comentarioFormateado);
        }
    }

    private String obtenerNombreUsuario(String codigoParticipante) {

        String nom = "", apell = "";

        // Verificar si el código pertenece a un psicólogo
        Psicologo psico = new Psicologo();
        psico.setCod_Psicologo(codigoParticipante);
        ObjectSet resultPsico = Base.get(psico);

        if (resultPsico.size() != 0) {
            while (resultPsico.hasNext()) {
                Psicologo next = (Psicologo) resultPsico.next();
                String cod = next.getFK_Cedula();

                Persona person = new Persona();
                person.setCedula(cod);
                ObjectSet resultPerson = Base.get(person);

                while (resultPerson.hasNext()) {
                    Persona next1 = (Persona) resultPerson.next();
                    nom = next1.getNombre();
                    apell = next1.getApellido();
                }
            }
        } else {
            // Si no es un psicólogo, puede ser un representante
            Representante rep = new Representante();
            rep.setCod_Repre(codigoParticipante);
            ObjectSet resultRep = Base.get(rep);

            if (resultRep.size() != 0) {
                while (resultRep.hasNext()) {
                    Representante nextRep = (Representante) resultRep.next();
                    String cod = nextRep.getFKCod_Cedula();

                    Persona personRep = new Persona();
                    personRep.setCedula(cod);
                    ObjectSet resultPersonRep = Base.get(personRep);

                    while (resultPersonRep.hasNext()) {
                        Persona next1 = (Persona) resultPersonRep.next();
                        nom = next1.getNombre();
                        apell = next1.getApellido();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró al participante");
            }
        }

        String nombre = nom + " " + apell;
        return nombre;
    }

    private String formatoFecha(Date fecha) {
        if (fecha == null) {
            return "Fecha no disponible";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(fecha);
    }

    private String obtenerCodigoParticipante(Object usarData) {
        try {
            String codigoParticipante = "";
            if (usarData instanceof UserDataSingleton) {
                codigoParticipante = ((UserDataSingleton) usarData).getCod_Psicologo();
            } else if (usarData instanceof UserDataSingleton) {
                codigoParticipante = ((UserDataSingleton) usarData).getCod_Representante();
            }

            // Verificar que se obtiene el código del participante correctamente
            System.out.println("Código del participante: " + codigoParticipante);

            return codigoParticipante;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el código del participante: " + e.getMessage());
            e.printStackTrace();
            return "";
        }
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
            java.util.logging.Logger.getLogger(PagForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagForoPsicologo().setVisible(true);
            }
        });
    }

    public static String calcularIDComent(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("COM-%04d", incremental);

            if (VerificarComent(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }

    public static int VerificarComent(ObjectContainer Base, String Codigo) {
        Comentario elComent = new Comentario();
        elComent.setID_Comentario(Codigo);
        ObjectSet result = Base.get(elComent);
        return result.size();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JComboBox<String> jComboForos;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtArea_Comentario;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtParticipaciones;
    // End of variables declaration//GEN-END:variables

    public void cargar_combo1(JComboBox jComboForos) {

        Foro FBuscar = new Foro(null, null, null, null);
        ObjectSet resul = Base.get(FBuscar);
        while (resul.hasNext()) {
            Foro Dcombo = (Foro) resul.next();
            jComboForos.addItem(Dcombo.getTitulo_Foro());
        }
        Base.commit();
    }

    public void cargar_datos1() {
        String tit = String.valueOf(jComboForos.getSelectedItem());

        Foro CBuscar = new Foro(null, tit, null, null);
        ObjectSet resul = Base.get(CBuscar);
        Foro CMostrar = (Foro) resul.next();
        lblTitulo.setText(CMostrar.getTitulo_Foro());
        txtDescripcion.setText(CMostrar.getDescripcion());

        Base.commit();
    }

}
