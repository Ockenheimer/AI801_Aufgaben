package ai801_aufgaben;


public class AI801_Aufgaben {

    
    public static void main(String[] args) {

    Blatt6 b6 = new Blatt6();
    char[] array  = "schaefer".toCharArray();
    
        for (int i = 0; i < array.length; i++) {
            b6.hinzufuegen(array[i]);
            
        }
        
        System.out.println(b6.suchen('s', b6.root));
        System.out.println(b6.suchen('c', b6.root));
        System.out.println(b6.suchen('h', b6.root));
        System.out.println(b6.suchen('a', b6.root));
        System.out.println(b6.suchen('e', b6.root));
        System.out.println(b6.suchen('f', b6.root));
        System.out.println(b6.suchen('e', b6.root));
        System.out.println(b6.suchen('r', b6.root));
        
    }

}
