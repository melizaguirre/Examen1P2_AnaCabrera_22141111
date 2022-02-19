/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public abstract class Persona {
    private String nombre; 
    private String poder;
    private String debilidad;
    private String escuandron;
    private String TipoPersonaje;
    private Integer fuerza;
    private Integer agilidadFisica;
    private Integer agilidadMental;
    boolean tiene_Escuadron;

    public Persona(String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental, boolean tiene_Escuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuandron = escuandron;
        this.TipoPersonaje = TipoPersonaje;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.tiene_Escuadron = tiene_Escuadron;
    }

    public Persona(String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuandron = escuandron;
        this.TipoPersonaje = TipoPersonaje;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuandron() {
        return escuandron;
    }

    public void setEscuandron(String escuandron) {
        this.escuandron = escuandron;
    }

    public String getTipoPersonaje() {
        return TipoPersonaje;
    }

    public void setTipoPersonaje(String TipoPersonaje) {
        this.TipoPersonaje = TipoPersonaje;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(Integer agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public Integer getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(Integer agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public boolean isTiene_Escuadron() {
        return tiene_Escuadron;
    }

    public void setTiene_Escuadron(boolean tiene_Escuadron) {
        this.tiene_Escuadron = tiene_Escuadron;
    }
    
     abstract void find_Chance();
     
     
     public boolean equals(Object obj) {
		
		if (obj instanceof Persona) {
			Persona otraPersona = (Persona)obj;
			return otraPersona.nombre.equals(nombre);
		}
		else
			return false;
	}

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuandron=" + escuandron + ", TipoPersonaje=" + TipoPersonaje + ", fuerza=" + fuerza + ", agilidadFisica=" + agilidadFisica + ", agilidadMental=" + agilidadMental + ", tiene_Escuadron=" + tiene_Escuadron + '}';
    }
    

   
}