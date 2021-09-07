package view;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

public class MasterWindows extends JFrame {
	private static final long serialVersionUID = 7922888014138959268L;

    public MasterWindows() {
        initComponents();
    }

    private void initComponents() {
        tabPane = new JTabbedPane();
        tabPane.addTab("Consultar", new ConsultarPanel());
        tabPane.addTab("Crear", new CrearPanel());
        tabPane.addTab("Actualizar", new ActualizarPanel());
        tabPane.addTab("Borrar", new BorrarPanel());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPane, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
        );
        
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MasterWindows().setVisible(true);
            }
        });
    }
    
    private JTabbedPane tabPane;
}
