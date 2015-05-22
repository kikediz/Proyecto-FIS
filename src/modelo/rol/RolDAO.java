package modelo.rol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import modelo.rol_persona.Rol_PersonaDAO;
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
public class RolDAO implements CRUD<RolDTO> {

    private static final String SQL_INSERT="insert into rol (cedula,nombre)values (?,?)";
    private static final String SQL_DELETE="delete from rol where cedula=?";
    private static final String SQL_UPDATE="update rol set nombre=?  where cedula=?";
    private static final String SQL_READ="select * from rol where cedula=?";
    private static final String SQL_READALL="select * from rol";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(RolDTO rolDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,rolDTO.getId_persona());
            ps.setString(2, rolDTO.getNombre());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(RolDTO rolDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,Integer.parseInt(rolDTO.getId_persona()));
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(RolDTO rolDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,rolDTO.getId_persona());
            ps.setString(2,rolDTO.getNombre());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public RolDTO read(RolDTO rolDTO) {
         RolDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setString(1,rolDTO.getId_persona());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new RolDTO(new Rol("",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<RolDTO> readAll() {
       ArrayList <RolDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new RolDTO(new Rol("","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(RolDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
