/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Login.RegistrarseNiñ;
import Login.RegistrarsePariente;
import Login.RegistrarsePsicologo;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author mauca
 */
public class RegistrarseGeneral extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarseGeneral
     */
    public RegistrarseGeneral() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnInfanteRegist = new javax.swing.JButton();
        BtnPsicologoRegist = new javax.swing.JButton();
        Psicologo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Infante = new javax.swing.JLabel();
        BtnAdminRegist = new javax.swing.JButton();
        Admin = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Pariente = new javax.swing.JLabel();
        BtnRepresentanteRegist = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(105, 181, 12));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo3.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 280, 520));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        LbTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        LbTitulo.setText("Registrate Como:");
        jPanel1.add(LbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 380, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 370, 10));

        BtnInfanteRegist.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfanteRegist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hermana-y-hermano.png"))); // NOI18N
        BtnInfanteRegist.setBorder(null);
        BtnInfanteRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfanteRegistActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfanteRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, 80));

        BtnPsicologoRegist.setBackground(new java.awt.Color(255, 255, 255));
        BtnPsicologoRegist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terapia.png"))); // NOI18N
        BtnPsicologoRegist.setBorder(null);
        BtnPsicologoRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPsicologoRegistActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPsicologoRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 170, 80));

        Psicologo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Psicologo.setText("PSICOLÓGO/A");
        jPanel1.add(Psicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 10));

        Infante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Infante.setText("NIÑO/NIÑA");
        jPanel1.add(Infante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        BtnAdminRegist.setBackground(new java.awt.Color(255, 255, 255));
        BtnAdminRegist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin-con-ruedas-dentadas.png"))); // NOI18N
        BtnAdminRegist.setBorder(null);
        BtnAdminRegist.setBorderPainted(false);
        BtnAdminRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminRegistActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdminRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 170, 80));

        Admin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Admin.setText("ADMINISTRADOR");
        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 110, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 120, 10));

        Pariente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Pariente.setText("REPRESENTANTE");
        jPanel1.add(Pariente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        BtnRepresentanteRegist.setBackground(new java.awt.Color(255, 255, 255));
        BtnRepresentanteRegist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Familia.png"))); // NOI18N
        BtnRepresentanteRegist.setBorder(null);
        BtnRepresentanteRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepresentanteRegistActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRepresentanteRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 170, 80));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 60, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
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

    private void BtnInfanteRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfanteRegistActionPerformed
        RegistrarseNiñ infante = new RegistrarseNiñ();
        infante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnInfanteRegistActionPerformed

    private void BtnPsicologoRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPsicologoRegistActionPerformed
JPasswordField passwordField = new JPasswordField();
    int option = JOptionPane.showConfirmDialog(null, passwordField, "Ingrese el código de ingreso:", JOptionPane.OK_CANCEL_OPTION);

    if (option == JOptionPane.OK_OPTION) {
        char[] contra = passwordField.getPassword();
        String tokenIngresado = new String(contra);

        if (tokenIngresado.equals("PSICO123")) {
            RegistrarsePsicologo psicologo = new RegistrarsePsicologo();
            psicologo.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Código incorrecto. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Es importante borrar el contenido del array de caracteres que contiene la contraseña
        Arrays.fill(contra, ' ');
    }
    }//GEN-LAST:event_BtnPsicologoRegistActionPerformed

    private void BtnAdminRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminRegistActionPerformed
JPasswordField passwordField = new JPasswordField();
    int option = JOptionPane.showConfirmDialog(null, passwordField, "Ingrese el código de ingreso:", JOptionPane.OK_CANCEL_OPTION);

    if (option == JOptionPane.OK_OPTION) {
        char[] contra = passwordField.getPassword();
        String tokenIngresado = new String(contra);

        if (tokenIngresado.equals("ADMIN123")) {
            RegistrarseAdmin administrador = new RegistrarseAdmin();
            administrador.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Código incorrecto. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Es importante borrar el contenido del array de caracteres que contiene la contraseña
        Arrays.fill(contra, ' ');
    }
    }//GEN-LAST:event_BtnAdminRegistActionPerformed

    private void BtnRepresentanteRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepresentanteRegistActionPerformed
        RegistrarsePariente representante = new RegistrarsePariente();
        representante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRepresentanteRegistActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inicio  inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JButton BtnAdminRegist;
    private javax.swing.JButton BtnInfanteRegist;
    private javax.swing.JButton BtnPsicologoRegist;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnRepresentanteRegist;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Infante;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel Pariente;
    private javax.swing.JLabel Psicologo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
