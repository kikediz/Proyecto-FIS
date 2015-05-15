/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.JFrame_Formulario;
import vista.JPanel_Login;


/**
 *
 * @author Maximiliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JPanel_Login logginPanel=new JPanel_Login();
        JFrame_Formulario formulario=new JFrame_Formulario();
        Controlador controlador = new Controlador(logginPanel,formulario);
        controlador.iniciarVista();
    }
    
}
