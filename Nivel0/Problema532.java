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
public class Problema532 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int casos,uno,dos;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            uno= sc.nextInt();
            dos = sc.nextInt();
            int resultado = dos - uno;
            System.out.println(resultado);
        }
    }
}
