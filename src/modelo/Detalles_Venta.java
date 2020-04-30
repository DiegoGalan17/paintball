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
public class Detalles_Venta {

    private int idDetalle_Venta;
    private int cantidadP;
    private int idPartidaf;
    private int idProductof;
    private double ValorUnitario;
    private int idVentaf;

    public Detalles_Venta() {
    }

    public Detalles_Venta(int idDetalle_Venta, int cantidadP, int idPartidaf, int idProductof, double ValorUnitario, int idVentaf) {
        this.idDetalle_Venta = idDetalle_Venta;
        this.cantidadP = cantidadP;
        this.idPartidaf = idPartidaf;
        this.idProductof = idProductof;
        this.ValorUnitario = ValorUnitario;
        this.idVentaf = idVentaf;
    }

    public Detalles_Venta(int cantidadP, int idPartidaf, int idProductof, double ValorUnitario, int idVentaf) {
        this.cantidadP = cantidadP;
        this.idPartidaf = idPartidaf;
        this.idProductof = idProductof;
        this.ValorUnitario = ValorUnitario;
        this.idVentaf = idVentaf;
    }

    /**
     * Get the value of idVentaf
     *
     * @return the value of idVentaf
     */
    public int getIdVentaf() {
        return idVentaf;
    }

    /**
     * Set the value of idVentaf
     *
     * @param idVentaf new value of idVentaf
     */
    public void setIdVentaf(int idVentaf) {
        this.idVentaf = idVentaf;
    }

    /**
     * Get the value of ValorUnitario
     *
     * @return the value of ValorUnitario
     */
    public double getValorUnitario() {
        return ValorUnitario;
    }

    /**
     * Set the value of ValorUnitario
     *
     * @param ValorUnitario new value of ValorUnitario
     */
    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    /**
     * Get the value of idProductof
     *
     * @return the value of idProductof
     */
    public int getIdProductof() {
        return idProductof;
    }

    /**
     * Set the value of idProductof
     *
     * @param idProductof new value of idProductof
     */
    public void setIdProductof(int idProductof) {
        this.idProductof = idProductof;
    }

    /**
     * Get the value of idPartidaf
     *
     * @return the value of idPartidaf
     */
    public int getIdPartidaf() {
        return idPartidaf;
    }

    /**
     * Set the value of idPartidaf
     *
     * @param idPartidaf new value of idPartidaf
     */
    public void setIdPartidaf(int idPartidaf) {
        this.idPartidaf = idPartidaf;
    }

    /**
     * Get the value of cantidadP
     *
     * @return the value of cantidadP
     */
    public int getCantidadP() {
        return cantidadP;
    }

    /**
     * Set the value of cantidadP
     *
     * @param cantidadP new value of cantidadP
     */
    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    /**
     * Get the value of idDetalle_Venta
     *
     * @return the value of idDetalle_Venta
     */
    public int getIdDetalle_Venta() {
        return idDetalle_Venta;
    }

    /**
     * Set the value of idDetalle_Venta
     *
     * @param idDetalle_Venta new value of idDetalle_Venta
     */
    public void setIdDetalle_Venta(int idDetalle_Venta) {
        this.idDetalle_Venta = idDetalle_Venta;
    }

    @Override
    public String toString() {
        return "Detalles_Venta{" + "idDetalle_Venta=" + idDetalle_Venta + ", cantidadP=" + cantidadP + ", idPartidaf=" + idPartidaf + ", idProductof=" + idProductof + ", ValorUnitario=" + ValorUnitario + ", idVentaf=" + idVentaf + '}';
    }

}
