package controller;

import java.awt.event.ActionEvent;
//import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import access.EscuelaDAO;
import model.EscuelaModel;
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
        } else {
        	List<EscuelaModel> result = repo.findAllLikeId(Integer.parseInt(codigo_consultar));
        	DefaultTableModel model = (DefaultTableModel)view.getTable().getModel();
        	if (result!=null) {
        		model.setRowCount(0);
        		for(EscuelaModel registro : result) {
        			Vector<?> vectorRegistro = registro.toArray();
        			model.addRow(vectorRegistro);
        		}
        	} else {
        		model.setRowCount(0);
        	}
        }	
	}
}
