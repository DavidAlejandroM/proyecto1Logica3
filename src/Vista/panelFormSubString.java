/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.Hilera;

/**
 *
 * @author Yaqueline Hoyos Montes, Alejandro Marín Alzate
 */
public class panelFormSubString extends javax.swing.JPanel {

    /**
     * Creates new form panelFormInsertar
     */
    public Hilera hilera;
    public Hilera hileraSub;
    private controlador.ControladorPrincipal cp;
    public panelFormSubString(Hilera hilera, controlador.ControladorPrincipal cp) {
        this.hilera = hilera;
        this.cp = cp;
        initComponents();
        this.setMinimumSize(new Dimension(300, 300));
        jButton1.setEnabled(false);
        hileraSub = new Hilera();
        
         
               
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setText("Ingrese una Hilera");

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento que valida cual de las hileras es substring de cual
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(hilera.esSubstring(hileraSub))
        {
            jLabel2.setForeground(new java.awt.Color(0, 204, 0));
            jLabel2.setText("!!! Si !!!, la hilera   "+ 
                    String.copyValueOf(hileraSub.hilera2Char())+
                    "   es subString de "+String.copyValueOf(hilera.hilera2Char()));
        }
        else if (hileraSub.esSubstring(hilera)) {
            jLabel2.setForeground(new java.awt.Color(0, 204, 0));
            jLabel2.setText("!!! Si !!!, la hilera   "+ 
                    String.copyValueOf(hilera.hilera2Char())+
                    "   es subString de "+String.copyValueOf(hileraSub.hilera2Char()));
        }
        else{
            jLabel2.setForeground(new java.awt.Color(204, 0, 0));
            jLabel2.setText("!!! NO !!!, la hilera   "+ 
                    String.copyValueOf(hileraSub.hilera2Char())+"   NO es un anagrama de   "+String.copyValueOf(hilera.hilera2Char()));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * evento que valida que solo se pedan ingresar mayusculas y minusculas
     * @param evt 
     */
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jButton1.setEnabled(true);
        char c = evt.getKeyChar();
        int code = Character.hashCode(c);
        //System.out.println(code);
        if (code > 96) {
            code = code - 32;
        }
        if(code > 64 && code < 91 )
        {
            // System.out.println(c);
            hileraSub.insertarCaracter(c);
            //Crear una hilera
        }
        else if(code == 8)
        {
            //desconectar el ultimo nodo
            hileraSub.eliminarUltimo();
        }
        else{
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
