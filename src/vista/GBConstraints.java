/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.*;


/**
 *
 * @author maximiliano
 */
public class GBConstraints extends GridBagConstraints{
    private static final
    long serialVersionUID =
         1L;
    /**
     * Metodo para establecer las restricciones u organizaciones de los elementos pertencientes a un componente
     * @param gridx numero de columna en la que se va ubicar
     * @param gridy numero de fila en la que se va ubicar
     * @param gridwidth numero de columnas que va a ocupar
     * @param gridheight numero de filas que va a ocupar
     * @param weightx porcentaje de ampliacion horizontal
     * @param weighty porcentaje de ampliacion vertical
     * @param anchor tipo de orientacion del componente dentro del campo de visualizacion, por default centro
     * @param fill reestablece el tamanio de acuerdo al campo de visualizacion
     * @param insets determina la ubicacion del componente de acuerdo al borde del campo de visualizacion, el valor por defecto es new Insets(int arriba,int izquierda,int abajo,int derecha)
     * @param ipadx especifica el espaciado a agregar a la anchura minima
     * @param ipady especifica el espaciado a agrega a la altura minima
     */
    public GBConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill, java.awt.Insets insets, int ipadx, int ipady){
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridwidth;
        this.gridheight = gridheight;
        this.weightx = weightx;
        this.weighty = weighty;
        this.anchor = anchor;
        this.fill = fill;
        this.insets = insets;
        this.ipadx = ipadx;
        this.ipady = ipady;
    }
}
