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
import java.util.Scanner;

public class Problema138 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, nVeces = 0;
        int resultado;

        nVeces = sc.nextInt();

        for (int i = 0; i < nVeces; i++) {
            n = sc.nextInt();
            resultado = zerosEnFactorial(n);
            System.out.println(resultado);
        }
    }

    public static int zerosEnFactorial(int numero) {
        int resultado = 0;
        while (numero >= 5) {
            numero /= 5;
            resultado += numero;
        }
        return resultado;
    }
}

