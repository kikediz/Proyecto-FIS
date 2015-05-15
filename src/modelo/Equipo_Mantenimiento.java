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
public class Equipo_Mantenimiento implements Objetos{
    
    private String fecha;
    private String motivo;
    private String fk_id_mantenimiento;
    private String fk_id_equipo;
    
    public Equipo_Mantenimiento(){}

    public Equipo_Mantenimiento(String fecha, String motivo, String fk_id_mantenimiento, String fk_id_equipo) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.fk_id_mantenimiento = fk_id_mantenimiento;
        this.fk_id_equipo = fk_id_equipo;
    }

    /**
     * Get the value of fk_id_mantenimiento
     *
     * @return the value of fk_id_mantenimiento
     */
    public String getFk_id_mantenimiento() {
        return fk_id_mantenimiento;
    }

    /**
     * Set the value of fk_id_mantenimiento
     *
     * @param fk_id_mantenimiento new value of fk_id_mantenimiento
     */
    public void setFk_id_mantenimiento(String fk_id_mantenimiento) {
        this.fk_id_mantenimiento = fk_id_mantenimiento;
    }

    /**
     * Get the value of motivo
     *
     * @return the value of motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Set the value of motivo
     *
     * @param motivo new value of motivo
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    

    /**
     * Get the value of fk_id_equipo
     *
     * @return the value of fk_id_equipo
     */
    public String getFk_id_equipo() {
        return fk_id_equipo;
    }

    /**
     * Set the value of fk_id_equipo
     *
     * @param fk_id_equipo new value of fk_id_equipo
     */
    public void setFk_id_equipo(String fk_id_equipo) {
        this.fk_id_equipo = fk_id_equipo;
    }


    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Set the value of fecha
     *
     * @param fecha new value of fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
