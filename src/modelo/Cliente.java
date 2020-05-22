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
public class Cliente {

    private int idCliente;
    private String nombre_Cliente;
    private String apellido_Cliente;
    private String nombre2_Cliente;
    private String apellido2_Cliente;
    private String telefonoC;
    private String cedulaC;
    private String correo;
    private int idPartidacf;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre_Cliente, String apellido_Cliente, String nombre2_Cliente, String apellido2_Cliente, String telefonoC, String cedulaC, String correo, int idPartidacf) {
        this.idCliente = idCliente;
        this.nombre_Cliente = nombre_Cliente;
        this.apellido_Cliente = apellido_Cliente;
        this.nombre2_Cliente = nombre2_Cliente;
        this.apellido2_Cliente = apellido2_Cliente;
        this.telefonoC = telefonoC;
        this.cedulaC = cedulaC;
        this.correo = correo;
        this.idPartidacf = idPartidacf;
    }

    public Cliente(String nombre_Cliente, String apellido_Cliente, String nombre2_Cliente, String apellido2_Cliente, String telefonoC, String cedulaC, String correo, int idPartidacf) {
        this.nombre_Cliente = nombre_Cliente;
        this.apellido_Cliente = apellido_Cliente;
        this.nombre2_Cliente = nombre2_Cliente;
        this.apellido2_Cliente = apellido2_Cliente;
        this.telefonoC = telefonoC;
        this.cedulaC = cedulaC;
        this.correo = correo;
        this.idPartidacf = idPartidacf;
    }

    /**
     * Get the value of idPartidacf
     *
     * @return the value of idPartidacf
     */
    public int getIdPartidacf() {
        return idPartidacf;
    }

    /**
     * Set the value of idPartidacf
     *
     * @param idPartidacf new value of idPartidacf
     */
    public void setIdPartidacf(int idPartidacf) {
        this.idPartidacf = idPartidacf;
    }

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Get the value of cedulaC
     *
     * @return the value of cedulaC
     */
    public String getCedulaC() {
        return cedulaC;
    }

    /**
     * Set the value of cedulaC
     *
     * @param cedulaC new value of cedulaC
     */
    public void setCedulaC(String cedulaC) {
        this.cedulaC = cedulaC;
    }

    /**
     * Get the value of telefonoC
     *
     * @return the value of telefonoC
     */
    public String getTelefonoC() {
        return telefonoC;
    }

    /**
     * Set the value of telefonoC
     *
     * @param telefonoC new value of telefonoC
     */
    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    /**
     * Get the value of apellido2_Cliente
     *
     * @return the value of apellido2_Cliente
     */
    public String getApellido2_Cliente() {
        return apellido2_Cliente;
    }

    /**
     * Set the value of apellido2_Cliente
     *
     * @param apellido2_Cliente new value of apellido2_Cliente
     */
    public void setApellido2_Cliente(String apellido2_Cliente) {
        this.apellido2_Cliente = apellido2_Cliente;
    }

    /**
     * Get the value of nombre2_Cliente
     *
     * @return the value of nombre2_Cliente
     */
    public String getNombre2_Cliente() {
        return nombre2_Cliente;
    }

    /**
     * Set the value of nombre2_Cliente
     *
     * @param nombre2_Cliente new value of nombre2_Cliente
     */
    public void setNombre2_Cliente(String nombre2_Cliente) {
        this.nombre2_Cliente = nombre2_Cliente;
    }

    /**
     * Get the value of apellido_Cliente
     *
     * @return the value of apellido_Cliente
     */
    public String getApellido_Cliente() {
        return apellido_Cliente;
    }

    /**
     * Set the value of apellido_Cliente
     *
     * @param apellido_Cliente new value of apellido_Cliente
     */
    public void setApellido_Cliente(String apellido_Cliente) {
        this.apellido_Cliente = apellido_Cliente;
    }

    /**
     * Get the value of nombre_Cliente
     *
     * @return the value of nombre_Cliente
     */
    public String getNombre_Cliente() {
        return nombre_Cliente;
    }

    /**
     * Set the value of nombre_Cliente
     *
     * @param nombre_Cliente new value of nombre_Cliente
     */
    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }

    /**
     * Get the value of idCliente
     *
     * @return the value of idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Set the value of idCliente
     *
     * @param idCliente new value of idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre_Cliente=" + nombre_Cliente + ", apellido_Cliente=" + apellido_Cliente + ", nombre2_Cliente=" + nombre2_Cliente + ", apellido2_Cliente=" + apellido2_Cliente + ", telefonoC=" + telefonoC + ", cedulaC=" + cedulaC + ", correo=" + correo + ", idPartidacf=" + idPartidacf + '}';
    }

}
