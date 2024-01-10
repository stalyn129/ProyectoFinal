/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.awt.Color;

/**
 *
 * @author alexa
 */
public class InicioRepresentante extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Pepresent
     */
    public InicioRepresentante() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txt_contr = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Pnl_Ingre = new javax.swing.JPanel();
        TXT_Ingre = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Iniciar Sesión Representante");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 170, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, -1));

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
        jPanel2.add(txt_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 169, -1));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Usuario_Represent");
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
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 168, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Familia.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 110));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 340, 10));

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
            .addGroup(Pnl_IngreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TXT_Ingre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_IngreLayout.setVerticalGroup(
            Pnl_IngreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TXT_Ingre, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel2.add(Pnl_Ingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 340, 410));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
            txt_contr.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Usuario_Represent");
            txt_usuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txt_contrMousePressed

    private void txt_contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrActionPerformed

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Usuario_Represent")) {
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

    private void TXT_IngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseClicked
        if (!txt_usuario.getText().equals("Usuario_Represent")) {
            if (!String.valueOf(txt_contr.getPassword()).equals("**********")) {

                if (txt_usuario.getText().equals("0123456789") && String.valueOf(txt_contr.getPassword()).equals("1234")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE");
                    PagPrincipalRepresentante non = new PagPrincipalRepresentante();
                    non.setVisible(true);
                    this.setVisible(false);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE\n Usuario: 0123456789\nContraseña: 1234", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
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

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Seleccion selec = new Seleccion();
        selec.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPanel Pnl_Ingre;
    private javax.swing.JLabel TXT_Ingre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txt_contr;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
