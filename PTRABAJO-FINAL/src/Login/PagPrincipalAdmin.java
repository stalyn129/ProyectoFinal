/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Administrador;
import Clases.Niño;
import Clases.Persona;
import Clases.Psicologo;
import Clases.Representante;
import Clases.UserDataSingleton;
import com.db4o.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Joel
 */
public class PagPrincipalAdmin extends javax.swing.JFrame {

    ObjectContainer Base;
    UserDataSingleton usarData;
    
    
    public PagPrincipalAdmin() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        mostrar_diagrama();
        usarData = UserDataSingleton.getInstance();
        Mostra_usuario(Base);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnParentescoAdmin = new javax.swing.JButton();
        BtnDiscaAdmin = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BtnEspeciAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnNacionalidad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BtnUsuario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        panel_grafic = new javax.swing.JPanel();
        BtnReportes = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnPersonalidadAdmin1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setDoubleBuffered(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(683, 470));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(683, 470));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel3.setText("PARENTESCO");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 30));

        BtnParentescoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnParentescoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ParentezcoAdmin.png"))); // NOI18N
        BtnParentescoAdmin.setToolTipText("Haz click aqui para entrar a la pestaña de Parentesco");
        BtnParentescoAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnParentescoAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnParentescoAdmin.setOpaque(false);
        BtnParentescoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnParentescoAdminActionPerformed(evt);
            }
        });
        jPanel5.add(BtnParentescoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 70, 50));

        BtnDiscaAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnDiscaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DiscaAdmin.png"))); // NOI18N
        BtnDiscaAdmin.setToolTipText("Haz click aqui para entrar a la pestaña de discapacidad");
        BtnDiscaAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnDiscaAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDiscaAdmin.setOpaque(false);
        BtnDiscaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDiscaAdminMouseClicked(evt);
            }
        });
        BtnDiscaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiscaAdminActionPerformed(evt);
            }
        });
        jPanel5.add(BtnDiscaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 70, 50));

        jLabel11.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel11.setText("DISCAPACIDAD");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, 30));

        BtnEspeciAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnEspeciAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EspeciAdmin.png"))); // NOI18N
        BtnEspeciAdmin.setToolTipText("Haz click aqui para entrar a la pestaña de Especialización");
        BtnEspeciAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnEspeciAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEspeciAdmin.setOpaque(false);
        BtnEspeciAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEspeciAdminActionPerformed(evt);
            }
        });
        jPanel5.add(BtnEspeciAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 70, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel1.setText("ESPECIALIZACIÓN");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 30));

        BtnNacionalidad.setBackground(new java.awt.Color(255, 255, 255));
        BtnNacionalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NacioAdmin.png"))); // NOI18N
        BtnNacionalidad.setToolTipText("Haz click aqui para entrar a la pestaña de Nacionalidades");
        BtnNacionalidad.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnNacionalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnNacionalidad.setOpaque(false);
        BtnNacionalidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNacionalidadMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnNacionalidadMouseExited(evt);
            }
        });
        BtnNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNacionalidadActionPerformed(evt);
            }
        });
        jPanel5.add(BtnNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 70, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel6.setText("NACIONALIDADES");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 30));

        BtnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UsuariosAdmin.png"))); // NOI18N
        BtnUsuario.setToolTipText("Haz click aqui para entrar a la pestaña de Usuarios");
        BtnUsuario.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnUsuario.setOpaque(false);
        BtnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(BtnUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 70, 50));

        jLabel10.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel10.setText("USUARIOS");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, 30));

        panel_grafic.setBackground(new java.awt.Color(255, 255, 255));
        panel_grafic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_grafic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_grafic.setMinimumSize(new java.awt.Dimension(200, 100));
        panel_grafic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_graficMouseClicked(evt);
            }
        });
        jPanel5.add(panel_grafic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 310, 230));

        BtnReportes.setBackground(new java.awt.Color(255, 255, 255));
        BtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe.png"))); // NOI18N
        BtnReportes.setToolTipText("Haz click aqui para entrar a la pestaña de Personalidad");
        BtnReportes.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnReportes.setOpaque(false);
        BtnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReportesActionPerformed(evt);
            }
        });
        jPanel5.add(BtnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 70, 50));

        jLabel12.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel12.setText("REPORTES");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        BtnPersonalidadAdmin1.setBackground(new java.awt.Color(255, 255, 255));
        BtnPersonalidadAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/obligations_11323649.png"))); // NOI18N
        BtnPersonalidadAdmin1.setToolTipText("Haz click aqui para entrar a la pestaña de Personalidad");
        BtnPersonalidadAdmin1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnPersonalidadAdmin1.setOpaque(false);
        BtnPersonalidadAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPersonalidadAdmin1ActionPerformed(evt);
            }
        });
        jPanel5.add(BtnPersonalidadAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 70, 50));

        jLabel13.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel13.setText("PERSONALIDAD");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 30));

        jScrollPane2.setViewportView(jPanel5);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 700, 390));

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

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        jLabel2.setText("BIENVENIDO A: \" NI UNO MAS\"");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        Txt_Nombre.setEditable(false);
        Txt_Nombre.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        Txt_Nombre.setOpaque(false);
        Txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 120, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 492, 120, 0));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        jLabel7.setText("Administrador:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 20));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAdmin.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-570, 0, 1380, 540));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setText(" ");
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        jMenu1.setToolTipText("Configuracion");

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
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.setToolTipText("Regresa a la página principal");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnParentescoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnParentescoAdminActionPerformed
        Base.close();
        Crud_Parentesco parentesco = new Crud_Parentesco();
        parentesco.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnParentescoAdminActionPerformed

    private void BtnNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNacionalidadActionPerformed
        Base.close();
        Crud_Nacionalidades Nacionalidad = new Crud_Nacionalidades();
        Nacionalidad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNacionalidadActionPerformed

    private void BtnEspeciAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEspeciAdminActionPerformed
        Base.close();
        Crud_Especialidad especia = new Crud_Especialidad();
        especia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnEspeciAdminActionPerformed

    private void BtnDiscaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiscaAdminActionPerformed
        Base.close();
        Crud_Discapacidad Disca = new Crud_Discapacidad();
        Disca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnDiscaAdminActionPerformed

    private void BtnNacionalidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNacionalidadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNacionalidadMouseExited

    private void BtnNacionalidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNacionalidadMouseClicked
//        Base.close();
//        Crud_Nacionalidades CNacio = new Crud_Nacionalidades();
//        CNacio.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_BtnNacionalidadMouseClicked

    private void BtnDiscaAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDiscaAdminMouseClicked
//        Base.close();
//        Crud_Discapacidad Cdisca = new Crud_Discapacidad();
//        Cdisca.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_BtnDiscaAdminMouseClicked

    private void panel_graficMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_graficMouseClicked

    }//GEN-LAST:event_panel_graficMouseClicked

    private void BtnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuarioActionPerformed
        Base.close();
        Reporte_Usuarios usa = new Reporte_Usuarios();
        usa.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_BtnUsuarioActionPerformed

    private void BtnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportesActionPerformed
        Base.close();

        Reportes personalidad = new Reportes();
        personalidad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnReportesActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        Base.close();
        IniciaAdmin loginadmin = new IniciaAdmin();
        loginadmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Base.close();
        PagPrincipalAdmin paginaprinciadmi = new PagPrincipalAdmin();
        paginaprinciadmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreActionPerformed

    private void BtnPersonalidadAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPersonalidadAdmin1ActionPerformed
        Base.close();
        Crud_Personalidad personalidad = new Crud_Personalidad();
          personalidad.setVisible(true);
                this.setVisible(false);  
    }//GEN-LAST:event_BtnPersonalidadAdmin1ActionPerformed
    public void mostrar_diagrama() {
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Administradores", Num_Administradores(Base));
        datos.setValue("Psicologos", Num_Psicologos(Base));
        datos.setValue("Representantes", Num_Representantes(Base));
        datos.setValue("Niños", Num_Niños(Base));

        JFreeChart grafico_circular = ChartFactory.createPieChart("Numero de tipos de Usuarios", datos, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(310, 230));

        panel_grafic.setLayout(new BorderLayout());
        panel_grafic.add(panel, BorderLayout.NORTH);

        pack();
        repaint();
    }

    public static int Num_Administradores(ObjectContainer Base) {
        Administrador admin = new Administrador();
        ObjectSet result = Base.get(admin);
        return result.size();
    }

    public static int Num_Psicologos(ObjectContainer Base) {
        Psicologo psic = new Psicologo();
        ObjectSet result = Base.get(psic);
        return result.size();
    }

    public static int Num_Representantes(ObjectContainer Base) {
        Representante repre = new Representante();
        ObjectSet result = Base.get(repre);
        return result.size();
    }

    public static int Num_Niños(ObjectContainer Base) {
        Niño nin = new Niño();
        ObjectSet result = Base.get(nin);
        return result.size();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnDiscaAdmin;
    private javax.swing.JButton BtnEspeciAdmin;
    private javax.swing.JButton BtnNacionalidad;
    private javax.swing.JButton BtnParentescoAdmin;
    private javax.swing.JButton BtnPersonalidadAdmin1;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnUsuario;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_grafic;
    // End of variables declaration//GEN-END:variables
public void Mostra_usuario(ObjectContainer Base) {
        String nombres = "";
        Administrador admin = new Administrador();
        admin.setID_Admin(usarData.getCod_Admin());
        ObjectSet result = Base.get(admin);

        while (result.hasNext()) {
            Administrador adm = (Administrador) result.next();

            String cedula = adm.getFK_Cedula();
            nombres = Sacar_persona(Base, cedula);
        }

        Txt_Nombre.setText(nombres);
    }

    public String Sacar_persona(ObjectContainer Base, String cod) {
        String nombre = "", apellido = "";
        Persona person = new Persona();
        person.setCedula(cod);
        ObjectSet result = Base.get(person);

        while (result.hasNext()) {
            Persona next = (Persona) result.next();
            nombre = next.getNombre();
            apellido = next.getApellido();

        }

        String NomCompleto = nombre + " " + apellido;

        return NomCompleto;
    }
}
