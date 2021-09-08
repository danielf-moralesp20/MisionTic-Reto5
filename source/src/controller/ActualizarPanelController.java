package controller;

import java.awt.event.ActionEvent;
import java.util.Optional;

import javax.swing.JOptionPane;

import access.EscuelaDAO;
import model.EscuelaModel;
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
		String cod = view.getTxtFieldCod().getText();
	    String anios = view.getTxtFieldAnios().getText();
	    String fecha = view.getTxtFieldFecha().getText();
	    String nombre = view.getTxtFieldNombre().getText();
	    String habilidad = view.getTxtFieldHabilidad().getText();
	    String creador = view.getTxtFieldCreador().getText();
	     
	    if (FieldUtils.isEmpty(anios) || FieldUtils.isEmpty(fecha) || FieldUtils.isEmpty(nombre)
	      || FieldUtils.isEmpty(habilidad) || FieldUtils.isEmpty(creador)) {
	        JOptionPane.showMessageDialog(null,"No se permiten campos vacios","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.isDate(fecha)) {
	        JOptionPane.showMessageDialog(null,"Formato de fecha erronea","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.isNumber(anios)) {
	        JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.maxLength(40, nombre) || !FieldUtils.maxLength(40, habilidad) || !FieldUtils.maxLength(20, creador)) {
	        JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else {
	    	EscuelaModel nueva = new EscuelaModel(Integer.parseInt(cod), nombre, habilidad, Integer.parseInt(anios), creador, fecha);
	    	boolean success = repo.updateById(nueva);
	    	
	    	if(success) {
	    		JOptionPane.showMessageDialog(null,"Escuela actualizada con exito","OK",JOptionPane.INFORMATION_MESSAGE);
	    		view.getTxtFieldCod().setText("");
	    		view.getTxtFieldAnios().setText("");
	        	view.getTxtFieldCreador().setText("");
	        	view.getTxtFieldFecha().setText("");
	        	view.getTxtFieldHabilidad().setText("");
	        	view.getTxtFieldNombre().setText("");
	        	view.setEditing(false);
	    	} else
	    		JOptionPane.showMessageDialog(null,"Algo ha salido mal y no se ha podido actualizar el registro","ALERTA",JOptionPane.WARNING_MESSAGE);
	    }
	}
	
	public void actionEventBtnBuscar(ActionEvent evt) {
		String cod = view.getTxtFieldCod().getText();
	     
	    if (FieldUtils.isEmpty(cod)) {
	        JOptionPane.showMessageDialog(null,"Por favor, ingrese un codigo a buscar","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else if(!FieldUtils.isNumber(cod)) {
	        JOptionPane.showMessageDialog(null,"Formato de codigo incorrecto","ALERTA",JOptionPane.WARNING_MESSAGE);
	    } else if(!repo.exist(Integer.parseInt(cod))) {
	    	JOptionPane.showMessageDialog(null, "Lo sentimos pero ho hemos encontrado ningun registro con el codigo " + cod, "ALERTA", JOptionPane.WARNING_MESSAGE);
	    }
	    else {
	        EscuelaModel result = repo.findById(Integer.parseInt(cod));

	        
	        if (Optional.ofNullable(result).isEmpty())
	        	JOptionPane.showMessageDialog(null, "Lo sentimos algo ha salido mal y no hemos podido obtener los datos relacionados con el codigo " + cod, "ALERTA", JOptionPane.WARNING_MESSAGE);
	        else {
	        	view.getTxtFieldAnios().setText(Integer.toString(result.getAnios_servicio()));
	        	view.getTxtFieldCreador().setText(result.getCreador());
	        	view.getTxtFieldFecha().setText(result.getFecha_inicio());
	        	view.getTxtFieldHabilidad().setText(result.getHabilidad());
	        	view.getTxtFieldNombre().setText(result.getNombre_escuela());
	        	view.setEditing(true);
	        }
	    }
		
		
	}
}
