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
public class Problema112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaCamaras, vMax, segundostarda, ndistanciaCamaras, 
            v20, horasTarda, horasMax,velocidadalaqueva,tiempoquetarda;
        do {
            distanciaCamaras = sc.nextInt();
            vMax = sc.nextInt();
            segundostarda = sc.nextInt();
            if (distanciaCamaras != 0  || vMax != 0 || segundostarda != 0) {
                
            
            horasTarda = segundostarda / 3600;
            ndistanciaCamaras = distanciaCamaras / 1000;
            
            horasMax = ndistanciaCamaras / vMax;
            
            tiempoquetarda = segundostarda / 3600;
            
            velocidadalaqueva = ndistanciaCamaras /  tiempoquetarda;
                
            v20 = vMax * 120 / 100;
            
                if (velocidadalaqueva <= vMax) {
                    System.out.println("OK");
                } if (velocidadalaqueva >= v20 && (distanciaCamaras > 0  || vMax > 0 || segundostarda > 0)) {
                    System.out.println("PUNTOS");
                }if (velocidadalaqueva > vMax && velocidadalaqueva <= v20) {
                    System.out.println("MULTA");
                }if ((distanciaCamaras <= 0  || vMax <= 0 || segundostarda <= 0)) {
                    System.out.println("ERROR");
                }
            
            }
            
        } while (distanciaCamaras != 0  || vMax != 0 || segundostarda != 0);
    }
}
/*
De mi manera funciona ya que le he preguntado a chatGPT que hay mal y me ha dicho que esta bien, 
pero la solución que he encontrado en internet que si la acepta hace esto:

import java.util.Scanner;

public class p112 {

    static int ONE_HOUR = 3600;
    static int ONE_KILOMETTER = 1000;

    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);
        double metters, maxTime, timeSeconds, medianTime, km, timeHours;

        while (true) {

            metters = s.nextInt();
            maxTime   = s.nextInt();
            timeSeconds  = s.nextInt();

            if (metters == 0 && maxTime == 0 && timeSeconds == 0)
                break;

            km = metters / ONE_KILOMETTER;
            timeHours = timeSeconds / ONE_HOUR;
            medianTime = km / timeHours;

            if (metters <= 0 || maxTime <= 0 || timeSeconds <= 0)
                System.out.println("ERROR");
            else if (medianTime < maxTime)
                System.out.println("OK");
            else
                System.out.println(
                        ((medianTime - maxTime) < (0.2 * maxTime))
                            ? "MULTA"
                            : "PUNTOS"
                );

        }

    }

}
*/