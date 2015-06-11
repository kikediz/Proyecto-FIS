/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.licencia;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import org.freixas.jcalendar.*;
import vista.*;

/**
 *
 * @author maximiliano
 */
public class JPanel_Eliminar_Licencia extends JPanel implements Panels{
    private static final
    long serialVersionUID =
         1L;
    private javax.swing.JLabel id_licencia_JLabel;
    private javax.swing.JTextField id_licencia_JTextField;
    private javax.swing.JLabel producto_JLabel;
    private javax.swing.JTextField producto_JTextField;
    private javax.swing.JLabel cantidad_actual_JLabel;
    private javax.swing.JTextField cantidad_actual_JTextField;
    private javax.swing.JLabel cupo_JLabel;
    private javax.swing.JTextField cupo_JTextField;
    private javax.swing.JLabel fecha_expiracion_JLabel;
    private org.freixas.jcalendar.JCalendar fecha_expiracion_JCalendar;
    private javax.swing.JButton eliminar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    private javax.swing.border.Border etchedBorder;
    private javax.swing.border.Border emptyBorder;
    private javax.swing.border.Border compoundBorder;
    
    public JPanel_Eliminar_Licencia(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        
        id_licencia_JLabel = new javax.swing.JLabel();
        id_licencia_JTextField = new javax.swing.JTextField();
        producto_JLabel = new javax.swing.JLabel();
        producto_JTextField = new javax.swing.JTextField();
        cantidad_actual_JLabel = new javax.swing.JLabel();
        cantidad_actual_JTextField = new javax.swing.JTextField();
        cupo_JLabel = new javax.swing.JLabel();
        cupo_JTextField = new javax.swing.JTextField();
        fecha_expiracion_JLabel = new javax.swing.JLabel();
        fecha_expiracion_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
        eliminar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
        
        etchedBorder = javax.swing.BorderFactory.createEtchedBorder();
        emptyBorder = javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10);
        compoundBorder = javax.swing.BorderFactory.createCompoundBorder(etchedBorder, emptyBorder);
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new GridBagLayout());
        
        id_licencia_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        id_licencia_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_licencia_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_licencia_JLabel.setText("Id licencia");
        add(id_licencia_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        id_licencia_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_licencia_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_licencia_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_licencia_JTextField.setToolTipText("Introduzca la cedula que desea registrar");
        add(id_licencia_JTextField, new GBConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        producto_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        producto_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        producto_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        producto_JLabel.setText("Producto");
        add(producto_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        producto_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        producto_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        producto_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        producto_JTextField.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(producto_JTextField, new GBConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        cantidad_actual_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        cantidad_actual_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        cantidad_actual_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidad_actual_JLabel.setText("Cantidad");
        add(cantidad_actual_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        cantidad_actual_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        cantidad_actual_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        cantidad_actual_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad_actual_JTextField.setToolTipText("Introduzca el correo de la persona que desea actualizar");
        add(cantidad_actual_JTextField, new GBConstraints(1, 2, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));

        cupo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        cupo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        cupo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cupo_JLabel.setText("Cupo");
        add(cupo_JLabel, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        cupo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        cupo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        cupo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cupo_JTextField.setToolTipText("Introduzca el correo de la persona que desea actualizar");
        add(cupo_JTextField, new GBConstraints(1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        fecha_expiracion_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        fecha_expiracion_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        fecha_expiracion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_expiracion_JLabel.setText("Fecha de Expiración");
        add(fecha_expiracion_JLabel, new GBConstraints(3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        //fecha_expiracion_JCalendar.setFont(new java.awt.Font("Dustismo", 1, 26));
        fecha_expiracion_JCalendar.setTitleFont(new java.awt.Font("Serif", java.awt.Font.BOLD|java.awt.Font.ITALIC, 24));
        fecha_expiracion_JCalendar.setDayOfWeekFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 12));
        fecha_expiracion_JCalendar.setDayFont(new java.awt.Font("Dustismo", java.awt.Font.BOLD, 16));
        fecha_expiracion_JCalendar.setTimeFont(new java.awt.Font("DialogInput", java.awt.Font.PLAIN, 10));
        fecha_expiracion_JCalendar.setTodayFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        fecha_expiracion_JCalendar.setBorder(compoundBorder);
        add(fecha_expiracion_JCalendar, new GBConstraints(3, 1, 1, 1, 0.1, 0.1, GridBagConstraints.WEST, 0, new java.awt.Insets(32, 15, 10, 70), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 6, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        eliminar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        eliminar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        eliminar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        eliminar_JButton.setText("Actualizar");
        eliminar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        eliminar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        eliminar_JButton.setContentAreaFilled(true);
        eliminar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(eliminar_JButton, new GBConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        limpiarJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }
    public String getFecha(){
        return fecha_expiracion_JCalendar.getCalendar ().get ( Calendar.YEAR )+"-"+
               (fecha_expiracion_JCalendar.getCalendar ().get ( Calendar.MONTH )+1)+"-"+
               fecha_expiracion_JCalendar.getCalendar ().get ( Calendar.DAY_OF_MONTH );
    }
    public JLabel getId_licencia_JLabel() {
        return id_licencia_JLabel;
    }

    public void setId_licencia_JLabel(JLabel id_licencia_JLabel) {
        this.id_licencia_JLabel = id_licencia_JLabel;
    }

    public JTextField getId_licencia_JTextField() {
        return id_licencia_JTextField;
    }

    public void setId_licencia_JTextField(JTextField id_licencia_JTextField) {
        this.id_licencia_JTextField = id_licencia_JTextField;
    }

    public JLabel getProducto_JLabel() {
        return producto_JLabel;
    }

    public void setProducto_JLabel(JLabel producto_JLabel) {
        this.producto_JLabel = producto_JLabel;
    }

    public JTextField getProducto_JTextField() {
        return producto_JTextField;
    }

    public void setProducto_JTextField(JTextField producto_JTextField) {
        this.producto_JTextField = producto_JTextField;
    }

    public JLabel getCantidad_actual_JLabel() {
        return cantidad_actual_JLabel;
    }

    public void setCantidad_actual_JLabel(JLabel cantidad_actual_JLabel) {
        this.cantidad_actual_JLabel = cantidad_actual_JLabel;
    }

    public JTextField getCantidad_actual_JTextField() {
        return cantidad_actual_JTextField;
    }

    public void setCantidad_actual_JTextField(JTextField cantidad_actual_JTextField) {
        this.cantidad_actual_JTextField = cantidad_actual_JTextField;
    }

    public JLabel getCupo_JLabel() {
        return cupo_JLabel;
    }

    public void setCupo_JLabel(JLabel cupo_JLabel) {
        this.cupo_JLabel = cupo_JLabel;
    }

    public JTextField getCupo_JTextField() {
        return cupo_JTextField;
    }

    public void setCupo_JTextField(JTextField cupo_JTextField) {
        this.cupo_JTextField = cupo_JTextField;
    }

    public JCalendar getFecha_expiracion_JCalendar() {
        return fecha_expiracion_JCalendar;
    }

    public void setFecha_expiracion_JCalendar(JCalendar fecha_expiracion_JCalendar) {
        this.fecha_expiracion_JCalendar = fecha_expiracion_JCalendar;
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
        id_licencia_JTextField.setText("");
        producto_JTextField.setText("");
        cantidad_actual_JTextField.setText("");
        cupo_JTextField.setText("");
    }
}
