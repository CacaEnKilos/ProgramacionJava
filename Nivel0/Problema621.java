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
public class Problema621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, n;
        casos= sc.nextInt();
        for (int i = 0; i < casos; i++) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + 1);
            } else {
                System.out.println(n - 1);
            }
        }
    }
}
