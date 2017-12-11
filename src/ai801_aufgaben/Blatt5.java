package ai801_aufgaben;

import java.util.Random;

/**
 *
 * @author markusschaefer
 *
 */
public class Blatt5 {

    char[] feld;

//Aufgabe 1
    public Blatt5(int groesse) {
        this.feld = new char[groesse];
    }

    public void befuelleFeld(char[] array) {

        for (int i = 0; i < array.length; i++) {
            //erzeuge ein neues Random;
            Random r = new Random();
            //errechne aus dem Random die nächste Ganzzahl und erzeuge einen 
            //kleingeschriebenen Buchstaben daraus.
            //Füge diesen im Array an die Stelle i.
            array[i] = (char) (97 + r.nextInt(26));
        }

    }

//Aufgabe 2
    public int bubbleSort(char[] array) {
        int zaehler = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                //wenn fällt j kleiner ist als das vorangegangene Feld, dann tausche die beiden.
                if (array[j] < array[j - 1]) {
                    char merker = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = merker;
                    zaehler++;

                }
            }
        }
        return zaehler;
    }

    public static long zaehler = 0;
    //Aufgabe 3:
    public long quickSort(char[] liste, int start, int stop) {

        char ausgewählt = liste[(((stop - start) / 2) + start)];
        int kleiner = start;
        int groesser = stop;

        if (stop - start <= 1) {
            return zaehler;
        }

        do {
            while (liste[kleiner] < ausgewählt) {
                kleiner++;

            }

            while (liste[groesser] > ausgewählt) {
                groesser--;

            }

            if (kleiner <= groesser) {
                char merker = liste[kleiner];
                liste[kleiner] = liste[groesser];
                liste[groesser] = merker;
                groesser--;
                kleiner++;

                zaehler++;
            }
        } while (kleiner <= groesser);

        if (start < kleiner) {
             quickSort(liste, start, groesser);
        }
        if (stop > groesser) {
             quickSort(liste, kleiner, stop);
        }

        return zaehler;
    }

}
