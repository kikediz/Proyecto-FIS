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
public class EquipoDAO implements CRUD<EquipoDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from sala";   
    private static final String SQL_READ_ID="select * from equipo where id_equipo=?";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(EquipoDTO equipoDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1,equipoDTO.getId_sala());
            ps.setString(2,equipoDTO.getId_equipo());
            ps.setString(3, equipoDTO.getId_marca());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(EquipoDTO equipoDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,equipoDTO.getId_sala());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(EquipoDTO equipoDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,equipoDTO.getId_tipo_equipo());
            ps.setString(2,equipoDTO.getId_marca());
            ps.setInt(3,equipoDTO.getId_sala());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public EquipoDTO read(EquipoDTO equipoDTO) {
         EquipoDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_ID);
            ResultSet rs;
            ps.setString(1,equipoDTO.getId_equipo());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new EquipoDTO(new Equipo(rs.getString("id_equipo"),rs.getInt("id_sala"),rs.getString("modelo"),rs.getString("fk_marca_id_marca"),rs.getString("fk_tipo_equipo_id_tipo_equipo")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<EquipoDTO> readAll() {
       ArrayList <EquipoDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new EquipoDTO(new Equipo(rs.getString("id_equipo"),rs.getInt("id_sala"),rs.getString("modelo"),rs.getString("fk_marca_id_marca"),rs.getString("fk_tipo_equipo_id_tipo_equipo"))));
           
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
