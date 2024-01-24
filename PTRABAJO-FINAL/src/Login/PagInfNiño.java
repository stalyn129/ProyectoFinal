/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Informacion;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mauca
 */
public class PagInfNiño extends javax.swing.JFrame {

    /**
     * Creates new form PagInfNiño
     */
    ObjectContainer Base;
    public PagInfNiño() {
        initComponents();
            Base = Db4o.openFile("src/BBDD/BaseDat.yap");
            Mostrar_datos_info(Base);
            mostra_info(Base);
             
        cbx_datos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostra_info(Base);

            }
        });
    }

    public void Mostrar_datos_info(ObjectContainer Base){
    
        Informacion info=new Informacion();
        ObjectSet result=Base.get(info);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        if (result.size()!=0) {
         while (result.hasNext()) {
            Informacion next =(Informacion) result.next();
            model.addElement(next.getTitulo_Info());
            
            
            
        }
        cbx_datos.setModel(model);   
        }else{
            JOptionPane.showMessageDialog(this, "No hay informacion Disponible");
        
        }
        
    
    }
    
    public void mostra_info(ObjectContainer Base ){
    String seleccion=cbx_datos.getSelectedItem().toString();
        if (!seleccion.isEmpty()) {
            Informacion info=new Informacion();
            info.setTitulo_Info(seleccion);
            ObjectSet result=Base.get(info);
            
            Informacion im=(Informacion)result.next();
            LblTitulo1InfNiño.setText(im.getTitulo_Info());
            Txt1InfNiño.setText(im.getTexto_Info());
            byte[] imageData = im.getImagen();
            if (imageData != null) {
                ImageIcon icon = new ImageIcon(imageData);
                LblImagen1InfoNiño.setIcon(icon);
            } else {
                // Manejar el caso en el que no hay imagen.
                LblImagen1InfoNiño.setIcon(null); // Puedes establecer el icono a null o configurar un icono predeterminado.
            }
            
        }
    
    
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        PnlPrincipalInfNiño = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        LblInfor2Niño = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LblTitulo1InfNiño = new javax.swing.JLabel();
        LblImagen1InfoNiño = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        LblTitulo2InfNiño = new javax.swing.JLabel();
        LblTitulo3InfNiño = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Txt1InfNiño = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cbx_datos = new javax.swing.JComboBox<>();
        LblInformacionNiño = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Fondo1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        MenuGenerlNiño = new javax.swing.JMenuBar();
        JMnItmCerrarNiño2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        JMnPgPrinNiño2 = new javax.swing.JMenu();

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlPrincipalInfNiño.setBackground(new java.awt.Color(255, 255, 255));
        PnlPrincipalInfNiño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setDoubleBuffered(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 340));
        jPanel1.setMinimumSize(new java.awt.Dimension(593, 340));
        jPanel1.setPreferredSize(new java.awt.Dimension(593, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblInfor2Niño.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblInfor2Niño.setText("INFORMACIÓN DEL BULLYING");
        jPanel1.add(LblInfor2Niño, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 310, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 260, 10));

        LblTitulo1InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo1InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo1InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 20));

        LblImagen1InfoNiño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(LblImagen1InfoNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 250, 180));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 10));

        LblTitulo2InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo2InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo2InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 20));

        LblTitulo3InfNiño.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        LblTitulo3InfNiño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LblTitulo3InfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 780, 260, 0));

        Txt1InfNiño.setColumns(20);
        Txt1InfNiño.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Txt1InfNiño.setLineWrap(true);
        Txt1InfNiño.setRows(5);
        Txt1InfNiño.setWrapStyleWord(true);
        Txt1InfNiño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Txt1InfNiño.setEnabled(false);
        jScrollPane5.setViewportView(Txt1InfNiño);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 170));

        jLabel1.setText("Titulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jPanel1.add(cbx_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 300, -1));

        jScrollPane1.setViewportView(jPanel1);

        PnlPrincipalInfNiño.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 610, 340));

        LblInformacionNiño.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblInformacionNiño.setText("BIENVENIDOS AL AREA DE INFORMACIÓN");
        PnlPrincipalInfNiño.add(LblInformacionNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, 20));
        PnlPrincipalInfNiño.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 410, 20));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInfoNiño.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        PnlPrincipalInfNiño.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -10, 1690, 520));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(800, 500));
        PnlPrincipalInfNiño.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(PnlPrincipalInfNiño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        JMnItmCerrarNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        JMnItmCerrarNiño2.add(jMenuItem1);

        MenuGenerlNiño.add(JMnItmCerrarNiño2);

        JMnPgPrinNiño2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        JMnPgPrinNiño2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMnPgPrinNiño2MouseClicked(evt);
            }
        });
        MenuGenerlNiño.add(JMnPgPrinNiño2);

        setJMenuBar(MenuGenerlNiño);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed

        Base.close();
            InicioNiño login = new InicioNiño();
                login.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void JMnPgPrinNiño2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMnPgPrinNiño2MouseClicked
        Base.close();
            PagPrincipalNiñ principalniño = new PagPrincipalNiñ();
                principalniño.setVisible(true);
                    this.setVisible(false);
    }//GEN-LAST:event_JMnPgPrinNiño2MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JMenu JMnItmCerrarNiño2;
    private javax.swing.JMenu JMnPgPrinNiño2;
    private javax.swing.JLabel LblImagen1InfoNiño;
    private javax.swing.JLabel LblInfor2Niño;
    private javax.swing.JLabel LblInformacionNiño;
    private javax.swing.JLabel LblTitulo1InfNiño;
    private javax.swing.JLabel LblTitulo2InfNiño;
    private javax.swing.JLabel LblTitulo3InfNiño;
    private javax.swing.JMenuBar MenuGenerlNiño;
    private javax.swing.JPanel PnlPrincipalInfNiño;
    private javax.swing.JTextArea Txt1InfNiño;
    private javax.swing.JComboBox<String> cbx_datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
