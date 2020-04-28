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
public class Producto {

    private int idProducto;
    private String fecha_Vencimiento;    
    private String foto_referencia;    
    private double precio_Producto;    
    private double iva;    
    private int cantidad_Disponible;

    public Producto() {
    }

    public Producto(int idProducto, String fecha_Vencimiento, String foto_referencia, double precio_Producto, double iva, int cantidad_Disponible) {
        this.idProducto = idProducto;
        this.fecha_Vencimiento = fecha_Vencimiento;
        this.foto_referencia = foto_referencia;
        this.precio_Producto = precio_Producto;
        this.iva = iva;
        this.cantidad_Disponible = cantidad_Disponible;
    }

    public Producto(String fecha_Vencimiento, String foto_referencia, double precio_Producto, double iva, int cantidad_Disponible) {
        this.fecha_Vencimiento = fecha_Vencimiento;
        this.foto_referencia = foto_referencia;
        this.precio_Producto = precio_Producto;
        this.iva = iva;
        this.cantidad_Disponible = cantidad_Disponible;
    }   
      

    /**
     * Get the value of cantidad_Disponible
     *
     * @return the value of cantidad_Disponible
     */
    public int getCantidad_Disponible() {
        return cantidad_Disponible;
    }

    /**
     * Set the value of cantidad_Disponible
     *
     * @param cantidad_Disponible new value of cantidad_Disponible
     */
    public void setCantidad_Disponible(int cantidad_Disponible) {
        this.cantidad_Disponible = cantidad_Disponible;
    }


    /**
     * Get the value of iva
     *
     * @return the value of iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * Set the value of iva
     *
     * @param iva new value of iva
     */
    public void setIva(double iva) {
        this.iva = iva;
    }


    /**
     * Get the value of precio_Producto
     *
     * @return the value of precio_Producto
     */
    public double getPrecio_Producto() {
        return precio_Producto;
    }

    /**
     * Set the value of precio_Producto
     *
     * @param precio_Producto new value of precio_Producto
     */
    public void setPrecio_Producto(double precio_Producto) {
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

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", fecha_Vencimiento=" + fecha_Vencimiento + ", foto_referencia=" + foto_referencia + ", precio_Producto=" + precio_Producto + ", iva=" + iva + ", cantidad_Disponible=" + cantidad_Disponible + '}';
    }

    
    
    
}
