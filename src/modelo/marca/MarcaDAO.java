package modelo.marca;

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
public class MarcaDAO implements CRUD<MarcaDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from marca";  
    private static final String SQL_DESCRIPCION_MARCA="select descripcion from marca where id_marca=?";
    private static final String SQL_ID_MARCA="select id_marca from marca where descripcion=?";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(MarcaDTO marcaDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,marcaDTO.getDescripcion());
            ps.setString(2,marcaDTO.getDescripcion());
            ps.setString(3, marcaDTO.getId_marca());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(MarcaDTO marcaDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,marcaDTO.getDescripcion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(MarcaDTO marcaDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,marcaDTO.getDescripcion());
            ps.setString(2,marcaDTO.getId_marca());
            ps.setString(3,marcaDTO.getDescripcion());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public MarcaDTO read(MarcaDTO marcaDTO) {
         MarcaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_READ);
            ResultSet rs;
            ps.setString(1,marcaDTO.getDescripcion());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new MarcaDTO(new Marca("",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<MarcaDTO> readAll() {
       ArrayList <MarcaDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new MarcaDTO(new Marca(rs.getString("id_marca"),rs.getString("descripcion"))));
           
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;
    }

    public MarcaDTO read_descripcion_marca(MarcaDTO marcaDTO) {
         MarcaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_DESCRIPCION_MARCA);
            ResultSet rs;
            ps.setString(1,marcaDTO.getId_marca());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new MarcaDTO(new Marca("", rs.getString("descripcion")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }  
    
    public MarcaDTO read_id_marca(MarcaDTO marcaDTO) {
         MarcaDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_ID_MARCA);
            ResultSet rs;
            ps.setString(1,marcaDTO.getDescripcion());
            rs=ps.executeQuery();
            while(rs.next()){
                l=new MarcaDTO(new Marca(rs.getString("id_marca"), ""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MarcaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;
    }
}
