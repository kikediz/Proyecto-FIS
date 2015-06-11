/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.licencia;



import java.sql.Date;
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
public class LicenciaDAO implements CRUD<LicenciaDTO> {

    private static final String SQL_INSERT="insert into licencia (id_licencia,producto,cantidad_actual,cupo,fecha_expiraccion)values (?,?,?,?,?)";
    private static final String SQL_DELETE="delete from licencia where id_licencia=?";
    private static final String SQL_UPDATE="update licencia set id_licencia=?,producto=?,cantidad_actual=?,cupo=?,fecha_expiraccion=?  where id_licencia=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";
    private static final String SQL_READ_ID="select * from licencia where id_licencia=?";  
    
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(LicenciaDTO licenciaDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,licenciaDTO.getId_licencia());
            ps.setString(2,licenciaDTO.getProducto());
            ps.setInt(3, licenciaDTO.getCantidad_actual());
            ps.setInt(4, licenciaDTO.getCupo());
            ps.setDate(5, Date.valueOf((licenciaDTO.getFecha_expiraccion())));
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(LicenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(LicenciaDTO licenciaDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,licenciaDTO.getId_licencia());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(LicenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(LicenciaDTO licenciaDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,licenciaDTO.getId_licencia());
            ps.setString(2,licenciaDTO.getProducto());
            ps.setInt(3,licenciaDTO.getCantidad_actual());
            ps.setInt(4,licenciaDTO.getCupo());
            ps.setDate(5, Date.valueOf((licenciaDTO.getFecha_expiraccion())));
            ps.setString(6, licenciaDTO.getId_licencia());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(LicenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public LicenciaDTO read(LicenciaDTO licenciaDTO) {
         LicenciaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_ID);
            ResultSet rs;
            ps.setString(1,licenciaDTO.getId_licencia());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new LicenciaDTO(new Licencia(rs.getString("id_licencia"),rs.getString("producto"),rs.getInt("cantidad_actual"),rs.getInt("cupo"),rs.getString("fecha_expiraccion")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LicenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  
    }
    
    
    @Override
    public List<LicenciaDTO> readAll() {
       ArrayList <LicenciaDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new LicenciaDTO(new Licencia("","",0,0,"")));
           
        } catch (SQLException ex) {
            Logger.getLogger(LicenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
