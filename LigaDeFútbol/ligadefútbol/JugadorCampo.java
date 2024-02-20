/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefútbol;

import Excepciones.Over1000Score;
import java.time.LocalDate;

/**
 *
 * @author dev
 */
public class JugadorCampo extends Persona {

    private int golesMarcados;

    public JugadorCampo(int golesMarcados, int identificador, String nombre, String apellidos, LocalDate fNac, double energia) throws Over1000Score {
        super(identificador, nombre, apellidos, fNac, energia);
        this.setGolesMarcados(golesMarcados);
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) throws Over1000Score {
        this.golesMarcados = golesMarcados;
        if (golesMarcados > 1000) {
            throw new Excepciones.Over1000Score(super.getNombre() + " -> " + this.getGolesMarcados()+ " Un jugador no puede haber marcado más de 1000 goles");
        } else {
            this.golesMarcados = golesMarcados;
        }
    }

    @Override
    public void doping() {
        super.setEnergia(super.getEnergia() + super.getEnergia() * 20 / 100);
    }

    @Override
    public String toString() {
         return super.toString() + "JugadorCampo{" + "golesMarcados=" + golesMarcados + '}';
    }
    
    
}
