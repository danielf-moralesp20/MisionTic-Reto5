package controller;

import javax.swing.JOptionPane;

import access.EscuelaDAO;
import utils.FieldUtils;
import view.MasterWindows2;

public class MasterWindows2Controller {
	private MasterWindows2 view;
	private EscuelaDAO repo;
	
	public MasterWindows2Controller(MasterWindows2 view) {
		this.view = view;
		repo = new EscuelaDAO();
	}
	
	public void actionEventBtnBorrar(java.awt.event.ActionEvent evt) {
		String cod = view.getCodigoBorrar().getText();
		
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
        		view.getCodigoBorrar().setText("");
        	}
        	else      		
        		JOptionPane.showMessageDialog(null,"Lo sentimos, parece que algo ha salido mal y no hemos podido eliminar el registro","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }
	
	 // Faltante
	public void actionEventBtnGuardar(java.awt.event.ActionEvent evt) {
		String codigo_crear =  view.getCodigoCrear().getText();
        String anios_crear = view.getAniosCrear().getText();
        String fecha_crear = view.getFechaCrear().getText();
        String nombre_crear = view.getNombreCrear().getText();
        String habilidad_crear = view.getHabilidadCrear().getText();
        String creador_crear = view.getCreadorCrear().getText();
        
        if (FieldUtils.isEmpty(codigo_crear) || FieldUtils.isEmpty(anios_crear) || FieldUtils.isEmpty(fecha_crear) || FieldUtils.isEmpty(nombre_crear)
          || FieldUtils.isEmpty(habilidad_crear) || FieldUtils.isEmpty(creador_crear)) {
            JOptionPane.showMessageDialog(null,"No se permiten campos vacios","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isDate(fecha_crear)) {
            JOptionPane.showMessageDialog(null,"Fecha erronea","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(!FieldUtils.isNumber(codigo_crear) || !FieldUtils.isNumber(anios_crear)) {
            JOptionPane.showMessageDialog(null,"Tipo de dato erroneo","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else if(FieldUtils.maxLength(40, nombre_crear) || FieldUtils.maxLength(40, habilidad_crear) || FieldUtils.maxLength(20, creador_crear)) {
            JOptionPane.showMessageDialog(null,"Excediste el numero de caracteres","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Escuela ingresada con exito","OK",JOptionPane.INFORMATION_MESSAGE);
        }
	}
	
	// Faltante
	public void actionEventBtnConsultar(java.awt.event.ActionEvent evt) {
		String codigo_consultar = view.getCodigoConsultar().getText();
		
        if (codigo_consultar.isBlank() || FieldUtils.isEmpty(codigo_consultar) || FieldUtils.isNumber(codigo_consultar)) {
            JOptionPane.showMessageDialog(null,"No se permite campo vacio","¡ALERTA!",JOptionPane.WARNING_MESSAGE);
        } else {
            
        }
	}
	
	// Faltante
	public void actionEventBtnActualizar(java.awt.event.ActionEvent evt) {
		String codigo_actualizar = view.getCodigoActualizar().getText();
	    String anios_actualizar = view.getAniosActualizar().getText();
	    String fecha_actualizar = view.getFechaActualizar().getText();
	    String nombre_actualizar = view.getNombreActualizar().getText();
	    String habilidad_actualizar = view.getHabilidadActualizar().getText();
	    String creador_actualizar = view.getCreadorActualizar().getText();
	     
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
	
	// Faltante
	public void actionEventBtnBuscar(java.awt.event.ActionEvent evt) {
		String codigo_actualizar = view.getCodigoActualizar().getText();
	}
}
