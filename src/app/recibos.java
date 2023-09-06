package app;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.awt.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class recibos extends javax.swing.JFrame {

    private javax.swing.JCheckBox[] mesesCheckBoxes;

    public recibos() {
        initComponents();
        setSize(880, 660);
        setLocationRelativeTo(null);
        setResizable(false);
        mesesCheckBoxes = new javax.swing.JCheckBox[]{
            enero_cb, febrero_cb, marzo_cb, abril_cb, mayo_cb, junio_cb,
            julio_cb, agosto_cb, septiembre_cb, octubre_cb, noviembre_cb, diciembre_cb
        };

    }

    private void limpiar() {
        anio_recibo.setText(null);
        dia_recibo.setText(null);
        recargos_recibos.setText(null);
        conexion_recibos.setText(null);
        cooperacion_recibos.setText(null);
        otros_recibos.setText(null);
        idcliente_recibos.setText(null);
        idadmin_recibos.setText(null);
        total_recibos.setText(null);
        id_recibos.setText(null);
        //combo
        jComboBox1.setSelectedIndex(0);
        //check
        enero_cb.setSelected(false);
        febrero_cb.setSelected(false);
        marzo_cb.setSelected(false);
        abril_cb.setSelected(false);
        mayo_cb.setSelected(false);
        junio_cb.setSelected(false);
        julio_cb.setSelected(false);
        agosto_cb.setSelected(false);
        septiembre_cb.setSelected(false);
        octubre_cb.setSelected(false);
        noviembre_cb.setSelected(false);
        diciembre_cb.setSelected(false);

    }

    //Conexión
    public static java.sql.Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/recibos?characterEncoding=utf8";
    PreparedStatement ps;
    ResultSet rs;

    // Funcion que va conectarse a mi bd de mysql
    public java.sql.Connection getConnection() {
        try {
            con = (java.sql.Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    }

    //Mostrar
    public void mostrarRecibo(String tabla) {
        String sql = "SELECT * FROM recibos";
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.obtenerConexion();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("AÑO");
        model.addColumn("MES");
        model.addColumn("DIA");
        model.addColumn("CUOTA M.");
        model.addColumn("RECARGO");
        model.addColumn("CONEXION");
        model.addColumn("COOPERACION");
        model.addColumn("OTROS");
        model.addColumn("CLIENTE");
        model.addColumn("ADMINISTRADOR");
        model.addColumn("TOTAL");
        recibo_table.setModel(model);

        String[] datos = new String[13];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                model.addRow(datos);

            }
        } catch (SQLException e) {
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id_recibos = new javax.swing.JTextField();
        anio_recibo = new javax.swing.JTextField();
        dia_recibo = new javax.swing.JTextField();
        recargos_recibos = new javax.swing.JTextField();
        conexion_recibos = new javax.swing.JTextField();
        cooperacion_recibos = new javax.swing.JTextField();
        otros_recibos = new javax.swing.JTextField();
        total_recibos = new javax.swing.JTextField();
        idcliente_recibos = new javax.swing.JTextField();
        idadmin_recibos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        recibo_table = new javax.swing.JTable();
        enero_cb = new javax.swing.JCheckBox();
        febrero_cb = new javax.swing.JCheckBox();
        marzo_cb = new javax.swing.JCheckBox();
        abril_cb = new javax.swing.JCheckBox();
        mayo_cb = new javax.swing.JCheckBox();
        junio_cb = new javax.swing.JCheckBox();
        julio_cb = new javax.swing.JCheckBox();
        agosto_cb = new javax.swing.JCheckBox();
        septiembre_cb = new javax.swing.JCheckBox();
        octubre_cb = new javax.swing.JCheckBox();
        noviembre_cb = new javax.swing.JCheckBox();
        diciembre_cb = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        eliminar_button = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        buscar_button = new javax.swing.JButton();
        mostrar_button = new javax.swing.JButton();
        agregar_button = new javax.swing.JButton();
        regresar_button = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 178, 231)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 21, 158));
        jLabel1.setText("Recibos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("ID Recibos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Año:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 111, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Mes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 111, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Día:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 111, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Cuota Mensual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 276, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Recargos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 276, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Conexión:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 311, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Cooperación:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 311, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Otros:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 347, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Total:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("ID Contribuyente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("ID Administrador:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        id_recibos.setToolTipText("");
        id_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(id_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 61, 162, -1));

        anio_recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(anio_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 112, 64, -1));

        dia_recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(dia_recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 112, 68, -1));

        recargos_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(recargos_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 277, 200, -1));

        conexion_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(conexion_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 312, 200, -1));

        cooperacion_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(cooperacion_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 312, 200, -1));

        otros_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(otros_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 347, 200, -1));

        total_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(total_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 200, -1));

        idcliente_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(idcliente_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 200, -1));

        idadmin_recibos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(idadmin_recibos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 200, -1));

        recibo_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Recibo", "Año", "Mes", "Día", "Cuota Mensualnull", "Recargos", "Conexión", "Cooperación", "Otros", "Total", "ID Cliente", "ID Admin", "ID Ramal"
            }
        ));
        jScrollPane1.setViewportView(recibo_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 765, 91));

        enero_cb.setBackground(new java.awt.Color(255, 255, 255));
        enero_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        enero_cb.setText("Enero");
        jPanel1.add(enero_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 96, -1, -1));

        febrero_cb.setBackground(new java.awt.Color(255, 255, 255));
        febrero_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        febrero_cb.setText("Febrero");
        jPanel1.add(febrero_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 96, -1, -1));

        marzo_cb.setBackground(new java.awt.Color(255, 255, 255));
        marzo_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        marzo_cb.setText("Marzo");
        jPanel1.add(marzo_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 96, -1, -1));

        abril_cb.setBackground(new java.awt.Color(255, 255, 255));
        abril_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        abril_cb.setText("Abril");
        jPanel1.add(abril_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 135, -1, -1));

        mayo_cb.setBackground(new java.awt.Color(255, 255, 255));
        mayo_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        mayo_cb.setText("Mayo");
        jPanel1.add(mayo_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 135, -1, -1));

        junio_cb.setBackground(new java.awt.Color(255, 255, 255));
        junio_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        junio_cb.setText("Junio");
        jPanel1.add(junio_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 135, -1, -1));

        julio_cb.setBackground(new java.awt.Color(255, 255, 255));
        julio_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        julio_cb.setText("Julio");
        jPanel1.add(julio_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 175, -1, -1));

        agosto_cb.setBackground(new java.awt.Color(255, 255, 255));
        agosto_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        agosto_cb.setText("Agosto");
        jPanel1.add(agosto_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 175, -1, -1));

        septiembre_cb.setBackground(new java.awt.Color(255, 255, 255));
        septiembre_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        septiembre_cb.setText("Septiembre");
        jPanel1.add(septiembre_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 175, -1, -1));

        octubre_cb.setBackground(new java.awt.Color(255, 255, 255));
        octubre_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        octubre_cb.setText("Octubre");
        jPanel1.add(octubre_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 216, -1, -1));

        noviembre_cb.setBackground(new java.awt.Color(255, 255, 255));
        noviembre_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        noviembre_cb.setText("Noviembre");
        jPanel1.add(noviembre_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 216, -1, -1));

        diciembre_cb.setBackground(new java.awt.Color(255, 255, 255));
        diciembre_cb.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        diciembre_cb.setText("Diciembre");
        jPanel1.add(diciembre_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 216, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar.png"))); // NOI18N
        jButton1.setToolTipText("Consultar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar.png"))); // NOI18N
        jButton3.setToolTipText("Consultar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        eliminar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/eliminar.png"))); // NOI18N
        eliminar_button.setToolTipText("Eliminar");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 45, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/editar.png"))); // NOI18N
        jButton5.setToolTipText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 49, -1));

        buscar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar.png"))); // NOI18N
        buscar_button.setToolTipText("Buscar");
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(buscar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 50, -1));

        mostrar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar b.png"))); // NOI18N
        mostrar_button.setToolTipText("Mostrar");
        mostrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 47, -1));

        agregar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/agregar.png"))); // NOI18N
        agregar_button.setToolTipText("Agregar");
        agregar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(agregar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 46, -1));

        regresar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/regresar.png"))); // NOI18N
        regresar_button.setToolTipText("Regresar");
        regresar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(regresar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 39, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Agregar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Mostrar");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("Buscar");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setText("Editar");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setText("Eliminar");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setText("Regresar");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un monto", "2032", "123", "45" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 200, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/limpiar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 50, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel22.setText("Limpiar");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel13.setText("Consultar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel21.setText("Consultar");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_buttonActionPerformed
        java.sql.Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO recibos (aniorecibo,mesrecibo,diarecibo,cuotamensual, recargo,conexionrecibo,cooperacion,otros,idcliente1,idadministrador1,total) VALUES (?,?,?,?,?,?,?,?,?,?,?) ");
            ps.setString(1, anio_recibo.getText());
            ps.setString(3, dia_recibo.getText());
            ps.setString(4, (String) jComboBox1.getSelectedItem());
            ps.setString(5, recargos_recibos.getText());
            ps.setString(6, conexion_recibos.getText());
            ps.setString(7, cooperacion_recibos.getText());
            ps.setString(8, otros_recibos.getText());
            ps.setString(9, idcliente_recibos.getText());
            ps.setString(10, idadmin_recibos.getText());
            ps.setString(11, total_recibos.getText());

            // Calculate the total based on the selected months and other values
            double cuotaMensual = Double.parseDouble((String) jComboBox1.getSelectedItem());
            double recargos = Double.parseDouble(recargos_recibos.getText());
            double conexion = Double.parseDouble(conexion_recibos.getText());
            double cooperacion = Double.parseDouble(cooperacion_recibos.getText());
            double otros = Double.parseDouble(otros_recibos.getText());
            int selectedMonthsCount = 0;

            // Calculate the number of selected months
            for (javax.swing.JCheckBox checkBox : mesesCheckBoxes) {
                if (checkBox.isSelected()) {
                    selectedMonthsCount++;
                }
            }

            double total = cuotaMensual * selectedMonthsCount + recargos + conexion + cooperacion + otros;
            ps.setString(11, String.valueOf(total));

            // Set month checkboxes
            StringBuilder selectedMonths = new StringBuilder();
            for (int i = 0; i < mesesCheckBoxes.length; i++) {
                if (mesesCheckBoxes[i].isSelected()) {
                    selectedMonths.append(i + 1).append(",");
                }
            }
            if (selectedMonths.length() > 0) {
                selectedMonths.deleteCharAt(selectedMonths.length() - 1); // Remove the trailing comma
            }
            ps.setString(2, selectedMonths.toString());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Recibo guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_agregar_buttonActionPerformed

    private void regresar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_buttonActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresar_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cliente cliente = new cliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        administrador administrador = new administrador();
        administrador.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void mostrarMeses(){
    
                   
                    
    
    }
    
    private void buscar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_buttonActionPerformed
        Connection con = null;
        try {
            con = (Connection) getConnection();
            String sql = "SELECT idrecibo, aniorecibo, mesrecibo, diarecibo, cuotamensual, recargo, conexionrecibo, cooperacion, otros, idcliente1, idadministrador1, total FROM recibos "
                    + "WHERE idrecibo LIKE ? OR aniorecibo LIKE ?  OR diarecibo LIKE ? OR cuotamensual LIKE ? OR recargo LIKE ? OR conexionrecibo LIKE ? OR cooperacion LIKE ? OR otros LIKE ? OR idcliente1 LIKE ? OR idadministrador1 LIKE ? OR total LIKE ? OR mesrecibo LIKE ? ";
            System.out.println("eSTA ES LA CONSULTA A LA BASE DE DATOS " + sql);
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            boolean[] months = {
                enero_cb.isSelected(),
                febrero_cb.isSelected(),
                marzo_cb.isSelected(),
                abril_cb.isSelected(),
                mayo_cb.isSelected(),
                junio_cb.isSelected(),
                julio_cb.isSelected(),
                agosto_cb.isSelected(),
                septiembre_cb.isSelected(),
                octubre_cb.isSelected(),
                noviembre_cb.isSelected(),
                diciembre_cb.isSelected()
            };

            for (int i = 0; i < months.length; i++) {
                ps.setBoolean(12 - i, months[i]);
            }

            ps.setString(1, id_recibos.getText());
            ps.setString(2, anio_recibo.getText());
//            ps.setBoolean(2, enero);    
            ps.setString(3, dia_recibo.getText());
            ps.setString(4, (String) jComboBox1.getSelectedItem());
            ps.setString(5, recargos_recibos.getText());
            ps.setString(6, conexion_recibos.getText());
            ps.setString(7, cooperacion_recibos.getText());
            ps.setString(8, otros_recibos.getText());
            ps.setString(9, idcliente_recibos.getText());
            ps.setString(10, idadmin_recibos.getText());
            ps.setString(11, total_recibos.getText());
            System.out.println(ps);
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("ESTO ES LO QUE CONTIENE RS " + rs);
                anio_recibo.setText(rs.getString("aniorecibo"));
                dia_recibo.setText(rs.getString("diarecibo"));
                jComboBox1.setSelectedItem("cuotamensual");
                recargos_recibos.setText(rs.getString("recargo"));
                conexion_recibos.setText(rs.getString("conexionrecibo"));
                cooperacion_recibos.setText(rs.getString("cooperacion"));
                otros_recibos.setText(rs.getString("otros"));
                idcliente_recibos.setText(rs.getString("idcliente1"));
                idadmin_recibos.setText(rs.getString("idadministrador1"));
                total_recibos.setText(rs.getString("total"));
                id_recibos.setText(rs.getString("idrecibo"));
                jComboBox1.setSelectedItem(rs.getString("cuotamensual"));
                int aux = 0;
                String acumulador = "";
                
                        
                String mesRecibo = rs.getString("mesrecibo");
                int contador = 0;
                char mes='0';
                
                for (int i = 0; i < mesRecibo.length()+1; i++) {
                
                    if ( i < mesRecibo.length() ){
                           mes = mesRecibo.charAt(i);

                    }
 
                    if (mes == ',' || i+1 == mesRecibo.length()+1  ) {
                        System.out.println("Soy un mes " + mes);
                       // aux = Character.getNumericValue(mes);
                       aux = Integer.parseInt(acumulador);
                       acumulador = "";
                        System.out.println("soy un aux :" + aux);
                        switch (aux) {
                            case 1:
                                enero_cb.setSelected(true);
                                System.out.println("Soy enero");
                                break;
                            case 2:
                                febrero_cb.setSelected(true);
                                break;
                            case 3:
                                marzo_cb.setSelected(true);
                                System.out.println( " Soy Marxo");
                                break;
                            case 4:
                                abril_cb.setSelected(true);
                                System.out.println("Soy abril");
                                break;
                            case 5:
                                mayo_cb.setSelected(true);
                                System.out.println("Soy mayo");
                                aux = 0;
                                break;
                            case 6:
                                junio_cb.setSelected(true);
                                break;
                            case 7:
                                julio_cb.setSelected(true);
                                System.out.println("Soy julio");
                                aux = 0;

                                break;
                            case 8:
                                agosto_cb.setSelected(aux == 8);
                                aux = 0;
                                System.out.println("Agosto ");
                                break;
                            case 9:
                                septiembre_cb.setSelected(aux == 9);
                                
                                aux = 0;
                                break;
                            case 10:
                                octubre_cb.setSelected(aux == 10);
                                aux = 0;
                                break;
                            case 11:
                                noviembre_cb.setSelected(aux == 11);
                                aux = 0;
                                break;
                            case 12:
                                diciembre_cb.setSelected(aux == 12);
                                aux = 0;
                                break;
                            default:
                                System.out.println("Lo qu euno hace  por la areli");
                                break;
                        }
                        
                }else{
                        acumulador += mes;
                        System.out.println("Esto valor acumulador "+acumulador);
                    }
                
                }
                
               
                                  

//        enero_cb.setSelected(mesRecibo == 1);
//        febrero_cb.setSelected(mesRecibo == 2);
//        marzo_cb.setSelected(mesRecibo == 3);
//        abril_cb.setSelected(mesRecibo == 4);
//        mayo_cb.setSelected(mesRecibo == 5);
//        junio_cb.setSelected(mesRecibo == 6);
//        julio_cb.setSelected(mesRecibo == 7);
//        agosto_cb.setSelected(mesRecibo == 8);
//        septiembre_cb.setSelected(mesRecibo == 9);
//        octubre_cb.setSelected(mesRecibo == 10);
//        noviembre_cb.setSelected(mesRecibo == 11);
//        diciembre_cb.setSelected(mesRecibo == 12);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resutados");
            }

        } catch (SQLException e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void eliminar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buttonActionPerformed
        Connection con = null;
        try {
            con = (Connection) getConnection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM recibos  WHERE idrecibo = ? ");
            ps.setInt(1, Integer.parseInt(id_recibos.getText()));

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Recibo eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_eliminar_buttonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        java.sql.Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE recibos SET  aniorecibo = ?, mesrecibo = ?, diarecibo = ?, cuotamensual = ?, recargo = ?, conexionrecibo = ?, cooperacion = ?, otros = ?, idcliente1 = ?, idadministrador1 = ?, total = ? WHERE idrecibo = ? ");
            ps.setString(1, anio_recibo.getText());
            ps.setString(3, dia_recibo.getText());
            ps.setString(4, (String) jComboBox1.getSelectedItem());
            ps.setString(5, recargos_recibos.getText());
            ps.setString(6, conexion_recibos.getText());
            ps.setString(7, cooperacion_recibos.getText());
            ps.setString(8, otros_recibos.getText());
            ps.setString(9, idcliente_recibos.getText());
            ps.setString(10, idadmin_recibos.getText());
            ps.setString(11, total_recibos.getText());
            ps.setString(12, id_recibos.getText());

            // Calculate the total based on the selected months and other values
            double cuotaMensual = Double.parseDouble((String) jComboBox1.getSelectedItem());
            double recargos = Double.parseDouble(recargos_recibos.getText());
            double conexion = Double.parseDouble(conexion_recibos.getText());
            double cooperacion = Double.parseDouble(cooperacion_recibos.getText());
            double otros = Double.parseDouble(otros_recibos.getText());
            int selectedMonthsCount = 0;

            // Calculate the number of selected months
            for (javax.swing.JCheckBox checkBox : mesesCheckBoxes) {
                if (checkBox.isSelected()) {
                    selectedMonthsCount++;
                }
            }

            double total = cuotaMensual * selectedMonthsCount + recargos + conexion + cooperacion + otros;
            ps.setString(11, String.valueOf(total));

            // Set month checkboxes
            StringBuilder selectedMonths = new StringBuilder();
            for (int i = 0; i < mesesCheckBoxes.length; i++) {
                if (mesesCheckBoxes[i].isSelected()) {
                    selectedMonths.append(i + 1).append(",");
                }
            }
            if (selectedMonths.length() > 0) {
                selectedMonths.deleteCharAt(selectedMonths.length() - 1); // Remove the trailing comma
            }
            ps.setString(2, selectedMonths.toString());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Recibo guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void mostrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_buttonActionPerformed
        mostrarRecibo("recibos");
    }//GEN-LAST:event_mostrar_buttonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(recibos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recibos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recibos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recibos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recibos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox abril_cb;
    private javax.swing.JCheckBox agosto_cb;
    private javax.swing.JButton agregar_button;
    private javax.swing.JTextField anio_recibo;
    private javax.swing.JButton buscar_button;
    private javax.swing.JTextField conexion_recibos;
    private javax.swing.JTextField cooperacion_recibos;
    private javax.swing.JTextField dia_recibo;
    private javax.swing.JCheckBox diciembre_cb;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JCheckBox enero_cb;
    private javax.swing.JCheckBox febrero_cb;
    private javax.swing.JTextField id_recibos;
    private javax.swing.JTextField idadmin_recibos;
    private javax.swing.JTextField idcliente_recibos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JCheckBox julio_cb;
    private javax.swing.JCheckBox junio_cb;
    private javax.swing.JCheckBox marzo_cb;
    private javax.swing.JCheckBox mayo_cb;
    private javax.swing.JButton mostrar_button;
    private javax.swing.JCheckBox noviembre_cb;
    private javax.swing.JCheckBox octubre_cb;
    private javax.swing.JTextField otros_recibos;
    private javax.swing.JTextField recargos_recibos;
    private javax.swing.JTable recibo_table;
    private javax.swing.JButton regresar_button;
    private javax.swing.JCheckBox septiembre_cb;
    private javax.swing.JTextField total_recibos;
    // End of variables declaration//GEN-END:variables
}
