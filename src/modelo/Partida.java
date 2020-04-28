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
public class Partida {

    private int idPartida;
    private String hora_Entrada;
    private String hora_Salida;
    private String fecha_Partida;
    private int idCanchapf;
    private int idDetalle_Ventapf;

    public Partida() {
    }

    public Partida(int idPartida, String hora_Entrada, String hora_Salida, String fecha_Partida, int idCanchapf, int idDetalle_Ventapf) {
        this.idPartida = idPartida;
        this.hora_Entrada = hora_Entrada;
        this.hora_Salida = hora_Salida;
        this.fecha_Partida = fecha_Partida;
        this.idCanchapf = idCanchapf;
        this.idDetalle_Ventapf = idDetalle_Ventapf;
    }

    public Partida(String hora_Entrada, String hora_Salida, String fecha_Partida, int idCanchapf, int idDetalle_Ventapf) {
        this.hora_Entrada = hora_Entrada;
        this.hora_Salida = hora_Salida;
        this.fecha_Partida = fecha_Partida;
        this.idCanchapf = idCanchapf;
        this.idDetalle_Ventapf = idDetalle_Ventapf;
    }
    
    

    /**
     * Get the value of idDetalle_Ventapf
     *
     * @return the value of idDetalle_Ventapf
     */
    public int getIdDetalle_Ventapf() {
        return idDetalle_Ventapf;
    }

    /**
     * Set the value of idDetalle_Ventapf
     *
     * @param idDetalle_Ventapf new value of idDetalle_Ventapf
     */
    public void setIdDetalle_Ventapf(int idDetalle_Ventapf) {
        this.idDetalle_Ventapf = idDetalle_Ventapf;
    }

    /**
     * Get the value of idCanchapf
     *
     * @return the value of idCanchapf
     */
    public int getIdCanchapf() {
        return idCanchapf;
    }

    /**
     * Set the value of idCanchapf
     *
     * @param idCanchapf new value of idCanchapf
     */
    public void setIdCanchapf(int idCanchapf) {
        this.idCanchapf = idCanchapf;
    }

    /**
     * Get the value of fecha_Partida
     *
     * @return the value of fecha_Partida
     */
    public String getFecha_Partida() {
        return fecha_Partida;
    }

    /**
     * Set the value of fecha_Partida
     *
     * @param fecha_Partida new value of fecha_Partida
     */
    public void setFecha_Partida(String fecha_Partida) {
        this.fecha_Partida = fecha_Partida;
    }

    /**
     * Get the value of hora_Salida
     *
     * @return the value of hora_Salida
     */
    public String getHora_Salida() {
        return hora_Salida;
    }

    /**
     * Set the value of hora_Salida
     *
     * @param hora_Salida new value of hora_Salida
     */
    public void setHora_Salida(String hora_Salida) {
        this.hora_Salida = hora_Salida;
    }

    /**
     * Get the value of hora_Entrada
     *
     * @return the value of hora_Entrada
     */
    public String getHora_Entrada() {
        return hora_Entrada;
    }

    /**
     * Set the value of hora_Entrada
     *
     * @param hora_Entrada new value of hora_Entrada
     */
    public void setHora_Entrada(String hora_Entrada) {
        this.hora_Entrada = hora_Entrada;
    }

    /**
     * Get the value of idPartida
     *
     * @return the value of idPartida
     */
    public int getIdPartida() {
        return idPartida;
    }

    /**
     * Set the value of idPartida
     *
     * @param idPartida new value of idPartida
     */
    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    @Override
    public String toString() {
        return "Partida{" + "idPartida=" + idPartida + ", hora_Entrada=" + hora_Entrada + ", hora_Salida=" + hora_Salida + ", fecha_Partida=" + fecha_Partida + ", idCanchapf=" + idCanchapf + ", idDetalle_Ventapf=" + idDetalle_Ventapf + '}';
    }

}
