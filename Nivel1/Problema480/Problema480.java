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
public class Problema480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos, uvas, cada, malas, resto, porsi, resultado,ns;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            resultado = 0;
            uvas = sc.nextInt();
            cada = sc.nextInt();
            malas = sc.nextInt();
            
            porsi = uvas / malas;
            resto = uvas-malas*porsi;
            resultado = porsi *cada;
            if (resto >= cada) {
                resultado += cada;
            } if (resto < malas ) {
                resultado += resto;
            }
            System.out.println(resultado);
        }
        
    }
}
/*3
24 1 5
36 2 8
14 5 12*/
