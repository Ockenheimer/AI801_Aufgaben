/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

/**
 *
 * @author studentai
 */
public class Aufgabe3 {

    public static long summe(int grenze) {
        int an1 = 1;
        int an2 = 1;
        int an;

        long summe = 0;
        do {

            an = an1 + an2;
            if (an % 2 == 0) {
                summe += an;
            }
            an2 = an1;
            an1 = an;

        } while (an < grenze);

        return summe;

    }

}
