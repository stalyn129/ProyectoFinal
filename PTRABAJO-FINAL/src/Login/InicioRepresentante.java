/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Persona;
import Clases.Representante;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;

/**
 *
 * @author alexa
 */
public class InicioRepresentante extends javax.swing.JFrame {

ObjectContainer Base;
    public InicioRepresentante() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_contr = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Pnl_Ingre = new javax.swing.JPanel();
        TXT_Ingre = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
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

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Iniciar Sesión Representante");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, -1));

        txt_contr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jPanel2.add(txt_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 20));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 260, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Familia.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 80));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 10));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_IngreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXT_Ingre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_IngreLayout.setVerticalGroup(
            Pnl_IngreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_IngreLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TXT_Ingre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(Pnl_Ingre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, 40));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 260, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 340, 410));

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

                if (Buscar_persona(Base, txt_usuario.getText(), String.valueOf(txt_contr.getPassword())) == 1) {

                    if (Buscar_usua_Representante(Base, txt_usuario.getText()) == 1) {
                        javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE");
                        Base.close();
                        PagPrincipalRepresentante elpagina = new PagPrincipalRepresentante();
                        elpagina.setVisible(true);
                        this.setVisible(false);
                        
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Al parecer el usuario registrano no es un representante");

                    }

                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Los datos no se encuentran registrados"
                            + " ");

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
        Base.close();
            Seleccion selec = new Seleccion();
                selec.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

public static int Buscar_persona(ObjectContainer Base, String Cedula, String Contraseña) {
        Persona elperson = new Persona();
        elperson.setCedula(Cedula);
        elperson.setContraseña(Contraseña);
        ObjectSet result = Base.get(elperson);
        return result.size();

    }

    public static int Buscar_usua_Representante(ObjectContainer Base, String ususario) {
        Representante elpici = new Representante();
        elpici.setFKCod_Cedula(ususario);
        ObjectSet result = Base.get(elpici);
        return result.size();

    }

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
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPasswordField txt_contr;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
