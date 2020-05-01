/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author DIEGO GALAN LLANOS
 */
public class Administrador {

    private int idAdministrador;
    private String nombre_Admin;
    private String apellido_Admin;    
    private String nombre2_Admin;    
    private String apellido2_Admin;    
    private String telefonoA;
    private String cedulaA;
    private String contrasenaA;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String nombre_Admin, String apellido_Admin, String nombre2_Admin, String apellido2_Admin, String telefonoA, String cedulaA, String contrasenaA) {
        this.idAdministrador = idAdministrador;
        this.nombre_Admin = nombre_Admin;
        this.apellido_Admin = apellido_Admin;
        this.nombre2_Admin = nombre2_Admin;
        this.apellido2_Admin = apellido2_Admin;
        this.telefonoA = telefonoA;
        this.cedulaA = cedulaA;
        this.contrasenaA = contrasenaA;
    }

    public Administrador(String nombre_Admin, String apellido_Admin, String nombre2_Admin, String apellido2_Admin, String telefonoA, String cedulaA, String contrasenaA) {
        this.nombre_Admin = nombre_Admin;
        this.apellido_Admin = apellido_Admin;
        this.nombre2_Admin = nombre2_Admin;
        this.apellido2_Admin = apellido2_Admin;
        this.telefonoA = telefonoA;
        this.cedulaA = cedulaA;
        this.contrasenaA = contrasenaA;
    }
    

    /**
     * Get the value of contrasenaA
     *
     * @return the value of contrasenaA
     */
    public String getContrasenaA() {
        return contrasenaA;
    }

    /**
     * Set the value of contrasenaA
     *
     * @param contrasenaA new value of contrasenaA
     */
    public void setContrasenaA(String contrasenaA) {
        this.contrasenaA = contrasenaA;
    }

    /**
     * Get the value of cedulaA
     *
     * @return the value of cedulaA
     */
    public String getCedulaA() {
        return cedulaA;
    }

    /**
     * Set the value of cedulaA
     *
     * @param cedulaA new value of cedulaA
     */
    public void setCedulaA(String cedulaA) {
        this.cedulaA = cedulaA;
    }

    /**
     * Get the value of telefonoA
     *
     * @return the value of telefonoA
     */
    public String getTelefonoA() {
        return telefonoA;
    }

    /**
     * Set the value of telefonoA
     *
     * @param telefonoA new value of telefonoA
     */
    public void setTelefonoA(String telefonoA) {
        this.telefonoA = telefonoA;
    }


    /**
     * Get the value of apellido2_Admin
     *
     * @return the value of apellido2_Admin
     */
    public String getApellido2_Admin() {
        return apellido2_Admin;
    }

    /**
     * Set the value of apellido2_Admin
     *
     * @param apellido2_Admin new value of apellido2_Admin
     */
    public void setApellido2_Admin(String apellido2_Admin) {
        this.apellido2_Admin = apellido2_Admin;
    }


    /**
     * Get the value of nombre2_Admin
     *
     * @return the value of nombre2_Admin
     */
    public String getNombre2_Admin() {
        return nombre2_Admin;
    }

    /**
     * Set the value of nombre2_Admin
     *
     * @param nombre2_Admin new value of nombre2_Admin
     */
    public void setNombre2_Admin(String nombre2_Admin) {
        this.nombre2_Admin = nombre2_Admin;
    }


    /**
     * Get the value of apellido_Admin
     *
     * @return the value of apellido_Admin
     */
    public String getApellido_Admin() {
        return apellido_Admin;
    }

    /**
     * Set the value of apellido_Admin
     *
     * @param apellido_Admin new value of apellido_Admin
     */
    public void setApellido_Admin(String apellido_Admin) {
        this.apellido_Admin = apellido_Admin;
    }


    /**
     * Get the value of nombre_Admin
     *
     * @return the value of nombre_Admin
     */
    public String getNombre_Admin() {
        return nombre_Admin;
    }

    /**
     * Set the value of nombre_Admin
     *
     * @param nombre_Admin new value of nombre_Admin
     */
    public void setNombre_Admin(String nombre_Admin) {
        this.nombre_Admin = nombre_Admin;
    }

    /**
     * Get the value of idAdministrador
     *
     * @return the value of idAdministrador
     */
    public int getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * Set the value of idAdministrador
     *
     * @param idAdministrador new value of idAdministrador
     */
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", nombre_Admin=" + nombre_Admin + ", apellido_Admin=" + apellido_Admin + ", nombre2_Admin=" + nombre2_Admin + ", apellido2_Admin=" + apellido2_Admin + ", telefonoA=" + telefonoA + ", cedulaA=" + cedulaA + ", contrasenaA=" + contrasenaA + '}';
    }


}
