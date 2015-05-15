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
public class Rol_PersonaDTO {
    
    private String fecha_inicio;
    private String fecha_finalizacion;
    private int id_persona;
    private String id_rol;
    
    public Rol_PersonaDTO(){}

    public Rol_PersonaDTO(Rol_Persona rol_Persona) {
        this.fecha_inicio = rol_Persona.getFecha_inicio();
        this.fecha_finalizacion = rol_Persona.getFecha_finalizacion();
        this.id_persona = rol_Persona.getId_persona();
        this.id_rol = rol_Persona.getId_rol();
    }

    /**
     * Get the value of id_rol
     *
     * @return the value of id_rol
     */
    public String getId_rol() {
        return id_rol;
    }

    /**
     * Set the value of id_rol
     *
     * @param id_rol new value of id_rol
     */
    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    /**
     * Get the value of id_persona
     *
     * @return the value of id_persona
     */
    public int getId_persona() {
        return id_persona;
    }

    /**
     * Set the value of id_persona
     *
     * @param id_persona new value of id_persona
     */
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    /**
     * Get the value of fecha_finalizacion
     *
     * @return the value of fecha_finalizacion
     */
    public String getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    /**
     * Set the value of fecha_finalizacion
     *
     * @param fecha_finalizacion new value of fecha_finalizacion
     */
    public void setFecha_finalizacion(String fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    /**
     * Get the value of fecha_inicio
     *
     * @return the value of fecha_inicio
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * Set the value of fecha_inicio
     *
     * @param fecha_inicio new value of fecha_inicio
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

}
