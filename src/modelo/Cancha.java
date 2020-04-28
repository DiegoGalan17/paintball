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
public class Cancha {

    private int idCancha;    
    private boolean disponibilidad;

    public Cancha() {
    }

    public Cancha(int idCancha, boolean disponibilidad) {
        this.idCancha = idCancha;
        this.disponibilidad = disponibilidad;
    }

    public Cancha(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    /**
     * Get the value of disponibilidad
     *
     * @return the value of disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Set the value of disponibilidad
     *
     * @param disponibilidad new value of disponibilidad
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    /**
     * Get the value of idCancha
     *
     * @return the value of idCancha
     */
    public int getIdCancha() {
        return idCancha;
    }

    /**
     * Set the value of idCancha
     *
     * @param idCancha new value of idCancha
     */
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public String toString() {
        return "Cancha{" + "idCancha=" + idCancha + ", disponibilidad=" + disponibilidad + '}';
    }

}
