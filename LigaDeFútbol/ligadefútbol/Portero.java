/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefútbol;

import Excepciones.IncorrectParadasPorcentaje;
import java.time.*;


/**
 *
 * @author dev
 */
public class Portero extends Persona {

    private double porcentajeParadas;

    public Portero(double porcentajeParadas, int identificador, String nombre, String apellidos, LocalDate fNac, double energia) throws IncorrectParadasPorcentaje {
        super(identificador, nombre, apellidos, fNac, energia);
        this.setPorcentajeParadas(porcentajeParadas);
    }

    public double getPorcentajeParadas() {
        return porcentajeParadas;
    }

    public void setPorcentajeParadas(double porcentajeParadas) throws IncorrectParadasPorcentaje {
        if (porcentajeParadas < 0 || porcentajeParadas > 100) {
            throw new Excepciones.IncorrectParadasPorcentaje(super.getNombre() + " -> " + porcentajeParadas + " El porcentaje ha de comprender entre 0 y 100");
        } else {
            this.porcentajeParadas = porcentajeParadas;
        }

    }

    @Override
    public void doping() {
        super.setEnergia(super.getEnergia() + super.getEnergia() * 10 / 100);
        double nuevoPorcentaje = this.getPorcentajeParadas() + 5;
        try {
            this.setPorcentajeParadas(nuevoPorcentaje);
        } catch (IncorrectParadasPorcentaje e) {
            System.out.println("Error en doping del portero: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Portero{" + "porcentajeParadas=" + porcentajeParadas + '}';
    }

}
