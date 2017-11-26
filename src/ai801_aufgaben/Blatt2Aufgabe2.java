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
public class Blatt2Aufgabe2 {

    public Blatt2Aufgabe2() {

    }

    public long getAckermann(int n, int m) {
        return this.ackermann(n, m);
    }

    public long ackermann(long n, long m) {

        long a;
        if (n == 0) {
            a = m + 1;
            //System.out.println("Ich hab den ersten Ausgang genommen");
        } else {
            if (m == 0) {
                a = new Blatt2Aufgabe2().ackermann(n - 1, 1);
                //  System.out.println("Ich hab einmal rekursiv rufen müssen");
            } else {
                a = new Blatt2Aufgabe2().ackermann(n - 1, new Blatt2Aufgabe2().ackermann(n, m - 1));
                //System.out.println("Ich musste in die große Runde");
            }

        }

        return a;
    }
}
