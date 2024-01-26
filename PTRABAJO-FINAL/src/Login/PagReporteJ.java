/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Puntuaciones;
import Clases.RespuestasLab;
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
public class PagReporteJ extends javax.swing.JFrame {

    ObjectContainer Base;
    
    public PagReporteJ() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        MostrarDatos(Base);
        MostrarDatosLab(Base);
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJLab = new javax.swing.JTable();
        btnActualizarLab = new javax.swing.JButton();
        btnConsultarLab = new javax.swing.JButton();
        btnEliminarLab = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDiferencias = new javax.swing.JTable();
        btnActualizarDif = new javax.swing.JButton();
        btnConsultarDif = new javax.swing.JButton();
        btnEliminarDif = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableJLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Respuesta", "ID_Niño", "ID_LAB", "Puntuacion", "Fecha Juego"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableJLab);

        btnActualizarLab.setText("Actualizar");
        btnActualizarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarLabActionPerformed(evt);
            }
        });

        btnConsultarLab.setText("Consultar");
        btnConsultarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLabActionPerformed(evt);
            }
        });

        btnEliminarLab.setText("Eliminar");
        btnEliminarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnActualizarLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarLab)
                .addGap(148, 148, 148)
                .addComponent(btnEliminarLab)
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarLab)
                    .addComponent(btnConsultarLab)
                    .addComponent(btnEliminarLab)
                    .addComponent(jLabel2))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Juego Laberinto", jPanel2);

        jTableDiferencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Puntuacion", "Cod_Niño", "Cod_Minijuego", "Puntuacion", "Fecha Jugado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableDiferencias);

        btnActualizarDif.setText("Actualizar");
        btnActualizarDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDifActionPerformed(evt);
            }
        });

        btnConsultarDif.setText("Consultar");
        btnConsultarDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDifActionPerformed(evt);
            }
        });

        btnEliminarDif.setText("Eliminar");
        btnEliminarDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnActualizarDif)
                .addGap(121, 121, 121)
                .addComponent(btnConsultarDif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarDif)
                .addGap(115, 115, 115))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarDif)
                    .addComponent(btnConsultarDif)
                    .addComponent(btnEliminarDif))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Juego Diferencias", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Juego Responde", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 700, 380));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

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

    private void btnEliminarDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDifActionPerformed
       String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarDifActionPerformed

    private void btnConsultarDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDifActionPerformed
       String[] opciones = {"Código", "Código Niño", "Código MiniJuego"};
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
    }//GEN-LAST:event_btnConsultarDifActionPerformed

    private void btnActualizarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarLabActionPerformed
        MostrarDatosLab(Base);
    }//GEN-LAST:event_btnActualizarLabActionPerformed

    private void btnConsultarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLabActionPerformed
        String[] opciones = {"Código", "Código Niño", "Código MiniJuego"};
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
    }//GEN-LAST:event_btnConsultarLabActionPerformed

    private void btnActualizarDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDifActionPerformed
        MostrarDatos(Base);
    }//GEN-LAST:event_btnActualizarDifActionPerformed

    private void btnEliminarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLabActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarLabActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        Base.close();
        Seleccion selec = new Seleccion();
        selec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed
   
    
    //Metodos del juego diferencias
    private void ConsultarRegistro(ObjectContainer Base, String consulta, int tipoConsulta) {
     // Creando un objeto de ejemplo para la consulta
    Puntuaciones ejemploConsulta = new Puntuaciones(null, null, null, 0, null);

    // Consultando la base de datos
    ObjectSet result;

    try {
        // Verificar el tipo de consulta para decidir qué campo usar
        if (tipoConsulta == 0) {
            // Búsqueda por código
            ejemploConsulta.setID_Puntuacion(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 1) {
            // Búsqueda por código niño
            ejemploConsulta.setFK_Cod_Niño(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 2) {
            // Búsqueda por código miniJuego
            ejemploConsulta.setFK_Cod_Minijuego(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else {
            // Tipo de consulta no válido
            JOptionPane.showMessageDialog(this, "Tipo de consulta no válido");
            return;
        }

        if (result.hasNext()) {
            // Mostrar o procesar los registros encontrados
            List<Puntuaciones> registrosConsultados = new ArrayList<>();
            while (result.hasNext()) {
                Puntuaciones registroConsultado = (Puntuaciones) result.next();
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
    
    private void ConsultarDatos(ObjectContainer Base, List<Puntuaciones> registrosConsultados) {
    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableDiferencias.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (!registrosConsultados.isEmpty()) {
        for (Puntuaciones registroConsultado : registrosConsultados) {
            modelo.addRow(new Object[]{
                registroConsultado.getID_Puntuacion(),
                registroConsultado.getFK_Cod_Niño(),
                registroConsultado.getFK_Cod_Minijuego(),
                registroConsultado.getPuntuacion(),
                registroConsultado.getFecha_Jugado()
            });
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron registros en la base de datos");
    }
}
    
    private void EliminarRegistro(ObjectContainer Base, String Cod_Cuento) {

        Puntuaciones cuen = new Puntuaciones(Cod_Cuento, null, null, 0, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = Base.queryByExample(cuen);

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
        Puntuaciones puntu = new Puntuaciones();
        ObjectSet result = Base.get(puntu);

     

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableDiferencias.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Puntuaciones miPuntuacion = (Puntuaciones) result.next();
            modelo.addRow(new Object[]{
                miPuntuacion.getID_Puntuacion(),
                miPuntuacion.getFK_Cod_Niño(),
                miPuntuacion.getFK_Cod_Minijuego(),
                miPuntuacion.getPuntuacion(),
                miPuntuacion.getFecha_Jugado()
            });
        }

    }
    
    public void ConsultarDatos(ObjectContainer Base, Puntuaciones consulta) {
    DefaultTableModel modelo = (DefaultTableModel) jTableDiferencias.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (consulta != null) {
        // Agregar el registro consultado a la tabla
        modelo.addRow(new Object[]{
            consulta.getID_Puntuacion(),
            consulta.getFK_Cod_Niño(),
            consulta.getFK_Cod_Minijuego(),
            consulta.getPuntuacion(),
            consulta.getFecha_Jugado()
        });
    }
}
    
    //Aqui Termina
    
    //Metodos juego laberinto
    
    private void ConsultarRegistroLab(ObjectContainer Base, String consulta, int tipoConsulta) {
     // Creando un objeto de ejemplo para la consulta
    RespuestasLab ejemploConsulta = new RespuestasLab(null, null, null, 0, null);

    // Consultando la base de datos
    ObjectSet result;

    try {
        // Verificar el tipo de consulta para decidir qué campo usar
        if (tipoConsulta == 0) {
            // Búsqueda por código
            ejemploConsulta.setID_Respuesta(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 1) {
            // Búsqueda por código niño
            ejemploConsulta.setFK_Cod_Niño(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else if (tipoConsulta == 2) {
            // Búsqueda por código miniJuego
            ejemploConsulta.setFK_Cod_Minijuego(consulta);
            result = Base.queryByExample(ejemploConsulta);
        } else {
            // Tipo de consulta no válido
            JOptionPane.showMessageDialog(this, "Tipo de consulta no válido");
            return;
        }

        if (result.hasNext()) {
            // Mostrar o procesar los registros encontrados
            List<RespuestasLab> registrosConsultados = new ArrayList<>();
            while (result.hasNext()) {
                RespuestasLab registroConsultado = (RespuestasLab) result.next();
                System.out.println("Registro consultado: " + registroConsultado);
                registrosConsultados.add(registroConsultado);
            }
            JOptionPane.showMessageDialog(this, "Registros consultados con éxito");

            // Llamar al método ConsultarDatos pasando la lista de registros consultados
            ConsultarDatosLab(Base, registrosConsultados);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron registros en la base de datos");
        }
    } catch (Db4oIOException ex) {
        // Manejar la excepción aquí, puedes mostrar un mensaje de error o realizar otras acciones
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al realizar la consulta en la base de datos");
    }
}
    
    private void ConsultarDatosLab(ObjectContainer Base, List<RespuestasLab> registrosConsultados) {
    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableJLab.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (!registrosConsultados.isEmpty()) {
        for (RespuestasLab registroConsultado : registrosConsultados) {
            modelo.addRow(new Object[]{
                registroConsultado.getID_Respuesta(),
                registroConsultado.getFK_Cod_Niño(),
                registroConsultado.getFK_Cod_Minijuego(),
                registroConsultado.getPuntuacion(),
                registroConsultado.getFecha_Jugado()
            });
        }
    } else {
        JOptionPane.showMessageDialog(this, "No se encontraron registros en la base de datos");
    }
}
    
    private void EliminarRegistroLab(ObjectContainer base, String Cod_Lab) {

        RespuestasLab cuen = new RespuestasLab(Cod_Lab, null, null, 0, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = base.queryByExample(cuen);

        if (result.hasNext()) {
            // Mensaje de depuración
            System.out.println("Eliminando el registro de la base de datos...");

            base.delete(result.next());
            JOptionPane.showMessageDialog(this, "El registro ha sido eliminado con éxito");
            MostrarDatos(base); // Actualizar la tabla después de la eliminación
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }
    
    
    public void MostrarDatosLab(ObjectContainer Base) {
        RespuestasLab RespLab = new RespuestasLab();
        ObjectSet result = Base.get(RespLab);

     

    // Obtener el modelo de la tabla
    DefaultTableModel modelo = (DefaultTableModel) jTableJLab.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            RespuestasLab miRespuesta = (RespuestasLab) result.next();
            modelo.addRow(new Object[]{
                miRespuesta.getID_Respuesta(),
                miRespuesta.getFK_Cod_Niño(),
                miRespuesta.getFK_Cod_Minijuego(),
                miRespuesta.getPuntuacion(),
                miRespuesta.getFecha_Jugado()
            });
        }

    }
    
    public void ConsultarDatosLab(ObjectContainer base, RespuestasLab consulta) {
    DefaultTableModel modelo = (DefaultTableModel) jTableJLab.getModel();

    // Limpiar el modelo antes de agregar nuevas filas
    modelo.setRowCount(0);

    if (consulta != null) {
        // Agregar el registro consultado a la tabla
        modelo.addRow(new Object[]{
            consulta.getID_Respuesta(),
            consulta.getFK_Cod_Niño(),
            consulta.getFK_Cod_Minijuego(),
            consulta.getPuntuacion(),
            consulta.getFecha_Jugado()
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
            java.util.logging.Logger.getLogger(PagReporteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagReporteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagReporteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagReporteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagReporteJ().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JButton btnActualizarDif;
    private javax.swing.JButton btnActualizarLab;
    private javax.swing.JButton btnConsultarDif;
    private javax.swing.JButton btnConsultarLab;
    private javax.swing.JButton btnEliminarDif;
    private javax.swing.JButton btnEliminarLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableDiferencias;
    private javax.swing.JTable jTableJLab;
    // End of variables declaration//GEN-END:variables
}
