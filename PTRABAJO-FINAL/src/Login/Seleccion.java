/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Login.Inicio;
import Login.InicioPsicologo;
import Login.InicioNiño;
import Login.InicioRepresentante;

/**
 *
 * @author mauca
 */
public class Seleccion extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion
     */
    public Seleccion() {
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
        LbTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnInfante = new javax.swing.JButton();
        BtnPsicologo = new javax.swing.JButton();
        BtnAdmin = new javax.swing.JButton();
        BtnRepresentante = new javax.swing.JButton();
        Pariente = new javax.swing.JLabel();
        Infante = new javax.swing.JLabel();
        Psicologo = new javax.swing.JLabel();
        Admin = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        PanelImagen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        LbTitulo.setText("Inicia Sesión En:");
        jPanel1.add(LbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 370, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 350, 10));

        BtnInfante.setBackground(new java.awt.Color(255, 255, 255));
        BtnInfante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hermana-y-hermano.png"))); // NOI18N
        BtnInfante.setBorder(null);
        BtnInfante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInfanteActionPerformed(evt);
            }
        });
        jPanel1.add(BtnInfante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 170, 80));

        BtnPsicologo.setBackground(new java.awt.Color(255, 255, 255));
        BtnPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/terapia.png"))); // NOI18N
        BtnPsicologo.setBorder(null);
        BtnPsicologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPsicologoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPsicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 170, 80));

        BtnAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin-con-ruedas-dentadas.png"))); // NOI18N
        BtnAdmin.setBorder(null);
        BtnAdmin.setBorderPainted(false);
        BtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 170, 80));

        BtnRepresentante.setBackground(new java.awt.Color(255, 255, 255));
        BtnRepresentante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Familia.png"))); // NOI18N
        BtnRepresentante.setBorder(null);
        BtnRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRepresentanteActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRepresentante, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 170, 80));

        Pariente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Pariente.setText("REPRESENTANTE");
        jPanel1.add(Pariente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        Infante.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Infante.setText("NIÑO/NIÑA");
        jPanel1.add(Infante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        Psicologo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Psicologo.setText("PSICOLÓGO/A");
        jPanel1.add(Psicologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        Admin.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Admin.setText("ADMINISTRADOR");
        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 120, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 70, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 100, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 110, 10));

        PanelImagen.setBackground(new java.awt.Color(0, 0, 0));
        PanelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"))); // NOI18N
        PanelImagen.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 480));

        jPanel1.add(PanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 240, 500));

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 60, 40));

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

    private void BtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdminActionPerformed
        IniciaAdmin admin = new IniciaAdmin();
            admin.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnAdminActionPerformed

    private void BtnRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRepresentanteActionPerformed
        InicioRepresentante repre = new InicioRepresentante();
            repre.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnRepresentanteActionPerformed

    private void BtnPsicologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPsicologoActionPerformed
        InicioPsicologo psicologo = new InicioPsicologo();
            psicologo.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnPsicologoActionPerformed

    private void BtnInfanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInfanteActionPerformed
        InicioNiño infante = new InicioNiño();
            infante.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnInfanteActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inicio ini = new Inicio();
            ini.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admin;
    private javax.swing.JButton BtnAdmin;
    private javax.swing.JButton BtnInfante;
    private javax.swing.JButton BtnPsicologo;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnRepresentante;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Infante;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JPanel PanelImagen;
    private javax.swing.JLabel Pariente;
    private javax.swing.JLabel Psicologo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
