package modelo.licencia_equipo;

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
public class Licencia_EquipoDAO implements CRUD<Licencia_EquipoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";
    private static final String SQL_READ_ID="select * from licencia_equipo where id_licencia=?";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(Licencia_EquipoDTO licencia_EquipoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,licencia_EquipoDTO.getFecha_instalacion());
            ps.setString(2,licencia_EquipoDTO.getId_equipo());
            ps.setString(3, licencia_EquipoDTO.getId_licencia());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(Licencia_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(Licencia_EquipoDTO licencia_EquipoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,licencia_EquipoDTO.getFecha_instalacion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Licencia_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(Licencia_EquipoDTO licencia_EquipoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,licencia_EquipoDTO.getFecha_instalacion());
            ps.setString(2,licencia_EquipoDTO.getId_equipo());
            ps.setString(3,licencia_EquipoDTO.getId_licencia());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(Licencia_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public Licencia_EquipoDTO read(Licencia_EquipoDTO licencia_EquipoDTO) {
         Licencia_EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_ID);
            ResultSet rs;
            ps.setString(1,licencia_EquipoDTO.getId_licencia());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new Licencia_EquipoDTO(new Licencia_Equipo(rs.getString("id_licencia"),rs.getString("id_equipo"),rs.getString("fecha_instalacion")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Licencia_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;          
    }

    @Override
    public List<Licencia_EquipoDTO> readAll() {
       ArrayList <Licencia_EquipoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new Licencia_EquipoDTO(new Licencia_Equipo("","","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(Licencia_EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
