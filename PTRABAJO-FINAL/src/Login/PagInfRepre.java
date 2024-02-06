/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Informacion;
import Clases.UserDataSingleton;
import Clases.ValoracionInfoRepre;
import Login.InicioNiño;
import Login.PagPrincipalNiñ;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class PagInfRepre extends javax.swing.JFrame {

    /**
     * Creates new form PagInfNiño
     */
    ObjectContainer Base;
    UserDataSingleton usarData;

    public PagInfRepre() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        Mostrar_datos_info(Base);
        mostra_info(Base);
        usarData = UserDataSingleton.getInstance();

        cbx_datos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostra_info(Base);

            }
        });
    }

    public void Mostrar_datos_info(ObjectContainer Base) {

        Informacion info = new Informacion();
        ObjectSet result = Base.get(info);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (result.size() != 0) {
            while (result.hasNext()) {
                Informacion next = (Informacion) result.next();
                model.addElement(next.getTitulo_Info());

            }
            cbx_datos.setModel(model);
        } else {
            JOptionPane.showMessageDialog(this, "No hay informacion Disponible");

        }

    }

    public void mostra_info(ObjectContainer Base) {
        String seleccion = cbx_datos.getSelectedItem().toString();
        if (!seleccion.isEmpty()) {
            Informacion info = new Informacion();
            info.setTitulo_Info(seleccion);
            ObjectSet result = Base.get(info);

            Informacion im = (Informacion) result.next();
            LblTitulo1InfNiño.setText(im.getTitulo_Info());
            Txt1InfNiño.setText(im.getTexto_Info());
            byte[] imageData = im.getImagen();
            if (imageData != null) {
                ImageIcon icon = new ImageIcon(imageData);
                LblImagen1InfoNiño.setIcon(icon);
            } else {
                // Manejar el caso en el que no hay imagen.
                LblImagen1InfoNiño.setIcon(null); // Puedes establecer el icono a null o configurar un icono predeterminado.
            }

        }

    }

    private boolean verificarRespuestaExistente(ObjectContainer Base, String codRepre) {
        try {
            ValoracionInfoRepre ejemploConsulta = new ValoracionInfoRepre();
            ejemploConsulta.setFK_cod_Representante(codRepre);

            ObjectSet<ValoracionInfoRepre> resultados = Base.queryByExample(ejemploConsulta);

            return resultados.hasNext();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al verificar respuesta existente: " + e.getMessage());
            return false;
        }
    }

    private ValoracionInfoRepre obtenerRespuestaExistente(ObjectContainer Base, String Cod_repre, String Cod_Info) {
        try {
            ValoracionInfoRepre ejemploConsulta = new ValoracionInfoRepre();
            ejemploConsulta.setFK_cod_Representante(Cod_repre);
            ejemploConsulta.setFk_Cod_Infor(Cod_Info);

            ObjectSet<ValoracionInfoRepre> resultados = Base.queryByExample(ejemploConsulta);

            if (resultados.hasNext()) {
                return resultados.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al obtener respuesta existente: " + e.getMessage());
        }
        return null;
    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(210, 180, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

    public void GuardarRespuestaCuento(ObjectContainer Base, String Cod_repre, String Cod_info, String respuesta) {
        try {
            // Verificar si ya existe una respuesta para el niño
            ValoracionInfoRepre respuestaExistente = obtenerRespuestaExistente(Base, Cod_repre, Cod_info);

            if (respuestaExistente != null) {
                // Actualizar la respuesta existente
                respuestaExistente.setRespuesta(respuesta);
                respuestaExistente.setFecha_respuesta(new Date());
                Base.store(respuestaExistente);

                System.out.println("Respuesta actualizada correctamente:");
                System.out.println(respuestaExistente);
            } else {
                // Crear una nueva instancia solo si no hay respuesta existente
                ValoracionInfoRepre respuestaCuento = new ValoracionInfoRepre();

                // Obtener código de niño
                Cod_repre = usarData.getCod_Representante();

                // Obtener código del cuento seleccionado
                String codigoInfo = obtenerCodigoInformacionSeleccionado();
                if (codigoInfo != null) {
                    respuestaCuento.setFk_Cod_Infor(codigoInfo);
                    System.out.println("Código de Cuento: " + codigoInfo);
                } else {
                    System.err.println("No se pudo obtener el código del cuento seleccionado.");
                    return;
                }

                // Generar ID de respuesta
                String Codigo = Calcular_ID_Respuesta(Base);
                respuestaCuento.setCod_Respuesta_usuario(Codigo);
                System.out.println("ID de Respuesta: " + Codigo);

                // Obtener código de representante
                respuestaCuento.setFK_cod_Representante(Cod_repre);
                System.out.println("Código de Representante: " + Cod_repre);

                // Establecer la respuesta
                respuestaCuento.setRespuesta(respuesta);
                System.out.println("Respuesta: " + respuesta);

                // Obtener y asignar la fecha de respuesta
                Date FechaRespuesta = new Date();
                respuestaCuento.setFecha_respuesta(FechaRespuesta);
                System.out.println("Fecha de Respuesta: " + FechaRespuesta);

                // Almacenar la respuesta en la base de datos
                Base.store(respuestaCuento);

                // Mensajes de depuración adicionales
                System.out.println("Respuesta almacenada correctamente:");
                System.out.println(respuestaCuento);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la respuesta: " + e.getMessage());
        }
    }

    public String obtenerCodigoInformacionSeleccionado() {
        try {
            // Obtener descripción del cuento seleccionado
            String descrip = String.valueOf(cbx_datos.getSelectedItem());

            // Obtener el índice seleccionado en lugar del valor
            int selectedIndex = cbx_datos.getSelectedIndex();

            // Obtener el objeto Cuento desde la base de datos usando el índice
            Informacion info = obtenerInformacionDelCuento(Base, selectedIndex);

            if (info != null) {
                return info.getCod_Info();
            } else {
                System.err.println("No se pudo obtener el código del cuento seleccionado.");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al obtener el código del cuento seleccionado: " + e.getMessage());
            return null;
        }
    }

    private Informacion obtenerInformacionDelCuento(ObjectContainer Base, int selectedIndex) {
        // Obtener todos los cuentos
        ObjectSet<Informacion> result = Base.queryByExample(Informacion.class);

        // Validar que el índice esté dentro del rango
        if (selectedIndex >= 0 && selectedIndex < result.size()) {
            // Obtener el cuento en la posición del índice
            return result.get(selectedIndex);
        } else {
            throw new IllegalStateException("Índice fuera de rango al obtener información del cuento");
        }
    }

    public static String Calcular_ID_Respuesta(ObjectContainer Base) {
        try {
            // Obtener el último ID almacenado
            ValoracionInfoRepre ejemploConsulta = new ValoracionInfoRepre();
            ObjectSet<ValoracionInfoRepre> resultados = Base.queryByExample(ejemploConsulta);
            String ultimoID = "Resp-0000";

            while (resultados.hasNext()) {
                ValoracionInfoRepre respuesta = resultados.next();
                String actualID = respuesta.getCod_Respuesta_usuario();

                if (actualID != null && actualID.startsWith("Resp-")) {
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
            String nuevoID = "Resp-" + String.format("%04d", numero);

            return nuevoID;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Excepción al calcular el ID de respuesta: " + e.getMessage());
            return null;
        }
    }

    public static int Verificar_Resp(ObjectContainer Base, String Codigo) {
        ValoracionInfoRepre mires = new ValoracionInfoRepre();
        mires.setCod_Respuesta_usuario(Codigo);
        ObjectSet result = Base.get(mires);
        return result.size();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        PnlPrincipalInfNiño = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblTitulo1InfNiño = new javax.swing.JLabel();
        LblImagen1InfoNiño = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        LblTitulo2InfNiño = new javax.swing.JLabel();
        LblTitulo3InfNiño = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Txt1InfNiño = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cbx_datos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LblInformacionNiño = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnCerrarPagina = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlPrincipalInfNiño.setBackground(new java.awt.Color(255, 255, 255));
        PnlPrincipalInfNiño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setDoubleBuffered(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 340));
        jPanel1.setMinimumSize(new java.awt.Dimension(593, 405));
        jPanel1.setPreferredSize(new java.awt.Dimension(593, 405));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInfor2Niño.setText("INFORMACIÓN DEL BULLYING");
        jPanel1.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 10));

        LblTitulo1InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo1InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo1InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 20));

        LblImagen1InfoNiño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(LblImagen1InfoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 250, 180));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 10));

        LblTitulo2InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo2InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo2InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 20));

        LblTitulo3InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo3InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo3InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 780, 260, 0));

        Txt1InfNiño.setColumns(20);
        Txt1InfNiño.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Txt1InfNiño.setLineWrap(true);
        Txt1InfNiño.setRows(5);
        Txt1InfNiño.setWrapStyleWord(true);
        Txt1InfNiño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Txt1InfNiño.setEnabled(false);
        jScrollPane5.setViewportView(Txt1InfNiño);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 170));

        jLabel1.setText("Titulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        cbx_datos.setToolTipText("Selecciona la información");
        cbx_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_datosActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 140, -1));

        jLabel3.setText("¿Te parece util esta información?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        btnSi.setText("Si");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel4.setText("La respuesta se actualizara ala ultima que escojas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jScrollPane1.setViewportView(jPanel1);

        PnlPrincipalInfNiño.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 610, 340));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblInformacionNiño.setText("BIENVENIDOS AL AREA DE INFORMACIÓN");
        PnlPrincipalInfNiño.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, 20));
        PnlPrincipalInfNiño.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 410, 20));

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
        PnlPrincipalInfNiño.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

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
        PnlPrincipalInfNiño.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 30, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        PnlPrincipalInfNiño.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        PnlPrincipalInfNiño.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -10, 1690, 520));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        PnlPrincipalInfNiño.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(PnlPrincipalInfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_datosActionPerformed

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

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

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        String respuesta = "SI";
        String codRepre = usarData.getCod_Representante();

        if (verificarRespuestaExistente(Base, codRepre)) {
            int opcion = JOptionPane.showOptionDialog(this, "Gracias por su respuesta", "Confirmar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{}, null);

            if (opcion == JOptionPane.NO_OPTION) {
                return;
            }
        }

        // Obtener código del cuento seleccionado
        String codigoInfo = obtenerCodigoInformacionSeleccionado();

        // Aquí se ejecutará solo si el usuario selecciona "Si" o si no hay respuesta existente
        GuardarRespuestaCuento(Base, codRepre, codigoInfo, respuesta);
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        String respuesta = "NO";
        String codRepre = usarData.getCod_Representante();
        String codinfo;

        if (verificarRespuestaExistente(Base, codRepre)) {
            String[] options = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(this, "Gracias por su respuesta", "Confirmar",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{}, null);

            if (opcion == JOptionPane.NO_OPTION) {
                return; // El usuario seleccionó "No", no hacemos nada
            }
        }

        // Obtener código del cuento seleccionado
        codinfo = obtenerCodigoInformacionSeleccionado();

        // Aquí se ejecutará solo si el usuario selecciona "No" o si no hay respuesta existente
        GuardarRespuestaCuento(Base, codRepre, codinfo, respuesta);
    }//GEN-LAST:event_btnNoActionPerformed

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setState(PagInfRepre.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JLabel LblImagen1InfoNiño;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblTitulo1InfNiño;
    private javax.swing.JLabel LblTitulo2InfNiño;
    private javax.swing.JLabel LblTitulo3InfNiño;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JPanel PnlPrincipalInfNiño;
    private javax.swing.JTextArea Txt1InfNiño;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JComboBox<String> cbx_datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
