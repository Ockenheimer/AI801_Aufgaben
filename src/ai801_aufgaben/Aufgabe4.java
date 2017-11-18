/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

/**
 *
 * @author markusschaefer
 */
public class Aufgabe4 {

    public static long summe(int grenze) {

        
        long summe = 0;

        for (int nr1 = 1; nr1 < grenze; nr1++) {
            int sumteiler1 = 0;
            int sumteiler2 = 0;
            int nr2 = 0;
            System.out.println("Startzahl: " + nr1);
            for (int i = 1; i <= nr1; i++) {
                if ((nr1 % i) == 0) {
                    sumteiler1 += i;
                    System.out.println("1: " + i);
                }
                if (sumteiler1 != nr1) {
                    nr2 = sumteiler1;
                    for (int j = 1; j <= nr2; j++) {
                        if ((nr2 % j) == 0) {
                            sumteiler2 += j;
                          //  System.out.println("2: " + j);
                        }

                        if (sumteiler2 == nr1) {
                            summe += nr1;
                            System.out.println("Summe der Teiler: " + sumteiler2);
                        }
                    }
                }

            }

        }
        return summe;
    }
}
