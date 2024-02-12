package SegundoTrimestre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problema366 {

    public static void main(String[] args) {
        (new NinyosBuenos()).run();
    }

    static class NinyosBuenos {

        public void run() {
            Scanner sc = new Scanner(System.in);

            int casos;

            do {
                casos = sc.nextInt();
                ArrayList<Ninyo> n = new ArrayList<>();
                Ninyo n1;
                for (int i = 0; i < casos; i++) {
                    n1 = new Ninyo(sc.nextInt(), sc.nextInt());
                    n.add(n1);
                }
                Collections.sort(n);
                for (Ninyo ninyo : n) {
                    System.out.println(ninyo.bueno + " " + ninyo.peso);
                }
                if (casos != 0) {
                    System.out.println();
                }
            } while (casos != 0);

        }
    }

    static class Ninyo implements Comparable<Ninyo> {

        int bueno;
        int peso;

        public Ninyo(int bueno, int peso) {
            this.bueno = bueno;
            this.peso = peso;
        }

        @Override
        public String toString() {
            return "Ninyo{" + "bueno=" + bueno + ", peso=" + peso + '}';
        }

        @Override
        public int compareTo(Ninyo o) {
            if (this.bueno != o.bueno) {
                return o.bueno - this.bueno; // Orden descendente de bondad
            } else {
                return this.peso - o.peso; // Orden ascendente de peso
            }
        }

    }

}

//3 80 2 100 12 100 1 2 1 1 1 1 0