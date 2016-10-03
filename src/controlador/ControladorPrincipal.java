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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import modelo.Hilera;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class ControladorPrincipal {
    public Hilera hilera;
    public VentanaPrincipal vp;
    private Dimension dimension;
    private JButton[] btnsHilera;
    private ActionListener actionListener;
    private ActionListener actionListenerVacio;
    private boolean control = false;

    
    

    public ControladorPrincipal() {
        
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        hilera = new Hilera();
        vp = new VentanaPrincipal(dimension,this);
        vp.setSize(dimension);
        vp.setMinimumSize(new Dimension(800, 600));
        vp.setVisible(true);
        
         actionListener = new ActionListener()
            {
                public void actionPerformed(ActionEvent actionEvent) {

                        System.out.println(actionEvent.getActionCommand());
                        JButton b = (JButton) actionEvent.getSource();
                        for (int i = 0; i < btnsHilera.length; i++) {
                            if (b==btnsHilera[i]) {
                                hilera.eliminarNodo(i);
                                cleanPanel(vp.panelHilera);
                                setPanel(panelBotonesHilera(hilera),vp.panelHilera);
                            }
                        }
                        
                }
            };
         actionListenerVacio = new ActionListener()
            {
                public void actionPerformed(ActionEvent actionEvent) {
  
                }
            };
        
    }

/**
 * metodo set de la variable de control que es true cuando se presiona el boton
 * eliminar y false de lo contrario
 * @param control variable de control
 */
    public void setControl(boolean control) {
        this.control = control;
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
    
    /**
     * Esta funcion crea un panel de botones con el contenido de una hilera, 
     * cada boton es un caracter de la hilera
     * @param h hilera con el contenido que se va a crear los botones
     * @return Panel con los botones ya listos
     */
    public JPanel panelBotonesHilera(Hilera h)
    {
        if (!h.esVacia()) {
            char[] c = h.hilera2Char();
            btnsHilera = new JButton[h.getLongitud()];
            
        
            JPanel mainPanel = new JPanel();

            mainPanel.setSize(getDimension().width,100);

            mainPanel.setLayout(new java.awt.GridLayout(1, c.length));
            mainPanel.setMinimumSize(new Dimension(300, 100));
            for (int i = 0; i < c.length; i++) 
            {
                
                JButton aButton = new JButton(String.valueOf(c[i]));
                String s = String.valueOf(c[i]);
                //aButton.setName(s+String.valueOf(i));
                aButton.setMinimumSize(new Dimension(50, 100));
                aButton.setBorder(null);
                aButton.setText("");
                aButton.setBorderPainted(false);
                aButton.setContentAreaFilled(false);
                aButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                aButton.setFocusPainted(false);
                //aButton.setBackground(new java.awt.Color(255, 255, 255));
                mainPanel.add(aButton);
                int intC = (int) c[i];
                if (intC <65 || intC >90) {
                    s = s+s;
                }

                btnsHilera[i] = aButton;
                
                btnsHilera[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/"+s+".png")));
        }
            if (!control) {
                    quitarEventoBotones();
                }
                else
                {
                    eventosBotonesHilera();
                }
            mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        return mainPanel;
        }
        else
        {
            return  null;
        }
    }
    /**
     * asigna a las letras de la hilera el evento para que se puedan borrar
     * al hacerles click
     */
    public void eventosBotonesHilera()
    {
        for (int i = 0; i < btnsHilera.length; i++) {
            btnsHilera[i].addActionListener(actionListener);
        }
    }
    /**
     * quita a las letras de la hilera el evento para que se puedan borrar
     * al hacerles click
     */
    public void quitarEventoBotones()
    {
        for (int i = 0; i < btnsHilera.length; i++) {
            btnsHilera[i].addActionListener(actionListenerVacio);
            
        }
    }
    
}
