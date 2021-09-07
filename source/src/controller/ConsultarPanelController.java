package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import access.EscuelaDAO;
import utils.FieldUtils;
import view.ConsultarPanel;

public class ConsultarPanelController {
	private ConsultarPanel view;
	private EscuelaDAO repo;
	
	public ConsultarPanelController(ConsultarPanel view) {
		this.view = view;
		repo = new EscuelaDAO();
	}
	
	public void actionEventBtnConsultar(ActionEvent evt) {
		String codigo_consultar = view.getTxtFieldCod().getText();
		
        if (codigo_consultar.isBlank() || FieldUtils.isEmpty(codigo_consultar) || FieldUtils.isNumber(codigo_consultar)) {
            JOptionPane.showMessageDialog(null,"No se permite campo vacio","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else {
            
        }
	}
}
