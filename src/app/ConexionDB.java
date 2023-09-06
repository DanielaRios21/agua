package app;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    // Declaramos la conexion a mysql
    public static Connection obtenerConexion(){
        String jdbcUrl = "jdbc:mysql://localhost:3306/recibos";
        String user="root";
        String password="";

        Connection con;
        try {
            con = (Connection) DriverManager.getConnection(jdbcUrl,user,password);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}