package traveller.interfaz.panel;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import traveller.dominio.ISistema;
import traveller.excepciones.comentario.ComentarioException;
import traveller.excepciones.fecha.FechaException;
import traveller.excepciones.viaje.ViajeException;

public class PanelAgendarViajeBien extends javax.swing.JPanel {

    public PanelAgendarViajeBien(ISistema sistema) {
        initComponents();

        this.sistema = sistema;
        ocultarAgregarNuevoDestino();
        actualizarComboBox();
        if (this.sistema.esModoDesarrollador()) {
            this.txtNombre.requestFocusInWindow();
            this.txtNombre.setText("Vacaciones");
            this.txtDescripcion.setText("Nos vamos de vacaciones con la familia."); 
            Calendar c2 = new GregorianCalendar();
            jDateFechaInicio.setCalendar(c2);
            jDateFechaFin.setCalendar(c2);
        } else {
            this.txtNombre.requestFocusInWindow();
        }
    }
    
     public void actualizarComboBox(){
        comboDestino.removeAllItems();
        for(int i=0;i<sistema.getListaCiudades().size();i++){
            comboDestino.addItem(sistema.getListaCiudades().get(i));
        }
    }
     
     public void ocultarAgregarNuevoDestino(){
         txtNuevoDestino.setVisible(false);
         etqNuevoDestino.setVisible(false);
         btnAgregarDestino.setVisible(false);
     }
     
     public void mostrarAgregarNuevoDestino(){
         txtNuevoDestino.setVisible(true);
         etqNuevoDestino.setVisible(true);
         btnAgregarDestino.setVisible(true);
     }
     
     public void limpiarCampos(){
         txtDescripcion.setText("");
         txtNombre.setText("");
         txtNuevoDestino.setText("");
         comboDestino.setSelectedItem(null);
         jDateFechaFin.setDate(null);
         jDateFechaInicio.setDate(null);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqNombre = new javax.swing.JLabel();
        etqDestino = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnMostrarParaAgregarDestino = new javax.swing.JButton();
        txtNuevoDestino = new javax.swing.JTextField();
        etqNuevoDestino = new javax.swing.JLabel();
        btnAgregarDestino = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaInicio = new com.toedter.calendar.JDateChooser();
        jDateFechaFin = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        btnAgendar = new javax.swing.JButton();
        etqCorrecto = new javax.swing.JLabel();
        etqError = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox();
        panelTitulo1 = new javax.swing.JPanel();
        etqTitulo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo.setLayout(null);

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("AGENDAR VIAJE");
        panelTitulo.add(etqTitulo);
        etqTitulo.setBounds(10, 20, 150, 24);

        add(panelTitulo);
        panelTitulo.setBounds(0, 0, 480, 0);

        etqNombre.setText("Nombre:");
        add(etqNombre);
        etqNombre.setBounds(15, 123, 63, 20);

        etqDestino.setText("Destino:");
        add(etqDestino);
        etqDestino.setBounds(15, 165, 59, 20);
        add(txtNombre);
        txtNombre.setBounds(118, 120, 334, 26);

        btnMostrarParaAgregarDestino.setText("Agregar nuevo destino");
        btnMostrarParaAgregarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarParaAgregarDestinoActionPerformed(evt);
            }
        });
        add(btnMostrarParaAgregarDestino);
        btnMostrarParaAgregarDestino.setBounds(118, 205, 193, 29);
        add(txtNuevoDestino);
        txtNuevoDestino.setBounds(320, 205, 132, 29);

        etqNuevoDestino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etqNuevoDestino.setForeground(new java.awt.Color(0, 0, 255));
        etqNuevoDestino.setText("Escriba el nuevo destino y presione el botón +");
        add(etqNuevoDestino);
        etqNuevoDestino.setBounds(125, 251, 254, 28);

        btnAgregarDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus_1.png"))); // NOI18N
        btnAgregarDestino.setBorderPainted(false);
        btnAgregarDestino.setContentAreaFilled(false);
        btnAgregarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDestinoActionPerformed(evt);
            }
        });
        add(btnAgregarDestino);
        btnAgregarDestino.setBounds(385, 250, 60, 40);

        jLabel1.setText("Fecha inicio:");
        add(jLabel1);
        jLabel1.setBounds(15, 297, 88, 20);

        jLabel2.setText("Fecha fin:");
        add(jLabel2);
        jLabel2.setBounds(15, 341, 69, 20);

        jLabel3.setText("Descripción:");
        add(jLabel3);
        jLabel3.setBounds(15, 399, 87, 20);

        jDateFechaInicio.setDateFormatString("dd/MM/yyyy");
        jDateFechaInicio.setMinSelectableDate(new java.util.Date(1514779271000L));
        add(jDateFechaInicio);
        jDateFechaInicio.setBounds(118, 291, 113, 26);

        jDateFechaFin.setDateFormatString("dd/MM/yyyy");
        jDateFechaFin.setMinSelectableDate(new java.util.Date(1514779298000L));
        add(jDateFechaFin);
        jDateFechaFin.setBounds(118, 335, 113, 26);

        jScrollPane1.setViewportView(txtDescripcion);

        add(jScrollPane1);
        jScrollPane1.setBounds(117, 407, 189, 116);

        btnAgendar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        add(btnAgendar);
        btnAgendar.setBounds(117, 630, 101, 29);

        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));
        add(etqCorrecto);
        etqCorrecto.setBounds(15, 84, 437, 27);

        etqError.setForeground(new java.awt.Color(204, 0, 0));
        add(etqError);
        etqError.setBounds(15, 556, 437, 28);

        comboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoActionPerformed(evt);
            }
        });
        add(comboDestino);
        comboDestino.setBounds(118, 162, 334, 26);

        panelTitulo1.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        panelTitulo1.setMaximumSize(new java.awt.Dimension(390, 46));

        etqTitulo1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo1.setText("Agendar Viaje");

        javax.swing.GroupLayout panelTitulo1Layout = new javax.swing.GroupLayout(panelTitulo1);
        panelTitulo1.setLayout(panelTitulo1Layout);
        panelTitulo1Layout.setHorizontalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        panelTitulo1Layout.setVerticalGroup(
            panelTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panelTitulo1);
        panelTitulo1.setBounds(0, 0, 550, 56);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        String destino = comboDestino.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        Date fechaIni = jDateFechaInicio.getDate();
        Date fechaFin = jDateFechaFin.getDate();
        String descripcion = txtDescripcion.getText();

        try {
            sistema.getUsuarioIdentificado().altaViaje(nombre, destino, fechaIni, fechaFin, descripcion);
            etqCorrecto.setText("Registro exitoso.");
            etqError.setText(null);
            limpiarCampos();
            this.inhabilitarCampos();
        } catch (ViajeException e) {
            etqError.setText(e.toString());
        } catch (FechaException e) {
            etqError.setText(e.toString());
        } catch (ComentarioException e) {
            etqError.setText(e.toString());
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnAgregarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDestinoActionPerformed
       String nuevaCiudad = txtNuevoDestino.getText();
       try{
            sistema.altaCiudad(nuevaCiudad.toLowerCase());
            etqError.setText("");
            etqCorrecto.setText("Ciudad agregada correctamente.");     
            ocultarAgregarNuevoDestino();
       }catch(ViajeException e){
           etqCorrecto.setText("");
           etqError.setText(e.toString());
       }
       txtNuevoDestino.setText("");
       actualizarComboBox();
    }//GEN-LAST:event_btnAgregarDestinoActionPerformed

    private void btnMostrarParaAgregarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarParaAgregarDestinoActionPerformed
        mostrarAgregarNuevoDestino();
    }//GEN-LAST:event_btnMostrarParaAgregarDestinoActionPerformed

    private void comboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDestinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAgregarDestino;
    private javax.swing.JButton btnMostrarParaAgregarDestino;
    private javax.swing.JComboBox comboDestino;
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqDestino;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNuevoDestino;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTitulo1;
    private com.toedter.calendar.JDateChooser jDateFechaFin;
    private com.toedter.calendar.JDateChooser jDateFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNuevoDestino;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;

    private void inhabilitarCampos() {
        txtDescripcion.setEditable(false);
        txtNombre.setEditable(false);
        btnAgendar.setEnabled(false);
    }

}
