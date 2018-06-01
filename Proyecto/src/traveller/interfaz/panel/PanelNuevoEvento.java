package traveller.interfaz.panel;

import traveller.dominio.Viaje;
import traveller.dominio.ISistema;
import traveller.excepciones.evento.EventoException;
import traveller.excepciones.fecha.FechaException;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.border.LineBorder;


public class PanelNuevoEvento extends javax.swing.JPanel {

    private ISistema sistema= null;
    
    public PanelNuevoEvento(ISistema sistema) {
        initComponents();
        this.sistema = sistema;
        
        actualizarComboBox();

        ArrayList<Viaje> lista = new ArrayList<Viaje>();
        Iterator<Viaje> it = sistema.getUsuarioIdentificado().getListaViajes().iterator();
        while (it.hasNext()) {
            lista.add(it.next());
        }
        listaViajes.setListData(lista.toArray());
         if (this.sistema.esModoDesarrollador()) {
            this.txtNombre.requestFocusInWindow();
            this.txtNombre.setText("Paseo al museo");
            this.txtDescripcion.setText("Visita al Museo Thyssen-Bornemisza.");
            Calendar c2 = new GregorianCalendar();
            fechaEvento.setCalendar(c2);
            this.txtLugar.setText("Museo Thyssen-Bornemisza");
            this.listaViajes.setSelectedIndex(0);
        } else {
            this.txtNombre.requestFocusInWindow();
        }
    }

     public void actualizarComboBox() {
        comboTipo.removeAllItems();
        for(int i=0;i<this.sistema.getListaTiposEvento().size();i++){
            comboTipo.addItem(this.sistema.getListaTiposEvento().get(i));
        }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        nuevasCiudadesLbl = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        panelCrearJugador = new javax.swing.JPanel();
        etqTipo = new javax.swing.JLabel();
        etqFecha = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        etqError = new javax.swing.JLabel();
        etqCorrecto = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        etqDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        etqNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        scrollListaViajes = new javax.swing.JScrollPane();
        listaViajes = new javax.swing.JList();
        etqViaje = new javax.swing.JLabel();
        etqLugar = new javax.swing.JLabel();
        txtLugar = new javax.swing.JTextField();
        etqFechas = new javax.swing.JLabel();
        etqAclaracion = new javax.swing.JLabel();
        nuevoTipoEventoLbl = new javax.swing.JLabel();
        nuevoTipoEventoTxt = new javax.swing.JTextField();
        agregarTipoEventoBtn = new javax.swing.JButton();
        fechaEvento = new com.toedter.calendar.JDateChooser();

        jScrollPane1.setViewportView(jEditorPane1);

        nuevasCiudadesLbl.setText("Agregar nuevos destinos:");

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(460, 679));

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        panelTitulo.setBackground(new java.awt.Color(39, 39, 39));
        panelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqTitulo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Nuevo evento");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCrearJugador.setBackground(new java.awt.Color(255, 255, 255));
        panelCrearJugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 39, 39), 1, true));
        panelCrearJugador.setMaximumSize(new java.awt.Dimension(380, 290));
        panelCrearJugador.setPreferredSize(new java.awt.Dimension(430, 651));

        etqTipo.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqTipo.setText("Tipo:");

        etqFecha.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqFecha.setText("Fecha:");

        btnAceptar.setBackground(new java.awt.Color(242, 242, 242));
        btnAceptar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAceptar.setText("Crear evento");
        btnAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 221, 221), 1, true));
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etqError.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        etqError.setForeground(new java.awt.Color(204, 0, 0));
        etqError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        etqCorrecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etqCorrecto.setForeground(new java.awt.Color(0, 153, 0));

        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        etqDescripcion.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqDescripcion.setText("Descripción:");

        jScrollPane2.setViewportView(txtDescripcion);
        txtDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescripcion.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtDescripcion.isFocusOwner()) {
                    txtDescripcion.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqNombre.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombre.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtNombre.isFocusOwner()) {
                    txtNombre.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        listaViajes.setFocusable(false);
        listaViajes.setSelectionBackground(new java.awt.Color(39, 39, 39));
        listaViajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaViajesValueChanged(evt);
            }
        });
        scrollListaViajes.setViewportView(listaViajes);

        etqViaje.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqViaje.setText("Viaje:");

        etqLugar.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqLugar.setText("Lugar:");

        txtLugar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtLugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 1, true));
        txtLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLugarKeyReleased(evt);
            }
        });
        txtLugar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLugar.setBorder(new LineBorder(new Color(77,144,254)));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLugar.setBorder(new LineBorder(new Color(217,217,217)));
            }
        });
        txtLugar.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!txtLugar.isFocusOwner()) {
                    txtLugar.setBorder(new LineBorder(new Color(185, 185, 185)));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!txtLugar.isFocusOwner()) {
                    txtLugar.setBorder(new LineBorder(new Color(217, 217, 217)));
                }
            }
        });

        etqFechas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        etqAclaracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etqAclaracion.setText("* El proceso de creación del evento prodría demorar unos segundos.");

        nuevoTipoEventoLbl.setText("Agregar nuevos destinos:");

        agregarTipoEventoBtn.setText("Agregar");
        agregarTipoEventoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTipoEventoBtnActionPerformed(evt);
            }
        });

        fechaEvento.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout panelCrearJugadorLayout = new javax.swing.GroupLayout(panelCrearJugador);
        panelCrearJugador.setLayout(panelCrearJugadorLayout);
        panelCrearJugadorLayout.setHorizontalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregarTipoEventoBtn)
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addComponent(nuevoTipoEventoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevoTipoEventoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(etqViaje))
                                    .addComponent(etqNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                            .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                                                    .addComponent(etqDescripcion)
                                                    .addGap(48, 48, 48))
                                                .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                                                    .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(etqLugar)
                                                        .addComponent(etqFecha))
                                                    .addGap(90, 90, 90)))
                                            .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                .addComponent(etqAclaracion, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCrearJugadorLayout.setVerticalGroup(
            panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etqError, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(etqViaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(etqNombre))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(scrollListaViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqLugar)
                    .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(etqTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearJugadorLayout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoTipoEventoLbl)
                    .addComponent(nuevoTipoEventoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(etqFecha))
                    .addGroup(panelCrearJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarTipoEventoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(panelCrearJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(etqAclaracion)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 479, Short.MAX_VALUE)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void agregarTipoEventoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTipoEventoBtnActionPerformed
        String nuevoTipoEvento = nuevoTipoEventoTxt.getText();
        try{
            sistema.altaTipoEvento(nuevoTipoEvento.toLowerCase());
            etqError.setText("");
            etqCorrecto.setText("Nuevo tipo de evento agregado correctamente.");
            actualizarComboBox();
        }catch(EventoException e){
            etqCorrecto.setText("");
            etqError.setText(e.toString());
        }
        nuevoTipoEventoTxt.setText("");
    }//GEN-LAST:event_agregarTipoEventoBtnActionPerformed

    private void txtLugarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarKeyReleased

    private void listaViajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaViajesValueChanged
        if (!listaViajes.isSelectionEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaIni = dateFormat.format(((Viaje) listaViajes.getSelectedValue()).getFechaInicio());
            String fechaFin = dateFormat.format(((Viaje) listaViajes.getSelectedValue()).getFechaFin());
            etqFechas.setText(fechaIni + " - " + fechaFin);
        } else {
            etqFechas.setText("");
        }
    }//GEN-LAST:event_listaViajesValueChanged

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String tipoEvento = comboTipo.getSelectedItem().toString();

        String nombre = txtNombre.getText();
//        String dia = txtDia.getText();
//        String mes = txtMes.getText();
//        String año = txtAño.getText();

        Date fecha = fechaEvento.getDate();
        String lugar = txtLugar.getText();
        if (!listaViajes.isSelectionEmpty()) {
            String descripcion = txtDescripcion.getText();

            try {
                ((Viaje) listaViajes.getSelectedValue()).altaEvento(nombre, fecha, lugar, descripcion, tipoEvento);
                String accion = "<html><b>" + this.sistema.getUsuarioIdentificado().getNombre() + " "
                + this.sistema.getUsuarioIdentificado().getApellido() + "</b> agregó el evento <i>" + nombre + "</i> al viaje.";
                SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
                Date hoy = new Date();
                String strDia = sdfDate.format(hoy);
                ((Viaje) listaViajes.getSelectedValue()).agregarLogAViaje(accion,strDia);
                etqCorrecto.setText("Registro exitoso.");
                etqError.setText(null);
                inhabilitarCampos();

                String mensaje = this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " agrego el evento " + nombre + " al viaje " +
                ((Viaje) listaViajes.getSelectedValue()).getNombre();

                String mensajeEmail = "Le notificamos que el usuario "+this.sistema.getUsuarioIdentificado().getNombre() + " " + this.sistema.getUsuarioIdentificado().getApellido() + " agrego el evento " + nombre + " al viaje " +
                ((Viaje) listaViajes.getSelectedValue()).getNombre() + "\n\n Le recordamos que si no desea ser notificado mediante este medio puede darse"
                + "de baja seleccionando la opción en 'Mi Cuenta' \n\nGracias,\n\nTraveller.";
                String titulo = this.sistema.getUsuarioIdentificado().getNombre() + " "+this.sistema.getUsuarioIdentificado().getApellido() + " ha modificado un viaje.";
                this.sistema.notificarNovedad(mensaje, mensajeEmail, titulo, (Viaje) listaViajes.getSelectedValue());

            } catch (EventoException e) {
                etqError.setText(e.toString());
            } catch (FechaException e) {
                etqError.setText(e.toString());
            }
        } else {
            etqError.setText("Debe seleccionar un viaje.");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTipoEventoBtn;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel etqAclaracion;
    private javax.swing.JLabel etqCorrecto;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqError;
    private javax.swing.JLabel etqFecha;
    private javax.swing.JLabel etqFechas;
    private javax.swing.JLabel etqLugar;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTipo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqViaje;
    private com.toedter.calendar.JDateChooser fechaEvento;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaViajes;
    private javax.swing.JLabel nuevasCiudadesLbl;
    private javax.swing.JLabel nuevoTipoEventoLbl;
    private javax.swing.JTextField nuevoTipoEventoTxt;
    private javax.swing.JPanel panelCrearJugador;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JScrollPane scrollListaViajes;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * Inhabilita los campos de ingeso de datos.
     */
    private void inhabilitarCampos() {
        txtNombre.setEditable(false);
        txtLugar.setEditable(false);
        txtDescripcion.setEditable(false);
        btnAceptar.setEnabled(false);
    }
}
