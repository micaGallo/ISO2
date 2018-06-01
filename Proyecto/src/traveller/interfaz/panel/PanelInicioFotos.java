
package traveller.interfaz.panel;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import traveller.dominio.ISistema;

public class PanelInicioFotos extends javax.swing.JPanel {

    private ISistema sistema;
    
    int contador = 0;
    private ImageIcon imagen[] = new ImageIcon[5];
    private Icon icono = new ImageIcon();
    public PanelInicioFotos() {
        initComponents();
        
        for (int i = 1; i < 5; i++) {
            imagen[i] = new ImageIcon(getClass().getResource
            ("/imagenes/foto" + i + ".jpg"));
            icono = new ImageIcon(imagen[i].getImage().getScaledInstance
            (lblFondoImgs.getWidth(), lblFondoImgs.getHeight(), 
                    Image.SCALE_DEFAULT));
        }
        lblFondoImgs.setIcon(icono);
        contador = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAnterior = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        lblFondoImgs = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaAnt.png"))); // NOI18N
        jButtonAnterior.setToolTipText("ANTERIOR");
        jButtonAnterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButtonAnterior.setContentAreaFilled(false);
        jButtonAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        add(jButtonAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 339, 70, 60));

        jButtonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaSig.png"))); // NOI18N
        jButtonSiguiente.setToolTipText("SIGUIENTE");
        jButtonSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButtonSiguiente.setContentAreaFilled(false);
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 339, 70, 60));

        lblFondoImgs.setMaximumSize(new java.awt.Dimension(479, 745));
        lblFondoImgs.setMinimumSize(new java.awt.Dimension(479, 745));
        lblFondoImgs.setName(""); // NOI18N
        lblFondoImgs.setPreferredSize(new java.awt.Dimension(479, 745));
        add(lblFondoImgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 479, 745));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        icono = new ImageIcon(imagen[contador].getImage().getScaledInstance
            (lblFondoImgs.getWidth(), lblFondoImgs.getHeight(), Image.SCALE_DEFAULT));
        if (contador == 1) {
            contador = 4;
            lblFondoImgs.setIcon(icono);
        }
        contador--;
        lblFondoImgs.setIcon(icono);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        icono = new ImageIcon(imagen[contador].getImage().getScaledInstance
            (lblFondoImgs.getWidth(), lblFondoImgs.getHeight(), Image.SCALE_DEFAULT));
        if (contador == 4) {
            contador = 0;
            lblFondoImgs.setIcon(icono);
        }
        contador++;

        lblFondoImgs.setIcon(icono);
    }//GEN-LAST:event_jButtonSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel lblFondoImgs;
    // End of variables declaration//GEN-END:variables
}
