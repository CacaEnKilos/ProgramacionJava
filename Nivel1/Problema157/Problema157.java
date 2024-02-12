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
public class Problema157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = 0, dia = 0, mes = 0, dias = 0, nochevieja = 365, resultado = 0;
        casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            dias = sc.nextInt();
            mes = sc.nextInt();
            switch (mes) {
                case 1:
                    dia = 0;
                    break;
                case 2:
                    dia = 31;
                    break;
                case 3:
                    dia = 31 + 28;
                    break;
                case 4:
                    dia = 31 + 28 + 31;
                    break;
                case 5:
                    dia = 31 + 28 + 31 + 30;
                    break;
                case 6:
                    dia = 31 + 28 + 31 + 30 + 31;
                    break;
                case 7:
                    dia = 31 + 28 + 31 + 30 + 31 + 30;
                    break;
                case 8:
                    dia = 31 + 28 + 31 + 30 + 31 + 30 + 31;
                    break;
                case 9:
                    dia = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                    break;
                case 10:
                    dia = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                    break;
                case 11:
                    dia = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                    break;
                case 12:
                    dia = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                    break;
            }
            dia = dia + dias;
            resultado = nochevieja - dia;
            System.out.println(resultado);
        }
    }
}
