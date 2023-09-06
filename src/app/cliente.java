package app;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cliente extends javax.swing.JFrame {

    public cliente() {
        initComponents();
        setSize(655, 725);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    //Conexión
    public static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/recibos?characterEncoding=utf8";
    PreparedStatement ps;
    ResultSet rs;

    // Funcion que va conectarse a mi bd de mysql
    public Connection getConnection() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
        return con;
    }

    //Fin Conexión
    private void limpiar() {
        nombre_cliente.setText(null);
        ap_cliente.setText(null);
        am_cliente.setText(null);
        idramal_cliente.setText(null);
        idusuario_cliente.setText(null);
        id_cliente.setText(null);
        DefaultTableModel model = (DefaultTableModel) table_cliente.getModel();
        model.setRowCount(0);
    }

    //Mostrar
    public void mostrarCliente(String tabla) {
        String sql = "SELECT * FROM cliente";
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.obtenerConexion();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("ID Ramal");
        model.addColumn("ID Usuario");
        table_cliente.setModel(model);

        String[] datos = new String[6];
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        nombre_cliente = new javax.swing.JTextField();
        ap_cliente = new javax.swing.JTextField();
        am_cliente = new javax.swing.JTextField();
        idramal_cliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_cliente = new javax.swing.JTable();
        consulta_button = new javax.swing.JButton();
        agreagar_button = new javax.swing.JButton();
        mostrar_button = new javax.swing.JButton();
        buscar_button = new javax.swing.JButton();
        editar_button = new javax.swing.JButton();
        eliminar_button = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idusuario_cliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 178, 231)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 21, 158));
        jLabel1.setText("Contribuyente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("ID Contribuyente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 72, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre (s):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 138, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 209, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Materno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 273, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ID Ramal:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 323, -1, -1));

        id_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(id_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 69, 283, 25));

        nombre_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(nombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 135, 283, 24));

        ap_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(ap_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 283, 24));

        am_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(am_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 283, 20));

        idramal_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(idramal_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 283, 23));

        table_cliente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        table_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Contribuyente", "Nombre", "Apellido Paterno", "Apellido Materno", "ID Ramal"
            }
        ));
        jScrollPane1.setViewportView(table_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 405, 560, 91));

        consulta_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar.png"))); // NOI18N
        consulta_button.setToolTipText("Consultar");
        consulta_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consulta_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(consulta_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 323, -1, -1));

        agreagar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/agregar.png"))); // NOI18N
        agreagar_button.setToolTipText("Agregar");
        agreagar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreagar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(agreagar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 514, 43, -1));

        mostrar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar b.png"))); // NOI18N
        mostrar_button.setToolTipText("Mostrar");
        mostrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 514, 47, -1));

        buscar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar.png"))); // NOI18N
        buscar_button.setToolTipText("Buscar");
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(buscar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 514, 43, -1));

        editar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/editar.png"))); // NOI18N
        editar_button.setToolTipText("Editar");
        editar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(editar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 519, 44, -1));

        eliminar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/eliminar.png"))); // NOI18N
        eliminar_button.setToolTipText("Eliminar");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 514, 46, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/regresar.png"))); // NOI18N
        jButton6.setToolTipText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 588, 38, 27));

        jLabel7.setText("ID Usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 365, -1, -1));

        idusuario_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(idusuario_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 364, 283, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 364, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Agregar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 566, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Mostrar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 566, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Buscar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 566, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Editar");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 566, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Eliminar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 566, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Regresar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 621, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/limpiar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 514, 47, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Limpiar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 566, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agreagar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreagar_buttonActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO cliente (nombrecliente,apcliente,amcliente,idramal1, idusuario2) VALUES (?,?,?,?,?) ");
            ps.setString(1, nombre_cliente.getText());
            ps.setString(2, ap_cliente.getText());
            ps.setString(3, am_cliente.getText());
            ps.setString(4, idramal_cliente.getText());
            ps.setString(5, idusuario_cliente.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }

    }//GEN-LAST:event_agreagar_buttonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mostrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_buttonActionPerformed
        mostrarCliente("cliente");
    }//GEN-LAST:event_mostrar_buttonActionPerformed

    private void editar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_buttonActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE cliente SET  nombrecliente = ?, apcliente = ?, amcliente = ?, idramal1 = ?, idusuario2 = ? WHERE idcliente = ? ");
            ps.setString(1, nombre_cliente.getText());
            ps.setString(2, ap_cliente.getText());
            ps.setString(3, am_cliente.getText());
            ps.setString(4, idramal_cliente.getText());
            ps.setString(5, idusuario_cliente.getText());
            ps.setString(6, id_cliente.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_editar_buttonActionPerformed

    
    private void buscar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_buttonActionPerformed
        Connection con = null;
        try{
            con = getConnection();
             String sql = "SELECT idcliente, nombrecliente, apcliente, amcliente, idramal1, idusuario2 FROM cliente " +
                         "WHERE idcliente LIKE ? or nombrecliente LIKE ? or apcliente LIKE ? or amcliente LIKE ?or idramal1 LIKE ?or idusuario2 LIKE ?";
             
             PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
             statement.setString(1,id_cliente.getText());
            statement.setString(2,nombre_cliente.getText());
            statement.setString(3,ap_cliente.getText()); 
            statement.setString(4,am_cliente.getText()); 
            statement.setString(5,idramal_cliente.getText()); 
            statement.setString(6,idusuario_cliente.getText()); 
            rs= statement.executeQuery();
            if(rs.next()){
                id_cliente.setText(rs.getString("idcliente"));
                nombre_cliente.setText(rs.getString("nombrecliente"));
                ap_cliente.setText(rs.getString("apcliente"));
                am_cliente.setText(rs.getString("amcliente"));
                idramal_cliente.setText(rs.getString("idramal1"));
                idusuario_cliente.setText(rs.getString("idusuario2"));
                
                
            }else{
                JOptionPane.showMessageDialog(null,"No se encontraron resutados");
                limpiar();
            }
            
        }catch(SQLException e){
            System.out.println("Error" + e);
            
        }
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void eliminar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_buttonActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM cliente  WHERE idcliente = ? ");
            ps.setInt(1, Integer.parseInt(id_cliente.getText()));

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error" + e);

        }
    }//GEN-LAST:event_eliminar_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void consulta_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_buttonActionPerformed
        ramal ramal = new ramal();
        ramal.setVisible(true);
    }//GEN-LAST:event_consulta_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarios usuario = new usuarios();
        usuario.setVisible(true);
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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agreagar_button;
    private javax.swing.JTextField am_cliente;
    private javax.swing.JTextField ap_cliente;
    private javax.swing.JButton buscar_button;
    private javax.swing.JButton consulta_button;
    private javax.swing.JButton editar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField idramal_cliente;
    private javax.swing.JTextField idusuario_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar_button;
    private javax.swing.JTextField nombre_cliente;
    private javax.swing.JTable table_cliente;
    // End of variables declaration//GEN-END:variables
}
