package Paintball;
import control.BaseDatos;


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