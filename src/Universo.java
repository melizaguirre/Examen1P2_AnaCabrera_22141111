
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
public class Universo {
    String nombreU; 
    ArrayList <Escuadron> squad;

    public Universo(String nombreU, ArrayList<Escuadron> squad) {
        this.nombreU = nombreU;
        this.squad = squad;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public ArrayList<Escuadron> getSquad() {
        return squad;
    }

    public void setSquad(ArrayList<Escuadron> squad) {
        this.squad = squad;
    }
    
    
    
}
