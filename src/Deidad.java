/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Deidad extends Extraterrestre{
    boolean tieneCreyentes;
    String mitologia;

    public Deidad(boolean tieneCreyentes, String mitologia, String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental, boolean tiene_Escuadron) {
        super(nombre, poder, debilidad, escuandron, TipoPersonaje, fuerza, agilidadFisica, agilidadMental, tiene_Escuadron);
        this.tieneCreyentes = tieneCreyentes;
        this.mitologia = mitologia;
    }
    
}
