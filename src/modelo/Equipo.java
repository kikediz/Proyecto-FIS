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
public class Equipo implements Objetos{

    private String id_equipo;
    private int id_sala;
    private String modelo;
    private String id_marca;
    private String id_tipo_equipo;

    public Equipo(){}
    
    public Equipo(String id_equipo, int id_sala, String modelo, String id_marca, String id_tipo_equipo) {
        this.id_equipo = id_equipo;
        this.id_sala = id_sala;
        this.modelo = modelo;
        this.id_marca = id_marca;
        this.id_tipo_equipo = id_tipo_equipo;
    }
    
    /**
     * Get the value of id_marca
     *
     * @return the value of id_marca
     */
    public String getId_marca() {
        return id_marca;
    }

    /**
     * Set the value of id_marca
     *
     * @param id_marca new value of id_marca
     */
    public void setId_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    

    /**
     * Get the value of id_tipo_equipo
     *
     * @return the value of id_tipo_equipo
     */
    public String getId_tipo_equipo() {
        return id_tipo_equipo;
    }

    /**
     * Set the value of id_tipo_equipo
     *
     * @param id_tipo_equipo new value of id_tipo_equipo
     */
    public void setId_tipo_equipo(String id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
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
