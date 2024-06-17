/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


import controlador_VISTA.ClienteDAO;
import controlador_VISTA.VeterinarioDAO;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author alexa
 */
public class Ventana_Veterinario extends javax.swing.JFrame {
   
   VeterinarioDAO vista;
    public Ventana_Veterinario() {
        initComponents();
        vista= new VeterinarioDAO(this);
       
    }

    public JButton getBtnActualizar() {
        return BtnActualizar;
    }

    public void setBtnActualizar(JButton BtnActualizar) {
        this.BtnActualizar = BtnActualizar;
    }

    

    public JButton getBtnCrear() {
        return BtnCrear;
    }

    public void setBtnCrear(JButton BtnCrear) {
        this.BtnCrear = BtnCrear;
    }

    public JButton getBtnEliminar() {
        return BtnEliminar;
    }

    public void setBtnEliminar(JButton BtnEliminar) {
        this.BtnEliminar = BtnEliminar;
    }


    public JButton getBtnModificar() {
        return BtnModificar;
    }

    public void setBtnModificar(JButton BtnModificar) {
        this.BtnModificar = BtnModificar;
    }

    public JButton getBtnRegresar_area() {
        return BtnRegresar_Veterinario;
    }

    public void setBtnRegresar_area(JButton BtnRegresar_area) {
        this.BtnRegresar_Veterinario = BtnRegresar_area;
    }

    public JTable getTabla_Cliente() {
        return Tabla_Veterinario;
    }

    public void setTabla_Cliente(JTable Tabla_Cliente) {
        this.Tabla_Veterinario = Tabla_Cliente;
    }

 
    

    public JTextField getTexto_Direccion() {
        return Texto_Direccion;
    }

    public void setTexto_Direccion(JTextField Texto_Direccion) {
        this.Texto_Direccion = Texto_Direccion;
    }

    public JTextField getTexto_Email() {
        return Texto_Especialidad;
    }

    public void setTexto_Email(JTextField Texto_Email) {
        this.Texto_Especialidad = Texto_Email;
    }

 
    public JTextField getTexto_Nombre() {
        return Texto_Nombre;
    }

    public void setTexto_Nombre(JTextField Texto_Nombre) {
        this.Texto_Nombre = Texto_Nombre;
    }

    public JTextField getTexto_Telefono() {
        return Texto_Telefono;
    }

    public void setTexto_Telefono(JTextField Texto_Telefono) {
        this.Texto_Telefono = Texto_Telefono;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JButton getBtnRegresar_Veterinario() {
        return BtnRegresar_Veterinario;
    }

    public void setBtnRegresar_Veterinario(JButton BtnRegresar_Veterinario) {
        this.BtnRegresar_Veterinario = BtnRegresar_Veterinario;
    }

    public JTable getTabla_Veterinario() {
        return Tabla_Veterinario;
    }

    public void setTabla_Veterinario(JTable Tabla_Veterinario) {
        this.Tabla_Veterinario = Tabla_Veterinario;
    }

    public JTextField getTexto_Especialidad() {
        return Texto_Especialidad;
    }

    public void setTexto_Especialidad(JTextField Texto_Especialidad) {
        this.Texto_Especialidad = Texto_Especialidad;
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnCrear = new javax.swing.JButton();
        Texto_Especialidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Veterinario = new javax.swing.JTable();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnRegresar_Veterinario = new javax.swing.JButton();
        Texto_Telefono = new javax.swing.JTextField();
        Texto_Direccion = new javax.swing.JTextField();
        Texto_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnActualizar = new javax.swing.JButton();
        Texto_Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCrear.setText("CREAR");
        BtnCrear.setToolTipText("");
        BtnCrear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(BtnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 130, -1));

        Texto_Especialidad.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        Texto_Especialidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(153, 153, 255)));
        jPanel1.add(Texto_Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, 30));

        jPanel2.setBackground(new java.awt.Color(36, 149, 235));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_Veterinario.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        Tabla_Veterinario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Veterinario.setRowHeight(30);
        jScrollPane1.setViewportView(Tabla_Veterinario);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 240, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 300, 310));

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 130, 20));

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 130, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 570, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel2.setText("Telefono");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        jPanel3.setBackground(new java.awt.Color(36, 149, 235));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(35, 144, 227));

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 3, 27)); // NOI18N
        jLabel3.setText("Veterinario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 50));

        BtnRegresar_Veterinario.setText("Volver");
        jPanel1.add(BtnRegresar_Veterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 30));

        Texto_Telefono.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        Texto_Telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(153, 153, 255)));
        jPanel1.add(Texto_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 220, 30));

        Texto_Direccion.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        Texto_Direccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(153, 153, 255)));
        jPanel1.add(Texto_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 30));

        Texto_Nombre.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        Texto_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(153, 153, 255)));
        jPanel1.add(Texto_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel7.setText("Especialidad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        jLabel9.setText("Direccion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

        BtnActualizar.setText("Cargar");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 100, 20));

        Texto_Email.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        Texto_Email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(153, 153, 255)));
        jPanel1.add(Texto_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Veterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnRegresar_Veterinario;
    private javax.swing.JTable Tabla_Veterinario;
    private javax.swing.JTextField Texto_Direccion;
    private javax.swing.JTextField Texto_Email;
    private javax.swing.JTextField Texto_Especialidad;
    private javax.swing.JTextField Texto_Nombre;
    private javax.swing.JTextField Texto_Telefono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
