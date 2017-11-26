package ai801_aufgaben;
import java.util.*;
public class AI801_Aufgaben {
    
    
    public static void main(String[] args) {
        
//        Aufgabe2 a2 = new Aufgabe2();
//        System.out.println(a2.getSumme(1000));
//        Aufgabe3 a3 = new Aufgabe3();
//        System.out.println(a3.getSumme(4000000));
//        Aufgabe4 a4 = new Aufgabe4();
//        System.out.println(a4.getSumme(10000));
//        Aufgabe4Array array1 = new Aufgabe4Array();
//        System.out.println(array1.summe(10000));
        Blatt2Aufgabe2 b2a2 = new Blatt2Aufgabe2();
        long timestart = System.nanoTime();
        long timemerk = System.nanoTime();
        System.out.println(b2a2.getAckermann(0, 0));
        long timemark = System.nanoTime();
        System.out.println("Die erste Aufgabe dauerte "+(timemark-timestart)+" ns");
        timestart = System.nanoTime();
        System.out.println(b2a2.getAckermann(1, 4));
        timemark = System.nanoTime();
        System.out.println("Die zweite Aufgabe dauerte "+(timemark-timestart)+" ns");
        timestart = System.nanoTime();
        System.out.println(b2a2.getAckermann(2, 4));
        timemark = System.nanoTime();
        System.out.println("Die dritte Aufgabe dauerte "+(timemark-timestart)+" ns");
        timestart = System.nanoTime();
        System.out.println(b2a2.getAckermann(5, 5));
        timemark = System.nanoTime();
        
        System.out.println("Die vierte Aufgabe dauerte "+(timemark-timestart)+" ns");
        
        long timestop = System.nanoTime();
        System.out.println("Alle Aufgaben dauerten "+(timestop-timemerk)+" ns");
        
    }
    
}
