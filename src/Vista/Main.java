
package Vista;

import Controlador.BuscarJugador;
import Controlador.BuscarTorneo;
import Controlador.CrearJugador;
import Controlador.CrearJugadoresTorneo;
import Controlador.TablaPosiciones1;
import Controlador.Versus;
import Controlador.buscartorneojugador;
import Modelo.Render;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;


public class Main extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    buscartorneojugador btj = new buscartorneojugador();
    DefaultListModel dlm = new DefaultListModel();
    BuscarTorneo bt = new BuscarTorneo();
    BuscarJugador bj = new BuscarJugador();
    CrearEvento ce = new CrearEvento();
    CrearJugador cj = new CrearJugador();
    TablaPosiciones1 tp1 = new TablaPosiciones1();
    Versus vs = new Versus();
    Resultado r = new Resultado();
    String IdTorneo ;
    JTable Versus = new JTable();
    JPanel pane = new JPanel();
    JScrollPane scrollPane = new JScrollPane();
    CrearJugadoresTorneo cjt = new CrearJugadoresTorneo();
    JTable tablaVersus;
    JScrollPane scroll = new JScrollPane();
     int i = 0,ids,intTab=0, tab;
     List<String> idLista = new ArrayList<>();
    public Main() {
        initComponents();    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarTorneo = new javax.swing.JTable();
        btnCrearEvento = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaJugadores = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        agregarJugadores = new javax.swing.JTable();
        BuscarJugadorTorneo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numeroLista = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nombreTorneo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mostrarJugador = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        buscarJugador = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        torneosjugador = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        IdTor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        RUT = new javax.swing.JTextField();
        Mail = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        DV = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaPosiciones = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tabRonda = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torneos MyL");
        setBackground(new java.awt.Color(0, 102, 51));

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        mostrarTorneo = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column)
            {
                return false;}
        };
        mostrarTorneo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mostrarTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTorneoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mostrarTorneo);

        btnCrearEvento.setText("Crear Evento");
        btnCrearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearEvento)
                        .addGap(0, 1114, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearEvento)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Calendario", jPanel1);

        listaJugadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { null };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaJugadores);

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setText("Torneo Seleccionado:");

        agregarJugadores = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }};
            agregarJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    agregarJugadoresMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(agregarJugadores);

            BuscarJugadorTorneo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BuscarJugadorTorneoActionPerformed(evt);
                }
            });
            BuscarJugadorTorneo.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    BuscarJugadorTorneoKeyTyped(evt);
                }
            });

            jLabel2.setText("Participantes:");

            numeroLista.setText(" ");

            jButton1.setText("Borrar jugador");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setText("Agregar a torneo");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            nombreTorneo.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
            nombreTorneo.setText(" ");

            javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
            jPanel.setLayout(jPanelLayout);
            jPanelLayout.setHorizontalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(numeroLista, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1)
                                .addComponent(jButton2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BuscarJugadorTorneo)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombreTorneo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(595, Short.MAX_VALUE))
            );
            jPanelLayout.setVerticalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nombreTorneo))
                    .addGap(16, 16, 16)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuscarJugadorTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(numeroLista))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(70, Short.MAX_VALUE))
            );

            jTabbedPane2.addTab("Elegir Jugadores", jPanel);

            jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Crear Jugador");

            mostrarJugador = new javax.swing.JTable(){
                public boolean isCellEditable(int rowIndex, int colIndex){
                    return false;
                }};
                mostrarJugador.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                    },
                    new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                    }
                ));
                mostrarJugador.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        mostrarJugadorMouseClicked(evt);
                    }
                });
                jScrollPane5.setViewportView(mostrarJugador);

                jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
                jLabel10.setText("Buscar Jugador");

                buscarJugador.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyTyped(java.awt.event.KeyEvent evt) {
                        buscarJugadorKeyTyped(evt);
                    }
                });

                jLabel11.setText("Nombre:");

                jLabel12.setText("Apellido:");

                jLabel13.setText("Id TOR");

                jLabel14.setText("Rut:");

                jLabel15.setText("Mail:");

                jLabel16.setText(" ");

                jLabel17.setText(" ");

                jLabel18.setText(" ");

                jLabel19.setText(" ");

                jLabel20.setText(" ");

                jLabel21.setText("-");

                jLabel22.setText(" ");

                torneosjugador.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                    },
                    new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                    }
                ));
                jScrollPane6.setViewportView(torneosjugador);

                jLabel23.setText("Nombre");

                jLabel24.setText("Apellido");

                jLabel25.setText("TOR");

                jLabel26.setText("Rut");

                jLabel27.setText("Mail");

                jLabel28.setText("-");

                jButton3.setText("Agregar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Apellido)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Mail)
                                                .addComponent(IdTor)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel28)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(DV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(jLabel10)
                            .addComponent(buscarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(267, 267, 267))
                );
                jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(11, 11, 11)
                        .addComponent(buscarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IdTor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                );

                jTabbedPane2.addTab("Jugador", jPanel4);

                tablaPosiciones.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                    },
                    new String [] {
                        "Title 1", "Title 2"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                tablaPosiciones.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                    public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        tablaPosicionesPropertyChange(evt);
                    }
                });
                jScrollPane7.setViewportView(tablaPosiciones);
                if (tablaPosiciones.getColumnModel().getColumnCount() > 0) {
                    tablaPosiciones.getColumnModel().getColumn(0).setResizable(false);
                    tablaPosiciones.getColumnModel().getColumn(1).setResizable(false);
                }

                jButton4.setText("Set Match");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                    }
                });

                jButton5.setText("Cronometro");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                    }
                });

                ImageIcon icon = new ImageIcon("plus.png"); // Icono de pestaña
                tabRonda.insertTab("", icon, null, "Nueva ronda", 0); // Inserta una pestaña por defecto para agregar las demás pestañas
                tabRonda.getModel().clearSelection(); // Deselecciona las pestañas (por estética)
                tabRonda.addMouseListener(new MouseAdapter() { // Se agrega el evento
                    @Override
                    public void mousePressed(MouseEvent e) {
                        JTabbedPane tabRonda = (JTabbedPane) e.getSource(); // Obtiene el JTabbedPane

                        if (tabRonda.getSelectedIndex() == 0) { // Comprueba si la pestaña seleccionada es la primera pestaña (utilizada para agregar más pestañas)
                            tab = tabRonda.getTabCount(); // Obtiene la cantidad de pestañas (esto para agregar el nombre nuevo a la pestaña)

                            JPanel pane = new JPanel(); // JPanel de prueba
                            pane.add(new JLabel("RONDA " + tab)); // JPanel de prueba
                            tablaVersus = new javax.swing.JTable();
                            tablaVersus = new javax.swing.JTable(){
                                public boolean isCellEditable(int row, int column)
                                {
                                    return false;}
                            };
                            try {   tablaVersus.setDefaultRenderer(Object.class, new Render());
                                JButton resultado = new JButton ("Resultado");
                                tablaVersus.setModel(vs.buscarTorneo(IdTorneo, tab));
                            } catch (SQLException | IOException | ClassNotFoundException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            tablaVersus.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    mostrarTorneoMouseClicked(evt);
                                    int column = tablaVersus.getColumnModel().getColumnIndexAtX(evt.getX());
                                    int row = evt.getY()/tablaVersus.getRowHeight();
                                    if(row<tablaVersus.getRowCount() && row>=0 && column <tablaVersus.getColumnCount() && column >=0){
                                        Object value = tablaVersus.getValueAt(row, column);
                                        if(value instanceof JButton){
                                            ((JButton)value).doClick();
                                            JButton btnres = (JButton) value;
                                            Resultado R = new Resultado();
                                            R.setVisible(true);
                                            R.setLocationRelativeTo(null);

                                        }
                                    }
                                }
                            });

                            scroll.setViewportView(tablaVersus);
                            pane.add(scroll);
                            tabRonda.insertTab("Ronda " + tab, null, pane, "Ronda " + tab, tab); // Inserta una nueva pestaña llamada Ronda <tab>, donde <tab> es el número de pestaña.
                            tabRonda.setSelectedIndex(tab); // Selecciona la nueva pestaña creada
                        }

                    }
                });

                add(tabRonda);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tabRonda, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE))
                                .addGap(188, 188, 188))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                );
                jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tabRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jTabbedPane2.addTab("Versus", jPanel2);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        
        try {
            mostrarTorneo.setModel(bt.buscarTorneo(sdf.format(jCalendar1.getDate())));
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCalendar1PropertyChange
 
    private void btnCrearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEventoActionPerformed
       ce.setVisible(true);
       ce.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearEventoActionPerformed

    private void mostrarTorneoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTorneoMouseClicked
       if(evt.getClickCount()==2){
           tab =0;
        int row = mostrarTorneo.rowAtPoint(evt.getPoint());

        IdTorneo=mostrarTorneo.getValueAt(row, 0).toString();
        nombreTorneo.setText(mostrarTorneo.getValueAt(row, 1).toString()+" "+mostrarTorneo.getValueAt(row, 2).toString()+" "+mostrarTorneo.getValueAt(row, 3).toString()+" "+mostrarTorneo.getValueAt(row, 4).toString());
            JOptionPane.showMessageDialog(null,"Torneo Seleccionado: \n"+mostrarTorneo.getValueAt(row, 1).toString()+" "+mostrarTorneo.getValueAt(row, 2).toString()+" "+mostrarTorneo.getValueAt(row, 3).toString()+" "+mostrarTorneo.getValueAt(row, 4).toString() ," ", JOptionPane.INFORMATION_MESSAGE);
           try {
               tablaPosiciones.setModel(tp1.tablaPosicionesWin(IdTorneo));
                       } catch (SQLException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_mostrarTorneoMouseClicked

    private void BuscarJugadorTorneoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarJugadorTorneoKeyTyped
       BuscarJugadorTorneo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                
                try {
                    agregarJugadores.setModel(bj.buscarJugador(BuscarJugadorTorneo.getText()));
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        
        });
    }//GEN-LAST:event_BuscarJugadorTorneoKeyTyped

    private void agregarJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarJugadoresMouseClicked
        if(evt.getClickCount()==2){
           
            ids = agregarJugadores.getSelectedRow();
            idLista.add(String.valueOf(agregarJugadores.getValueAt(ids, 0)));
            String Nombre = agregarJugadores.getValueAt(ids, 2).toString()+" "+agregarJugadores.getValueAt(ids, 3).toString();
            
            dlm.addElement(Nombre);
            for(i =0;i<=listaJugadores.getModel().getSize();i++){
            numeroLista.setText(String.valueOf(i));
                
              }
            
        }
        listaJugadores.setModel(dlm);
    }//GEN-LAST:event_agregarJugadoresMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dlm.remove(listaJugadores.getSelectedIndex());
       
         for(i =0;i<=listaJugadores.getModel().getSize();i++){
            numeroLista.setText(String.valueOf(i));
              }
            
            listaJugadores.setModel(dlm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  for(i=0;i<=idLista.size()-1;i++){
      try {
          cjt.crearJT(idLista.get(i),IdTorneo);
      } catch (SQLException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BuscarJugadorTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarJugadorTorneoActionPerformed
        
    }//GEN-LAST:event_BuscarJugadorTorneoActionPerformed

    private void buscarJugadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarJugadorKeyTyped
        buscarJugador.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent evt) {
                String ir = buscarJugador.getText();
                try {
                    mostrarJugador.setModel(bj.buscarJugador(ir));
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_buscarJugadorKeyTyped

    private void mostrarJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarJugadorMouseClicked
        if(evt.getClickCount()==2){

            ids =mostrarJugador.getSelectedRow();
            jLabel16.setText(String.valueOf(mostrarJugador.getValueAt(ids, 2)));
            jLabel17.setText(String.valueOf(mostrarJugador.getValueAt(ids, 3)));
            jLabel18.setText(String.valueOf(mostrarJugador.getValueAt(ids, 1)));
            jLabel19.setText(String.valueOf(mostrarJugador.getValueAt(ids, 4)));
            jLabel20.setText(String.valueOf(mostrarJugador.getValueAt(ids, 6)));
            jLabel22.setText(String.valueOf(mostrarJugador.getValueAt(ids, 5)));

            try {
                torneosjugador.setModel(btj.participacionJugador((String) mostrarJugador.getValueAt(ids, 0)));
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_mostrarJugadorMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            cj.crearJugador(IdTor.getText(), Nombre.getText(), Apellido.getText(), RUT.getText(), DV.getText(), Mail.getText());
            JOptionPane.showMessageDialog(null,"Jugador Creado con Exito"," ", JOptionPane.INFORMATION_MESSAGE);
            IdTor.setText("");
            Nombre.setText("");
            Apellido.setText("");
            RUT.setText("");
            DV.setText("");
            Mail.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Cronometro C = new Cronometro();
        C.setVisible(true);
        C.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(tabRonda.getSelectedIndex()==0){
          Versus.setDefaultRenderer(Object.class, new Render());
        try {
            Versus.setModel(vs.buscarTorneo(IdTorneo, tab));
            JOptionPane.showMessageDialog(null,"Consulta Exitosa"," ", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException | IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaPosicionesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tablaPosicionesPropertyChange

    }//GEN-LAST:event_tablaPosicionesPropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField BuscarJugadorTorneo;
    private javax.swing.JTextField DV;
    private javax.swing.JTextField IdTor;
    private javax.swing.JTextField Mail;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField RUT;
    private javax.swing.JTable agregarJugadores;
    private javax.swing.JButton btnCrearEvento;
    private javax.swing.JTextField buscarJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> listaJugadores;
    private javax.swing.JTable mostrarJugador;
    private javax.swing.JTable mostrarTorneo;
    private javax.swing.JLabel nombreTorneo;
    private javax.swing.JLabel numeroLista;
    private javax.swing.JTabbedPane tabRonda;
    private javax.swing.JTable tablaPosiciones;
    private javax.swing.JTable torneosjugador;
    // End of variables declaration//GEN-END:variables
}
