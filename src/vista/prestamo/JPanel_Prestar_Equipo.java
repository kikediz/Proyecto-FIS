/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.prestamo;

import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author maximiliano
 */
public class JPanel_Prestar_Equipo extends JPanel implements Panels{
    private javax.swing.JLabel cedulaJLabel;
    private javax.swing.JTextField cedulaJTextField;
    private javax.swing.JLabel correoJLabel;
    private javax.swing.JTextField correoJTextField;
    private javax.swing.JLabel nombreJLabel;
    private javax.swing.JTextField nombreJTextField;
    private javax.swing.JButton registrarJButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    public JPanel_Prestar_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        cedulaJLabel = new javax.swing.JLabel();
        cedulaJTextField = new javax.swing.JTextField();
        nombreJLabel = new javax.swing.JLabel();
        nombreJTextField = new javax.swing.JTextField();
        correoJLabel = new javax.swing.JLabel();
        correoJTextField = new javax.swing.JTextField();
        registrarJButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        cedulaJLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        cedulaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        cedulaJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cedulaJLabel.setText("Cedula");
        add(cedulaJLabel, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        cedulaJTextField.setBackground(new java.awt.Color(240, 240, 240));
        cedulaJTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        cedulaJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedulaJTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(cedulaJTextField, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombreJLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        nombreJLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJLabel.setText("Nombre");
        add(nombreJLabel, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        nombreJTextField.setBackground(new java.awt.Color(240, 240, 240));
        nombreJTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        nombreJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreJTextField.setToolTipText("Introduzca el nombre de la persona que desea registrar");
        add(nombreJTextField, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correoJLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        correoJLabel.setForeground(new java.awt.Color(0, 0, 0));
        correoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correoJLabel.setText("Correo");
        add(correoJLabel, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        correoJTextField.setBackground(new java.awt.Color(240, 240, 240));
        correoJTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        correoJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correoJTextField.setToolTipText("Introduzca el correo de la persona que desea registrar");
        add(correoJTextField, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        registrarJButton.setBackground(new java.awt.Color(230, 230, 230));
        registrarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        registrarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        registrarJButton.setText("Registrar");
        registrarJButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        registrarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        registrarJButton.setContentAreaFilled(true);
        registrarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(registrarJButton, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, 0, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }
    public void limpiar(){
        nombreJTextField.setText("");
        cedulaJTextField.setText("");
        correoJTextField.setText("");
    }
    public JLabel getExito() {
        return exito;
    }

    public void setExito(JLabel exito) {
        this.exito = exito;
    }
    public javax.swing.JButton getButton(){
        return registrarJButton; 
    }

    public javax.swing.JLabel getCedulaJLabel() {
        return cedulaJLabel;
    }

    public void setCedulaJLabel(javax.swing.JLabel cedulaJLabel) {
        this.cedulaJLabel = cedulaJLabel;
    }

    public javax.swing.JTextField getCedulaJTextField() {
        return cedulaJTextField;
    }

    public void setCedulaJTextField(javax.swing.JTextField cedulaJTextField) {
        this.cedulaJTextField = cedulaJTextField;
    }

    public javax.swing.JLabel getCorreoJLabel() {
        return correoJLabel;
    }

    public void setCorreoJLabel(javax.swing.JLabel correoJLabel) {
        this.correoJLabel = correoJLabel;
    }

    public javax.swing.JTextField getCorreoJTextField() {
        return correoJTextField;
    }

    public void setCorreoJTextField(javax.swing.JTextField correoJTextField) {
        this.correoJTextField = correoJTextField;
    }

    public javax.swing.JLabel getNombreJLabel() {
        return nombreJLabel;
    }

    public void setNombreJLabel(javax.swing.JLabel nombreJLabel) {
        this.nombreJLabel = nombreJLabel;
    }

    public javax.swing.JTextField getNombreJTextField() {
        return nombreJTextField;
    }

    public void setNombreJTextField(javax.swing.JTextField nombreJTextField) {
        this.nombreJTextField = nombreJTextField;
    }

    public javax.swing.JButton getRegistrarJButton() {
        return registrarJButton;
    }

    public void setRegistrarJButton(javax.swing.JButton registrarJButton) {
        this.registrarJButton = registrarJButton;
    }

    public javax.swing.JButton getLimpiarJButton() {
        return limpiarJButton;
    }

    public void setLimpiarJButton(javax.swing.JButton limpiarJButton) {
        this.limpiarJButton = limpiarJButton;
    }

    
}
