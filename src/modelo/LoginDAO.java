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
public class LoginDAO implements CRUD<LoginDTO> {

    private static final String SQL_INSERT="insert into PERSONA (cedula,nombre,correo)values (?,?,?)";
    private static final String SQL_DELETE="delete from PERSONA where cedula=?";
    private static final String SQL_UPDATE="update PERSONA set correo=?,nombre=?  where cedula=?";
    private static final String SQL_READ="select * from PERSONA where cedula=?";
    private static final String SQL_READALL="select * from PERSONA";   
    private static final String SQL_ROL="select * from userole(?)";
       
   private static Conexion con;
    
   PreparedStatement ps; 


    @Override
    public boolean crear(LoginDTO loginDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1,loginDTO.getUser());
            ps.setString(2, loginDTO.getPassword());
            
            if(ps.executeUpdate()>0){return true;}
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getSuppressed());
        }
        finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean delete(LoginDTO loginDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1,loginDTO.getUser());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;
    }

    @Override
    public boolean update(LoginDTO loginDTO) {
        try {
            ps=con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1,loginDTO.getUser());
            ps.setString(2,loginDTO.getPassword());
            if(ps.executeUpdate()>0){return true;}
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{con.cerraConexion();}
        return false;  
    }

    @Override
    public LoginDTO read(LoginDTO loginDTO) {
        LoginDTO l=null;
        try {
            con= Conexion.entregarConexion();
            ps=con.getCnn().prepareStatement(SQL_ROL);
            ResultSet rs;
            ps.setString(1,loginDTO.getUser());
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println("rol: " + rs.getString("rol"));
                //loginDTO.setRol(rs.getString("rol"));
                l=new LoginDTO(new Login(loginDTO.getUser(),loginDTO.getPassword(),rs.getString("rol")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("dao exception");
        }finally{con.cerraConexion();}
        return l;  
    }

    @Override
    public List<LoginDTO> readAll() {
        ArrayList <LoginDTO> personas=new ArrayList();
        try {
            ps=con.getCnn().prepareStatement(SQL_READALL);
            ResultSet rs;
                  
            rs=ps.executeQuery();
            while(rs.next())
                 personas.add(new LoginDTO(new Login("","","")));
           
        } catch (SQLException ex) {
            Logger.getLogger(AdministraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{con.cerraConexion();}
        return personas; 
    }

      
}
