package modelo.sala;

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
public class SalaDAO implements CRUD<SalaDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from sala"; 
    private static final String SQL_NOMBRE_SALAS="select nombre from sala";
    private static final String SQL_READ_NOMBRE_SALA="select nombre from sala where id_sala=?";
    private static final String SQL_READ_ID_SALA="select id_sala from sala where nombre=?";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(SalaDTO salaDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setInt(1,salaDTO.getActual());
            ps.setString(2,salaDTO.getNombre());
            ps.setString(3, salaDTO.getNombre());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(SalaDTO salaDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setInt(1,salaDTO.getCapacidad());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(SalaDTO salaDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,salaDTO.getNombre());
            ps.setString(2,salaDTO.getNombre());
            ps.setInt(3,salaDTO.getId_sala());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }
    
    public SalaDTO read_nombre_sala(SalaDTO salaDTO) {
         SalaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_NOMBRE_SALA);
            ResultSet rs;
            ps.setInt(1,salaDTO.getId_sala());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new SalaDTO(new Sala(0,0,0,rs.getString("nombre"),0));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }
    
    public SalaDTO read_id_sala(SalaDTO salaDTO) {
         SalaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_ID_SALA);
            ResultSet rs;
            ps.setString(1,salaDTO.getNombre());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new SalaDTO(new Sala(rs.getInt("id_sala"),0,0,"",0));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }

    @Override
    public SalaDTO read(SalaDTO salaDTO) {
         SalaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setInt(1,salaDTO.getId_sede());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new SalaDTO(new Sala(0,0,0,"",0));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }
    
    public List<SalaDTO> readIdSala(SalaDTO salaDTO) {
        ArrayList <SalaDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READ_ID_SALA);
            ResultSet rs;
            
            rs=ps.executeQuery();
            
            while(rs.next()){
               //rs.getString("id_sala");
               personas.add(new SalaDTO(new Sala(rs.getInt("id_sala"),0,0,"",0)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return personas;
    }

    @Override
    public List<SalaDTO> readAll() {
       ArrayList <SalaDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new SalaDTO(new Sala(rs.getInt("id_sala"),rs.getInt("id_sede"),rs.getInt("capacidad"),rs.getString("nombre"),rs.getInt("actual"))));
           
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;
    }
}
