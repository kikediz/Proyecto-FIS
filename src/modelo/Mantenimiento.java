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
public class Mantenimiento implements Objetos{
    private String id_mantenimiento;
    private String descripcion;
    
    public Mantenimiento(){}

    public Mantenimiento(String id_mantenimiento, String descripcion) {
        this.id_mantenimiento = id_mantenimiento;
        this.descripcion = descripcion;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the value of id_mantenimiento
     *
     * @return the value of id_mantenimiento
     */
    public String getId_mantenimiento() {
        return id_mantenimiento;
    }

    /**
     * Set the value of id_mantenimiento
     *
     * @param id_mantenimiento new value of id_mantenimiento
     */
    public void setId_mantenimiento(String id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
