/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel0;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Problema362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dia, mes;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            } else{
                System.out.println("NO");
            }
        }
    }
}
