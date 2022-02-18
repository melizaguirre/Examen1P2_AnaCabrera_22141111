/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class SuperHumano extends Persona{
    String superPoder;

    public SuperHumano(String superPoder, String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental, boolean tiene_Escuadron) {
        super(nombre, poder, debilidad, escuandron, TipoPersonaje, fuerza, agilidadFisica, agilidadMental, tiene_Escuadron);
        this.superPoder = superPoder;
    }

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }
    
}
