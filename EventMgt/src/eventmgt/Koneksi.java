package eventmgt;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksi_mysql;
    
    public static Connection koneksiDB() throws SQLException{
        if (koneksi_mysql == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/db_event";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi_mysql = (Connection) DriverManager.getConnection(DB, username, password);
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.toString());            
            }
        }
        
        return koneksi_mysql;
    }
}
