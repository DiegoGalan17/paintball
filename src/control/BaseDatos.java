package control;

/**
 *
 * @author DIEGO GALAN LLANOS
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class BaseDatos {

    Connection conexion;
    Statement st;

    public BaseDatos() {
        //conexion
    }

    public Connection getConexion() {
        return conexion;
    }

    /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public Connection crearConexion() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paintball", "root", "");
            st = conexion.createStatement();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        
        }

        return conexion;
    }

    /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean validarConexion() {
        boolean t=false;
        try {
            Class.forName("com.mysql.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/paintball", "root", "");
            st = conexion.createStatement();
            t=true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            t= false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            t= false;
        }

        return t;
    }
  
}
