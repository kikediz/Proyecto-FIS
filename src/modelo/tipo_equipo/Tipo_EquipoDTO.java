/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tipo_equipo;

/**
 *
 * @author morte
 */
public class Tipo_EquipoDTO {
    
    private String id_tipo_equipo;
    private String descripcion;

    public Tipo_EquipoDTO(){}
    
    public Tipo_EquipoDTO(Tipo_Equipo tipo_Equipo) {
        this.id_tipo_equipo = tipo_Equipo.getId_Tipo_Equipo();
        this.descripcion = tipo_Equipo.getDescripcion();
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

}
