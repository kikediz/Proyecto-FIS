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
public class Prestamo_Equipo implements Objetos{
    
    private String id_equipo;
    private int id_persona;
    private String fecha_prestamo;
    private String fecha_devolucion;
    
    public Prestamo_Equipo(){}

    public Prestamo_Equipo(String id_equipo, int id_persona, String fecha_prestamo, String fecha_devolucion) {
        this.id_equipo = id_equipo;
        this.id_persona = id_persona;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
    }

    /**
     * Get the value of fecha_devolucion
     *
     * @return the value of fecha_devolucion
     */
    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    /**
     * Set the value of fecha_devolucion
     *
     * @param fecha_devolucion new value of fecha_devolucion
     */
    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    /**
     * Get the value of fecha_prestamo
     *
     * @return the value of fecha_prestamo
     */
    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    /**
     * Set the value of fecha_prestamo
     *
     * @param fecha_prestamo new value of fecha_prestamo
     */
    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
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
     * Get the value of id_equipo
     *
     * @return the value of id_equipo
     */
    public String getId_equipo() {
        return id_equipo;
    }

    /**
     * Set the value of id_equipo
     *
     * @param id_equipo new value of id_equipo
     */
    public void setId_equipo(String id_equipo) {
        this.id_equipo = id_equipo;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
