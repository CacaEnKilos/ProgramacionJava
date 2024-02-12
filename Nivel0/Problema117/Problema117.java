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
public class Problema117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String nombre, soy;
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            soy = sc.next();
            nombre = sc.next();
            System.out.println("Hola, " + nombre + ".");
        }
    }
}