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
public class Problema155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,perimetro;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a >= 0 && b >= 0) {
            perimetro = a*2 + b*2;
            System.out.println(perimetro);
            }
        } while (a >= 0 && b >= 0);
    }
}
