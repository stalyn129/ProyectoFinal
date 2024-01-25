/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Respuesta_Usuario;
import Clases.*;
import Clases.UserDataSingleton;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author alexa
 */
public class Reporte_test extends javax.swing.JFrame {
    
    String cod_Test = "";
    ObjectContainer Base;
    UserDataSingleton usarData = UserDataSingleton.getInstance();
    
    String titulo = "";

    /**
     * Creates new form Reporte_test
     */
    public Reporte_test() {
        initComponents();
        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        
        Mostrar_test(Base);
        
        cbx_Test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mostrar_datos_seleccion(Base);
                
            }
        });
        
        cbx_preguntas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                respuesta_cod(Base);
                Grafica_mostrar();
                
            }
        });
        
        Mostrar_datos_seleccion(Base);
    }
    
    public void Mostrar_test(ObjectContainer Base) {
        try {
            Test elTest = new Test();
            elTest.setFKCod_Psicologo(usarData.getCod_Psicologo());
            
            ObjectSet Result = Base.get(elTest);
            DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
            
            if (Result.size() != 0) {
                
                while (Result.hasNext()) {
                    Test tst = (Test) Result.next();
                    titulo = tst.getTitulo_Test();
                    modelo.addElement(titulo);
                }
                
            } else {
                
                JOptionPane.showMessageDialog(this, "No se a Publicado ningun test");
                
            }
            cbx_Test.setModel(modelo);
            
        } catch (DatabaseClosedException | Db4oIOException | HeadlessException e) {
        }
        
    }
    
   public void Mostrar_datos_seleccion(ObjectContainer Base) {
    Object selectedTestItem = cbx_Test.getSelectedItem();

    if (selectedTestItem != null) {
        String tit = selectedTestItem.toString();
        Test eltst = new Test();
        eltst.setTitulo_Test(tit);
        eltst.setFKCod_Psicologo(usarData.getCod_Psicologo());

        ObjectSet result = Base.get(eltst);

        if (result.hasNext()) {
            Test tst = (Test) result.next();
            cod_Test = tst.getID_Test();
            txt_titulo_re.setText(tst.getTitulo_Test());
            txta_descripcion.setText(tst.getDescripcion_Test());
            Mostrar_preguntas(Base);
        } else {
            // Manejar la situación en la que no hay resultados
            JOptionPane.showMessageDialog(null, "No se encontraron datos para el test seleccionado");
        }
    } else {
        // Manejar la situación en la que el elemento seleccionado es nulo
        
    }
}
    
    public void Mostrar_preguntas(ObjectContainer Base) {
        Preguntas resp = new Preguntas();
        resp.setFK_Codigo_Test(cod_Test);
        
        ObjectSet result = Base.get(resp);
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        int num = result.size();
        if (result.size() != 0) {
            while (result.hasNext()) {
                Preguntas next = (Preguntas) result.next();
                
                modelo.addElement(next.getEnunciado());
                
            }
            int numeorEncues = mostra_num_encuestados(Base);
            numeorEncues = numeorEncues / num;
            txt_num.setText(String.valueOf(numeorEncues));
            
        } else {
            modelo.addElement("");
            JOptionPane.showMessageDialog(this, "Ho hay preguntas del test");
        }
        cbx_preguntas.setModel(modelo);
        
    }
    
    public int mostra_num_encuestados(ObjectContainer Base) {
        Respuesta_Usuario res = new Respuesta_Usuario();
        res.setFK_Cod_text(cod_Test);
        
        ObjectSet result = Base.get(res);
        System.out.println("cuantas encuestas_" + result.size());
        return result.size();
    }
    
    public void respuesta_cod(ObjectContainer Base) {
        
        respuesta1 = "";
        
        respuesta2 = "";
        respuesta3 = "";
        CodRes1 = "";
        CodRes2 = "";
        CodRes3 = "";
        numRes1 = 0;
        numRes2 = 0;
        numRes3 = 0;
        String opcion = cbx_preguntas.getSelectedItem().toString();
        if (!opcion.isEmpty()) {
            
            Preguntas op = new Preguntas();
            op.setEnunciado(opcion);
            ObjectSet result = Base.get(op);
            
            Preguntas opRes = (Preguntas) result.next();
            pregunta_pre_txt = opRes.getEnunciado();
            codPregunta = opRes.getCod_Pregunta();
            opcional_respuesta(Base);
        }
        
    }
    String pregunta_pre_txt = "";
    String codPregunta = "";
    
    public void opcional_respuesta(ObjectContainer Base) {
        
        Opcion_Respuesta opRes = new Opcion_Respuesta();
        opRes.setFK_CodPregunta(codPregunta);
        
        ObjectSet result = Base.get(opRes);
        
        while (result.hasNext()) {
            Opcion_Respuesta next = (Opcion_Respuesta) result.next();
            String cod = next.getCod_Opciones();
            String text = next.getText_opcional();

            // Utilización de una estructura dinámica para almacenar respuestas
            if (respuesta1.equals("")) {
                CodRes1 = cod;
                respuesta1 = text;
                numRes1 = calcular_respuestas_num(Base, cod);
                System.out.println("cos ::" + CodRes1 + " Respuuesta 11::" + respuesta1 + " numeor :::" + numRes1);
            } else if (respuesta2.equals("")) {
                CodRes2 = cod;
                respuesta2 = text;
                numRes2 = calcular_respuestas_num(Base, cod);
                System.out.println("cos ::" + CodRes2 + " Respuuesta 22::" + respuesta2 + " numeor :::" + numRes2);
            } else if (respuesta3.equals("")) {
                CodRes3 = cod;
                respuesta3 = text;
                numRes3 = calcular_respuestas_num(Base, cod);
                System.out.println("cos ::" + CodRes3 + " Respuuesta 33::" + respuesta3 + " numeor :::" + numRes3);
            }
            
        }
        Grafica_mostrar();
        Mas_alto();
        
    }
    
    public void Mas_alto() {
        SwingUtilities.invokeLater(() -> {
            if (numRes1 > numRes2 && numRes1 > numRes3) {
                System.out.println("variable1 es la más alta: " + numRes1);
                
                txt_mayor.setText(respuesta1);
                txt_num_Secc.setText(String.valueOf(numRes1));
                
            } else if (numRes2 > numRes1 && numRes2 > numRes3) {
                System.out.println("variable2 es la más alta: " + numRes2);
                
                txt_mayor.setText(respuesta2);
                txt_num_Secc.setText(String.valueOf(numRes2));
                
            } else if (numRes3 > numRes1 && numRes3 > numRes2) {
                System.out.println("variable3 es la más alta: " + numRes3);
                
                txt_mayor.setText(respuesta3);
                txt_num_Secc.setText(String.valueOf(numRes3));
                
            } else {
                System.out.println("Las variables son iguales o hay empates.");
            }
        });
    }
    
    String respuesta1 = "";
    String respuesta2 = "";
    String respuesta3 = "";
    String CodRes1 = "";
    String CodRes2 = "";
    String CodRes3 = "";
    int numRes1 = 0;
    int numRes2 = 0;
    int numRes3 = 0;
    
    public int calcular_respuestas_num(ObjectContainer Base, String cod) {
        Respuesta_Usuario Res = new Respuesta_Usuario();
        Res.setFK_cod_Opciones(cod);
        
        ObjectSet result = Base.get(Res);
        
        return result.size();
    }
    
    public void Grafica_mostrar() {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
//        datos.setValue(numRes1, respuesta1, respuesta1);
//        datos.setValue(numRes2, respuesta2, respuesta2);
//        datos.setValue(numRes3, respuesta3, respuesta3);
        
        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "Resultado de la pregunta",
                "Opciones de Respuesta",
                "Resultados",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(390, 250));

        // Asegúrate de estar ejecutando en el hilo de eventos de Swing
        SwingUtilities.invokeLater(() -> {
            // Limpia el panel antes de agregar el nuevo gráfico
            barra_panel.removeAll();
            barra_panel.setLayout(new BorderLayout());
            barra_panel.add(panel, BorderLayout.NORTH);
            // Repinta el componente
            barra_panel.revalidate();
            barra_panel.repaint();
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
        jPanel2 = new javax.swing.JPanel();
        cbx_Test = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_titulo_re = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        cbx_preguntas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        barra_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_mayor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descripcion = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        txt_num_Secc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BtnCerrarPagina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu3puntitosPsicologo = new javax.swing.JMenu();
        JMnItmCerrarPsicologo = new javax.swing.JMenuItem();
        JMnPgPrinPsicolo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.add(cbx_Test, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 259, -1));

        jLabel2.setText("Test");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Test:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txt_titulo_re.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_titulo_re.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_titulo_re.setToolTipText("Ingrese el titulo");
        txt_titulo_re.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txt_titulo_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 350, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 370, 20));

        jPanel3.add(cbx_preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        jLabel4.setText("Preguntas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        barra_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout barra_panelLayout = new javax.swing.GroupLayout(barra_panel);
        barra_panel.setLayout(barra_panelLayout);
        barra_panelLayout.setHorizontalGroup(
            barra_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        barra_panelLayout.setVerticalGroup(
            barra_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel3.add(barra_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 390, 250));

        jLabel5.setText("Numero de Encuestados:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 20));
        jPanel3.add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 30, -1));

        jLabel6.setText("Mayor aceptacion:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 90, 20));
        jPanel3.add(txt_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 230, -1));

        jLabel7.setText("Numero de Selecciones:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        txta_descripcion.setColumns(20);
        txta_descripcion.setRows(5);
        txta_descripcion.setToolTipText("Ingrese el contenido del test");
        jScrollPane2.setViewportView(txta_descripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 440, 50));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 610, 10));
        jPanel3.add(txt_num_Secc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 40, -1));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 620, 310));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 80, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 690, 410));

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
        jPanel1.add(BtnCerrarPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        JMenu3puntitosPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        JMenu3puntitosPsicologo.setToolTipText("Configuración");

        JMnItmCerrarPsicologo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JMnItmCerrarPsicologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        JMnItmCerrarPsicologo.setText("Cerrar Sesión");
        JMnItmCerrarPsicologo.setToolTipText("Cierra la sesión iniciada");
        JMnItmCerrarPsicologo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMnItmCerrarPsicologoMousePressed(evt);
            }
        });
        JMenu3puntitosPsicologo.add(JMnItmCerrarPsicologo);

        jMenuBar1.add(JMenu3puntitosPsicologo);

        JMnPgPrinPsicolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinPsicolo.setToolTipText("Resgresa a la página principal");
        JMnPgPrinPsicolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinPsicoloMouseClicked(evt);
            }
        });
        jMenuBar1.add(JMnPgPrinPsicolo);

        setJMenuBar(jMenuBar1);

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

    private void JMnItmCerrarPsicologoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMnItmCerrarPsicologoMouseClicked

    private void JMnItmCerrarPsicologoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnItmCerrarPsicologoMousePressed
        Base.close();
        InicioPsicologo loginPsicologo = new InicioPsicologo();
        loginPsicologo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnItmCerrarPsicologoMousePressed

    private void JMnPgPrinPsicoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinPsicoloMouseClicked
        Base.close();
        PagPrincipalPsicologo principal = new PagPrincipalPsicologo();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinPsicoloMouseClicked

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JMenu JMenu3puntitosPsicologo;
    private javax.swing.JMenuItem JMnItmCerrarPsicologo;
    private javax.swing.JMenu JMnPgPrinPsicolo;
    private javax.swing.JPanel barra_panel;
    private javax.swing.JComboBox<String> cbx_Test;
    private javax.swing.JComboBox<String> cbx_preguntas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_mayor;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_num_Secc;
    private javax.swing.JTextField txt_titulo_re;
    private javax.swing.JTextArea txta_descripcion;
    // End of variables declaration//GEN-END:variables
}
