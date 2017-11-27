package ai801_aufgaben;

public class Aufgabe3 {

    public Aufgabe3() {
    }

    public long getSumme(long max){
        return summe(max);
    }
    
    private long summe(long grenze) {
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
