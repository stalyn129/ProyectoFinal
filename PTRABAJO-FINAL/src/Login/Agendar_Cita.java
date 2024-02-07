/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Especializacion;
import Clases.Nacionalidad;
import Clases.Niño;
import Clases.Persona;
import Clases.Psicologo;
import Clases.Solicitud_Cita;
import Clases.UserDataSingleton;
import Clases.solicitud;
import com.db4o.*;
import com.db4o.ObjectContainer;
import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Agendar_Cita extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;

    public Agendar_Cita() {
        initComponents();
        ocColumna();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargarComboPsicologos();
        usarData = UserDataSingleton.getInstance();
        Mostrar_tabla_aceptados(Base);
        mostrar_solicitudes_psic(Base);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_descrip = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        nin_tabla = new javax.swing.JTable();
        jComboPsicologos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fondo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel2.setText("Solicitar cita");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escojer al niño que desea agendar la cita:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 460, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 240, -1));

        txt_descrip.setColumns(20);
        txt_descrip.setRows(5);
        jScrollPane3.setViewportView(txt_descrip);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 240, 140));

        nin_tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nin_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Nombre", "apellido", "Genero"
            }
        ));
        nin_tabla.setRowHeight(23);
        nin_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nin_tablaMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(nin_tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 460, 130));

        jComboPsicologos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboPsicologos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPsicologosActionPerformed(evt);
            }
        });
        jPanel1.add(jComboPsicologos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 460, 20));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Psicologo", "Niño", "Fecha", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 460, 120));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGeneralReportes.png"))); // NOI18N
        Fondo1.setText(",mnmlmkmñlm,{,");
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -30, 1690, 520));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Con cual de nuestros siguientes especialistas deseas solicitar tu cita:<html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 520, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosNiño.setToolTipText("Configuración");

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMnItmCerrarNiño.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarNiñoMousePressed(evt);
            }
        });
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuCuentosNiño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.setToolTipText("Resgresa a la página principal");
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuCuentosNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuCuentosNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMnItmCerrarNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarNiñoMousePressed
        Base.close();
        InicioRepresentante loginrepre = new InicioRepresentante();
        loginrepre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarNiñoMousePressed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        Base.close();
        PagPrincipalRepresentante principalrepresetante = new PagPrincipalRepresentante();
        principalrepresetante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

    private void jComboPsicologosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPsicologosActionPerformed
        // Obtén el nombre del psicólogo seleccionado
        String nombrePsicologo = (String) jComboPsicologos.getSelectedItem();

        // Carga los datos del psicólogo en los JTextField
        mostrarDatosPsicologo(nombrePsicologo);
    }//GEN-LAST:event_jComboPsicologosActionPerformed
    String cod_soli_niño = "";
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       
    }//GEN-LAST:event_jTable1MousePressed

    private void nin_tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nin_tablaMousePressed
         int selecionTable = nin_tabla.getSelectedRow();

        cod_soli_niño = String.valueOf(nin_tabla.getValueAt(selecionTable, 0));


    }//GEN-LAST:event_nin_tablaMousePressed

    private void cargarComboPsicologos() {
        List<Psicologo> listaPsicologos = obtenerListaPsicologos();

        for (Psicologo psicologo : listaPsicologos) {
            jComboPsicologos.addItem(obtenerNombrePsicologo(psicologo));
        }

    }

    private List<Psicologo> obtenerListaPsicologos() {
        List<Psicologo> listaPsicologos = new ArrayList<>();

        try {
            ObjectSet result = Base.get(Psicologo.class);

            while (result.hasNext()) {
                Psicologo psicologo = (Psicologo) result.next();
                listaPsicologos.add(psicologo);
            }
        } finally {
            // Cierra la base de datos

        }

        return listaPsicologos;
    }

     private void ocColumna() {

        // Obtén el TableColumnModel de la tabla
        TableColumnModel columnModel = nin_tabla.getColumnModel();

        // Obtiene la columna en función del índice proporcionado
        TableColumn columna = columnModel.getColumn(0);

        // Hace que la columna no sea visible
        columna.setMinWidth(0);
        columna.setMaxWidth(0);
        columna.setWidth(0);
        columna.setPreferredWidth(0);
    }
    private String obtenerNombrePsicologo(Psicologo psicologo) {
        String cedulaPsicologo = psicologo.getFK_Cedula();

        ObjectSet personas = Base.queryByExample(new Persona(cedulaPsicologo, null, null, null, null, '\0', null, null, null, null, null, null, true));

        if (personas.hasNext()) {
            Persona personaEncontrada = (Persona) personas.next();
            return personaEncontrada.getNombre().toString();
        } else {
            return "";
        }
    }

    private void mostrarDatosPsicologo(String nombrePsicologo) {
        try {
            // Busca el psicólogo por nombre
            ObjectSet result = Base.queryByExample(new Psicologo());

            boolean encontrado = false;

            while (result.hasNext()) {
                Psicologo psicologo = (Psicologo) result.next();
                String nombreCompleto = obtenerNombrePsicologo(psicologo);

                if (nombreCompleto.equals(nombrePsicologo)) {
                    // Busca la Persona asociada al Psicologo
                    Persona personaEncontrada = buscarPersonaPorCedula(psicologo.getFK_Cedula());

                    if (personaEncontrada != null) {
                        // Busca la Nacionalidad asociada a la Persona
                        Nacionalidad naci = buscarNacionalidadPorCodigo(personaEncontrada.getCod_Nacionalidad());
                        Especializacion especi = BuscarEspecializacionporCodigo(personaEncontrada.getCod_Especialidad());

                        // Construye el mensaje con los datos de la Persona y la Nacionalidad
                        if (naci != null && especi != null) {
                            String mensaje = "Nombre y Apellido: " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellido() + "\n"
                                    + "Años de Experiencia: " + psicologo.getAños_Experiencia() + "\n"
                                    + "Especialidad: " + especi.getEspecializacion() + "\n"
                                    + "Sexo: " + personaEncontrada.getSexo() + "\n"
                                    + "Nacionalidad: " + naci.getNacionalidad() + "\n"
                                    + "Teléfono: " + personaEncontrada.getTelefono();

                            // Muestra un cuadro de diálogo con opciones
                            int opcion = JOptionPane.showOptionDialog(this, mensaje, "Datos del Psicólogo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Solicitar Cita", "Cancelar"}, "Solicitar Cita");

                            // Realiza la acción correspondiente según la opción seleccionada
                            if (opcion == JOptionPane.YES_OPTION) {
                                // Lógica para solicitar la cita
                                solicitarCita(psicologo);
                            } else {
                                // Lógica para cancelar
                                // (puedes dejarlo vacío o agregar un mensaje de cancelación)
                            }

                            encontrado = true;
                        } else {
                            JOptionPane.showMessageDialog(this, "Error: No se encontró la información de la nacionalidad o especialización asociada a la persona.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: No se encontró la información de la persona asociada al psicólogo.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

            // Si no se encontró ninguna coincidencia
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Error: No se encontró un psicólogo con el nombre proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } finally {
            // Cierra la base de datos
        }
    }

    private void solicitarCita(Psicologo psicologo) {
        try {
            // Crea un JDateChooser para permitir al usuario seleccionar la fecha deseada para la cita
            JDateChooser dateChooser = new JDateChooser();

            // Establece el límite máximo como la fecha actual
            dateChooser.setMinSelectableDate(new Date());

            // Crea un Spinner para seleccionar la hora
            SpinnerDateModel spinnerModel = new SpinnerDateModel();
            spinnerModel.setCalendarField(Calendar.MINUTE);
            JSpinner timeSpinner = new JSpinner(spinnerModel);
            JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "HH:mm");
            timeSpinner.setEditor(timeEditor);

            // Crea un panel para mostrar tanto el JDateChooser como el JSpinner
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(dateChooser);
            panel.add(new JLabel("Seleccione la hora de la cita:"));
            panel.add(timeSpinner);

            int option = JOptionPane.showConfirmDialog(this, panel, "Seleccione la fecha y hora de la cita", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                // Obtiene la fecha seleccionada
                Date fechaCita = new Date();
                fechaCita = dateChooser.getDate();

                // Obtiene la hora seleccionada
                Date horaCita = (Date) timeSpinner.getValue();

                // Combina la fecha y la hora seleccionadas en una sola fecha
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fechaCita);
                Calendar timeCalendar = Calendar.getInstance();
                timeCalendar.setTime(horaCita);
                calendar.set(Calendar.HOUR_OF_DAY, timeCalendar.get(Calendar.HOUR_OF_DAY));
                calendar.set(Calendar.MINUTE, timeCalendar.get(Calendar.MINUTE));

                Date fechaHoraCita = calendar.getTime();

                // Verifica que se haya seleccionado una fecha y hora válidas dentro del horario de atención y que no haya una cita programada en el mismo horario
                if (fechaHoraCita.after(new Date())) {
                    boolean citaExistente = verificarCitaExistente(fechaHoraCita);

                    if (!citaExistente) {
                        // Obtiene la hora seleccionada
                        int horaSeleccionada = timeCalendar.get(Calendar.HOUR_OF_DAY);

                        // Verifica si la hora seleccionada está dentro del horario de atención
                        if ((horaSeleccionada >= 7 && horaSeleccionada < 12) || (horaSeleccionada >= 13 && horaSeleccionada < 18)) {
                            // Resto del código...
                            // Crea una nueva instancia de Solicitud_Cita
                            if (!txt_descrip.getText().isEmpty()) {

                                if (!cod_soli_niño.isEmpty()) {
                                    Solicitud_Cita nuevaSolicitud = new Solicitud_Cita();
                                    String Cod_Sol = Calcular_ID_Respuesta(Base);
                                    nuevaSolicitud.setCod_solicitud(Cod_Sol);
                                    String Cod_Repre = usarData.getCod_Representante();
                                    nuevaSolicitud.setFKcod_representante(Cod_Repre);
                                    nuevaSolicitud.setFKcod_soli_nin(cod_soli_niño);

//                        String codNiñoVinculado = obtenerCodigoNiñoPorRepresentante(Cod_Repre);
//
//                        if (codNiñoVinculado != null) {
//                            // Hay una solicitud vinculada, puedes usar el código del niño
//                            nuevaSolicitud.setFKcod_niño(codNiñoVinculado);
//                        } else {
//                            JOptionPane.showMessageDialog(this, "No tiene un niño vinculado a su cuenta");
//                        }
                                    nuevaSolicitud.setEstado_solicitud1("PENDIENTE");
                                    nuevaSolicitud.setFecha_soli(fechaHoraCita);
                                    nuevaSolicitud.setFKcod_psicologo(psicologo.getCod_Psicologo());
                                    nuevaSolicitud.setDescrip(txt_descrip.getText());

                                    // Guarda la nueva solicitud en la base de datos
                                    Base.store(nuevaSolicitud);

                                    // Muestra un mensaje de confirmación
                                    JOptionPane.showMessageDialog(this, "Cita solicitada con éxito. Se ha enviado una solicitud a " + obtenerNombrePsicologo(psicologo), "Cita solicitada", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println(nuevaSolicitud);
                                    mostrar_solicitudes_psic(Base);

                                } else {
                                    JOptionPane.showMessageDialog(this, "Seleccina al niño que desea agendar la cita", "Error", JOptionPane.ERROR_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "Ingrese una descripcion de la cita", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "La hora seleccionada no está dentro del horario de atención (7:00 AM a 12:00 PM y de 1:00 PM a 6:00 PM).", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Ya hay una cita programada en este horario. Por favor, seleccione otro horario.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Solicitud de cita cancelada o fecha no válida. Seleccione una fecha futura.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /////////////////////
    public void Mostrar_tabla_aceptados(ObjectContainer Base) {

        String nombre = "", apellido = "", coddisca = "";

        char sex = 'a';

        solicitud soli = new solicitud();
        soli.setFKcod_representante(usarData.getCod_Representante());
        soli.setEstado_solicitud1("Aceptada");

        DefaultTableModel modelo = (DefaultTableModel) nin_tabla.getModel();
        modelo.setRowCount(0);

        ObjectSet result = Base.get(soli);
        if (result.size() != 0) {

            while (result.hasNext()) {
                solicitud next = (solicitud) result.next();

                String cod_Niño = next.getFKcod_niño();

                Niño nin = new Niño();
                nin.setCod_Niño(cod_Niño);
                ObjectSet rest = Base.get(nin);

                while (rest.hasNext()) {
                    Niño next1 = (Niño) rest.next();

                    nombre = next1.getNombre();
                    apellido = next1.getApellido();
                    sex = next1.getSexo_Niño();

                }

                modelo.addRow(new Object[]{
                    next.getCod_solicitud(),
                    nombre,
                    apellido,
                    sex

                });

            }

        } else {
        }

    }

    ////////////////////
    private String obtenerCodigoNiñoPorRepresentante(String codRepresentante) {
        ObjectSet solicitudes = Base.queryByExample(new solicitud(null, codRepresentante, null, null, null, null));

        while (solicitudes.hasNext()) {
            solicitud soli = (solicitud) solicitudes.next();
            return soli.getFKcod_niño();
        }
        return null;
    }

    private Persona buscarPersonaPorCedula(String cedula) {
        ObjectSet personas = Base.queryByExample(new Persona(cedula, null, null, null, null, '\0', null, null, null, null, null, null, true));

        while (personas.hasNext()) {
            Persona persona = (Persona) personas.next();
            if (persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }

    private Nacionalidad buscarNacionalidadPorCodigo(String codigo) {
        ObjectSet nacionalidades = Base.queryByExample(new Nacionalidad(codigo, null, null, null));

        while (nacionalidades.hasNext()) {
            return (Nacionalidad) nacionalidades.next();
        }
        return null;
    }

    private Especializacion BuscarEspecializacionporCodigo(String codigo) {
        ObjectSet especializaciones = Base.queryByExample(new Especializacion(codigo, null, null));

        while (especializaciones.hasNext()) {
            return (Especializacion) especializaciones.next();
        }

        // Si no hay coincidencias, devuelve null
        return null;
    }

    private boolean verificarCitaExistente(Date fechaHoraCita) {
        Solicitud_Cita soli = new Solicitud_Cita();
        soli.setFecha_soli(fechaHoraCita);
        ObjectSet citas = Base.queryByExample(soli);

        while (citas.hasNext()) {
            Solicitud_Cita cita = (Solicitud_Cita) citas.next();
            // Si encuentra una cita en el mismo horario, retorna true
            if (cita.getFecha_soli().equals(fechaHoraCita)) {
                return true;
            }
        }
        // Si no encuentra ninguna cita en el mismo horario, retorna false
        return false;
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
            java.util.logging.Logger.getLogger(Agendar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendar_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JComboBox<String> jComboPsicologos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTable nin_tabla;
    private javax.swing.JTextArea txt_descrip;
    // End of variables declaration//GEN-END:variables
public static String Calcular_ID_Respuesta(ObjectContainer Base) {
    try {
        // Obtener el último ID almacenado
        Solicitud_Cita ejemploConsulta = new Solicitud_Cita();
        ObjectSet resultados = Base.queryByExample(ejemploConsulta);
        String ultimoID = "SOL-0000";

        while (resultados.hasNext()) {
            Solicitud_Cita respuesta = (Solicitud_Cita) resultados.next();
            String actualID = respuesta.getCod_solicitud();

            if (actualID != null && actualID.startsWith("SOL-")) {
                try {
                    // Intentar convertir la parte numérica a un entero
                    int numero = Integer.parseInt(actualID.substring(4));
                    // Incrementar el último ID encontrado solo si el número actual es mayor
                    if (numero >= Integer.parseInt(ultimoID.substring(4))) {
                        // Incrementa el número en uno
                        int nuevoNumero = numero + 1;
                        // Formatea el nuevo ID
                        ultimoID = "SOL-" + String.format("%04d", nuevoNumero);
                    }
                } catch (NumberFormatException e) {
                    // Manejar la excepción si la parte numérica no es válida
                    e.printStackTrace();
                }
            }
        }

        return ultimoID;
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Excepción al calcular el ID de respuesta: " + e.getMessage());
        return null;
    }
}
////////////////////////////

    public void mostrar_solicitudes_psic(ObjectContainer Base) {
        String nomNiño="";
        Solicitud_Cita sili = new Solicitud_Cita();
        sili.setFKcod_representante(usarData.getCod_Representante());
        sili.setEstado_solicitud1("PENDIENTE");
        ObjectSet result = Base.get(sili);
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        if (result.size() != 0) {

            while (result.hasNext()) {
                Solicitud_Cita next = (Solicitud_Cita) result.next();
                String cod_soli=next.getFKcod_soli_nin();
                
                solicitud sol=new solicitud();
                sol.setCod_solicitud(cod_soli);
                ObjectSet res=Base.get(sol);
                while (res.hasNext()) {
                    solicitud nex =(solicitud) res.next();
                    
                    Niño nin=new Niño();
                    nin.setCod_Niño(nex.getFKcod_niño());
                    ObjectSet rt=Base.get(nin);
                    
                    while (rt.hasNext()) {
                        Niño ne =(Niño) rt.next();
                        nomNiño=ne.getNombre()+" "+ne.getApellido();
                    }
                    
                }
                
                
                modelo.addRow(new Object[]{
                    Mostrar_nombre_psicologo(Base, next.getFKcod_psicologo()),
                    nomNiño,
                    formatoFecha(next.getFecha_soli()),
                    next.getEstado_solicitud1()

                });

            }

        }

    }
    private String formatoFecha(Date fecha) {
        if (fecha == null) {
            return "Fecha no disponible";
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(fecha);
    }
    public String Mostrar_nombre_psicologo(ObjectContainer Base, String cod) {
        String nombres = "";
        Psicologo nin = new Psicologo();
        nin.setCod_Psicologo(cod);

        ObjectSet result = Base.get(nin);
        if (result.size() != 0) {
            while (result.hasNext()) {
                Psicologo next = (Psicologo) result.next();

                Persona person = new Persona();
                person.setCedula(next.getFK_Cedula());
                ObjectSet resu = Base.get(person);
                while (resu.hasNext()) {
                    Persona next1 = (Persona) resu.next();

                    nombres = next1.getNombre() + " " + next1.getApellido();

                }
            }

        } else {
            System.out.println("No se encontro al Psicologo");
        }
        return nombres;
    }

/////////////////////////
}
