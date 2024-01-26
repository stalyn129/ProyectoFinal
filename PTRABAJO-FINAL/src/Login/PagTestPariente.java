/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import Login.*;
import BBDD.*;
import Clases.*;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import java.awt.HeadlessException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class PagTestPariente extends javax.swing.JFrame {

    ObjectContainer Base;
UserDataSingleton usarData = UserDataSingleton.getInstance();

    /**
     * Creates new form Responder_test_Repre
     */
    public PagTestPariente() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        lista_test.addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            
            String elementoSeleccionado = lista_test.getSelectedValue();
            caracteristicas_ponle(Base, elementoSeleccionado);
            
        }
    });
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        btn_Cargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_test = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btn_responder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_descr = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_titulo_test = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        LblTestPariente1 = new javax.swing.JLabel();
        LblTestPariente2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuCuentosNiño = new javax.swing.JMenuBar();
        JMenu3puntitosNiño = new javax.swing.JMenu();
        JMnItmCerrarNiño = new javax.swing.JMenuItem();
        JMnPgPrinNiño = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(860, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setDoubleBuffered(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(633, 428));
        jPanel4.setPreferredSize(new java.awt.Dimension(633, 428));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cargar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Cargar.setText("CARGAR");
        btn_Cargar.setToolTipText("Haz click para cargar los test");
        btn_Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 188, -1));

        lista_test.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lista_test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_testMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista_test);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 263, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Test Disponibles");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        btn_responder.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_responder.setText("Responder");
        btn_responder.setToolTipText("Haz click para responder el test");
        btn_responder.setActionCommand("");
        btn_responder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_responderActionPerformed(evt);
            }
        });
        jPanel4.add(btn_responder, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Numero de preguntas:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, 20));

        txt_num.setEditable(false);
        txt_num.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 40, -1));

        txa_descr.setEditable(false);
        txa_descr.setColumns(20);
        txa_descr.setRows(5);
        jScrollPane2.setViewportView(txa_descr);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 290, 140));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Proposito:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        txt_titulo_test.setEditable(false);
        jPanel4.add(txt_titulo_test, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Titulo:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(" Autor:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        txt_nom.setEditable(false);
        jPanel4.add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 250, -1));
        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 10, 290));

        jScrollPane3.setViewportView(jPanel4);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 650, 360));

        BtnCerrarPagina.setBackground(new java.awt.Color(255, 255, 255));
        BtnCerrarPagina.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        BtnCerrarPagina.setText("x");
        BtnCerrarPagina.setToolTipText("Cerrar Pagina dando click aqui");
        BtnCerrarPagina.setBorder(null);
        BtnCerrarPagina.setOpaque(false);
        BtnCerrarPagina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCerrarPaginaMouseClicked(evt);
            }
        });
        BtnCerrarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarPaginaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 70));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoTestRepresentante.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -10, 1690, 510));

        LblTestPariente1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente1.setText("BIENVENIDOS AL AREA DE:");
        jPanel1.add(LblTestPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 290, 20));

        LblTestPariente2.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente2.setText("TEST");
        jPanel1.add(LblTestPariente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 60, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 798, 500));

        JMenu3puntitosNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosNiño.setToolTipText("Configuración");

        JMnItmCerrarNiño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarNiño.setBackground(new java.awt.Color(255, 255, 255));
        JMnItmCerrarNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarNiño.setText("Cerrar Sesión");
        JMnItmCerrarNiño.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarNiñoMousePressed(evt);
            }
        });
        JMenu3puntitosNiño.add(JMnItmCerrarNiño);

        MenuCuentosNiño.add(JMenu3puntitosNiño);

        JMnPgPrinNiño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño.setToolTipText("Resgresa a la página principal");
        JMnPgPrinNiño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiñoMouseClicked(evt);
            }
        });
        MenuCuentosNiño.add(JMnPgPrinNiño);

        setJMenuBar(MenuCuentosNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarActionPerformed
        MostrarDatos_test(Base);
        
    }//GEN-LAST:event_btn_CargarActionPerformed

    private void lista_testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_testMouseClicked
       
    }//GEN-LAST:event_lista_testMouseClicked

    private void btn_responderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_responderActionPerformed
         
                Base.close();
             Responder_Test_represent__1 respo=new Responder_Test_represent__1();
             respo.setVisible(true);
             this.setVisible(false);
             
             
       
        
        
    }//GEN-LAST:event_btn_responderActionPerformed

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void JMnItmCerrarNiñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarNiñoMousePressed
        Base.close();
        InicioRepresentante loginrepre = new InicioRepresentante();
        loginrepre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarNiñoMousePressed

    private void JMnPgPrinNiñoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiñoMouseClicked
        Base.close();
        PagPrincipalRepresentante principalrepresetante = new PagPrincipalRepresentante();
        principalrepresetante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiñoMouseClicked

    public void caracteristicas_ponle(ObjectContainer Base, String titulo) {
        
            Test mitest = new Test();
            mitest.setTitulo_Test(titulo);
            ObjectSet result = Base.get(mitest);

            while (result.hasNext()) {

                Test elts = (Test) result.next();
                
                usarData.setCod_test_repre(elts.getID_Test());
                
                txt_titulo_test.setText(elts.getTitulo_Test());
                txa_descr.setText(elts.getDescripcion_Test());

                String CodPsic=elts.getFKCod_Psicologo();
                
                
                String nom=Autor_del_test(Base, CodPsic);
                txt_nom.setText(nom);
                
                Preguntas lapre = new Preguntas();
                lapre.setFK_Codigo_Test(elts.getID_Test());

                ObjectSet rsr = Base.get(lapre);

                String res = String.valueOf(rsr.size());
                txt_num.setText(res);
                
               

            }
        

    }
    
    public String Autor_del_test( ObjectContainer Base,String cod){
    String codpi="";
    String nom="",apell="";
    Psicologo elpisic=new Psicologo();
    elpisic.setCod_Psicologo(cod);
    ObjectSet resul=Base.get(elpisic);
        while (resul.hasNext()) {
            Psicologo nextElement = (Psicologo)resul.next();
            codpi=nextElement.getFK_Cedula();
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////
        Persona person=new Persona();
        person.setCedula(codpi);
        ObjectSet resPer=Base.get(person);
        while (resPer.hasNext()) {
            Persona next =(Persona) resPer.next();
            nom=next.getNombre();
            apell=next.getApellido();
            
        }
        String nombre=nom+" "+apell;
        
    
    return nombre;
    }
        

    

    //////////////////////Mostra test
    public void MostrarDatos_test(ObjectContainer Base) {
        try {
            Test eltest = new Test();
            eltest.setCod_destinatario("Representante");
            ObjectSet result = Base.get(eltest);

            // Asegúrate de que la lista tenga un modelo adecuado (DefaultListModel)
            if (!(lista_test.getModel() instanceof DefaultListModel)) {
                // Si el modelo de la lista no es de tipo DefaultListModel, configúralo como tal
                DefaultListModel<String> modeloDefault = new DefaultListModel<>();
                lista_test.setModel(modeloDefault);
            }

            DefaultListModel<String> modeloDefault = (DefaultListModel<String>) lista_test.getModel();

            // Limpiar el modelo antes de agregar nuevas filas
            modeloDefault.clear();

            javax.swing.JOptionPane.showMessageDialog(this, "Tenemos a disposicion " + result.size()+" Test");

            // Verifica si hay datos en la base de datos antes de iterar sobre ellos
            if (result.size() > 0) {
                while (result.hasNext()) {
                    Test tst = (Test) result.next();
                    modeloDefault.addElement(tst.getTitulo_Test());
                }

                // Refresca la interfaz gráfica después de agregar elementos
                lista_test.repaint(); // o lista_test.revalidate();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay test Dispopnibles");
            }
        } catch (DatabaseClosedException | Db4oIOException | HeadlessException e) {
            // Maneja las excepciones y muestra un mensaje de error
            javax.swing.JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + e.getMessage());
        }
        
    }

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
            java.util.logging.Logger.getLogger(PagTestPariente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagTestPariente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagTestPariente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagTestPariente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PagTestPariente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMenu3puntitosNiño;
    private javax.swing.JMenuItem JMnItmCerrarNiño;
    private javax.swing.JMenu JMnPgPrinNiño;
    private javax.swing.JLabel LblTestPariente1;
    private javax.swing.JLabel LblTestPariente2;
    private javax.swing.JMenuBar MenuCuentosNiño;
    private javax.swing.JButton btn_Cargar;
    private javax.swing.JButton btn_responder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista_test;
    private javax.swing.JTextArea txa_descr;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_titulo_test;
    // End of variables declaration//GEN-END:variables
}
