/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaPrincipal;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import modelo.Hilera;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Alejandro
 */
public class ControladorPrincipal {
    private Hilera hilera;

    public ControladorPrincipal() {
        
    }
    
    public static void main(String args[]) {
       
       VentanaPrincipal vp = new VentanaPrincipal();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        
        vp.setSize(dimension);
        
        vp.setVisible(true);
        
        JPanel mainPanel = new JPanel();
        
        mainPanel.setSize(100, dimension.width);
        mainPanel.setLayout(new java.awt.GridLayout(1, 40));
        
        
        
        for (int i = 0; i < 10; i++)
        {
            JButton aButton = new JButton(String.valueOf(i));
            mainPanel.add(aButton);
           
            System.out.println("Added: " + (i + 1) + "buttons");
        }
        vp.setSizeButtonsMenu(dimension);
        vp.setPanelHilera(mainPanel);
        
        
        
        
    }
    
    
}
