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
public class Reserva {

    private int idReserva;
    private String nombre_Reserva;
    private int cantidad_Personas;
    private String fecha_Reserva;
    private String hora_Reserva;
    private int idClienterf;
    private int idCanchaf;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombre_Reserva, int cantidad_Personas, String fecha_Reserva, String hora_Reserva, int idClienterf, int idCanchaf) {
        this.idReserva = idReserva;
        this.nombre_Reserva = nombre_Reserva;
        this.cantidad_Personas = cantidad_Personas;
        this.fecha_Reserva = fecha_Reserva;
        this.hora_Reserva = hora_Reserva;
        this.idClienterf = idClienterf;
        this.idCanchaf = idCanchaf;
    }

    public Reserva(String nombre_Reserva, int cantidad_Personas, String fecha_Reserva, String hora_Reserva, int idClienterf, int idCanchaf) {
        this.nombre_Reserva = nombre_Reserva;
        this.cantidad_Personas = cantidad_Personas;
        this.fecha_Reserva = fecha_Reserva;
        this.hora_Reserva = hora_Reserva;
        this.idClienterf = idClienterf;
        this.idCanchaf = idCanchaf;
    }
    
    

    /**
     * Get the value of idCanchaf
     *
     * @return the value of idCanchaf
     */
    public int getIdCanchaf() {
        return idCanchaf;
    }

    /**
     * Set the value of idCanchaf
     *
     * @param idCanchaf new value of idCanchaf
     */
    public void setIdCanchaf(int idCanchaf) {
        this.idCanchaf = idCanchaf;
    }

    /**
     * Get the value of idClienterf
     *
     * @return the value of idClienterf
     */
    public int getIdClienterf() {
        return idClienterf;
    }

    /**
     * Set the value of idClienterf
     *
     * @param idClienterf new value of idClienterf
     */
    public void setIdClienterf(int idClienterf) {
        this.idClienterf = idClienterf;
    }

    /**
     * Get the value of hora_Reserva
     *
     * @return the value of hora_Reserva
     */
    public String getHora_Reserva() {
        return hora_Reserva;
    }

    /**
     * Set the value of hora_Reserva
     *
     * @param hora_Reserva new value of hora_Reserva
     */
    public void setHora_Reserva(String hora_Reserva) {
        this.hora_Reserva = hora_Reserva;
    }

    /**
     * Get the value of fecha_Reserva
     *
     * @return the value of fecha_Reserva
     */
    public String getFecha_Reserva() {
        return fecha_Reserva;
    }

    /**
     * Set the value of fecha_Reserva
     *
     * @param fecha_Reserva new value of fecha_Reserva
     */
    public void setFecha_Reserva(String fecha_Reserva) {
        this.fecha_Reserva = fecha_Reserva;
    }

    /**
     * Get the value of cantidad_Personas
     *
     * @return the value of cantidad_Personas
     */
    public int getCantidad_Personas() {
        return cantidad_Personas;
    }

    /**
     * Set the value of cantidad_Personas
     *
     * @param cantidad_Personas new value of cantidad_Personas
     */
    public void setCantidad_Personas(int cantidad_Personas) {
        this.cantidad_Personas = cantidad_Personas;
    }

    /**
     * Get the value of nombre_Reserva
     *
     * @return the value of nombre_Reserva
     */
    public String getNombre_Reserva() {
        return nombre_Reserva;
    }

    /**
     * Set the value of nombre_Reserva
     *
     * @param nombre_Reserva new value of nombre_Reserva
     */
    public void setNombre_Reserva(String nombre_Reserva) {
        this.nombre_Reserva = nombre_Reserva;
    }

    /**
     * Get the value of idReserva
     *
     * @return the value of idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * Set the value of idReserva
     *
     * @param idReserva new value of idReserva
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nombre_Reserva=" + nombre_Reserva + ", cantidad_Personas=" + cantidad_Personas + ", fecha_Reserva=" + fecha_Reserva + ", hora_Reserva=" + hora_Reserva + ", idClienterf=" + idClienterf + ", idCanchaf=" + idCanchaf + '}';
    }

}
