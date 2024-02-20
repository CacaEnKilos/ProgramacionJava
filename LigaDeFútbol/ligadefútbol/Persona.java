/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligadefútbol;

import java.time.LocalDate;

/**
 *
 * @author dev
 */
public abstract class Persona {

    private int identificador;
    private String nombre;
    private String apellidos;
    private LocalDate fNac;
    private double energia;

    public Persona(int identificador, String nombre, String apellidos, LocalDate fNac, double energia) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNac = fNac;
        this.energia = energia;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public abstract void doping();

    @Override
    public String toString() {
        return "Persona{" + "identificador=" + identificador + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fNac=" + fNac + ", energia=" + energia + '}';
    }

    
}
