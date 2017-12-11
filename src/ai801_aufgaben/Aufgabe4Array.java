/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai801_aufgaben;

/**
 *
 * @author famz
 */
public class Aufgabe4Array {

    
    
            
        public long summe(int max) {
        long summe = 0;
        //integer-Array mit "max"-vielen Plätzen
        int[] teilsumme = new int[max];

        //fülle das Array mit den Summen der echten Teiler
        for (int i = 0; i < max; i++) {
          /*  if (((i + 1) % 1000) == 0) {
                System.out.print(".");
            }
            if (((i + 1) % 10000) == 0) {
                System.out.println((i + 1));
            }*/
            //Berrechne die Summen der echten Teiler und fülle Sie Fach für Fach ein  
            teilsumme[i] = Teiler((i + 1));

        }
        //Prüfe ob befreundete Nummern dabei sind
        summe = sumAmmicable(teilsumme);
        //Wirf die Summe der Amicable Numbers zurück an run
        return summe;
    }

    public int Teiler(int i) {
        int merker = 0;

        for (int j = 1; j <= (i / 2); j++) {
            if (i % j == 0) {

                merker += j;

            }

        }

        return merker;
    }

    public long sumAmmicable(int[] test) {
        long summe = 0;
        for (int i = 0; i < test.length; i++) {
            if (test[i] != 0 && test[i] != i) {
                if (test[i] < test.length) {
                    if (i == (test[test[i] - 1] - 1) && (test[i] - 1) != i) {
                        summe = summe + i + 1;
                    //    System.out.println("Hinzugefügt wurde: " + i + 1);

                    }

                } else {
                    int merker = Teiler(test[i]);
                    if (i == Teiler(merker) - 1) {
                        summe = summe + i + 1;
                      //  System.out.println("Hinzugefügt wurde ELSE: " + i + 1);
                    }
                }
            }
        }
        return summe;
    }
}
