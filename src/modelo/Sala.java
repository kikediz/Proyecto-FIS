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
public class Sala implements Objetos{
    
    private int id_sala;
    private int id_sede;
    private int capacidad;
    private String Nombre;
    private int actual;

    public Sala(){}
    
    public Sala(int id_sala, int id_sede, int capacidad, String Nombre, int actual) {
        this.id_sala = id_sala;
        this.id_sede = id_sede;
        this.capacidad = capacidad;
        this.Nombre = Nombre;
        this.actual = actual;
    }

    /**
     * Get the value of actual
     *
     * @return the value of actual
     */
    public int getActual() {
        return actual;
    }

    /**
     * Set the value of actual
     *
     * @param actual new value of actual
     */
    public void setActual(int actual) {
        this.actual = actual;
    }

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Get the value of capacidad
     *
     * @return the value of capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Set the value of capacidad
     *
     * @param capacidad new value of capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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

    /**
     * Get the value of id_sala
     *
     * @return the value of id_sala
     */
    public int getId_sala() {
        return id_sala;
    }

    /**
     * Set the value of id_sala
     *
     * @param id_sala new value of id_sala
     */
    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
