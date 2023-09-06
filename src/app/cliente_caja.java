package app;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cliente_caja extends javax.swing.JFrame {

    public cliente_caja() {
        initComponents();
        setSize(545, 562);
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
    private void limpiar(){
        nombre_cliente.setText(null);
        ap_cliente.setText(null);
        am_cliente.setText(null);
        idramal_cliente.setText(null);
        idusuario_cliente.setText(null);
        id_cliente.setText(null);
    }
    
    //Mostrar
    public void mostrarCliente_caja(String tabla) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_cliente = new javax.swing.JTable();
        id_cliente = new javax.swing.JTextField();
        nombre_cliente = new javax.swing.JTextField();
        ap_cliente = new javax.swing.JTextField();
        am_cliente = new javax.swing.JTextField();
        idramal_cliente = new javax.swing.JTextField();
        agregar_button = new javax.swing.JButton();
        mostrar_button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        editar_button = new javax.swing.JButton();
        eliminar_button = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idusuario_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 178, 231)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 21, 158));
        jLabel1.setText("Contribuyente");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("ID Contribuyente:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Apellido Materno:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("ID Ramal:");

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

        id_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });

        nombre_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        ap_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        am_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        idramal_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        agregar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/agregar.png"))); // NOI18N
        agregar_button.setToolTipText("Agregar");
        agregar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_buttonActionPerformed(evt);
            }
        });

        mostrar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar b.png"))); // NOI18N
        mostrar_button.setToolTipText("Mostrar");
        mostrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_buttonActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar.png"))); // NOI18N
        jButton3.setToolTipText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        editar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/editar.png"))); // NOI18N
        editar_button.setToolTipText("Editar");
        editar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_buttonActionPerformed(evt);
            }
        });

        eliminar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/eliminar.png"))); // NOI18N
        eliminar_button.setToolTipText("Eliminar");
        eliminar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_buttonActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/regresar.png"))); // NOI18N
        jButton6.setToolTipText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Usuario:");

        idusuario_cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Agregar");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Mostrar");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Buscar");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Editar");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Eliminar");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Regresar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/limpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombre_cliente)
                                    .addComponent(ap_cliente)
                                    .addComponent(am_cliente)
                                    .addComponent(idramal_cliente)
                                    .addComponent(idusuario_cliente)
                                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 54, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(agregar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mostrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eliminar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(id_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nombre_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ap_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(am_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(idramal_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idusuario_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(mostrar_button, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(agregar_button, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editar_button, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(eliminar_button, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)))
                .addGap(28, 28, 28)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(5, 5, 5))
        );

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

    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clienteActionPerformed

    private void agregar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_buttonActionPerformed
       Connection con= null;
        try{
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO cliente (nombrecliente,apcliente,amcliente,idramal1, idusuario2) VALUES (?,?,?,?,?) ");
            ps.setString(1,nombre_cliente.getText());
            ps.setString(2,ap_cliente.getText());
            ps.setString(3,am_cliente.getText());
            ps.setString(4,idramal_cliente.getText());
            ps.setString(5,idusuario_cliente.getText());
            
           int res= ps.executeUpdate();
           if(res>0){
               JOptionPane.showMessageDialog(null,"Cliente guardado");
               limpiar();
           }else{
               JOptionPane.showMessageDialog(null, "Error al guardar");
               limpiar();
           }
            con.close();      
        }catch(Exception e){
            System.out.println("Error"+ e);
            
        }
    }//GEN-LAST:event_agregar_buttonActionPerformed

    private void mostrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_buttonActionPerformed
        mostrarCliente_caja("cliente");
    }//GEN-LAST:event_mostrar_buttonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con=null;        
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
                nombre_cliente.setText(rs.getString("nombrecliente"));
                ap_cliente.setText(rs.getString("apcliente"));
                am_cliente.setText(rs.getString("amcliente"));
                idramal_cliente.setText(rs.getString("idramal1"));
                idusuario_cliente.setText(rs.getString("idusuario2"));
                id_cliente.setText(rs.getString("idcliente"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No se encontraron resutados");
                limpiar();
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        menu_caja menu = new menu_caja();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
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
            java.util.logging.Logger.getLogger(cliente_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_button;
    private javax.swing.JTextField am_cliente;
    private javax.swing.JTextField ap_cliente;
    private javax.swing.JButton editar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField idramal_cliente;
    private javax.swing.JTextField idusuario_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
