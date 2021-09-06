package view;
import javax.swing.JOptionPane;

import controller.MasterWindows2Controller;
import utils.FieldUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MasterWindows2 extends javax.swing.JFrame {
	private static final long serialVersionUID = 7922888014138959268L;
	private MasterWindows2Controller controller;

    public MasterWindows2() {
        initComponents();
        controller = new MasterWindows2Controller(this);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        guardarCrear = new javax.swing.JButton();
        nombreCrear = new javax.swing.JTextField();
        habilidadCrear = new javax.swing.JTextField();
        codigoCrear = new javax.swing.JTextField();
        aniosCrear = new javax.swing.JTextField();
        fechaCrear = new javax.swing.JTextField();
        creadorCrear = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buscarActualizar = new javax.swing.JButton();
        codigoActualizar = new javax.swing.JTextField();
        aniosActualizar = new javax.swing.JTextField();
        fechaActualizar = new javax.swing.JTextField();
        habilidadActualizar = new javax.swing.JTextField();
        creadorActualizar = new javax.swing.JTextField();
        actualizarButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nombreActualizar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        borrarButton = new javax.swing.JButton();
        codigoBorrar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        consultarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codigoConsultar = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Codigo:");

        jLabel9.setText("Nombre (max 40 letras):");

        jLabel10.setText("Anios de Servicio: ");

        jLabel11.setText("Habilidad (max 40 letras):");

        jLabel12.setText("Fecha inicio (anio-mes-dia): ");

        jLabel13.setText("Creador (max 20 letras): ");

        guardarCrear.setText("Guardar");
        guardarCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCrearActionPerformed(evt);
            }
        });

        nombreCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCrearActionPerformed(evt);
            }
        });

        codigoCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoCrearActionPerformed(evt);
            }
        });

        aniosCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniosCrearActionPerformed(evt);
            }
        });

        creadorCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creadorCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(231, 231, 231)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fechaCrear)
                                .addComponent(codigoCrear, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aniosCrear, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(nombreCrear)
                                        .addComponent(habilidadCrear)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(guardarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(creadorCrear)))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniosCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilidadCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCrear)
                    .addComponent(fechaCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creadorCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear", jPanel1);

        jLabel2.setText("Codigo: ");

        jLabel4.setText("Anios de Servicio: ");

        jLabel5.setText("Fecha inicio (anio-mes-dia): ");

        jLabel7.setText("Habilidad (max 40 letras):");

        jLabel8.setText("Creador (max 20 letras):");

        buscarActualizar.setText("Buscar");
        buscarActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActualizarActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Nombre (max 40 letras):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigoActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(aniosActualizar)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(fechaActualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(nombreActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(habilidadActualizar)
                    .addComponent(creadorActualizar)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniosActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(habilidadActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarActualizar))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creadorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarButton))
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Actualizar", jPanel2);

        borrarButton.setText("Borrar");
        borrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarButton.addActionListener((event) -> controller.actionEventBtnBorrar(event));
        
        jLabel15.setText("Codigo escuela:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(34)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jLabel15, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(codigoBorrar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
        			.addComponent(borrarButton)
        			.addGap(100))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(9)
        			.addComponent(jLabel15)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(codigoBorrar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(borrarButton))
        			.addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jTabbedPane1.addTab("Borrar", jPanel3);

        consultarButton.setText("Consultar");
        consultarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo: ");

        codigoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(codigoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(consultarButton)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarButton))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consultar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        // TODO add your handling code here:
        String codigo_consultar = codigoConsultar.getText();
        if (codigo_consultar.isBlank() || FieldUtils.isEmpty(codigo_consultar) || FieldUtils.isNumber(codigo_consultar)) {
            JOptionPane.showMessageDialog(null,"No se permite campo vacio","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else {
            
        }
        
    }//GEN-LAST:event_consultarButtonActionPerformed

    private void codigoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoConsultarActionPerformed

    private void buscarActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActualizarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_buscarActualizarActionPerformed

    private void aniosCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniosCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniosCrearActionPerformed

    private void nombreCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCrearActionPerformed

    private void guardarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCrearActionPerformed
        // TODO add your handling code here:
        String codigo_crear =  codigoCrear.getText();
        String anios_crear = aniosCrear.getText();
        String fecha_crear = fechaCrear.getText();
        String nombre_crear = nombreCrear.getText();
        String habilidad_crear = habilidadCrear.getText();
        String creador_crear = creadorCrear.getText();
        if (FieldUtils.isEmpty(codigo_crear) || FieldUtils.isEmpty(anios_crear) || FieldUtils.isEmpty(fecha_crear) || FieldUtils.isEmpty(nombre_crear)
          || FieldUtils.isEmpty(habilidad_crear) || FieldUtils.isEmpty(creador_crear)) {
            JOptionPane.showMessageDialog(null,"No se permiten campos vacios","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isDate(fecha_crear)) {
            JOptionPane.showMessageDialog(null,"Fecha erronea","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isNumber(codigo_crear) || !FieldUtils.isNumber(anios_crear)) {
            JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(FieldUtils.maxLength(40, nombre_crear) || FieldUtils.maxLength(40, habilidad_crear) || FieldUtils.maxLength(20, creador_crear)) {
            JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Escuela ingresada con exito","OK",JOptionPane.INFORMATION_MESSAGE);
        }
        //jDialog1.setVisible(true);
        //jDialog1.setTitle("Creacion");
        //jDialog1.setContentPane("Colegio se ha creado satisfactoriamente");
        
        //jDialog1.setLocation(500, 100);
        //jDialog1.setSize(300, 300);
        
    }//GEN-LAST:event_guardarCrearActionPerformed

    private void codigoCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoCrearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_codigoCrearActionPerformed

    private void creadorCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creadorCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creadorCrearActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        String codigo_actualizar = codigoActualizar.getText();
        String anios_actualizar = aniosActualizar.getText();
        String fecha_actualizar = fechaActualizar.getText();
        String nombre_actualizar = nombreActualizar.getText();
        String habilidad_actualizar = habilidadActualizar.getText();
        String creador_actualizar = creadorActualizar.getText();
        if (FieldUtils.isEmpty(codigo_actualizar) || FieldUtils.isEmpty(anios_actualizar) || FieldUtils.isEmpty(fecha_actualizar) || FieldUtils.isEmpty(nombre_actualizar)
          || FieldUtils.isEmpty(habilidad_actualizar) || FieldUtils.isEmpty(creador_actualizar)) {
            JOptionPane.showMessageDialog(null,"No se permiten campos vacios","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isDate(fecha_actualizar)) {
            JOptionPane.showMessageDialog(null,"Fecha erronea","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isNumber(codigo_actualizar) || !FieldUtils.isNumber(anios_actualizar)) {
            JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(FieldUtils.maxLength(40, nombre_actualizar) || FieldUtils.maxLength(40, habilidad_actualizar) || FieldUtils.maxLength(20, creador_actualizar)) {
            JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Escuela ingresada con exito","OK",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_actualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MasterWindows2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterWindows2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterWindows2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterWindows2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MasterWindows2().setVisible(true);
            }
        });
    }
    
    public javax.swing.JTextField getCodigoBorrar() {
		return codigoBorrar;
	}
    
    private javax.swing.JButton actualizarButton;
    private javax.swing.JTextField aniosActualizar;
    private javax.swing.JTextField aniosCrear;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton buscarActualizar;
    private javax.swing.JTextField codigoActualizar;
    private javax.swing.JTextField codigoBorrar;
    private javax.swing.JTextField codigoConsultar;
    private javax.swing.JTextField codigoCrear;
    private javax.swing.JButton consultarButton;
    private javax.swing.JTextField creadorActualizar;
    private javax.swing.JTextField creadorCrear;
    private javax.swing.JTextField fechaActualizar;
    private javax.swing.JTextField fechaCrear;
    private javax.swing.JButton guardarCrear;
    private javax.swing.JTextField habilidadActualizar;
    private javax.swing.JTextField habilidadCrear;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nombreActualizar;
    private javax.swing.JTextField nombreCrear;
}
