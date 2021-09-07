package controller;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import access.EscuelaDAO;
import utils.FieldUtils;
import view.ActualizarPanel;

public class ActualizarPanelController {
	private ActualizarPanel view;
	private EscuelaDAO repo;
	
	public ActualizarPanelController(ActualizarPanel view) {
		this.view = view;
		repo = new EscuelaDAO();
	}
	
	public void actionEventBtnActualizar(ActionEvent evt) {
		String codigo_actualizar = view.getTxtFieldCod().getText();
	    String anios_actualizar = view.getTxtFieldAnios().getText();
	    String fecha_actualizar = view.getTxtFieldFecha().getText();
	    String nombre_actualizar = view.getTxtFieldNombre().getText();
	    String habilidad_actualizar = view.getTxtFieldHabilidad().getText();
	    String creador_actualizar = view.getTxtFieldCreador().getText();
	     
	    if (FieldUtils.isEmpty(codigo_actualizar) || FieldUtils.isEmpty(anios_actualizar) || FieldUtils.isEmpty(fecha_actualizar) || FieldUtils.isEmpty(nombre_actualizar)
	      || FieldUtils.isEmpty(habilidad_actualizar) || FieldUtils.isEmpty(creador_actualizar)) {
	        JOptionPane.showMessageDialog(null,"No se permiten campos vacios","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.isDate(fecha_actualizar)) {
	        JOptionPane.showMessageDialog(null,"Fecha erronea","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.isNumber(codigo_actualizar) || !FieldUtils.isNumber(anios_actualizar)) {
	        JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
	    } else if(FieldUtils.maxLength(40, nombre_actualizar) || FieldUtils.maxLength(40, habilidad_actualizar) || FieldUtils.maxLength(20, creador_actualizar)) {
	        JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
	    } else {
	        JOptionPane.showMessageDialog(null,"Escuela ingresada con exito","OK",JOptionPane.INFORMATION_MESSAGE);
	    }
	}
	
	public void actionEventBtnBuscar(ActionEvent evt) {
		String codigo_actualizar = view.getTxtFieldCod().getText();
	}
}
