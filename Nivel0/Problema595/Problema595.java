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
public class Problema595 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos;
        String n;
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            n = sc.nextLine();
            if (n.length() == 4) {
                System.out.print(n.charAt(0));
                System.out.println(n.charAt(1));
            } if (n.length() == 5) {
                System.out.print(n.charAt(0));
                System.out.print(n.charAt(1));
                System.out.println(n.charAt(2));
            } if (n.length() == 6) {
                System.out.print(n.charAt(0));
                System.out.print(n.charAt(1));
                System.out.print(n.charAt(2));
                System.out.println(n.charAt(3));
            } else if (n.length() == 3){
                System.out.println(n.charAt(0));
            }
        }
    }
}
