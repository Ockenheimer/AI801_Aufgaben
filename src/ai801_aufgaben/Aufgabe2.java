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
public class Aufgabe2 {

    public static int summe(int grenze) {

        int summe = 0;

        for (int i = 0; i < grenze; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                summe += i;
            }

        }
        return summe;
    }
}
