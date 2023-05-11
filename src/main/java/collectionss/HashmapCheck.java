package collectionss;

import java.util.HashMap;

public class HashmapCheck {

    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(1, "muthu");
        h.put(2, "serma");
        h.put(3, "appa");
        h.put(4, "bala");
        h.put(5, "amma");
        h.put(6, "rubini");
        System.out.println("size is " + h.size());
        System.out.println(h);
        System.out.println(h.get(5));
        h.remove(1);
        System.out.println("size is " + h.size());
        System.out.println(h);
    }
}
