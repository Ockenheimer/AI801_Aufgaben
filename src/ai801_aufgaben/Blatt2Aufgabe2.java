
package ai801_aufgaben;


public class Blatt2Aufgabe2 {

    public Blatt2Aufgabe2() {

    }

    public long ackermann(long n, long m) {
        System.out.println("Ich rechne gerade die Ackemann-Funktion mit n = " + n + " und m = " + m);
        long a;
        // Möglichkeit 1: n der Funktion ist 0
        if (n == 0) {
            a = m + 1;

        } else {
            // Möglichkeit 2: m der Funktion ist 0
            if (m == 0) {
                a = ackermann(n - 1, 1);

            } else {
                // Möglichkeit 3: Weder m noch n sind 0
                a = ackermann(n - 1, ackermann(n, m - 1));

            }

        }

        return a;
    }
}
