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
            JOptionPane.showMessageDialog(null,"Por favor ingresa todos los campos en el formulario", "ALERTA", JOptionPane.WARNING_MESSAGE);
        else if (!FieldUtils.isNumber(cod)) 
        	JOptionPane.showMessageDialog(null, "Tipo de dato incorrecto. Ingresa un codigo de escuela correcto.", "ALERTA", JOptionPane.WARNING_MESSAGE);
        else if (!repo.exist(Integer.parseInt(cod)))
        	JOptionPane.showMessageDialog(null, "Lo sentimos pero ho hemos encontrado ningun registro con el codigo " + cod, "ALERTA", JOptionPane.WARNING_MESSAGE);
        else {
        	boolean success = repo.deleteById(Integer.parseInt(cod));
        	if (success) {
        		JOptionPane.showMessageDialog(null,"El registro con numero "+cod+" ha sido borrado exitosamente","ALERTA",JOptionPane.WARNING_MESSAGE);
        		view.getTxtFieldCod().setText("");
        	}
        	else      		
        		JOptionPane.showMessageDialog(null,"Lo sentimos, parece que algo ha salido mal y no hemos podido eliminar el registro","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }
}
