/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefútbol;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author dev
 */
public class Entrenador extends Persona {

    private LocalDate anyoComienzoActividad;

    public Entrenador(LocalDate anyoComienzoActividad, int identificador, String nombre, String apellidos, LocalDate fNac, double energia) {
        super(identificador, nombre, apellidos, fNac, energia);
        this.anyoComienzoActividad = anyoComienzoActividad;
    }

    @Override
    public void doping() {
        this.doping();
    }

    public LocalDate getAnyoComienzoActividad() {
        return anyoComienzoActividad;
    }

    public void setAnyoComienzoActividad(LocalDate anyoComienzoActividad) {
        this.anyoComienzoActividad = anyoComienzoActividad;
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "anyoComienzoActividad=" + anyoComienzoActividad + '}';
    }

    public Entrenador entrenadorMasExperimentado() {
    ArrayList<Entrenador> ms = new ArrayList<>();
    for (Entrenador m : ms) {
        if (m instanceof Entrenador) {
            ms.add((Entrenador) m);
        }
    }
    if (ms.isEmpty()) {
        return null;
    } else {
        Comparator<Entrenador> comparadorPorAnyo = Comparator.comparing(Entrenador::getAnyoComienzoActividad);
        return Collections.max(ms, comparadorPorAnyo);
    }
}


}
