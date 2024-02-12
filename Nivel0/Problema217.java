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
public class Problema217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            n=sc.nextInt();
            if (n > 1000 || n == 0) {
                n=0;
            } else if (n % 2 == 0) {
                System.out.println("DERECHA");
            } else{
                System.out.println("IZQUIERDA");
            }
        } while (n != 0);
    }
}
