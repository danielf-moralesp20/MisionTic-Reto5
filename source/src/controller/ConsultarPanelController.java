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
		
        if (codigo_consultar.isBlank() || FieldUtils.isEmpty(codigo_consultar)) {
            JOptionPane.showMessageDialog(null,"No se permite campo vacio","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isNumber(codigo_consultar)) {
        	JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(!repo.exist(Integer.parseInt(codigo_consultar))) {
        	JOptionPane.showMessageDialog(null,"Escuela con el codigo "+codigo_consultar+"existe en el sistema","ALERTA",JOptionPane.WARNING_MESSAGE);
      
        } else {
            
        }
	}
}