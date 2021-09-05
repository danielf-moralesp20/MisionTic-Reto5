/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dmcew
 */
public class EscuelaModel {
    private int codigo_escuela;
    private String nombre_escuela;
    private String habilidad;
    private int anios_servicio;
    private String creador;
    private String fecha_inicio;
    
    
    public void EscuelaModel(int codigo_escuela, String nombre_escuela, String habilidad, 
            int anios_servicio, String creador, String fecha_inicio) {
        this.codigo_escuela=codigo_escuela;
        this.nombre_escuela=nombre_escuela;
        this.habilidad=habilidad;
        this.anios_servicio=anios_servicio;
        this.creador=creador;
        this.fecha_inicio=fecha_inicio;   
    }

    /**
     * @return the codigo_escuela
     */
    public int getCodigo_escuela() {
        return codigo_escuela;
    }

    /**
     * @param codigo_escuela the codigo_escuela to set
     */
    public void setCodigo_escuela(int codigo_escuela) {
        this.codigo_escuela = codigo_escuela;
    }

    /**
     * @return the nombre_escuela
     */
    public String getNombre_escuela() {
        return nombre_escuela;
    }

    /**
     * @param nombre_escuela the nombre_escuela to set
     */
    public void setNombre_escuela(String nombre_escuela) {
        this.nombre_escuela = nombre_escuela;
    }

    /**
     * @return the habilidad
     */
    public String getHabilidad() {
        return habilidad;
    }

    /**
     * @param habilidad the habilidad to set
     */
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * @return the anios_servicio
     */
    public int getAnios_servicio() {
        return anios_servicio;
    }

    /**
     * @param anios_servicio the anios_servicio to set
     */
    public void setAnios_servicio(int anios_servicio) {
        this.anios_servicio = anios_servicio;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the fecha_inicio
     */
    public String getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
}
