/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel1;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Problema407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casillas, posicion, tirada, resultado, suma, resto;
        do {
            resultado = 0;
            casillas = sc.nextInt();
            posicion = sc.nextInt();
            tirada = sc.nextInt();
            if (casillas != 0 && posicion != 0 && tirada != 0) {
                resultado = posicion + tirada;
                if (resultado > casillas) {
                    suma = posicion + tirada;
                    resto = suma - casillas;
                    resultado = casillas -resto;
                }
            
            System.out.println(resultado);
            }
        } while (casillas != 0 && posicion != 0 && tirada != 0);
    }
}
