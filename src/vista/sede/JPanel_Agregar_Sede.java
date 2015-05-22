/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.sede;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author maximiliano
 */
public class JPanel_Agregar_Sede extends JPanel implements Panels{
    
    private javax.swing.JLabel id_sede_JLabel;
    private javax.swing.JTextField id_sede_JTextField;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JTextField nombre_JTextField;
    private javax.swing.JLabel telefono_JLabel;
    private javax.swing.JTextField telefono_JTextField;
    private javax.swing.JLabel direccion_JLabel;
    private javax.swing.JTextField direccion_JTextField;
    private javax.swing.JLabel correo_JLabel;
    private javax.swing.JTextField correo_JTextField;
    private java.awt.Choice id_ciudad_Choice;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Agregar_Sede(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_sede_JLabel = new javax.swing.JLabel();
        id_sede_JTextField = new javax.swing.JTextField();
        nombre_JLabel = new javax.swing.JLabel();
        nombre_JTextField = new javax.swing.JTextField();
        telefono_JLabel = new javax.swing.JLabel();
        telefono_JTextField = new javax.swing.JTextField();
        direccion_JLabel = new javax.swing.JLabel();
        direccion_JTextField = new javax.swing.JTextField();
        correo_JLabel = new javax.swing.JLabel();
        correo_JTextField = new javax.swing.JTextField();
        id_ciudad_Choice = new java.awt.Choice();
        agregar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        id_sede_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_sede_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_sede_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sede_JLabel.setText("Cedula");
        add(id_sede_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_sede_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_sede_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_sede_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_sede_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_sede_JTextField, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        nombre_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_JLabel.setText("Cedula");
        add(nombre_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        nombre_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        nombre_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(nombre_JTextField, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        telefono_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        telefono_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        telefono_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefono_JLabel.setText("Cedula");
        add(telefono_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        telefono_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        telefono_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        telefono_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefono_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(telefono_JTextField, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        direccion_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        direccion_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        direccion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccion_JLabel.setText("Cedula");
        add(direccion_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        direccion_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        direccion_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        direccion_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(direccion_JTextField, new GBConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        correo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        correo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correo_JLabel.setText("Cedula");
        add(correo_JLabel, new GBConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        correo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        correo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correo_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(correo_JTextField, new GBConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_ciudad_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_ciudad_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_licencia_Choice.setHorizontalAlignment(java.awt.Choice.CENTER_ALIGNMENT);
        id_ciudad_Choice.add("Id Ciudad");
        add(id_ciudad_Choice, new GBConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 7, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        agregar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        agregar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        agregar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        agregar_JButton.setText("Actualizar");
        agregar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        agregar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        agregar_JButton.setContentAreaFilled(true);
        agregar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(agregar_JButton, new GBConstraints(0, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }
    
    public JLabel getId_sede_JLabel() {
        return id_sede_JLabel;
    }

    public void setId_sede_JLabel(JLabel id_sede_JLabel) {
        this.id_sede_JLabel = id_sede_JLabel;
    }

    public JTextField getId_sede_JTextField() {
        return id_sede_JTextField;
    }

    public void setId_sede_JTextField(JTextField id_sede_JTextField) {
        this.id_sede_JTextField = id_sede_JTextField;
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

    public JLabel getTelefono_JLabel() {
        return telefono_JLabel;
    }

    public void setTelefono_JLabel(JLabel telefono_JLabel) {
        this.telefono_JLabel = telefono_JLabel;
    }

    public JTextField getTelefono_JTextField() {
        return telefono_JTextField;
    }

    public void setTelefono_JTextField(JTextField telefono_JTextField) {
        this.telefono_JTextField = telefono_JTextField;
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

    public Choice getId_ciudad_Choice() {
        return id_ciudad_Choice;
    }

    public void setId_ciudad_Choice(Choice id_ciudad_Choice) {
        this.id_ciudad_Choice = id_ciudad_Choice;
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
        id_sede_JTextField.setText("");
        nombre_JTextField.setText("");
        telefono_JTextField.setText("");
        direccion_JTextField.setText("");
        correo_JTextField.setText("");
        id_ciudad_Choice.select("Id Ciudad");
    }
}
