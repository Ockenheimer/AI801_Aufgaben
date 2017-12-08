package ai801_aufgaben;


public class AI801_Aufgaben {

    public static void main(String[] args) {
//        long timestart;
//        long timemerk;
//        long timemark;
//
//        Blatt4Aufgabe1 b4a1 = new Blatt4Aufgabe1();
//        try {
//            b4a1.einlesen("C:\\Users\\Markus\\OneDrive\\OneDrive - et.hs-fulda.de\\AI801 - Datenstrukturen und Algorithmen\\AI801_Aufgaben\\geheim.txt");
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(AI801_Aufgaben.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        b4a1.suchen("Lotte");
//        b4a1.suchen("ich");
//        b4a1.suchen("Computer");
//          Blatt4Aufgabe3 b4a3 = new Blatt4Aufgabe3();
//          b4a3.alphabet();
//          b4a3.suche("schaefer");
//    Blatt4Aufgabe5 b4a5 = new Blatt4Aufgabe5();
//        b4a5.hashtableErstellen();
//        b4a5.listsort();

        Blatt5 b5a1 = new Blatt5(10);
        b5a1.befuelleFeld(b5a1.feld);

        //   System.out.println("Es waren "+b5a1.bubbleSort(b5a1.feld)+" Vertauschungen für eine Feldgröße von "+b5a1.feld.length +" nötig.");
        b5a1.quickSort(b5a1.feld, 0, b5a1.feld.length);
        System.out.println("Es waren " + b5a1.zaehler + " Vertauschungen für eine Feldgröße von " + b5a1.feld.length + " nötig.");

    }

}
