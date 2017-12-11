package ai801_aufgaben;

import java.io.FileNotFoundException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AI801_Aufgaben {

    public static void main(String[] args) {
//        System.out.println("Hier die Lösungen für Aufgabenblatt 4");
//        System.out.println("Aufgabe 2:"); //Aufgabe 1 mit Funktion b4a1.einlesen
//        Blatt4Aufgabe1 b4a1 = new Blatt4Aufgabe1();
//        try {
//            b4a1.einlesen("geheim.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(AI801_Aufgaben.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        b4a1.suchen("Lotte");
//        b4a1.suchen("ich");
//        b4a1.suchen("Computer");
//        System.out.println("");
//        System.out.println("Aufgabe 4: Suche nach Buchstaben im Nachnamen:");
//        Blatt4Aufgabe3 b4a3 = new Blatt4Aufgabe3();
//        b4a3.alphabet(); //Aufgabe 3
//        b4a3.suche("schaefer");
//        System.out.println("");
//        System.out.println("Häufigkeit der Wörter im geheimen Text:");
//        Blatt4Aufgabe5 b4a5 = new Blatt4Aufgabe5();
//        b4a5.hashtableErstellen();
//        b4a5.listsort();

        System.out.println("Hier die Lösung für Aufgabenblatt 5 Teil 2:");
        System.out.println("Aufgabe 3:");
        Blatt5 b5a12 = new Blatt5(100);
        b5a12.befuelleFeld(b5a12.feld);
        for (int i = 0; i < b5a12.feld.length; i++) {
            System.out.print(b5a12.feld[i] + ", ");

        }
        System.out.println("");
        b5a12.quickSort(b5a12.feld, 0, b5a12.feld.length - 1);
        System.out.println("Es waren " + b5a12.zaehler + " Vertauschungen für eine Feldgröße von " + b5a12.feld.length + " nötig.");
        for (int i = 0; i < b5a12.feld.length; i++) {
            System.out.print(b5a12.feld[i] + ", ");

        }
        System.out.println("");
        System.out.println("Aufgabe 4:");
        long start;
        long stop;
        long dauer;
        int bubblecount = 0;
        int quickcount = 0;
        
        
        Blatt5 Test1 = new Blatt5(10000);

        char[] bubbletest1 = Test1.feld;
        char[] quicktest1 = Test1.feld;

        bubblecount++;
        start = System.currentTimeMillis();
        Test1.bubbleSort(bubbletest1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Bubblesort " + bubblecount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test1.feld.length + ".");

        quickcount++;
        start = System.currentTimeMillis();
        Test1.quickSort(quicktest1, 0, quicktest1.length - 1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Quicksort " + quickcount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test1.feld.length + ".");

        Blatt5 Test2 = new Blatt5(20000);

        char[] bubbletest2 = Test2.feld;
        char[] quicktest2 = Test2.feld;

        bubblecount++;
        start = System.currentTimeMillis();
        Test2.bubbleSort(bubbletest2);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Bubblesort " + bubblecount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test2.feld.length + ".");

        quickcount++;
        start = System.currentTimeMillis();
        Test2.quickSort(quicktest2, 0, quicktest2.length - 1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Quicksort " + quickcount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test2.feld.length + ".");

        Blatt5 Test3 = new Blatt5(40000);

        char[] bubbletest3 = Test3.feld;
        char[] quicktest3 = Test3.feld;

        bubblecount++;
        start = System.currentTimeMillis();
        Test3.bubbleSort(bubbletest3);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Bubblesort " + bubblecount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test3.feld.length + ".");

        quickcount++;
        start = System.currentTimeMillis();
        Test3.quickSort(quicktest3, 0, quicktest3.length - 1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Quicksort " + quickcount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test3.feld.length + ".");

        Blatt5 Test4 = new Blatt5(80000);

        char[] bubbletest4 = Test4.feld;
        char[] quicktest4 = Test4.feld;

        bubblecount++;
        start = System.currentTimeMillis();
        Test4.bubbleSort(bubbletest4);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Bubblesort " + bubblecount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test4.feld.length + ".");

        quickcount++;
        start = System.currentTimeMillis();
        Test4.quickSort(quicktest4, 0, quicktest4.length - 1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Quicksort " + quickcount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test4.feld.length + ".");

        Blatt5 Test5 = new Blatt5(160000);

        char[] bubbletest5 = Test5.feld;
        char[] quicktest5 = Test5.feld;

        bubblecount++;
        start = System.currentTimeMillis();
        Test5.bubbleSort(bubbletest5);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Bubblesort " + bubblecount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test5.feld.length + ".");

        quickcount++;
        start = System.currentTimeMillis();
        Test5.quickSort(quicktest5, 0, quicktest5.length - 1);
        stop = System.currentTimeMillis();
        dauer = stop - start;
        System.out.println("Quicksort " + quickcount + " dauerte " + dauer + " Millisekunden bei einer Feldgröße von " + Test5.feld.length + ".");

    }

}
