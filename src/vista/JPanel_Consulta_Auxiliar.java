/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author maximiliano
 */
public class JPanel_Consulta_Auxiliar extends javax.swing.JPanel implements Panels{
    private javax.swing.JTextArea informacionJTextArea;
    
    public JPanel_Consulta_Auxiliar(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        informacionJTextArea = new javax.swing.JTextArea(20, 0);
        
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        informacionJTextArea.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        informacionJTextArea.setForeground(new java.awt.Color(0, 0, 0));
        informacionJTextArea.setText("Programa para almacenar datos \nde personas, donde se piden la \ncedula, el nombre y el correo \nelectronico."
                + "\nEste software se encarga de validar \ny no permitir que se ingresen \ncaracteres invalidos en los campos."
                + "\n"
                + "\nSoftware elaborado por:"
                + "\n\nMaximiliano Cárdenas Gelves"
                + "\nversion 1.0"
                + "\naño 2015"
                + "\nsemestre I");
        informacionJTextArea.setAutoscrolls(true);
        informacionJTextArea.setEditable(false);
        informacionJTextArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        informacionJTextArea.setAlignmentY(TOP_ALIGNMENT);
        JScrollPane jScrollPane = new JScrollPane(informacionJTextArea);
        
        add(jScrollPane, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, 0, 0, null, 0, 0));
    }

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
