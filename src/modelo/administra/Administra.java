package modelo.administra;

import modelo.Objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maximiliano
 */
public class Administra implements Objetos{

    private int id_persona;
    private int id_sala;
    private String fecha_entrada;
    private String fecha_salida;

    public Administra(){}
    
    public Administra(int id_persona, int id_sala, String fecha_entrada, String fecha_salida) {
        this.id_persona = id_persona;
        this.id_sala = id_sala;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }

    /**
     * Get the value of fecha_salida
     *
     * @return the value of fecha_salida
     */
    public String getFecha_salida() {
        return fecha_salida;
    }

    /**
     * Set the value of fecha_salida
     *
     * @param fecha_salida new value of fecha_salida
     */
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    

    /**
     * Get the value of fecha_entrada
     *
     * @return the value of fecha_entrada
     */
    public String getFecha_entrada() {
        return fecha_entrada;
    }

    /**
     * Set the value of fecha_entrada
     *
     * @param fecha_entrada new value of fecha_entrada
     */
    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
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

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
