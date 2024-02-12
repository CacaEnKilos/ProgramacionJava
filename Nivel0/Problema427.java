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
public class Problema427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String a, b;
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            a = sc.nextLine();
            b = sc.nextLine();
            if (a.equals("Luke") && b.equals("padre")) {
                System.out.println("TOP SECRET");
            } else{
                System.out.println(a + ", yo soy tu " + b);
            }
            
        }
    }
}
