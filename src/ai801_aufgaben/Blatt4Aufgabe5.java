/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus
 */
public class Blatt4Aufgabe5 {

    public void hashtableErstellen() {
        Hashtable<String, Integer> ht = new Hashtable<>();
        Blatt4Aufgabe1 b4a1 = new Blatt4Aufgabe1();

        try {

            String[] buch = b4a1.einlesen("C:\\Users\\Markus\\OneDrive\\OneDrive - et.hs-fulda.de\\AI801 - Datenstrukturen und Algorithmen\\AI801_Aufgaben\\geheim.txt");
            for (int i = 0; i < buch.length; i++) {

                if (ht.containsKey(buch[i])) {
                    int merker = ht.get(buch[i]);
                    ht.put(buch[i], merker + 1);
                } else {
                    ht.put(buch[i], 1);
                }
            }
            System.out.println(ht.containsKey("﻿Johann"));
            System.out.println(buch[0].length());
        } catch (FileNotFoundException ex) {
            System.out.println("Datei nicht da.");
        }

    }
}
