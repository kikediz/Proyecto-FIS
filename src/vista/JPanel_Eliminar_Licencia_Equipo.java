/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.freixas.jcalendar.JCalendar;

/**
 *
 * @author morte
 */
public class JPanel_Eliminar_Licencia_Equipo extends JPanel implements Panels{
    
    private javax.swing.JLabel id_licencia_JLabel;
    private java.awt.Choice id_licencia_Choice;
    private javax.swing.JLabel id_equipo_JLabel;
    private java.awt.Choice id_equipo_Choice;
    private org.freixas.jcalendar.JCalendar fecha_instalacion_JCalendar;
    private javax.swing.JButton eliminar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    private javax.swing.border.Border etchedBorder;
    private javax.swing.border.Border emptyBorder;
    private javax.swing.border.Border compoundBorder;
    
    public JPanel_Eliminar_Licencia_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        id_licencia_JLabel = new javax.swing.JLabel();
        id_licencia_Choice = new java.awt.Choice();
        id_equipo_JLabel = new javax.swing.JLabel();
        id_equipo_Choice = new java.awt.Choice();
        fecha_instalacion_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
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
        setLayout(new java.awt.GridBagLayout());
        id_licencia_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_licencia_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_licencia_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_licencia_JLabel.setText("Cedula");
        add(id_licencia_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_licencia_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_licencia_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_licencia_Choice.setHorizontalAlignment(java.awt.Choice.CENTER_ALIGNMENT);
        id_licencia_Choice.add("Id Licencia");
        add(id_licencia_Choice, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_equipo_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_equipo_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_equipo_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_equipo_JLabel.setText("Nombre");
        add(id_equipo_JLabel, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_equipo_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_equipo_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_equipo_Choice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_equipo_Choice.add("Id Equipo");
        add(id_equipo_Choice, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
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
        
        eliminar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        eliminar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        eliminar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        eliminar_JButton.setText("Actualizar");
        eliminar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        eliminar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        eliminar_JButton.setContentAreaFilled(true);
        eliminar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(eliminar_JButton, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }

    public JLabel getId_licencia_JLabel() {
        return id_licencia_JLabel;
    }

    public void setId_licencia_JLabel(JLabel id_licencia_JLabel) {
        this.id_licencia_JLabel = id_licencia_JLabel;
    }

    public Choice getId_licencia_Choice() {
        return id_licencia_Choice;
    }

    public void setId_licencia_Choice(Choice id_licencia_Choice) {
        this.id_licencia_Choice = id_licencia_Choice;
    }

    public JLabel getId_equipo_JLabel() {
        return id_equipo_JLabel;
    }

    public void setId_equipo_JLabel(JLabel id_equipo_JLabel) {
        this.id_equipo_JLabel = id_equipo_JLabel;
    }

    public Choice getId_equipo_Choice() {
        return id_equipo_Choice;
    }

    public void setId_equipo_Choice(Choice id_equipo_Choice) {
        this.id_equipo_Choice = id_equipo_Choice;
    }

    public JCalendar getFecha_instalacion_JCalendar() {
        return fecha_instalacion_JCalendar;
    }

    public void setFecha_instalacion_JCalendar(JCalendar fecha_instalacion_JCalendar) {
        this.fecha_instalacion_JCalendar = fecha_instalacion_JCalendar;
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
        id_licencia_Choice.select("Id Licencia");
        id_equipo_Choice.select("Id Equipo");
        fecha_instalacion_JCalendar.setDate(new Date());
    }

    
}
