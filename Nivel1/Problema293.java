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
public class Problema293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, insectos, aracnidos, crustaceos, escolopendras, anillos, patas;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            patas = 0;
            insectos = sc.nextInt();
            aracnidos = sc.nextInt();
            crustaceos = sc.nextInt();
            escolopendras = sc.nextInt();
            anillos = sc.nextInt();
            patas += insectos * 6;
            patas += aracnidos * 8;
            patas += crustaceos * 10;
            patas += escolopendras * 2 * anillos;
            System.out.println(patas);
        }
    }
}
