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
public class Problema380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, total = 0;
        int[] coste;

        do {
            total = 0;
            n = sc.nextInt();
            if (n != 0) {
                
            
            coste = new int[n];
            for (int i = 0; i < n; i++) {
                coste[i] = sc.nextInt();
                total += coste[i];
                }
            
            System.out.println(total);
            }
        } while (n != 0);
    }
}
