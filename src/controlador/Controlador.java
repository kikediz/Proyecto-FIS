/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.login.LoginDAO;
import modelo.login.Login;
import modelo.login.LoginDTO;
import modelo.licencia.LicenciaDAO;
import modelo.licencia.Licencia;
import modelo.licencia.LicenciaDTO;
import modelo.equipo.EquipoDTO;
import modelo.equipo.EquipoDAO;
import modelo.equipo.Equipo;
import modelo.licencia_equipo.Licencia_EquipoDAO;
import modelo.licencia_equipo.Licencia_EquipoDTO;
import modelo.licencia_equipo.Licencia_Equipo;
import modelo.mantenimiento.MantenimientoDTO;
import modelo.mantenimiento.Mantenimiento;
import modelo.mantenimiento.MantenimientoDAO;
import modelo.equipo_mantenimiento.Equipo_Mantenimiento;
import modelo.equipo_mantenimiento.Equipo_MantenimientoDAO;
import modelo.equipo_mantenimiento.Equipo_MantenimientoDTO;
import modelo.persona.PersonaDAO;
import modelo.persona.PersonaDTO;
import modelo.persona.Persona;
import modelo.marca.MarcaDTO;
import modelo.marca.MarcaDAO;
import modelo.marca.Marca;
import modelo.rol.RolDTO;
import modelo.rol.Rol;
import modelo.rol.RolDAO;
import modelo.rol_persona.Rol_PersonaDTO;
import modelo.rol_persona.Rol_Persona;
import modelo.rol_persona.Rol_PersonaDAO;
import modelo.sala.SalaDAO;
import modelo.sala.Sala;
import modelo.sala.SalaDTO;
import modelo.sede.Sede;
import modelo.sede.SedeDTO;
import modelo.sede.SedeDAO;
import modelo.tipo_equipo.Tipo_Equipo;
import modelo.tipo_equipo.Tipo_EquipoDTO;
import modelo.tipo_equipo.Tipo_EquipoDAO;
import modelo.administra.Administra;
import modelo.administra.AdministraDTO;
import modelo.administra.AdministraDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.JFrame_Formulario;
import vista.Agregar_Pestana;
import vista.creditos.JPanel_Acerca_de;
import vista.creditos.JPanel_Ayuda;

import vista.consulta.JPanel_Consulta_Administrador;
import vista.consulta.JPanel_Consulta_Auxiliar;
import vista.consulta.JPanel_Consulta_Especializada;
import vista.consulta.JPanel_Consulta_Monitor;

import vista.JPanel_Login;
import vista.prestamo.JPanel_Prestar_Equipo;
import vista.reporte.JPanel_Reporte;
import vista.consulta.JPanel_consultar_Persona;

import vista.administra.JPanel_Actualizar_Administrador;
import vista.equipo.JPanel_Actualizar_Equipo;
import vista.licencia.JPanel_Actualizar_Licencia;
import vista.licencia_equipo.JPanel_Actualizar_Licencia_Equipo;
import vista.mantenimiento.JPanel_Actualizar_Mantenimiento;
import vista.mantenimiento_equipo.JPanel_Actualizar_Mantenimiento_a_Equipo;
import vista.marca.JPanel_Actualizar_Marca_Equipo;
import vista.persona.JPanel_Actualizar_Persona;
import vista.rol.JPanel_Actualizar_Rol;
import vista.rol_persona.JPanel_Actualizar_Rol_a_Persona;
import vista.sala.JPanel_Actualizar_Sala;
import vista.sede.JPanel_Actualizar_Sede;
import vista.tipo_equipo.JPanel_Actualizar_Tipo_Equipo;

import vista.administra.JPanel_Agregar_Administrador;
import vista.equipo.JPanel_Agregar_Equipo;
import vista.licencia.JPanel_Agregar_Licencia;
import vista.licencia_equipo.JPanel_Agregar_Licencia_Equipo;
import vista.mantenimiento.JPanel_Agregar_Mantenimiento;
import vista.mantenimiento_equipo.JPanel_Agregar_Mantenimiento_a_Equipo;
import vista.marca.JPanel_Agregar_Marca_Equipo;
import vista.persona.JPanel_Agregar_Persona;
import vista.rol.JPanel_Agregar_Rol;
import vista.rol_persona.JPanel_Agregar_Rol_a_Persona;
import vista.sala.JPanel_Agregar_Sala;
import vista.sede.JPanel_Agregar_Sede;
import vista.tipo_equipo.JPanel_Agregar_Tipo_Equipo;

import vista.administra.JPanel_Eliminar_Administrador;
import vista.equipo.JPanel_Eliminar_Equipo;
import vista.licencia.JPanel_Eliminar_Licencia;
import vista.licencia_equipo.JPanel_Eliminar_Licencia_Equipo;
import vista.mantenimiento.JPanel_Eliminar_Mantenimiento;
import vista.mantenimiento_equipo.JPanel_Eliminar_Mantenimiento_a_Equipo;
import vista.marca.JPanel_Eliminar_Marca_Equipo;
import vista.persona.JPanel_Eliminar_Persona;
import vista.rol.JPanel_Eliminar_Rol;
import vista.rol_persona.JPanel_Eliminar_Rol_a_Persona;
import vista.sala.JPanel_Eliminar_Sala;
import vista.sede.JPanel_Eliminar_Sede;
import vista.tipo_equipo.JPanel_Eliminar_Tipo_Equipo;


import vista.TabButton;
/**
 *
 * @author Maximiliano
 */
public class Controlador{
    
    private AdministraDTO administraDTO;
    private EquipoDTO equipoDTO;
    private LicenciaDTO licenciaDTO;
    private Licencia_EquipoDTO licencia_EquipoDTO;
    private MantenimientoDTO mantenimientoDTO;
    private Equipo_MantenimientoDTO equipo_MantenimientoDTO;
    private MarcaDTO marcaDTO;
    private PersonaDTO personaDTO;
    private Rol_PersonaDTO rol_PersonaDTO;
    private RolDTO rolDTO;
    private SalaDTO salaDTO;
    private SedeDTO sedeDTO;
    private Tipo_EquipoDTO tipo_EquipoDTO;
    private LoginDTO loginDTO;
    private final JFrame_Formulario formulario;
    private final String title="SIASI";
    
    private JPanel_Acerca_de jPanel_Acerca_de;
    private JPanel_Ayuda jPanel_Ayuda;
    private JPanel_Consulta_Administrador jPanel_Consulta_Administrador;
    private JPanel_Consulta_Auxiliar jPanel_Consulta_Auxiliar;
    private JPanel_Consulta_Especializada jPanel_Consulta_Especializada;
    private JPanel_Consulta_Monitor jPanel_Consulta_Monitor;
    private JPanel_Login jPanel_Login;
    private JPanel_Prestar_Equipo jPanel_Prestar_Equipo;
    private JPanel_Reporte jPanel_Reporte;
    private JPanel_consultar_Persona jPanel_consultar_Persona;
    
    private JPanel_Actualizar_Administrador jPanel_Actualizar_Administrador;
    private JPanel_Actualizar_Equipo jPanel_Actualizar_Equipo;
    private JPanel_Actualizar_Licencia jPanel_Actualizar_Licencia;
    private JPanel_Actualizar_Licencia_Equipo jPanel_Actualizar_Licencia_Equipo;
    private JPanel_Actualizar_Mantenimiento jPanel_Actualizar_Mantenimiento;
    private JPanel_Actualizar_Mantenimiento_a_Equipo jPanel_Actualizar_Mantenimiento_a_Equipo;
    private JPanel_Actualizar_Marca_Equipo jPanel_Actualizar_Marca_Equipo;
    private JPanel_Actualizar_Persona jPanel_Actualizar_Persona;
    private JPanel_Actualizar_Rol jPanel_Actualizar_Rol;
    private JPanel_Actualizar_Rol_a_Persona jPanel_Actualizar_Rol_a_Persona;
    private JPanel_Actualizar_Sala jPanel_Actualizar_Sala;
    private JPanel_Actualizar_Sede jPanel_Actualizar_Sede;
    private JPanel_Actualizar_Tipo_Equipo jPanel_Actualizar_Tipo_Equipo;
    
    private JPanel_Agregar_Administrador jPanel_Agregar_Administrador;
    private JPanel_Agregar_Equipo jPanel_Agregar_Equipo;
    private JPanel_Agregar_Licencia jPanel_Agregar_Licencia;
    private JPanel_Agregar_Licencia_Equipo jPanel_Agregar_Licencia_Equipo;
    private JPanel_Agregar_Mantenimiento jPanel_Agregar_Mantenimiento;
    private JPanel_Agregar_Mantenimiento_a_Equipo jPanel_Agregar_Mantenimiento_a_Equipo;
    private JPanel_Agregar_Marca_Equipo jPanel_Agregar_Marca_Equipo;
    private JPanel_Agregar_Persona jPanel_Agregar_Persona;
    private JPanel_Agregar_Rol jPanel_Agregar_Rol;
    private JPanel_Agregar_Rol_a_Persona jPanel_Agregar_Rol_a_Persona;
    private JPanel_Agregar_Sala jPanel_Agregar_Sala;
    private JPanel_Agregar_Sede jPanel_Agregar_Sede;
    private JPanel_Agregar_Tipo_Equipo jPanel_Agregar_Tipo_Equipo;
    
    private JPanel_Eliminar_Administrador jPanel_Eliminar_Administrador;
    private JPanel_Eliminar_Equipo jPanel_Eliminar_Equipo;
    private JPanel_Eliminar_Licencia jPanel_Eliminar_Licencia;
    private JPanel_Eliminar_Licencia_Equipo jPanel_Eliminar_Licencia_Equipo;
    private JPanel_Eliminar_Mantenimiento jPanel_Eliminar_Mantenimiento;
    private JPanel_Eliminar_Mantenimiento_a_Equipo jPanel_Eliminar_Mantenimiento_a_Equipo;
    private JPanel_Eliminar_Marca_Equipo jPanel_Eliminar_Marca_Equipo;
    private JPanel_Eliminar_Persona jPanel_Eliminar_Persona;
    private JPanel_Eliminar_Rol jPanel_Eliminar_Rol;
    private JPanel_Eliminar_Rol_a_Persona jPanel_Eliminar_Rol_a_Persona;
    private JPanel_Eliminar_Sala jPanel_Eliminar_Sala;
    private JPanel_Eliminar_Sede jPanel_Eliminar_Sede;
    private JPanel_Eliminar_Tipo_Equipo jPanel_Eliminar_Tipo_Equipo;
    
    public Controlador(JPanel_Login logginPanel, JFrame_Formulario view){
        this.jPanel_Login = logginPanel;
        this.formulario = view;
        accionJMenu();
        //actionActualizar_Equipo();
        //actionActualizar_Administrador();
        //actionActualizar_Licencia();
        actionActualizar_Licencia_Equipo();
    }
    
    public void iniciarVista() {
    jPanel_Login.setTitle("SIASI");
    jPanel_Login.pack();
    jPanel_Login.setDefaultCloseOperation(jPanel_Login.EXIT_ON_CLOSE);
    jPanel_Login.setLocationRelativeTo(null);
    jPanel_Login.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    jPanel_Login.getEntrar_JButton().addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            logueado();
        }
    });
   }
    
    public void logueado(){
        
        Login login = new Login();
        login.setUser(jPanel_Login.getUsuario_JTextField().getText());
        login.setPassword(jPanel_Login.getPassword_JPasswordField().getPassword().toString());
        
        LoginDAO lDAO= new LoginDAO();
        LoginDTO logDTO = lDAO.read(new LoginDTO(login));
        System.out.println("Rol: " + logDTO.getRol());
        if(logDTO.getRol() != null){
            jPanel_Login.dispose();
            formulario.setTitle(logDTO.getRol()+" "+title);
            formulario.pack();
            formulario.setLocationRelativeTo(null);
            formulario.setVisible(true);
            formulario.addWindowListener(new WindowAdapter() {
              public void windowClosing(WindowEvent e) {
                formulario.dispose();
                iniciarVista();
              }
            });
        }
        else {
            JOptionPane.showMessageDialog(jPanel_Login, "Usted no está autorizado para ingresar al sistema");
        }
    }
       
    private void accionJMenu (){
        
        formulario.getjMenuItem_Actualizar_Prestamos_Equipos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Administrador();
            }
        });
        
        formulario.getjMenuItem_Agregar_Prestamos_Equipos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Administrador();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Prestamos_Equipos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Administrador();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Equipo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Equipo();
            }
        });
        
        formulario.getjMenuItem_Agregar_Equipo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Equipo();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Equipo().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Equipo();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Licencia();
            }
        });
        
        formulario.getjMenuItem_Agregar_Licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Licencia();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Licencia();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Asignar_Asignar_licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Licencia_Equipo();
            }
        });
        
        formulario.getjMenuItem_Agregar_Asignar_Asignar_licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Licencia_Equipo();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Asignar_Asignar_licencia().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Licencia_Equipo();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Tipo_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizarTipoMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Agregar_Tipo_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregarTipoMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Tipo_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminarTipoMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Hacer_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizarMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Agregar_Hacer_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregarMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Hacer_Mantenimiento().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminarMantenimiento();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Marca().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Marca();
            }
        });
        
        formulario.getjMenuItem_Agregar_Marca().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Marca();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Marca().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Marca();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Persona();
            }
        });
        
        formulario.getjMenuItem_Agregar_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Persona();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Persona();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Rol_a_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Rol_a_Persona();
            }
        });
        
        formulario.getjMenuItem_Agregar_Rol_a_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Rol_a_Persona();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Rol_a_Persona().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Rol_a_Persona();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Rol().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Rol();
            }
        });
        
        formulario.getjMenuItem_Agregar_Rol().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Rol();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Rol().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Rol();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Sala().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Sala();
            }
        });
        
        formulario.getjMenuItem_Agregar_Sala().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Sala();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Sala().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Sala();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Sede().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Sede();
            }
        });
        
        formulario.getjMenuItem_Agregar_Sede().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Sede();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Sede().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Sede();
            }
        });
        
        formulario.getjMenuItem_Actualizar_Tipo_de_Equipo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionActualizar_Tipo_Equipo();
            }
        });
        
        formulario.getjMenuItem_Agregar_Tipo_de_Equipo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAgregar_Tipo_Equipo();
            }
        });
        
        formulario.getjMenuItem_Eliminar_Tipo_de_Equipo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionEliminar_Tipo_Equipo();
            }
        });
        
        formulario.getjMenuItem_Acerca().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAcerca();
            }
        });
        
        formulario.getjMenuItem_Ayuda().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionAyuda();
            }
        });
        
        formulario.getjMenuItem_Reporte_Especifico().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionReporteEspecifico();
            }
        });
    }
    
    /**
     * inicio metodos para las acciones de prestamo de equipos
     */
    
    private void actionActualizar_Administrador(){
        if(jPanel_Actualizar_Administrador==null){
            jPanel_Actualizar_Administrador = new JPanel_Actualizar_Administrador();
            formulario.getPanelTabbedPane().addTab("Actualizar Prestamo", null, jPanel_Actualizar_Administrador, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Administrador);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Administrador=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelAdministrador();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Administrador); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Administrador=null;
                accionActualizarPanelAdministrador();
            }
        }
    }
    
    public void actionActualizarAdministrador(ActionEvent ae) {       
        Administra administra = new Administra();
        administra.setId_persona(Integer.parseInt(jPanel_Actualizar_Administrador.getCedula_JTextField().getText()));
        administra.setId_sala(Integer.parseInt(jPanel_Actualizar_Administrador.getId_sala_Choice().getSelectedItem()));
        administra.setFecha_entrada(jPanel_Actualizar_Administrador.getFecha_entrada_JTextField().getText());
        administra.setFecha_salida(jPanel_Actualizar_Administrador.getFecha_salida_JTextField().getText());
        
        AdministraDAO aDAO= new AdministraDAO();
        
        if(aDAO.update(new AdministraDTO(administra))){
             jPanel_Actualizar_Administrador.getExito().setForeground(Color.green);
             jPanel_Actualizar_Administrador.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Administrador.limpiar();
        }
        else {
            jPanel_Actualizar_Administrador.getExito().setForeground(Color.red);
            jPanel_Actualizar_Administrador.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelAdministrador() {
        jPanel_Actualizar_Administrador.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarAdministrador(e);
            }
        });
        jPanel_Actualizar_Administrador.getCedula_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                accioncosultarpaneladministrador(e);
            }
        });
    }
    
    public void accioncosultarpaneladministrador(KeyEvent e){
        if(jPanel_Actualizar_Administrador.getCedula_JTextField().getText().length()>0){
            Administra administra = new Administra();
            administra.setId_persona(Integer.parseInt(jPanel_Actualizar_Administrador.getCedula_JTextField().getText()));

            AdministraDAO aDAO= new AdministraDAO();
            AdministraDTO aDTO = aDAO.read(new AdministraDTO(administra));
            if(aDTO.getId_persona() != 0){
                jPanel_Actualizar_Administrador.getCedula_JTextField().setText(Integer.toString(aDTO.getId_persona()));
                jPanel_Actualizar_Administrador.getId_sala_Choice().add(Integer.toString(aDTO.getId_sala()));
                jPanel_Actualizar_Administrador.getId_sala_Choice().addItem(Integer.toString(aDTO.getId_sala()));
                jPanel_Actualizar_Administrador.getFecha_entrada_JTextField().setText(aDTO.getFecha_entrada());
                jPanel_Actualizar_Administrador.getFecha_salida_JTextField().setText(aDTO.getFecha_salida());
                jPanel_Actualizar_Administrador.getExito().setForeground(Color.green);
                jPanel_Actualizar_Administrador.getExito().setText("Operación exitosa");                                                
            }
            else {
                jPanel_Actualizar_Administrador.getExito().setForeground(Color.red);
                jPanel_Actualizar_Administrador.getExito().setText("Operacion sin éxito");
            }
        }
        
    }
    
    private void actionAgregar_Administrador(){
        if(jPanel_Agregar_Administrador==null){
            jPanel_Agregar_Administrador = new JPanel_Agregar_Administrador();
            formulario.getPanelTabbedPane().addTab("Prestamo", null, jPanel_Agregar_Administrador, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Administrador);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Administrador=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelAdministrador();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Administrador); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Administrador=null;
                accionAgregarPanelAdministrador();
            }
        }
    }
    
    public void actionAgregarAdministrador(ActionEvent ae) {       
        Administra administra = new Administra();
        administra.setId_persona(Integer.parseInt(jPanel_Agregar_Administrador.getCedula_JTextField().getText()));
        administra.setId_sala(Integer.parseInt(jPanel_Agregar_Administrador.getId_sala_JTextField().getText()));
        administra.setFecha_entrada(jPanel_Agregar_Administrador.getFecha_entrada_JTextField().getText());
        administra.setFecha_salida(jPanel_Agregar_Administrador.getFecha_salida_JTextField().getText());
        
        AdministraDAO aDAO= new AdministraDAO();
        
        if(aDAO.crear(new AdministraDTO(administra))){
             jPanel_Agregar_Administrador.getExito().setForeground(Color.green);
             jPanel_Agregar_Administrador.getExito().setText("Operación exitosa");
             jPanel_Agregar_Administrador.limpiar();
        }
        else {
            jPanel_Agregar_Administrador.getExito().setForeground(Color.red);
            jPanel_Agregar_Administrador.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelAdministrador() {
        jPanel_Agregar_Administrador.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarAdministrador(e);
            }
        });
    }
    
    private void actionEliminar_Administrador(){
        if(jPanel_Eliminar_Administrador==null){
            jPanel_Eliminar_Administrador = new JPanel_Eliminar_Administrador();
            formulario.getPanelTabbedPane().addTab("Prestamo", null, jPanel_Eliminar_Administrador, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Administrador);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Administrador=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelAdministrador();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Administrador); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Administrador=null;
                accionEliminarPanelAdministrador();
            }
        }
    }
    
    public void actionEliminarAdministrador(ActionEvent ae) {       
        Administra administra = new Administra();
        administra.setId_persona(Integer.parseInt(jPanel_Eliminar_Administrador.getCedula_JTextField().getText()));
        administra.setId_sala(Integer.parseInt(jPanel_Eliminar_Administrador.getId_sala_JTextField().getText()));
        administra.setFecha_entrada(jPanel_Eliminar_Administrador.getFecha_entrada_JTextField().getText());
        administra.setFecha_salida(jPanel_Eliminar_Administrador.getFecha_salida_JTextField().getText());
        
        AdministraDAO aDAO= new AdministraDAO();
        
        if(aDAO.delete(new AdministraDTO(administra))){
             jPanel_Eliminar_Administrador.getExito().setForeground(Color.green);
             jPanel_Eliminar_Administrador.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Administrador.limpiar();
        }
        else {
            jPanel_Eliminar_Administrador.getExito().setForeground(Color.red);
            jPanel_Eliminar_Administrador.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelAdministrador() {
        jPanel_Eliminar_Administrador.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarAdministrador(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de prestamo de equipos
     */
    
    
    /**
     * inicio metodos para las acciones de equipos
     */
    private void actionActualizar_Equipo(){
        if(jPanel_Actualizar_Equipo==null){
            jPanel_Actualizar_Equipo = new JPanel_Actualizar_Equipo();
            formulario.getPanelTabbedPane().addTab("Actualizar Equipo", null, jPanel_Actualizar_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Equipo=null;
                accionActualizarPanelEquipo();
            }
        }
    }
    
    public void actionActualizarEquipo(ActionEvent ae) {       
        Equipo equipo = new Equipo();
        equipo.setId_equipo(jPanel_Actualizar_Equipo.getId_equipo_JTextField().getText());
        equipo.setId_sala(getIdSala(jPanel_Actualizar_Equipo.getId_sala_Choice().getSelectedItem()));
        equipo.setModelo(jPanel_Actualizar_Equipo.getModelo_JTextField().getText());
        equipo.setId_marca(getIdMarca(jPanel_Actualizar_Equipo.getId_marca_Choice().getSelectedItem()));
        equipo.setId_tipo_equipo(getIdTipoEquipo(jPanel_Actualizar_Equipo.getTipo_equipo_Choice().getSelectedItem()));
        
        EquipoDAO eDAO= new EquipoDAO();
        
        if(eDAO.update(new EquipoDTO(equipo))){
             jPanel_Actualizar_Equipo.getExito().setForeground(Color.green);
             jPanel_Actualizar_Equipo.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Equipo.limpiar();
        }
        else {
            jPanel_Actualizar_Equipo.getExito().setForeground(Color.red);
            jPanel_Actualizar_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelEquipo() {
        jPanel_Actualizar_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarEquipo(e);
            }
        });
        jPanel_Actualizar_Equipo.getId_equipo_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                actionConsultarEquipo(e);
            }
        });
        jPanel_Actualizar_Equipo.getId_sala_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Sala sala = new Sala();
                SalaDAO sDAO= new SalaDAO();
                List<SalaDTO> sDTO = sDAO.readAll();
                jPanel_Actualizar_Equipo.getId_sala_Choice().removeAll();
                jPanel_Actualizar_Equipo.getId_sala_Choice().add("Sala");
                for(int i=0;i<sDTO.size();i++){
                    jPanel_Actualizar_Equipo.getId_sala_Choice().add(sDTO.get(i).getNombre());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        jPanel_Actualizar_Equipo.getId_sala_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Actualizar_Equipo.getId_sala_JLabel().setText("Id Sala: "+getIdSala(e.getItem().toString()));
            }
        });
        jPanel_Actualizar_Equipo.getTipo_equipo_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
                Tipo_EquipoDAO tipo_EquipoDAO= new Tipo_EquipoDAO();
                List<Tipo_EquipoDTO> teDTO = tipo_EquipoDAO.readAll();
                jPanel_Actualizar_Equipo.getTipo_equipo_Choice().removeAll();
                jPanel_Actualizar_Equipo.getTipo_equipo_Choice().add("Tipo Equipo");
                for(int i=0;i<teDTO.size();i++){
                    jPanel_Actualizar_Equipo.getTipo_equipo_Choice().add(teDTO.get(i).getDescripcion());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Actualizar_Equipo.getTipo_equipo_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Actualizar_Equipo.getTipo_equipo_JLabel().setText("Id Tipo: "+getIdTipoEquipo(e.getItem().toString()));
            }
        });
        jPanel_Actualizar_Equipo.getModelo_JTextField().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel_Actualizar_Equipo.getModelo_JTextField().setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Actualizar_Equipo.getId_marca_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Marca marca = new Marca();
                MarcaDAO marcaDAO= new MarcaDAO();
                List<MarcaDTO> mDTO = marcaDAO.readAll();
                jPanel_Actualizar_Equipo.getId_marca_Choice().removeAll();
                jPanel_Actualizar_Equipo.getId_marca_Choice().add("Marca");
                for(int i=0;i<mDTO.size();i++){
                    jPanel_Actualizar_Equipo.getId_marca_Choice().add(getDescripcionMarca(mDTO.get(i).getId_marca()));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Actualizar_Equipo.getId_marca_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Actualizar_Equipo.getId_marca_JLabel().setText("Id Marca: "+getIdMarca(e.getItem().toString()));
            }
        });
    }
    
    
    
    private void actionConsultarEquipo(KeyEvent ae){  
        if(jPanel_Actualizar_Equipo.getId_equipo_JTextField().getText().length()>0){
            Equipo equipo = new Equipo();
            equipo.setId_equipo(jPanel_Actualizar_Equipo.getId_equipo_JTextField().getText());

            EquipoDAO eDAO= new EquipoDAO();
            EquipoDTO eqDTO = eDAO.read(new EquipoDTO(equipo));
            if(eqDTO.getId_equipo() != null){
                String id_sal=""+eqDTO.getId_sala();
                System.out.println(eqDTO.getId_sala());
                jPanel_Actualizar_Equipo.getId_sala_Choice().add(getNombreSala(eqDTO.getId_sala()));
                jPanel_Actualizar_Equipo.getId_sala_Choice().select(getNombreSala(eqDTO.getId_sala()));
                jPanel_Actualizar_Equipo.getId_sala_JLabel().setText("Id Sala "+eqDTO.getId_sala());
                jPanel_Actualizar_Equipo.getTipo_equipo_Choice().add(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Actualizar_Equipo.getTipo_equipo_Choice().select(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Actualizar_Equipo.getTipo_equipo_JLabel().setText("Id Tipo"+ eqDTO.getId_tipo_equipo());
                jPanel_Actualizar_Equipo.getModelo_JTextField().setText(eqDTO.getModelo());
                jPanel_Actualizar_Equipo.getId_marca_Choice().add(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Actualizar_Equipo.getId_marca_Choice().select(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Actualizar_Equipo.getId_marca_JLabel().setText("Id Marca "+eqDTO.getId_marca());
                jPanel_Actualizar_Equipo.getExito().setForeground(Color.green);
                jPanel_Actualizar_Equipo.getExito().setText("Operación exitosa");
                
                
            }
            else {
                jPanel_Actualizar_Equipo.getExito().setForeground(Color.red);
                jPanel_Actualizar_Equipo.getExito().setText("Operacion sin éxito");
            }
        }
    }
    
    private String getNombreSala(int id_sala){
        Sala sala = new Sala();
        sala.setId_sala(id_sala);
        SalaDAO salaDAO = new SalaDAO();
        SalaDTO salaDTO = salaDAO.read_nombre_sala(new SalaDTO(sala));
        if(salaDTO.getNombre()!=null){
            return salaDTO.getNombre();
        }
        else{
            return null;
        }
    }
    
    private int getIdSala(String nombre){
        Sala sala = new Sala();
        sala.setNombre(nombre);
        SalaDAO salaDAO = new SalaDAO();
        SalaDTO salaDTO = salaDAO.read_id_sala(new SalaDTO(sala));
        if(salaDTO.getNombre()!=null){
            return salaDTO.getId_sala();
        }
        else{
            return 0;
        }
    }
    
    private String getDescripcionTipoEquipo(String id_tipo_equipo){
        Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
        tipo_Equipo.setId_Tipo_Equipo(id_tipo_equipo);
        Tipo_EquipoDAO tipo_EquipoDAO = new Tipo_EquipoDAO();
        Tipo_EquipoDTO tipo_EquipoDTO = tipo_EquipoDAO.read_descripcion_equipo(new Tipo_EquipoDTO(tipo_Equipo));
        if(tipo_EquipoDTO.getDescripcion()!=null){
            return tipo_EquipoDTO.getDescripcion();
        }
        else{
            return null;
        } 
    }
    
    private String getIdTipoEquipo(String descripcion){
        Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
        tipo_Equipo.setDescripcion(descripcion);
        Tipo_EquipoDAO tipo_EquipoDAO = new Tipo_EquipoDAO();
        Tipo_EquipoDTO tipo_EquipoDTO = tipo_EquipoDAO.read_id_equipo(new Tipo_EquipoDTO(tipo_Equipo));
        if(tipo_EquipoDTO.getId_Tipo_Equipo()!=null){
            return tipo_EquipoDTO.getId_Tipo_Equipo();
        }
        else{
            return null;
        } 
    }
    
    private String getDescripcionMarca(String id_marca){
        Marca marca = new Marca();
        marca.setId_marca(id_marca);
        MarcaDAO marcaDAO = new MarcaDAO();
        MarcaDTO marcaDTO = marcaDAO.read_descripcion_marca(new MarcaDTO(marca));
        if(marcaDTO.getDescripcion()!=null){
            return marcaDTO.getDescripcion();
        }
        else{
            return null;
        } 
    }
    
    private String getIdMarca(String descripcion){
        Marca marca = new Marca();
        marca.setDescripcion(descripcion);
        MarcaDAO marcaDAO = new MarcaDAO();
        MarcaDTO marcaDTO = marcaDAO.read_id_marca(new MarcaDTO(marca));
        if(marcaDTO.getId_marca()!=null){
            return marcaDTO.getId_marca();
        }
        else{
            return null;
        } 
    }
    
    private void actionAgregar_Equipo(){
        if(jPanel_Agregar_Equipo==null){
            jPanel_Agregar_Equipo = new JPanel_Agregar_Equipo();
            formulario.getPanelTabbedPane().addTab("Equipo", null, jPanel_Agregar_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Equipo=null;
                accionAgregarPanelEquipo();
            }
        }
    }
    
    public void actionAgregarEquipo(ActionEvent ae) {       
        Equipo equipo = new Equipo();
        equipo.setId_equipo(jPanel_Agregar_Equipo.getId_equipo_JTextField().getText());
        equipo.setId_sala(getIdSala(jPanel_Agregar_Equipo.getId_sala_Choice().getSelectedItem()));
        equipo.setModelo(jPanel_Agregar_Equipo.getModelo_JTextField().getText());
        equipo.setId_marca(getIdMarca(jPanel_Agregar_Equipo.getId_marca_Choice().getSelectedItem()));
        equipo.setId_tipo_equipo(getIdTipoEquipo(jPanel_Agregar_Equipo.getTipo_equipo_Choice().getSelectedItem()));
        
        EquipoDAO eDAO= new EquipoDAO();
        
        if(eDAO.crear(new EquipoDTO(equipo))){
             jPanel_Agregar_Equipo.getExito().setForeground(Color.green);
             jPanel_Agregar_Equipo.getExito().setText("Operación exitosa");
             jPanel_Agregar_Equipo.limpiar();
        }
        else {
            jPanel_Agregar_Equipo.getExito().setForeground(Color.red);
            jPanel_Agregar_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void actionConsultarAgregarEquipo(KeyEvent ae){  
        if(jPanel_Agregar_Equipo.getId_equipo_JTextField().getText().length()>0){
            Equipo equipo = new Equipo();
            equipo.setId_equipo(jPanel_Agregar_Equipo.getId_equipo_JTextField().getText());

            EquipoDAO eDAO= new EquipoDAO();
            EquipoDTO eqDTO = eDAO.read(new EquipoDTO(equipo));
            if(eqDTO.getId_equipo() != null){
                String id_sal=""+eqDTO.getId_sala();
                System.out.println(eqDTO.getId_sala());
                jPanel_Agregar_Equipo.getId_sala_Choice().add(getNombreSala(eqDTO.getId_sala()));
                jPanel_Agregar_Equipo.getId_sala_Choice().select(getNombreSala(eqDTO.getId_sala()));
                jPanel_Agregar_Equipo.getId_sala_JLabel().setText("Id Sala "+eqDTO.getId_sala());
                jPanel_Agregar_Equipo.getTipo_equipo_Choice().add(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Agregar_Equipo.getTipo_equipo_Choice().select(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Agregar_Equipo.getTipo_equipo_JLabel().setText("Id Tipo"+ eqDTO.getId_tipo_equipo());
                jPanel_Agregar_Equipo.getModelo_JTextField().setText(eqDTO.getModelo());
                jPanel_Agregar_Equipo.getId_marca_Choice().add(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Agregar_Equipo.getId_marca_Choice().select(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Agregar_Equipo.getId_marca_JLabel().setText("Id Marca "+eqDTO.getId_marca());
                jPanel_Agregar_Equipo.getExito().setForeground(Color.green);
                jPanel_Agregar_Equipo.getExito().setText("Operación exitosa");
                
                
            }
            else {
                jPanel_Agregar_Equipo.getExito().setForeground(Color.red);
                jPanel_Agregar_Equipo.getExito().setText("Operacion sin éxito");
            }
        }
    }
    
    private void accionAgregarPanelEquipo() {
        jPanel_Agregar_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarEquipo(e);
            }
        });
        jPanel_Agregar_Equipo.getId_equipo_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                actionConsultarAgregarEquipo(e);
            }
        });
        jPanel_Agregar_Equipo.getId_sala_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Sala sala = new Sala();
                SalaDAO sDAO= new SalaDAO();
                List<SalaDTO> sDTO = sDAO.readAll();
                jPanel_Agregar_Equipo.getId_sala_Choice().removeAll();
                jPanel_Agregar_Equipo.getId_sala_Choice().add("Sala");
                for(int i=0;i<sDTO.size();i++){
                    jPanel_Agregar_Equipo.getId_sala_Choice().add(sDTO.get(i).getNombre());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        jPanel_Agregar_Equipo.getId_sala_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Agregar_Equipo.getId_sala_JLabel().setText("Id Sala: "+getIdSala(e.getItem().toString()));
            }
        });
        jPanel_Agregar_Equipo.getTipo_equipo_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
                Tipo_EquipoDAO tipo_EquipoDAO= new Tipo_EquipoDAO();
                List<Tipo_EquipoDTO> teDTO = tipo_EquipoDAO.readAll();
                jPanel_Agregar_Equipo.getTipo_equipo_Choice().removeAll();
                jPanel_Agregar_Equipo.getTipo_equipo_Choice().add("Tipo Equipo");
                for(int i=0;i<teDTO.size();i++){
                    jPanel_Agregar_Equipo.getTipo_equipo_Choice().add(teDTO.get(i).getDescripcion());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Agregar_Equipo.getTipo_equipo_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Agregar_Equipo.getTipo_equipo_JLabel().setText("Id Tipo: "+getIdTipoEquipo(e.getItem().toString()));
            }
        });
        jPanel_Agregar_Equipo.getModelo_JTextField().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                jPanel_Agregar_Equipo.getModelo_JTextField().setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Agregar_Equipo.getId_marca_Choice().addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                Marca marca = new Marca();
                MarcaDAO marcaDAO= new MarcaDAO();
                List<MarcaDTO> mDTO = marcaDAO.readAll();
                jPanel_Agregar_Equipo.getId_marca_Choice().removeAll();
                jPanel_Agregar_Equipo.getId_marca_Choice().add("Marca");
                for(int i=0;i<mDTO.size();i++){
                    jPanel_Agregar_Equipo.getId_marca_Choice().add(getDescripcionMarca(mDTO.get(i).getId_marca()));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        jPanel_Agregar_Equipo.getId_marca_Choice().addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                jPanel_Agregar_Equipo.getId_marca_JLabel().setText("Id Marca: "+getIdMarca(e.getItem().toString()));
            }
        });
    }
    
    private void actionEliminar_Equipo(){
        if(jPanel_Eliminar_Equipo==null){
            jPanel_Eliminar_Equipo = new JPanel_Eliminar_Equipo();
            formulario.getPanelTabbedPane().addTab("Equipo", null, jPanel_Eliminar_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Equipo=null;
                accionEliminarPanelEquipo();
            }
        }
    }
    
    public void actionEliminarEquipo(ActionEvent ae) {       
        Equipo equipo = new Equipo();
        equipo.setId_equipo(jPanel_Eliminar_Equipo.getId_equipo_JTextField().getText());
        equipo.setId_sala(getIdSala(jPanel_Eliminar_Equipo.getId_sala_Choice().getSelectedItem()));
        equipo.setModelo(jPanel_Eliminar_Equipo.getModelo_JTextField().getText());
        equipo.setId_marca(getIdMarca(jPanel_Eliminar_Equipo.getId_marca_Choice().getSelectedItem()));
        equipo.setId_tipo_equipo(getIdTipoEquipo(jPanel_Eliminar_Equipo.getTipo_equipo_Choice().getSelectedItem()));
        
        EquipoDAO eDAO= new EquipoDAO();
        
        if(eDAO.delete(new EquipoDTO(equipo))){
             jPanel_Eliminar_Equipo.getExito().setForeground(Color.green);
             jPanel_Eliminar_Equipo.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Equipo.limpiar();
        }
        else {
            jPanel_Eliminar_Equipo.getExito().setForeground(Color.red);
            jPanel_Eliminar_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelEquipo() {
        jPanel_Eliminar_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarEquipo(e);
            }
        });
        jPanel_Eliminar_Equipo.getId_equipo_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                actionConsultarEliminarEquipo(e);
            }
        });
    }
    
    
    private void actionConsultarEliminarEquipo(KeyEvent ae){  
        if(jPanel_Eliminar_Equipo.getId_equipo_JTextField().getText().length()>0){
            Equipo equipo = new Equipo();
            equipo.setId_equipo(jPanel_Eliminar_Equipo.getId_equipo_JTextField().getText());

            EquipoDAO eDAO= new EquipoDAO();
            EquipoDTO eqDTO = eDAO.read(new EquipoDTO(equipo));
            if(eqDTO.getId_equipo() != null){
                String id_sal=""+eqDTO.getId_sala();
                System.out.println(eqDTO.getId_sala());
                jPanel_Eliminar_Equipo.getId_sala_Choice().add(getNombreSala(eqDTO.getId_sala()));
                jPanel_Eliminar_Equipo.getId_sala_Choice().select(getNombreSala(eqDTO.getId_sala()));
                jPanel_Eliminar_Equipo.getId_sala_JLabel().setText("Id Sala "+eqDTO.getId_sala());
                jPanel_Eliminar_Equipo.getId_sala_Choice().setEnabled(false);
                jPanel_Eliminar_Equipo.getTipo_equipo_Choice().add(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Eliminar_Equipo.getTipo_equipo_Choice().select(getDescripcionTipoEquipo(eqDTO.getId_tipo_equipo()));
                jPanel_Eliminar_Equipo.getTipo_equipo_JLabel().setText("Id Tipo"+ eqDTO.getId_tipo_equipo());
                jPanel_Eliminar_Equipo.getTipo_equipo_Choice().setEnabled(false);
                jPanel_Eliminar_Equipo.getModelo_JTextField().setText(eqDTO.getModelo());
                jPanel_Eliminar_Equipo.getModelo_JTextField().setEnabled(false);
                jPanel_Eliminar_Equipo.getId_marca_Choice().add(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Eliminar_Equipo.getId_marca_Choice().select(getDescripcionMarca(eqDTO.getId_marca()));
                jPanel_Eliminar_Equipo.getId_marca_Choice().setEnabled(false);
                jPanel_Eliminar_Equipo.getId_marca_JLabel().setText("Id Marca "+eqDTO.getId_marca());
                jPanel_Eliminar_Equipo.getExito().setForeground(Color.green);
                jPanel_Eliminar_Equipo.getExito().setText("Operación exitosa");
                
                
            }
            else {
                jPanel_Eliminar_Equipo.getExito().setForeground(Color.red);
                jPanel_Eliminar_Equipo.getExito().setText("Operacion sin éxito");
            }
        }
    }
    /**
     * fin metodos para las acciones de equipos
     */

    
    /**
     * inicio metodos para las acciones de licencia
     */

    private void actionActualizar_Licencia(){
        if(jPanel_Actualizar_Licencia==null){
            jPanel_Actualizar_Licencia = new JPanel_Actualizar_Licencia();
            formulario.getPanelTabbedPane().addTab("Actualizar Licencia", null, jPanel_Actualizar_Licencia, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Licencia);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Licencia=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelLicencia();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Licencia); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Licencia=null;
                accionActualizarPanelLicencia();
            }
        }
    }
    
    public void actionActualizarLicencia(ActionEvent ae) {       
        Licencia licencia = new Licencia();
        licencia.setId_licencia(jPanel_Actualizar_Licencia.getId_licencia_JTextField().getText());
        licencia.setProducto(jPanel_Actualizar_Licencia.getProducto_JTextField().getText());
        licencia.setCantidad_actual(Integer.parseInt(jPanel_Actualizar_Licencia.getCantidad_actual_JTextField().getText()));
        licencia.setCupo(Integer.parseInt(jPanel_Actualizar_Licencia.getCupo_JTextField().getText()));
        //licencia.setFecha_expiraccion((jPanel_Actualizar_Licencia.getFecha_expiracion_JCalendar().getDate()).toString());
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        licencia.setFecha_expiraccion(jPanel_Actualizar_Licencia.getFecha_expiracion_JCalendar().getDate().toString());
        
        LicenciaDAO lDAO= new LicenciaDAO();
        
        if(lDAO.update(new LicenciaDTO(licencia))){
             jPanel_Actualizar_Licencia.getExito().setForeground(Color.green);
             jPanel_Actualizar_Licencia.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Licencia.limpiar();
        }
        else {
            jPanel_Actualizar_Licencia.getExito().setForeground(Color.red);
            jPanel_Actualizar_Licencia.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelLicencia() {
        jPanel_Actualizar_Licencia.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarLicencia(e);
            }
        });
        jPanel_Actualizar_Licencia.getId_licencia_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                actionConsultarLicencia(e);
            }
        });
    }
    
    private void actionConsultarLicencia(KeyEvent e){
        if(jPanel_Actualizar_Licencia.getId_licencia_JTextField().getText().length()>0){
            Licencia licencia = new Licencia();
            licencia.setId_licencia(jPanel_Actualizar_Licencia.getId_licencia_JTextField().getText()); 
            LicenciaDAO lDAO = new LicenciaDAO();
            LicenciaDTO lDTO = lDAO.read(new LicenciaDTO(licencia));
            if(lDTO!=null){
                //jPanel_Actualizar_Licencia.getId_licencia_JTextField().setText(lDTO.getId_licencia());
                try {
                    jPanel_Actualizar_Licencia.getProducto_JTextField().setText(lDTO.getProducto());
                    jPanel_Actualizar_Licencia.getCantidad_actual_JTextField().setText(Integer.toString(lDTO.getCantidad_actual()));
                    jPanel_Actualizar_Licencia.getCupo_JTextField().setText(Integer.toString(lDTO.getCupo()));
                } catch (NullPointerException exception) {
                    //exception.printStackTrace();
                }
               
                try {
                    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                   jPanel_Actualizar_Licencia.getFecha_expiracion_JCalendar().setDate(dateFormat.parse(lDTO.getFecha_expiraccion()));
                } catch (ParseException ex) {
                    DateFormat dateFormat=DateFormat.getInstance();
                    Calendar cal=dateFormat.getCalendar();
                    cal.set(2013, 01, 20);
                    System.out.println(Timestamp.valueOf("2014-01-13"+ " 00:00:00"));
                    
                    
                    
                   // System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).getCalendar().getTime().);
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
                jPanel_Actualizar_Licencia.getExito().setForeground(Color.green);
                jPanel_Actualizar_Licencia.getExito().setText("Operación exitosa");
            }else {
                jPanel_Actualizar_Licencia.getExito().setForeground(Color.red);
                jPanel_Actualizar_Licencia.getExito().setText("Operacion sin éxito");
            }
        }
    }
       
    private void actionAgregar_Licencia(){
        if(jPanel_Agregar_Licencia==null){
            jPanel_Agregar_Licencia = new JPanel_Agregar_Licencia();
            formulario.getPanelTabbedPane().addTab("Licencia", null, jPanel_Agregar_Licencia, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Licencia);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Licencia=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelLicencia();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Licencia); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Licencia=null;
                accionAgregarPanelLicencia();
            }
        }
    }
    
    public void actionAgregarLicencia(ActionEvent ae) {       
        Licencia licencia = new Licencia();
        licencia.setId_licencia(jPanel_Agregar_Licencia.getId_licencia_JTextField().getText());
        licencia.setProducto(jPanel_Agregar_Licencia.getProducto_JTextField().getText());
        licencia.setCantidad_actual(Integer.parseInt(jPanel_Agregar_Licencia.getCantidad_actual_JTextField().getText()));
        licencia.setCupo(Integer.parseInt(jPanel_Agregar_Licencia.getCupo_JTextField().getText()));
        licencia.setFecha_expiraccion((jPanel_Agregar_Licencia.getFecha_expiracion_JCalendar().getDate()).toString());
        
        LicenciaDAO lDAO= new LicenciaDAO();
        
        if(lDAO.crear(new LicenciaDTO(licencia))){
             jPanel_Agregar_Licencia.getExito().setForeground(Color.green);
             jPanel_Agregar_Licencia.getExito().setText("Operación exitosa");
             jPanel_Agregar_Licencia.limpiar();
        }
        else {
            jPanel_Agregar_Licencia.getExito().setForeground(Color.red);
            jPanel_Agregar_Licencia.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelLicencia() {
        jPanel_Agregar_Licencia.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarLicencia(e);
            }
        });
    }
    
    private void actionEliminar_Licencia(){
        if(jPanel_Eliminar_Licencia==null){
            jPanel_Eliminar_Licencia = new JPanel_Eliminar_Licencia();
            formulario.getPanelTabbedPane().addTab("Licencia", null, jPanel_Eliminar_Licencia, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Licencia);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Licencia=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelLicencia();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Licencia); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Licencia=null;
                accionEliminarPanelLicencia();
            }
        }
    }
    
    public void actionEliminarLicencia(ActionEvent ae) {       
        Licencia licencia = new Licencia();
        licencia.setId_licencia(jPanel_Eliminar_Licencia.getId_licencia_JTextField().getText());
        licencia.setProducto(jPanel_Eliminar_Licencia.getProducto_JTextField().getText());
        licencia.setCantidad_actual(Integer.parseInt(jPanel_Eliminar_Licencia.getCantidad_actual_JTextField().getText()));
        licencia.setCupo(Integer.parseInt(jPanel_Eliminar_Licencia.getCupo_JTextField().getText()));
        licencia.setFecha_expiraccion((jPanel_Eliminar_Licencia.getFecha_expiracion_JCalendar().getDate()).toString());
        
        LicenciaDAO lDAO= new LicenciaDAO();
        
        if(lDAO.delete(new LicenciaDTO(licencia))){
             jPanel_Eliminar_Licencia.getExito().setForeground(Color.green);
             jPanel_Eliminar_Licencia.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Licencia.limpiar();
        }
        else {
            jPanel_Eliminar_Licencia.getExito().setForeground(Color.red);
            jPanel_Eliminar_Licencia.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelLicencia() {
        jPanel_Eliminar_Licencia.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarLicencia(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de licencia
     */
    
    
    /**
     * inicio metodos para las acciones de licencia_equipo
     */
    private void actionActualizar_Licencia_Equipo(){
        if(jPanel_Actualizar_Licencia_Equipo==null){
            jPanel_Actualizar_Licencia_Equipo = new JPanel_Actualizar_Licencia_Equipo();
            formulario.getPanelTabbedPane().addTab("Tramitar Licencia", null, jPanel_Actualizar_Licencia_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Licencia_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Licencia_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelLicenciaEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Licencia_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Licencia_Equipo=null;
                accionActualizarPanelLicenciaEquipo();
            }
        }
    }
    
    public void actionActualizarLicenciaEquipo(ActionEvent ae) {       
        Licencia_Equipo licencia_Equipo = new Licencia_Equipo();
        licencia_Equipo.setId_licencia(jPanel_Actualizar_Licencia_Equipo.getId_licencia_JTextField().getText());
        licencia_Equipo.setId_equipo(jPanel_Actualizar_Licencia_Equipo.getId_equipo_JTextField().getText());
        licencia_Equipo.setFecha_instalacion((jPanel_Actualizar_Licencia_Equipo.getFecha_instalacion_JCalendar().getDate()).toString());
        
        Licencia_EquipoDAO lDAO= new Licencia_EquipoDAO();
        
        if(lDAO.update(new Licencia_EquipoDTO(licencia_Equipo))){
             jPanel_Actualizar_Licencia_Equipo.getExito().setForeground(Color.green);
             jPanel_Actualizar_Licencia_Equipo.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Licencia_Equipo.limpiar();
        }
        else {
            jPanel_Actualizar_Licencia_Equipo.getExito().setForeground(Color.red);
            jPanel_Actualizar_Licencia_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelLicenciaEquipo() {
        jPanel_Actualizar_Licencia_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarLicenciaEquipo(e);
            }
        });jPanel_Actualizar_Licencia_Equipo.getId_licencia_JTextField().addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                actionConsultarLicenciaEquipo(e);
            }
        });
    }
    
    private void actionConsultarLicenciaEquipo(KeyEvent e){
        if(jPanel_Actualizar_Licencia_Equipo.getId_licencia_JTextField().getText().length()>0){
            Licencia_Equipo licenciaequipo = new Licencia_Equipo();
            licenciaequipo.setId_licencia(jPanel_Actualizar_Licencia_Equipo.getId_licencia_JTextField().getText()); 
            Licencia_EquipoDAO leDAO = new Licencia_EquipoDAO();
            Licencia_EquipoDTO leDTO = leDAO.read(new Licencia_EquipoDTO(licenciaequipo));
            if(leDTO.getId_licencia() != null){
                jPanel_Actualizar_Licencia_Equipo.getId_licencia_JTextField().setText(leDTO.getId_licencia());
                jPanel_Actualizar_Licencia_Equipo.getId_equipo_JTextField().setText(leDTO.getId_equipo());
                jPanel_Actualizar_Licencia_Equipo.getExito().setForeground(Color.green);
                jPanel_Actualizar_Licencia_Equipo.getExito().setText("Operación exitosa");
            }else {
                jPanel_Actualizar_Licencia_Equipo.getExito().setForeground(Color.red);
                jPanel_Actualizar_Licencia_Equipo.getExito().setText("Operacion sin éxito");
            }
        }       
    }    
    
    private void actionAgregar_Licencia_Equipo(){
        if(jPanel_Agregar_Licencia_Equipo==null){
            jPanel_Agregar_Licencia_Equipo = new JPanel_Agregar_Licencia_Equipo();
            formulario.getPanelTabbedPane().addTab("Tramitar Licencia", null, jPanel_Agregar_Licencia_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Licencia_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Licencia_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelLicenciaEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Licencia_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Licencia_Equipo=null;
                accionAgregarPanelLicenciaEquipo();
            }
        }
    }
    
    public void actionAgregarLicenciaEquipo(ActionEvent ae) {       
        Licencia_Equipo licencia_Equipo = new Licencia_Equipo();
        licencia_Equipo.setId_licencia(jPanel_Agregar_Licencia_Equipo.getId_licencia_Choice().getSelectedItem());
        licencia_Equipo.setId_equipo(jPanel_Agregar_Licencia_Equipo.getId_equipo_Choice().getSelectedItem());
        licencia_Equipo.setFecha_instalacion((jPanel_Agregar_Licencia_Equipo.getFecha_instalacion_JCalendar().getDate()).toString());
        
        Licencia_EquipoDAO lDAO= new Licencia_EquipoDAO();
        
        if(lDAO.crear(new Licencia_EquipoDTO(licencia_Equipo))){
             jPanel_Agregar_Licencia_Equipo.getExito().setForeground(Color.green);
             jPanel_Agregar_Licencia_Equipo.getExito().setText("Operación exitosa");
             jPanel_Agregar_Licencia_Equipo.limpiar();
        }
        else {
            jPanel_Agregar_Licencia_Equipo.getExito().setForeground(Color.red);
            jPanel_Agregar_Licencia_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelLicenciaEquipo() {
        jPanel_Agregar_Licencia_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarLicenciaEquipo(e);
            }
        });
    }
    
    private void actionEliminar_Licencia_Equipo(){
        if(jPanel_Eliminar_Licencia_Equipo==null){
            jPanel_Eliminar_Licencia_Equipo = new JPanel_Eliminar_Licencia_Equipo();
            formulario.getPanelTabbedPane().addTab("Tramitar Licencia", null, jPanel_Eliminar_Licencia_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Licencia_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Licencia_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelLicenciaEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Licencia_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Licencia_Equipo=null;
                accionEliminarPanelLicenciaEquipo();
            }
        }
    }
    
    public void actionEliminarLicenciaEquipo(ActionEvent ae) {       
        Licencia_Equipo licencia_Equipo = new Licencia_Equipo();
        licencia_Equipo.setId_licencia(jPanel_Eliminar_Licencia_Equipo.getId_licencia_Choice().getSelectedItem());
        licencia_Equipo.setId_equipo(jPanel_Eliminar_Licencia_Equipo.getId_equipo_Choice().getSelectedItem());
        licencia_Equipo.setFecha_instalacion((jPanel_Eliminar_Licencia_Equipo.getFecha_instalacion_JCalendar().getDate()).toString());
        
        Licencia_EquipoDAO lDAO= new Licencia_EquipoDAO();
        
        if(lDAO.delete(new Licencia_EquipoDTO(licencia_Equipo))){
             jPanel_Eliminar_Licencia_Equipo.getExito().setForeground(Color.green);
             jPanel_Eliminar_Licencia_Equipo.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Licencia_Equipo.limpiar();
        }
        else {
            jPanel_Eliminar_Licencia_Equipo.getExito().setForeground(Color.red);
            jPanel_Eliminar_Licencia_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelLicenciaEquipo() {
        jPanel_Eliminar_Licencia_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarLicenciaEquipo(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de licencia_equipo
     */
    
    /**
     * inicio metodos para las acciones de tipo mantenimiento
     */
    
    private void actionActualizarTipoMantenimiento(){
        if(jPanel_Actualizar_Mantenimiento==null){
            jPanel_Actualizar_Mantenimiento = new JPanel_Actualizar_Mantenimiento();
            formulario.getPanelTabbedPane().addTab("Tipo Mantenimiento", null, jPanel_Actualizar_Mantenimiento, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Mantenimiento);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Mantenimiento=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelTipoMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Mantenimiento); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Mantenimiento=null;
                accionActualizarPanelTipoMantenimiento();
            }
        }
    }
    
    public void actionActualizarTipoMantenimiento(ActionEvent ae) {       
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setId_mantenimiento(jPanel_Actualizar_Mantenimiento.getId_mantenimiento_JTextField().getText());
        mantenimiento.setDescripcion(jPanel_Actualizar_Mantenimiento.getDescripcion_mantenimiento_JTextArea().getText());
        
        MantenimientoDAO mDAO= new MantenimientoDAO();
        
        if(mDAO.update(new MantenimientoDTO(mantenimiento))){
             jPanel_Actualizar_Mantenimiento.getExito().setForeground(Color.green);
             jPanel_Actualizar_Mantenimiento.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Mantenimiento.limpiar();
        }
        else {
            jPanel_Actualizar_Mantenimiento.getExito().setForeground(Color.red);
            jPanel_Actualizar_Mantenimiento.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelTipoMantenimiento() {
        jPanel_Actualizar_Mantenimiento.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarTipoMantenimiento(e);
            }
        });
    }
    
    private void actionAgregarTipoMantenimiento(){
        if(jPanel_Agregar_Mantenimiento==null){
            jPanel_Agregar_Mantenimiento = new JPanel_Agregar_Mantenimiento();
            formulario.getPanelTabbedPane().addTab("Tipo Mantenimiento", null, jPanel_Agregar_Mantenimiento, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Mantenimiento);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Mantenimiento=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelTipoMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Mantenimiento); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Mantenimiento=null;
                accionAgregarPanelTipoMantenimiento();
            }
        }
    }
    
    public void actionAgregarTipoMantenimiento(ActionEvent ae) {       
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setId_mantenimiento(jPanel_Agregar_Mantenimiento.getId_mantenimiento_JTextField().getText());
        mantenimiento.setDescripcion(jPanel_Agregar_Mantenimiento.getDescripcion_mantenimiento_JTextArea().getText());
        
        MantenimientoDAO mDAO= new MantenimientoDAO();
        
        if(mDAO.crear(new MantenimientoDTO(mantenimiento))){
             jPanel_Agregar_Mantenimiento.getExito().setForeground(Color.green);
             jPanel_Agregar_Mantenimiento.getExito().setText("Operación exitosa");
             jPanel_Agregar_Mantenimiento.limpiar();
        }
        else {
            jPanel_Agregar_Mantenimiento.getExito().setForeground(Color.red);
            jPanel_Agregar_Mantenimiento.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelTipoMantenimiento() {
        jPanel_Agregar_Mantenimiento.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarTipoMantenimiento(e);
            }
        });
    }
    
    private void actionEliminarTipoMantenimiento(){
        if(jPanel_Eliminar_Mantenimiento==null){
            jPanel_Eliminar_Mantenimiento = new JPanel_Eliminar_Mantenimiento();
            formulario.getPanelTabbedPane().addTab("Tipo Mantenimiento", null, jPanel_Eliminar_Mantenimiento, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Mantenimiento);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Mantenimiento=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelTipoMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Mantenimiento); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Mantenimiento=null;
                accionEliminarPanelTipoMantenimiento();
            }
        }
    }
    
    public void actionEliminarTipoMantenimiento(ActionEvent ae) {       
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setId_mantenimiento(jPanel_Eliminar_Mantenimiento.getId_mantenimiento_JTextField().getText());
        mantenimiento.setDescripcion(jPanel_Eliminar_Mantenimiento.getDescripcion_mantenimiento_JTextArea().getText());
        
        MantenimientoDAO mDAO= new MantenimientoDAO();
        
        if(mDAO.delete(new MantenimientoDTO(mantenimiento))){
             jPanel_Eliminar_Mantenimiento.getExito().setForeground(Color.green);
             jPanel_Eliminar_Mantenimiento.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Mantenimiento.limpiar();
        }
        else {
            jPanel_Eliminar_Mantenimiento.getExito().setForeground(Color.red);
            jPanel_Eliminar_Mantenimiento.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelTipoMantenimiento() {
        jPanel_Eliminar_Mantenimiento.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarTipoMantenimiento(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de tipo mantenimiento
     */
    
    /**
     * inicio metodos para las acciones de mantenimiento
     */
    
    private void actionActualizarMantenimiento(){
        if(jPanel_Actualizar_Mantenimiento_a_Equipo==null){
            jPanel_Actualizar_Mantenimiento_a_Equipo = new JPanel_Actualizar_Mantenimiento_a_Equipo();
            formulario.getPanelTabbedPane().addTab("Mantenimiento", null, jPanel_Actualizar_Mantenimiento_a_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Mantenimiento_a_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Mantenimiento_a_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Mantenimiento_a_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Mantenimiento_a_Equipo=null;
                accionActualizarPanelMantenimiento();
            }
        }
    }
    
    public void actionActualizarMantenimiento(ActionEvent ae) {       
        Equipo_Mantenimiento equipo_Mantenimiento = new Equipo_Mantenimiento();
        equipo_Mantenimiento.setFecha((jPanel_Actualizar_Mantenimiento_a_Equipo.getFecha_mantenimiento_JCalendar().getDate()).toString());
        equipo_Mantenimiento.setMotivo(jPanel_Actualizar_Mantenimiento_a_Equipo.getMotivo_mantenimiento_JTextArea().getText());
        equipo_Mantenimiento.setFk_id_equipo(jPanel_Actualizar_Mantenimiento_a_Equipo.getId_equipo_Choice().getSelectedItem());
        equipo_Mantenimiento.setFk_id_mantenimiento(jPanel_Actualizar_Mantenimiento_a_Equipo.getId_mantenimiento_Choice().getSelectedItem());
        
        Equipo_MantenimientoDAO eDAO= new Equipo_MantenimientoDAO();
        
        if(eDAO.update(new Equipo_MantenimientoDTO(equipo_Mantenimiento))){
             jPanel_Actualizar_Mantenimiento_a_Equipo.getExito().setForeground(Color.green);
             jPanel_Actualizar_Mantenimiento_a_Equipo.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Mantenimiento_a_Equipo.limpiar();
        }
        else {
            jPanel_Actualizar_Mantenimiento_a_Equipo.getExito().setForeground(Color.red);
            jPanel_Actualizar_Mantenimiento_a_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelMantenimiento() {
        jPanel_Actualizar_Mantenimiento_a_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarMantenimiento(e);
            }
        });
    }
    
    private void actionAgregarMantenimiento(){
        if(jPanel_Agregar_Mantenimiento_a_Equipo==null){
            jPanel_Agregar_Mantenimiento_a_Equipo = new JPanel_Agregar_Mantenimiento_a_Equipo();
            formulario.getPanelTabbedPane().addTab("Mantenimiento", null, jPanel_Agregar_Mantenimiento_a_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Mantenimiento_a_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Mantenimiento_a_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Mantenimiento_a_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Mantenimiento_a_Equipo=null;
                accionAgregarPanelMantenimiento();
            }
        }
    }
    
    public void actionAgregarMantenimiento(ActionEvent ae) {       
        Equipo_Mantenimiento equipo_Mantenimiento = new Equipo_Mantenimiento();
        equipo_Mantenimiento.setFecha((jPanel_Agregar_Mantenimiento_a_Equipo.getFecha_mantenimiento_JCalendar().getDate()).toString());
        equipo_Mantenimiento.setMotivo(jPanel_Agregar_Mantenimiento_a_Equipo.getMotivo_mantenimiento_JTextArea().getText());
        equipo_Mantenimiento.setFk_id_equipo(jPanel_Agregar_Mantenimiento_a_Equipo.getId_equipo_Choice().getSelectedItem());
        equipo_Mantenimiento.setFk_id_mantenimiento(jPanel_Agregar_Mantenimiento_a_Equipo.getId_mantenimiento_Choice().getSelectedItem());
        
        Equipo_MantenimientoDAO eDAO= new Equipo_MantenimientoDAO();
        
        if(eDAO.crear(new Equipo_MantenimientoDTO(equipo_Mantenimiento))){
             jPanel_Agregar_Mantenimiento_a_Equipo.getExito().setForeground(Color.green);
             jPanel_Agregar_Mantenimiento_a_Equipo.getExito().setText("Operación exitosa");
             jPanel_Agregar_Mantenimiento_a_Equipo.limpiar();
        }
        else {
            jPanel_Agregar_Mantenimiento_a_Equipo.getExito().setForeground(Color.red);
            jPanel_Agregar_Mantenimiento_a_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelMantenimiento() {
        jPanel_Agregar_Mantenimiento_a_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarMantenimiento(e);
            }
        });
    }
    
    private void actionEliminarMantenimiento(){
        if(jPanel_Eliminar_Mantenimiento_a_Equipo==null){
            jPanel_Eliminar_Mantenimiento_a_Equipo = new JPanel_Eliminar_Mantenimiento_a_Equipo();
            formulario.getPanelTabbedPane().addTab("Mantenimiento", null, jPanel_Eliminar_Mantenimiento_a_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Mantenimiento_a_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Mantenimiento_a_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelMantenimiento();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Mantenimiento_a_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Mantenimiento_a_Equipo=null;
                accionEliminarPanelMantenimiento();
            }
        }
    }
    
    public void actionEliminarMantenimiento(ActionEvent ae) {       
        Equipo_Mantenimiento equipo_Mantenimiento = new Equipo_Mantenimiento();
        equipo_Mantenimiento.setFecha((jPanel_Eliminar_Mantenimiento_a_Equipo.getFecha_mantenimiento_JCalendar().getDate()).toString());
        equipo_Mantenimiento.setMotivo(jPanel_Eliminar_Mantenimiento_a_Equipo.getMotivo_mantenimiento_JTextArea().getText());
        equipo_Mantenimiento.setFk_id_equipo(jPanel_Eliminar_Mantenimiento_a_Equipo.getId_equipo_Choice().getSelectedItem());
        equipo_Mantenimiento.setFk_id_mantenimiento(jPanel_Eliminar_Mantenimiento_a_Equipo.getId_mantenimiento_Choice().getSelectedItem());
        
        Equipo_MantenimientoDAO eDAO= new Equipo_MantenimientoDAO();
        
        if(eDAO.delete(new Equipo_MantenimientoDTO(equipo_Mantenimiento))){
             jPanel_Eliminar_Mantenimiento_a_Equipo.getExito().setForeground(Color.green);
             jPanel_Eliminar_Mantenimiento_a_Equipo.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Mantenimiento_a_Equipo.limpiar();
        }
        else {
            jPanel_Eliminar_Mantenimiento_a_Equipo.getExito().setForeground(Color.red);
            jPanel_Eliminar_Mantenimiento_a_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelMantenimiento() {
        jPanel_Eliminar_Mantenimiento_a_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarMantenimiento(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de mantenimiento
     */
    
    /**
     * inicio metodos para las acciones de marca
     */
    
    private void actionActualizar_Marca(){
        if(jPanel_Actualizar_Marca_Equipo==null){
            jPanel_Actualizar_Marca_Equipo = new JPanel_Actualizar_Marca_Equipo();
            formulario.getPanelTabbedPane().addTab("Marca Equipo", null, jPanel_Actualizar_Marca_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Marca_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Marca_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelMarca();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Marca_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Marca_Equipo=null;
                accionActualizarPanelMarca();
            }
        }
    }
    
    public void actionActualizarMarca(ActionEvent ae) {       
        Marca marca = new Marca();
        marca.setId_marca(jPanel_Actualizar_Marca_Equipo.getId_marca_JTextField().getText());
        marca.setDescripcion(jPanel_Actualizar_Marca_Equipo.getDescripcion_marca_JTextArea().getText());
        
        MarcaDAO mDAO= new MarcaDAO();
        
        if(mDAO.update(new MarcaDTO(marca))){
             jPanel_Actualizar_Marca_Equipo.getExito().setForeground(Color.green);
             jPanel_Actualizar_Marca_Equipo.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Marca_Equipo.limpiar();
        }
        else {
            jPanel_Actualizar_Marca_Equipo.getExito().setForeground(Color.red);
            jPanel_Actualizar_Marca_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelMarca() {
        jPanel_Actualizar_Marca_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarMarca(e);
            }
        });
    }
    
    private void actionAgregar_Marca(){
        if(jPanel_Agregar_Marca_Equipo==null){
            jPanel_Agregar_Marca_Equipo = new JPanel_Agregar_Marca_Equipo();
            formulario.getPanelTabbedPane().addTab("Marca Equipo", null, jPanel_Agregar_Marca_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Marca_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Marca_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelMarca();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Marca_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Marca_Equipo=null;
                accionAgregarPanelMarca();
            }
        }
    }
    
    public void actionAgregarMarca(ActionEvent ae) {       
        Marca marca= new Marca();
        marca.setId_marca(jPanel_Agregar_Marca_Equipo.getId_marca_JTextField().getText());
        marca.setDescripcion(jPanel_Agregar_Marca_Equipo.getDescripcion_marca_JTextArea().getText());
        
        MarcaDAO mDAO= new MarcaDAO();
        
        if(mDAO.crear(new MarcaDTO(marca))){
             jPanel_Agregar_Marca_Equipo.getExito().setForeground(Color.green);
             jPanel_Agregar_Marca_Equipo.getExito().setText("Operación exitosa");
             jPanel_Agregar_Marca_Equipo.limpiar();
        }
        else {
            jPanel_Agregar_Marca_Equipo.getExito().setForeground(Color.red);
            jPanel_Agregar_Marca_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelMarca() {
        jPanel_Agregar_Marca_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarMarca(e);
            }
        });
    }
    
    private void actionEliminar_Marca(){
        if(jPanel_Eliminar_Marca_Equipo==null){
            jPanel_Eliminar_Marca_Equipo = new JPanel_Eliminar_Marca_Equipo();
            formulario.getPanelTabbedPane().addTab("Marca Equipo", null, jPanel_Eliminar_Marca_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Marca_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Marca_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelMarca();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Marca_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Marca_Equipo=null;
                accionEliminarPanelMarca();
            }
        }
    }
    
    public void actionEliminarMarca(ActionEvent ae) {       
        Marca marca = new Marca();
        marca.setId_marca(jPanel_Eliminar_Marca_Equipo.getId_marca_JTextField().getText());
        marca.setDescripcion(jPanel_Eliminar_Marca_Equipo.getDescripcion_marca_JTextArea().getText());
        
        MarcaDAO mDAO= new MarcaDAO();
        
        if(mDAO.delete(new MarcaDTO(marca))){
             jPanel_Eliminar_Marca_Equipo.getExito().setForeground(Color.green);
             jPanel_Eliminar_Marca_Equipo.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Marca_Equipo.limpiar();
        }
        else {
            jPanel_Eliminar_Marca_Equipo.getExito().setForeground(Color.red);
            jPanel_Eliminar_Marca_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelMarca() {
        jPanel_Eliminar_Marca_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarMarca(e);
            }
        });
    }
    /**
     * fin metodos para las acciones de marca
     */
    
    /**
     * inicio metodos para las acciones de persona
     */
    
    private void actionActualizar_Persona(){
        if(jPanel_Actualizar_Persona==null){
            jPanel_Actualizar_Persona = new JPanel_Actualizar_Persona();
            formulario.getPanelTabbedPane().addTab("Persona", null, jPanel_Actualizar_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Persona=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelPersona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Persona=null;
                accionActualizarPanelPersona();
            }
        }
    }
    
    public void actionActualizarPersona(ActionEvent ae) {       
        Persona persona = new Persona();
        persona.setId_persona(Integer.parseInt(jPanel_Actualizar_Persona.getCedula_JTextField().getText()));
        persona.setNombre(jPanel_Actualizar_Persona.getNombre_JTextField().getText());
        persona.setApellido(jPanel_Actualizar_Persona.getApellido_JTextField().getText());
        persona.setDireccion(jPanel_Actualizar_Persona.getDireccion_JTextField().getText());
        persona.setCorreo(jPanel_Actualizar_Persona.getCorreo_JTextField().getText());
        
        PersonaDAO pDAO= new PersonaDAO();
        
        if(pDAO.update(new PersonaDTO(persona))){
             jPanel_Actualizar_Persona.getExito().setForeground(Color.green);
             jPanel_Actualizar_Persona.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Persona.limpiar();
        }
        else {
            jPanel_Actualizar_Persona.getExito().setForeground(Color.red);
            jPanel_Actualizar_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelPersona() {
        jPanel_Actualizar_Persona.getRegistrarJButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarPersona(e);
            }
        });
    }
    
    private void actionAgregar_Persona(){
        if(jPanel_Agregar_Persona==null){
            jPanel_Agregar_Persona = new JPanel_Agregar_Persona();
            formulario.getPanelTabbedPane().addTab("Persona", null, jPanel_Agregar_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Persona=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelPersona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Persona=null;
                accionAgregarPanelPersona();
            }
        }
    }
    
    public void actionAgregarPersona(ActionEvent ae) {       
        Persona persona = new Persona();
        persona.setId_persona(Integer.parseInt(jPanel_Agregar_Persona.getCedula_JTextField().getText()));
        persona.setNombre(jPanel_Agregar_Persona.getNombre_JTextField().getText());
        persona.setApellido(jPanel_Agregar_Persona.getApellido_JTextField().getText());
        persona.setDireccion(jPanel_Agregar_Persona.getDireccion_JTextField().getText());
        persona.setCorreo(jPanel_Agregar_Persona.getCorreo_JTextField().getText());
        
        PersonaDAO pDAO= new PersonaDAO();
        
        if(pDAO.crear(new PersonaDTO(persona))){
             jPanel_Agregar_Persona.getExito().setForeground(Color.green);
             jPanel_Agregar_Persona.getExito().setText("Operación exitosa");
             jPanel_Agregar_Persona.limpiar();
        }
        else {
            jPanel_Agregar_Persona.getExito().setForeground(Color.red);
            jPanel_Agregar_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelPersona() {
        jPanel_Agregar_Persona.getRegistrarJButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarPersona(e);
            }
        });
    }
    
    private void actionEliminar_Persona(){
        if(jPanel_Eliminar_Persona==null){
            jPanel_Eliminar_Persona = new JPanel_Eliminar_Persona();
            formulario.getPanelTabbedPane().addTab("Persona", null, jPanel_Eliminar_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Persona=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelPersona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Persona=null;
                accionEliminarPanelPersona();
            }
        }
    }
    
    public void actionEliminarPersona(ActionEvent ae) {       
        Persona persona = new Persona();
        persona.setId_persona(Integer.parseInt(jPanel_Eliminar_Persona.getCedula_JTextField().getText()));
        persona.setNombre(jPanel_Eliminar_Persona.getNombre_JTextField().getText());
        persona.setApellido(jPanel_Eliminar_Persona.getApellido_JTextField().getText());
        persona.setDireccion(jPanel_Eliminar_Persona.getDireccion_JTextField().getText());
        persona.setCorreo(jPanel_Eliminar_Persona.getCorreo_JTextField().getText());
        
        PersonaDAO pDAO= new PersonaDAO();
        
        if(pDAO.update(new PersonaDTO(persona))){
             jPanel_Eliminar_Persona.getExito().setForeground(Color.green);
             jPanel_Eliminar_Persona.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Persona.limpiar();
        }
        else {
            jPanel_Eliminar_Persona.getExito().setForeground(Color.red);
            jPanel_Eliminar_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelPersona() {
        jPanel_Eliminar_Persona.getRegistrarJButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarPersona(e);
            }
        });
    }
    /**
     * fin metodos para las acciones de persona
     */
    
    /**
     * inicio metodos para las acciones de Rol_a_Persona
     */
    
    private void actionActualizar_Rol_a_Persona(){
        if(jPanel_Actualizar_Rol_a_Persona==null){
            jPanel_Actualizar_Rol_a_Persona = new JPanel_Actualizar_Rol_a_Persona();
            formulario.getPanelTabbedPane().addTab("Otorgar Rol", null, jPanel_Actualizar_Rol_a_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Rol_a_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Rol_a_Persona=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanel_Rol_a_Persona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Rol_a_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Rol_a_Persona=null;
                accionActualizarPanel_Rol_a_Persona();
            }
        }
    }
    
    public void actionActualizar_Rol_a_Persona(ActionEvent ae) {       
        Rol_Persona rol_Persona = new Rol_Persona();
        rol_Persona.setFecha_inicio((jPanel_Actualizar_Rol_a_Persona.getFecha_inicio_JCalendar().getDate()).toString());
        rol_Persona.setFecha_finalizacion((jPanel_Actualizar_Rol_a_Persona.getFecha_finalizacion_JCalendar().getDate()).toString());
        rol_Persona.setId_persona(Integer.parseInt(jPanel_Actualizar_Rol_a_Persona.getId_persona_Choice().getSelectedItem()));
        rol_Persona.setId_rol(jPanel_Actualizar_Rol_a_Persona.getId_rol_Choice().getSelectedItem());
        
        Rol_PersonaDAO rDAO= new Rol_PersonaDAO();
        
        if(rDAO.update(new Rol_PersonaDTO(rol_Persona))){
             jPanel_Actualizar_Rol_a_Persona.getExito().setForeground(Color.green);
             jPanel_Actualizar_Rol_a_Persona.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Rol_a_Persona.limpiar();
        }
        else {
            jPanel_Actualizar_Rol_a_Persona.getExito().setForeground(Color.red);
            jPanel_Actualizar_Rol_a_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanel_Rol_a_Persona() {
        jPanel_Actualizar_Rol_a_Persona.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizar_Rol_a_Persona(e);
            }
        });
    }
    
    private void actionAgregar_Rol_a_Persona(){
        if(jPanel_Agregar_Rol_a_Persona==null){
            jPanel_Agregar_Rol_a_Persona = new JPanel_Agregar_Rol_a_Persona();
            formulario.getPanelTabbedPane().addTab("Otorgar Rol", null, jPanel_Agregar_Rol_a_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Rol_a_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Rol_a_Persona=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanel_Rol_a_Persona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Rol_a_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Rol_a_Persona=null;
                accionAgregarPanel_Rol_a_Persona();
            }
        }
    }
    
    public void actionAgregar_Rol_a_Persona(ActionEvent ae) {       
        Rol_Persona rol_Persona = new Rol_Persona();
        rol_Persona.setFecha_inicio((jPanel_Agregar_Rol_a_Persona.getFecha_inicio_JCalendar().getDate()).toString());
        rol_Persona.setFecha_finalizacion((jPanel_Agregar_Rol_a_Persona.getFecha_finalizacion_JCalendar().getDate()).toString());
        rol_Persona.setId_persona(Integer.parseInt(jPanel_Agregar_Rol_a_Persona.getId_persona_Choice().getSelectedItem()));
        rol_Persona.setId_rol(jPanel_Agregar_Rol_a_Persona.getId_rol_Choice().getSelectedItem());
        
        Rol_PersonaDAO rDAO= new Rol_PersonaDAO();
        
        if(rDAO.crear(new Rol_PersonaDTO(rol_Persona))){
             jPanel_Agregar_Rol_a_Persona.getExito().setForeground(Color.green);
             jPanel_Agregar_Rol_a_Persona.getExito().setText("Operación exitosa");
             jPanel_Agregar_Rol_a_Persona.limpiar();
        }
        else {
            jPanel_Agregar_Rol_a_Persona.getExito().setForeground(Color.red);
            jPanel_Agregar_Rol_a_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanel_Rol_a_Persona() {
        jPanel_Agregar_Rol_a_Persona.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregar_Rol_a_Persona(e);
            }
        });
    }
    
    private void actionEliminar_Rol_a_Persona(){
        if(jPanel_Eliminar_Rol_a_Persona==null){
            jPanel_Eliminar_Rol_a_Persona = new JPanel_Eliminar_Rol_a_Persona();
            formulario.getPanelTabbedPane().addTab("Otorgar Rol", null, jPanel_Eliminar_Rol_a_Persona, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Rol_a_Persona);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Rol_a_Persona=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanel_Rol_a_Persona();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Rol_a_Persona); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Rol_a_Persona=null;
                accionEliminarPanel_Rol_a_Persona();
            }
        }
    }
    
    public void actionEliminar_Rol_a_Persona(ActionEvent ae) {       
        Rol_Persona rol_Persona = new Rol_Persona();
        rol_Persona.setFecha_inicio((jPanel_Eliminar_Rol_a_Persona.getFecha_inicio_JCalendar().getDate()).toString());
        rol_Persona.setFecha_finalizacion((jPanel_Eliminar_Rol_a_Persona.getFecha_finalizacion_JCalendar().getDate()).toString());
        rol_Persona.setId_persona(Integer.parseInt(jPanel_Eliminar_Rol_a_Persona.getId_persona_Choice().getSelectedItem()));
        rol_Persona.setId_rol(jPanel_Eliminar_Rol_a_Persona.getId_rol_Choice().getSelectedItem());
        
        Rol_PersonaDAO rDAO= new Rol_PersonaDAO();
        
        if(rDAO.delete(new Rol_PersonaDTO(rol_Persona))){
             jPanel_Eliminar_Rol_a_Persona.getExito().setForeground(Color.green);
             jPanel_Eliminar_Rol_a_Persona.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Rol_a_Persona.limpiar();
        }
        else {
            jPanel_Eliminar_Rol_a_Persona.getExito().setForeground(Color.red);
            jPanel_Eliminar_Rol_a_Persona.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanel_Rol_a_Persona() {
        jPanel_Eliminar_Rol_a_Persona.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminar_Rol_a_Persona(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de Rol_a_Persona
     */
    
    /**
     * inicio metodos para las acciones de Rol
     */
    
    private void actionActualizar_Rol(){
        if(jPanel_Actualizar_Rol==null){
            jPanel_Actualizar_Rol = new JPanel_Actualizar_Rol();
            formulario.getPanelTabbedPane().addTab("Rol", null, jPanel_Actualizar_Rol, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Rol);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Rol=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelRol();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Rol); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Rol=null;
                accionActualizarPanelRol();
            }
        }
    }
    
    public void actionActualizarRol(ActionEvent ae) {       
        Rol rol = new Rol();
        
        rol.setId_persona(jPanel_Actualizar_Rol.getId_rol_JTextField().getText());
        rol.setNombre(jPanel_Actualizar_Rol.getNombre_rol_JTextField().getText());
        
        RolDAO rDAO= new RolDAO();
        
        if(rDAO.update(new RolDTO(rol))){
             jPanel_Actualizar_Rol.getExito().setForeground(Color.green);
             jPanel_Actualizar_Rol.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Rol.limpiar();
        }
        else {
            jPanel_Actualizar_Rol.getExito().setForeground(Color.red);
            jPanel_Actualizar_Rol.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelRol() {
        jPanel_Actualizar_Rol.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarRol(e);
            }
        });
    }
    
    private void actionAgregar_Rol(){
        if(jPanel_Agregar_Rol==null){
            jPanel_Agregar_Rol = new JPanel_Agregar_Rol();
            formulario.getPanelTabbedPane().addTab("Rol", null, jPanel_Agregar_Rol, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Rol);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Rol=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelRol();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Rol); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Rol=null;
                accionAgregarPanelRol();
            }
        }
    }
    
    public void actionAgregarRol(ActionEvent ae) {       
        Rol rol = new Rol();
        
        rol.setId_persona(jPanel_Agregar_Rol.getId_rol_JTextField().getText());
        rol.setNombre(jPanel_Agregar_Rol.getNombre_rol_JTextField().getText());
        
        RolDAO rDAO= new RolDAO();
        
        if(rDAO.crear(new RolDTO(rol))){
             jPanel_Agregar_Rol.getExito().setForeground(Color.green);
             jPanel_Agregar_Rol.getExito().setText("Operación exitosa");
             jPanel_Agregar_Rol.limpiar();
        }
        else {
            jPanel_Agregar_Rol.getExito().setForeground(Color.red);
            jPanel_Agregar_Rol.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelRol() {
        jPanel_Agregar_Rol.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarRol(e);
            }
        });
    }
    
    private void actionEliminar_Rol(){
        if(jPanel_Eliminar_Rol==null){
            jPanel_Eliminar_Rol = new JPanel_Eliminar_Rol();
            formulario.getPanelTabbedPane().addTab("Rol", null, jPanel_Eliminar_Rol, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Rol);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Rol=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelRol();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Rol); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Rol=null;
                accionEliminarPanelRol();
            }
        }
    }
    
    public void actionEliminarRol(ActionEvent ae) {       
        Rol rol = new Rol();
        
        rol.setId_persona(jPanel_Eliminar_Rol.getId_rol_JTextField().getText());
        rol.setNombre(jPanel_Eliminar_Rol.getNombre_rol_JTextField().getText());
        
        RolDAO rDAO= new RolDAO();
        
        if(rDAO.delete(new RolDTO(rol))){
             jPanel_Eliminar_Rol.getExito().setForeground(Color.green);
             jPanel_Eliminar_Rol.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Rol.limpiar();
        }
        else {
            jPanel_Eliminar_Rol.getExito().setForeground(Color.red);
            jPanel_Eliminar_Rol.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelRol() {
        jPanel_Eliminar_Rol.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarRol(e);
            }
        });
    }
    /**
     * fin metodos para las acciones de Rol
     */
    
    /**
     * inicio metodos para las acciones de Sala
     */
    
    private void actionActualizar_Sala(){
        if(jPanel_Actualizar_Sala==null){
            jPanel_Actualizar_Sala = new JPanel_Actualizar_Sala();
            formulario.getPanelTabbedPane().addTab("Sala", null, jPanel_Actualizar_Sala, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Sala);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Sala=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelSala();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Sala); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Sala=null;
                accionActualizarPanelSala();
            }
        }
    }
    
    public void actionActualizarSala(ActionEvent ae) {       
        Sala sala = new Sala();
        sala.setId_sala(Integer.parseInt(jPanel_Actualizar_Sala.getId_sala_JTextField().getText()));
        sala.setId_sede(Integer.parseInt(jPanel_Actualizar_Sala.getId_sede_Choice().getSelectedItem()));
        sala.setCapacidad(Integer.parseInt(jPanel_Actualizar_Sala.getCapacidad_JTextField().getText()));
        sala.setNombre(jPanel_Actualizar_Sala.getNombre_JTextField().getText());
        sala.setActual(Integer.parseInt(jPanel_Actualizar_Sala.getActual_JTextField().getText()));
        
        SalaDAO sDAO= new SalaDAO();
        
        if(sDAO.update(new SalaDTO(sala))){
             jPanel_Actualizar_Sala.getExito().setForeground(Color.green);
             jPanel_Actualizar_Sala.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Sala.limpiar();
        }
        else {
            jPanel_Actualizar_Sala.getExito().setForeground(Color.red);
            jPanel_Actualizar_Sala.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelSala() {
        jPanel_Actualizar_Sala.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarSala(e);
            }
        });
    }
    
    private void actionAgregar_Sala(){
        if(jPanel_Agregar_Sala==null){
            jPanel_Agregar_Sala = new JPanel_Agregar_Sala();
            formulario.getPanelTabbedPane().addTab("Sala", null, jPanel_Agregar_Sala, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Sala);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Sala=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelSala();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Sala); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Sala=null;
                accionAgregarPanelSala();
            }
        }
    }
    
    public void actionAgregarSala(ActionEvent ae) {       
        Sala sala = new Sala();
        sala.setId_sala(Integer.parseInt(jPanel_Agregar_Sala.getId_sala_JTextField().getText()));
        sala.setId_sede(Integer.parseInt(jPanel_Agregar_Sala.getId_sede_Choice().getSelectedItem()));
        sala.setCapacidad(Integer.parseInt(jPanel_Agregar_Sala.getCapacidad_JTextField().getText()));
        sala.setNombre(jPanel_Agregar_Sala.getNombre_JTextField().getText());
        sala.setActual(Integer.parseInt(jPanel_Agregar_Sala.getActual_JTextField().getText()));
        
        SalaDAO sDAO= new SalaDAO();
        
        if(sDAO.crear(new SalaDTO(sala))){
             jPanel_Agregar_Sala.getExito().setForeground(Color.green);
             jPanel_Agregar_Sala.getExito().setText("Operación exitosa");
             jPanel_Agregar_Sala.limpiar();
        }
        else {
            jPanel_Agregar_Sala.getExito().setForeground(Color.red);
            jPanel_Agregar_Sala.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelSala() {
        jPanel_Agregar_Sala.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarSala(e);
            }
        });
    }
    
    private void actionEliminar_Sala(){
        if(jPanel_Eliminar_Sala==null){
            jPanel_Eliminar_Sala = new JPanel_Eliminar_Sala();
            formulario.getPanelTabbedPane().addTab("Sala", null, jPanel_Eliminar_Sala, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Sala);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Sala=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelSala();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Sala); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Sala=null;
                accionEliminarPanelSala();
            }
        }
    }
    
    public void actionEliminarSala(ActionEvent ae) {       
        Sala sala = new Sala();
        sala.setId_sala(Integer.parseInt(jPanel_Eliminar_Sala.getId_sala_JTextField().getText()));
        sala.setId_sede(Integer.parseInt(jPanel_Eliminar_Sala.getId_sede_Choice().getSelectedItem()));
        sala.setCapacidad(Integer.parseInt(jPanel_Eliminar_Sala.getCapacidad_JTextField().getText()));
        sala.setNombre(jPanel_Eliminar_Sala.getNombre_JTextField().getText());
        sala.setActual(Integer.parseInt(jPanel_Eliminar_Sala.getActual_JTextField().getText()));
        
        SalaDAO sDAO= new SalaDAO();
        
        if(sDAO.crear(new SalaDTO(sala))){
             jPanel_Eliminar_Sala.getExito().setForeground(Color.green);
             jPanel_Eliminar_Sala.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Sala.limpiar();
        }
        else {
            jPanel_Eliminar_Sala.getExito().setForeground(Color.red);
            jPanel_Eliminar_Sala.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelSala() {
        jPanel_Eliminar_Sala.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarSala(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de Sala
     */
    
    /**
     * inicio metodos para las acciones de Sede
     */
    
    private void actionActualizar_Sede(){
        if(jPanel_Actualizar_Sede==null){
            jPanel_Actualizar_Sede = new JPanel_Actualizar_Sede();
            formulario.getPanelTabbedPane().addTab("Sede", null, jPanel_Actualizar_Sede, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Sede);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Sede=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelSede();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Sede); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Sede=null;
                accionActualizarPanelSede();
            }
        }
    }
    
    public void actionActualizarSede(ActionEvent ae) {       
        Sede sede = new Sede();
        sede.setId_sede(Integer.parseInt(jPanel_Actualizar_Sede.getId_sede_JTextField().getText()));
        sede.setNombre(jPanel_Actualizar_Sede.getNombre_JTextField().getText());
        sede.setTelefono(jPanel_Actualizar_Sede.getTelefono_JTextField().getText());
        sede.setDireccion(jPanel_Actualizar_Sede.getDireccion_JTextField().getText());
        sede.setCorreo(jPanel_Actualizar_Sede.getCorreo_JTextField().getText());
        sede.setId_ciudad(jPanel_Actualizar_Sede.getId_ciudad_Choice().getSelectedItem());
        
        SedeDAO sDAO= new SedeDAO();
        
        if(sDAO.delete(new SedeDTO(sede))){
             jPanel_Actualizar_Sede.getExito().setForeground(Color.green);
             jPanel_Actualizar_Sede.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Sede.limpiar();
        }
        else {
            jPanel_Actualizar_Sede.getExito().setForeground(Color.red);
            jPanel_Actualizar_Sede.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelSede() {
        jPanel_Actualizar_Sede.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarSede(e);
            }
        });
    }
    
    private void actionAgregar_Sede(){
        if(jPanel_Agregar_Sede==null){
            jPanel_Agregar_Sede = new JPanel_Agregar_Sede();
            formulario.getPanelTabbedPane().addTab("Sede", null, jPanel_Agregar_Sede, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Sede);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Sede=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelSede();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Sede); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Sede=null;
                accionAgregarPanelSede();
            }
        }
    }
    
    public void actionAgregarSede(ActionEvent ae) {       
        Sede sede = new Sede();
        sede.setId_sede(Integer.parseInt(jPanel_Agregar_Sede.getId_sede_JTextField().getText()));
        sede.setNombre(jPanel_Agregar_Sede.getNombre_JTextField().getText());
        sede.setTelefono(jPanel_Agregar_Sede.getTelefono_JTextField().getText());
        sede.setDireccion(jPanel_Agregar_Sede.getDireccion_JTextField().getText());
        sede.setCorreo(jPanel_Agregar_Sede.getCorreo_JTextField().getText());
        sede.setId_ciudad(jPanel_Agregar_Sede.getId_ciudad_Choice().getSelectedItem());
        
        SedeDAO sDAO= new SedeDAO();
        
        if(sDAO.crear(new SedeDTO(sede))){
             jPanel_Agregar_Sede.getExito().setForeground(Color.green);
             jPanel_Agregar_Sede.getExito().setText("Operación exitosa");
             jPanel_Agregar_Sede.limpiar();
        }
        else {
            jPanel_Agregar_Sede.getExito().setForeground(Color.red);
            jPanel_Agregar_Sede.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelSede() {
        jPanel_Agregar_Sede.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarSede(e);
            }
        });
    }
    
    private void actionEliminar_Sede(){
        if(jPanel_Eliminar_Sede==null){
            jPanel_Eliminar_Sede = new JPanel_Eliminar_Sede();
            formulario.getPanelTabbedPane().addTab("Sede", null, jPanel_Eliminar_Sede, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Sede);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Sede=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelSede();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Sede); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Sede=null;
                accionEliminarPanelSede();
            }
        }
    }
    
    public void actionEliminarSede(ActionEvent ae) {       
        Sede sede = new Sede();
        sede.setId_sede(Integer.parseInt(jPanel_Eliminar_Sede.getId_sede_JTextField().getText()));
        sede.setNombre(jPanel_Eliminar_Sede.getNombre_JTextField().getText());
        sede.setTelefono(jPanel_Eliminar_Sede.getTelefono_JTextField().getText());
        sede.setDireccion(jPanel_Eliminar_Sede.getDireccion_JTextField().getText());
        sede.setCorreo(jPanel_Eliminar_Sede.getCorreo_JTextField().getText());
        sede.setId_ciudad(jPanel_Eliminar_Sede.getId_ciudad_Choice().getSelectedItem());
        
        SedeDAO sDAO= new SedeDAO();
        
        if(sDAO.delete(new SedeDTO(sede))){
             jPanel_Eliminar_Sede.getExito().setForeground(Color.green);
             jPanel_Eliminar_Sede.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Sede.limpiar();
        }
        else {
            jPanel_Eliminar_Sede.getExito().setForeground(Color.red);
            jPanel_Eliminar_Sede.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelSede() {
        jPanel_Eliminar_Sede.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarSede(e);
            }
        });
    }
    
    /**
     * fin metodos para las acciones de Sede
     */
    
    /**
     * inicio metodos para las acciones de Tipo_Equipo
     */
    private void actionActualizar_Tipo_Equipo(){
        if(jPanel_Actualizar_Tipo_Equipo==null){
            jPanel_Actualizar_Tipo_Equipo = new JPanel_Actualizar_Tipo_Equipo();
            formulario.getPanelTabbedPane().addTab("Tipo Equipo", null, jPanel_Actualizar_Tipo_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/actualizar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Tipo_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Actualizar_Tipo_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionActualizarPanelTipoEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Actualizar_Tipo_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Actualizar_Tipo_Equipo=null;
                accionActualizarPanelTipoEquipo();
            }
        }
    }
    
    public void actionActualizarTipoEquipo(ActionEvent ae) {       
        Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
        tipo_Equipo.setId_Tipo_Equipo(jPanel_Actualizar_Tipo_Equipo.getId_tipo_equipo_JTextField().getText());
        tipo_Equipo.setDescripcion(jPanel_Actualizar_Tipo_Equipo.getDescripcion_JTextArea().getText());
        
        Tipo_EquipoDAO tDAO= new Tipo_EquipoDAO();
        
        if(tDAO.update(new Tipo_EquipoDTO(tipo_Equipo))){
             jPanel_Actualizar_Tipo_Equipo.getExito().setForeground(Color.green);
             jPanel_Actualizar_Tipo_Equipo.getExito().setText("Operación exitosa");
             jPanel_Actualizar_Tipo_Equipo.limpiar();
        }
        else {
            jPanel_Actualizar_Tipo_Equipo.getExito().setForeground(Color.red);
            jPanel_Actualizar_Tipo_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionActualizarPanelTipoEquipo() {
        jPanel_Actualizar_Tipo_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionActualizarTipoEquipo(e);
            }
        });
    }
    
    private void actionAgregar_Tipo_Equipo(){
        if(jPanel_Agregar_Tipo_Equipo==null){
            jPanel_Agregar_Tipo_Equipo = new JPanel_Agregar_Tipo_Equipo();
            formulario.getPanelTabbedPane().addTab("Tipo Equipo", null, jPanel_Agregar_Tipo_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/agregar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Tipo_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Agregar_Tipo_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionAgregarPanelTipoEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Agregar_Tipo_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Agregar_Tipo_Equipo=null;
                accionAgregarPanelTipoEquipo();
            }
        }
    }
    
    public void actionAgregarTipoEquipo(ActionEvent ae) {       
        Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
        tipo_Equipo.setId_Tipo_Equipo(jPanel_Agregar_Tipo_Equipo.getId_tipo_equipo_JTextField().getText());
        tipo_Equipo.setDescripcion(jPanel_Agregar_Tipo_Equipo.getDescripcion_JTextArea().getText());
        
        Tipo_EquipoDAO tDAO= new Tipo_EquipoDAO();
        
        if(tDAO.crear(new Tipo_EquipoDTO(tipo_Equipo))){
             jPanel_Agregar_Tipo_Equipo.getExito().setForeground(Color.green);
             jPanel_Agregar_Tipo_Equipo.getExito().setText("Operación exitosa");
             jPanel_Agregar_Tipo_Equipo.limpiar();
        }
        else {
            jPanel_Agregar_Tipo_Equipo.getExito().setForeground(Color.red);
            jPanel_Agregar_Tipo_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionAgregarPanelTipoEquipo() {
        jPanel_Agregar_Tipo_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionAgregarTipoEquipo(e);
            }
        });
    }
    
    private void actionEliminar_Tipo_Equipo(){
        if(jPanel_Eliminar_Tipo_Equipo==null){
            jPanel_Eliminar_Tipo_Equipo = new JPanel_Eliminar_Tipo_Equipo();
            formulario.getPanelTabbedPane().addTab("Tipo Equipo", null, jPanel_Eliminar_Tipo_Equipo, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/eliminar.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Tipo_Equipo);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Eliminar_Tipo_Equipo=null;
                        System.gc();
                    }
                }
            });
            accionEliminarPanelTipoEquipo();
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Eliminar_Tipo_Equipo); 
            }catch (IllegalArgumentException ex){
                jPanel_Eliminar_Tipo_Equipo=null;
                accionEliminarPanelTipoEquipo();
            }
        }
    }
    
    public void actionEliminarTipoEquipo(ActionEvent ae) {       
        Tipo_Equipo tipo_Equipo = new Tipo_Equipo();
        tipo_Equipo.setId_Tipo_Equipo(jPanel_Eliminar_Tipo_Equipo.getId_tipo_equipo_JTextField().getText());
        tipo_Equipo.setDescripcion(jPanel_Eliminar_Tipo_Equipo.getDescripcion_JTextArea().getText());
        
        Tipo_EquipoDAO tDAO= new Tipo_EquipoDAO();
        
        if(tDAO.update(new Tipo_EquipoDTO(tipo_Equipo))){
             jPanel_Eliminar_Tipo_Equipo.getExito().setForeground(Color.green);
             jPanel_Eliminar_Tipo_Equipo.getExito().setText("Operación exitosa");
             jPanel_Eliminar_Tipo_Equipo.limpiar();
        }
        else {
            jPanel_Eliminar_Tipo_Equipo.getExito().setForeground(Color.red);
            jPanel_Eliminar_Tipo_Equipo.getExito().setText("Operacion sin éxito");
        }
    }
    
    private void accionEliminarPanelTipoEquipo() {
        jPanel_Eliminar_Tipo_Equipo.getActualizar_JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            actionEliminarTipoEquipo(e);
            }
        });
    }
    /**
     * fin metodos para las acciones de Tipo_Equipo
     */
    private void actionAcerca(){
        if(jPanel_Acerca_de==null){
            jPanel_Acerca_de = new JPanel_Acerca_de();
            formulario.getPanelTabbedPane().addTab("Acerca de", null, jPanel_Acerca_de, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/informacion.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Acerca_de);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Acerca_de=null;
                        System.gc();
                    }
                }
            });
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Acerca_de); 
            }catch (IllegalArgumentException ex){
                jPanel_Acerca_de=null;
            }
        }
    }
    
    private void actionAyuda(){
        if(jPanel_Ayuda==null){
            jPanel_Ayuda = new JPanel_Ayuda();
            formulario.getPanelTabbedPane().addTab("Ayuda", null, jPanel_Ayuda, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/ayuda.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Ayuda);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Ayuda=null;
                        System.gc();
                    }
                }
            });
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Ayuda); 
            }catch (IllegalArgumentException ex){
                jPanel_Ayuda=null;
            }
        }
    }
    
    private void actionReporteEspecifico(){
        if(jPanel_Reporte==null){
            jPanel_Reporte = new JPanel_Reporte();
            formulario.getPanelTabbedPane().addTab("Reporte Especifico", null, jPanel_Reporte, "Pestaña donde se muestran los campos de añadir un nuevo registro"); // NOI18N
            ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("../vista/informacion.png"));
            TabButton tabButton=new TabButton();
            Agregar_Pestana pestaña = new Agregar_Pestana(formulario.getPanelTabbedPane(), imageIcon,tabButton);
            formulario.getPanelTabbedPane().setTabComponentAt(formulario.getPanelTabbedPane().getTabCount()-1,pestaña);
            formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Reporte);
            tabButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i = formulario.getPanelTabbedPane().indexOfTabComponent(pestaña);
                    System.out.println("esto es el indice de agregar "+i);
                    if (i != -1) {
                        formulario.getPanelTabbedPane().remove(i);
                        jPanel_Reporte=null;
                        System.gc();
                    }
                }
            });
        }
        else{
            try{
               formulario.getPanelTabbedPane().setSelectedComponent(jPanel_Reporte); 
            }catch (IllegalArgumentException ex){
                jPanel_Reporte=null;
            }
        }
    }
}