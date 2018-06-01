/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveller.interfaz.panel;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import traveller.dominio.ISistema;

/**
 *
 * @author micaela
 */
public class PanelInicioNuevo extends javax.swing.JPanel {

     private ISistema sistema;
    
    int contador = 0;
    private ImageIcon imagen[] = new ImageIcon[5];
    private Icon icono = new ImageIcon();
    public PanelInicioNuevo(ISistema modelo) {
        initComponents();
        sistema = modelo;
        
        for (int i = 1; i < 5; i++) {
            imagen[i] = new ImageIcon(getClass().getResource
            ("/imagenes/imagen" + i + ".jpg"));
            icono = new ImageIcon(imagen[i].getImage().getScaledInstance
            (lblFondo.getWidth(), lblFondo.getHeight(), 
                    Image.SCALE_DEFAULT));
        }
        lblFondo.setIcon(icono);
        contador = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setLayout(null);

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaAnt.png"))); // NOI18N
        btnAnterior.setBorderPainted(false);
        btnAnterior.setContentAreaFilled(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        add(btnAnterior);
        btnAnterior.setBounds(15, 348, 97, 73);

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaSig.png"))); // NOI18N
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        add(btnSiguiente);
        btnSiguiente.setBounds(350, 360, 97, 73);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/foto3.jpg"))); // NOI18N
        lblFondo.setText("kiuyfdrfghj");
        lblFondo.setMaximumSize(new java.awt.Dimension(0, 0));
        lblFondo.setMinimumSize(new java.awt.Dimension(0, 0));
        lblFondo.setPreferredSize(new java.awt.Dimension(0, 0));
        add(lblFondo);
        lblFondo.setBounds(2, -4, 520, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        icono = new ImageIcon(imagen[contador].getImage().getScaledInstance
         (lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
         if (contador == 1) {
             contador = 4;
             lblFondo.setIcon(icono);
         }
         contador--;
         lblFondo.setIcon(icono);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
      icono = new ImageIcon(imagen[contador].getImage().getScaledInstance
          (lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
          if (contador == 4) {
              contador = 0;
              lblFondo.setIcon(icono);
          }
          contador++;

          lblFondo.setIcon(icono);
    }//GEN-LAST:event_btnSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
