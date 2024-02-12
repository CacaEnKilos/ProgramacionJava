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
public class Problema413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, alto, ancho, tamaño, blanca, negra;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            alto = sc.nextInt();
            ancho = sc.nextInt();
            tamaño= alto * ancho;
            if (tamaño % 2 == 0) {
                blanca = tamaño / 2;
                negra = blanca;
            } else{
                blanca = tamaño / 2 + 1;
                negra  = tamaño / 2;                 
                
            }
            System.out.println(blanca + " " + negra);
        }
    }
}
