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
public class Marca implements Objetos{
    
    private String id_marca;
    private String descripcion;
    
    public Marca(){}

    public Marca(String id_marca, String descripcion) {
        this.id_marca = id_marca;
        this.descripcion = descripcion;
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

    @Override
    public boolean[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
