/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.login.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Oscar
 */
public class Conexion {
    private Login login= new Login();
    public static Conexion instancia; 
    private Connection cnn;
   
    private Conexion(){
        try {
            Class.forName("org.postgresql.Driver");
            cnn=DriverManager.getConnection("jdbc:postgresql://192.168.1.34:5432/c_informatica",login.getUser(),login.getPassword());
        } catch (ClassNotFoundException ex) {
            System.out.println("error 1"+ex.getMessage());
        } catch (SQLException ex) {
          System.out.println("error 2"+ex.getMessage());
        }
    }
   
   public synchronized static Conexion entregarConexion() {
   if(instancia==null)
   { 
   instancia=new Conexion();
   }
   return instancia;
   
   
   
   } 
   public void cerraConexion(){
   instancia=null;
   }

    /**
     * @return the cnn
     */
    public Connection getCnn() {
        return cnn;
    }
   
   
}
