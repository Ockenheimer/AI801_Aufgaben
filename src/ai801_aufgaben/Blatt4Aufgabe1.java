/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Markus
 */
public class Blatt4Aufgabe1 {

    public Blatt4Aufgabe1() {

    }
    static String[] woerter;

    public String[] einlesen(String datei) throws FileNotFoundException {

        String inhalt = "";
         
        String zeile;
        try {
           BufferedReader br = new BufferedReader(new FileReader(new File(datei)));
            while ((zeile = br.readLine())!= null) {
                inhalt += zeile + " ";

            }

        } catch (IOException ex) {
            Logger.getLogger(Blatt4Aufgabe1.class.getName()).log(Level.SEVERE, null, ex);
        
        }
      
        woerter = inhalt.split("(\\s|\\p{Punct})+");
         return woerter;
           }

//Aufgabe 2 aber bezieht sich ja auf das einlesen aus Aufgabe 1
    public void suchen(String suche) {
        int fundort = -1;
        int anzahl = 0;

        for (int i = 0; i < woerter.length-1; i++) {
            if (woerter[i].equalsIgnoreCase(suche)) {
                if (fundort == -1) {
                    fundort = i + 1;
                }

                anzahl++;
            }
        }
        if (fundort == -1) {
            System.out.println("Das Suchwort '" + suche + "' findet sich nicht im Text.");
        } else {
            System.out.println("Das Suchwort '" + suche + "' findet sich " + anzahl + "-mal im Text. Erstmals taucht es als Wort Nr. " + fundort + " auf.");
        }
    }

}
