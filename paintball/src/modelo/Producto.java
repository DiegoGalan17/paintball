package modelo;

public class Producto {
    
    private int idProducto;
    private String fecha_Vencimiento;
    private String foto_referencia;
    private String precio_Producto;
    private String cantidad_Disponible;
    private String nombreProducto;

    public Producto() {
    }

    public Producto(int idProducto, String fecha_Vencimiento, String foto_referencia, String precio_Producto, String cantidad_Disponible, String nombreProducto) {
        this.idProducto = idProducto;
        this.fecha_Vencimiento = fecha_Vencimiento;
        this.foto_referencia = foto_referencia;
        this.precio_Producto = precio_Producto;
        this.cantidad_Disponible = cantidad_Disponible;
        this.nombreProducto = nombreProducto;
    }

    public Producto(String fecha_Vencimiento, String foto_referencia, String precio_Producto, String cantidad_Disponible, String nombreProducto) {
        this.fecha_Vencimiento = fecha_Vencimiento;
        this.foto_referencia = foto_referencia;
        this.precio_Producto = precio_Producto;
        this.cantidad_Disponible = cantidad_Disponible;
        this.nombreProducto = nombreProducto;
    }

    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Get the value of cantidad_Disponible
     *
     * @return the value of cantidad_Disponible
     */
    public String getCantidad_Disponible() {
        return cantidad_Disponible;
    }

    /**
     * Set the value of cantidad_Disponible
     *
     * @param cantidad_Disponible new value of cantidad_Disponible
     */
    public void setCantidad_Disponible(String cantidad_Disponible) {
        this.cantidad_Disponible = cantidad_Disponible;
    }

    /**
     * Get the value of precio_Producto
     *
     * @return the value of precio_Producto
     */
    public String getPrecio_Producto() {
        return precio_Producto;
    }

    /**
     * Set the value of precio_Producto
     *
     * @param precio_Producto new value of precio_Producto
     */
    public void setPrecio_Producto(String precio_Producto) {
        this.precio_Producto = precio_Producto;
    }

    /**
     * Get the value of foto_referencia
     *
     * @return the value of foto_referencia
     */
    public String getFoto_referencia() {
        return foto_referencia;
    }

    /**
     * Set the value of foto_referencia
     *
     * @param foto_referencia new value of foto_referencia
     */
    public void setFoto_referencia(String foto_referencia) {
        this.foto_referencia = foto_referencia;
    }

    /**
     * Get the value of fecha_Vencimiento
     *
     * @return the value of fecha_Vencimiento
     */
    public String getFecha_Vencimiento() {
        return fecha_Vencimiento;
    }

    /**
     * Set the value of fecha_Vencimiento
     *
     * @param fecha_Vencimiento new value of fecha_Vencimiento
     */
    public void setFecha_Vencimiento(String fecha_Vencimiento) {
        this.fecha_Vencimiento = fecha_Vencimiento;
    }

    /**
     * Get the value of idProducto
     *
     * @return the value of idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Set the value of idProducto
     *
     * @param idProducto new value of idProducto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

}
