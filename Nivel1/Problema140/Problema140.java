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
public class Problema140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numero, resultado = 0;
        do {
            n = sc.nextInt();
            String m = Integer.toString(n);
            if (n > 0) {
            for (int i = 0; i < m.length(); i++) {
                System.out.print(m.charAt(i));
                numero = Character.getNumericValue(m.charAt(i));
                resultado = resultado + numero;
                if (i < m.length()-1) {
                    resultado = resultado + numero;
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");
            System.out.print(resultado);
            System.out.println();
            resultado =0;
            }
        } while (n > 0);
    }
}
/*
El mío no lo acepta que es el de arriba, el de chatGPT si lo acepta.
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            String numStr = Integer.toString(num);
            int sum = 0;
            for (int i = 0; i < numStr.length(); i++) {
                sum += Character.getNumericValue(numStr.charAt(i));
                System.out.print(numStr.charAt(i));
                if (i < numStr.length() - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
        }
        scanner.close();
    }
}

*/