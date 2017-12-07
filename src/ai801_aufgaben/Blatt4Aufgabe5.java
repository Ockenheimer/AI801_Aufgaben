/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author Markus
 */
public class Blatt4Aufgabe5 {

    public Hashtable<String, Integer> ht = new Hashtable<>();

    public void hashtableErstellen() {

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

    public void listsort() {

       List<Map.Entry<String, Integer>> liste = new ArrayList<>(ht.entrySet());
       /*keine Ahnung wie das sortieren läuft.
       *Irgendwie muss der rechte vom linken Wert getrennt werden und der rechte als Sortierung angesprochen werden.
*/
       //liste.sort();
        System.out.println(liste.get(0));
        
        }
    }
