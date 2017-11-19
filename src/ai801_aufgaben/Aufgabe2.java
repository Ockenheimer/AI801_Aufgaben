
package ai801_aufgaben;


public class Aufgabe2 {

    public static int summe(int grenze) {

        int summe = 0;

        for (int i = 0; i < grenze; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                summe += i;
            }

        }
        return summe;
    }
}
