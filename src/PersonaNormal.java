/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class PersonaNormal extends Persona {

    public PersonaNormal(String nombre, String poder, String debilidad, String escuandron, String TipoPersonaje, Integer fuerza, Integer agilidadFisica, Integer agilidadMental, boolean tiene_Escuadron) {
        super(nombre, poder, debilidad, escuandron, TipoPersonaje, fuerza, agilidadFisica, agilidadMental, tiene_Escuadron);
    }

    @Override
    void find_Chance() {}
 
}
