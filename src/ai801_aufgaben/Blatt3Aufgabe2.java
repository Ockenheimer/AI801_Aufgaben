
package ai801_aufgaben;

import java.util.Random;


public class Blatt3Aufgabe2 {

    public Blatt3Aufgabe2() {
    }

    public int zufallIterativ(int n) {
        int summe = 0;
        int[] zufall = new int[n];

        for (int i = 0; i < (zufall.length); i++) {
            Random zahl = new Random();
            zufall[i] = zahl.nextInt();
            summe += zufall[i];

        }

        return summe;
    }

    public int zufallRekursiv(int n) {
        int summe = 0;
        int[] zufall2 = new int[n];
                   
        return zufallszahl(n, zufall2, summe);
    }

    private int zufallszahl(int n, int[] array, int summe) {
         Random zahl = new Random();
         n--;
        array[n] = zahl.nextInt();
        summe+= array[n];
       if (n>0){
        zufallszahl(n, array, summe);}
          return summe;
    }

   

}
