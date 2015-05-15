/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maximiliano
 */
public class JPanel_consultar_Persona extends javax.swing.JPanel implements Panels{
    private javax.swing.JLabel estado;
    private javax.swing.JTextField JTcedula;
    private javax.swing.JButton accion;
    private javax.swing.JButton interno;
    private javax.swing.table.DefaultTableModel dtm;
    private javax.swing.JTable jTable;
     private javax.swing.JScrollPane jScrollPane;
    private final String columnas[] = {"Cédula","Nombre","Correo"};
    public JPanel_consultar_Persona(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        estado  = new javax.swing.JLabel();
        JTcedula = new javax.swing.JTextField(20);
        accion = new javax.swing.JButton();
        interno = new javax.swing.JButton();
        
        this.setLayout(new java.awt.GridBagLayout());
        estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 0, 0));
        dtm = new DefaultTableModel(null,columnas);
        jTable = new JTable(dtm);
        jScrollPane = new JScrollPane(jTable);
        
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
       
        this.add(jScrollPane,new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
      
        
        this.add(new javax.swing.JLabel("Cedula"),new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
       
       
        this.add(JTcedula,new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        accion.setText("Consultar");
       
        this.add(accion,new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        interno.setText("Limpiar Tabla");
        
        this.add(interno,new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        this.add(estado,new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }
    public void limpiar(){
        JTcedula.setText("");
        estado.setText("");
        removeFila();
    }
    public javax.swing.JButton getButton(){
    return accion;
    }
    
    public javax.swing.JButton getButton1(){
        return interno;
    }
    
    public String getCedula() {
        return JTcedula.getText();
    }
    
    public void setFields(String texto){
        JTcedula.setText(texto);
    }
    
    public void setEstado(String text){
        estado.setText(text);
    }
    
    public void setFila(Object fila[]){
        dtm.addRow(fila);
    }
    
    public void removeFila(){
        int i=0;
        while(dtm.getRowCount()>0){
        
        dtm.removeRow(dtm.getRowCount()-1);
        }
    }

   
}
