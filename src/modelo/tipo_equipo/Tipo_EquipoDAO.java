package modelo.tipo_equipo;

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
public class Tipo_EquipoDAO implements CRUD<Tipo_EquipoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from tipo_equipo";   
    private static final String SQL_DESCRIPCION_EQUIPO="select descripcion from tipo_equipo where id_tipo_equipo=?";
    private static final String SQL_ID_EQUIPO="select id_tipo_equipo from tipo_equipo where descripcion=?";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(Tipo_EquipoDTO tipo_EquipoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,tipo_EquipoDTO.getDescripcion());
            ps.setString(2,tipo_EquipoDTO.getDescripcion());
            ps.setString(3, tipo_EquipoDTO.getId_Tipo_Equipo());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(Tipo_EquipoDTO tipo_EquipoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,tipo_EquipoDTO.getDescripcion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(Tipo_EquipoDTO tipo_EquipoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,tipo_EquipoDTO.getDescripcion());
            ps.setString(2,tipo_EquipoDTO.getId_Tipo_Equipo());
            ps.setString(3,tipo_EquipoDTO.getDescripcion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public Tipo_EquipoDTO read(Tipo_EquipoDTO tipo_EquipoDTO) {
         Tipo_EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setString(1,tipo_EquipoDTO.getDescripcion());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Tipo_EquipoDTO(new Tipo_Equipo("",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }

    public Tipo_EquipoDTO read_descripcion_equipo(Tipo_EquipoDTO tipo_EquipoDTO) {
         Tipo_EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_DESCRIPCION_EQUIPO);
            ResultSet rs;
            ps.setString(1,tipo_EquipoDTO.getId_Tipo_Equipo());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Tipo_EquipoDTO(new Tipo_Equipo("", rs.getString("descripcion")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }
    
    public Tipo_EquipoDTO read_id_equipo(Tipo_EquipoDTO tipo_EquipoDTO) {
         Tipo_EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_ID_EQUIPO);
            ResultSet rs;
            ps.setString(1,tipo_EquipoDTO.getDescripcion());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Tipo_EquipoDTO(new Tipo_Equipo(rs.getString("id_tipo_equipo"), ""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }
    
    @Override
    public List<Tipo_EquipoDTO> readAll() {
       ArrayList <Tipo_EquipoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new Tipo_EquipoDTO(new Tipo_Equipo(rs.getString("id_tipo_equipo"),rs.getString("descripcion"))));
           
        } catch (SQLException ex) {
            Logger.getLogger(Tipo_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
