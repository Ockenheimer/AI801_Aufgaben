/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

import java.awt.dnd.DragGestureRecognizer;

/**
 *
 * @author Markus
 */
public class Blatt4Aufgabe3 {

    public Blatt4Aufgabe3() {
    }

    public char[] alphabet() {
        char[] alphabetArray = new char[26];
        char c = 65;
        for (int i = 0; i < alphabetArray.length; i++, c++) {
            alphabetArray[i] = c;
        }

        return alphabetArray;
    }

    public int sucheBinaer(char[] charArray, char beginn, char ende, char suche, int counter) {

        char mitte;
        if ((beginn + ende) % 2 != 0) {
            mitte = (char) ((beginn + ende + 1) / 2);
        } else {
            mitte = (char) ((beginn + ende) / 2);
        }

        if (suche > charArray[mitte]) {
            counter += 1;
            return sucheBinaer(charArray, mitte, ende, suche, counter);

        }
        if (suche < charArray[mitte]) {
            counter += 1;
            return sucheBinaer(charArray, beginn, mitte, suche, counter);

        }
         
            return counter;
        }

    

    public void suche(String name) {
        char[] nameArray = name.toUpperCase().toCharArray();
        char[] alphabetArray2 = alphabet();
        int counter = 0;
        for (int i = 0; i < nameArray.length; i++) {
            counter = sucheBinaer(alphabetArray2, alphabetArray2[0], alphabetArray2[alphabetArray2.length - 1], nameArray[i], counter);

            System.out.println("Der Buchstabe " + nameArray[i] + " brauchte " + counter + " Durchläufe um gefunden zu werden.");

        }

    }
}
