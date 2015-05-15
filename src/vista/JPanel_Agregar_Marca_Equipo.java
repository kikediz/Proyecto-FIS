/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author morte
 */
public class JPanel_Agregar_Marca_Equipo extends JPanel implements Panels{
    
    private javax.swing.JLabel id_marca_JLabel;
    private javax.swing.JTextField id_marca_JTextField;
    private javax.swing.JLabel descripcion_marca_JLabel;
    private javax.swing.JTextArea descripcion_marca_JTextArea;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    public JPanel_Agregar_Marca_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_marca_JLabel = new javax.swing.JLabel();
        id_marca_JTextField = new javax.swing.JTextField();
        descripcion_marca_JLabel = new javax.swing.JLabel();
        descripcion_marca_JTextArea = new javax.swing.JTextArea();
        agregar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        id_marca_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_marca_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_marca_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_marca_JLabel.setText("Cedula");
        add(id_marca_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_marca_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_marca_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_marca_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_marca_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_marca_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_marca_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        descripcion_marca_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_marca_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descripcion_marca_JLabel.setText("Nombre");
        add(descripcion_marca_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        descripcion_marca_JTextArea.setBackground(new java.awt.Color(240, 240, 240));
        descripcion_marca_JTextArea.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //descripcion_marca_JTextArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcion_marca_JTextArea.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(descripcion_marca_JTextArea, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
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

    public JLabel getId_marca_JLabel() {
        return id_marca_JLabel;
    }

    public void setId_marca_JLabel(JLabel id_marca_JLabel) {
        this.id_marca_JLabel = id_marca_JLabel;
    }

    public JTextField getId_marca_JTextField() {
        return id_marca_JTextField;
    }

    public void setId_marca_JTextField(JTextField id_marca_JTextField) {
        this.id_marca_JTextField = id_marca_JTextField;
    }

    public JLabel getDescripcion_marca_JLabel() {
        return descripcion_marca_JLabel;
    }

    public void setDescripcion_marca_JLabel(JLabel descripcion_marca_JLabel) {
        this.descripcion_marca_JLabel = descripcion_marca_JLabel;
    }

    public JTextArea getDescripcion_marca_JTextArea() {
        return descripcion_marca_JTextArea;
    }

    public void setDescripcion_marca_JTextArea(JTextArea descripcion_marca_JTextArea) {
        this.descripcion_marca_JTextArea = descripcion_marca_JTextArea;
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
        id_marca_JTextField.setText("");
        descripcion_marca_JTextArea.setText("");
    }
}
