/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author morte
 */
public class JPanel_Login extends javax.swing.JFrame implements Panels{

    javax.swing.JLabel usuario_JLabel;
    javax.swing.JTextField usuario_JTextField;
    javax.swing.JLabel password_JLabel;
    javax.swing.JPasswordField password_JPasswordField;
    javax.swing.JButton entrar_JButton;
    javax.swing.JButton salir_JButton;

    public JPanel_Login(){
        initcomponents();
        construir();
    }
    
    public void initcomponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/vista/unillanos.png")).getImage());
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("Login"); // NOI18N
        setSize(new java.awt.Dimension(600, 400));
        
        usuario_JLabel = new javax.swing.JLabel();
        usuario_JTextField = new javax.swing.JTextField();
        password_JLabel = new javax.swing.JLabel();
        password_JPasswordField = new JPasswordField();
        entrar_JButton = new javax.swing.JButton();
        salir_JButton = new javax.swing.JButton();
        
        pack();
    }
    
    public void construir(){
        
        setLayout(new java.awt.GridBagLayout());
        
        usuario_JLabel.setFont(new java.awt.Font("Dustismo", 1, 28)); // NOI18N
        usuario_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuario_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario_JLabel.setText("Usuario");
        add(usuario_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 100, 0, 100), 0, 0));
        
        usuario_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        usuario_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        usuario_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usuario_JTextField.setToolTipText("Introduzca su nombre de usuario");
        add(usuario_JTextField, new GBConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(5, 20, 5, 50), 0, 0));
        
        password_JLabel.setFont(new java.awt.Font("Dustismo", 1, 28)); // NOI18N
        password_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        password_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_JLabel.setText("Password");
        add(password_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 100, 40, 100), 0, 0));
        
        password_JPasswordField.setBackground(new java.awt.Color(240, 240, 240));
        password_JPasswordField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        password_JPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_JPasswordField.setToolTipText("Introduzca su contraseña");
        add(password_JPasswordField, new GBConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(5, 20, 40, 50), 0, 0));
        
        entrar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        entrar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        entrar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        entrar_JButton.setText("Entrar");
        entrar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        entrar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        entrar_JButton.setContentAreaFilled(true);
        entrar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(entrar_JButton, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 3, 0), 0, 0));
        
        salir_JButton.setBackground(new java.awt.Color(230, 230, 230));
        salir_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        salir_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        salir_JButton.setText("Salir");
        salir_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        salir_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        salir_JButton.setContentAreaFilled(true);
        salir_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(salir_JButton, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 3, 0), 0, 0));
        
    }
    
    
    public JLabel getUsuario_JLabel() {
        return usuario_JLabel;
    }

    public void setUsuario_JLabel(JLabel usuario_JLabel) {
        this.usuario_JLabel = usuario_JLabel;
    }

    public JTextField getUsuario_JTextField() {
        return usuario_JTextField;
    }

    public void setUsuario_JTextField(JTextField usuario_JTextField) {
        this.usuario_JTextField = usuario_JTextField;
    }

    public JLabel getPassword_JLabel() {
        return password_JLabel;
    }

    public void setPassword_JLabel(JLabel password_JLabel) {
        this.password_JLabel = password_JLabel;
    }

    public JPasswordField getPassword_JPasswordField() {
        return password_JPasswordField;
    }

    public void setPassword_JPasswordField(JPasswordField password_JPasswordField) {
        this.password_JPasswordField = password_JPasswordField;
    }

    public JButton getEntrar_JButton() {
        return entrar_JButton;
    }

    public void setEntrar_JButton(JButton entrar_JButton) {
        this.entrar_JButton = entrar_JButton;
    }

    public JButton getSalir_JButton() {
        return salir_JButton;
    }

    public void setSalir_JButton(JButton salir_JButton) {
        this.salir_JButton = salir_JButton;
    }
    

    @Override
    public void limpiar() {
        usuario_JTextField.setText("");
        password_JPasswordField.setText("");
    }
}
