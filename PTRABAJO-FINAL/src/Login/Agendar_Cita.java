/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Especializacion;
import Clases.Nacionalidad;
import Clases.Persona;
import Clases.Psicologo;
import Clases.Solicitud_Cita;
import Clases.UserDataSingleton;
import Clases.solicitud;
import com.db4o.*;
import com.db4o.ObjectContainer;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Agendar_Cita extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;
    
    public Agendar_Cita() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargarComboPsicologos();
        usarData = UserDataSingleton.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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

        jComboPsicologos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboPsicologos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPsicologosActionPerformed(evt);
            }
        });
        jPanel1.add(jComboPsicologos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 520, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 520, 230));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGeneralReportes.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -30, 1690, 520));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Con cual de nuestros siguientes especialistas deseas solicitar tu cita:<html>");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 520, 40));

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

        private void cargarComboPsicologos() {
        List<Psicologo> listaPsicologos = obtenerListaPsicologos();

        for (Psicologo psicologo : listaPsicologos) {
            jComboPsicologos.addItem(obtenerNombrePsicologo(psicologo));
        }

    }

    private List<Psicologo> obtenerListaPsicologos() {
        List<Psicologo> listaPsicologos = new ArrayList<>();

        try {
            ObjectSet<Psicologo> result = Base.get(Psicologo.class);

            while (result.hasNext()) {
                Psicologo psicologo = result.next();
                listaPsicologos.add(psicologo);
            }
        } finally {
            // Cierra la base de datos

        }

        return listaPsicologos;
    }

    private String obtenerNombrePsicologo(Psicologo psicologo) {
        String cedulaPsicologo = psicologo.getFK_Cedula();

        ObjectSet<Persona> personas = Base.queryByExample(new Persona(cedulaPsicologo, null, null, null, null, '\0', null, null, null, null, null, null, true));

        if (personas.hasNext()) {
            Persona personaEncontrada = personas.next();
            return personaEncontrada.getNombre().toString();
        } else {
            return "";
        }
    }

    private void mostrarDatosPsicologo(String nombrePsicologo) {
        try {
            // Busca el psicólogo por nombre
            ObjectSet<Psicologo> result = Base.queryByExample(new Psicologo(null, null, null, 0, null));

            boolean encontrado = false;

            while (result.hasNext()) {
                Psicologo psicologo = result.next();
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
            // Crea un JDateChooser para permitir al usuario seleccionar la fecha y hora deseada para la cita
            JDateChooser dateChooser = new JDateChooser();

            // Establece el límite máximo como la fecha actual
            dateChooser.setMinSelectableDate(new Date());

            int option = JOptionPane.showConfirmDialog(this, dateChooser, "Seleccione la fecha y hora de la cita", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION) {
                // Obtiene la fecha y hora seleccionada
                Date fechaHoraCita = dateChooser.getDate();

                // Verifica que se haya seleccionado una fecha y hora válidas
                if (fechaHoraCita != null && fechaHoraCita.after(new Date())) {
                    // Crea una nueva instancia de Solicitud_Cita
                    Solicitud_Cita nuevaSolicitud = new Solicitud_Cita();
                    String Cod_Sol = Calcular_ID_Respuesta(Base);
                    nuevaSolicitud.setCod_solicitud(Cod_Sol);
                    String Cod_Repre = usarData.getCod_Representante();
                    nuevaSolicitud.setFKcod_representante(Cod_Repre);

                    String codNiñoVinculado = obtenerCodigoNiñoPorRepresentante(Cod_Repre);

                    if (codNiñoVinculado != null) {
                        // Hay una solicitud vinculada, puedes usar el código del niño
                        nuevaSolicitud.setFKcod_niño(codNiñoVinculado);
                    } else {
                        JOptionPane.showMessageDialog(this, "No tiene un niño vinculado a su cuenta");
                    }

                    nuevaSolicitud.setEstado_solicitud1(false);
                    nuevaSolicitud.setFecha_soli(new Date());
                    nuevaSolicitud.setFKcod_psicologo(psicologo.getCod_Psicologo());

                    // Guarda la nueva solicitud en la base de datos
                    Base.store(nuevaSolicitud);

                    // Muestra un mensaje de confirmación
                    JOptionPane.showMessageDialog(this, "Cita solicitada con éxito. Se ha enviado una solicitud a " + obtenerNombrePsicologo(psicologo), "Cita solicitada", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(nuevaSolicitud);
                } else {
                    // El usuario canceló la selección de fecha y hora o seleccionó una fecha pasada
                    JOptionPane.showMessageDialog(this, "Solicitud de cita cancelada o fecha no válida. Seleccione una fecha futura.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } finally {

        }
    }

    private String obtenerCodigoNiñoPorRepresentante(String codRepresentante) {
        ObjectSet<solicitud> solicitudes = Base.queryByExample(new solicitud(null, codRepresentante, null, null, null, null));

        while (solicitudes.hasNext()) {
            solicitud soli = solicitudes.next();
            return soli.getFKcod_niño();
        }
        return null;
    }

    private Persona buscarPersonaPorCedula(String cedula) {
        ObjectSet<Persona> personas = Base.queryByExample(new Persona(cedula, null, null, null, null, '\0', null, null, null, null, null, null, true));

        while (personas.hasNext()) {
            Persona persona = personas.next();
            if (persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }

    private Nacionalidad buscarNacionalidadPorCodigo(String codigo) {
        ObjectSet<Nacionalidad> nacionalidades = Base.queryByExample(new Nacionalidad(codigo, null, null, null));

        while (nacionalidades.hasNext()) {
            return nacionalidades.next();
        }
        return null;
    }

    private Especializacion BuscarEspecializacionporCodigo(String codigo) {
        ObjectSet<Especializacion> especializaciones = Base.queryByExample(new Especializacion(codigo, null, null));

        while (especializaciones.hasNext()) {
            return especializaciones.next();
        }

        // Si no hay coincidencias, devuelve null
        return null;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
public static String Calcular_ID_Respuesta(ObjectContainer Base) {
        try {
            // Obtener el último ID almacenado
            Solicitud_Cita ejemploConsulta = new Solicitud_Cita();
            ObjectSet<Solicitud_Cita> resultados = Base.queryByExample(ejemploConsulta);
            String ultimoID = "SOL-0000";

            while (resultados.hasNext()) {
                Solicitud_Cita respuesta = resultados.next();
                String actualID = respuesta.getCod_solicitud();

                if (actualID != null && actualID.startsWith("SOL-")) {
                    try {
                        // Intentar convertir la parte numérica a un entero
                        int numero = Integer.parseInt(actualID.substring(5));
                        // Incrementar el último ID encontrado
                        if (numero > Integer.parseInt(ultimoID.substring(5))) {
                            ultimoID = actualID;
                        }
                    } catch (NumberFormatException e) {
                        // Manejar la excepción si la parte numérica no es válida
                        e.printStackTrace();
                    }
                }
            }

            // Incrementar el último ID encontrado
            int numero = Integer.parseInt(ultimoID.substring(5)) + 1;
            String nuevoID = "SOL-" + String.format("%04d", numero);

            return nuevoID;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al calcular el ID de respuesta: " + e.getMessage());
            return null;
        }
    }
}
