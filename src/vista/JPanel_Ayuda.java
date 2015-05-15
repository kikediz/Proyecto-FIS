/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author maximiliano
 */
public class JPanel_Ayuda extends JPanel implements Panels{
    
    private javax.swing.JTextArea ayudaJTextArea;
    
    public JPanel_Ayuda(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        ayudaJTextArea=new JTextArea();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        ayudaJTextArea.setFont(new java.awt.Font("Dustismo", 1, 24)); // NOI18N
        ayudaJTextArea.setForeground(new java.awt.Color(0, 0, 0));
        ayudaJTextArea.setText("Para agregar nuevo registros, \nseleccione del menú archivo la opcion agregar\n"
                + "también puede hacer esto de forma rapida con ctrl + N\n"
                + "para actualizar un resgistro existente lo\n puede hacer desde el menú archivo y la opcion \n"
                + "actualizar o lo puede hacer con ctrl + U \n"
                + "Si desea borrar un registro lo puede hacer mediante \nla opcion archivo y luego borrar o \n"
                + "o mediante la opcion ctrl + D.\n"
                + "si desea conocer sobre el desarrollador basta con \n selecconar en la sección de ayuda y luego \n "
                + "la opcion acerca de, tambien es posible lograr esto mediante \n"
                + "las teclas ctrl + A"
                + "Para acceder al contenido de ayuda lo hace mediante la sección de \n ayuda y contenido de ayuda\n"
                + "o las teclas ctrl + H\n"
                + "Si lo que desea es salir, en el menú archivo, se encuentra la opcion salir, lo puede lograr, mediante \n "
                + "las teclas ctrl + Q."
                + ""
                + "");
        add(new JScrollPane(ayudaJTextArea), new GBConstraints(0, 1, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        
        }

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
