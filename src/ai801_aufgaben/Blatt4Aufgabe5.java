
package ai801_aufgaben;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;


public class Blatt4Aufgabe5 {

    public Hashtable<String, Integer> ht = new Hashtable<>();

    public void hashtableErstellen() {

        Blatt4Aufgabe1 b4a1 = new Blatt4Aufgabe1();

        try {

            String[] buch = b4a1.einlesen("src//AI801_Aufgaben//geheim.txt");
            for (int i = 0; i < buch.length; i++) {

                if (ht.containsKey(buch[i])) {
                    int merker = ht.get(buch[i]);
                    ht.put(buch[i], merker + 1);
                } else {
                    ht.put(buch[i], 1);
                }
            }
            System.out.println(ht.containsKey("Johann"));
            System.out.println(buch[0].length());
        } catch (FileNotFoundException ex) {
            System.out.println("Datei nicht da.");
        }


    }

    public void listsort() {

       //hier soll die Liste sortiert werden.

       List<Map.Entry<String, Integer>> liste = new ArrayList<>(ht.entrySet());

       //Implementierung einer neuen Sortierfunktion
       Collections.sort(liste, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
           if (o1.getValue()<o2.getValue()){
           return 1;
           }    
           if (o1.getValue()>o2.getValue()){
               return -1;
           }
           return 0;
           
           }
       });
       
       System.out.println(liste.get(0));
        
        }
    }
