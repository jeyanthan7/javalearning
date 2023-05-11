package collectionss;

import java.util.Hashtable;

public class HashtableCheck {
    public static void main(String[] args) {

        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        h.put(1, "Muthu");
        h.put(2, "serma");
        h.put(3, "bala");
        h.put(4, "appa");
        System.out.println(h.size());
        System.out.println(h);
        h.remove(1);
        System.out.println(h.size());
        System.out.println(h);
    }
}
