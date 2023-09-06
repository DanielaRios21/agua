package app;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reporte extends javax.swing.JFrame {

    public reporte() {
        initComponents();
        setSize(700, 580);
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
        anio.setText(null);
        dia_reporte.setText(null);
        id_ramal.setText(null);
        mes_reporte.setText(null);
        usuario_reporte.setText(null);
        //combo
        monto_combo.setSelectedIndex(0);
        //check
//        enero.setSelected(false);
//        febrero.setSelected(false);
//        marzo.setSelected(false);
//        abril.setSelected(false);
//        mayo.setSelected(false);
//        junio.setSelected(false);
//        julio.setSelected(false);
//        agosto.setSelected(false);
//        septiembre.setSelected(false);
//        octubre.setSelected(false);
//        noviembre.setSelected(false);
//        diciembre.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) table_reporte.getModel();
        model.setRowCount(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dia_reporte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        monto_combo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_ramal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reporte = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mes_reporte = new javax.swing.JTextField();
        buscar_mes = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        usuario_reporte = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mostrar_usuario = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 178, 231)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 21, 158));
        jLabel1.setText("Reporte");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(275, 12, 90, 31);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Año:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 90, 27, 16);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Mes:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 90, 27, 16);

        anio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(anio);
        anio.setBounds(60, 90, 78, 16);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Día:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 90, 23, 16);

        dia_reporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        jPanel1.add(dia_reporte);
        dia_reporte.setBounds(530, 90, 70, 16);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Cuota Mensual:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 170, 92, 16);

        monto_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un monto", "2032", "123", "45" }));
        monto_combo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 21, 158)));
        monto_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monto_comboActionPerformed(evt);
            }
        });
        jPanel1.add(monto_combo);
        monto_combo.setBounds(120, 170, 91, 22);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_menu/impresion.png"))); // NOI18N
        jButton2.setToolTipText("Impresión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(383, 386, 75, 73);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/regresar.png"))); // NOI18N
        jButton3.setToolTipText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(567, 465, 43, 29);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Imprimir");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(405, 465, 47, 14);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Regresar");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(557, 495, 52, 16);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(85, 386, 50, 40);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Buscar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(86, 433, 39, 16);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("ID Ramal:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(260, 170, 55, 16);

        id_ramal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 21, 154)));
        jPanel1.add(id_ramal);
        id_ramal.setBounds(330, 170, 80, 16);

        table_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_reporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_reporte);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 264, 590, 91);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/limpiar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(233, 386, 50, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Limpiar");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(233, 432, 50, 16);

        mes_reporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 21, 154)));
        jPanel1.add(mes_reporte);
        mes_reporte.setBounds(290, 90, 78, 16);

        buscar_mes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/buscar (1).png"))); // NOI18N
        buscar_mes.setToolTipText("Buscar Mes");
        buscar_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_mesActionPerformed(evt);
            }
        });
        jPanel1.add(buscar_mes);
        buscar_mes.setBounds(380, 90, 41, 25);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Usuario:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 170, 46, 16);

        usuario_reporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(14, 21, 154)));
        jPanel1.add(usuario_reporte);
        usuario_reporte.setBounds(530, 170, 70, 16);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel11.setText("Buscar Mes");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 120, 60, 14);

        mostrar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos_crud/mostrar.png"))); // NOI18N
        mostrar_usuario.setToolTipText("Mostrar");
        mostrar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar_usuario);
        mostrar_usuario.setBounds(610, 170, 30, 25);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel13.setText("Mostrar");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(600, 200, 50, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menu_caja menu_caja = new menu_caja();
        menu_caja.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void monto_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monto_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monto_comboActionPerformed

    private DefaultTableModel tablaModelo;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        com.mysql.jdbc.Connection con = null;
        try {
            con = (com.mysql.jdbc.Connection) getConnection();
            String sql = "SELECT aniorecibo, diarecibo,mesrecibo, cuotamensual, idramal1 FROM recibos AS r INNER JOIN cliente AS c ON idcliente1 = idcliente INNER JOIN ramal AS rm ON idramal1 = idramal WHERE aniorecibo LIKE ? OR  diarecibo LIKE ? OR cuotamensual LIKE ? OR idramal1 LIKE ?";
            System.out.println("eSTA ES LA CONSULTA A LA BASE DE DATOS " + sql);
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
//            boolean[] months = {
//                enero.isSelected(),
//                febrero.isSelected(),
//                marzo.isSelected(),
//                abril.isSelected(),
//                mayo.isSelected(),
//                junio.isSelected(),
//                julio.isSelected(),
//                agosto.isSelected(),
//                septiembre.isSelected(),
//                octubre.isSelected(),
//                noviembre.isSelected(),
//                diciembre.isSelected()
//            };
            ps.setString(1, anio.getText());
            ps.setString(2, dia_reporte.getText());
            ps.setString(3, (String) monto_combo.getSelectedItem());
            ps.setString(4, id_ramal.getText());
            System.out.println(ps);
            rs = ps.executeQuery();
//
//            for (int i = 0; i < months.length; i++) {
//                ps.setBoolean(4 - 1, months[i]);
//            }
            if (rs.next()) {
                System.out.println("ESTO ES LO QUE CONTIENE RS " + rs);
//                anio.setText(rs.getString("aniorecibo"));
//                dia_reporte.setText(rs.getString("diarecibo"));
//                monto_combo.setSelectedItem(rs.getString("cuotamensual"));
//                id_ramal.setText(rs.getString("idramal1"));
                int aux = 0;
                String acumulador = "";

//                String mesRecibo = rs.getString("mesrecibo");
//                int contador = 0;
//                char mes = '0';
//
//                for (int i = 0; i < mesRecibo.length() + 1; i++) {
//
//                    if (i < mesRecibo.length()) {
//                        mes = mesRecibo.charAt(i);
//
//                    }
//
//                    if (mes == ',' || i + 1 == mesRecibo.length() + 1) {
//                        System.out.println("Soy un mes " + mes);
//                        // aux = Character.getNumericValue(mes);
//                        aux = Integer.parseInt(acumulador);
//                        acumulador = "";
//                        System.out.println("soy un aux :" + aux);
//                        switch (aux) {
//                            case 1:
//                                enero.setSelected(true);
//                                System.out.println("Soy enero");
//                                break;
//                            case 2:
//                                febrero.setSelected(true);
//                                break;
//                            case 3:
//                                marzo.setSelected(true);
//                                System.out.println(" Soy marzo");
//                                break;
//                            case 4:
//                                abril.setSelected(true);
//                                System.out.println("Soy abril");
//                                break;
//                            case 5:
//                                mayo.setSelected(true);
//                                System.out.println("Soy mayo");
//                                aux = 0;
//                                break;
//                            case 6:
//                                junio.setSelected(true);
//                                break;
//                            case 7:
//                                julio.setSelected(true);
//                                System.out.println("Soy julio");
//                                aux = 0;
//
//                                break;
//                            case 8:
//                                agosto.setSelected(aux == 8);
//                                aux = 0;
//                                System.out.println("Agosto ");
//                                break;
//                            case 9:
//                                septiembre.setSelected(aux == 9);
//
//                                aux = 0;
//                                break;
//                            case 10:
//                                octubre.setSelected(aux == 10);
//                                aux = 0;
//                                break;
//                            case 11:
//                                noviembre.setSelected(aux == 11);
//                                aux = 0;
//                                break;
//                            case 12:
//                                diciembre.setSelected(aux == 12);
//                                aux = 0;
//                                break;
//                            default:
//                                System.out.println("Lo que uno hace  por la areli");
//                                break;
//                        }
//
//                    } else {
//                        acumulador += mes;
//                        System.out.println("Esto valor acumulador " + acumulador);
//                    }
//
//                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron resultados");
            }
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Año");
            modelo.addColumn("Mes");
            modelo.addColumn("Dia");
            modelo.addColumn("Cuota");
            modelo.addColumn("ID Ramal");

            do {
                Object dato[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                modelo.addRow(dato);
            } while (rs.next());

            this.table_reporte.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error" + e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table_reporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_reporteMouseClicked


    }//GEN-LAST:event_table_reporteMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(table_reporte);
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscar_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_mesActionPerformed
         com.mysql.jdbc.Connection con = null;
        try {
            con = (com.mysql.jdbc.Connection) getConnection();
            String sql = "SELECT aniorecibo, diarecibo,mesrecibo, cuotamensual, idramal1 FROM recibos AS r INNER JOIN cliente AS c ON idcliente1 = idcliente INNER JOIN ramal AS rm ON idramal1 = idramal WHERE mesrecibo LIKE ?";
            System.out.println("ESTA ES LA CONSULTA A LA BASE DE DATOS " + sql);
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1, "%" + mes_reporte.getText() + "%");
            // No necesitas establecer más parámetros aquí, ya que solo tienes un marcador de posición en la consulta SQL

            System.out.println(ps);
            rs = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Año");
            modelo.addColumn("Mes");
            modelo.addColumn("Dia");
            modelo.addColumn("Cuota Mensual");
            modelo.addColumn("ID Ramal");

            while (rs.next()) {
                Object dato[] = new Object[5];
                dato[0] = rs.getString("aniorecibo");
                dato[1] = rs.getString("mesrecibo");
                dato[2] = rs.getString("diarecibo");
                dato[3] = rs.getString("cuotamensual");
                dato[4] = rs.getString("idramal1");
                modelo.addRow(dato);
            }

            this.table_reporte.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_buscar_mesActionPerformed

    private void mostrar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_usuarioActionPerformed
        com.mysql.jdbc.Connection con = null;
        try {
            con = (com.mysql.jdbc.Connection) getConnection();
            String sql = "SELECT aniorecibo, diarecibo,mesrecibo, cuotamensual, idramal1, nombrecliente, apcliente,amcliente FROM recibos  INNER JOIN cliente  ON idcliente1 = idcliente INNER JOIN ramal ON idramal1 = idramal  WHERE nombrecliente LIKE ?";
            System.out.println("ESTA ES LA CONSULTA A LA BASE DE DATOS " + sql);
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1, usuario_reporte.getText());
            // No necesitas establecer más parámetros aquí, ya que solo tienes un marcador de posición en la consulta SQL

            System.out.println(ps);
            rs = ps.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Año");
            modelo.addColumn("Mes");
            modelo.addColumn("Dia");
            modelo.addColumn("Cuota Mensual");
            modelo.addColumn("ID Ramal");
            modelo.addColumn("Nombre Cliente");
            modelo.addColumn("A. Paterno");
            modelo.addColumn("A. Materno");

            while (rs.next()) {
                Object dato[] = new Object[8];
                dato[0] = rs.getString("aniorecibo");
                dato[1] = rs.getString("mesrecibo");
                dato[2] = rs.getString("diarecibo");
                dato[3] = rs.getString("cuotamensual");
                dato[4] = rs.getString("idramal1");
                dato[5] = rs.getString("nombrecliente");
                dato[6] = rs.getString("apcliente");
                dato[7] = rs.getString("amcliente");
                modelo.addRow(dato);
            }

            this.table_reporte.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
    }//GEN-LAST:event_mostrar_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anio;
    private javax.swing.JButton buscar_mes;
    private javax.swing.JTextField dia_reporte;
    private javax.swing.JTextField id_ramal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField mes_reporte;
    private javax.swing.JComboBox<String> monto_combo;
    private javax.swing.JButton mostrar_usuario;
    private javax.swing.JTable table_reporte;
    private javax.swing.JTextField usuario_reporte;
    // End of variables declaration//GEN-END:variables
}
