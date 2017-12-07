/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

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

    public int sucheBinaer(char[] charArray, int beginn, int ende, char suche, int counter) {

        counter++;
        int mitte = ((beginn + ende) / 2);

        if (suche > charArray[mitte]) {

            return sucheBinaer(charArray, mitte + 1, ende, suche, counter);

        }
        if (suche < charArray[mitte]) {

            return sucheBinaer(charArray, beginn, mitte - 1, suche, counter);

        }

        System.out.println("Der Buchstabe " + suche + " befindet sich an Position " + mitte);
        return counter;
    }

    public void suche(String name) {
        char[] nameArray = name.toUpperCase().toCharArray();
        char[] alphabetArray2 = alphabet();

        for (int i = 0; i < nameArray.length; i++) {
            int counter = 0;
            counter = sucheBinaer(alphabetArray2, 0, alphabetArray2.length - 1, nameArray[i], counter);

            System.out.println("Die Suche brauchte " + counter + " Durchläufe um gefunden zu werden.");

        }

    }
}
