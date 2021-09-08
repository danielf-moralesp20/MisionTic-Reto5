package view;

import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

import controller.ConsultarPanelController;

public class ConsultarPanel extends JPanel {
	private static final long serialVersionUID = -1925137958908709534L;
	private ConsultarPanelController controller;
	
	public ConsultarPanel() {
		controller = new ConsultarPanelController(this);
		initComponents();
	}
	
	private void initComponents() {
        btnConsultar = new JButton("Consultar");
        btnConsultar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnConsultar.addActionListener((event) -> controller.actionEventBtnConsultar(event));
        
        lblCodigo = new JLabel("Codigo: ");
        table = new JTable();
        table.setModel(new TableModel());
        
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        
        txtFieldCod = new JTextField();
	
        GroupLayout jPanel4Layout = new GroupLayout(this);
        setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnConsultar)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
	}
	public JTable getTable() {
		return table;
	}
	
	public JTextField getTxtFieldCod() {
		return txtFieldCod;
	}

	private JButton btnConsultar;
	private JLabel lblCodigo;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txtFieldCod;
	
	private class TableModel extends DefaultTableModel {
		private static final long serialVersionUID = -3845279432176130615L;
		private Class<?>[] types = new Class [] {
			Integer.class, String.class, Integer.class, String.class, String.class, String.class
	    };
		private boolean[] canEdit = new boolean [] {
			false, false, false, false, false, false
        };

		public TableModel() {
			super(new Object [][] {}, new String [] {"Codigo", "Nombre", "Anios servicio", "Fecha inicio", "Habilidad", "Creador"});
		}
        
		public Class<?> getColumnClass(int columnIndex) {
			return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
        	return canEdit [columnIndex];
        }
	}
}
