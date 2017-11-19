package ai801_aufgaben;

public class Aufgabe3 {

    public static long summe(int grenze) {
        int an1 = 1;
        int an = 2;
        int merk;

        long summe = 0;
        while (an <= grenze) {

            if (an % 2 == 0) {
                summe += an;
            }
            merk = an;
            an += an1;
            an1 = merk;

        }

        return summe;

    }

}
