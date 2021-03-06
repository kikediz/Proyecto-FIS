/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.sala;

import java.awt.*;
import javax.swing.*;
import vista.*;

/**
 *
 * @author morte
 */
public class JPanel_Actualizar_Sala extends JPanel implements Panels{
    private static final
    long serialVersionUID =
         1L;

    private javax.swing.JLabel id_sala_JLabel;
    private javax.swing.JTextField id_sala_JTextField;
    private javax.swing.JLabel id_sede_JLabel;
    private java.awt.Choice id_sede_Choice;
    private javax.swing.JLabel capacidad_JLabel;
    private javax.swing.JTextField capacidad_JTextField;
    private javax.swing.JLabel nombre_JLabel;
    private javax.swing.JTextField nombre_JTextField;
    private javax.swing.JLabel actual_JLabel;
    private javax.swing.JTextField actual_JTextField;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    public JPanel_Actualizar_Sala(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_sala_JLabel = new javax.swing.JLabel();
        id_sala_JTextField = new javax.swing.JTextField();
        id_sede_Choice = new java.awt.Choice();
        capacidad_JLabel = new javax.swing.JLabel();
        capacidad_JTextField = new javax.swing.JTextField();
        nombre_JLabel = new javax.swing.JLabel();
        nombre_JTextField = new javax.swing.JTextField();
        actual_JLabel = new javax.swing.JLabel();
        actual_JTextField = new javax.swing.JTextField();
        actualizar_JButton = new javax.swing.JButton();
        id_sede_JLabel = new javax.swing.JLabel ();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        id_sala_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        id_sala_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_sala_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sala_JLabel.setText("Id Sala");
        add(id_sala_JLabel, new GBConstraints(0, 0, 1, 1, 0.05, 0.03, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(32, 27, 36, 26), 0 , 0));
        
        id_sala_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_sala_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_sala_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_sala_JTextField.setToolTipText("Introduzca el id de la sala que desea registrar");
        add(id_sala_JTextField, new GBConstraints(1, 0, 1, 1, 0.3, 0.1, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_sede_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        id_sede_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_sede_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sede_JLabel.setText("Id Sede");
        add(id_sede_JLabel, new GBConstraints(0, 1, 1, 1, 0.05, 0.03, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(32, 27, 36, 26), 0 , 0));
                
        id_sede_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_sede_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_licencia_Choice.setHorizontalAlignment(java.awt.Choice.CENTER_ALIGNMENT);
        id_sede_Choice.add("Id Sede");
        add(id_sede_Choice, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        capacidad_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        capacidad_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        capacidad_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capacidad_JLabel.setText("Capacidad");
        add(capacidad_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        capacidad_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        capacidad_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        capacidad_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        capacidad_JTextField.setToolTipText("Introduzca el numero máximo de clientes simultaneos");
        add(capacidad_JTextField, new GBConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        nombre_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombre_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre_JLabel.setText("Nombre sala");
        add(nombre_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombre_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        nombre_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        nombre_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre_JTextField.setToolTipText("Introduzca el nombre de la sala que desee registrar");
        add(nombre_JTextField, new GBConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        actualizar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        actualizar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        actualizar_JButton.setText("Actualizar");
        actualizar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        actualizar_JButton.setContentAreaFilled(true);
        actualizar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(actualizar_JButton, new GBConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }

    
    public JLabel getId_sala_JLabel() {
        return id_sala_JLabel;
    }

    public void setId_sala_JLabel(JLabel id_sala_JLabel) {
        this.id_sala_JLabel = id_sala_JLabel;
    }

    public JTextField getId_sala_JTextField() {
        return id_sala_JTextField;
    }

    public void setId_sala_JTextField(JTextField id_sala_JTextField) {
        this.id_sala_JTextField = id_sala_JTextField;
    }

    public Choice getId_sede_Choice() {
        return id_sede_Choice;
    }

    public void setId_sede_Choice(Choice id_sede_Choice) {
        this.id_sede_Choice = id_sede_Choice;
    }

    public JLabel getCapacidad_JLabel() {
        return capacidad_JLabel;
    }

    public void setCapacidad_JLabel(JLabel capacidad_JLabel) {
        this.capacidad_JLabel = capacidad_JLabel;
    }

    public JTextField getCapacidad_JTextField() {
        return capacidad_JTextField;
    }

    public void setCapacidad_JTextField(JTextField capacidad_JTextField) {
        this.capacidad_JTextField = capacidad_JTextField;
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

    public JLabel getActual_JLabel() {
        return actual_JLabel;
    }

    public void setActual_JLabel(JLabel actual_JLabel) {
        this.actual_JLabel = actual_JLabel;
    }

    public JTextField getActual_JTextField() {
        return actual_JTextField;
    }

    public void setActual_JTextField(JTextField actual_JTextField) {
        this.actual_JTextField = actual_JTextField;
    }

    public JButton getActualizar_JButton() {
        return actualizar_JButton;
    }

    public void setActualizar_JButton(JButton actualizar_JButton) {
        this.actualizar_JButton = actualizar_JButton;
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
        id_sala_JTextField.setText("");
        id_sede_Choice.select("Id Sede");
        capacidad_JTextField.setText("");
        nombre_JTextField.setText("");
        actual_JTextField.setText("");
    }
}
