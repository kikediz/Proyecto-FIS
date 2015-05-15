/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JMenuItem;

/**
 *
 * @author Maximiliano
 */
public class JFrame_Formulario extends javax.swing.JFrame{
    
    /**
     * Creates new form DatosPersona
     */
    public JFrame_Formulario() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/vista/unillanos.png")).getImage());
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("Principal"); // NOI18N
        setSize(new java.awt.Dimension(600, 400));
        
        initMenus();
        initJMenuItem();
        setMenus();
             
        
        panelTabbedPane = new javax.swing.JTabbedPane();
        panelTabbedPane.setBackground(new java.awt.Color(221, 221, 221));
        panelTabbedPane.setAutoscrolls(true);
        panelTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initMenus(){
        jMenubar = new javax.swing.JMenuBar();
        jMenu_Opciones = new javax.swing.JMenu();
        jMenu_Reporte = new javax.swing.JMenu();
        jMenu_Acerca_de = new javax.swing.JMenu();
        jMenu_Opciones = new javax.swing.JMenu();
        jMenu_Reporte = new javax.swing.JMenu();
        jMenu_Sede = new javax.swing.JMenu();
        jMenu_Sala = new javax.swing.JMenu();
        jMenu_Persona = new javax.swing.JMenu();
        jMenu_Rol=new javax.swing.JMenu();
        jMenu_Rol_Agregar = new javax.swing.JMenu();
        jMenu_Licencia = new javax.swing.JMenu();
        jMenu_Asignar_Licencias = new javax.swing.JMenu();
        jMenu_Equipo = new javax.swing.JMenu();
        jMenu_Marca = new javax.swing.JMenu();
        jMenu_Tipo_de_Equipo = new javax.swing.JMenu();
        jMenu_Hacer_Mantenimiento = new javax.swing.JMenu();
        jMenu_Tipo_Mantenimiento = new javax.swing.JMenu();
        jMenu_Prestamos_Equipos= new javax.swing.JMenu();
    }
    private void initJMenuItem(){
        this.jMenuItem_Acerca = new javax.swing.JMenuItem();
        this.jMenuItem_Ayuda = new javax.swing.JMenuItem();
        this.jMenuItem_salir = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Sede = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Sede = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Sede = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Sala = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Sala = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Sala = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Rol = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Rol = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Rol = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Rol_a_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Rol_a_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Rol_a_Persona = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Asignar_Asignar_licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Asignar_Asignar_licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Asignar_Asignar_licencia = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Marca = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Marca = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Marca = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Tipo_de_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Tipo_de_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Tipo_de_Equipo = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Hacer_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Hacer_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Hacer_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Tipo_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Tipo_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Tipo_Mantenimiento = new javax.swing.JMenuItem();
        this.jMenuItem_Agregar_Prestamos_Equipos = new javax.swing.JMenuItem();
        this.jMenuItem_Eliminar_Prestamos_Equipos = new javax.swing.JMenuItem();
        this.jMenuItem_Actualizar_Prestamos_Equipos = new javax.swing.JMenuItem();
        this.jMenuItem_Reporte_General = new javax.swing.JMenuItem();
        this.jMenuItem_Reporte_Especifico = new javax.swing.JMenuItem();
        this.jMenuItem_Reporte_Especializado = new javax.swing.JMenuItem();
    }
    private void setMenus(){
        jMenu_Opciones.setText("Archivo");
        jMenu_Reporte.setText("Reporte");
        jMenu_Acerca_de.setText("Acerca de");
        jMenu_Opciones.setText("Opciones");
        jMenu_Reporte.setText("Reporte");
        jMenu_Sede.setText("Sede");
        jMenu_Sala.setText("Sala");
        jMenu_Persona.setText("Persona");
        jMenu_Rol.setText("Rol");
        jMenu_Rol_Agregar.setText("Rol a persona");
        jMenu_Licencia.setText("Licencia");
        jMenu_Asignar_Licencias.setText("Asignar Licencias");
        jMenu_Equipo.setText("Equipo");
        jMenu_Marca.setText("Marca");
        jMenu_Tipo_de_Equipo.setText("Tipo de Equipo");
        jMenu_Hacer_Mantenimiento.setText("Hacer Mantenimiento");
        jMenu_Tipo_Mantenimiento.setText("Tipo Mantenimiento");
        jMenu_Prestamos_Equipos.setText("Prestamos de Equipos");
        
        jMenu_Opciones.add(jMenu_Sede);
        jMenu_Opciones.add(jMenu_Sala);
        jMenu_Opciones.add(jMenu_Persona);
        jMenu_Persona.add(jMenu_Rol);
        jMenu_Persona.add(jMenu_Rol_Agregar);
        jMenu_Opciones.add(jMenu_Licencia);
        jMenu_Licencia.add(jMenu_Asignar_Licencias);
        jMenu_Opciones.add(jMenu_Equipo);
        jMenu_Equipo.add(jMenu_Marca);
        jMenu_Equipo.add(jMenu_Tipo_de_Equipo);
        jMenu_Equipo.add(jMenu_Hacer_Mantenimiento);
        jMenu_Hacer_Mantenimiento.add(jMenu_Tipo_Mantenimiento);
        jMenu_Opciones.add(jMenu_Prestamos_Equipos);
        
        
                

        jMenuItem_Acerca.setText("Acerca de");
        jMenuItem_Ayuda.setText("Ayuda en contenido");
        jMenuItem_salir.setText("Salir");
        jMenuItem_Agregar_Sede.setText("Agregar Sede");
        jMenuItem_Eliminar_Sede.setText("Eliminar Sede");
        jMenuItem_Actualizar_Sede.setText("Actualizar Sede");
        jMenuItem_Agregar_Sala.setText("Agregar Sala");
        jMenuItem_Eliminar_Sala.setText("Eliminar Sala");
        jMenuItem_Actualizar_Sala.setText("Actualizar Sala");
        jMenuItem_Agregar_Persona.setText("Agregar Persona");
        jMenuItem_Eliminar_Persona.setText("Eliminar Persona");
        jMenuItem_Actualizar_Persona.setText("Actualizar Persona");
        jMenuItem_Agregar_Rol.setText("Agregar Rol");
        jMenuItem_Eliminar_Rol.setText("Eliminar Rol");
        jMenuItem_Actualizar_Rol.setText("Actualizar Rol");
        jMenuItem_Agregar_Rol_a_Persona.setText("Agregar rol a Persona");
        jMenuItem_Eliminar_Rol_a_Persona.setText("Eliminar rol de Persona");
        jMenuItem_Actualizar_Rol_a_Persona.setText("Actualizar rol de Persona");
        jMenuItem_Agregar_Licencia.setText("Agregar Licencia");
        jMenuItem_Eliminar_Licencia.setText("Eliminar Licencia");
        jMenuItem_Actualizar_Licencia.setText("Actualizar Licencia");
        jMenuItem_Agregar_Asignar_Asignar_licencia.setText("Agregar Asignar Asignar_licencia");
        jMenuItem_Eliminar_Asignar_Asignar_licencia.setText("Eliminar Asignar Asignar_licencia");
        jMenuItem_Actualizar_Asignar_Asignar_licencia.setText("Actualizar Asignar Asignar_licencia");
        jMenuItem_Agregar_Equipo.setText("Agregar Equipo");
        jMenuItem_Eliminar_Equipo.setText("Eliminar Equipo");
        jMenuItem_Actualizar_Equipo.setText("Actualizar Equipo");
        jMenuItem_Agregar_Marca.setText("Agregar Marca");
        jMenuItem_Eliminar_Marca.setText("Eliminar Marca");
        jMenuItem_Actualizar_Marca.setText("Actualizar Marca");
        jMenuItem_Agregar_Tipo_de_Equipo.setText("Agregar Tipo de Equipo");
        jMenuItem_Eliminar_Tipo_de_Equipo.setText("Eliminar Tipo de Equipo");
        jMenuItem_Actualizar_Tipo_de_Equipo.setText("Actualizar Tipo de Equipo");
        jMenuItem_Agregar_Hacer_Mantenimiento.setText("Agregar Hacer Mantenimiento");
        jMenuItem_Eliminar_Hacer_Mantenimiento.setText("Eliminar Hacer Mantenimiento");
        jMenuItem_Actualizar_Hacer_Mantenimiento.setText("Actualizar Hacer Mantenimiento");
        jMenuItem_Agregar_Tipo_Mantenimiento.setText("Agregar Tipo Mantenimiento");
        jMenuItem_Eliminar_Tipo_Mantenimiento.setText("Eliminar Tipo Mantenimiento");
        jMenuItem_Actualizar_Tipo_Mantenimiento.setText("Actualizar Tipo Mantenimiento");
        jMenuItem_Agregar_Prestamos_Equipos.setText("Agregar Prestamo Equipo");
        jMenuItem_Eliminar_Prestamos_Equipos.setText("Eliminar Prestamo Equipo");
        jMenuItem_Actualizar_Prestamos_Equipos.setText("Actualizar Prestamo Equipo");
        jMenuItem_Reporte_General.setText("Reporte General");
        jMenuItem_Reporte_Especifico.setText("Reporte Especifo");
        jMenuItem_Reporte_Especializado.setText("Reporte Especializado");
        
        jMenuItem_salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/cerrar.png"))); // NOI18N
        jMenuItem_salir.setText("Salir");
        jMenuItem_salir.setToolTipText("Seleccione esta opción si lo que desea es terminar la ejecucución de este software");
        
        jMenuItem_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/ayuda.png"))); // NOI18N
        jMenuItem_Ayuda.setText("Contenido de ayuda");
        jMenuItem_Ayuda.setToolTipText("En esta opcion podras encontrar una pequeña orientacion de como utilizar el sotware");
        
        jMenuItem_Acerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/informacion.png"))); // NOI18N
        jMenuItem_Acerca.setText("Acerca de");
        jMenuItem_Acerca.setToolTipText("Seleccione esta opción si desea conocer una breve descripcion del software, ademas del creador.");
        
        jMenu_Sede.add( jMenuItem_Agregar_Sede);
        jMenu_Sede.add( jMenuItem_Eliminar_Sede);
        jMenu_Sede.add( jMenuItem_Actualizar_Sede);
        jMenu_Sala.add( jMenuItem_Agregar_Sala);
        jMenu_Sala.add( jMenuItem_Eliminar_Sala);
        jMenu_Sala.add( jMenuItem_Actualizar_Sala);
        jMenu_Persona.add( jMenuItem_Agregar_Persona);
        jMenu_Persona.add( jMenuItem_Eliminar_Persona);
        jMenu_Persona.add( jMenuItem_Actualizar_Persona);
        jMenu_Rol.add( jMenuItem_Agregar_Rol);
        jMenu_Rol.add( jMenuItem_Eliminar_Rol);
        jMenu_Rol.add( jMenuItem_Actualizar_Rol);
        jMenu_Rol_Agregar.add( jMenuItem_Agregar_Rol_a_Persona);
        jMenu_Rol_Agregar.add( jMenuItem_Eliminar_Rol_a_Persona);
        jMenu_Rol_Agregar.add( jMenuItem_Actualizar_Rol_a_Persona);
        jMenu_Licencia.add( jMenuItem_Agregar_Licencia);
        jMenu_Licencia.add( jMenuItem_Eliminar_Licencia);
        jMenu_Licencia.add( jMenuItem_Actualizar_Licencia);
        jMenu_Asignar_Licencias.add( jMenuItem_Agregar_Asignar_Asignar_licencia);
        jMenu_Asignar_Licencias.add( jMenuItem_Eliminar_Asignar_Asignar_licencia);
        jMenu_Asignar_Licencias.add( jMenuItem_Actualizar_Asignar_Asignar_licencia);
        jMenu_Equipo.add( jMenuItem_Agregar_Equipo);
        jMenu_Equipo.add( jMenuItem_Eliminar_Equipo);
        jMenu_Equipo.add( jMenuItem_Actualizar_Equipo);
        jMenu_Marca.add( jMenuItem_Agregar_Marca);
        jMenu_Marca.add( jMenuItem_Eliminar_Marca);
        jMenu_Marca.add( jMenuItem_Actualizar_Marca);
        jMenu_Tipo_de_Equipo.add( jMenuItem_Agregar_Tipo_de_Equipo);
        jMenu_Tipo_de_Equipo.add( jMenuItem_Eliminar_Tipo_de_Equipo);
        jMenu_Tipo_de_Equipo.add( jMenuItem_Actualizar_Tipo_de_Equipo);
        jMenu_Hacer_Mantenimiento.add( jMenuItem_Agregar_Hacer_Mantenimiento);
        jMenu_Hacer_Mantenimiento.add( jMenuItem_Eliminar_Hacer_Mantenimiento);
        jMenu_Hacer_Mantenimiento.add( jMenuItem_Actualizar_Hacer_Mantenimiento);
        jMenu_Tipo_Mantenimiento.add( jMenuItem_Agregar_Tipo_Mantenimiento);
        jMenu_Tipo_Mantenimiento.add( jMenuItem_Eliminar_Tipo_Mantenimiento);
        jMenu_Tipo_Mantenimiento.add( jMenuItem_Actualizar_Tipo_Mantenimiento);
        jMenu_Prestamos_Equipos.add( jMenuItem_Agregar_Prestamos_Equipos);
        jMenu_Prestamos_Equipos.add( jMenuItem_Eliminar_Prestamos_Equipos);
        jMenu_Prestamos_Equipos.add( jMenuItem_Actualizar_Prestamos_Equipos);
        
        jMenu_Opciones.add(jMenuItem_salir);
        jMenu_Reporte.add(jMenuItem_Reporte_General);
        jMenu_Reporte.add(jMenuItem_Reporte_Especifico);
        jMenu_Reporte.add(jMenuItem_Reporte_Especializado);
        
        jMenu_Acerca_de.add(jMenuItem_Ayuda);
        jMenu_Acerca_de.add(jMenuItem_Acerca);
        
        jMenubar.add(jMenu_Opciones);
        jMenubar.add(jMenu_Reporte);
        jMenubar.add(jMenu_Acerca_de);
        setJMenuBar(jMenubar);

    }
    
/**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane panelTabbedPane;
    private javax.swing.JMenuBar jMenubar;
    
    private javax.swing.JMenu jMenu_Opciones;
    private javax.swing.JMenu jMenu_Reporte;
    private javax.swing.JMenu jMenu_Sede;
    private javax.swing.JMenu jMenu_Sala;
    private javax.swing.JMenu jMenu_Persona;
    private javax.swing.JMenu jMenu_Rol;
    private javax.swing.JMenu jMenu_Rol_Agregar;
    private javax.swing.JMenu jMenu_Licencia;
    private javax.swing.JMenu jMenu_Asignar_Licencias;
    private javax.swing.JMenu jMenu_Equipo;
    private javax.swing.JMenu jMenu_Marca;
    private javax.swing.JMenu jMenu_Tipo_de_Equipo;
    private javax.swing.JMenu jMenu_Hacer_Mantenimiento;
    private javax.swing.JMenu jMenu_Tipo_Mantenimiento;
    private javax.swing.JMenu jMenu_Prestamos_Equipos;
    private javax.swing.JMenu jMenu_Acerca_de;
    
    private javax.swing.JMenuItem jMenuItem_Acerca;

    
    private javax.swing.JMenuItem jMenuItem_Ayuda;
    private javax.swing.JMenuItem jMenuItem_salir;
    private javax.swing.JMenuItem jMenuItem_Agregar_Sede;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Sede;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Sede;
    private javax.swing.JMenuItem jMenuItem_Agregar_Sala;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Sala;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Sala;
    private javax.swing.JMenuItem jMenuItem_Agregar_Persona;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Persona;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Persona;
    private javax.swing.JMenuItem jMenuItem_Agregar_Rol;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Rol;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Rol;
    private javax.swing.JMenuItem jMenuItem_Agregar_Rol_a_Persona;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Rol_a_Persona;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Rol_a_Persona;
    private javax.swing.JMenuItem jMenuItem_Agregar_Licencia;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Licencia;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Licencia;
    private javax.swing.JMenuItem jMenuItem_Agregar_Asignar_Asignar_licencia;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Asignar_Asignar_licencia;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Asignar_Asignar_licencia;
    private javax.swing.JMenuItem jMenuItem_Agregar_Equipo;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Equipo;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Equipo;
    private javax.swing.JMenuItem jMenuItem_Agregar_Marca;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Marca;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Marca;
    private javax.swing.JMenuItem jMenuItem_Agregar_Tipo_de_Equipo;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Tipo_de_Equipo;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Tipo_de_Equipo;
    private javax.swing.JMenuItem jMenuItem_Agregar_Hacer_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Hacer_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Hacer_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Agregar_Tipo_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Tipo_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Tipo_Mantenimiento;
    private javax.swing.JMenuItem jMenuItem_Agregar_Prestamos_Equipos;
    private javax.swing.JMenuItem jMenuItem_Eliminar_Prestamos_Equipos;
    private javax.swing.JMenuItem jMenuItem_Actualizar_Prestamos_Equipos;
    private javax.swing.JMenuItem jMenuItem_Reporte_General;
    private javax.swing.JMenuItem jMenuItem_Reporte_Especifico;
    private javax.swing.JMenuItem jMenuItem_Reporte_Especializado;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTabbedPane getPanelTabbedPane() {
        return panelTabbedPane;
    }

    public void setPanelTabbedPane(javax.swing.JTabbedPane panelTabbedPane) {
        this.panelTabbedPane = panelTabbedPane;
    }

    public javax.swing.JMenuItem getjMenuItem_Acerca() {
        return jMenuItem_Acerca;
    }

    public void setjMenuItem_Acerca(javax.swing.JMenuItem jMenuItem_Acerca) {
        this.jMenuItem_Acerca = jMenuItem_Acerca;
    }

    public javax.swing.JMenuItem getjMenuItem_Ayuda() {
        return jMenuItem_Ayuda;
    }

    public void setjMenuItem_Ayuda(javax.swing.JMenuItem jMenuItem_Ayuda) {
        this.jMenuItem_Ayuda = jMenuItem_Ayuda;
    }

    public javax.swing.JMenuItem getjMenuItem_salir() {
        return jMenuItem_salir;
    }

    public void setjMenuItem_salir(javax.swing.JMenuItem jMenuItem_salir) {
        this.jMenuItem_salir = jMenuItem_salir;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Sede() {
        return jMenuItem_Agregar_Sede;
    }

    public void setjMenuItem_Agregar_Sede(javax.swing.JMenuItem jMenuItem_Agregar_Sede) {
        this.jMenuItem_Agregar_Sede = jMenuItem_Agregar_Sede;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Sede() {
        return jMenuItem_Eliminar_Sede;
    }

    public void setjMenuItem_Eliminar_Sede(javax.swing.JMenuItem jMenuItem_Eliminar_Sede) {
        this.jMenuItem_Eliminar_Sede = jMenuItem_Eliminar_Sede;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Sede() {
        return jMenuItem_Actualizar_Sede;
    }

    public void setjMenuItem_Actualizar_Sede(javax.swing.JMenuItem jMenuItem_Actualizar_Sede) {
        this.jMenuItem_Actualizar_Sede = jMenuItem_Actualizar_Sede;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Sala() {
        return jMenuItem_Agregar_Sala;
    }

    public void setjMenuItem_Agregar_Sala(javax.swing.JMenuItem jMenuItem_Agregar_Sala) {
        this.jMenuItem_Agregar_Sala = jMenuItem_Agregar_Sala;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Sala() {
        return jMenuItem_Eliminar_Sala;
    }

    public void setjMenuItem_Eliminar_Sala(javax.swing.JMenuItem jMenuItem_Eliminar_Sala) {
        this.jMenuItem_Eliminar_Sala = jMenuItem_Eliminar_Sala;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Sala() {
        return jMenuItem_Actualizar_Sala;
    }

    public void setjMenuItem_Actualizar_Sala(javax.swing.JMenuItem jMenuItem_Actualizar_Sala) {
        this.jMenuItem_Actualizar_Sala = jMenuItem_Actualizar_Sala;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Persona() {
        return jMenuItem_Agregar_Persona;
    }

    public void setjMenuItem_Agregar_Persona(javax.swing.JMenuItem jMenuItem_Agregar_Persona) {
        this.jMenuItem_Agregar_Persona = jMenuItem_Agregar_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Persona() {
        return jMenuItem_Eliminar_Persona;
    }

    public void setjMenuItem_Eliminar_Persona(javax.swing.JMenuItem jMenuItem_Eliminar_Persona) {
        this.jMenuItem_Eliminar_Persona = jMenuItem_Eliminar_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Persona() {
        return jMenuItem_Actualizar_Persona;
    }

    public void setjMenuItem_Actualizar_Persona(javax.swing.JMenuItem jMenuItem_Actualizar_Persona) {
        this.jMenuItem_Actualizar_Persona = jMenuItem_Actualizar_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Rol() {
        return jMenuItem_Agregar_Rol;
    }

    public void setjMenuItem_Agregar_Rol(javax.swing.JMenuItem jMenuItem_Agregar_Rol) {
        this.jMenuItem_Agregar_Rol = jMenuItem_Agregar_Rol;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Rol() {
        return jMenuItem_Eliminar_Rol;
    }

    public void setjMenuItem_Eliminar_Rol(javax.swing.JMenuItem jMenuItem_Eliminar_Rol) {
        this.jMenuItem_Eliminar_Rol = jMenuItem_Eliminar_Rol;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Rol() {
        return jMenuItem_Actualizar_Rol;
    }

    public void setjMenuItem_Actualizar_Rol(javax.swing.JMenuItem jMenuItem_Actualizar_Rol) {
        this.jMenuItem_Actualizar_Rol = jMenuItem_Actualizar_Rol;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Rol_a_Persona() {
        return jMenuItem_Agregar_Rol_a_Persona;
    }

    public void setjMenuItem_Agregar_Rol_a_Persona(javax.swing.JMenuItem jMenuItem_Agregar_Rol_a_Persona) {
        this.jMenuItem_Agregar_Rol_a_Persona = jMenuItem_Agregar_Rol_a_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Rol_a_Persona() {
        return jMenuItem_Eliminar_Rol_a_Persona;
    }

    public void setjMenuItem_Eliminar_Rol_a_Persona(javax.swing.JMenuItem jMenuItem_Eliminar_Rol_a_Persona) {
        this.jMenuItem_Eliminar_Rol_a_Persona = jMenuItem_Eliminar_Rol_a_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Rol_a_Persona() {
        return jMenuItem_Actualizar_Rol_a_Persona;
    }

    public void setjMenuItem_Actualizar_Rol_a_Persona(javax.swing.JMenuItem jMenuItem_Actualizar_Rol_a_Persona) {
        this.jMenuItem_Actualizar_Rol_a_Persona = jMenuItem_Actualizar_Rol_a_Persona;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Licencia() {
        return jMenuItem_Agregar_Licencia;
    }

    public void setjMenuItem_Agregar_Licencia(javax.swing.JMenuItem jMenuItem_Agregar_Licencia) {
        this.jMenuItem_Agregar_Licencia = jMenuItem_Agregar_Licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Licencia() {
        return jMenuItem_Eliminar_Licencia;
    }

    public void setjMenuItem_Eliminar_Licencia(javax.swing.JMenuItem jMenuItem_Eliminar_Licencia) {
        this.jMenuItem_Eliminar_Licencia = jMenuItem_Eliminar_Licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Licencia() {
        return jMenuItem_Actualizar_Licencia;
    }

    public void setjMenuItem_Actualizar_Licencia(javax.swing.JMenuItem jMenuItem_Actualizar_Licencia) {
        this.jMenuItem_Actualizar_Licencia = jMenuItem_Actualizar_Licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Asignar_Asignar_licencia() {
        return jMenuItem_Agregar_Asignar_Asignar_licencia;
    }

    public void setjMenuItem_Agregar_Asignar_Asignar_licencia(javax.swing.JMenuItem jMenuItem_Agregar_Asignar_Asignar_licencia) {
        this.jMenuItem_Agregar_Asignar_Asignar_licencia = jMenuItem_Agregar_Asignar_Asignar_licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Asignar_Asignar_licencia() {
        return jMenuItem_Eliminar_Asignar_Asignar_licencia;
    }

    public void setjMenuItem_Eliminar_Asignar_Asignar_licencia(javax.swing.JMenuItem jMenuItem_Eliminar_Asignar_Asignar_licencia) {
        this.jMenuItem_Eliminar_Asignar_Asignar_licencia = jMenuItem_Eliminar_Asignar_Asignar_licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Asignar_Asignar_licencia() {
        return jMenuItem_Actualizar_Asignar_Asignar_licencia;
    }

    public void setjMenuItem_Actualizar_Asignar_Asignar_licencia(javax.swing.JMenuItem jMenuItem_Actualizar_Asignar_Asignar_licencia) {
        this.jMenuItem_Actualizar_Asignar_Asignar_licencia = jMenuItem_Actualizar_Asignar_Asignar_licencia;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Equipo() {
        return jMenuItem_Agregar_Equipo;
    }

    public void setjMenuItem_Agregar_Equipo(javax.swing.JMenuItem jMenuItem_Agregar_Equipo) {
        this.jMenuItem_Agregar_Equipo = jMenuItem_Agregar_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Equipo() {
        return jMenuItem_Eliminar_Equipo;
    }

    public void setjMenuItem_Eliminar_Equipo(javax.swing.JMenuItem jMenuItem_Eliminar_Equipo) {
        this.jMenuItem_Eliminar_Equipo = jMenuItem_Eliminar_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Equipo() {
        return jMenuItem_Actualizar_Equipo;
    }

    public void setjMenuItem_Actualizar_Equipo(javax.swing.JMenuItem jMenuItem_Actualizar_Equipo) {
        this.jMenuItem_Actualizar_Equipo = jMenuItem_Actualizar_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Marca() {
        return jMenuItem_Agregar_Marca;
    }

    public void setjMenuItem_Agregar_Marca(javax.swing.JMenuItem jMenuItem_Agregar_Marca) {
        this.jMenuItem_Agregar_Marca = jMenuItem_Agregar_Marca;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Marca() {
        return jMenuItem_Eliminar_Marca;
    }

    public void setjMenuItem_Eliminar_Marca(javax.swing.JMenuItem jMenuItem_Eliminar_Marca) {
        this.jMenuItem_Eliminar_Marca = jMenuItem_Eliminar_Marca;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Marca() {
        return jMenuItem_Actualizar_Marca;
    }

    public void setjMenuItem_Actualizar_Marca(javax.swing.JMenuItem jMenuItem_Actualizar_Marca) {
        this.jMenuItem_Actualizar_Marca = jMenuItem_Actualizar_Marca;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Tipo_de_Equipo() {
        return jMenuItem_Agregar_Tipo_de_Equipo;
    }

    public void setjMenuItem_Agregar_Tipo_de_Equipo(javax.swing.JMenuItem jMenuItem_Agregar_Tipo_de_Equipo) {
        this.jMenuItem_Agregar_Tipo_de_Equipo = jMenuItem_Agregar_Tipo_de_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Tipo_de_Equipo() {
        return jMenuItem_Eliminar_Tipo_de_Equipo;
    }

    public void setjMenuItem_Eliminar_Tipo_de_Equipo(javax.swing.JMenuItem jMenuItem_Eliminar_Tipo_de_Equipo) {
        this.jMenuItem_Eliminar_Tipo_de_Equipo = jMenuItem_Eliminar_Tipo_de_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Tipo_de_Equipo() {
        return jMenuItem_Actualizar_Tipo_de_Equipo;
    }

    public void setjMenuItem_Actualizar_Tipo_de_Equipo(javax.swing.JMenuItem jMenuItem_Actualizar_Tipo_de_Equipo) {
        this.jMenuItem_Actualizar_Tipo_de_Equipo = jMenuItem_Actualizar_Tipo_de_Equipo;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Hacer_Mantenimiento() {
        return jMenuItem_Agregar_Hacer_Mantenimiento;
    }

    public void setjMenuItem_Agregar_Hacer_Mantenimiento(javax.swing.JMenuItem jMenuItem_Agregar_Hacer_Mantenimiento) {
        this.jMenuItem_Agregar_Hacer_Mantenimiento = jMenuItem_Agregar_Hacer_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Hacer_Mantenimiento() {
        return jMenuItem_Eliminar_Hacer_Mantenimiento;
    }

    public void setjMenuItem_Eliminar_Hacer_Mantenimiento(javax.swing.JMenuItem jMenuItem_Eliminar_Hacer_Mantenimiento) {
        this.jMenuItem_Eliminar_Hacer_Mantenimiento = jMenuItem_Eliminar_Hacer_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Hacer_Mantenimiento() {
        return jMenuItem_Actualizar_Hacer_Mantenimiento;
    }

    public void setjMenuItem_Actualizar_Hacer_Mantenimiento(javax.swing.JMenuItem jMenuItem_Actualizar_Hacer_Mantenimiento) {
        this.jMenuItem_Actualizar_Hacer_Mantenimiento = jMenuItem_Actualizar_Hacer_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Tipo_Mantenimiento() {
        return jMenuItem_Agregar_Tipo_Mantenimiento;
    }

    public void setjMenuItem_Agregar_Tipo_Mantenimiento(javax.swing.JMenuItem jMenuItem_Agregar_Tipo_Mantenimiento) {
        this.jMenuItem_Agregar_Tipo_Mantenimiento = jMenuItem_Agregar_Tipo_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Tipo_Mantenimiento() {
        return jMenuItem_Eliminar_Tipo_Mantenimiento;
    }

    public void setjMenuItem_Eliminar_Tipo_Mantenimiento(javax.swing.JMenuItem jMenuItem_Eliminar_Tipo_Mantenimiento) {
        this.jMenuItem_Eliminar_Tipo_Mantenimiento = jMenuItem_Eliminar_Tipo_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Tipo_Mantenimiento() {
        return jMenuItem_Actualizar_Tipo_Mantenimiento;
    }

    public void setjMenuItem_Actualizar_Tipo_Mantenimiento(javax.swing.JMenuItem jMenuItem_Actualizar_Tipo_Mantenimiento) {
        this.jMenuItem_Actualizar_Tipo_Mantenimiento = jMenuItem_Actualizar_Tipo_Mantenimiento;
    }

    public javax.swing.JMenuItem getjMenuItem_Agregar_Prestamos_Equipos() {
        return jMenuItem_Agregar_Prestamos_Equipos;
    }

    public void setjMenuItem_Agregar_Prestamos_Equipos(javax.swing.JMenuItem jMenuItem_Agregar_Prestamos_Equipos) {
        this.jMenuItem_Agregar_Prestamos_Equipos = jMenuItem_Agregar_Prestamos_Equipos;
    }

    public javax.swing.JMenuItem getjMenuItem_Eliminar_Prestamos_Equipos() {
        return jMenuItem_Eliminar_Prestamos_Equipos;
    }

    public void setjMenuItem_Eliminar_Prestamos_Equipos(javax.swing.JMenuItem jMenuItem_Eliminar_Prestamos_Equipos) {
        this.jMenuItem_Eliminar_Prestamos_Equipos = jMenuItem_Eliminar_Prestamos_Equipos;
    }

    public javax.swing.JMenuItem getjMenuItem_Actualizar_Prestamos_Equipos() {
        return jMenuItem_Actualizar_Prestamos_Equipos;
    }

    public void setjMenuItem_Actualizar_Prestamos_Equipos(javax.swing.JMenuItem jMenuItem_Actualizar_Prestamos_Equipos) {
        this.jMenuItem_Actualizar_Prestamos_Equipos = jMenuItem_Actualizar_Prestamos_Equipos;
    }

    public javax.swing.JMenuItem getjMenuItem_Reporte_General() {
        return jMenuItem_Reporte_General;
    }

    public void setjMenuItem_Reporte_General(javax.swing.JMenuItem jMenuItem_Reporte_General) {
        this.jMenuItem_Reporte_General = jMenuItem_Reporte_General;
    }

    public javax.swing.JMenuItem getjMenuItem_Reporte_Especifico() {
        return jMenuItem_Reporte_Especifico;
    }

    public void setjMenuItem_Reporte_Especifico(javax.swing.JMenuItem jMenuItem_Reporte_Especifico) {
        this.jMenuItem_Reporte_Especifico = jMenuItem_Reporte_Especifico;
    }

    public javax.swing.JMenuItem getjMenuItem_Reporte_Especializado() {
        return jMenuItem_Reporte_Especializado;
    }

    public void setjMenuItem_Reporte_Especializado(javax.swing.JMenuItem jMenuItem_Reporte_Especializado) {
        this.jMenuItem_Reporte_Especializado = jMenuItem_Reporte_Especializado;
    }
}
