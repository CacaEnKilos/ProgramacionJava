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
public class Problema371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado,resultado;
        do {
            resultado = 0;
            lado = sc.nextInt();
            if (lado > 0) {
            for (int i = 1; i < lado + 1; i++) {
                resultado += i *3;
            }
            System.out.println(resultado);
            }
        } while (lado > 0);
    }
}
