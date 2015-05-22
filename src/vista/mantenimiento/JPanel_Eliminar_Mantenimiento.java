/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.mantenimiento;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author morte
 */
public class JPanel_Eliminar_Mantenimiento extends JPanel implements Panels{

    private javax.swing.JLabel id_mantenimiento_JLabel;
    private javax.swing.JTextField id_mantenimiento_JTextField;
    private javax.swing.JLabel descripcion_mantenimiento_JLabel;
    private javax.swing.JTextArea descripcion_mantenimiento_JTextArea;
    private javax.swing.JButton eliminar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Eliminar_Mantenimiento(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_mantenimiento_JLabel = new javax.swing.JLabel();
        id_mantenimiento_JTextField = new javax.swing.JTextField();
        descripcion_mantenimiento_JLabel = new javax.swing.JLabel();
        descripcion_mantenimiento_JTextArea = new javax.swing.JTextArea();
        eliminar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        id_mantenimiento_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_mantenimiento_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_mantenimiento_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_mantenimiento_JLabel.setText("Cedula");
        add(id_mantenimiento_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_mantenimiento_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_mantenimiento_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_mantenimiento_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_mantenimiento_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_mantenimiento_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_mantenimiento_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        descripcion_mantenimiento_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_mantenimiento_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcion_mantenimiento_JLabel.setText("Nombre");
        add(descripcion_mantenimiento_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_mantenimiento_JTextArea.setBackground(new java.awt.Color(240, 240, 240));
        descripcion_mantenimiento_JTextArea.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //descripcion_mantenimiento_JTextArea.setHorizontalAlignment(javax.swing.JTextArea.CENTER);
        descripcion_mantenimiento_JTextArea.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(descripcion_mantenimiento_JTextArea, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 3, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        eliminar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        eliminar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        eliminar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        eliminar_JButton.setText("Actualizar");
        eliminar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        eliminar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        eliminar_JButton.setContentAreaFilled(true);
        eliminar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(eliminar_JButton, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }

    
    public JLabel getId_mantenimiento_JLabel() {
        return id_mantenimiento_JLabel;
    }

    public void setId_mantenimiento_JLabel(JLabel id_mantenimiento_JLabel) {
        this.id_mantenimiento_JLabel = id_mantenimiento_JLabel;
    }

    public JTextField getId_mantenimiento_JTextField() {
        return id_mantenimiento_JTextField;
    }

    public void setId_mantenimiento_JTextField(JTextField id_mantenimiento_JTextField) {
        this.id_mantenimiento_JTextField = id_mantenimiento_JTextField;
    }

    public JLabel getDescripcion_mantenimiento_JLabel() {
        return descripcion_mantenimiento_JLabel;
    }

    public void setDescripcion_mantenimiento_JLabel(JLabel descripcion_mantenimiento_JLabel) {
        this.descripcion_mantenimiento_JLabel = descripcion_mantenimiento_JLabel;
    }

    public JTextArea getDescripcion_mantenimiento_JTextArea() {
        return descripcion_mantenimiento_JTextArea;
    }

    public void setDescripcion_mantenimiento_JTextArea(JTextArea descripcion_mantenimiento_JTextArea) {
        this.descripcion_mantenimiento_JTextArea = descripcion_mantenimiento_JTextArea;
    }

    public JButton getActualizar_JButton() {
        return eliminar_JButton;
    }

    public void setActualizar_JButton(JButton eliminar_JButton) {
        this.eliminar_JButton = eliminar_JButton;
    }

    public JButton getLimpiarJButton() {
        return limpiarJButton;
    }

    public void setLimpiarJButton(JButton limpiarJButton) {
        this.limpiarJButton = limpiarJButton;
    }

    public JLabel getExito() {
        return exito;
    }

    public void setExito(JLabel exito) {
        this.exito = exito;
    }
    
    public void limpiar(){
        id_mantenimiento_JTextField.setText("");
        descripcion_mantenimiento_JTextArea.setText("");
    }
}
