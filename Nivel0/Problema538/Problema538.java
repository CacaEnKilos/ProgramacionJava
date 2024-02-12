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
public class Problema538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uno = 0, dos = 0;
        do {
            uno = sc.nextInt();
            dos = sc.nextInt();
            if (uno != 0 && dos != 0) {
            if (uno < dos) {
                System.out.println("SENIL");
            } else{
                System.out.println("CUERDO");
            }
            }
        } while (uno != 0 && dos != 0);
    }
}
//Según chat gpt que si se lo valida. El mio no la valida.
////   public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int abuelo = scanner.nextInt();
//            int iglesia = scanner.nextInt();
//            if (abuelo == 0 && iglesia == 0) {
//                break;
//            }
//            if (abuelo < iglesia) {
//                System.out.println("SENIL");
//            } else {
//                System.out.println("CUERDO");
//            }
//        }
//        scanner.close();
//    }

