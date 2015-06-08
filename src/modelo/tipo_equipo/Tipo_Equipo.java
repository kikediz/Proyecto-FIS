/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tipo_equipo;

import modelo.Objetos;

/**
 *
 * @author morte
 */
public class Tipo_Equipo implements Objetos{
    
    private String id_tipo_equipo;
    private String descripcion;
    
    public Tipo_Equipo(){}

    public Tipo_Equipo(String id_tipo_equipo, String descripcion) {
        this.id_tipo_equipo = id_tipo_equipo;
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
     * Get the value of id_tipo_equipo
     *
     * @return the value of id_tipo_equipo
     */
    public String getId_Tipo_Equipo() {
        return id_tipo_equipo;
    }

    /**
     * Set the value of id_tipo_equipo
     *
     * @param id_tipo_equipo new value of id_tipo_equipo
     */
    public void setId_Tipo_Equipo(String id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
