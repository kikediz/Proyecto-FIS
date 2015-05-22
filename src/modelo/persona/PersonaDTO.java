/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persona;

/**
 *
 * @author Oscar
 */
public class PersonaDTO {
    private int id_persona;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    
    public PersonaDTO(){}
    
    public PersonaDTO(Persona persona) {
        this.id_persona = persona.getCedula();
        this.nombre = persona.getNombre();
        this.apellido = persona.getApellido();
        this.direccion = persona.getDireccion();
        this.correo = persona.getCorreo();
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
