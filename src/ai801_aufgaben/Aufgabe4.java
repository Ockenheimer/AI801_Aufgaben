package ai801_aufgaben;

public class Aufgabe4 {

    public Aufgabe4() {
    }

    public int getSumme(int max){
        return this.summe(max);
    }
    private int summe(int grenze) {

        int summe = 0;
        long schritte = 0;

        for (int nr1 = 1; nr1 < grenze; nr1++) {
            int sumteiler1 = 0;
            int merker = nr1;

         /*  if ((nr1 % 1000) == 0) {
                System.out.print(".");
            }
            if ((nr1 % 10000) == 0) {
                System.out.println(nr1);
            }
*/
            for (int i = 1; i <= nr1 / 2; i++) {
                if ((nr1 % i) == 0) {
                    sumteiler1 += i;
                }
                schritte++;
            }
            int sumteiler2 = 0;
            if (sumteiler1 != nr1) {

                for (int j = 1; j <= sumteiler1 / 2; j++) {

                    if ((sumteiler1 % j) == 0) {
                        sumteiler2 += j;
                    }
                    schritte++;

                }
            }

            if (sumteiler2 == merker) {
                summe += nr1;
            }

        }
        System.out.println("Ich habe " + schritte + " Berechnungen durchführen müssen.");
        return summe;
    }
}
