package view;

import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.BorrarPanelController;

public class BorrarPanel extends JPanel {
	private static final long serialVersionUID = -5554451028703599904L;
	BorrarPanelController controller;
	
	public BorrarPanel() {
		this.controller = new BorrarPanelController(this);
		initComponents();
	}
	
	private void initComponents() {
		btnBorrar = new JButton("Borrar");
		btnBorrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnBorrar.addActionListener((event) -> controller.actionEventBtnBorrar(event));
		
		lblCodigo = new JLabel("Codigo:");
		txtFieldCod = new JTextField();

        GroupLayout panelLayout = new GroupLayout(this);
        setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(100, 100, 100))
        );
        
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addContainerGap(206, Short.MAX_VALUE))
        );
	}
	
	public JTextField getTxtFieldCod() {
		return txtFieldCod;
	}
	
	private JButton btnBorrar;
	private JLabel lblCodigo;
	private JTextField txtFieldCod;
}
