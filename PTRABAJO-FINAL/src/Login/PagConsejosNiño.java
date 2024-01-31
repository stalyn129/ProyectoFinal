/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Consejos;
import Clases.UserDataSingleton;
import Clases.ValoracionConseNiño;
import Login.InicioNiño;
import Login.PagCrudForoPsicologo;
import Login.PagPrincipalNiñ;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class PagConsejosNiño extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;

    public PagConsejosNiño() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cargar_combo1(CmBoxConsejosNiño);
        usarData = UserDataSingleton.getInstance();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtTextConsNiño1 = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        LblTitConseNiño1 = new javax.swing.JLabel();
        LblImaConseNiño1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtTextConsNiño2 = new javax.swing.JTextArea();
        LblImaConseNiño2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        LblTitConseNiño2 = new javax.swing.JLabel();
        CmBoxConsejosNiño = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnSi = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LblInformacionNiño = new javax.swing.JLabel();
        LblInformacionNiño1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(568, 640));
        jPanel4.setPreferredSize(new java.awt.Dimension(568, 640));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInfor2Niño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño.setText("Consejos Sobre El Bullying");
        jPanel4.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, 10));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 300, 10));

        TxtTextConsNiño1.setColumns(20);
        TxtTextConsNiño1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtTextConsNiño1.setLineWrap(true);
        TxtTextConsNiño1.setRows(5);
        TxtTextConsNiño1.setWrapStyleWord(true);
        TxtTextConsNiño1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtTextConsNiño1.setEnabled(false);
        jScrollPane5.setViewportView(TxtTextConsNiño1);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 170));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 430, 10));

        LblTitConseNiño1.setFont(new java.awt.Font("Rockwell Nova", 3, 14)); // NOI18N
        LblTitConseNiño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(LblTitConseNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 400, 20));
        jPanel4.add(LblImaConseNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 240, 170));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 240, 10));

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 250, 10));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 300, 10));

        TxtTextConsNiño2.setColumns(20);
        TxtTextConsNiño2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtTextConsNiño2.setLineWrap(true);
        TxtTextConsNiño2.setRows(5);
        TxtTextConsNiño2.setWrapStyleWord(true);
        TxtTextConsNiño2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtTextConsNiño2.setEnabled(false);
        jScrollPane6.setViewportView(TxtTextConsNiño2);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 300, 170));
        jPanel4.add(LblImaConseNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 240, 170));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 430, 10));

        LblTitConseNiño2.setFont(new java.awt.Font("Rockwell Nova", 3, 14)); // NOI18N
        LblTitConseNiño2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(LblTitConseNiño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 410, 20));

        CmBoxConsejosNiño.setToolTipText("Selecciona lo que mas te guste");
        CmBoxConsejosNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmBoxConsejosNiñoActionPerformed(evt);
            }
        });
        jPanel4.add(CmBoxConsejosNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 150, 20));

        jLabel1.setText("¿Te parecio Bien el consejo?");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        btnSi.setText("SI");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel4.add(btnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        btnNo.setText("NO");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        jScrollPane1.setViewportView(jPanel4);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 310));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 630, 310));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 70));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño.setText("CONSEJOS");
        jPanel1.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 20));

        LblInformacionNiño1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInformacionNiño1.setText("BIENVENIDOS AL AREA DE:");
        jPanel1.add(LblInformacionNiño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 290, 20));

        Fondo1.setBackground(new java.awt.Color(255, 255, 255));
        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiñoConsejos.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, 0, 1670, 500));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

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

    private void CmBoxConsejosNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmBoxConsejosNiñoActionPerformed
        if (CmBoxConsejosNiño.getSelectedItem() != null) {
            cargar_datos1();
        }
    }//GEN-LAST:event_CmBoxConsejosNiñoActionPerformed

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

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

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        String respuesta = "SI";
        String codNiño = usarData.getCod_niño();

        // Verificar si ya hay una respuesta almacenada
        if (verificarRespuestaExistente(Base, codNiño)) {
            String[] options = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(this, "Ya existe una respuesta. ¿Desea modificarla?", "Confirmar",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

            if (opcion == JOptionPane.NO_OPTION) {
                return; // El usuario seleccionó "No", no hacemos nada
            }
        }

        // Aquí se ejecutará solo si el usuario selecciona "Si" o si no hay respuesta existente
        GuardarRespuestaCuento(Base, codNiño, respuesta);
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        String respuesta = "NO";
        String codNiño = usarData.getCod_niño();

        // Verificar si ya hay una respuesta almacenada
        if (verificarRespuestaExistente(Base, codNiño)) {
            String[] options = {"Si", "No"};
            int opcion = JOptionPane.showOptionDialog(this, "Ya existe una respuesta. ¿Desea modificarla?", "Confirmar",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

            if (opcion == JOptionPane.NO_OPTION) {
                return; // El usuario seleccionó "No", no hacemos nada
            }
        }

        // Aquí se ejecutará solo si el usuario selecciona "No" o si no hay respuesta existente
        GuardarRespuestaCuento(Base, codNiño, respuesta);
    }//GEN-LAST:event_btnNoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagConsejosNiño().setVisible(true);
            }
        });
    }

    private boolean verificarRespuestaExistente(ObjectContainer Base, String codNiño) {
        try {
            ValoracionConseNiño ejemploConsulta = new ValoracionConseNiño();
            ejemploConsulta.setFk_cod_niño(codNiño);

            ObjectSet<ValoracionConseNiño> resultados = Base.queryByExample(ejemploConsulta);

            return resultados.hasNext();
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            e.printStackTrace();
            System.err.println("Excepción al verificar respuesta existente: " + e.getMessage());
            return false;
        }
    }

    public void cargar_combo1(JComboBox jComboJuego) {

        Consejos ConBuscar = new Consejos(null, null, null, null, null, null, null, null, null);
        ObjectSet resul = Base.get(ConBuscar);
        while (resul.hasNext()) {
            Consejos JConCombo = (Consejos) resul.next();
            jComboJuego.addItem(JConCombo.getTitulo1Consejo());
        }
        //System.out.println(resul);
    }

    public void cargar_datos1() {

        String titulo = String.valueOf(CmBoxConsejosNiño.getSelectedItem());
        Consejos ConBuscar = new Consejos(null, titulo, null, null, null, null, null, null, null);
        ObjectSet resul = Base.get(ConBuscar);

        // Verificar si hay al menos un resultado
        if (!resul.isEmpty()) {
            // Iterar sobre los resultados
            while (resul.hasNext()) {
                Consejos Conmostrar = (Consejos) resul.next();
                LblTitConseNiño1.setText(Conmostrar.getTitulo1Consejo());
                LblTitConseNiño2.setText(Conmostrar.getTitulo2Consejo());

                // Rellena las imágenes en los JLabel correspondientes
                Image imagenConsejo1 = Conmostrar.obtenerImagenConsejo1();
                LblImaConseNiño1.setIcon(getScaledImageIcon(imagenConsejo1));

                Image imagenConsejo2 = Conmostrar.obtenerImagenConsejo2();
                LblImaConseNiño2.setIcon(getScaledImageIcon(imagenConsejo2));

                // Obtener los textos
                TxtTextConsNiño1.setText(Conmostrar.getTexConsejo1());
                TxtTextConsNiño2.setText(Conmostrar.getTexConsejo2());

            }
        } else {

            System.out.println("No se encontraron datos para el juego seleccionado.");
        }

        Base.commit();
    }

    private ImageIcon getScaledImageIcon(Image image) {
        if (image != null) {
            return new ImageIcon(image.getScaledInstance(350, 110, Image.SCALE_SMOOTH));
        } else {
            return null;
        }
    }

    public void GuardarRespuestaCuento(ObjectContainer Base, String Cod_niño, String respuesta) {
        try {
            ValoracionConseNiño respuesconsej = new ValoracionConseNiño();

            // Obtener código de niño
            Cod_niño = usarData.getCod_niño();

            // Generar ID de respuesta
            String Codigo = Calcular_ID_Respuesta(Base);
            respuesconsej.setCod_Respuesta_usuario(Codigo);
            System.out.println("ID de Respuesta: " + Codigo);

            // Obtener código de representante
            respuesconsej.setFk_cod_niño(Cod_niño);
            System.out.println("Código de Niño: " + Cod_niño);

            // Establecer la respuesta
            respuesconsej.setRespuesta(respuesta);
            System.out.println("Respuesta: " + respuesta);

            // Obtener y asignar la fecha de respuesta
            Date FechaRespuesta = new Date();
            respuesconsej.setFecha_respuesta(FechaRespuesta);
            System.out.println("Fecha de Respuesta: " + FechaRespuesta);

            // Obtener descripción del cuento seleccionado
            String descrip = String.valueOf(CmBoxConsejosNiño.getSelectedItem());
            Consejos conse = obtenerInformacionDelCuento(Base, descrip);

            String codiconse = conse.getCod_consejo();
            respuesconsej.setFk_Cod_Consejo(codiconse);
            System.out.println("Código de Consejo: " + codiconse);

            // Almacenar la respuesta en la base de datos
            Base.store(respuesconsej);

            // Mensajes de depuración adicionales
            System.out.println("Respuesta almacenada correctamente:");
            System.out.println(respuesconsej);

        } catch (DatabaseClosedException | DatabaseReadOnlyException | NullPointerException e) {
            e.printStackTrace();
            System.err.println("Excepción al guardar la respuesta: " + e.getMessage());
        }
    }

    private Consejos obtenerInformacionDelCuento(ObjectContainer Base, String descrip) {
        Consejos micue = new Consejos(null, null, null, null, null, null, null, null, null);

        ObjectSet result = Base.get(micue);

        if (result.hasNext()) {
            return (Consejos) result.next();
        } else {
            throw new IllegalStateException("No se encontró información del Cuento");
        }
    }

    public static String Calcular_ID_Respuesta(ObjectContainer Base) {
        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("ReC-%04d", Incremental);

            if (Verificar_Resp(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public static int Verificar_Resp(ObjectContainer Base, String Codigo) {
        ValoracionConseNiño mires = new ValoracionConseNiño();
        mires.setCod_Respuesta_usuario(Codigo);
        ObjectSet result = Base.get(mires);
        return result.size();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JComboBox<String> CmBoxConsejosNiño;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JLabel LblImaConseNiño1;
    private javax.swing.JLabel LblImaConseNiño2;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblInformacionNiño1;
    private javax.swing.JLabel LblTitConseNiño1;
    private javax.swing.JLabel LblTitConseNiño2;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JTextArea TxtTextConsNiño1;
    private javax.swing.JTextArea TxtTextConsNiño2;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
