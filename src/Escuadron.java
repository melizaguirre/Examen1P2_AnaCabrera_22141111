
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Escuadron {
    String nombre;
    String  Lugar;
    Persona Lider;
    Boolean TipoPersonaje;
    ArrayList<Persona>miembros;

    public Escuadron(String nombre, String Lugar, String base, Persona Lider, Boolean TipoPersonaje, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.Lugar = Lugar;
        this.Lider = Lider;
        this.TipoPersonaje = TipoPersonaje;
        this.miembros = miembros;
    }

    public Escuadron(String nombre, String Lugar) {
        this.nombre = nombre;
        this.Lugar = Lugar;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public Persona getLider() {
        return Lider;
    }

    public void setLider(Persona Lider) {
        this.Lider = Lider;
    }

    public Boolean getTipoPersonaje() {
        return TipoPersonaje;
    }

    public void setTipoPersonaje(Boolean TipoPersonaje) {
        this.TipoPersonaje = TipoPersonaje;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }
    public void Heroe (boolean TipoPersonaje){
        TipoPersonaje = true; // HEROE
    }
    public void Villano (boolean TipoPersonaje){
        TipoPersonaje = true; // HEROE
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", Lugar=" + Lugar + ", Lider=" + Lider + ", TipoPersonaje=" + TipoPersonaje + ", miembros=" + miembros + '}';
    }
    
    
}
