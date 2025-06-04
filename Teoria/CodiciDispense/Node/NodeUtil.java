package Node;

public class NodeUtil {
    public static int length(Node n) {
        int l = 0;
        while(n != null) {
            n = n.getNext();
            l++;
        }
        return l;
    }

    public static int length_rec(Node n) {
        if (n == null) return 0;
        return 1 + length_rec(n.getNext());
    }

    public static int sum(Node n) {
        int sum = 0;
        
        while (n != null) {
            sum += n.getElem();
            n = n.getNext();
        }

        return sum;
    }

    public static int sum_rec(Node n) {
        if (n == null) return 0;
        return n.getElem() + sum_rec(n.getNext());
    }

    public static int max(Node n) {
        int max = Integer.MIN_VALUE;
        
        while (n != null) {
            max = Math.max(max, n.getElem());
            n = n.getNext();
        }

        return max;
    }

    public static int max_rec(Node n) {
        if (n == null) return Integer.MIN_VALUE;
        return Math.max(n.getElem(), max_rec(n.getNext()));
    }

    public static boolean member(Node n, int v) {
        while (n != null) {
            if (n.getElem() == v)
                return true;
            n = n.getNext();
        }
        return false;
    } 

    public static boolean member_rec(Node n, int v) {
        if (n == null) return false;
        if (n.getElem() == v) return true;
        return member_rec(n.getNext(), v);
    }

    public static String toString(Node n) {
        String s = "[";

        while(n != null) {
            if (n.getNext() == null)
                s += n.getElem() + "]->";
            else
                s += n.getElem() + "]->[";

            n = n.getNext();
        }

        return s;
    }

    public static boolean sorted(Node n) {
        if (n == null) return true;

        Node next = n.getNext();
        while(next != null) {
            
            if (n.getElem() > next.getElem())
                return false;

            n = next;
            next = next.getNext();
        }

        return true;
    }

    public static boolean equals(Node n1, Node n2) {
        if (n1 == null || n2 == null) return false;
        if (NodeUtil.length(n1) != NodeUtil.length(n2)) return false;

        while (n1 != null) {
            if (n1.getElem() != n2.getElem()) 
                return false;

            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        
        return true;
    }

    public static void scriviOutput(Node n) {
        while (n != null) {
            System.out.println(n.getElem());
            n = n.getNext();
        }
    }
}
