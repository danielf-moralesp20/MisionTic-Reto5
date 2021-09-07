package view;

import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import controller.CrearPanelController;

public class CrearPanel extends JPanel {
	private static final long serialVersionUID = -7248903523319454421L;
	private CrearPanelController controller;

	public CrearPanel() {
		controller = new CrearPanelController(this);
		initComponents();
	}
	
	private void initComponents() {
		txtFieldCrear = new JButton("Guardar");
		txtFieldCrear.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtFieldCrear.addActionListener((event) -> controller.actionEventBtnGuardar(event));
		
        lblAnios = new JLabel("Anios de Servicio: ");
        lblHabilidad = new JLabel("Habilidad (max 40 letras):");
        lblFecha = new JLabel("Fecha inicio (anio-mes-dia): ");
        lblCreador = new JLabel("Creador (max 20 letras): ");
        lblCodigo = new JLabel("Codigo:");
        lblNombre = new JLabel("Nombre (max 40 letras):");
        txtFieldFecha = new JTextField();
        txtFieldCod = new JTextField();
        txtFieldNombre = new JTextField();
        txtFieldHabilidad = new JTextField();
        txtFieldAnios = new JTextField();        
        txtFieldCreador = new JTextField();

        GroupLayout panelLayout = new GroupLayout(this);
        setLayout(panelLayout);
        
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnios)
                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addComponent(lblCodigo)
                            .addGap(231, 231, 231)
                            .addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFieldFecha)
                                .addComponent(txtFieldCod, GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldAnios, GroupLayout.Alignment.LEADING)
                                .addComponent(lblFecha, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHabilidad, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(txtFieldNombre)
                                        .addComponent(txtFieldHabilidad)))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFieldCrear, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCreador, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addComponent(txtFieldCreador)))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(lblNombre))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblHabilidad, GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAnios))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAnios, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldHabilidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(lblCreador))
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCrear)
                    .addComponent(txtFieldFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCreador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
	}
	
	public JTextField getTxtFieldFecha() {
		return txtFieldFecha;
	}
	
	public JTextField getTxtFieldCod() {
		return txtFieldCod;
	}
	
	public JTextField getTxtFieldAnios() {
		return txtFieldAnios;
	}
	
	public JTextField getTxtFieldCreador() {
		return txtFieldCreador;
	}
	
	public JTextField getTxtFieldHabilidad() {
		return txtFieldHabilidad;
	}
	
	public JTextField getTxtFieldNombre() {
		return txtFieldNombre;
	}
	
	private JLabel lblAnios;
    private JLabel lblHabilidad;
    private JLabel lblFecha;
    private JLabel lblCreador;
    private JLabel lblCodigo;
    private JLabel lblNombre;
    private JButton txtFieldCrear;
    private JTextField txtFieldFecha;
    private JTextField txtFieldCod;
    private JTextField txtFieldAnios;
    private JTextField txtFieldCreador;
    private JTextField txtFieldHabilidad;
    private JTextField txtFieldNombre;
}
