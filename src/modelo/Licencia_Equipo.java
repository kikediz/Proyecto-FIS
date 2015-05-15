package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maximiliano
 */
public class Licencia_Equipo implements Objetos{

    private String id_licencia;
    private String id_equipo;
    private String fecha_instalacion;
    
    public Licencia_Equipo(){}

    public Licencia_Equipo(String id_licencia, String id_equipo, String fecha_instalacion) {
        this.id_licencia = id_licencia;
        this.id_equipo = id_equipo;
        this.fecha_instalacion = fecha_instalacion;
    }
    

    /**
     * Get the value of fecha_instalacion
     *
     * @return the value of fecha_instalacion
     */
    public String getFecha_instalacion() {
        return fecha_instalacion;
    }

    /**
     * Set the value of fecha_instalacion
     *
     * @param fecha_instalacion new value of fecha_instalacion
     */
    public void setFecha_instalacion(String fecha_instalacion) {
        this.fecha_instalacion = fecha_instalacion;
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


    /**
     * Get the value of id_licencia
     *
     * @return the value of id_licencia
     */
    public String getId_licencia() {
        return id_licencia;
    }

    /**
     * Set the value of id_licencia
     *
     * @param id_licencia new value of id_licencia
     */
    public void setId_licencia(String id_licencia) {
        this.id_licencia = id_licencia;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
