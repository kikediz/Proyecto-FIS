/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.reporte;

/**
 *
 * @author morte
 */
public class ReporteDTO {
    
    private String id_persona;
    private String nombre;
    
    public ReporteDTO(){}

    public ReporteDTO(Reporte reporte) {
        this.id_persona = reporte.getId_persona();
        this.nombre = reporte.getNombre();
    }
    
    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
