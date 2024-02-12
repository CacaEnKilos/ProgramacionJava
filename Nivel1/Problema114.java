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
public class Problema114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int casos, n = 0;
        casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            n = sc.nextInt();
            //factorial(casos,n);
            calcularUltimoDigitoFactorial(n);
        }
    }
    
    public static void calcularUltimoDigitoFactorial(int n){
        int ultimoDigito = 1;

        for (int i = 1; i <= n; i++) {
            ultimoDigito = (ultimoDigito * i) % 10; // Solo mantener el último dígito, ya que el resto de la división de un factorial es == al ultimo número
        }

        System.out.println(ultimoDigito);
    }
    
    //De esta manera funciona pero da error de que tarda mucho
    /*public static void factorial(int casos, int n){
        int m = n;
        String l = null;
        for (int i = 1; i <= n-1; i++) {
           m = m * i;
           
        }
        l = Integer.toString(m);
        //Esto me sirve para mostrar el último carácter de un String
        //  |
        //  v
        int longitud = l.length();
        System.out.println(l.charAt(longitud - 1));
        
    }*/
}
