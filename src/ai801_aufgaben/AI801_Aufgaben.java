package ai801_aufgaben;


public class AI801_Aufgaben {

    
    public static void main(String[] args) {

    Blatt6 b6 = new Blatt6();
    char[] array  = "schaefer".toCharArray();
    
        for (int i = 0; i < array.length; i++) {
            b6.hinzufuegen(array[i]);
            
        }
        System.out.println(b6.root.toString());
        
    }

}
