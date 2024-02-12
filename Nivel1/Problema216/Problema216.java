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
public class Problema216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos,gotas = 0, horas, segundos, minutos, resto;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            gotas = sc.nextInt();
            horas = (int) gotas / 3600;
        resto = gotas % 3600;
        minutos = (int) resto / 60;
        segundos = (int) resto % 60;
        
         System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            
        }
    }
}
