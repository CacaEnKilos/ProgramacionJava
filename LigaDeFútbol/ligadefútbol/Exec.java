/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligadefútbol;

import Excepciones.*;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author dev
 */
public class Exec {

    public static void main(String[] args) {
        ArrayList<Persona> p = new ArrayList<>();
        Entrenador e1 = new Entrenador(LocalDate.parse("1969-05-03"), 1, "Pep", "Guardiola", LocalDate.parse("2014-03-03"), 20.0);
        Entrenador e2 = new Entrenador(LocalDate.parse("1957-12-11"), 2, "Carlo", "Ancelotti", LocalDate.parse("2015-06-08"), 03.0);
        Entrenador e3 = new Entrenador(LocalDate.parse("1971-12-11"), 3, "Luis", "Enrique", LocalDate.parse("2017-08-11"), 45.0);

        p.add(e1);

        p.add(e2);

        p.add(e3);

        try {
            JugadorCampo j1 = new JugadorCampo(874, 7, "Cristiano", "Ronaldo", LocalDate.parse("1985-02-05"), 89);
            p.add(j1);
        } catch (Over1000Score e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            JugadorCampo j2 = new JugadorCampo(10, 10, "Leo", "Messi", LocalDate.parse("1982-12-09"), 83.0);
            p.add(j2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            JugadorCampo j3 = new JugadorCampo(10, 4, "Rodrigo", "Goes", LocalDate.parse("1994-06-02"), 91.0);
            p.add(j3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Portero p1 = new Portero(13, 5, "Dimitreski", "Dimitreski", LocalDate.parse("1984-02-02"), 62.0);

            p.add(p1);
        } catch (IncorrectParadasPorcentaje e) {
            System.out.println("Error en el portero: " + e.getMessage());
        }
        try {
            Portero p2 = new Portero(45, 6, "Keylor", "Navas", LocalDate.parse("1984-02-02"), 45.0);
            p.add(p2);
        } catch (IncorrectParadasPorcentaje e) {
            System.out.println("Error en el portero: " + e.getMessage());
        }

        try {
            Portero p3 = new Portero(101, 8, "Antonio", "Aldea", LocalDate.parse("2002-03-03"), 99.0);
        } catch (IncorrectParadasPorcentaje e) {
            System.out.println("Error en el portero: " + e.getMessage());
        }

        listar(p);
        //doparPorterosMalos(p);
        //listar(p);
        mediaGoles(p);
        entrenadorExperimentado(p);
    }

    public static void listar(ArrayList<Persona> p) {
        System.out.println("------------- Listado de Personas -------------");
        for (Persona persona : p) {
            System.out.println(persona);

        }
    }
    
    public static void doparPorterosMalos(ArrayList<Persona> p){
        System.out.println("------------- Dopar Porteros con -20% paradas -------------");
        for (Persona persona : p) {
            persona.doping();
        }
    }
    
    public static void mediaGoles(ArrayList<Persona> p){
        System.out.println("------------- Media de Goles Marcados -------------");
        int GolesMarcados = 0;
        int Jugadores = 0;
        for (Persona persona : p) {
            if (persona instanceof JugadorCampo){ 
                JugadorCampo jugador = (JugadorCampo) persona;
                GolesMarcados += jugador.getGolesMarcados();
                Jugadores++;
            }
        }
        double mediaGoles = (double) GolesMarcados / (double) Jugadores;
        System.out.println(mediaGoles);
    }
    
    public static void entrenadorExperimentado(ArrayList<Persona> p) {
        System.out.println("------------- El entrenador Más Experimentado Es: -------------");
        for (Persona persona : p) {
            if (persona instanceof Entrenador) {
                Entrenador entrenador = (Entrenador) persona;
                System.out.println("El entrenador más Experimentado es: " + entrenador.entrenadorMasExperimentado());
            }
            
        }
    }
}
