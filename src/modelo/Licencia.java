/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author morte
 */
public class Licencia implements Objetos{
    
    private String Id_licencia;
    private String producto;
    private int cantidad_actual;
    private int cupo;
    private String fecha_expiraccion;
    
    public Licencia(){}

    public Licencia(String Id_licencia, String producto, int cantidad_actual, int cupo, String fecha_expiraccion) {
        this.Id_licencia = Id_licencia;
        this.producto = producto;
        this.cantidad_actual = cantidad_actual;
        this.cupo = cupo;
        this.fecha_expiraccion = fecha_expiraccion;
    }

    /**
     * Get the value of fecha_expiraccion
     *
     * @return the value of fecha_expiraccion
     */
    public String getFecha_expiraccion() {
        return fecha_expiraccion;
    }

    /**
     * Set the value of fecha_expiraccion
     *
     * @param fecha_expiraccion new value of fecha_expiraccion
     */
    public void setFecha_expiraccion(String fecha_expiraccion) {
        this.fecha_expiraccion = fecha_expiraccion;
    }

    /**
     * Get the value of cupo
     *
     * @return the value of cupo
     */
    public int getCupo() {
        return cupo;
    }

    /**
     * Set the value of cupo
     *
     * @param cupo new value of cupo
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    /**
     * Get the value of cantidad_actual
     *
     * @return the value of cantidad_actual
     */
    public int getCantidad_actual() {
        return cantidad_actual;
    }

    /**
     * Set the value of cantidad_actual
     *
     * @param cantidad_actual new value of cantidad_actual
     */
    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    /**
     * Get the value of producto
     *
     * @return the value of producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Set the value of producto
     *
     * @param producto new value of producto
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Get the value of Id_licencia
     *
     * @return the value of Id_licencia
     */
    public String getId_licencia() {
        return Id_licencia;
    }

    /**
     * Set the value of Id_licencia
     *
     * @param Id_licencia new value of Id_licencia
     */
    public void setId_licencia(String Id_licencia) {
        this.Id_licencia = Id_licencia;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
