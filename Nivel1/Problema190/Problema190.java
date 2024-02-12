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
public class Problema190 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long den, num;
        do {
            num = sc.nextLong();
            den = sc.nextLong();
            if (num > den) {
            System.out.println(dividirFactoriales(num, den));
            }
        } while (num > den);
    }

    public static long dividirFactoriales(long num, long den) {
        long resultado = 0, resta, contador = 0;

        resta = num - den;
        for (long i = num - 1; i > den; i--) {
            num = num * i;
        }

        return  num;
    }

}

/*
El mío no lo acepta que es el de arriba, el de chatGPT si lo acepta.
import java.math.BigInteger;
import java.util.Scanner;

public class DivisionDeFactoriales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Leer los dos números del caso de prueba
            int num = scanner.nextInt();
            int den = scanner.nextInt();

            // Verificar la condición de terminación
            if (num < den) {
                break;
            }

            // Calcular y mostrar el resultado de la división de factoriales
            BigInteger resultado = calcularDivisionDeFactoriales(num, den);
            System.out.println(resultado);
        }

        scanner.close();
    }

    // Función para calcular la división de factoriales de manera eficiente
    private static BigInteger calcularDivisionDeFactoriales(int num, int den) {
        BigInteger resultado = BigInteger.ONE;

        // Iterar desde den + 1 hasta num e ir multiplicando el resultado
        for (int i = den + 1; i <= num; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }

        return resultado;
    }
}
*/
