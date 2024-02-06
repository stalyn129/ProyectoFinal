/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Persona;
import Clases.Render;
import Clases.Solicitud_Cita;
import Clases.UserDataSingleton;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class Citas extends javax.swing.JFrame {

    UserDataSingleton usarData;
    ObjectContainer Base;
    String codSoli = "";

    public Citas() {
        initComponents();
        usarData = UserDataSingleton.getInstance();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        mostrarCitasAceptadas(Base);
        mostrarCitasPendientes(Base);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnRegresar5 = new javax.swing.JButton();
        LblTestPariente1 = new javax.swing.JLabel();
        LblTestPariente2 = new javax.swing.JLabel();
        pnl_soli = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Citas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAceptados = new javax.swing.JTable();
        Fondo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegresar5.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar5.setToolTipText("Regresa al iniciar sesión");
        BtnRegresar5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar5.setOpaque(false);
        BtnRegresar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresar5ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 50, 40));

        LblTestPariente1.setFont(new java.awt.Font("Rockwell Nova", 1, 20)); // NOI18N
        LblTestPariente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente1.setText("BIENVENIDO AL AREA DE:");
        jPanel1.add(LblTestPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 300, 20));

        LblTestPariente2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente2.setText("CITAS");
        jPanel1.add(LblTestPariente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 210, 30));

        pnl_soli.setBackground(new java.awt.Color(255, 255, 255));
        pnl_soli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Citas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tbl_Citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod_Cita", "Representante", "Fecha Solicitada", "ACEPTAR", "RECHAZAR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_CitasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Citas);

        pnl_soli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 560, 130));

        jLabel3.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel3.setText("Citas aceptadas:");
        pnl_soli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel4.setText("Solicitudes de citas disponibles:");
        pnl_soli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTableAceptados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod_Cita", "Representante", "Fecha_Solicitada", "Diagnostico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAceptados);

        pnl_soli.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 560, 90));

        jPanel1.add(pnl_soli, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 670, 320));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGeneralReportes.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -10, 1690, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void tbl_CitasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CitasMousePressed
        int column = tbl_Citas.getColumnModel().getColumnIndexAtX(evt.getX());
    int row = evt.getY() / tbl_Citas.getRowHeight();

    if (row < tbl_Citas.getRowCount() && row >= 0 && column < tbl_Citas.getColumnCount() && column >= 0) {
        Object value = tbl_Citas.getValueAt(row, column);
        if (value instanceof JButton) {
            JButton boton = (JButton) value;
            String textoBoton = boton.getText(); // Obtener el texto del botón

            if (textoBoton.equals("ACEPTAR")) {
                System.out.println("Click en el botón ACEPTAR");
                // Obtener el estado de la solicitud
                String estado = (String) tbl_Citas.getValueAt(row, tbl_Citas.getColumnCount() - 1);
                if (estado != null && estado.equals("PENDIENTE")) { // Verificar estado no nulo y si es "PENDIENTE"
                    estado_aceptado(Base, codSoli);
                    mostrarCitasPendientes(Base); // Llama al método para actualizar la tabla con las citas pendientes
                }
            }

            if (textoBoton.equals("RECHAZAR")) {
                System.out.println("Click en el botón RECHAZAR");
                // Obtener el estado de la solicitud
                String estado = (String) tbl_Citas.getValueAt(row, tbl_Citas.getColumnCount() - 1);
                if (estado != null && estado.equals("PENDIENTE")) { // Verificar estado no nulo y si es "PENDIENTE"
                    estado_Rechazado(Base, codSoli);
                    mostrarCitasPendientes(Base); // Llama al método para actualizar la tabla con las citas pendientes
                }
            }
        }
    }
    }//GEN-LAST:event_tbl_CitasMousePressed

    private void BtnRegresar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar5ActionPerformed
        Base.close();
        PagPrincipalPsicologo prin = new PagPrincipalPsicologo();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar5ActionPerformed

    public void estado_aceptado(ObjectContainer Base, String codSoli) {
        if (!codSoli.isEmpty()) {
            Solicitud_Cita soli = new Solicitud_Cita();
            soli.setCod_solicitud(codSoli);

            ObjectSet result = Base.get(soli);

            while (result.hasNext()) {
                Solicitud_Cita next = (Solicitud_Cita) result.next();
                System.out.println("Cambia Acep: " + next.getCod_solicitud());
                next.setEstado_solicitud1("ACEPTADO");

                Base.store(next);
                Base.commit();

                JOptionPane.showMessageDialog(this, "Se ACEPTO la solicitud");

            }

        } else {

            System.out.println("Esta vacio el cod");
        }

    }

    public void estado_Rechazado(ObjectContainer Base, String codSoli) {
        if (!codSoli.isEmpty()) {
            Solicitud_Cita soli = new Solicitud_Cita();
            soli.setCod_solicitud(codSoli);

            ObjectSet result = Base.get(soli);

            while (result.hasNext()) {
                Solicitud_Cita next = (Solicitud_Cita) result.next();
                System.out.println("Cambia Rechaz: " + next.getCod_solicitud());
                next.setEstado_solicitud1("RECHAZADO");

                Base.store(next);
                Base.commit();

                JOptionPane.showMessageDialog(this, "RECHAZO la solicitud");

            }

        } else {

            System.out.println("Esta vacio el cod");
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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar5;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel LblTestPariente1;
    private javax.swing.JLabel LblTestPariente2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAceptados;
    private javax.swing.JPanel pnl_soli;
    private javax.swing.JTable tbl_Citas;
    // End of variables declaration//GEN-END:variables
    public void mostrarCitasPendientes(ObjectContainer base) {
    // Configurar el renderizador de la tabla
    tbl_Citas.setDefaultRenderer(Object.class, new Render());

    // Crear el modelo para la tabla de citas pendientes
    DefaultTableModel modeloPendientes = (DefaultTableModel) tbl_Citas.getModel();
    modeloPendientes.setRowCount(0);
    tbl_Citas.setRowHeight(30);

    // Consultar todas las citas pendientes del psicólogo
    Solicitud_Cita soli = new Solicitud_Cita();
    soli.setFKcod_psicologo(usarData.getCod_Psicologo());
    ObjectSet result = base.get(soli);

    // Llenar la tabla de citas pendientes
    while (result.hasNext()) {
        Solicitud_Cita next = (Solicitud_Cita) result.next();
        String estado = next.getEstado_solicitud1();
        String nombrePsicologo = buscarNombrePsicologoPorCodigo(next.getFKcod_psicologo(), base);

        if (estado != null && !estado.equals("ACEPTADO")) { // Asegurar que estado no sea null antes de comparar
            JButton boton_1 = new JButton("ACEPTAR");
            boton_1.setName("btn_Acept");
            boton_1.setBackground(new Color(93, 255, 97));
            boton_1.addActionListener(e -> {
                // Implementa la lógica para aceptar la solicitud
                estado_aceptado(base, next.getCod_solicitud());
                mostrarCitasPendientes(base); // Actualizar la tabla después de aceptar
            });

            JButton boton_2 = new JButton("RECHAZAR");
            boton_2.setName("btn_rechaz");
            boton_2.setBackground(new Color(255, 12, 1));
            boton_2.addActionListener(e -> {
                // Implementa la lógica para rechazar la solicitud
                estado_Rechazado(base, next.getCod_solicitud());
                mostrarCitasPendientes(base); // Actualizar la tabla después de rechazar
            });

            modeloPendientes.addRow(new Object[]{
                next.getCod_solicitud(),
                nombrePsicologo, // Mostrar el nombre del psicólogo en lugar de su código
                next.getFecha_soli(),
                boton_1,
                boton_2
            });
        }
    }
}

// Método para mostrar las citas aceptadas en la tabla jTableAceptados
public void mostrarCitasAceptadas(ObjectContainer base) {
    // Configurar el renderizador de la tabla
    jTableAceptados.setDefaultRenderer(Object.class, new Render());

    // Crear el modelo para la tabla de citas aceptadas
    DefaultTableModel modeloAceptados = (DefaultTableModel) jTableAceptados.getModel();
    modeloAceptados.setRowCount(0);
    jTableAceptados.setRowHeight(30);

    // Consultar todas las citas aceptadas del psicólogo
    Solicitud_Cita soli = new Solicitud_Cita();
    soli.setFKcod_psicologo(usarData.getCod_Psicologo());
    ObjectSet result = base.get(soli);

    // Llenar la tabla de citas aceptadas
    while (result.hasNext()) {
        Solicitud_Cita next = (Solicitud_Cita) result.next();
        String estado = next.getEstado_solicitud1();
        String nombrePsicologo = buscarNombrePsicologoPorCodigo(next.getFKcod_psicologo(), base);

        if (estado != null && estado.equals("ACEPTADO")) { // Asegurar que estado no sea null antes de comparar
            modeloAceptados.addRow(new Object[]{
                next.getCod_solicitud(),
                nombrePsicologo, // Mostrar el nombre del psicólogo en lugar de su código
                next.getFecha_soli(), // Agrega más columnas si es necesario
            });
        }
    }
}
    private String buscarNombrePsicologoPorCodigo(String codigoPsicologo, ObjectContainer base) {
        // Buscar la persona asociada al psicólogo por su código único
        Persona persona = new Persona();
        persona.setCedula(codigoPsicologo); // Suponiendo que el código único del psicólogo sea su cédula

        ObjectSet<Persona> result = base.queryByExample(persona);

        // Verificar si se encontró la persona asociada al psicólogo
        if (result.hasNext()) {
            Persona psicologo = result.next();
            // Devolver el nombre del psicólogo
            return psicologo.getNombre();
        } else {
            // Si no se encuentra la persona asociada al psicólogo, devuelve null o un mensaje de error según lo desees
            return null;
        }
    }
}
