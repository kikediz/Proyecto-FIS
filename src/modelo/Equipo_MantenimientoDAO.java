/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpringLayout;

/**
 *
 * @author Oscar
 */
public class Equipo_MantenimientoDAO implements CRUD<Equipo_MantenimientoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(Equipo_MantenimientoDTO equipo_MantenimientoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,equipo_MantenimientoDTO.getMotivo());
            ps.setString(2,equipo_MantenimientoDTO.getFecha());
            ps.setString(3, equipo_MantenimientoDTO.getFk_id_mantenimiento());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(Equipo_MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(Equipo_MantenimientoDTO equipo_MantenimientoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,equipo_MantenimientoDTO.getFecha());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Equipo_MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(Equipo_MantenimientoDTO equipo_MantenimientoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,equipo_MantenimientoDTO.getFecha());
            ps.setString(2,equipo_MantenimientoDTO.getFk_id_equipo());
            ps.setString(3,equipo_MantenimientoDTO.getFk_id_mantenimiento());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Equipo_MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public Equipo_MantenimientoDTO read(Equipo_MantenimientoDTO equipo_MantenimientoDTO) {
         Equipo_MantenimientoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setString(1,equipo_MantenimientoDTO.getMotivo());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Equipo_MantenimientoDTO(new Equipo_Mantenimiento("","","",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Equipo_MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<Equipo_MantenimientoDTO> readAll() {
       ArrayList <Equipo_MantenimientoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new Equipo_MantenimientoDTO(new Equipo_Mantenimiento("","","","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(Equipo_MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
