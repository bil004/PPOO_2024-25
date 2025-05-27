package Liste;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();
        l.add(5);
        l.add("Hello");
        l.add('f');
        l.add(2.5);

        System.out.println(l.toString());
    }
}
