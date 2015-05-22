/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.rol_persona;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.freixas.jcalendar.JCalendar;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author morte
 */
public class JPanel_Agregar_Rol_a_Persona extends JPanel implements Panels{

    private javax.swing.JLabel fecha_inicio_JLabel;
    private org.freixas.jcalendar.JCalendar fecha_inicio_JCalendar;
    private javax.swing.JLabel fecha_finalizacion_JLabel;
    private org.freixas.jcalendar.JCalendar fecha_finalizacion_JCalendar;
    private java.awt.Choice id_persona_Choice;
    private java.awt.Choice id_rol_Choice;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    private javax.swing.border.Border etchedBorder;
    private javax.swing.border.Border emptyBorder;
    private javax.swing.border.Border compoundBorder;
    
    public JPanel_Agregar_Rol_a_Persona(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        fecha_inicio_JLabel = new javax.swing.JLabel();
        fecha_inicio_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
        fecha_finalizacion_JLabel = new javax.swing.JLabel();
        fecha_finalizacion_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
        id_persona_Choice = new java.awt.Choice();
        id_rol_Choice = new java.awt.Choice();
        agregar_JButton = new javax.swing.JButton();
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
        
        fecha_inicio_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        fecha_inicio_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        fecha_inicio_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_inicio_JLabel.setText("Cedula");
        add(fecha_inicio_JLabel, new GBConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        fecha_inicio_JCalendar.setTitleFont(new java.awt.Font("Serif", java.awt.Font.BOLD|java.awt.Font.ITALIC, 24));
        fecha_inicio_JCalendar.setDayOfWeekFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 12));
        fecha_inicio_JCalendar.setDayFont(new java.awt.Font("Dustismo", java.awt.Font.BOLD, 16));
        fecha_inicio_JCalendar.setTimeFont(new java.awt.Font("DialogInput", java.awt.Font.PLAIN, 10));
        fecha_inicio_JCalendar.setTodayFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        fecha_inicio_JCalendar.setBorder(compoundBorder);
        add(fecha_inicio_JCalendar, new GBConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        fecha_finalizacion_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        fecha_finalizacion_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        fecha_finalizacion_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_finalizacion_JLabel.setText("Cedula");
        add(fecha_finalizacion_JLabel, new GBConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        fecha_finalizacion_JCalendar.setTitleFont(new java.awt.Font("Serif", java.awt.Font.BOLD|java.awt.Font.ITALIC, 24));
        fecha_finalizacion_JCalendar.setDayOfWeekFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 12));
        fecha_finalizacion_JCalendar.setDayFont(new java.awt.Font("Dustismo", java.awt.Font.BOLD, 16));
        fecha_finalizacion_JCalendar.setTimeFont(new java.awt.Font("DialogInput", java.awt.Font.PLAIN, 10));
        fecha_finalizacion_JCalendar.setTodayFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        fecha_finalizacion_JCalendar.setBorder(compoundBorder);
        add(fecha_finalizacion_JCalendar, new GBConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_persona_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_persona_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_licencia_Choice.setHorizontalAlignment(java.awt.Choice.CENTER_ALIGNMENT);
        id_persona_Choice.add("Id Persona");
        add(id_persona_Choice, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_rol_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_rol_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_licencia_Choice.setHorizontalAlignment(java.awt.Choice.CENTER_ALIGNMENT);
        id_rol_Choice.add("Id Rol");
        add(id_rol_Choice, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 4, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        agregar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        agregar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        agregar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/actualizar.png"))); // NOI18N
        agregar_JButton.setText("Actualizar");
        agregar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        agregar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        agregar_JButton.setContentAreaFilled(true);
        agregar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(agregar_JButton, new GBConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
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

    
    public JLabel getFecha_inicio_JLabel() {
        return fecha_inicio_JLabel;
    }

    public void setFecha_inicio_JLabel(JLabel fecha_inicio_JLabel) {
        this.fecha_inicio_JLabel = fecha_inicio_JLabel;
    }

    public JCalendar getFecha_inicio_JCalendar() {
        return fecha_inicio_JCalendar;
    }

    public void setFecha_inicio_JCalendar(JCalendar fecha_inicio_JCalendar) {
        this.fecha_inicio_JCalendar = fecha_inicio_JCalendar;
    }

    public JLabel getFecha_finalizacion_JLabel() {
        return fecha_finalizacion_JLabel;
    }

    public void setFecha_finalizacion_JLabel(JLabel fecha_finalizacion_JLabel) {
        this.fecha_finalizacion_JLabel = fecha_finalizacion_JLabel;
    }

    public JCalendar getFecha_finalizacion_JCalendar() {
        return fecha_finalizacion_JCalendar;
    }

    public void setFecha_finalizacion_JCalendar(JCalendar fecha_finalizacion_JCalendar) {
        this.fecha_finalizacion_JCalendar = fecha_finalizacion_JCalendar;
    }

    public Choice getId_persona_Choice() {
        return id_persona_Choice;
    }

    public void setId_persona_Choice(Choice id_persona_Choice) {
        this.id_persona_Choice = id_persona_Choice;
    }

    public Choice getId_rol_Choice() {
        return id_rol_Choice;
    }

    public void setId_rol_Choice(Choice id_rol_Choice) {
        this.id_rol_Choice = id_rol_Choice;
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
        fecha_inicio_JCalendar.setDate(new Date());
        fecha_finalizacion_JCalendar.setDate(new Date());
        id_persona_Choice.select("Id Persona");
        id_rol_Choice.select("Id Rol");
    }
}
