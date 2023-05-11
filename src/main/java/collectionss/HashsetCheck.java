package collectionss;

import java.util.HashSet;

public class HashsetCheck {

    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println("size is " + h.size());
        System.out.println(h);
        h.remove(1);
        System.out.println("size is " + h.size());
        System.out.println(h);
    }
}
