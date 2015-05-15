/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Choice;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.freixas.jcalendar.JCalendar;

/**
 *
 * @author morte
 */
public class JPanel_Agregar_Mantenimiento_a_Equipo extends JPanel implements Panels{
    
    private org.freixas.jcalendar.JCalendar fecha_mantenimiento_JCalendar;
    private javax.swing.JLabel id_equipo_JLabel;
    private java.awt.Choice id_equipo_Choice;
    private javax.swing.JLabel id_mantenimiento_JLabel;
    private java.awt.Choice id_mantenimiento_Choice;
    private javax.swing.JTextArea motivo_mantenimiento_JTextArea;
    private javax.swing.JButton agregar_JButton;
    private javax.swing.JButton limpiarJButton;
    private javax.swing.JLabel exito;
    
    private javax.swing.border.Border etchedBorder;
    private javax.swing.border.Border emptyBorder;
    private javax.swing.border.Border compoundBorder;
    
    public JPanel_Agregar_Mantenimiento_a_Equipo(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        fecha_mantenimiento_JCalendar = new org.freixas.jcalendar.JCalendar(org.freixas.jcalendar.JCalendar.DISPLAY_DATE | org.freixas.jcalendar.JCalendar.DISPLAY_TIME,true);
        id_equipo_JLabel = new javax.swing.JLabel();
        id_equipo_Choice = new java.awt.Choice();
        id_mantenimiento_JLabel = new javax.swing.JLabel();
        id_mantenimiento_Choice = new java.awt.Choice();
        motivo_mantenimiento_JTextArea = new javax.swing.JTextArea();
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
        fecha_mantenimiento_JCalendar.setTitleFont(new java.awt.Font("Serif", java.awt.Font.BOLD|java.awt.Font.ITALIC, 24));
        fecha_mantenimiento_JCalendar.setDayOfWeekFont(new java.awt.Font("SansSerif", java.awt.Font.ITALIC, 12));
        fecha_mantenimiento_JCalendar.setDayFont(new java.awt.Font("Dustismo", java.awt.Font.BOLD, 16));
        fecha_mantenimiento_JCalendar.setTimeFont(new java.awt.Font("DialogInput", java.awt.Font.PLAIN, 10));
        fecha_mantenimiento_JCalendar.setTodayFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 14));
        fecha_mantenimiento_JCalendar.setBorder(compoundBorder);
        add(fecha_mantenimiento_JCalendar, new GBConstraints(0, 0, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
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
        
        id_mantenimiento_JLabel.setFont(new java.awt.Font("Dustismo", 1, 32)); // NOI18N
        id_mantenimiento_JLabel.setForeground(new java.awt.Color(0, 0, 0));
        id_mantenimiento_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_mantenimiento_JLabel.setText("Nombre");
        add(id_mantenimiento_JLabel, new GBConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        id_mantenimiento_Choice.setBackground(new java.awt.Color(240, 240, 240));
        id_mantenimiento_Choice.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //id_equipo_Choice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_mantenimiento_Choice.add("Id Mantenimiento");
        add(id_mantenimiento_Choice, new GBConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        motivo_mantenimiento_JTextArea.setBackground(new java.awt.Color(240, 240, 240));
        motivo_mantenimiento_JTextArea.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 30)); // NOI18N
        //motivo_mantenimiento_JTextArea.setHorizontalAlignment(javax.swing.JTextArea.CENTER);
        motivo_mantenimiento_JTextArea.setToolTipText("Introduzca el nombre de la persona que desea actualizar");
        add(motivo_mantenimiento_JTextArea, new GBConstraints(0, 3, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        exito.setFont(new java.awt.Font("Dustismo", 1, 26)); // NOI18N
        exito.setForeground(new java.awt.Color(0, 0, 0));
        exito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exito.setText("");
        add(exito, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(0, 0, 0, 0), 0, 0));
        
        agregar_JButton.setBackground(new java.awt.Color(230, 230, 230));
        agregar_JButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        agregar_JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        agregar_JButton.setText("Registrar");
        agregar_JButton.setToolTipText("Pulse cuando haya acabado de llenar el formulario");
        agregar_JButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        agregar_JButton.setContentAreaFilled(true);
        agregar_JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(agregar_JButton, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
        
        limpiarJButton.setBackground(new java.awt.Color(230, 230, 230));
        limpiarJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 32)); // NOI18N
        //limpiarJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/agregar.png"))); // NOI18N
        limpiarJButton.setText("Limpiar");
        limpiarJButton.setToolTipText("Pulse para limpiar todos los campos");
        limpiarJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        limpiarJButton.setContentAreaFilled(true);
        limpiarJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(limpiarJButton, new GBConstraints(0, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, 0, new java.awt.Insets(32, 27, 36, 26), 0, 0));
    }
    
    public JCalendar getFecha_mantenimiento_JCalendar() {
        return fecha_mantenimiento_JCalendar;
    }

    public void setFecha_mantenimiento_JCalendar(JCalendar fecha_mantenimiento_JCalendar) {
        this.fecha_mantenimiento_JCalendar = fecha_mantenimiento_JCalendar;
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

    public JLabel getId_mantenimiento_JLabel() {
        return id_mantenimiento_JLabel;
    }

    public void setId_mantenimiento_JLabel(JLabel id_mantenimiento_JLabel) {
        this.id_mantenimiento_JLabel = id_mantenimiento_JLabel;
    }

    public Choice getId_mantenimiento_Choice() {
        return id_mantenimiento_Choice;
    }

    public void setId_mantenimiento_Choice(Choice id_mantenimiento_Choice) {
        this.id_mantenimiento_Choice = id_mantenimiento_Choice;
    }

    public JTextArea getMotivo_mantenimiento_JTextArea() {
        return motivo_mantenimiento_JTextArea;
    }

    public void setMotivo_mantenimiento_JTextArea(JTextArea motivo_mantenimiento_JTextArea) {
        this.motivo_mantenimiento_JTextArea = motivo_mantenimiento_JTextArea;
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
        id_equipo_Choice.select("Id Equipo");
        id_mantenimiento_Choice.select("Id Equipo");
        motivo_mantenimiento_JTextArea.setText("");
    }
}
