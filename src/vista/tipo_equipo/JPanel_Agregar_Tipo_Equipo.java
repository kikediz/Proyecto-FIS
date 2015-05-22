/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tipo_equipo;

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
public class JPanel_Agregar_Tipo_Equipo extends JPanel implements Panels{
    
    private javax.swing.JLabel id_tipo_equipo_JLabel;
    private javax.swing.JTextField id_tipo_equipo_JTextField;
    private javax.swing.JLabel descripcion_JLabel;
    private javax.swing.JTextArea descripcion_JTextArea;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Agregar_Tipo_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_tipo_equipo_JLabel = new javax.swing.JLabel();
        id_tipo_equipo_JTextField = new javax.swing.JTextField();
        descripcion_JLabel = new javax.swing.JLabel();
        descripcion_JTextArea = new javax.swing.JTextArea();
        agregar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        id_tipo_equipo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_tipo_equipo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_tipo_equipo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_tipo_equipo_JLabel.setText("id_tipo_equipo_JLabel");
        add(id_tipo_equipo_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_tipo_equipo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_tipo_equipo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_tipo_equipo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_tipo_equipo_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_tipo_equipo_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        descripcion_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcion_JLabel.setText("id_tipo_equipo_JLabel");
        add(descripcion_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_JTextArea.setBackground(new java.awt.Color(240, 240, 240));
        descripcion_JTextArea.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //descripcion_JTextArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcion_JTextArea.setToolTipText("Introduzca la cedula que desea registrar");
        add(descripcion_JTextArea, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 3, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        agregar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        agregar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        agregar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        agregar_JButton.setText("Actualizar");
        agregar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        agregar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        agregar_JButton.setContentAreaFilled(true);
        agregar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(agregar_JButton, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
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
    
    public JLabel getId_tipo_equipo_JLabel() {
        return id_tipo_equipo_JLabel;
    }

    public void setId_tipo_equipo_JLabel(JLabel id_tipo_equipo_JLabel) {
        this.id_tipo_equipo_JLabel = id_tipo_equipo_JLabel;
    }

    public JTextField getId_tipo_equipo_JTextField() {
        return id_tipo_equipo_JTextField;
    }

    public void setId_tipo_equipo_JTextField(JTextField id_tipo_equipo_JTextField) {
        this.id_tipo_equipo_JTextField = id_tipo_equipo_JTextField;
    }

    public JLabel getDescripcion_JLabel() {
        return descripcion_JLabel;
    }

    public void setDescripcion_JLabel(JLabel descripcion_JLabel) {
        this.descripcion_JLabel = descripcion_JLabel;
    }

    public JTextArea getDescripcion_JTextArea() {
        return descripcion_JTextArea;
    }

    public void setDescripcion_JTextArea(JTextArea descripcion_JTextArea) {
        this.descripcion_JTextArea = descripcion_JTextArea;
    }

    public JButton getActualizar_JButton() {
        return agregar_JButton;
    }

    public void setActualizar_JButton(JButton agregar_JButton) {
        this.agregar_JButton = agregar_JButton;
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
        id_tipo_equipo_JTextField.setText("");
        descripcion_JTextArea.setText("");
    }
}
