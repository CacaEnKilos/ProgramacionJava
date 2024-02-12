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
public class Problema313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, saldo, cambio,fin;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            fin = 0;
            saldo = sc.nextInt();
            cambio = sc.nextInt();
            fin += saldo;
            fin += cambio;
            
            if (fin < 0) {
                System.out.println("NO");
            } else{
                System.out.println("SI");
            }
        }
    }
}
