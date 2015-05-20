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
public class AdministraDAO implements CRUD<AdministraDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(AdministraDTO administraDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1,administraDTO.getId_persona());
            ps.setString(2,administraDTO.getFecha_entrada());
            ps.setString(3, administraDTO.getFecha_salida());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(AdministraDTO administraDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,administraDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(AdministraDTO administraDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,administraDTO.getFecha_entrada());
            ps.setString(2,administraDTO.getFecha_salida());
            ps.setInt(3,administraDTO.getId_persona());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public AdministraDTO read(AdministraDTO administraDTO) {
         AdministraDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setInt(1,administraDTO.getId_persona());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new AdministraDTO(new Administra(0,0,"",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<AdministraDTO> readAll() {
       ArrayList <AdministraDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new AdministraDTO(new Administra(0,0,"","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
