/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;

/**
 *
 * @author Joel
 */
public class InicioNiño extends javax.swing.JFrame {

    /**
     * Creates new form Login_niño
     */
    public InicioNiño() {
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
        txtUsuario = new javax.swing.JLabel();
        txtContra = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_contr = new javax.swing.JPasswordField();
        Pnl_Ingre = new javax.swing.JPanel();
        TXT_Ingre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIniciarSesion = new javax.swing.JLabel();
        icono_niños = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lblMano = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setText("Usuario:");
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        txtContra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContra.setText("Contraseña:");
        jPanel2.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 160, -1));

        txt_contr.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_contr.setForeground(new java.awt.Color(204, 204, 204));
        txt_contr.setText("**********");
        txt_contr.setBorder(null);
        txt_contr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contrMousePressed(evt);
            }
        });
        txt_contr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contrActionPerformed(evt);
            }
        });
        jPanel2.add(txt_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 169, -1));

        Pnl_Ingre.setBackground(new java.awt.Color(102, 204, 255));

        TXT_Ingre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TXT_Ingre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXT_Ingre.setText("INICIAR SESIÓN");
        TXT_Ingre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Ingre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXT_IngreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TXT_IngreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TXT_IngreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Pnl_IngreLayout = new javax.swing.GroupLayout(Pnl_Ingre);
        Pnl_Ingre.setLayout(Pnl_IngreLayout);
        Pnl_IngreLayout.setHorizontalGroup(
            Pnl_IngreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXT_Ingre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        Pnl_IngreLayout.setVerticalGroup(
            Pnl_IngreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXT_Ingre, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel2.add(Pnl_Ingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 269, 10));

        txtIniciarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIniciarSesion.setText("Iniciar Sesión");
        jPanel2.add(txtIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        icono_niños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hermana-y-hermano.png"))); // NOI18N
        jPanel2.add(icono_niños, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 70, 100));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 168, 20));

        lblMano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresion-de-la-mano.png"))); // NOI18N
        jPanel2.add(lblMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 310, 420));

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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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

    private void txt_contrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contrMousePressed
        if (String.valueOf(txt_contr.getPassword()).equals("**********")) {
            txt_contr.setText("");
            txt_contr.setForeground(Color.BLACK);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Usuario");
            txt_usuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txt_contrMousePressed

    private void txt_contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrActionPerformed

    private void TXT_IngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseClicked
        if (!txt_usuario.getText().equals("Usuario")) {
            if (!String.valueOf(txt_contr.getPassword()).equals("**********")) {
                

                    if (txt_usuario.getText().equals("0123456789") && String.valueOf(txt_contr.getPassword()).equals("1234")) {
                        javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE");
                        PagPrincipalNiñ Prin=new PagPrincipalNiñ();
                        Prin.setVisible(true);
                        this.setVisible(false);
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE\n Usuario: 0123456789\nContraseña:1234", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
                    }

                

            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Ingresa una Contraseña", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresa un Usuario", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_TXT_IngreMouseClicked

    private void TXT_IngreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseEntered
        Pnl_Ingre.setBackground(Color.white);
        TXT_Ingre.setForeground(new Color(102, 204, 255));
    }//GEN-LAST:event_TXT_IngreMouseEntered

    private void TXT_IngreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseExited
        Pnl_Ingre.setBackground(new Color(102, 204, 255));
        TXT_Ingre.setForeground(Color.black);
    }//GEN-LAST:event_TXT_IngreMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Usuario")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txt_contr.getPassword()).isEmpty()) {
            txt_contr.setText("**********");
            txt_contr.setForeground(Color.gray);

        }

    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Seleccion selec = new Seleccion();
        selec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel Pnl_Ingre;
    private javax.swing.JLabel TXT_Ingre;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono_niños;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblMano;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtIniciarSesion;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JPasswordField txt_contr;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
