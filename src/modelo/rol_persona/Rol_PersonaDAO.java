package modelo.rol_persona;

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
public class Rol_PersonaDAO implements CRUD<Rol_PersonaDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(Rol_PersonaDTO rol_PersonaDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1,rol_PersonaDTO.getId_persona());
            ps.setString(2,rol_PersonaDTO.getFecha_finalizacion());
            ps.setString(3, rol_PersonaDTO.getFecha_inicio());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(Rol_PersonaDTO rol_PersonaDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,rol_PersonaDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(Rol_PersonaDTO rol_PersonaDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,rol_PersonaDTO.getId_rol());
            ps.setString(2,rol_PersonaDTO.getFecha_finalizacion());
            ps.setInt(3,rol_PersonaDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public Rol_PersonaDTO read(Rol_PersonaDTO rol_PersonaDTO) {
         Rol_PersonaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setInt(1,rol_PersonaDTO.getId_persona());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Rol_PersonaDTO(new Rol_Persona("","",0,""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<Rol_PersonaDTO> readAll() {
       ArrayList <Rol_PersonaDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new Rol_PersonaDTO(new Rol_Persona("","",0,"")));
           
        } catch (SQLException ex) {
            Logger.getLogger(Rol_PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
