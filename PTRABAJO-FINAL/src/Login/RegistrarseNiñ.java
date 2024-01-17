/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Administrador;
import BBDD.Contenedor_Base;
import Clases.Niño;
import com.db4o.*;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class RegistrarseNiñ extends javax.swing.JFrame {
    
    private ObjectContainer Base;
    
    public RegistrarseNiñ(){
        
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

        BtnSexo = new javax.swing.ButtonGroup();
        BtnDiscapacidad = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BtnRegresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtApellidoNiño = new javax.swing.JTextField();
        TxtNombreNiño = new javax.swing.JTextField();
        BtnFemeninoNiñ = new javax.swing.JRadioButton();
        BtnMasculinoNiñ = new javax.swing.JRadioButton();
        BtnDiscapacidadNiñ = new javax.swing.JRadioButton();
        BtnDiscaNiñ = new javax.swing.JRadioButton();
        CmBxPersonalidad = new javax.swing.JComboBox<>();
        DateEdadNiño = new com.toedter.calendar.JDateChooser();
        Separador3 = new javax.swing.JSeparator();
        Separador1 = new javax.swing.JSeparator();
        Separador2 = new javax.swing.JSeparator();
        Separador4 = new javax.swing.JSeparator();
        BtnRegistrarseNiñ = new javax.swing.JButton();
        Separador8 = new javax.swing.JSeparator();
        Separador5 = new javax.swing.JSeparator();
        Separador6 = new javax.swing.JSeparator();
        Separador7 = new javax.swing.JSeparator();
        Separador9 = new javax.swing.JSeparator();
        TxtApodoNiño = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NvContraNiño = new javax.swing.JPasswordField();
        NuevaContraseña = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        CfContraNiño = new javax.swing.JPasswordField();
        ConfirmarContraseña = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hermana-y-hermano.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRARSE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Personalidad:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Nombres:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Edad:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Discapacidad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        TxtApellidoNiño.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtApellidoNiño.setForeground(new java.awt.Color(153, 153, 153));
        TxtApellidoNiño.setText("Ingrese sus Apellidos");
        TxtApellidoNiño.setBorder(null);
        TxtApellidoNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtApellidoNiñoMousePressed(evt);
            }
        });
        TxtApellidoNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoNiñoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtApellidoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 170, -1));

        TxtNombreNiño.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtNombreNiño.setForeground(new java.awt.Color(153, 153, 153));
        TxtNombreNiño.setText("Ingrese sus Nombres");
        TxtNombreNiño.setBorder(null);
        TxtNombreNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtNombreNiñoMousePressed(evt);
            }
        });
        TxtNombreNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreNiñoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtNombreNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, -1));

        BtnSexo.add(BtnFemeninoNiñ);
        BtnFemeninoNiñ.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnFemeninoNiñ.setText("Femenino");
        jPanel2.add(BtnFemeninoNiñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        BtnSexo.add(BtnMasculinoNiñ);
        BtnMasculinoNiñ.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnMasculinoNiñ.setText("Masculino");
        BtnMasculinoNiñ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasculinoNiñActionPerformed(evt);
            }
        });
        jPanel2.add(BtnMasculinoNiñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        BtnDiscapacidad.add(BtnDiscapacidadNiñ);
        BtnDiscapacidadNiñ.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnDiscapacidadNiñ.setText("Si");
        BtnDiscapacidadNiñ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiscapacidadNiñActionPerformed(evt);
            }
        });
        jPanel2.add(BtnDiscapacidadNiñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        BtnDiscapacidad.add(BtnDiscaNiñ);
        BtnDiscaNiñ.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnDiscaNiñ.setText("No");
        jPanel2.add(BtnDiscaNiñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        CmBxPersonalidad.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        CmBxPersonalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alegre", "Amigable", "Extrovertido", "Inteligente", "Creativo", "Tímido", "Introvertido" }));
        CmBxPersonalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmBxPersonalidadActionPerformed(evt);
            }
        });
        jPanel2.add(CmBxPersonalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, -1));
        jPanel2.add(DateEdadNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, -1));
        jPanel2.add(Separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 170, 10));
        jPanel2.add(Separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 10));
        jPanel2.add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 150, 10));
        jPanel2.add(Separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, 10));

        BtnRegistrarseNiñ.setText("Registrarse");
        BtnRegistrarseNiñ.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegistrarseNiñ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseNiñActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRegistrarseNiñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 100, 30));
        jPanel2.add(Separador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 40, 10));
        jPanel2.add(Separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 80, 10));
        jPanel2.add(Separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 80, 10));
        jPanel2.add(Separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 40, 10));
        jPanel2.add(Separador9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 160, 10));

        TxtApodoNiño.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtApodoNiño.setForeground(new java.awt.Color(153, 153, 153));
        TxtApodoNiño.setText("Ingrese su Apodo");
        TxtApodoNiño.setBorder(null);
        TxtApodoNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtApodoNiñoMousePressed(evt);
            }
        });
        TxtApodoNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApodoNiñoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtApodoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Apodo:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        NvContraNiño.setForeground(new java.awt.Color(153, 153, 153));
        NvContraNiño.setText("**********");
        NvContraNiño.setBorder(null);
        NvContraNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NvContraNiñoMousePressed(evt);
            }
        });
        NvContraNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NvContraNiñoActionPerformed(evt);
            }
        });
        jPanel2.add(NvContraNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 170, 20));

        NuevaContraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NuevaContraseña.setText("Nueva Contraseña:");
        jPanel2.add(NuevaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));
        jPanel2.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 170, 10));
        jPanel2.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 170, 10));

        CfContraNiño.setForeground(new java.awt.Color(153, 153, 153));
        CfContraNiño.setText("**********");
        CfContraNiño.setBorder(null);
        CfContraNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CfContraNiñoMousePressed(evt);
            }
        });
        CfContraNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfContraNiñoActionPerformed(evt);
            }
        });
        jPanel2.add(CfContraNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 170, 20));

        ConfirmarContraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ConfirmarContraseña.setText("Confrimar Contraseña:");
        jPanel2.add(ConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 650, 380));

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

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Base.close();
            RegistrarseGeneral general = new RegistrarseGeneral();
                general.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void TxtApellidoNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoNiñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoNiñoActionPerformed

    private void TxtNombreNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreNiñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreNiñoActionPerformed

    private void BtnMasculinoNiñActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasculinoNiñActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMasculinoNiñActionPerformed

    private void CmBxPersonalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmBxPersonalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmBxPersonalidadActionPerformed

    private void BtnDiscapacidadNiñActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiscapacidadNiñActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDiscapacidadNiñActionPerformed

    private void BtnRegistrarseNiñActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseNiñActionPerformed
        try {
            String sexo;
            String Discapacidad;

        Niño MiNiño = new Niño();

        MiNiño.setNombre(TxtNombreNiño.getText());
        MiNiño.setApellido(TxtApellidoNiño.getText());
        MiNiño.setFecha_Nacimiento(DateEdadNiño.getDate());
        if (BtnFemeninoNiñ.isSelected()) {
            sexo = "F";
        } else {
            sexo = "M";
        }

        MiNiño.setSexo_Niño(sexo.charAt(0));
        MiNiño.setPersonalidad(CmBxPersonalidad.getSelectedItem().toString());

            if (BtnDiscapacidadNiñ.isSelected()) {
                Discapacidad = "Si";
            }else {
                Discapacidad = "No";
            }
            MiNiño.setDiscapacidad(Discapacidad);
            

        Base.store(MiNiño); 
        javax.swing.JOptionPane.showMessageDialog(this,"Los datos se han guardado exitosamente");
           
        } catch (DatabaseClosedException | DatabaseReadOnlyException | HeadlessException e) {
        } finally{
        Base.close();
        PagPrincipalNiñ PrinNiño = new PagPrincipalNiñ();
        PrinNiño.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_BtnRegistrarseNiñActionPerformed

    public static String Calcular_ID_Niño(ObjectContainer Base) {

        boolean rest = true;
        int Incremental = 0;
        String Codigo;
        do {

            Incremental++;

            Codigo = String.format("N%03d", Incremental);

            if (Verificar_CodigoNiño(Base, Codigo) == 0) {
                rest = false;
            }

        } while (rest);

        return Codigo;
    }
    
    public static int Verificar_CodigoNiño(ObjectContainer Base, String usuario) {

        Niño miNiño = new Niño();
        miNiño.setUsuario(usuario);
        ObjectSet result = Base.get(miNiño);

        return result.size();
    }
    
    private void TxtNombreNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtNombreNiñoMousePressed
        if (TxtNombreNiño.getText().equals("Ingrese sus Nombres")) {
            TxtNombreNiño.setText("");
            TxtNombreNiño.setForeground(Color.black);
        }
        
        if (TxtApellidoNiño.getText().isEmpty()) {
            TxtApellidoNiño.setText("Ingrese sus Apellidos");
            TxtApellidoNiño.setForeground(Color.gray);
        }
         if (TxtApodoNiño.getText().isEmpty()) {
            TxtApodoNiño.setText("Ingrese su Apodo");
            TxtApodoNiño.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraNiño.getPassword()).isEmpty()) {
            NvContraNiño.setText("**********");
            NvContraNiño.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraNiño.getPassword()).isEmpty()) {
            CfContraNiño.setText("**********");
            CfContraNiño.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtNombreNiñoMousePressed

    private void TxtApellidoNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtApellidoNiñoMousePressed
        if (TxtApellidoNiño.getText().equals("Ingrese sus Apellidos")) {
            TxtApellidoNiño.setText("");
            TxtApellidoNiño.setForeground(Color.black);
        }
        
        if (TxtNombreNiño.getText().isEmpty()) {
            TxtNombreNiño.setText("Ingrese sus Nombres");
            TxtNombreNiño.setForeground(Color.gray);
        }
        if (TxtApodoNiño.getText().isEmpty()) {
            TxtApodoNiño.setText("Ingrese su Apodo");
            TxtApodoNiño.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraNiño.getPassword()).isEmpty()) {
            NvContraNiño.setText("**********");
            NvContraNiño.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraNiño.getPassword()).isEmpty()) {
            CfContraNiño.setText("**********");
            CfContraNiño.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtApellidoNiñoMousePressed

    private void TxtApodoNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtApodoNiñoMousePressed
        if (TxtApodoNiño.getText().equals("Ingrese su Apodo")) {
            TxtApodoNiño.setText("");
            TxtApodoNiño.setForeground(Color.black);
        }
        
        if (TxtNombreNiño.getText().isEmpty()) {
            TxtNombreNiño.setText("Ingrese sus Nombres");
            TxtNombreNiño.setForeground(Color.gray);
        }
        if (TxtApellidoNiño.getText().isEmpty()) {
            TxtApellidoNiño.setText("Ingrese sus Apellidos");
            TxtApellidoNiño.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraNiño.getPassword()).isEmpty()) {
            NvContraNiño.setText("**********");
            NvContraNiño.setForeground(Color.gray);

        }
        if (String.valueOf(CfContraNiño.getPassword()).isEmpty()) {
            CfContraNiño.setText("**********");
            CfContraNiño.setForeground(Color.gray);
        }
    }//GEN-LAST:event_TxtApodoNiñoMousePressed

    private void TxtApodoNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApodoNiñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApodoNiñoActionPerformed

    private void NvContraNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NvContraNiñoMousePressed
        if (String.valueOf(NvContraNiño.getPassword()).equals("**********")) {
            NvContraNiño.setText("");
            NvContraNiño.setForeground(Color.black);
        }
        if (TxtNombreNiño.getText().isEmpty()) {
            TxtNombreNiño.setText("Ingrese sus Nombres");
            TxtNombreNiño.setForeground(Color.gray);
        }
        if (TxtApellidoNiño.getText().isEmpty()) {
            TxtApellidoNiño.setText("Ingrese sus Apellidos");
            TxtApellidoNiño.setForeground(Color.gray);
        }
         if (TxtApodoNiño.getText().isEmpty()) {
            TxtApodoNiño.setText("Ingrese su Apodo");
            TxtApodoNiño.setForeground(Color.gray);
        }
        if (String.valueOf(CfContraNiño.getPassword()).isEmpty()) {
            CfContraNiño.setText("**********");
            CfContraNiño.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NvContraNiñoMousePressed

    private void NvContraNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NvContraNiñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NvContraNiñoActionPerformed

    private void CfContraNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CfContraNiñoMousePressed
        if (String.valueOf(CfContraNiño.getPassword()).equals("**********")) {
            CfContraNiño.setText("");
            CfContraNiño.setForeground(Color.black);
        }
        if (TxtNombreNiño.getText().isEmpty()) {
            TxtNombreNiño.setText("Ingrese sus Nombres");
            TxtNombreNiño.setForeground(Color.gray);
        }
        if (TxtApellidoNiño.getText().isEmpty()) {
            TxtApellidoNiño.setText("Ingrese sus Apellidos");
            TxtApellidoNiño.setForeground(Color.gray);
        }
         if (TxtApodoNiño.getText().isEmpty()) {
            TxtApodoNiño.setText("Ingrese su Apodo");
            TxtApodoNiño.setForeground(Color.gray);
        }
        if (String.valueOf(NvContraNiño.getPassword()).isEmpty()) {
            NvContraNiño.setText("**********");
            NvContraNiño.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_CfContraNiñoMousePressed

    private void CfContraNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfContraNiñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfContraNiñoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnDiscaNiñ;
    private javax.swing.ButtonGroup BtnDiscapacidad;
    private javax.swing.JRadioButton BtnDiscapacidadNiñ;
    private javax.swing.JRadioButton BtnFemeninoNiñ;
    private javax.swing.JRadioButton BtnMasculinoNiñ;
    private javax.swing.JButton BtnRegistrarseNiñ;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.ButtonGroup BtnSexo;
    private javax.swing.JPasswordField CfContraNiño;
    private javax.swing.JComboBox<String> CmBxPersonalidad;
    private javax.swing.JLabel ConfirmarContraseña;
    private com.toedter.calendar.JDateChooser DateEdadNiño;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel NuevaContraseña;
    private javax.swing.JPasswordField NvContraNiño;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JSeparator Separador3;
    private javax.swing.JSeparator Separador4;
    private javax.swing.JSeparator Separador5;
    private javax.swing.JSeparator Separador6;
    private javax.swing.JSeparator Separador7;
    private javax.swing.JSeparator Separador8;
    private javax.swing.JSeparator Separador9;
    private javax.swing.JTextField TxtApellidoNiño;
    private javax.swing.JTextField TxtApodoNiño;
    private javax.swing.JTextField TxtNombreNiño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    // End of variables declaration//GEN-END:variables
}
