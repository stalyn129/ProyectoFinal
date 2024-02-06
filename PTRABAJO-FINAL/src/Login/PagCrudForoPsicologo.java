/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Foro;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 *
 * @author Joel
 */
public class PagCrudForoPsicologo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    ObjectContainer Base;

    public PagCrudForoPsicologo() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        TxtTitulo = new javax.swing.JTextField();
        LblInfor2Niño1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableForos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtIntroForo = new javax.swing.JTextArea();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        LblTestPariente2 = new javax.swing.JLabel();
        LblTestPariente1 = new javax.swing.JLabel();
        BtnRegresar5 = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 670));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 670));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 12)); // NOI18N
        LblInfor2Niño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño.setText("Título del foro:");
        jPanel3.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 630, 10));

        TxtTitulo.setForeground(new java.awt.Color(204, 204, 204));
        TxtTitulo.setText("Ingrese un título");
        TxtTitulo.setBorder(null);
        TxtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtTituloMousePressed(evt);
            }
        });
        TxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloActionPerformed(evt);
            }
        });
        jPanel3.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, -1));

        LblInfor2Niño1.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblInfor2Niño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño1.setText("Descripción del Foro:");
        jPanel3.add(LblInfor2Niño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 160, -1));

        jTableForos.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jTableForos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo_Foro", "Titulo", "Desripción", "Fecha_Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableForos);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 630, 340));

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton1.setText("Publicar Foro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, -1));

        jButton2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 110, -1));

        Actualizar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 110, -1));

        btnConsultar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, 110, -1));

        btnEliminar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, 110, -1));

        TxtIntroForo.setColumns(20);
        TxtIntroForo.setRows(5);
        jScrollPane2.setViewportView(TxtIntroForo);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 330, 140));

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 220, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 330, 10));

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 230, 10));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 710, 340));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

        btnMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnMinimizar1.setText("—");
        btnMinimizar1.setToolTipText("Minimizar Pagina dando click aqui");
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
        jPanel1.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 30, 30));

        LblTestPariente2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTestPariente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente2.setText("FORO");
        jPanel1.add(LblTestPariente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 30));

        LblTestPariente1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente1.setText("BIENVENIDO AL AREA DE:");
        jPanel1.add(LblTestPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 300, 20));

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
        jPanel1.add(BtnRegresar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 50, 40));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGeneralReportes.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-880, 0, 1690, 500));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloActionPerformed
        
    }//GEN-LAST:event_TxtTituloActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
       jTableForos.setVisible(true);
        MostrarDatos(Base);
    }//GEN-LAST:event_ActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // Mostrar un cuadro de diálogo para que el usuario elija el método de búsqueda
        String[] opciones = {"Código", "Título"};
        int seleccion = JOptionPane.showOptionDialog(this, "Seleccione el método de búsqueda:", "Método de Búsqueda", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion != -1) {
            String consulta = "";

            if (seleccion == 0) {
                // Búsqueda por código
                consulta = JOptionPane.showInputDialog(this, "Ingrese el código a consultar");
            } else {
                // Búsqueda por título
                consulta = JOptionPane.showInputDialog(this, "Ingrese el título a consultar");
            }

            if (consulta != null && !consulta.isEmpty()) {
                ConsultarRegistro(Base, consulta, seleccion);
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un valor válido para la consulta.");
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
   
    private void ConsultarRegistro(ObjectContainer base, String consulta, int tipoConsulta) {
        // Creando un objeto de ejemplo para la consulta
        Foro ejemploConsulta;

        if (tipoConsulta == 0) {
            // Búsqueda por código
            ejemploConsulta = new Foro(consulta, null, null, null);
        } else {
            // Búsqueda por título
            ejemploConsulta = new Foro(null, consulta, null, null);
        }

        // Consultando la base de datos
        ObjectSet result = base.queryByExample(ejemploConsulta);

        if (result.hasNext()) {
            // Manejando el resultado (puedes querer mostrarlo o procesarlo)
            Foro registroConsultado = (Foro) result.next();
            System.out.println("Registro consultado: " + registroConsultado);
            JOptionPane.showMessageDialog(this, "El registro se ha consultado con éxito");

            // Llamar al método ConsultarDatos para mostrar el registro en la tabla
            ConsultarDatos(Base, registroConsultado);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro en la base de datos");
        }
    }
    
    public void ConsultarDatos(ObjectContainer base, Foro consulta) {
        DefaultTableModel modelo = (DefaultTableModel) jTableForos.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (consulta != null) {
            // Agregar el registro consultado a la tabla
            modelo.addRow(new Object[]{
                consulta.getCod_Foro(),
                consulta.getTitulo_Foro(),
                consulta.getDescripcion(),
                consulta.getFecha_Creacion()

            });
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Validar campos antes de procesar la acción
        if (TxtTitulo.getText().isEmpty()
                || TxtIntroForo.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;  // Detener el proceso si los campos no están completos
        }

        try {
            Foro elForo = new Foro();
            //elcue.setFK_CodPsicologo(RegistrarsePariente.Calcular_cod_Representante(Base));

            String codigoIncremental = calcularIDCuen(Base);

            elForo.setCod_Foro(codigoIncremental);
            elForo.setTitulo_Foro(TxtTitulo.getText());
            elForo.setDescripcion(TxtIntroForo.getText());
            Date ObtenerFecha = new Date();
            elForo.setFecha_Creacion(ObtenerFecha);

            Base.store(elForo);
            javax.swing.JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIDO GUARDADOS EXITOSAMENTE");

            // Limpiar campos después de ingresar los datos
            limpiarCampos();

            MostrarDatos(Base);
        } catch (DatabaseClosedException | DatabaseReadOnlyException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void limpiarCampos() {
        TxtTitulo.setText("");
        TxtIntroForo.setText("");
    }

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

    private void TxtTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTituloMousePressed
        if (TxtTitulo.getText().equals("Ingrese un título")) {
            TxtTitulo.setText("");
            TxtTitulo.setForeground(Color.black);
        }
    }//GEN-LAST:event_TxtTituloMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigoAEliminar = JOptionPane.showInputDialog(this, "Ingrese el código a eliminar:");

        if (codigoAEliminar != null && !codigoAEliminar.isEmpty()) {
            EliminarRegistro(Base, codigoAEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void EliminarRegistro(ObjectContainer base, String Cod_Foro) {

        Foro elimForo = new Foro(Cod_Foro,null, null, null);

        // Mensaje de depuración
        System.out.println("Buscando el registro en la base de datos...");

        ObjectSet result = base.queryByExample(elimForo);

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Obtener el código del cuento que se desea modificar
            String codigoCuento = JOptionPane.showInputDialog(this, "Ingrese el código del cuento a modificar:");

            if (codigoCuento != null && !codigoCuento.isEmpty()) {
                // Buscar el cuento con el código proporcionado
                int indiceCuento = buscarForoPorCodigo(codigoCuento);

                if (indiceCuento != -1) {
                    // Se encontró el cuento, obtener datos actuales
                    DefaultTableModel modelo = (DefaultTableModel) jTableForos.getModel();
                    String nuevoTitulo = validarCampo("Ingrese el nuevo título:", (String) modelo.getValueAt(indiceCuento, 1));
                    String nuevaIntroduccion = validarCampo("Ingrese la nueva introducción:", (String) modelo.getValueAt(indiceCuento, 2));
                    
                    if (nuevoTitulo != null && nuevaIntroduccion != null) {

                        // Modificar el cuento con los nuevos valores
                        Modificar_Foro(Base, codigoCuento, nuevoTitulo, nuevaIntroduccion);
                        MostrarDatos(Base);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Todos los campos deben ser ingresados.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error: No se encontró el cuento con el código proporcionado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un código válido para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(PagCrudForoPsicologo.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    private void BtnRegresar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresar5ActionPerformed
        Base.close();
        PagPrincipalPsicologo prin = new PagPrincipalPsicologo();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresar5ActionPerformed

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
            java.util.logging.Logger.getLogger(PagCrudForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagCrudForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagCrudForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagCrudForoPsicologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PagCrudForoPsicologo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnRegresar4;
    private javax.swing.JButton BtnRegresar5;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInfor2Niño1;
    private javax.swing.JLabel LblTestPariente1;
    private javax.swing.JLabel LblTestPariente2;
    private javax.swing.JTextArea TxtIntroForo;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTableForos;
    // End of variables declaration//GEN-END:variables
public static String calcularIDCuen(ObjectContainer base) {
        boolean rest = true;
        int incremental = 0;
        String codigo;

        do {
            incremental++;
            codigo = String.format("FORO-%04d", incremental);

            if (VerificarForo(base, codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return codigo;
    }

    public static int VerificarForo(ObjectContainer Base, String Codigo) {
        Foro elForo = new Foro();
        elForo.setCod_Foro(Codigo);
        ObjectSet result = Base.get(elForo);
        return result.size();
    }
    
     public void MostrarDatos(ObjectContainer Base) {
        Foro miForo = new Foro();
        ObjectSet result = Base.get(miForo);

        DefaultTableModel modelo = (DefaultTableModel) jTableForos.getModel();

        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Foro mosForo = (Foro) result.next();
            modelo.addRow(new Object[]{
                mosForo.getCod_Foro(), 
                mosForo.getTitulo_Foro(),
                mosForo.getDescripcion(),
                mosForo.getFecha_Creacion()
            });
        }

    }
     
     private int buscarForoPorCodigo(String codigoCuento) {
        DefaultTableModel modelo = (DefaultTableModel) jTableForos.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String codigoActual = (String) modelo.getValueAt(i, 0);
            if (codigoActual.equals(codigoCuento)) {
                return i; 
            }
        }
        return -1;
    }
     
    private String validarCampo(String mensaje, String valorActual) {
        String nuevoValor = JOptionPane.showInputDialog(this, mensaje, valorActual);
        return (nuevoValor != null && !nuevoValor.isEmpty()) ? nuevoValor : null;
    }
    
    public void Modificar_Foro(ObjectContainer base, String Codigo, String Titulo, String Introduccion) {
        try {
            Foro miForo = new Foro();
            miForo.setCod_Foro(Codigo);

            ObjectSet result = base.queryByExample(miForo);

            if (result.hasNext()) {
                Foro nuevoForo = (Foro) result.next();

                nuevoForo.setTitulo_Foro(Titulo);
                nuevoForo.setDescripcion(Introduccion);

                base.store(nuevoForo);
                JOptionPane.showMessageDialog(this, "Se modificó el foro correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error: No se encontró el foro para modificar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar el foro: " + e.getMessage());
        }
    }
}
