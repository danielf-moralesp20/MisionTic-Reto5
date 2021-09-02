package view;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MasterWindow extends JFrame {
	private static final long serialVersionUID = -1075374168870389796L;

	public MasterWindow() {
		super();
		initComponents();
	}
	
	private void initComponents() {
		JTabbedPane pane = new JTabbedPane();
		// TODO: Agregar Tabs aqui
		
		setTitle("Escuela CRUD");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(720, 480));
		setContentPane(pane);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void start() {
		setVisible(true);
	}
}
