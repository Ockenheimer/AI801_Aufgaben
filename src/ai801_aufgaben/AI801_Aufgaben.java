package ai801_aufgaben;

public class AI801_Aufgaben {
    
    public static void main(String[] args) {
        
        Aufgabe2 a2 = new Aufgabe2();
        System.out.println(a2.getSumme(1000));
        Aufgabe3 a3 = new Aufgabe3();
        System.out.println(a3.getSumme(4000000));
        Aufgabe4 a4 = new Aufgabe4();
        System.out.println(a4.getSumme(10000));
        Aufgabe4Array array1 = new Aufgabe4Array();
        System.out.println(array1.summe(10000));
    }
    
}
