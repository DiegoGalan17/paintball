package modelo;

public class Venta {
    
    private String idVenta;
    private String fecha_Venta;
    private int idClientef;
    private int idAdministradorf;
    private int idDetalle_Ventaf;
    private double total_Venta;

    public Venta() {
    }

    public Venta(String idVenta, String fecha_Venta, int idClientef, int idAdministradorf, int idDetalle_Ventaf, double total_Venta) {
        this.idVenta = idVenta;
        this.fecha_Venta = fecha_Venta;
        this.idClientef = idClientef;
        this.idAdministradorf = idAdministradorf;
        this.idDetalle_Ventaf = idDetalle_Ventaf;
        this.total_Venta = total_Venta;
    }

    public Venta(String fecha_Venta, int idClientef, int idAdministradorf, int idDetalle_Ventaf, double total_Venta) {
        this.fecha_Venta = fecha_Venta;
        this.idClientef = idClientef;
        this.idAdministradorf = idAdministradorf;
        this.idDetalle_Ventaf = idDetalle_Ventaf;
        this.total_Venta = total_Venta;
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
    public String getIdVenta() {
        return idVenta;
    }

    /**
     * Set the value of idVenta
     *
     * @param idVenta new value of idVenta
     */
    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

}
