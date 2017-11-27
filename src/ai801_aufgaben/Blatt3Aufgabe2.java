/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import java.util.Random;

/**
 *
 * @author Markus
 */
public class Blatt3Aufgabe2 {

    public Blatt3Aufgabe2() {
    }

    public String iterativ(int n) {
        String reihe = "";
        int[] zufall = new int[n];

        for (int i = 0; i < (zufall.length); i++) {
            Random zahl = new Random();
            zufall[i] = zahl.nextInt();
            reihe += zufall[i] + ", ";

        }

        return reihe;
    }
    int n = 0;
    int[] zufall2 = new int[100];

    public void rekursiv() {

        Random zahl = new Random();
        zufall2[n] = zahl.nextInt();
        System.out.print(zufall2[n] + ", ");
        n++;

        if (n < zufall2.length) {
            rekursiv();

        }

    }
}
