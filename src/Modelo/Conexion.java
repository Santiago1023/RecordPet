
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//clase que hace la parte tecnica a la conexion con la base de datos
public class Conexion {
    
    Connection con;
    public Connection getConnection(){
        try
        {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            return con;
            
            
        } catch (SQLException e){
            System.out.println(e.toString());
        }
        return null; 
    }
    
}
