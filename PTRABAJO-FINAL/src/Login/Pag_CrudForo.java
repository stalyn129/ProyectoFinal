/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Joel
 */
public class Pag_CrudForo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Pag_CrudForo() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtIntroNiñoCuen = new javax.swing.JTextArea();
        TxtTitulo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        LblInfor2Niño1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableForos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setDoubleBuffered(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(700, 670));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 670));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 12)); // NOI18N
        LblInfor2Niño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño.setText("Título del foro:");
        jPanel3.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 330, 10));

        TxtIntroNiñoCuen.setColumns(20);
        TxtIntroNiñoCuen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        TxtIntroNiñoCuen.setLineWrap(true);
        TxtIntroNiñoCuen.setRows(5);
        TxtIntroNiñoCuen.setWrapStyleWord(true);
        TxtIntroNiñoCuen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TxtIntroNiñoCuen.setEnabled(false);
        jScrollPane5.setViewportView(TxtIntroNiñoCuen);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 330, 110));

        TxtTitulo.setText("Ingrese un título");
        TxtTitulo.setBorder(null);
        TxtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloActionPerformed(evt);
            }
        });
        jPanel3.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, -1));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 10));

        LblInfor2Niño1.setFont(new java.awt.Font("Rockwell Nova", 1, 12)); // NOI18N
        LblInfor2Niño1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblInfor2Niño1.setText("Descripción del foro");
        jPanel3.add(LblInfor2Niño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 120, -1));

        jTableForos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo_Foro", "Titulo", "Desripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableForos);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 630, 310));

        jButton1.setText("Publicar Foro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jButton2.setText("Modificar");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, -1, -1));

        btnEliminar.setText("Eliminar");
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 620, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("CRUD FOROS");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 710, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pag_CrudForo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pag_CrudForo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pag_CrudForo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pag_CrudForo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pag_CrudForo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInfor2Niño1;
    private javax.swing.JTextArea TxtIntroNiñoCuen;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTableForos;
    // End of variables declaration//GEN-END:variables
}
