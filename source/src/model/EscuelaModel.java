package model;

public class EscuelaModel {
    private int codigo_escuela;
    private String nombre_escuela;
    private String habilidad;
    private int anios_servicio;
    private String creador;
    private String fecha_inicio;
    
    
    public EscuelaModel(int codigo_escuela, String nombre_escuela, String habilidad, 
            int anios_servicio, String creador, String fecha_inicio) {
        this.codigo_escuela=codigo_escuela;
        this.nombre_escuela=nombre_escuela;
        this.habilidad=habilidad;
        this.anios_servicio=anios_servicio;
        this.creador=creador;
        this.fecha_inicio=fecha_inicio;   
    }
    
    public int getCodigo_escuela() {
        return codigo_escuela;
    }

    public void setCodigo_escuela(int codigo_escuela) {
        this.codigo_escuela = codigo_escuela;
    }

    public String getNombre_escuela() {
        return nombre_escuela;
    }

    public void setNombre_escuela(String nombre_escuela) {
        this.nombre_escuela = nombre_escuela;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getAnios_servicio() {
        return anios_servicio;
    }

    public void setAnios_servicio(int anios_servicio) {
        this.anios_servicio = anios_servicio;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

	@Override
	public String toString() {
		return "EscuelaModel [codigo_escuela=" + codigo_escuela + ", nombre_escuela=" + nombre_escuela + ", habilidad="
				+ habilidad + ", anios_servicio=" + anios_servicio + ", creador=" + creador + ", fecha_inicio="
				+ fecha_inicio + "]";
	}
}
