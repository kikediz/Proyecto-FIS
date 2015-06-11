/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.reporte;

import java.awt.GridBagConstraints;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.GBConstraints;
import vista.Panels;

/**
 *
 * @author maximiliano
 */
public class JPanel_Reporte extends javax.swing.JPanel implements Panels{
    private JRadioButton administraJRadioButton;
    private JRadioButton equipoJRadioButton;
    private JRadioButton equipo_mantenimientoJRadioButton;
    private JRadioButton licenciaJRadioButton;
    private JRadioButton licencia_equipoJRadioButton;
    private JRadioButton mantenimientoJRadioButton;
    private JRadioButton marcaJRadioButton;
    private JRadioButton prestamo_equipoJRadioButton;
    private JRadioButton tipo_equipoJRadioButton;
    
    private ButtonGroup GrupoButton;
    
    private JButton ReporteJButton;
    
    private javax.swing.table.DefaultTableModel dtm;
    private javax.swing.JTable jTable;
    private javax.swing.JScrollPane jsp;
    private String columnas[];
    
    public JPanel_Reporte(){
        initComponents();
        construir();
    }
    
    private void initComponents(){
        administraJRadioButton = new JRadioButton();
        equipoJRadioButton = new JRadioButton();
        equipo_mantenimientoJRadioButton = new JRadioButton();
        licenciaJRadioButton = new JRadioButton();
        licencia_equipoJRadioButton = new JRadioButton();
        mantenimientoJRadioButton = new JRadioButton();
        marcaJRadioButton = new JRadioButton();
        prestamo_equipoJRadioButton = new JRadioButton();
        tipo_equipoJRadioButton = new JRadioButton();
        
        GrupoButton = new ButtonGroup();
        
        ReporteJButton = new JButton();
        
        dtm = new DefaultTableModel(null,columnas);
        jTable = new JTable(dtm);
        jsp = new JScrollPane(jTable);
        construir();
        
    }
    private void construir(){
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.GridBagLayout());
        
        administraJRadioButton.setText("Administradores");
        equipoJRadioButton.setText("Equipos");
        equipo_mantenimientoJRadioButton.setText("Mantenimiento a equipo");
        licenciaJRadioButton.setText("Licencias");
        licencia_equipoJRadioButton.setText("Licencia a Equipo");
        mantenimientoJRadioButton.setText("Mantenimientos");
        marcaJRadioButton.setText("Marca de equipos");
        prestamo_equipoJRadioButton.setText("Prestamos de equipos");
        tipo_equipoJRadioButton.setText("Tipos de equipo");
        
        add(administraJRadioButton, new GBConstraints(0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(equipoJRadioButton, new GBConstraints(0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(equipo_mantenimientoJRadioButton, new GBConstraints(1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(licenciaJRadioButton, new GBConstraints(1, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(licencia_equipoJRadioButton, new GBConstraints(2, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(mantenimientoJRadioButton, new GBConstraints(2, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(marcaJRadioButton, new GBConstraints(3, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(prestamo_equipoJRadioButton, new GBConstraints(3, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        add(tipo_equipoJRadioButton, new GBConstraints(4, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
        
        ReporteJButton.setBackground(new java.awt.Color(230, 230, 230));
        ReporteJButton.setFont(new java.awt.Font("DejaVu Sans Mono", 1, 26)); // NOI18N
        ReporteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/informacion.png"))); // NOI18N
        ReporteJButton.setText("Ver Reporte");
        ReporteJButton.setToolTipText("Pulse para generar el reporte");
        ReporteJButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), java.awt.Color.lightGray, java.awt.Color.lightGray)));
        ReporteJButton.setContentAreaFilled(true);
        ReporteJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(ReporteJButton, new GBConstraints(4, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.CENTER, new java.awt.Insets(25, 25, 25, 25), 0, 0));
        
        GrupoButton.add(administraJRadioButton);
        GrupoButton.add(equipoJRadioButton);
        GrupoButton.add(equipo_mantenimientoJRadioButton);
        GrupoButton.add(licenciaJRadioButton);
        GrupoButton.add(licencia_equipoJRadioButton);
        GrupoButton.add(mantenimientoJRadioButton);
        GrupoButton.add(marcaJRadioButton);
        GrupoButton.add(prestamo_equipoJRadioButton);
        GrupoButton.add(tipo_equipoJRadioButton);
        
        add(jsp, new GBConstraints(0, 2, 5, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new java.awt.Insets(5, 5, 5, 5), 0, 0));
    }
    public void setFila(Object fila[]){
        dtm.addRow(fila);
    }
    
    public void removeFila(){
        int i=0;
        while(dtm.getRowCount()>0){
        
        dtm.removeRow(dtm.getRowCount()-1);
        }
    }

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public JRadioButton getAdministraJRadioButton() {
        return administraJRadioButton;
    }

    public void setAdministraJRadioButton(JRadioButton administraJRadioButton) {
        this.administraJRadioButton = administraJRadioButton;
    }

    public JRadioButton getEquipoJRadioButton() {
        return equipoJRadioButton;
    }

    public void setEquipoJRadioButton(JRadioButton equipoJRadioButton) {
        this.equipoJRadioButton = equipoJRadioButton;
    }

    public JRadioButton getEquipo_mantenimientoJRadioButton() {
        return equipo_mantenimientoJRadioButton;
    }

    public void setEquipo_mantenimientoJRadioButton(JRadioButton equipo_mantenimientoJRadioButton) {
        this.equipo_mantenimientoJRadioButton = equipo_mantenimientoJRadioButton;
    }

    public JRadioButton getLicenciaJRadioButton() {
        return licenciaJRadioButton;
    }

    public void setLicenciaJRadioButton(JRadioButton licenciaJRadioButton) {
        this.licenciaJRadioButton = licenciaJRadioButton;
    }

    public JRadioButton getLicencia_equipoJRadioButton() {
        return licencia_equipoJRadioButton;
    }

    public void setLicencia_equipoJRadioButton(JRadioButton licencia_equipoJRadioButton) {
        this.licencia_equipoJRadioButton = licencia_equipoJRadioButton;
    }

    public JRadioButton getMantenimientoJRadioButton() {
        return mantenimientoJRadioButton;
    }

    public void setMantenimientoJRadioButton(JRadioButton mantenimientoJRadioButton) {
        this.mantenimientoJRadioButton = mantenimientoJRadioButton;
    }

    public JRadioButton getMarcaJRadioButton() {
        return marcaJRadioButton;
    }

    public void setMarcaJRadioButton(JRadioButton marcaJRadioButton) {
        this.marcaJRadioButton = marcaJRadioButton;
    }

    public JRadioButton getPrestamo_equipoJRadioButton() {
        return prestamo_equipoJRadioButton;
    }

    public void setPrestamo_equipoJRadioButton(JRadioButton prestamo_equipoJRadioButton) {
        this.prestamo_equipoJRadioButton = prestamo_equipoJRadioButton;
    }

    public JRadioButton getTipo_equipoJRadioButton() {
        return tipo_equipoJRadioButton;
    }

    public void setTipo_equipoJRadioButton(JRadioButton tipo_equipoJRadioButton) {
        this.tipo_equipoJRadioButton = tipo_equipoJRadioButton;
    }

    public JButton getReporteJButton() {
        return ReporteJButton;
    }

    public void setReporteJButton(JButton ReporteJButton) {
        this.ReporteJButton = ReporteJButton;
    }

    public DefaultTableModel getDtm() {
        return dtm;
    }

    public void setDtm(DefaultTableModel dtm) {
        this.dtm = dtm;
    }

    public String[] getColumnas() {
        return columnas;
    }

    public void setColumnas(String[] columnas) {
        this.columnas = columnas;
    }
}
