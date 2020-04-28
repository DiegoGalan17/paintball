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
public class Venta {

    private int idVenta;
    private String fecha_Venta;
    private String nit;
    private int idClientef;
    private int idAdministradorf;
    private int idDetalle_Ventaf;

    public Venta() {
    }

    public Venta(int idVenta, String fecha_Venta, String nit, int idClientef, int idAdministradorf, int idDetalle_Ventaf) {
        this.idVenta = idVenta;
        this.fecha_Venta = fecha_Venta;
        this.nit = nit;
        this.idClientef = idClientef;
        this.idAdministradorf = idAdministradorf;
        this.idDetalle_Ventaf = idDetalle_Ventaf;
    }

    public Venta(String fecha_Venta, String nit, int idClientef, int idAdministradorf, int idDetalle_Ventaf) {
        this.fecha_Venta = fecha_Venta;
        this.nit = nit;
        this.idClientef = idClientef;
        this.idAdministradorf = idAdministradorf;
        this.idDetalle_Ventaf = idDetalle_Ventaf;
    }

    /**
     * Get the value of idDetalle_Ventaf
     *
     * @return the value of idDetalle_Ventaf
     */
    public int getIdDetalle_Ventaf() {
        return idDetalle_Ventaf;
    }

    /**
     * Set the value of idDetalle_Ventaf
     *
     * @param idDetalle_Ventaf new value of idDetalle_Ventaf
     */
    public void setIdDetalle_Ventaf(int idDetalle_Ventaf) {
        this.idDetalle_Ventaf = idDetalle_Ventaf;
    }

    /**
     * Get the value of idAdministradorf
     *
     * @return the value of idAdministradorf
     */
    public int getIdAdministradorf() {
        return idAdministradorf;
    }

    /**
     * Set the value of idAdministradorf
     *
     * @param idAdministradorf new value of idAdministradorf
     */
    public void setIdAdministradorf(int idAdministradorf) {
        this.idAdministradorf = idAdministradorf;
    }

    /**
     * Get the value of idClientef
     *
     * @return the value of idClientef
     */
    public int getIdClientef() {
        return idClientef;
    }

    /**
     * Set the value of idClientef
     *
     * @param idClientef new value of idClientef
     */
    public void setIdClientef(int idClientef) {
        this.idClientef = idClientef;
    }

    /**
     * Get the value of nit
     *
     * @return the value of nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * Set the value of nit
     *
     * @param nit new value of nit
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Get the value of fecha_Venta
     *
     * @return the value of fecha_Venta
     */
    public String getFecha_Venta() {
        return fecha_Venta;
    }

    /**
     * Set the value of fecha_Venta
     *
     * @param fecha_Venta new value of fecha_Venta
     */
    public void setFecha_Venta(String fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    /**
     * Get the value of idVenta
     *
     * @return the value of idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Set the value of idVenta
     *
     * @param idVenta new value of idVenta
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha_Venta=" + fecha_Venta + ", nit=" + nit + ", idClientef=" + idClientef + ", idAdministradorf=" + idAdministradorf + ", idDetalle_Ventaf=" + idDetalle_Ventaf + '}';
    }

}
