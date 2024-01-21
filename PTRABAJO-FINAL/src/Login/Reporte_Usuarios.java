/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Clases.Discapacidad;
import Clases.*;
import Clases.Psicologo;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class Reporte_Usuarios extends javax.swing.JFrame {

    ObjectContainer Base;
    String codPersonSeccion = "";
    String niñosApodo = "";
    String codusa = "";
    String codNiño = "";

    /**
     * Creates new form Reporte_Usuarios
     */
    public Reporte_Usuarios() {
        initComponents();

        Base = Db4o.openFile("src/BBDD/BaseDat.yap");
        cmbx_seleccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eleccion_tipo();

            }
        });
        tbn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Datos_Niño_recuper(Base);
                Datos_usuario_eli(Base);
            }
        });

        mostrar_niños(Base);

    }

    public void consultar(ObjectContainer Base) {
        String contl = txt_consultar.getText();
        if (contl == null || contl.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cédula antes de consultar");
            return;
        }
        Persona persn = new Persona();
        persn.setCedula(contl);
        ObjectSet result = Base.get(persn);
        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (result.size() == 0) {

            JOptionPane.showMessageDialog(this, "No se encuentra a ninguna persona con la cedula " + contl + " registrada");

        } else {
            while (result.hasNext()) {
                Persona pers = (Persona) result.next();
                boolean activo = pers.isEstado();
                if (activo) {

                    modelo.addRow(new Object[]{
                        pers.getCedula(),
                        pers.getNombre(),
                        pers.getApellido(),
                        pers.getDireccion(),
                        pers.getFecha_Nacimiento(),
                        pers.getEmail(),
                        pers.getCod_Discapacidad(),
                        pers.getTelefono()
                    });

                } else {
                    JOptionPane.showMessageDialog(this, "El usuario " + contl + " parese que a sido eliminado\nSi desea recuperarlo ir al apartado de RECUPERAR");
                }

            }

        }

    }

    public void eleccion_tipo() {
        String seleccion = cmbx_seleccion.getSelectedItem().toString();
        if (seleccion.equalsIgnoreCase("Seleccionar")) {

        } else {

            DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
            // Limpiar el modelo antes de agregar nuevas filas
            modelo.setRowCount(0);
            if (seleccion.equalsIgnoreCase("Psicologo")) {

                MostrarDatos_psic(Base);

            } else if (seleccion.equalsIgnoreCase("Representante")) {

                MostrarDatos_Repres(Base);

            } else if (seleccion.equalsIgnoreCase("Administrador")) {

                MostrarDatos_Admin(Base);

            }
        }

    }

    public static ObjectSet reporte__Persona(ObjectContainer Base, String cedula) {
        Persona psic = new Persona();
        psic.setEstado(true);
        psic.setCedula(cedula);

        ObjectSet result = Base.get(psic);
        return result;
    }

    public void MostrarDatos_psic(ObjectContainer Base) {

        Psicologo psic = new Psicologo();

        ObjectSet result = Base.get(psic);
        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Psicologo sico = (Psicologo) result.next();

            sico.getFK_Cedula();
            ObjectSet person = reporte__Persona(Base, sico.getFK_Cedula());

            while (person.hasNext()) {
                Persona pers = (Persona) person.next();
                modelo.addRow(new Object[]{
                    pers.getCedula(),
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getDireccion(),
                    pers.getFecha_Nacimiento(),
                    pers.getEmail(),
                    pers.getCod_Discapacidad(),
                    pers.getTelefono()
                });
            }

        }

    }

    public void MostrarDatos_Admin(ObjectContainer Base) {

        Administrador psic = new Administrador();
        ObjectSet result = Base.get(psic);
        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Administrador sico = (Administrador) result.next();

            ObjectSet person = reporte__Persona(Base, sico.getFK_Cedula());

            while (person.hasNext()) {
                Persona pers = (Persona) person.next();
                modelo.addRow(new Object[]{
                    pers.getCedula(),
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getDireccion(),
                    pers.getFecha_Nacimiento(),
                    pers.getEmail(),
                    pers.getCod_Discapacidad(),
                    pers.getTelefono()
                });
            }

        }

    }

    public void MostrarDatos_Repres(ObjectContainer Base) {

        Representante psic = new Representante();
        ObjectSet result = Base.get(psic);
        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (result.hasNext()) {
            Representante sico = (Representante) result.next();

            ObjectSet person = reporte__Persona(Base, sico.getFKCod_Cedula());

            while (person.hasNext()) {
                Persona pers = (Persona) person.next();
                modelo.addRow(new Object[]{
                    pers.getCedula(),
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getDireccion(),
                    pers.getFecha_Nacimiento(),
                    pers.getEmail(),
                    pers.getCod_Discapacidad(),
                    pers.getTelefono()
                });
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

        jPanel1 = new javax.swing.JPanel();
        Recuperar = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mostrr = new javax.swing.JTable();
        txt_consultar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btn_eliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbx_seleccion = new javax.swing.JComboBox<>();
        txt_roll = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        txtP_contraseña = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_niños = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ntx_sexo = new javax.swing.JTextField();
        ntx_nombre = new javax.swing.JTextField();
        ntx_apodo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txt_apodo_consu = new javax.swing.JTextField();
        ntx_apellido = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ntx_contra = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbla_usa = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbla_nin = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        recu_nin = new javax.swing.JButton();
        recu_usa = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_nino_recu = new javax.swing.JTextField();
        txt_usua_re = new javax.swing.JTextField();
        tbn_actualizar = new javax.swing.JToggleButton();
        btn_bus_usua = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Recuperar.setBackground(new java.awt.Color(255, 255, 255));
        Recuperar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_mostrr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRE", "APELLIDO", "DIRECCION", "Fech_Nacimint.", "EMAIL", "Cod_Discap.", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_mostrr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_mostrrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_mostrr);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 210));

        txt_consultar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(txt_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, 10));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Consultar:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 110, -1));

        txt_codigo.setEditable(false);
        jPanel3.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Rol:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Direccion:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Contraseña:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Telefono:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Cedula:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 100, -1));
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, -1));
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 160, -1));
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 200, -1));
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 130, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 680, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tipo Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        cmbx_seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Psicologo", "Representante", "Administrador" }));
        jPanel2.add(cmbx_seleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 141, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 240, 40));

        txt_roll.setEditable(false);
        jPanel3.add(txt_roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));
        jPanel3.add(txtP_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));

        jButton8.setText("Actualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 110, -1));

        Recuperar.addTab("Usuario", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_niños.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Apodo", "Fecha_nacim.", "Sexo", "cod_discapacidad"
            }
        ));
        tabla_niños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_niñosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_niños);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 683, 240));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Consultar:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, 10));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, -1));

        jButton4.setText("Busca");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 160, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Nombre:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Sexo:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Apodo:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Contraseña:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        ntx_sexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(ntx_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 110, -1));

        ntx_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(ntx_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 110, -1));

        ntx_apodo.setEditable(false);
        ntx_apodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(ntx_apodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 110, -1));

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 160, -1));

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 180, -1));

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 180, -1));

        txt_apodo_consu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(txt_apodo_consu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 20));

        ntx_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel5.add(ntx_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 110, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Apellido:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));
        jPanel5.add(ntx_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 130, -1));

        Recuperar.addTab("Niño", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 25, -1, -1));

        tbla_usa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo"
            }
        ));
        tbla_usa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbla_usaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbla_usa);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 230));

        tbla_nin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Apodo", "Nombre", "Apellido", "Sexo"
            }
        ));
        tbla_nin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbla_ninMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbla_nin);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 300, 230));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 10, 390));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Apodo:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Niños");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Usuario General");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Consultar:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        recu_nin.setText("Recuperar Niño");
        recu_nin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recu_ninActionPerformed(evt);
            }
        });
        jPanel4.add(recu_nin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 230, -1));

        recu_usa.setText("Recuperar Usuario");
        recu_usa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recu_usaActionPerformed(evt);
            }
        });
        jPanel4.add(recu_usa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 280, -1));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 170, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 10));

        txt_nino_recu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txt_nino_recu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 160, -1));

        txt_usua_re.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(txt_usua_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, -1));

        tbn_actualizar.setText("Actualizar");
        tbn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn_actualizarActionPerformed(evt);
            }
        });
        jPanel4.add(tbn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        btn_bus_usua.setText("Buscar");
        btn_bus_usua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bus_usuaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_bus_usua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 170, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 170, -1));

        Recuperar.addTab("Recuperar Eliminados", jPanel4);

        jPanel1.add(Recuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 720, 440));
        Recuperar.getAccessibleContext().setAccessibleName("");

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen de WhatsApp 2024-01-03 a las 07.58.17_8bdfab4c.jpg"))); // NOI18N
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Base.close();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminar_persona();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_mostrr.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        consultar(Base);

    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tabla_mostrrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_mostrrMouseClicked
        int seleccionTable = tabla_mostrr.getSelectedRow();

        codPersonSeccion = String.valueOf(tabla_mostrr.getValueAt(seleccionTable, 0));
        Buscar_persona_seleccion(Base, codPersonSeccion);

    }//GEN-LAST:event_tabla_mostrrMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Modificar_person(Base);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void recu_usaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recu_usaActionPerformed

        Recuperar_usa(Base, codusa);
    }//GEN-LAST:event_recu_usaActionPerformed

    private void tbn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn_actualizarActionPerformed
        Datos_usuario_eli(Base);
        Datos_Niño_recuper(Base);
    }//GEN-LAST:event_tbn_actualizarActionPerformed

    private void tbla_usaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbla_usaMouseClicked
        int seleccionTable = tbla_usa.getSelectedRow();

        codusa = String.valueOf(tbla_usa.getValueAt(seleccionTable, 0));


    }//GEN-LAST:event_tbla_usaMouseClicked

    private void recu_ninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recu_ninActionPerformed

        Recuperar_nin(Base, codNiño);
    }//GEN-LAST:event_recu_ninActionPerformed

    private void tbla_ninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbla_ninMouseClicked
        int seleccionTable = tbla_nin.getSelectedRow();

        codNiño = String.valueOf(tbla_nin.getValueAt(seleccionTable, 0));


    }//GEN-LAST:event_tbla_ninMouseClicked

    private void btn_bus_usuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bus_usuaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbla_usa.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        consultar_usuario(Base);
    }//GEN-LAST:event_btn_bus_usuaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tbla_usa.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        consultar_Niño_recuperaar(Base);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mostrar_niños(Base);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        eleccion_tipo();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tabla_niñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_niñosMouseClicked
        int seleccionTable = tabla_niños.getSelectedRow();

        niñosApodo = String.valueOf(tabla_niños.getValueAt(seleccionTable, 2));
        Buscar_Niños_seleccion(Base, niñosApodo);


    }//GEN-LAST:event_tabla_niñosMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabla_niños.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        consultar_niño(Base);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        eliminar_niño();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Modificar_Niño(Base);
    }//GEN-LAST:event_jButton7ActionPerformed
    public void eliminar_persona() {

        Persona person = new Persona();
        person.setCedula(codPersonSeccion);
        ObjectSet result = Base.get(person);

        Persona pr = (Persona) result.next();

        int confir = JOptionPane.showConfirmDialog(this, "¿Desea eliminar a la persona: " + pr.getCedula(), "Confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (confir == JOptionPane.OK_OPTION) {
            pr.setEstado(false);
            Base.store(pr);
            Base.commit();
        }

    }

    public void eliminar_niño() {

        Niño person = new Niño();
        person.setApodo(niñosApodo);
        ObjectSet result = Base.get(person);

        Niño pr = (Niño) result.next();

        int confir = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al Niño: " + pr.getApodo(), "Confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (confir == JOptionPane.OK_OPTION) {
            pr.setEstado(false);
            Base.store(pr);
            Base.commit();
        }

    }

    public void Modificar_person(ObjectContainer Base) {
        Persona person = new Persona();
        person.setCedula(codPersonSeccion);
        ObjectSet result = Base.get(person);

        Persona pr = (Persona) result.next();

        pr.setNombre(txt_nombre.getText());
        pr.setApellido(txt_apellido.getText());
        pr.setDireccion(txt_direccion.getText());
        pr.setTelefono(txt_telefono.getText());
        pr.setEmail(txt_email.getText());
        pr.setContraseña(String.valueOf(txtP_contraseña.getPassword()));
        Base.store(pr);
        Base.commit();
        JOptionPane.showMessageDialog(this, "Se guardo los cambios correctamente");

    }

    public void Modificar_Niño(ObjectContainer Base) {

        Niño person = new Niño();
        person.setApodo(codPersonSeccion);
        ObjectSet result = Base.get(person);

        Niño pr = (Niño) result.next();

        pr.setNombre(ntx_nombre.getText());
        pr.setApellido(ntx_apellido.getText());
        pr.setApodo(txt_direccion.getText());
////////////////// FALTA NIÑO
        pr.setContraseña(String.valueOf(ntx_contra.getPassword()));
        Base.store(pr);
        Base.commit();
        JOptionPane.showMessageDialog(this, "Se guardo los cambios correctamente");

    }

    public void Buscar_persona_seleccion(ObjectContainer Base, String cedula) {
        Persona perss = new Persona();
        perss.setCedula(cedula);
        ObjectSet result = Base.get(perss);

        Persona prs = (Persona) result.next();

        txt_codigo.setText(prs.getCedula());
        txt_nombre.setText(prs.getNombre());
        txt_apellido.setText(prs.getApellido());
        txt_direccion.setText(prs.getDireccion());
        txt_telefono.setText(prs.getTelefono());
        txt_email.setText(prs.getEmail());
        txtP_contraseña.setText(prs.getContraseña());
        txt_roll.setText(tipo_persona(Base, prs.getCedula()));

    }

    public void Buscar_Niños_seleccion(ObjectContainer Base, String cedula) {
        Niño perss = new Niño();
        perss.setApodo(cedula);
        ObjectSet result = Base.get(perss);

        Niño prs = (Niño) result.next();
        ntx_nombre.setText(prs.getNombre());
        ntx_apellido.setText(prs.getApellido());
        ntx_apodo.setText(prs.getApodo());
        ntx_sexo.setText(String.valueOf(prs.getSexo_Niño()));
        ntx_contra.setText(prs.getContraseña());

    }

    public String tipo_persona(ObjectContainer Base, String cedula) {
        String tipo = "";

        Administrador admin = new Administrador();
        admin.setFK_Cedula(cedula);
        ObjectSet resultAdmin = Base.get(admin);
        if (resultAdmin.size() != 0) {
            tipo = "Administrador";
            return tipo;
        }

        Representante repre = new Representante();
        repre.setFKCod_Cedula(cedula);
        ObjectSet resultrepe = Base.get(repre);
        if (resultrepe.size() != 0) {
            tipo = "Representante";
            return tipo;
        }

        Psicologo psic = new Psicologo();
        psic.setFK_Cedula(cedula);
        ObjectSet resulPsic = Base.get(psic);
        if (resulPsic.size() != 0) {
            tipo = "Psicologo";
            return tipo;
        }

        return tipo;
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
            java.util.logging.Logger.getLogger(Reporte_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Recuperar;
    private javax.swing.JButton btn_bus_usua;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cmbx_seleccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField ntx_apellido;
    private javax.swing.JTextField ntx_apodo;
    private javax.swing.JPasswordField ntx_contra;
    private javax.swing.JTextField ntx_nombre;
    private javax.swing.JTextField ntx_sexo;
    private javax.swing.JButton recu_nin;
    private javax.swing.JButton recu_usa;
    private javax.swing.JTable tabla_mostrr;
    private javax.swing.JTable tabla_niños;
    private javax.swing.JTable tbla_nin;
    private javax.swing.JTable tbla_usa;
    private javax.swing.JToggleButton tbn_actualizar;
    private javax.swing.JPasswordField txtP_contraseña;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_apodo_consu;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_consultar;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nino_recu;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_roll;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usua_re;
    // End of variables declaration//GEN-END:variables

    public void Datos_usuario_eli(ObjectContainer Base) {

        Persona per = new Persona();
        per.setEstado(false);
        ObjectSet person = Base.get(per);
        DefaultTableModel modelo = (DefaultTableModel) tbla_usa.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        System.out.println("Resyl" + person.size());
        while (person.hasNext()) {
            Persona pers = (Persona) person.next();

            System.out.println("esta__" + pers.isEstado());
            boolean comp = pers.isEstado();
            if (!comp) {
                modelo.addRow(new Object[]{
                    pers.getCedula(),
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getEmail()

                });
            }

        }

    }

    public void Datos_Niño_recuper(ObjectContainer Base) {

        Niño psic = new Niño();
        psic.setEstado(false);
        ObjectSet person = Base.get(psic);
        DefaultTableModel modelo = (DefaultTableModel) tbla_nin.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        while (person.hasNext()) {
            Niño pers = (Niño) person.next();
            boolean comp = pers.isEstado();
            if (!comp) {
                modelo.addRow(new Object[]{
                    pers.getApodo(),
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getSexo_Niño()

                });
            }
        }

    }

    public void Recuperar_usa(ObjectContainer Base, String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione primero un usuario");
            return;
        }
        Persona perss = new Persona();
        perss.setCedula(cedula);
        ObjectSet result = Base.get(perss);

        if (result.hasNext()) {
            Persona prs = (Persona) result.next();
            boolean est = prs.isEstado();
            if (!est) { // Verifica si el estado actual es falso
                prs.setEstado(true);
                JOptionPane.showMessageDialog(this, "Se recuperó la actividad de la cédula: " + prs.getCedula());
                Base.store(prs);
                Base.commit();
            } else {
                JOptionPane.showMessageDialog(this, "El usuario ya está recuperado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró al usuario con la cédula especificada");
        }

    }

    public void Recuperar_nin(ObjectContainer Base, String cedula) {
        if (cedula.equals("")) {
            JOptionPane.showMessageDialog(this, "Seleccione primero un Niño");
        } else {
            Niño perss = new Niño();
            perss.setApodo(cedula);
            ObjectSet result = Base.get(perss);

            if (result.hasNext()) {
                Niño prs = (Niño) result.next();
                prs.setEstado(true);
                JOptionPane.showMessageDialog(this, "Se recuperó la actividad del Niño: " + prs.getNombre());
                Base.store(prs);
                Base.commit();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró al Niño con el apodo especificado");
            }
        }
    }

    public void consultar_usuario(ObjectContainer Base) {
        String contl = txt_usua_re.getText();
        if (contl == null || contl.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cédula antes de consultar");
            return;
        }
        Persona persn = new Persona();
        persn.setCedula(contl);
        ObjectSet result = Base.get(persn);
        DefaultTableModel modelo = (DefaultTableModel) tbla_usa.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (result.size() == 0) {

            JOptionPane.showMessageDialog(this, "No se encuentra a ninguna persona con la cedula " + contl + " registrada");

        } else {
            while (result.hasNext()) {
                Persona pers = (Persona) result.next();
                boolean activo = pers.isEstado();
                if (!activo) {

                    modelo.addRow(new Object[]{
                        pers.getCedula(),
                        pers.getNombre(),
                        pers.getApellido(),
                        pers.getDireccion(),
                        pers.getFecha_Nacimiento(),
                        pers.getEmail(),
                        pers.getCod_Discapacidad(),
                        pers.getTelefono()
                    });

                } else {
                    JOptionPane.showMessageDialog(this, "El usuario " + contl + " parese no esta Eliminado");
                }

            }

        }

    }

    public void consultar_Niño_recuperaar(ObjectContainer Base) {
        String contl = txt_nino_recu.getText();
        if (contl == null || contl.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cédula antes de consultar");
            return;
        }
        Niño persn = new Niño();
        persn.setApodo(contl);
        ObjectSet result = Base.get(persn);
        DefaultTableModel modelo = (DefaultTableModel) tbla_nin.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (result.size() == 0) {

            JOptionPane.showMessageDialog(this, "No se encuentra a ninguna persona con la cedula " + contl + " registrada");

        } else {
            while (result.hasNext()) {
                Niño pers = (Niño) result.next();
                boolean activo = pers.isEstado();
                if (!activo) {

                    modelo.addRow(new Object[]{
                        pers.getApodo(),
                        pers.getNombre(),
                        pers.getApellido(),
                        pers.getSexo_Niño()
                    });

                } else {
                    JOptionPane.showMessageDialog(this, "El Niño " + contl + " parese no esta Eliminado");
                }

            }

        }

    }

    public void mostrar_niños(ObjectContainer Base) {

        Niño psic = new Niño();
        ObjectSet person = Base.get(psic);
        DefaultTableModel modelo = (DefaultTableModel) tabla_niños.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);
        if (person.size() != 0) {
            while (person.hasNext()) {
                Niño pers = (Niño) person.next();
                modelo.addRow(new Object[]{
                    pers.getNombre(),
                    pers.getApellido(),
                    pers.getApodo(),
                    pers.getFecha_Nacimiento(),
                    pers.getSexo_Niño(),
                    pers.getDiscapacidad()

                });

            }
        }

    }

    public void consultar_niño(ObjectContainer Base) {
        String contl = txt_apodo_consu.getText();
        if (contl == null || contl.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese una cédula antes de consultar");
            return;
        }
        Niño persn = new Niño();
        persn.setApodo(contl);
        ObjectSet result = Base.get(persn);
        DefaultTableModel modelo = (DefaultTableModel) tabla_niños.getModel();
        // Limpiar el modelo antes de agregar nuevas filas
        modelo.setRowCount(0);

        if (result.size() == 0) {

            JOptionPane.showMessageDialog(this, "No se encuentra a ningun niño con el Apodo " + contl + " registrada");

        } else {
            while (result.hasNext()) {
                Niño pers = (Niño) result.next();
                boolean activo = pers.isEstado();
                if (activo) {

                    modelo.addRow(new Object[]{
                        pers.getNombre(),
                        pers.getApellido(),
                        pers.getApodo(),
                        pers.getFecha_Nacimiento(),
                        pers.getSexo_Niño(),
                        pers.getDiscapacidad()
                    });

                } else {
                    JOptionPane.showMessageDialog(this, "El Niño " + contl + " parese que a sido eliminado\nSi desea recuperarlo ir al apartado de RECUPERAR");
                }

            }

        }

    }

}