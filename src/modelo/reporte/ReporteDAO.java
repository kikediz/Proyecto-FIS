package modelo.reporte;

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
public class ReporteDAO implements CRUD<ReporteDTO> {
    
    private static final String SQL_ADMINISTRA="selec * from Monitores";
       
   private static final Conexion con= Conexion.entregarConexion();
    
   PreparedStatement ps; 
    @Override
    public boolean crear(ReporteDTO ReporteDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_ADMINISTRA);
            ps.setString(1,ReporteDTO.getId_persona());
            ps.setString(2, ReporteDTO.getNombre());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(ReporteDTO ReporteDTO) {
        
        try {
            ps=con.getCnn().prepareStatement(SQL_ADMINISTRA);
            ps.setInt(1,Integer.parseInt(ReporteDTO.getId_persona()));
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(ReporteDTO ReporteDTO) {
     try {
            ps=con.getCnn().prepareStatement(SQL_ADMINISTRA);
            ps.setString(1,ReporteDTO.getId_persona());
            ps.setString(2,ReporteDTO.getNombre());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
        
    }

    @Override
    public ReporteDTO read(ReporteDTO ReporteDTO) {
         ReporteDTO l=null;
        try {
            ps=con.getCnn().prepareStatement(SQL_ADMINISTRA);
            ResultSet rs;
            rs=ps.executeQuery();
            while(rs.next()){
                l=new ReporteDTO(new Reporte("",""));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return l;  

        
        
    }

    @Override
    public List<ReporteDTO> readAll() {
       ArrayList <ReporteDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_ADMINISTRA);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new ReporteDTO(new Reporte("","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(ReporteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas;  
        
        
    }

      
}
