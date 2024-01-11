/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import Clases.Administrador;
import Clases.Persona;
import Login.Seleccion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Color;

/**
 *
 * @author alexa
 */
public class IniciaAdmin extends javax.swing.JFrame {
String codigoAdmin="Admin2003";
ObjectContainer Base;
    /**
     * Creates new form login
     */
    public IniciaAdmin() {
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
        BtnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txt_contr = new javax.swing.JPasswordField();
        Pnl_Ingre = new javax.swing.JPanel();
        TXT_Ingre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cod_ad = new javax.swing.JPasswordField();
        txt_usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 160, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 150, -1));

        jSeparator6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, -1));

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
        jPanel2.add(txt_contr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 169, -1));

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
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 269, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Iniciar Sesión ADMIN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 11, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/admin-con-ruedas-dentadas.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 37, 136, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Codigo Admin: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txt_cod_ad.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_cod_ad.setForeground(new java.awt.Color(204, 204, 204));
        txt_cod_ad.setText("**********");
        txt_cod_ad.setBorder(null);
        txt_cod_ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_cod_adMousePressed(evt);
            }
        });
        jPanel2.add(txt_cod_ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 148, -1));

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Usuario_Admin");
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
        jPanel2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 168, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 310, 410));

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

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_contrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contrActionPerformed

    private void TXT_IngreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseEntered
        Pnl_Ingre.setBackground(Color.white);
        TXT_Ingre.setForeground(new Color(102, 204, 255));
    }//GEN-LAST:event_TXT_IngreMouseEntered

    private void TXT_IngreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseExited
        Pnl_Ingre.setBackground(new Color(102, 204, 255));
        TXT_Ingre.setForeground(Color.black);
    }//GEN-LAST:event_TXT_IngreMouseExited

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Usuario_Admin")) {
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txt_contr.getPassword()).isEmpty()) {
            txt_contr.setText("**********");
            txt_contr.setForeground(Color.gray);

        }
        if (String.valueOf(txt_cod_ad.getPassword()).isEmpty()) {
            txt_cod_ad.setText("**********");
            txt_cod_ad.setForeground(Color.gray);
        }


    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_contrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contrMousePressed
        if (String.valueOf(txt_contr.getPassword()).equals("**********")) {
            txt_contr.setText("");
            txt_contr.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Usuario_Admin");
            txt_usuario.setForeground(Color.gray);
        }
        if (String.valueOf(txt_cod_ad.getPassword()).isEmpty()) {
            txt_cod_ad.setText("**********");
            txt_cod_ad.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txt_contrMousePressed

    private void txt_cod_adMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cod_adMousePressed
        if (String.valueOf(txt_cod_ad.getPassword()).equals("**********")) {
            txt_cod_ad.setText("");
            txt_cod_ad.setForeground(Color.black);
        }
        if (String.valueOf(txt_contr.getPassword()).isEmpty()) {
            txt_contr.setText("**********");
            txt_contr.setForeground(Color.gray);
        }
        if (txt_usuario.getText().isEmpty()) {
            txt_usuario.setText("Usuario_Admin");
            txt_usuario.setForeground(Color.gray);
        }


    }//GEN-LAST:event_txt_cod_adMousePressed

    private void TXT_IngreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXT_IngreMouseClicked
        if (!txt_usuario.getText().equals("Usuario_Admin")) {
            if (!String.valueOf(txt_contr.getPassword()).equals("**********")) {

                if (Buscar_persona(Base, txt_usuario.getText(), String.valueOf(txt_contr.getPassword())) == 1) {

                    if (Buscar_usua_Administrador(Base, txt_usuario.getText()) == 1) {

                        if (String.valueOf(txt_cod_ad.getPassword()).equals(codigoAdmin)) {
                            
                            
                            javax.swing.JOptionPane.showMessageDialog(this, "INGRESO CORRECTAMENTE");
                            PagPrincipalAdmin elpagina = new PagPrincipalAdmin();
                            elpagina.setVisible(true);
                            this.setVisible(false);
                        } else {
                            javax.swing.JOptionPane.showMessageDialog(this, "La clave de Administrador es incorrecta");
                        }

                    } else {
                        javax.swing.JOptionPane.showMessageDialog(this, "Al parecer el usuario registrano no es un Administrador");

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

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
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

    public static int Buscar_usua_Administrador(ObjectContainer Base, String ususario) {
        Administrador elpici = new Administrador();
        elpici.setFK_Cedula(ususario);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField txt_cod_ad;
    private javax.swing.JPasswordField txt_contr;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
