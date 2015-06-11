/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.licencia_equipo;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.freixas.jcalendar.*;
import vista.*;

/**
 *
 * @author morte
 */
public class JPanel_Actualizar_Licencia_Equipo extends JPanel implements Panels{

    private javax.swing.JLabel id_licencia_JLabel;
    private javax.swing.JTextField id_licencia_JTextField;
    private javax.swing.JLabel id_equipo_JLabel;
    private javax.swing.JTextField id_equipo_JTextField;
    private org.freixas.jcalendar.JCalendar fecha_instalacion_JCalendar;
    private javax.swing.JButton actualizar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    private javax.swing.border.Border etchedBorder;
    private javax.swing.border.Border emptyBorder;
    private javax.swing.border.Border compoundBorder;
    
    public JPanel_Actualizar_Licencia_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_licencia_JLabel = new javax.swing.JLabel();
        id_licencia_JTextField = new javax.swing.JTextField();
        id_equipo_JLabel = new javax.swing.JLabel();
        id_equipo_JTextField = new javax.swing.JTextField();
        fecha_instalacion_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
        actualizar_JButton = new javax.swing.JButton();
        exito=new  javax.swing.JLabel();
        limpiarJButton=new javax.swing.JButton();
        
        etchedBorder = javax.swing.BorderFactory.createEtchedBorder();
        emptyBorder = javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10);
        compoundBorder = javax.swing.BorderFactory.createCompoundBorder(etchedBorder, emptyBorder);
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        id_licencia_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        id_licencia_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_licencia_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_licencia_JLabel.setText("Id licencia");
        add(id_licencia_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        id_licencia_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_licencia_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_licencia_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_licencia_JTextField.setToolTipText("Introduzca el id de equipo que desea actualizar");
        add(id_licencia_JTextField, new GBConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        id_equipo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        id_equipo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_equipo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_equipo_JLabel.setText("Id equipo");
        add(id_equipo_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        id_equipo_JTextField.setBackground(new java.awt.Color(240, 240, 240));
        id_equipo_JTextField.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        id_equipo_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_equipo_JTextField.setToolTipText("Introduzca el id de equipo que desea actualizar");
        add(id_equipo_JTextField, new GBConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new java.awt.Insets(32, 27, 10, 26), 0, 0));
        
        fecha_instalacion_JCalendar.setTitleFont(new java.awt.Font("Serif", java.awt.Font.BOLD|java.awt.Font.ITALIC, 24));
        fecha_instalacion_JCalendar.setDayOfWeekFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 12));
        fecha_instalacion_JCalendar.setDayFont(new java.awt.Font("Dustismo", java.awt.Font.BOLD, 16));
        fecha_instalacion_JCalendar.setTimeFont(new java.awt.Font("DialogInput", java.awt.Font.PLAIN, 10));
        fecha_instalacion_JCalendar.setTodayFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        fecha_instalacion_JCalendar.setBorder(compoundBorder);
        add(fecha_instalacion_JCalendar, new GBConstraints(0, 2, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 4, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        actualizar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        actualizar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        actualizar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        actualizar_JButton.setText("Actualizar");
        actualizar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        actualizar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        actualizar_JButton.setContentAreaFilled(true);
        actualizar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(actualizar_JButton, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        limpiarJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }

    public String getFecha(){
        return fecha_instalacion_JCalendar.getCalendar ().get ( Calendar.YEAR )+"-"+
               (fecha_instalacion_JCalendar.getCalendar ().get ( Calendar.MONTH )+1)+"-"+
               fecha_instalacion_JCalendar.getCalendar ().get ( Calendar.DAY_OF_MONTH );
    }
    
    public JLabel getId_licencia_JLabel() {
        return id_licencia_JLabel;
    }

    public void setId_licencia_JLabel(JLabel id_licencia_JLabel) {
        this.id_licencia_JLabel = id_licencia_JLabel;
    }
    
    public JLabel getId_equipo_JLabel() {
        return id_equipo_JLabel;
    }

    public void setId_equipo_JLabel(JLabel id_equipo_JLabel) {
        this.id_equipo_JLabel = id_equipo_JLabel;
    }
    
    public JCalendar getFecha_instalacion_JCalendar() {
        return fecha_instalacion_JCalendar;
    }

    public void setFecha_instalacion_JCalendar(JCalendar fecha_instalacion_JCalendar) {
        this.fecha_instalacion_JCalendar = fecha_instalacion_JCalendar;
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
    public JTextField getId_licencia_JTextField() {
        return id_licencia_JTextField;
    }

    public void setId_licencia_JTextField(JTextField id_licencia_JTextField) {
        this.id_licencia_JTextField = id_licencia_JTextField;
    }

    public JTextField getId_equipo_JTextField() {
        return id_equipo_JTextField;
    }

    public void setId_equipo_JTextField(JTextField id_equipo_JTextField) {
        this.id_equipo_JTextField = id_equipo_JTextField;
    }
    
    
    @Override
    public void limpiar(){
        id_licencia_JTextField.setText("");
        id_equipo_JTextField.setText("");
        fecha_instalacion_JCalendar.setDate(new Date());
    }

    
}
