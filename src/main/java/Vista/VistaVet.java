package Vista;
import Controlador.ControladorVet;
import Modelo.Consulta;
import Modelo.Veterinario;
import java.util.List;
import javax.swing.JOptionPane;


public class VistaVet extends javax.swing.JFrame {
    
    private final ControladorVet controlador = new ControladorVet();
    private final List<Veterinario> veterinarios = controlador.obtenerVeterinarios();
    private List<Consulta> consultasParaCobrar = List.of();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaVet.class.getName());

    private void cargarVeterinarios() {
        cbVeterinarioCita.removeAllItems();
        cbVeterinarioConsulta.removeAllItems();

        for (Veterinario veterinario : veterinarios) {
            String opcion = veterinario.getNombre() + " (" + veterinario.getCedula() + ")";
            cbVeterinarioCita.addItem(opcion);
            cbVeterinarioConsulta.addItem(opcion);
        }

        cbVeterinarioCita.setSelectedIndex(-1);
        cbVeterinarioConsulta.setSelectedIndex(-1);
    }

    private void cargarConsultasParaCobrar() {
        consultasParaCobrar = controlador.obtenerConsultasParaCobrar();
        cbConsultaCobro.removeAllItems();

        for (int i = 0; i < consultasParaCobrar.size(); i++) {
            Consulta consulta = consultasParaCobrar.get(i);
            cbConsultaCobro.addItem("Consulta " + (i + 1)
                    + " - Mascota " + consulta.getMascota().getId());
        }

        cbConsultaCobro.setSelectedIndex(-1);
    }
    
    public VistaVet() {
        initComponents();
        cargarVeterinarios();
        cargarConsultasParaCobrar();
        cbTipoMascotaActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnRegistrarCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCedulaDueno = new javax.swing.JTextField();
        txtIdMascota = new javax.swing.JTextField();
        txtNombreMascota = new javax.swing.JTextField();
        txtEdadMascota = new javax.swing.JTextField();
        txtPesoMascota = new javax.swing.JTextField();
        txtRazaMascota = new javax.swing.JTextField();
        cbTipoMascota = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPermisoCITES = new javax.swing.JTextField();
        chkSedacion = new javax.swing.JCheckBox();
        btnRegistrarMascota = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtIdMascotaCita = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbVeterinarioCita = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtHoraCita = new javax.swing.JTextField();
        btnAgendarCita = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        cbConsultaCobro = new javax.swing.JComboBox<>();
        btnGenerarComprobante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaComprobante = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtIdMascotaConsulta = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cbVeterinarioConsulta = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txtDiagnostico = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTratamiento = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtVacunaNombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtVacunaPrecio = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNotasMedicas = new javax.swing.JTextField();
        btnRegistrarConsulta = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtIdMascotaHistorial = new javax.swing.JTextField();
        btnConsultarHistorial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaHistorial = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        jTabPanel.setForeground(new java.awt.Color(0, 0, 153));
        jTabPanel.setFocusable(false);
        jTabPanel.setFont(new java.awt.Font("Muli", 1, 15)); // NOI18N
        jTabPanel.setOpaque(true);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), java.awt.Color.lightGray));
        jTabbedPane2.setFont(new java.awt.Font("Muli", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(198, 224, 250));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setText("Cédula:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel5.setText("Dirección:");

        btnRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(this::btnRegistrarClienteActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTelefonoCliente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnRegistrarCliente)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPanel3);

        jPanel4.setBackground(new java.awt.Color(198, 224, 250));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel4.setText("Cédula dueño:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel6.setText("ID Mascota:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel8.setText("Edad:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel9.setText("Peso:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel10.setText("Raza:");

        txtCedulaDueno.addActionListener(this::txtCedulaDuenoActionPerformed);

        cbTipoMascota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTipoMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convencional", "Exotica", " " }));
        cbTipoMascota.addActionListener(this::cbTipoMascotaActionPerformed);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel11.setText("Tipo:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel12.setText("Permiso CITES:");

        chkSedacion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chkSedacion.setText("Requiere sedación");
        chkSedacion.addActionListener(this::chkSedacionActionPerformed);

        btnRegistrarMascota.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRegistrarMascota.setText("Registrar Mascota");
        btnRegistrarMascota.addActionListener(this::btnRegistrarMascotaActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazaMascota)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdadMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(txtPesoMascota))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPermisoCITES)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkSedacion))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarMascota)
                .addGap(217, 217, 217))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCedulaDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSedacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPesoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtPermisoCITES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnRegistrarMascota)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Mascotas", jPanel4);

        jPanel5.setBackground(new java.awt.Color(198, 224, 250));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel13.setText("ID Mascota:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel14.setText("Veterinario:");

        cbVeterinarioCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setText("Fecha (AAAA-MM-DD):");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setText("Consulta a cobrar:");

        btnAgendarCita.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnAgendarCita.setText("Agendar Cita");
        btnAgendarCita.addActionListener(this::btnAgendarCitaActionPerformed);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setText("Hora (HH:MM):");

        cbConsultaCobro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGenerarComprobante.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnGenerarComprobante.setText("Generar Comprobante");
        btnGenerarComprobante.addActionListener(this::btnGenerarComprobanteActionPerformed);

        areaComprobante.setEditable(false);
        areaComprobante.setColumns(20);
        areaComprobante.setRows(5);
        jScrollPane1.setViewportView(areaComprobante);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaCita, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(txtHoraCita)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdMascotaCita))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnAgendarCita))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(cbConsultaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtIdMascotaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbVeterinarioCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(btnAgendarCita)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbConsultaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarComprobante))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Citas y Cobro", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabPanel.addTab("Recepción", jPanel1);

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), java.awt.Color.lightGray));
        jTabbedPane3.setFont(new java.awt.Font("Muli", 1, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(187, 204, 230));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setText("ID Mascota:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel19.setText("Veterinario:");

        cbVeterinarioConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel20.setText("Diagnóstico:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel21.setText("Tratamiento:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel22.setText("Vacuna (opcional):");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel23.setText("Valor Vacuna $$$:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel24.setText("Notas médicas:");

        btnRegistrarConsulta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRegistrarConsulta.setText("Registrar consulta");
        btnRegistrarConsulta.addActionListener(this::btnRegistrarConsultaActionPerformed);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdMascotaConsulta)
                                    .addComponent(cbVeterinarioConsulta, 0, 163, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTratamiento))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVacunaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtVacunaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnRegistrarConsulta)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIdMascotaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cbVeterinarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVacunaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVacunaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNotasMedicas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarConsulta)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Registrar Consulta", jPanel6);

        jPanel7.setBackground(new java.awt.Color(187, 204, 230));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel25.setText("ID Mascota:");

        btnConsultarHistorial.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnConsultarHistorial.setText("Consultar historial");
        btnConsultarHistorial.addActionListener(this::btnConsultarHistorialActionPerformed);

        areaHistorial.setEditable(false);
        areaHistorial.setColumns(20);
        areaHistorial.setRows(5);
        jScrollPane2.setViewportView(areaHistorial);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdMascotaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarHistorial)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtIdMascotaHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarHistorial))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Historial Clínico", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabPanel.addTab("Veterinario", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDuenoActionPerformed

    private void chkSedacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSedacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSedacionActionPerformed

    private void cbTipoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoMascotaActionPerformed
        String seleccion = cbTipoMascota.getSelectedItem().toString().trim();
        boolean esExotica = seleccion.equalsIgnoreCase("Exótica") || seleccion.equalsIgnoreCase("Exotica");

        txtPermisoCITES.setEnabled(esExotica);
        chkSedacion.setEnabled(esExotica);
        txtRazaMascota.setEnabled(!esExotica);

        if (esExotica) {
            txtRazaMascota.setText("");
        } else {
        txtPermisoCITES.setText("");
        chkSedacion.setSelected(false);
    }
    }//GEN-LAST:event_cbTipoMascotaActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        String cedula = getCedulaCliente();
        String nombre = getNombreCliente();
        String telefono = getTelefonoCliente();
        String direccion = getDireccionCliente();
        
        if (cedula.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la cédula del cliente.");
            return;
        }
        
        if (!cedula.matches("[0-9]+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "La cédula debe contener solo dígitos del 0 al 9.");
            return;
        }
        
        if (nombre.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el nombre del cliente.");
            return;
        }
        
        if (telefono.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el telefono del cliente.");
            return;
        }
        
        if (!telefono.matches("[0-9]+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "El teléfono debe contener solo dígitos del 0 al 9.");
            return;
        }
        
        if (direccion.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la direccion del cliente.");
            return;
        }
        
        try {
        controlador.registrarCliente(cedula, nombre, telefono, direccion);
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente registrado correctamente.");
            txtCedulaCliente.setText("");
            txtNombreCliente.setText("");
            txtTelefonoCliente.setText("");
            txtDireccionCliente.setText("");
            txtCedulaCliente.requestFocusInWindow();
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMascotaActionPerformed
        String cedulaDueno = getCedulaDueno();
        String idMascota = getIdMascota();
        String nombreMascota = getNombreMascota();
        String edadMascota = getEdadMascota();
        String pesoMascota = getPesoMascota();
        String razaMascota = getRazaMascota();
        String permisoCITES = getPermisoCITES();
        String tipoMascota = getTipoMascota();
        boolean sedacion = requiereSedacion();
        
        if (cedulaDueno.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la cedula del dueño.");
            return;
        }
        
        if (idMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el ID de la mascota.");
            return;
        }
        
        if (nombreMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el nombre de la mascota.");
            return;
        }

        if (edadMascota.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la edad de la mascota.");
            return;
        }
        
        int edad;
            try {
                edad = Integer.parseInt(edadMascota);
                } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escribe la edad como un número entero, por ejemplo, 3.");
            return;
            }
        
        if (edad < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "La edad debe ser de 0 años o más.");
        return;
        }
        
        if (pesoMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el peso de la mascota.");
            return;
        }
        
        double peso;
            try {
                peso = Double.parseDouble(pesoMascota);
                } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escribe el peso como un número, por ejemplo, 3.5");
            return;
            }
        
        if (peso <= 0 || !Double.isFinite(peso)) {
            javax.swing.JOptionPane.showMessageDialog(this,"El peso debe ser mayor a 0");
            return;
        }
        
        if (tipoMascota == null || tipoMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona el tipo de mascota.");
            return;
        }
 
        if ("Convencional".equals(tipoMascota) && razaMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la raza de la mascota.");
            return;
        }
        
        if ("Exotica".equals(tipoMascota) && permisoCITES.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el permiso CITES obligatorio de la mascota.");
            return;
        }
        
        
        try {
            if ("Convencional".equals(tipoMascota)) {
                controlador.registrarMascotaConvencional(cedulaDueno, idMascota, nombreMascota, edad, peso, razaMascota);
            } else if ("Exotica".equals(tipoMascota)) {
                controlador.registrarMascotaExotica(cedulaDueno, idMascota, nombreMascota, edad, peso, permisoCITES, sedacion);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona el tipo de mascota.");
            return;
            }
            javax.swing.JOptionPane.showMessageDialog(this, "Mascota registrada correctamente.");

            txtCedulaDueno.setText("");
            txtIdMascota.setText("");
            txtNombreMascota.setText("");
            txtEdadMascota.setText("");
            txtPesoMascota.setText("");
            txtRazaMascota.setText("");
            txtPermisoCITES.setText("");
            chkSedacion.setSelected(false);
            txtCedulaDueno.requestFocusInWindow();
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarMascotaActionPerformed

    private void btnAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCitaActionPerformed
        String idMascota = getIdMascotaCita();
        String veterinarioCita = getVeterinarioCita();
        String fechaCita = getFechaCita();
        String horaCita = getHoraCita();
        
        
        if (idMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el ID de la mascota.");
            return;
        }
        
        if(veterinarioCita == null || veterinarioCita.isBlank() ){
           javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el veterinario asignado a la cita."); 
           return;
        }
        
        if (fechaCita.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la fecha de la cita en el formato correspondiente.");
            return;
        }
        
        java.time.LocalDate fecha;
        try {
            fecha = java.time.LocalDate.parse(fechaCita.strip());
        } catch (java.time.format.DateTimeParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe una fecha válida en formato AAAA-MM-DD, por ejemplo, 2026-12-05.");
        return;
        }
        
        if (horaCita.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe la hora de la cita en el formato correspondiente.");
            return;
        }
        
        java.time.LocalTime hora;
        try {
            hora = java.time.LocalTime.parse(horaCita,
            java.time.format.DateTimeFormatter.ofPattern("HH:mm").withResolverStyle(java.time.format.ResolverStyle.STRICT));
            } catch (java.time.format.DateTimeParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe una hora válida en formato HH:MM, por ejemplo, 14:30.");
            return;
        }

        java.time.LocalDateTime fechaHora = java.time.LocalDateTime.of(fecha, hora);
        

        if (!fechaHora.isAfter(java.time.LocalDateTime.now())) {
            JOptionPane.showMessageDialog(this,"La cita debe agendarse para una fecha y hora futuras.");
            return;
        }
        
        int indiceVeterinario = cbVeterinarioCita.getSelectedIndex();
        String cedulaVeterinario = veterinarios.get(indiceVeterinario).getCedula();

        try {
            controlador.agendarCita(idMascota, cedulaVeterinario, fechaHora);
            JOptionPane.showMessageDialog(this, "Cita agendada correctamente.");
            
            txtIdMascotaCita.setText("");
            cbVeterinarioConsulta.setSelectedIndex(-1);
            txtFechaCita.setText("");
            txtHoraCita.setText("");
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnAgendarCitaActionPerformed

    private void btnGenerarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarComprobanteActionPerformed
        int indiceConsulta = cbConsultaCobro.getSelectedIndex();
        if (indiceConsulta < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona una consulta para cobrar.");
            return;
        }

        try {
            Consulta consulta = consultasParaCobrar.get(indiceConsulta);
            String comprobante = controlador.generarComprobante(consulta);
            areaComprobante.setText(comprobante);
            
            areaComprobante.setText("");
        } catch (IllegalArgumentException e) {
            areaComprobante.setText("");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnGenerarComprobanteActionPerformed

    private void btnRegistrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarConsultaActionPerformed
        String idMascota = getIdMascotaConsulta();
        String veterinarioConsulta = getVeterinarioConsulta();
        String diagnostico = getDiagnosticoConsulta();
        String tratamiento = getTratamientoConsulta();
        String nombreVacuna = getVacunaConsulta();
        String valorVacuna = getValorVacuna();
        String notasMedicas = getNotasMedicas();
        
        if (idMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el ID de la mascota.");
            return;
        }
        
        if(veterinarioConsulta == null || veterinarioConsulta.isBlank() ){
           javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el veterinario asignado a la consulta."); 
           return;
        }
        
        if (diagnostico.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el diagnóstico de la consulta.");
            return;
        }
        
        if (tratamiento.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el tratamiento asignado de la consulta.");
            return;
        }
        
        double valorVac = 0.0;
        if (!nombreVacuna.isBlank() || !valorVacuna.isBlank()) {
            
            if (nombreVacuna.isBlank()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escribe el nombre de la vacuna aplicada.");
                return;
            }
            
            if (valorVacuna.isBlank()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escribe el valor de la vacuna.");
                return;
            }
            
            try {
                valorVac = Double.parseDouble(valorVacuna);
                } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escriba el valor de la vacuna como un número, por ejemplo, 15500");
                return;
            }
            
            if (valorVac < 0 || !Double.isFinite(valorVac)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Escribe un valor válido para la vacuna, de 0 en adelante.");
            return;
            }
            
        }
        
        if (notasMedicas.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe las notas médicas de la consulta.");
            return;
        }
        
        int indiceVeterinario = cbVeterinarioConsulta.getSelectedIndex();
        String cedulaVeterinario = veterinarios.get(indiceVeterinario).getCedula();

        try {
            controlador.registrarConsulta(idMascota, cedulaVeterinario,
                    diagnostico, tratamiento, notasMedicas, nombreVacuna, valorVac);
            cargarConsultasParaCobrar();
            JOptionPane.showMessageDialog(this, "Consulta registrada correctamente.");
            
            txtIdMascotaConsulta.setText("");
            cbVeterinarioConsulta.setSelectedIndex(-1);
            txtDiagnostico.setText("");
            txtTratamiento.setText("");
            txtNotasMedicas.setText("");
            txtVacunaNombre.setText("");
            txtVacunaPrecio.setText("");
            txtNotasMedicas.setText("");
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
            
    }//GEN-LAST:event_btnRegistrarConsultaActionPerformed

    private void btnConsultarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHistorialActionPerformed
        String idMascota = getIdMascotaHistorial();
        
        if (idMascota.isBlank()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escribe el ID de la mascota para verificar su historial.");
            return;
        }
        
        try {
            List<Consulta> historial = controlador.consultarHistorial(idMascota);
            if (historial.isEmpty()) {
                areaHistorial.setText("Esta mascota aún no tiene consultas registradas.");
                return;
            }

            StringBuilder texto = new StringBuilder("Historial de la mascota " + idMascota + "\n");
            for (Consulta consulta : historial) {
                texto.append("\nCita agendada: ")
                        .append(consulta.getFechaHoraCita().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm")))
                        .append("\nVeterinario: ").append(consulta.getVeterinario().getNombre())
                        .append("\nDiagnóstico: ").append(consulta.getDiagnostico())
                        .append("\nTratamiento: ").append(consulta.getTratamiento())
                        .append("\nNotas médicas: ").append(consulta.getNotasMedicas())
                        .append("\nVacunas aplicadas: ");

                List<Modelo.Vacuna> vacunas = consulta.getVacunasAplicadas();
                if (vacunas.isEmpty()) {
                    texto.append("Ninguna");
                } else {
                    texto.append(String.join(", ",
                            vacunas.stream().map(Modelo.Vacuna::getNombre).toList()));
                }
                texto.append('\n');
            }
            areaHistorial.setText(texto.toString());
        } catch (IllegalArgumentException e) {
            areaHistorial.setText("");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnConsultarHistorialActionPerformed
    
    // R E C E P C I O N I S T A
    
    //DATOS SECCION CLIENTES
    public String getCedulaCliente(){
        return txtCedulaCliente.getText();
    }    
    
    public String getNombreCliente(){
        return txtNombreCliente.getText();
    }
    
    public String getTelefonoCliente(){
        return txtTelefonoCliente.getText();
    }
    
    public String getDireccionCliente(){
        return txtDireccionCliente.getText();
    }
    
    
    //DATOS SECCION MASCOTAS
    public String getCedulaDueno(){
        return txtCedulaDueno.getText();
    } 
    
    public String getIdMascota(){
        return txtIdMascota.getText();
    } 
    
    public String getNombreMascota(){
        return txtNombreMascota.getText();
    }
    
    public String getEdadMascota(){
        return txtEdadMascota.getText();
    }
    
    
    public String getPesoMascota(){
        return txtPesoMascota.getText();
    }
    
    public String getRazaMascota(){
        return txtRazaMascota.getText();
    }
    
    public String getPermisoCITES(){
        return txtPermisoCITES.getText();
    }
    
    public String getTipoMascota() {
        return (String) cbTipoMascota.getSelectedItem();
    }
    
    public boolean requiereSedacion() {
        return chkSedacion.isSelected();
    }
    
    //DATOS SECCION CITAS Y COBRO
    
    public String getIdMascotaCita(){
        return txtIdMascotaCita.getText();
    }
    
    public String getVeterinarioCita(){
        return (String)cbVeterinarioCita.getSelectedItem();
    }
    
    public String getFechaCita(){
        return txtFechaCita.getText();
    }
    
    public String getHoraCita(){
        return txtHoraCita.getText();
    }
    
    public String getConsultaCobro(){
        return (String)cbConsultaCobro.getSelectedItem();
    }                            
    
    // V E T E R I N A R I O
    
    //Sección de Registrar Consulta
    
    public String getIdMascotaConsulta(){
        return txtIdMascotaConsulta.getText();
    }
    
    public String getVeterinarioConsulta(){
        return (String)cbVeterinarioConsulta.getSelectedItem();
    }
    
    public String getDiagnosticoConsulta(){
        return txtDiagnostico.getText();
    }
    
    public String getTratamientoConsulta(){
        return txtTratamiento.getText();
    }
    
    public String getVacunaConsulta(){
        return txtVacunaNombre.getText();
    }
    
    public String getValorVacuna(){
        return txtVacunaPrecio.getText();
    }
    
    public String getNotasMedicas(){
        return txtNotasMedicas.getText();  
    }
    
    //Seccion Historial Clinico
    public String getIdMascotaHistorial(){
        return txtIdMascotaHistorial.getText();
    }
    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaVet().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaComprobante;
    private javax.swing.JTextArea areaHistorial;
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JButton btnConsultarHistorial;
    private javax.swing.JButton btnGenerarComprobante;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarConsulta;
    private javax.swing.JButton btnRegistrarMascota;
    private javax.swing.JComboBox<String> cbConsultaCobro;
    private javax.swing.JComboBox<String> cbTipoMascota;
    private javax.swing.JComboBox<String> cbVeterinarioCita;
    private javax.swing.JComboBox<String> cbVeterinarioConsulta;
    private javax.swing.JCheckBox chkSedacion;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCedulaDueno;
    private javax.swing.JTextField txtDiagnostico;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEdadMascota;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtHoraCita;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtIdMascotaCita;
    private javax.swing.JTextField txtIdMascotaConsulta;
    private javax.swing.JTextField txtIdMascotaHistorial;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtNotasMedicas;
    private javax.swing.JTextField txtPermisoCITES;
    private javax.swing.JTextField txtPesoMascota;
    private javax.swing.JTextField txtRazaMascota;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTratamiento;
    private javax.swing.JTextField txtVacunaNombre;
    private javax.swing.JTextField txtVacunaPrecio;
    // End of variables declaration//GEN-END:variables
}
