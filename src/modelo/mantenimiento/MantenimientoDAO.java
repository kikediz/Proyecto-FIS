package modelo.mantenimiento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpringLayout;
import modelo.CRUD;
import modelo.Conexion;

/**
 *
 * @author Oscar
 */
public class MantenimientoDAO implements CRUD<MantenimientoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(MantenimientoDTO mantenimientoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,mantenimientoDTO.getDescripcion());
            ps.setString(2,mantenimientoDTO.getDescripcion());
            ps.setString(3, mantenimientoDTO.getId_mantenimiento());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(MantenimientoDTO mantenimientoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,mantenimientoDTO.getId_mantenimiento());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(MantenimientoDTO mantenimientoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,mantenimientoDTO.getDescripcion());
            ps.setString(2,mantenimientoDTO.getId_mantenimiento());
            ps.setString(3,mantenimientoDTO.getDescripcion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public MantenimientoDTO read(MantenimientoDTO mantenimientoDTO) {
         MantenimientoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setString(1,mantenimientoDTO.getDescripcion());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new MantenimientoDTO(new Mantenimiento("",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<MantenimientoDTO> readAll() {
       ArrayList <MantenimientoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new MantenimientoDTO(new Mantenimiento("","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(MantenimientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
