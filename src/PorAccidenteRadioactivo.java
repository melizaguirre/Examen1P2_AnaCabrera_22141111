/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class PorAccidenteRadioactivo extends Persona{
    Integer edadAlmomentoAccidente;
    String tipoAccidento;

    public PorAccidenteRadioactivo(Integer edadAlmomentoAccidente, String tipoAccidento, String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental, boolean tiene_Escuadron) {
        super(nombre, poder, debilidad, escuandron, TipoPersonaje, fuerza, agilidadFisica, agilidadMental, tiene_Escuadron);
        this.edadAlmomentoAccidente = edadAlmomentoAccidente;
        this.tipoAccidento = tipoAccidento;
    }

    public Integer getEdadAlmomentoAccidente() {
        return edadAlmomentoAccidente;
    }

    public void setEdadAlmomentoAccidente(Integer edadAlmomentoAccidente) {
        this.edadAlmomentoAccidente = edadAlmomentoAccidente;
    }

    public String getTipoAccidento() {
        return tipoAccidento;
    }

    public void setTipoAccidento(String tipoAccidento) {
        this.tipoAccidento = tipoAccidento;
    }

    @Override
    void find_Chance() {}
    
    
}
