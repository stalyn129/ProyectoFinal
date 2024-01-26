/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.ValoracionConseNiño;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.Db4oIOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joel
 */
public class ReporteConsejos extends javax.swing.JFrame {

    ObjectContainer Base;
    
    public ReporteConsejos() {
        initComponents();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsejos = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableConsejos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Consejo", "Cod_Niño", "Cod_Consejo", "Valoracion", "Fecha Valoracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableConsejos);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActualizar)
                        .addGap(105, 105, 105)
                        .addComponent(btnConsultar)
                        .addGap(122, 122, 122)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnConsultar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reporte Consejos", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 610, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 800, 490));

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

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed

        //Base.close();
        InicioNiño login = new InicioNiño();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void JMnPgPrinNiño2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiño2MouseClicked
        //Base.close();
        PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
        principalniño.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiño2MouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String[] opciones = {"Código", "Código Niño", "Código Consejo"};
        int seleccion = JOptionPane.showOptionDialog(this, "Seleccione el método de búsqueda:", "Método de Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion != -1) {
            String consulta = "";

            if (seleccion == 0) {
                // Búsqueda por código
                consulta = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");
            } else if (seleccion == 1) {
                // Búsqueda por código niño
                consulta = JOptionPane.showInputDialog(this, "Ingrese el código niño a consultar");
            } else if (seleccion == 2) {
                // Búsqueda por código miniJuego
                consulta = JOptionPane.showInputDialog(this, "Ingrese el código miniJuego a consultar");
            }

            if (consulta != null && !consulta.isEmpty()) {
                ConsultarRegistro(Base, consulta, seleccion);
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un valor válido para la consulta.");
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarActionPerformed

    
     
    //Metodos del juego diferencias
    private void ConsultarRegistro(ObjectContainer Base, String consulta, int tipoConsulta) {
     // Creando un objeto de ejemplo para la consulta
        ValoracionConseNiño ejemploConsulta = new ValoracionConseNiño(null, null, null, null, null);

    // Consultando la base de datos
    ObjectSet result;

    try {
        // Verificar el tipo de consulta para decidir qué campo usar
        if (tipoConsulta == 0) {
            // Búsqueda por código
            ejemploConsulta.setCod_Respuesta_usuario(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 1) {
            // Búsqueda por código niño
            ejemploConsulta.setFk_cod_niño(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 2) {
            // Búsqueda por código miniJuego
            ejemploConsulta.setFk_Cod_Consejo(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else {
            // Tipo de consulta no válido
            JOptionPane.showMessageDialog(this, "Tipo de consulta no válido");
            return;
        }

        if (result.hasNext()) {
            // Mostrar o procesar los registros encontrados
            List<ValoracionConseNiño> registrosConsultados = new ArrayList<>();
            while (result.hasNext()) {
                ValoracionConseNiño registroConsultado = (ValoracionConseNiño) result.next();
                System.out.println("Registro consultado: " + registroConsultado);
                registrosConsultados.add(registroConsultado);
            }
            JOptionPane.showMessageDialog(this, "Registros consultados con éxito");

            // Llamar al método ConsultarDatos pasando la lista de registros consultados
            ConsultarDatos(Base, registrosConsultados);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron registros en la base de datos");
        }
    } catch (Db4oIOException ex) {
        // Manejar la excepción aquí, puedes mostrar un mensaje de error o realizar otras acciones
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al realizar la consulta en la base de datos");
    }
}
    
    private void ConsultarDatos(ObjectContainer Base, List<ValoracionConseNiño> registrosConsultados) {
    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableConsejos.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (!registrosConsultados.isEmpty()) {
        for (ValoracionConseNiño registroConsultado : registrosConsultados) {
            modelo.addRow(new Object[]{
                registroConsultado.getCod_Respuesta_usuario(),
                registroConsultado.getFk_cod_niño(),
                registroConsultado.getFk_Cod_Consejo(),
                registroConsultado.getRespuesta(),
                registroConsultado.getFecha_respuesta()
            });
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron registros en la base de datos");
    }
}
    
    private void EliminarRegistro(ObjectContainer Base, String Cod_Cons) {

        ValoracionConseNiño cosnej = new ValoracionConseNiño(Cod_Cons, null, null, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = Base.queryByExample(cosnej);

        if (result.hasNext()) {
            // Mensaje de depuración
            System.out.println("Eliminando el registro de la base de datos...");

            Base.delete(result.next());
            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
            MostrarDatos(Base); // Actualizar la tabla después de la eliminación
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }
    
    
    public void MostrarDatos(ObjectContainer Base) {
        ValoracionConseNiño puntu = new ValoracionConseNiño();
        ObjectSet result = Base.get(puntu);

     

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableConsejos.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            ValoracionConseNiño miPuntuacion = (ValoracionConseNiño) result.next();
            modelo.addRow(new Object[]{
                miPuntuacion.getCod_Respuesta_usuario(),
                miPuntuacion.getFk_cod_niño(),
                miPuntuacion.getFk_Cod_Consejo(),
                miPuntuacion.getRespuesta(),
                miPuntuacion.getFecha_respuesta()
            });
        }

    }
    
    public void ConsultarDatos(ObjectContainer Base, ValoracionConseNiño consulta) {
    DefaultTableModel modelo = (DefaultTableModel) jTableConsejos.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (consulta != null) {
        // Agregar el registro consultado a la tabla
        modelo.addRow(new Object[]{
            consulta.getCod_Respuesta_usuario(),
            consulta.getFk_cod_niño(),
            consulta.getFk_Cod_Consejo(),
            consulta.getRespuesta(),
            consulta.getFecha_respuesta()
        });
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
            java.util.logging.Logger.getLogger(ReporteConsejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteConsejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteConsejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteConsejos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteConsejos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableConsejos;
    // End of variables declaration//GEN-END:variables
}
