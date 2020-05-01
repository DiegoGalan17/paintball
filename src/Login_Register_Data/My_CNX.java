/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Register_Data;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_CNX {
    // falta hacer conexion entre el registro y el admin <----   
    
    //   -->   Este es para hacer una prueba si corre o no corre <--
    
    private static String nombre_Admin = "";
    private static String apellido_Admin = "";    
    private static String nombre2_Admin = "";    
    private static String apellido2_Admin = "";    
    private static String telefonoA = "";
    private static String cedulaA = "";
    private static String contrasenaA = "";
    
    public static Connection getConnection ()
    {
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource ();
        datasource.setServerName(nombre_Admin);
        datasource.setServerName(nombre2_Admin);
       
        datasource.setDatabaseName(apellido2_Admin);
        datasource.setDatabaseName(apellido_Admin);
        
      //data for the use and password, how the user can login  <-- 
        datasource.setUser(cedulaA);
        datasource.setPassword(contrasenaA);
       
    
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("" + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return cnx;
    }
    
}