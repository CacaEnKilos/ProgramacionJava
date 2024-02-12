/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivel2;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Problema638 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numSamples = scanner.nextInt();
            if (numSamples == 0) {
                break;
            }
            int[] temperatures = new int[numSamples];
            for (int i = 0; i < numSamples; i++) {
                temperatures[i] = scanner.nextInt();
            }
            processTemperatures(temperatures);
        }
    }

    public static void processTemperatures(int[] temperatures) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < temperatures.length; i++) {
            minTemp = Math.min(minTemp, temperatures[i]);
            maxTemp = Math.max(maxTemp, temperatures[i]);
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] == temperatures[j]) {
                    minDistance = Math.min(minDistance, j - i);
                }
            }
        }
        if (minDistance == Integer.MAX_VALUE) {
            minDistance = 0;
        }
        System.out.println(minTemp + " " + maxTemp + " " + minDistance);
    }
}

