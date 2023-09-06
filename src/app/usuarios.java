package app;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class usuarios extends javax.swing.JFrame {

    int cont;

    public usuarios() {
        initComponents();
        setSize(685, 625);
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
        nombre_usuario.setText(null);
        pass_usuario.setText(null);
        tipo_usu.setText(null);
        id_usuario.setText(null);
    }
    //Mostrar
    public void mostrarUsuarios(String tabla) {
        String sql = "SELECT * FROM usuario";
        Statement st;
        ConexionDB con = new ConexionDB();
        Connection conexion = con.obtenerConexion();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Password");
        model.addColumn("Tipo usuario");
        usuario_table.setModel(model);

        String[] datos = new String[4];
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
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
        id_usuario = new javax.swing.JTextField();
        nombre_usuario = new javax.swing.JTextField();
        pass_usuario = new javax.swing.JTextField();
        tipo_usu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuario_table = new javax.swing.JTable();
        agregar_button = new javax.swing.JButton();
        mostrar_button = new javax.swing.JButton();
        buscar_button = new javax.swing.JButton();
        editar_button = new javax.swing.JButton();
        eliminar_button = new javax.swing.JButton();
        regresar_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 178, 231)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 21, 158));
        jLabel1.setText("Usuarios");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("ID Usuario:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Tipo Usuario:");

        id_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        id_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_usuarioActionPerformed(evt);
            }
        });

        nombre_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });

        pass_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        pass_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_usuarioActionPerformed(evt);
            }
        });

        tipo_usu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));

        usuario_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Usuario", "Nombre", "Contraseña", "Tipo Usuario", "ID Cliente", "ID Administrador"
            }
        ));
        jScrollPane1.setViewportView(usuario_table);

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

        buscar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar.png"))); // NOI18N
        buscar_button.setToolTipText("Buscar");
        buscar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_buttonActionPerformed(evt);
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

        regresar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/regresar.png"))); // NOI18N
        regresar_button.setToolTipText("Regresar");
        regresar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Agregar");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Mostrar");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Buscar");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Editar");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Eliminar");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Regresar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/limpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel1))
                            .addComponent(id_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(pass_usuario)
                            .addComponent(tipo_usu)
                            .addComponent(nombre_usuario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(agregar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(regresar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipo_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(agregar_button)
                            .addComponent(mostrar_button)
                            .addComponent(buscar_button)
                            .addComponent(eliminar_button)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(regresar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
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

    private void pass_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_usuarioActionPerformed

    private void id_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_usuarioActionPerformed

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_usuarioActionPerformed

    private void agregar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_buttonActionPerformed
          Connection con= null;
        try{
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("INSERT INTO usuario (nomusuario,passusuario,tipousuario) VALUES (?,?,?) ");
            ps.setString(1,nombre_usuario.getText());
            ps.setString(2,pass_usuario.getText());
            ps.setString(3,tipo_usu.getText());
            
           int res= ps.executeUpdate();
           if(res>0){
               JOptionPane.showMessageDialog(null,"Usuario guardado");
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
         mostrarUsuarios("usuario");
    }//GEN-LAST:event_mostrar_buttonActionPerformed

    private void buscar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_buttonActionPerformed
        Connection con=null;        
        try{
            con = getConnection();
             String sql = "SELECT idusuario, nomusuario, passusuario, tipousuario FROM usuario " +
                         "WHERE idusuario LIKE ? or nomusuario LIKE ? or passusuario LIKE ? or tipousuario LIKE ?";
             
             PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
             statement.setString(1,id_usuario.getText());
            statement.setString(2,nombre_usuario.getText());
            statement.setString(3,pass_usuario.getText()); 
            statement.setString(4,tipo_usu.getText()); 
            rs= statement.executeQuery();
            if(rs.next()){
                nombre_usuario.setText(rs.getString("nomusuario"));
                pass_usuario.setText(rs.getString("passusuario"));
                tipo_usu.setText(rs.getString("tipousuario"));
                id_usuario.setText(rs.getString("idusuario"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No se encontraron resutados");
                limpiar();
            }
        }catch(SQLException e){
            System.out.println("Error" + e);
            
        }
    }//GEN-LAST:event_buscar_buttonActionPerformed

    private void editar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_buttonActionPerformed
        Connection con = null;
        try {
            con = getConnection();
            ps = (PreparedStatement) con.prepareStatement("UPDATE usuario SET  nomusuario = ?, passusuario = ?, tipousuario =?  WHERE idusuario = ? ");
            ps.setString(1, nombre_usuario.getText());
            ps.setString(2, pass_usuario.getText());
            ps.setString(3, tipo_usu.getText());
            ps.setString(4, id_usuario.getText());
            

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario modificado");
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
            ps = (PreparedStatement) con.prepareStatement("DELETE FROM usuario  WHERE idusuario = ? ");
            ps.setInt(1, Integer.parseInt(id_usuario.getText()));
            

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
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

    private void regresar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_buttonActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresar_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_button;
    private javax.swing.JButton buscar_button;
    private javax.swing.JButton editar_button;
    private javax.swing.JButton eliminar_button;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField nombre_usuario;
    private javax.swing.JTextField pass_usuario;
    private javax.swing.JButton regresar_button;
    private javax.swing.JTextField tipo_usu;
    private javax.swing.JTable usuario_table;
    // End of variables declaration//GEN-END:variables
}
