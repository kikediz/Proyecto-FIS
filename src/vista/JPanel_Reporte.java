/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maximiliano
 */
public class JPanel_Reporte extends javax.swing.JPanel implements Panels{
    private javax.swing.table.DefaultTableModel dtm;
    private javax.swing.JTable jTable;
    private javax.swing.JScrollPane jsp;
    private String columnas[] = {"Cédula","Nombre","Correo"};
    
    public JPanel_Reporte(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        dtm = new DefaultTableModel(null,columnas);
        jTable = new JTable(dtm);
        jsp = new JScrollPane(jTable);
        construir();
        
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        add(jsp, new GBConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
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

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
