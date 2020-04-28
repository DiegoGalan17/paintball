/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paintball;
import control.BaseDatos;
/**
 *
 * @author DIEGO GALAN LLANOS
 */
public class Paintball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  BaseDatos objb=new BaseDatos();
        boolean t=objb.crearConexion();
        if(t==true){
            System.out.println("Conexión exitosa");
        }else{
          System.out.println("Conexión No exitosa");  
        }

    }

}
