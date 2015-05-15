/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author morte
 * @param <Objeto>
 */
public interface CRUD<Objeto> {
    public boolean crear(Objeto c);
    public boolean delete(Objeto c);
    public boolean update(Objeto c);
    public Objeto read(Objeto c);
    public List<Objeto> readAll();
}
