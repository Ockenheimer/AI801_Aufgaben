package ai801_aufgaben;

public class Aufgabe3 {

    public Aufgabe3() {
    }

    public long getSumme(long max){
        return summe(max);
    }
    
    private long summe(long grenze) {
        long an1 = 1;
        long an = 2;
        long merk;

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
