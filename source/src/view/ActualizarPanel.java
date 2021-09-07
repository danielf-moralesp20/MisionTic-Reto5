package view;

import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import controller.ActualizarPanelController;

public class ActualizarPanel extends JPanel {
	private static final long serialVersionUID = 554572027412468655L;
	private ActualizarPanelController controller;
	private boolean isEditing = false;

	public ActualizarPanel() {
		controller = new ActualizarPanelController(this);
		initComponents();
		updateEnableState();
	}
	
	private void initComponents() {
		lblCodigo = new JLabel("Codigo: ");
        lblAnios = new JLabel("Anios de Servicio: ");
        lblFecha = new JLabel("Fecha inicio (anio-mes-dia): ");
        lblHabilidad = new JLabel("Habilidad (max 40 letras):");
        lblCreador = new JLabel("Creador (max 20 letras):");
        lblNombre = new JLabel("Nombre (max 40 letras):");
        
        btnBuscar = new JButton("Buscar");
        btnBuscar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBuscar.addActionListener((event) -> controller.actionEventBtnBuscar(event));
        
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnActualizar.addActionListener((event) -> controller.actionEventBtnActualizar(event));
        
        txtFieldCod = new JTextField();
        txtFieldAnios = new JTextField();
        txtFieldFecha = new JTextField();
        txtFieldHabilidad = new JTextField();
        txtFieldCreador = new JTextField();
        txtFieldNombre = new JTextField(); 

        GroupLayout panelLayout = new GroupLayout(this);
        setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldCod, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtFieldAnios)
                    .addComponent(lblCodigo)
                    .addComponent(lblAnios)
                    .addComponent(lblFecha)
                    .addComponent(txtFieldFecha))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnActualizar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(txtFieldNombre, GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHabilidad, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFieldHabilidad)
                    .addComponent(txtFieldCreador)
                    .addComponent(lblCreador, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnios)
                    .addComponent(lblHabilidad))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAnios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldHabilidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreador)
                    .addComponent(lblFecha))
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCreador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(33, 33, 33))
        );
	}
	
	private void updateEnableState() { 
		btnBuscar.setEnabled(!isEditing);
		txtFieldCod.setEnabled(!isEditing);
		
		btnActualizar.setEnabled(isEditing);
		txtFieldNombre.setEnabled(isEditing);
	    txtFieldAnios.setEnabled(isEditing);
	    txtFieldCreador.setEnabled(isEditing);
	    txtFieldFecha.setEnabled(isEditing);
	    txtFieldHabilidad.setEnabled(isEditing);
	}
	
	public void setEditing(boolean isEditing) {
		this.isEditing = isEditing;
		updateEnableState();
	}
	
	public boolean isEditing() {
		return isEditing;
	}
	
	public JTextField getTxtFieldNombre() {
		return txtFieldNombre;
	}
	
	public JTextField getTxtFieldAnios() {
		return txtFieldAnios;
	}
	
	public JTextField getTxtFieldCod() {
		return txtFieldCod;
	}
	
	public JTextField getTxtFieldCreador() {
		return txtFieldCreador;
	}
	
	public JTextField getTxtFieldFecha() {
		return txtFieldFecha;
	}
	
	public JTextField getTxtFieldHabilidad() {
		return txtFieldHabilidad;
	}

    private JLabel lblNombre;
    private JLabel lblCodigo;
    private JLabel lblAnios;
    private JLabel lblFecha;
    private JLabel lblHabilidad;
    private JLabel lblCreador;
    private JButton btnActualizar;
    private JButton btnBuscar;
    private JTextField txtFieldNombre;
    private JTextField txtFieldAnios;
    private JTextField txtFieldCod;
    private JTextField txtFieldCreador;
    private JTextField txtFieldFecha;
    private JTextField txtFieldHabilidad;
}
