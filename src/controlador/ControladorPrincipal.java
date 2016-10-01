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
    public Hilera hilera;
    public VentanaPrincipal vp;
    private Dimension dimension;
    private JButton[] btnsHilera;


    
    

    public ControladorPrincipal() {
        
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        hilera = new Hilera();
        vp = new VentanaPrincipal(dimension,this);
        vp.setSize(dimension);
        vp.setMinimumSize(new Dimension(800, 600));
        vp.setVisible(true);
        
    }
    
    void setButtonsHilera(JButton[] buttons)
    {
        this.btnsHilera = buttons;
    }
    
    
    
    public static void main(String args[]) {
       
       ControladorPrincipal cp = new ControladorPrincipal();
  
       
        
        
    }
    
    /**
     * La situiente funcion limpia un panel JPanel para posteriormente dibujar
     * el panel que se necesita
     *
     * @param jp panel que se va limpiar
     */
    public void cleanPanel(JPanel jp) {
        jp.removeAll();
        jp.repaint();
        jp.revalidate();
    }

    /**
     * La siguiente funcion agregar el panel que se va usar jp en el panel
     * JPanelWork
     *
     * @param jp es el panel que se va agregar en el panel JpOri
     */
    public void setPanel(JPanel jp, JPanel jpOri) {
        jpOri.add(jp);
        jpOri.repaint();
        jpOri.revalidate();
    }
    
    public Dimension getDimension() {
        return dimension;
    }
    
    
}
