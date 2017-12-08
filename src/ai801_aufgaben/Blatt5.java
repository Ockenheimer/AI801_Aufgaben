/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import com.sun.org.apache.bcel.internal.generic.ReturnInstruction;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author markusschaefer
 */
public class Blatt5 {

    char[] feld;

//Aufgabe 1
    public Blatt5(int groesse) {
        this.feld = new char[groesse];
    }

    public char getChar(int i) {
        return this.feld[i];
    }

    public void befuelleFeld(char[] array) {

        for (int i = 0; i < array.length; i++) {
            Random r = new Random();

            array[i] = (char) (97 + r.nextInt(25));
        }

    }

//Aufgabe 2
    public int bubbleSort(char[] array) {
        int zaehler = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char merker = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = merker;
                    zaehler++;

                }
            }
        }
        return zaehler;
    }
    
    public static int zaehler = 0;

    public char[] quickSort(char[] array, int start, int stop) {
        zaehler++;
        
        int mitte =  stop  / 2;
        List<Character> kleiner= new ArrayList();
        List<Character> groesser= new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=array[mitte]) {
                kleiner.add(array[i]);
            
            }else {
                groesser.add(array[i]);
            }    
        }
        String kleinerString = kleiner.toString().replace(",","");
       char[] kleinerArray = kleinerString.substring(1, kleinerString.length()-1).replace(" ","").toCharArray();
       String groesserString = groesser.toString().replace(",", "");
       char[] groesserArray = groesserString.substring(1,groesserString.length()-1).replace(" ", "").toCharArray();
       if (kleinerArray.length>1){
           kleinerArray = quickSort(kleinerArray, 0, kleinerArray.length);
       }
       if (groesserArray.length>1){
           groesserArray = quickSort(groesserArray, 0, groesserArray.length);
           
       }
        
       String arrayvorbau = kleinerArray.toString().replace(",", "")+groesserArray.toString().replace(",", "");
       
       array = arrayvorbau.substring(1, arrayvorbau.length()-1).replace(" ","").toCharArray();
       
       return array;
    }


}
