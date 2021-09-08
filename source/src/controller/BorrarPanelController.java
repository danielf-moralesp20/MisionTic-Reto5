package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import access.EscuelaDAO;
import utils.FieldUtils;
import view.BorrarPanel;

public class BorrarPanelController {
	private BorrarPanel view;
	private EscuelaDAO repo;

	public BorrarPanelController(BorrarPanel view) {
		this.view = view;
		repo = new EscuelaDAO();
	}
	
	public void actionEventBtnBorrar(ActionEvent evt) {
		String cod = view.getTxtFieldCod().getText();
		
        if (FieldUtils.isEmpty(cod))
            JOptionPane.showMessageDialog(null,"No se permiten campos vacios", "ALERTA", JOptionPane.WARNING_MESSAGE);
        else if (!FieldUtils.isNumber(cod)) 
        	JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto. Intentalo de nuevo", "ALERTA", JOptionPane.WARNING_MESSAGE);
        else if (!repo.exist(Integer.parseInt(cod)))
        	JOptionPane.showMessageDialog(null, "Lo sentimos, no hemos encontrado el registro con el codigo " + cod, "ALERTA", JOptionPane.WARNING_MESSAGE);
        else {
        	boolean success = repo.deleteById(Integer.parseInt(cod));
        	if (success) {
        		JOptionPane.showMessageDialog(null,"El registro con numero "+cod+" ha sido borrado exitosamente","ALERTA",JOptionPane.WARNING_MESSAGE);
        		view.getTxtFieldCod().setText("");
        	}
        	else      		
        		JOptionPane.showMessageDialog(null,"Lo sentimos, parece que algo ha salido mal. Intentalo nuevamente","ALERTA",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
