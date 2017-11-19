/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

/**
 *
 * @author markusschaefer
 */
public class Aufgabe4 {

    public static int summe(int grenze) {

        int summe = 0;
        long schritte=0;

        for (int nr1 = 1; nr1 < grenze; nr1++) {
            int sumteiler1 = 0;
            int merker = nr1;
            
            if ((nr1%1000)==0) {
                System.out.print(".");
                            }
            if ((nr1%10000)==0){
                System.out.println(nr1);
            }
          //  System.out.println("Startzahl: " + nr1);
            for (int i = 1; i <= nr1/2; i++) {
                if ((nr1 % i) == 0) {
                //    System.out.println("Sumteiler1 " + sumteiler1 + " erhöht um " + i);
                    sumteiler1 += i;
                   
                }
                schritte++;
            }
            int sumteiler2 = 0;
            if (sumteiler1 != nr1) {
           //     System.out.println(sumteiler1 + " ist ungleich " + nr1);

                for (int j = 1; j <= sumteiler1/2; j++) {

                    if ((sumteiler1 % j) == 0) {
                        sumteiler2 += j;
                        
                    }
                    schritte++;
                            
                }
            }
            
          //  System.out.println("Ich teste nun " + sumteiler2 + " und " + merker);

            if (sumteiler2 == merker) {
                summe += nr1;
             //   System.out.println("Ich habe bei " + nr1 + " die Summe auf " + summe + " erhöht.");
               // System.out.println("Summe der Teiler: " + summe);

            }
            
        }
        System.out.println("Ich habe "+schritte+" Berechnungen durchführen müssen.");
        return summe;
    }
}