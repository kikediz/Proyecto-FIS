/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.licencia;

/**
 *
 * @author morte
 */
public class LicenciaDTO {
    
    private String Id_licencia;
    private String producto;
    private int cantidad_actual;
    private int cupo;
    private String fecha_expiraccion;

    public LicenciaDTO(){}
    
    public LicenciaDTO(Licencia licencia) {
        this.Id_licencia = licencia.getId_licencia();
        this.producto = licencia.getProducto();
        this.cantidad_actual = licencia.getCantidad_actual();
        this.cupo = licencia.getCupo();
        this.fecha_expiraccion = licencia.getFecha_expiraccion();
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

}
