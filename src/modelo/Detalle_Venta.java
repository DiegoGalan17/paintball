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
public class Detalle_Venta {

    private int idDetalle_Venta;
    private double total_Venta;
    private double subtotal_Venta;
    private int cantidadP;
    private double valor_iva;
    private int idPartidaf;
    private int idProductof;

    public Detalle_Venta() {
    }

    public Detalle_Venta(int idDetalle_Venta, double total_Venta, double subtotal_Venta, int cantidadP, double valor_iva, int idPartidaf, int idProductof) {
        this.idDetalle_Venta = idDetalle_Venta;
        this.total_Venta = total_Venta;
        this.subtotal_Venta = subtotal_Venta;
        this.cantidadP = cantidadP;
        this.valor_iva = valor_iva;
        this.idPartidaf = idPartidaf;
        this.idProductof = idProductof;
    }

    public Detalle_Venta(double total_Venta, double subtotal_Venta, int cantidadP, double valor_iva, int idPartidaf, int idProductof) {
        this.total_Venta = total_Venta;
        this.subtotal_Venta = subtotal_Venta;
        this.cantidadP = cantidadP;
        this.valor_iva = valor_iva;
        this.idPartidaf = idPartidaf;
        this.idProductof = idProductof;
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
     * Get the value of valor_iva
     *
     * @return the value of valor_iva
     */
    public double getValor_iva() {
        return valor_iva;
    }

    /**
     * Set the value of valor_iva
     *
     * @param valor_iva new value of valor_iva
     */
    public void setValor_iva(double valor_iva) {
        this.valor_iva = valor_iva;
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
     * Get the value of subtotal_Venta
     *
     * @return the value of subtotal_Venta
     */
    public double getSubtotal_Venta() {
        return subtotal_Venta;
    }

    /**
     * Set the value of subtotal_Venta
     *
     * @param subtotal_Venta new value of subtotal_Venta
     */
    public void setSubtotal_Venta(double subtotal_Venta) {
        this.subtotal_Venta = subtotal_Venta;
    }

    /**
     * Get the value of total_Venta
     *
     * @return the value of total_Venta
     */
    public double getTotal_Venta() {
        return total_Venta;
    }

    /**
     * Set the value of total_Venta
     *
     * @param total_Venta new value of total_Venta
     */
    public void setTotal_Venta(double total_Venta) {
        this.total_Venta = total_Venta;
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
        return "Detalle_Venta{" + "idDetalle_Venta=" + idDetalle_Venta + ", total_Venta=" + total_Venta + ", subtotal_Venta=" + subtotal_Venta + ", cantidadP=" + cantidadP + ", valor_iva=" + valor_iva + ", idPartidaf=" + idPartidaf + ", idProductof=" + idProductof + '}';
    }

}
