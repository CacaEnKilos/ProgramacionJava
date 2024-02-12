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
public class Problema436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, contador;
        double grosor;
        while(sc.hasNextLine()){
            grosor = sc.nextInt();
            altura = sc.nextInt();
            for (int i = 0; altura < 10; i++) {
                
            }
            do {
                contador = 0;
                grosor = sc.nextInt();
                altura = sc.nextInt();
                grosor = grosor/1000000;
                grosor *= 2;
                System.out.println(grosor);
                contador++;
            } while (altura >= grosor);
            System.out.println(contador);
        }
        
    }
}
