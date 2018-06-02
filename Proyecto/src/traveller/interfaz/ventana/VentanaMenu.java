package traveller.interfaz.ventana;

import traveller.interfaz.panel.PanelMiCuenta;
import traveller.interfaz.panel.PanelInicio;
import traveller.interfaz.panel.PanelVerViaje;
import traveller.interfaz.panel.PanelMisViajes;
import traveller.interfaz.panel.PanelNuevoEvento;
import traveller.interfaz.panel.PanelAmigos;
import com.wolfram.alpha.net.ProxySettings;
import traveller.dominio.ISistema;
import traveller.dominio.Usuario;
import traveller.dominio.Viaje;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.LineBorder;
import traveller.extras.WolframAlpha;
import traveller.interfaz.panel.PanelAgendarViajeBien;
import traveller.interfaz.panel.PanelInicioFotos;
import traveller.interfaz.panel.PanelInicioNuevo;

public class VentanaMenu extends javax.swing.JFrame {

    public VentanaMenu(ISistema sistema, String nombreUsuario) {
        this.sistema = sistema;

        /*
         * Icono de la ventana.
         */
        BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResource("/traveller/interfaz/img/icono.png"));
            setIconImage(image);
        } catch (IOException e) {
        }

        initComponents();
        panelPrincipal.setSize(this.getWidth(), this.getHeight());
        mostrarInicio();
        this.etqNombreUsuario.setText(" " + nombreUsuario);
        if (!this.sistema.esModoDesarrollador()) {
            this.comboCambio.setVisible(false);
            this.etqCambio.setText(" ");
            this.etqModo.setText(" ");
        } else {
            comboCambio.setModel(new javax.swing.DefaultComboBoxModel(this.sistema.getListaUsuarios().toArray()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btnMisViajes = new javax.swing.JButton();
        btnNuevoEvento = new javax.swing.JButton();
        btnAmigos = new javax.swing.JButton();
        btnMiCuenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgendarViaje1 = new javax.swing.JButton();
        comboCambio = new javax.swing.JComboBox();
        etqCambio = new javax.swing.JLabel();
        etqModo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        opcionArchivo = new javax.swing.JMenu();
        subOpcionAñadir = new javax.swing.JMenuItem();
        subMisViajes = new javax.swing.JMenuItem();
        subMiCuenta = new javax.swing.JMenuItem();
        subAmigos = new javax.swing.JMenuItem();
        separadorBarraMenu = new javax.swing.JPopupMenu.Separator();
        subOpcionSalir = new javax.swing.JMenuItem();
        opcionAyuda = new javax.swing.JMenu();
        subOpcionAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Traveller");
        setBackground(new java.awt.Color(245, 245, 245));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 780));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(245, 245, 245));

        panelMenu.setBackground(new java.awt.Color(39, 39, 39));

        btnMisViajes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMisViajes.setForeground(new java.awt.Color(204, 204, 204));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnMisViajes.setText("Mis viajes");
        btnMisViajes.setAlignmentY(0.0F);
        btnMisViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMisViajes.setFocusable(false);
        btnMisViajes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMisViajes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMisViajes.setMaximumSize(new java.awt.Dimension(200, 36));
        btnMisViajes.setMinimumSize(new java.awt.Dimension(200, 36));
        btnMisViajes.setPreferredSize(new java.awt.Dimension(200, 36));
        btnMisViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 1){
                    btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(opcionMenu !=1){
                    btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnMisViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisViajesActionPerformed(evt);
            }
        });

        btnNuevoEvento.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnNuevoEvento.setForeground(new java.awt.Color(204, 204, 204));
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnNuevoEvento.setText("Nuevo evento");
        btnNuevoEvento.setAlignmentY(0.0F);
        btnNuevoEvento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoEvento.setFocusable(false);
        btnNuevoEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoEvento.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnNuevoEvento.setMaximumSize(new java.awt.Dimension(200, 36));
        btnNuevoEvento.setMinimumSize(new java.awt.Dimension(200, 36));
        btnNuevoEvento.setPreferredSize(new java.awt.Dimension(200, 36));
        btnNuevoEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (opcionMenu != 2) {
                    btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (opcionMenu != 2) {
                    btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnNuevoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEventoActionPerformed(evt);
            }
        });

        btnAmigos.setBackground(new java.awt.Color(255, 255, 255));
        btnAmigos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAmigos.setForeground(new java.awt.Color(204, 204, 204));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnAmigos.setText("Amigos");
        btnAmigos.setAlignmentY(0.0F);
        btnAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAmigos.setFocusable(false);
        btnAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAmigos.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAmigos.setMaximumSize(new java.awt.Dimension(200, 36));
        btnAmigos.setMinimumSize(new java.awt.Dimension(200, 36));
        btnAmigos.setPreferredSize(new java.awt.Dimension(200, 36));
        btnAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 3){
                    btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 3){
                    btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmigosActionPerformed(evt);
            }
        });

        btnMiCuenta.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMiCuenta.setForeground(new java.awt.Color(204, 204, 204));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnMiCuenta.setText("Mi cuenta");
        btnMiCuenta.setAlignmentY(0.0F);
        btnMiCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMiCuenta.setFocusable(false);
        btnMiCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMiCuenta.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMiCuenta.setMaximumSize(new java.awt.Dimension(200, 36));
        btnMiCuenta.setMinimumSize(new java.awt.Dimension(200, 36));
        btnMiCuenta.setPreferredSize(new java.awt.Dimension(200, 36));
        btnMiCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (opcionMenu != 6) {
                    btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (opcionMenu != 6) {
                    btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiCuentaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnSalir.setMaximumSize(new java.awt.Dimension(200, 36));
        btnSalir.setMinimumSize(new java.awt.Dimension(200, 36));
        btnSalir.setPreferredSize(new java.awt.Dimension(200, 36));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 7){
                    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 7){
                    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgendarViaje1.setBackground(new java.awt.Color(204, 204, 204));
        btnAgendarViaje1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAgendarViaje1.setForeground(new java.awt.Color(204, 204, 204));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png"))); // NOI18N
        btnAgendarViaje1.setText("Agendar Viaje");
        btnAgendarViaje1.setAlignmentY(0.0F);
        btnAgendarViaje1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgendarViaje1.setFocusable(false);
        btnAgendarViaje1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendarViaje1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAgendarViaje1.setMaximumSize(new java.awt.Dimension(200, 36));
        btnAgendarViaje1.setMinimumSize(new java.awt.Dimension(200, 36));
        btnAgendarViaje1.setPreferredSize(new java.awt.Dimension(200, 36));
        btnAgendarViaje1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 8){
                    btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuHover.png")));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(opcionMenu != 8){
                    btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
                }
            }
        });
        btnAgendarViaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarViaje1ActionPerformed(evt);
            }
        });

        comboCambio.setFocusable(false);
        comboCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCambioActionPerformed(evt);
            }
        });

        etqCambio.setBackground(new java.awt.Color(255, 255, 255));
        etqCambio.setForeground(new java.awt.Color(204, 204, 204));
        etqCambio.setText("Cambiar de cuenta:");

        etqModo.setBackground(new java.awt.Color(204, 204, 204));
        etqModo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etqModo.setForeground(new java.awt.Color(204, 204, 204));
        etqModo.setText("MODO DESARROLLADOR");

        etqNombreUsuario.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(104, 104, 104));
        etqNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        imgLogo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        imgLogo.setForeground(new java.awt.Color(204, 204, 204));
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/icono.png"))); // NOI18N
        imgLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imgLogoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAmigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMisViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgendarViaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMiCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(comboCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(etqNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(etqModo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btnMisViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNuevoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAmigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgendarViaje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqCambio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(etqModo)
                .addGap(41, 41, 41))
        );

        panelContenido.setBackground(new java.awt.Color(245, 245, 245));
        panelContenido.setMaximumSize(new java.awt.Dimension(400, 651));
        panelContenido.setMinimumSize(new java.awt.Dimension(400, 651));
        panelContenido.setPreferredSize(new java.awt.Dimension(430, 651));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );

        opcionArchivo.setText("Archivo");

        subOpcionAñadir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        subOpcionAñadir.setText("Agendar viaje");
        subOpcionAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpcionAñadirActionPerformed(evt);
            }
        });
        opcionArchivo.add(subOpcionAñadir);

        subMisViajes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        subMisViajes.setText("Mis viajes");
        subMisViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMisViajesActionPerformed(evt);
            }
        });
        opcionArchivo.add(subMisViajes);

        subMiCuenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        subMiCuenta.setText("Mi Cuenta");
        subMiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMiCuentaActionPerformed(evt);
            }
        });
        opcionArchivo.add(subMiCuenta);

        subAmigos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        subAmigos.setText("Amigos");
        subAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAmigosActionPerformed(evt);
            }
        });
        opcionArchivo.add(subAmigos);
        opcionArchivo.add(separadorBarraMenu);

        subOpcionSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK));
        subOpcionSalir.setText("Salir");
        subOpcionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpcionSalirActionPerformed(evt);
            }
        });
        opcionArchivo.add(subOpcionSalir);

        barraMenu.add(opcionArchivo);

        opcionAyuda.setText("Ayuda");

        subOpcionAcerca.setText("Acerca de Traveller");
        subOpcionAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subOpcionAcercaActionPerformed(evt);
            }
        });
        opcionAyuda.add(subOpcionAcerca);

        barraMenu.add(opcionAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarSistema();
    }//GEN-LAST:event_formWindowClosing

    private void btnMisViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisViajesActionPerformed
        PanelMisViajes misViajes = new PanelMisViajes(sistema, this);

        /*
         * Actualizar el menú de opciones para que marque la opción en que nos
         * encontramos.
         */
        opcionMenu = 1;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(misViajes);
        //misViajes.setBounds(0, 0, 439, 660);
        misViajes.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());

        this.pack();
    }//GEN-LAST:event_btnMisViajesActionPerformed

    private void btnNuevoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEventoActionPerformed
        PanelNuevoEvento nuevoEvento = new PanelNuevoEvento(sistema);

        /*
         * Actualizar el menú de opciones para que marque la opción en que nos
         * encontramos.
         */
        opcionMenu = 2;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        
        panelContenido.removeAll();
        panelContenido.add(nuevoEvento);
        nuevoEvento.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //nuevoEvento.setBounds(0, 0, 439, 660);
            
        this.pack();
    }//GEN-LAST:event_btnNuevoEventoActionPerformed

    private void btnAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmigosActionPerformed
        PanelAmigos amigos = new PanelAmigos(this.sistema);

        opcionMenu = 3;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(amigos);
        amigos.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
     //   amigos.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_btnAmigosActionPerformed

    private void subOpcionAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpcionAcercaActionPerformed
        VentanaAcerca ventanaAcerca = new VentanaAcerca();
        ventanaAcerca.setVisible(true);
        setLocationRelativeTo(null); // Centrar ventana.
    }//GEN-LAST:event_subOpcionAcercaActionPerformed

    private void subOpcionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpcionSalirActionPerformed
        sistema.logoutUsuario();
        this.setVisible(false);
        VentanaLogin ventanaLogin = new VentanaLogin(sistema);
        ventanaLogin.setLocationRelativeTo(null); // Centrar ventana.
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_subOpcionSalirActionPerformed

    private void imgLogoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoMouseReleased
        mostrarInicio();
    }//GEN-LAST:event_imgLogoMouseReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        sistema.logoutUsuario();
        this.setVisible(false);
        VentanaLogin ventanaLogin = new VentanaLogin(sistema);
        ventanaLogin.setLocationRelativeTo(null); // Centrar ventana.
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiCuentaActionPerformed
        PanelMiCuenta miCuenta = new PanelMiCuenta(sistema);

        opcionMenu = 6;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(miCuenta);
        miCuenta.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //miCuenta.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_btnMiCuentaActionPerformed

    private void btnAgendarViaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarViaje1ActionPerformed
        PanelAgendarViajeBien agendar = new PanelAgendarViajeBien(sistema);

        opcionMenu = 8;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));

        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(agendar);
        agendar.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());

        //agendar.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_btnAgendarViaje1ActionPerformed

    private void subOpcionAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subOpcionAñadirActionPerformed
        PanelAgendarViajeBien agendar = new PanelAgendarViajeBien(sistema);

        opcionMenu = 8;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));

        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(agendar);
        agendar.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //agendar.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_subOpcionAñadirActionPerformed

    private void subMisViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMisViajesActionPerformed
        PanelMisViajes misViajes = new PanelMisViajes(sistema, this);

        /*
         * Actualizar el menú de opciones para que marque la opción en que nos
         * encontramos.
         */
        opcionMenu = 1;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(misViajes);
        misViajes.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //misViajes.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_subMisViajesActionPerformed

    public void verViaje(Viaje viaje) {
        PanelVerViaje verViaje = new PanelVerViaje(this.sistema, viaje, this);
        panelContenido.removeAll();
        panelContenido.add(verViaje);
        verViaje.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //verViaje.setBounds(0, 0, 439, 660);
        this.pack();
    }

    public void verMisViajes() {
        PanelMisViajes misViajes = new PanelMisViajes(sistema, this);
        panelContenido.removeAll();
        panelContenido.add(misViajes);
        misViajes.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
       //misViajes.setBounds(0, 0, 439, 660);
        this.pack();
    }

    private void comboCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCambioActionPerformed
        this.sistema.identificar((Usuario) comboCambio.getSelectedItem());
        this.etqNombreUsuario.setText(((Usuario) comboCambio.getSelectedItem()).getNombreUsuario());
        mostrarInicio();
    }//GEN-LAST:event_comboCambioActionPerformed

    private void subAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAmigosActionPerformed
        PanelAmigos amigos = new PanelAmigos(this.sistema);

        opcionMenu = 3;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenuSeleccionada.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(amigos);
        amigos.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
        //amigos.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_subAmigosActionPerformed

    private void subMiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMiCuentaActionPerformed
        PanelMiCuenta miCuenta = new PanelMiCuenta(sistema);

        opcionMenu = 6;
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMiCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vinterfaz/img/opcionMenuSeleccionada.png")));
        btnAgendarViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(miCuenta);
        miCuenta.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());
      //  miCuenta.setBounds(0, 0, 439, 660);
        this.pack();
    }//GEN-LAST:event_subMiCuentaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAgendarViaje1;
    private javax.swing.JButton btnAmigos;
    private javax.swing.JButton btnMiCuenta;
    private javax.swing.JButton btnMisViajes;
    private javax.swing.JButton btnNuevoEvento;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboCambio;
    private javax.swing.JLabel etqCambio;
    private javax.swing.JLabel etqModo;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JMenu opcionArchivo;
    private javax.swing.JMenu opcionAyuda;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPopupMenu.Separator separadorBarraMenu;
    private javax.swing.JMenuItem subAmigos;
    private javax.swing.JMenuItem subMiCuenta;
    private javax.swing.JMenuItem subMisViajes;
    private javax.swing.JMenuItem subOpcionAcerca;
    private javax.swing.JMenuItem subOpcionAñadir;
    private javax.swing.JMenuItem subOpcionSalir;
    // End of variables declaration//GEN-END:variables
    private ISistema sistema;

    /*
     * Guarda la opción del menu principal que estamos viendo.
     */
    private int opcionMenu; //inicializado como 0 en el constructor.

    private void mostrarInicio() {
        PanelInicioNuevo panelInicio = new PanelInicioNuevo(sistema);

        opcionMenu = 0;
        btnAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnNuevoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));
        btnMisViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traveller/interfaz/img/opcionMenu.png")));

        /*
         * Limpiar el panel actual y agregar el nuevo.
         */
        panelContenido.removeAll();
        panelContenido.add(panelInicio);
        panelInicio.setBounds(0, 0, panelContenido.getWidth(), panelContenido.getHeight());

        //panelInicio.setBounds(0, 0, 439, 660);
        this.pack();
    }

    private void guardarSistema() {
        ObjectOutputStream grabacionSistema;

        try {
            //Se serializa el objeto sistema.
            grabacionSistema = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream("sistema.txt")));
            grabacionSistema.writeObject(sistema);
            grabacionSistema.close();
        } catch (IOException ex) {
        }
    }
}
