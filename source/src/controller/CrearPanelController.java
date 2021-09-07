package controller;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import access.EscuelaDAO;
import utils.FieldUtils;
import view.CrearPanel;
import model.EscuelaModel;

public class CrearPanelController {
	private CrearPanel view;
	private EscuelaDAO repo;
	
	public CrearPanelController(CrearPanel view) {
		this.view = view;
		repo = new EscuelaDAO();
	}
	
	public void actionEventBtnGuardar(ActionEvent evt) {
		String codigo_crear =  view.getTxtFieldCod().getText();
        String anios_crear  = view.getTxtFieldAnios().getText();
        String fecha_crear = view.getTxtFieldFecha().getText();
        String nombre_crear = view.getTxtFieldNombre().getText();
        String habilidad_crear = view.getTxtFieldHabilidad().getText();
        String creador_crear = view.getTxtFieldCreador().getText();
        
        if (FieldUtils.isEmpty(codigo_crear) || FieldUtils.isEmpty(anios_crear) || FieldUtils.isEmpty(fecha_crear) || FieldUtils.isEmpty(nombre_crear)
          || FieldUtils.isEmpty(habilidad_crear) || FieldUtils.isEmpty(creador_crear)) {
            JOptionPane.showMessageDialog(null,"No se permiten campos vacios","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isDate(fecha_crear)) {
            JOptionPane.showMessageDialog(null,"Fecha erronea","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isNumber(codigo_crear) || !FieldUtils.isNumber(anios_crear)) {
            JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.maxLength(40, nombre_crear) || !FieldUtils.maxLength(40, habilidad_crear) || !FieldUtils.maxLength(20, creador_crear)) {
            JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","ALERTA",JOptionPane.WARNING_MESSAGE);
        } else if(repo.exist(Integer.parseInt(codigo_crear))) {
        	JOptionPane.showMessageDialog(null,"Escuela con el codigo "+codigo_crear+" ya existe en el sistema","ALERTA",JOptionPane.WARNING_MESSAGE);
        	
        } else {
        	EscuelaModel escuelaCrear = new EscuelaModel(Integer.parseInt(codigo_crear),nombre_crear,habilidad_crear,Integer.parseInt(anios_crear),creador_crear,fecha_crear);
        	boolean success = repo.save(escuelaCrear);
        	if (success) {
        		JOptionPane.showMessageDialog(null,"El registro con numero "+codigo_crear+" ha sido creado exitosamente","ALERTA",JOptionPane.INFORMATION_MESSAGE);
        	}
        }
	}
}
