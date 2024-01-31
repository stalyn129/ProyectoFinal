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
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author alexa
 */
public class Reporte_test_niño_Admin extends javax.swing.JFrame {

    String cod_Test = "";
    ObjectContainer Base;
    UserDataSingleton usarData = UserDataSingleton.getInstance();

    String titulo = "";

    /**
     * Creates new form Reporte_test
     */
    public Reporte_test_niño_Admin() {
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
                mostrar_diagrama();

            }
        });

        Mostrar_datos_seleccion(Base);
    }

    public void Mostrar_test(ObjectContainer Base) {
        try {
            Test elTest = new Test();

            elTest.setCod_destinatario("Niño");
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

    public void Eliminar(ObjectContainer Base) {

        Test eltst = new Test();
        eltst.setID_Test(cod_Test);

        ObjectSet result = Base.get(eltst);
        while (result.hasNext()) {
            Test next = (Test) result.next();
            String codTest = next.getID_Test();
            int confir = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el Test: " + next.getTitulo_Test(), "Confirmar", JOptionPane.OK_CANCEL_OPTION);
            if (confir == JOptionPane.OK_OPTION) {

                if (mostra_num_encuestados(Base, codTest) == 0) {

                    Preguntas pre = new Preguntas();
                    pre.setFK_Codigo_Test(codTest);
                    ObjectSet resulta = Base.get(pre);
                    if (resulta.size() != 0) {

                        while (resulta.hasNext()) {
                            Preguntas next1 = (Preguntas) resulta.next();
                            String codPreg = next1.getCod_Pregunta();

                            Opcion_Respuesta op = new Opcion_Respuesta();
                            op.setFK_CodPregunta(codPreg);
                            ObjectSet resp = Base.get(op);
                            if (resp.size() != 0) {
                                while (resp.hasNext()) {
                                    Opcion_Respuesta next2 = (Opcion_Respuesta) resp.next();
                                    Base.delete(next2);

                                }
                            }

                            Base.delete(next1);

                        }
                    }
                    Base.delete(next);
                } else {
                    JOptionPane.showMessageDialog(this, "El test ya contiene resgistros relacionados");
                }

            }

        }

    }

    public void Mostrar_datos_seleccion(ObjectContainer Base) {
        Object selectedTestItem = cbx_Test.getSelectedItem();

        if (selectedTestItem != null) {
            String tit = selectedTestItem.toString();
            Test eltst = new Test();
            eltst.setTitulo_Test(tit);


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
            int numeorEncues = mostra_num_encuestados(Base, cod_Test);
            numeorEncues = numeorEncues / num;
            txt_num.setText(String.valueOf(numeorEncues));

        } else {
            modelo.addElement("");
            JOptionPane.showMessageDialog(this, "No hay preguntas del test");
        }
        cbx_preguntas.setModel(modelo);

    }

    public int mostra_num_encuestados(ObjectContainer Base, String cod_Test) {
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
        mostrar_diagrama();
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

        datos.setValue(numRes1, respuesta1, respuesta1);
        datos.setValue(numRes2, respuesta2, respuesta2);
        datos.setValue(numRes3, respuesta3, respuesta3);

        JFreeChart grafico_barras = ChartFactory.createBarChart3D(
                "Resultado de la pregunta",
                "Opciones de Respuesta para niños",
                "Resultados",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(500, 250));

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

    public void mostrar_diagrama() {
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue(respuesta1, numRes1);
        datos.setValue(respuesta2, numRes2);
        datos.setValue(respuesta3, numRes3);

        JFreeChart grafico_circular = ChartFactory.createPieChart("Respuestas de Niños", datos, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(310, 230));
        
        SwingUtilities.invokeLater(() -> {
            grafic_circu.removeAll();
            grafic_circu.setLayout(new BorderLayout());
            grafic_circu.add(panel, BorderLayout.NORTH);

            pack();
            repaint();
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
        cbx_preguntas = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        grafic_circu = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BtnCerrarPagina = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        LblTestPariente1 = new javax.swing.JLabel();
        LblTestPariente2 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_Test.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel2.add(cbx_Test, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 320, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Test:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Test:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txt_titulo_re.setEditable(false);
        txt_titulo_re.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_titulo_re.setToolTipText("Ingrese el titulo");
        txt_titulo_re.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txt_titulo_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 350, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 370, 20));

        jLabel4.setText("Preguntas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        barra_panel.setBackground(new java.awt.Color(204, 252, 252));
        barra_panel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout barra_panelLayout = new javax.swing.GroupLayout(barra_panel);
        barra_panel.setLayout(barra_panelLayout);
        barra_panelLayout.setHorizontalGroup(
            barra_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        barra_panelLayout.setVerticalGroup(
            barra_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jPanel3.add(barra_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 500, 250));

        jLabel5.setText("Numero de Encuestados:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        txt_num.setEditable(false);
        txt_num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 30, -1));

        jLabel6.setText("Mayor aceptacion:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, 20));

        txt_mayor.setEditable(false);
        jPanel3.add(txt_mayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 130, -1));

        jLabel7.setText("Numero de Selecciones:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, 20));

        txta_descripcion.setEditable(false);
        txta_descripcion.setColumns(20);
        txta_descripcion.setRows(5);
        txta_descripcion.setToolTipText("Ingrese el contenido del test");
        jScrollPane2.setViewportView(txta_descripcion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 460, 60));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 10, 830));

        txt_num_Secc.setEditable(false);
        txt_num_Secc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_num_Secc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_SeccActionPerformed(evt);
            }
        });
        jPanel3.add(txt_num_Secc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 40, -1));

        cbx_preguntas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel3.add(cbx_preguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 360, -1));

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 570, 10));

        grafic_circu.setBackground(new java.awt.Color(204, 251, 251));

        javax.swing.GroupLayout grafic_circuLayout = new javax.swing.GroupLayout(grafic_circu);
        grafic_circu.setLayout(grafic_circuLayout);
        grafic_circuLayout.setHorizontalGroup(
            grafic_circuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        grafic_circuLayout.setVerticalGroup(
            grafic_circuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel3.add(grafic_circu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 480, 250));

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 560, 250));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ni Uno Mas-Logo-1 (1).png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jButton1.setText("Eliminar Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 680, 360));

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

        BtnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        BtnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BtnRegresar.setOpaque(false);
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 50, 40));

        LblTestPariente1.setFont(new java.awt.Font("Rockwell Nova", 1, 18)); // NOI18N
        LblTestPariente1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente1.setText("BIENVENIDO AL AREA DE:");
        jPanel1.add(LblTestPariente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 350, 20));

        LblTestPariente2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        LblTestPariente2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTestPariente2.setText("REPORTE DE TEST DEL NIÑO/A GENERAL");
        jPanel1.add(LblTestPariente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 350, 30));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGeneralReportes.png"))); // NOI18N
        Fondo1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-870, -20, 1670, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoClaro.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TresPuntitos.png"))); // NOI18N
        jMenu1.setToolTipText("Configuracion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CerrarSesion.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.setToolTipText("Cierra la sesión iniciada");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Casita.png"))); // NOI18N
        jMenu2.setToolTipText("Regresa a la página principal");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarPaginaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCerrarPaginaMouseClicked

    private void BtnCerrarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarPaginaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCerrarPaginaActionPerformed

    private void txt_num_SeccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_SeccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_SeccActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Eliminar(Base);
        Mostrar_test(Base);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        Base.close();
        Reportes repor = new Reportes();
        repor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
              Base.close();
        IniciaAdmin loginadmin = new IniciaAdmin();
        loginadmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
                Base.close();
        PagPrincipalAdmin paginaprinciadmi = new PagPrincipalAdmin();
        paginaprinciadmi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(Reporte_test_niño_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_test_niño_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_test_niño_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_test_niño_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Reporte_test_niño_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrarPagina;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel LblTestPariente1;
    private javax.swing.JLabel LblTestPariente2;
    private javax.swing.JPanel barra_panel;
    private javax.swing.JComboBox<String> cbx_Test;
    private javax.swing.JComboBox<String> cbx_preguntas;
    private javax.swing.JPanel grafic_circu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
