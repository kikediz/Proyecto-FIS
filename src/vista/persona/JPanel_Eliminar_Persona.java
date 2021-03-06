/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.persona;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author morte
 */
public class JPanel_Eliminar_Persona extends JPanel implements Panels{

    private javax.swing.JLabel cedula_JLabel;
    private javax.swing.JTextField cedula_JTextField;
    private javax.swing.JLabel correo_JLabel;
    private javax.swing.JTextField correo_JTextField;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JTextField nombre_JTextField;
    private javax.swing.JLabel apellido_JLabel;
    private javax.swing.JTextField apellido_JTextField;
    private javax.swing.JLabel direccion_JLabel;
    private javax.swing.JTextField direccion_JTextField;
    private javax.swing.JButton eliminar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Eliminar_Persona(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        cedula_JLabel = new javax.swing.JLabel();
        cedula_JTextField = new javax.swing.JTextField();
        nombre_JLabel = new javax.swing.JLabel();
        nombre_JTextField = new javax.swing.JTextField();
        apellido_JLabel = new javax.swing.JLabel();
        apellido_JTextField = new javax.swing.JTextField();
        direccion_JLabel = new javax.swing.JLabel();
        direccion_JTextField = new javax.swing.JTextField();
        correo_JLabel = new javax.swing.JLabel();
        correo_JTextField = new javax.swing.JTextField();
        eliminar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        cedula_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        cedula_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        cedula_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cedula_JLabel.setText("Cedula");
        add(cedula_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        cedula_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        cedula_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        cedula_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(cedula_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        nombre_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_JLabel.setText("Nombre");
        add(nombre_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        nombre_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        nombre_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_JTextField.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(nombre_JTextField, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        apellido_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        apellido_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        apellido_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apellido_JLabel.setText("Nombre");
        add(apellido_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        apellido_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        apellido_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        apellido_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido_JTextField.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(apellido_JTextField, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        direccion_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        direccion_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        direccion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccion_JLabel.setText("Nombre");
        add(direccion_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        direccion_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        direccion_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        direccion_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion_JTextField.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(direccion_JTextField, new GBConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        correo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        correo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correo_JLabel.setText("Correo");
        add(correo_JLabel, new GBConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        correo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        correo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo_JTextField.setToolTipText("Introduzca el correo de la persona que desea actualizar");
        add(correo_JTextField, new GBConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 5, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        eliminar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        eliminar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        eliminar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        eliminar_JButton.setText("Actualizar");
        eliminar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        eliminar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        eliminar_JButton.setContentAreaFilled(true);
        eliminar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(eliminar_JButton, new GBConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }


    public JLabel getCedula_JLabel() {
        return cedula_JLabel;
    }

    public void setCedula_JLabel(JLabel cedula_JLabel) {
        this.cedula_JLabel = cedula_JLabel;
    }

    public JTextField getCedula_JTextField() {
        return cedula_JTextField;
    }

    public void setCedula_JTextField(JTextField cedula_JTextField) {
        this.cedula_JTextField = cedula_JTextField;
    }

    public JLabel getCorreo_JLabel() {
        return correo_JLabel;
    }

    public void setCorreo_JLabel(JLabel correo_JLabel) {
        this.correo_JLabel = correo_JLabel;
    }

    public JTextField getCorreo_JTextField() {
        return correo_JTextField;
    }

    public void setCorreo_JTextField(JTextField correo_JTextField) {
        this.correo_JTextField = correo_JTextField;
    }

    public JLabel getNombre_JLabel() {
        return nombre_JLabel;
    }

    public void setNombre_JLabel(JLabel nombre_JLabel) {
        this.nombre_JLabel = nombre_JLabel;
    }

    public JTextField getNombre_JTextField() {
        return nombre_JTextField;
    }

    public void setNombre_JTextField(JTextField nombre_JTextField) {
        this.nombre_JTextField = nombre_JTextField;
    }

    public JLabel getApellido_JLabel() {
        return apellido_JLabel;
    }

    public void setApellido_JLabel(JLabel apellido_JLabel) {
        this.apellido_JLabel = apellido_JLabel;
    }

    public JTextField getApellido_JTextField() {
        return apellido_JTextField;
    }

    public void setApellido_JTextField(JTextField apellido_JTextField) {
        this.apellido_JTextField = apellido_JTextField;
    }

    public JLabel getDireccion_JLabel() {
        return direccion_JLabel;
    }

    public void setDireccion_JLabel(JLabel direccion_JLabel) {
        this.direccion_JLabel = direccion_JLabel;
    }

    public JTextField getDireccion_JTextField() {
        return direccion_JTextField;
    }

    public void setDireccion_JTextField(JTextField direccion_JTextField) {
        this.direccion_JTextField = direccion_JTextField;
    }

    public JButton getRegistrarJButton() {
        return eliminar_JButton;
    }

    public void setRegistrarJButton(JButton eliminar_JButton) {
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
        cedula_JTextField.setText("");
        nombre_JTextField.setText("");
        apellido_JTextField.setText("");
        direccion_JTextField.setText("");
        correo_JTextField.setText("");
    }

    
}
