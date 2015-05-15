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
public class Sede implements Objetos{
    private int id_sede;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    private String id_ciudad;
    
    public Sede(){}

    public Sede(int id_sede, String nombre, String telefono, String direccion, String correo) {
        this.id_sede = id_sede;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }
    /**
     * Get the value of id_ciudad
     *
     * @return the value of id_ciudad
     */
    public String getId_ciudad() {
        return id_ciudad;
    }

    /**
     * Set the value of id_ciudad
     *
     * @param id_ciudad new value of id_ciudad
     */
    public void setId_ciudad(String id_ciudad) {
        this.id_ciudad = id_ciudad;
    }


    

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of id_sede
     *
     * @return the value of id_sede
     */
    public int getId_sede() {
        return id_sede;
    }

    /**
     * Set the value of id_sede
     *
     * @param id_sede new value of id_sede
     */
    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
