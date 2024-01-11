/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import BBDD.Contenedor_Base;
import Login.RegistrarseGeneral;
import com.db4o.*;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import Clases.*;

/**
 *
 * @author mauca
 */
public class RegistrarseAdmin extends javax.swing.JFrame {

     ObjectContainer Base;
    
    public RegistrarseAdmin() {
        
          Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGpDiscaAdmin = new javax.swing.ButtonGroup();
        BtnGrpSexoAdmin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnFemeninoAdmin = new javax.swing.JRadioButton();
        BtnMasculinoAdmin = new javax.swing.JRadioButton();
        BtnSiDiscaAdmin = new javax.swing.JRadioButton();
        BtnNoDiscaAdmin = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        TxtApelliAdmin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TxtNombreAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DateFechaNaciAdmin = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        TxtCedulaAdmin = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Nacionalidad = new javax.swing.JLabel();
        CmBxExperienciAdmin = new javax.swing.JComboBox<>();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        TxtDirecdmin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        BtnRegistrarAdmin = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        NvContraAdmin = new javax.swing.JPasswordField();
        jSeparator15 = new javax.swing.JSeparator();
        CmbBxNacionalidad2Admin = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        TxtTituloAdmin = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        CfContraAdmin = new javax.swing.JPasswordField();
        BtnRegresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin-con-ruedas-dentadas.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 70));

        BtnGrpSexoAdmin.add(BtnFemeninoAdmin);
        BtnFemeninoAdmin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnFemeninoAdmin.setText("Femenino");
        jPanel2.add(BtnFemeninoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        BtnGrpSexoAdmin.add(BtnMasculinoAdmin);
        BtnMasculinoAdmin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnMasculinoAdmin.setText("Masculino");
        BtnMasculinoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasculinoAdminActionPerformed(evt);
            }
        });
        jPanel2.add(BtnMasculinoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        BtnGpDiscaAdmin.add(BtnSiDiscaAdmin);
        BtnSiDiscaAdmin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnSiDiscaAdmin.setText("Si");
        BtnSiDiscaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiDiscaAdminActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSiDiscaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        BtnGpDiscaAdmin.add(BtnNoDiscaAdmin);
        BtnNoDiscaAdmin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnNoDiscaAdmin.setText("No");
        jPanel2.add(BtnNoDiscaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Discapacidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 40, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 40, 10));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 170, 10));

        TxtApelliAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtApelliAdmin.setForeground(new java.awt.Color(153, 153, 153));
        TxtApelliAdmin.setText("Ingrese sus Apellidos");
        TxtApelliAdmin.setBorder(null);
        TxtApelliAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtApelliAdminMousePressed(evt);
            }
        });
        TxtApelliAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApelliAdminActionPerformed(evt);
            }
        });
        jPanel2.add(TxtApelliAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 170, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Confrimar Contraseña:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 267, -1, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 10));

        TxtNombreAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtNombreAdmin.setForeground(new java.awt.Color(153, 153, 153));
        TxtNombreAdmin.setText("Ingrese sus Nombres");
        TxtNombreAdmin.setBorder(null);
        TxtNombreAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNombreAdminMousePressed(evt);
            }
        });
        TxtNombreAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreAdminActionPerformed(evt);
            }
        });
        jPanel2.add(TxtNombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));
        jPanel2.add(DateFechaNaciAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 160, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRARSE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        TxtCedulaAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtCedulaAdmin.setForeground(new java.awt.Color(153, 153, 153));
        TxtCedulaAdmin.setText("Ingrese su cedula");
        TxtCedulaAdmin.setBorder(null);
        TxtCedulaAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtCedulaAdminMousePressed(evt);
            }
        });
        TxtCedulaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCedulaAdminActionPerformed(evt);
            }
        });
        jPanel2.add(TxtCedulaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 160, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 160, 10));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Cedula:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        Nacionalidad.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Nacionalidad.setText("Nacionalidad:");
        jPanel2.add(Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        CmBxExperienciAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-2 años", "3-5 años", "6-10 años", "más de 10 años" }));
        CmBxExperienciAdmin.setBorder(null);
        CmBxExperienciAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmBxExperienciAdminActionPerformed(evt);
            }
        });
        jPanel2.add(CmBxExperienciAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 170, -1));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 10));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 170, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("Experiencia:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 170, 10));

        TxtDirecdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtDirecdmin.setForeground(new java.awt.Color(153, 153, 153));
        TxtDirecdmin.setText("Ingrese su Dirección");
        TxtDirecdmin.setBorder(null);
        TxtDirecdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtDirecdminMousePressed(evt);
            }
        });
        TxtDirecdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDirecdminActionPerformed(evt);
            }
        });
        jPanel2.add(TxtDirecdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Dirección:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Nueva Contraseña:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 170, 10));

        BtnRegistrarAdmin.setText("Registrarse");
        BtnRegistrarAdmin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegistrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarAdminActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRegistrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 100, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Apellidos:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        NvContraAdmin.setForeground(new java.awt.Color(153, 153, 153));
        NvContraAdmin.setText("**********");
        NvContraAdmin.setBorder(null);
        NvContraAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NvContraAdminMousePressed(evt);
            }
        });
        NvContraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NvContraAdminActionPerformed(evt);
            }
        });
        jPanel2.add(NvContraAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 170, -1));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 170, 10));

        CmbBxNacionalidad2Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ecuatoriano", "Colombiano", "Venezolano", "Peruano", "Argentino", "Brazileño" }));
        CmbBxNacionalidad2Admin.setBorder(null);
        CmbBxNacionalidad2Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBxNacionalidad2AdminActionPerformed(evt);
            }
        });
        jPanel2.add(CmbBxNacionalidad2Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 170, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Título:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        TxtTituloAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtTituloAdmin.setForeground(new java.awt.Color(153, 153, 153));
        TxtTituloAdmin.setText("Ingrese su Título");
        TxtTituloAdmin.setBorder(null);
        TxtTituloAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtTituloAdminMousePressed(evt);
            }
        });
        TxtTituloAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloAdminActionPerformed(evt);
            }
        });
        jPanel2.add(TxtTituloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, -1));
        jPanel2.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 170, 10));

        CfContraAdmin.setForeground(new java.awt.Color(153, 153, 153));
        CfContraAdmin.setText("**********");
        CfContraAdmin.setBorder(null);
        CfContraAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CfContraAdminMousePressed(evt);
            }
        });
        CfContraAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfContraAdminActionPerformed(evt);
            }
        });
        jPanel2.add(CfContraAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 700, 390));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 50, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen de WhatsApp 2024-01-03 a las 07.58.17_8bdfab4c.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMasculinoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasculinoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMasculinoAdminActionPerformed

    private void BtnSiDiscaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiDiscaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSiDiscaAdminActionPerformed

    private void TxtApelliAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApelliAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApelliAdminActionPerformed

    private void TxtNombreAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreAdminActionPerformed

    private void TxtCedulaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCedulaAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCedulaAdminActionPerformed

    private void CmBxExperienciAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmBxExperienciAdminActionPerformed

        //CmbBxNacionalidad.addItem(nacionalidad);
    }//GEN-LAST:event_CmBxExperienciAdminActionPerformed

    private void TxtDirecdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDirecdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDirecdminActionPerformed

    private void NvContraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NvContraAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NvContraAdminActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        RegistrarseGeneral general = new RegistrarseGeneral();
        general.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void CmbBxNacionalidad2AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBxNacionalidad2AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbBxNacionalidad2AdminActionPerformed

    private void TxtTituloAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloAdminActionPerformed

    private void CfContraAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfContraAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfContraAdminActionPerformed

    private void TxtNombreAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNombreAdminMousePressed
        if (TxtNombreAdmin.getText().equals("Ingrese sus Nombres")) {
            TxtNombreAdmin.setText("");
            TxtNombreAdmin.setForeground(Color.black);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        if (TxtDirecdmin.getText().isEmpty()) {
            TxtDirecdmin.setText("Ingrese su Dirección");
            TxtDirecdmin.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtNombreAdminMousePressed

    private void TxtApelliAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtApelliAdminMousePressed
        if (TxtApelliAdmin.getText().equals("Ingrese sus Apellidos")) {
            TxtApelliAdmin.setText("");
            TxtApelliAdmin.setForeground(Color.black);
        }
        
        if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        if (TxtDirecdmin.getText().isEmpty()) {
            TxtDirecdmin.setText("Ingrese su Dirección");
            TxtDirecdmin.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtApelliAdminMousePressed

    private void TxtTituloAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTituloAdminMousePressed
        if (TxtTituloAdmin.getText().equals("Ingrese su Título")) {
            TxtTituloAdmin.setText("");
            TxtTituloAdmin.setForeground(Color.black);
        }
        
        if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        if (TxtDirecdmin.getText().isEmpty()) {
            TxtDirecdmin.setText("Ingrese su Dirección");
            TxtDirecdmin.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtTituloAdminMousePressed

    private void TxtCedulaAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtCedulaAdminMousePressed
        if (TxtCedulaAdmin.getText().equals("Ingrese su cedula")) {
            TxtCedulaAdmin.setText("");
            TxtCedulaAdmin.setForeground(Color.black);
        }
        
        if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtDirecdmin.getText().isEmpty()) {
            TxtDirecdmin.setText("Ingrese su Dirección");
            TxtDirecdmin.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtCedulaAdminMousePressed

    private void TxtDirecdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtDirecdminMousePressed
        if (TxtDirecdmin.getText().equals("Ingrese su Dirección")) {
            TxtDirecdmin.setText("");
            TxtDirecdmin.setForeground(Color.black);
        }
        
        if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtDirecdminMousePressed

    private void NvContraAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NvContraAdminMousePressed
         if (String.valueOf(NvContraAdmin.getPassword()).equals("**********")) {
            NvContraAdmin.setText("");
            NvContraAdmin.setForeground(Color.black);
        }
         if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        
        if (String.valueOf(CfContraAdmin.getPassword()).isEmpty()) {
            CfContraAdmin.setText("**********");
            CfContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NvContraAdminMousePressed

    private void CfContraAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CfContraAdminMousePressed
        if (String.valueOf(CfContraAdmin.getPassword()).equals("**********")) {
            CfContraAdmin.setText("");
            CfContraAdmin.setForeground(Color.black);
        }
         if (TxtNombreAdmin.getText().isEmpty()) {
            TxtNombreAdmin.setText("Ingrese sus Nombres");
            TxtNombreAdmin.setForeground(Color.gray);
        }
        
        if (TxtApelliAdmin.getText().isEmpty()) {
            TxtApelliAdmin.setText("Ingrese sus Apellidos");
            TxtApelliAdmin.setForeground(Color.gray);
        }
        if (TxtTituloAdmin.getText().isEmpty()) {
            TxtTituloAdmin.setText("Ingrese su Título");
            TxtTituloAdmin.setForeground(Color.gray);
        }
        if (TxtCedulaAdmin.getText().isEmpty()) {
            TxtCedulaAdmin.setText("Ingrese su cedula");
            TxtCedulaAdmin.setForeground(Color.gray);
        }
        
        if (String.valueOf(NvContraAdmin.getPassword()).isEmpty()) {
            NvContraAdmin.setText("**********");
            NvContraAdmin.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CfContraAdminMousePressed

    private void BtnRegistrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarAdminActionPerformed
       try {
            String sexo;
            String Discapacidad;

            Persona Mipersona = new Persona();

            Mipersona.setCedula(TxtCedulaAdmin.getText());

            Mipersona.setNombre(TxtNombreAdmin.getText());
            Mipersona.setApellido(TxtApelliAdmin.getText());
            Mipersona.setDireccion(TxtDirecdmin.getText());
            Mipersona.setFecha_Nacimiento(DateFechaNaciAdmin.getDate());
            if (BtnFemeninoAdmin.isSelected()) {
                sexo = "F";
            } else {
                sexo = "M";
            }

            Mipersona.setSexo(sexo.charAt(0));
            Mipersona.setNacionalidad(CmbBxNacionalidad2Admin.getSelectedItem().toString());

            if (BtnSiDiscaAdmin.isSelected()) {
                Discapacidad = "Si";
            } else {
                Discapacidad = "No";
            }
            Mipersona.setDiscapacidad(Discapacidad);

            Mipersona.setContraseña(String.valueOf(NvContraAdmin.getPassword()));

            Base.store(Mipersona);

            Administrador miAdmin = new Administrador();
            miAdmin.setID_Admin(Calcular_IDAdmin(Base));
            miAdmin.setFK_Cedula(TxtCedulaAdmin.getText());
            // miAdmin.setAños_Experiencia(CmBxExperienciAdmin.getSelectedItem().toString());
            miAdmin.setPuesto(TxtTituloAdmin.getText());
            Base.store(miAdmin);
            javax.swing.JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente");

        } catch (Exception e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Hay un error");
        } finally {
            Base.close();
            PagPrincipalAdmin PrinAdmin = new PagPrincipalAdmin();
            PrinAdmin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BtnRegistrarAdminActionPerformed

    public static String Calcular_IDAdmin(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("AD-", Incremental);

            if (Verificar_CodigoAdmin(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }

    public static int Verificar_CodigoAdmin(ObjectContainer Base, String cedula) {

        Administrador Adminis = new Administrador();
        Adminis.setID_Admin(cedula);
        ObjectSet result = Base.get(Adminis);

        return result.size();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnFemeninoAdmin;
    private javax.swing.ButtonGroup BtnGpDiscaAdmin;
    private javax.swing.ButtonGroup BtnGrpSexoAdmin;
    private javax.swing.JRadioButton BtnMasculinoAdmin;
    private javax.swing.JRadioButton BtnNoDiscaAdmin;
    private javax.swing.JButton BtnRegistrarAdmin;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JRadioButton BtnSiDiscaAdmin;
    private javax.swing.JPasswordField CfContraAdmin;
    private javax.swing.JComboBox<String> CmBxExperienciAdmin;
    private javax.swing.JComboBox<String> CmbBxNacionalidad2Admin;
    private com.toedter.calendar.JDateChooser DateFechaNaciAdmin;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Nacionalidad;
    private javax.swing.JPasswordField NvContraAdmin;
    private javax.swing.JTextField TxtApelliAdmin;
    private javax.swing.JTextField TxtCedulaAdmin;
    private javax.swing.JTextField TxtDirecdmin;
    private javax.swing.JTextField TxtNombreAdmin;
    private javax.swing.JTextField TxtTituloAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
