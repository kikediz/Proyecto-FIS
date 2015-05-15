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
import javax.swing.JTextField;

/**
 *
 * @author maximiliano
 */
public class JPanel_Agregar_Administrador extends JPanel implements Panels{

    private javax.swing.JLabel cedula_JLabel;
    private javax.swing.JTextField cedula_JTextField;
    private javax.swing.JLabel id_sala_JLabel;
    private javax.swing.JTextField id_sala_JTextField;
    private javax.swing.JLabel fecha_entrada_JLabel;
    private javax.swing.JTextField fecha_entrada_JTextField;
    private javax.swing.JLabel fecha_salida_JLabel;
    private javax.swing.JTextField fecha_salida_JTextField;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    public JPanel_Agregar_Administrador(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        cedula_JLabel = new javax.swing.JLabel();
        cedula_JTextField = new javax.swing.JTextField();
        id_sala_JLabel = new javax.swing.JLabel();
        id_sala_JTextField = new javax.swing.JTextField();
        fecha_entrada_JLabel = new javax.swing.JLabel();
        fecha_entrada_JTextField = new javax.swing.JTextField();
        fecha_salida_JLabel = new javax.swing.JLabel();
        fecha_salida_JTextField = new javax.swing.JTextField();
        agregar_JButton = new javax.swing.JButton();
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
        add(cedula_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        cedula_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        cedula_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        cedula_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(cedula_JTextField, new GBConstraints(1, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_sala_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_sala_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_sala_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_sala_JLabel.setText("Id Sala");
        add(id_sala_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        id_sala_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_sala_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_sala_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_sala_JTextField.setToolTipText("Introduzca el id de la sala que desea actualizar");
        add(id_sala_JTextField, new GBConstraints(1, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        fecha_entrada_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        fecha_entrada_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        fecha_entrada_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_entrada_JLabel.setText("Fecha de Entrada");
        add(fecha_entrada_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        fecha_entrada_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        fecha_entrada_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        fecha_entrada_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_entrada_JTextField.setToolTipText("Introduzca la fecha de entrada que desea actualizar");
        add(fecha_entrada_JTextField, new GBConstraints(1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        fecha_salida_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        fecha_salida_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        fecha_salida_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_salida_JLabel.setText("Fecha de Salida");
        add(fecha_salida_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        fecha_entrada_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        fecha_entrada_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        fecha_entrada_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_entrada_JTextField.setToolTipText("Introduzca la fecha de salida que desea actualizar");
        add(fecha_entrada_JTextField, new GBConstraints(1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 5, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        agregar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        agregar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        agregar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        agregar_JButton.setText("Actualizar");
        agregar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        agregar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        agregar_JButton.setContentAreaFilled(true);
        agregar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(agregar_JButton, new GBConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
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

    public JLabel getFecha_entrada_JLabel() {
        return fecha_entrada_JLabel;
    }

    public void setFecha_entrada_JLabel(JLabel fecha_entrada_JLabel) {
        this.fecha_entrada_JLabel = fecha_entrada_JLabel;
    }

    public JTextField getFecha_entrada_JTextField() {
        return fecha_entrada_JTextField;
    }

    public void setFecha_entrada_JTextField(JTextField fecha_entrada_JTextField) {
        this.fecha_entrada_JTextField = fecha_entrada_JTextField;
    }

    public JLabel getFecha_salida_JLabel() {
        return fecha_salida_JLabel;
    }

    public void setFecha_salida_JLabel(JLabel fecha_salida_JLabel) {
        this.fecha_salida_JLabel = fecha_salida_JLabel;
    }

    public JTextField getFecha_salida_JTextField() {
        return fecha_salida_JTextField;
    }

    public void setFecha_salida_JTextField(JTextField fecha_salida_JTextField) {
        this.fecha_salida_JTextField = fecha_salida_JTextField;
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
        cedula_JTextField.setText("");
        id_sala_JTextField.setText("");
        fecha_salida_JTextField.setText("");
        fecha_entrada_JTextField.setText("");
    }
}
