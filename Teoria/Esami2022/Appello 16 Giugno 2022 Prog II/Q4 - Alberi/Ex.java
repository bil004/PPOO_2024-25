// Il codice è stato anche formattato in modo leggibile
// Se la traccia esce fuori schermo usa il word wrapping (option + z su macOS)

/*
 Completate il metodo int m(T x, T z) in <T> e Branch<T> in modo che conti, in un albero generico con elementi di tipo T, gli elementi elem tali che: (elem maggiore o uguale di x) e (elem diverso da z). 
Usate a.compareTo(b) sia per confrontare a,b in T, sia come test di eguaglianza tra a,b in T. Supponete che gli elementi dell'albero e x, z non siano null. Usate new Leaf<T> e new Branch<T>. Se dimenticate la precisazione <T>allora Moodle considera la definizione "unchecked or unsafe", in questo caso aggiungete <T>. Usate una definizione ricorsiva. Non modificate altro. Non usate "for" nè "while".
 */
import java.util.*;

//SALVATE TUTTO IN UN SOLO FILE Ex.java
abstract class Tree<T extends Comparable<T>> {
    public abstract int m(T x, T z);

    public abstract String toString();
}

class Leaf<T extends Comparable<T>> extends Tree<T> {
    public int m(T x, T z) {
        // qui!
    }

    public String toString() {
        return "{}";
    }
}

class Branch<T extends Comparable<T>> extends Tree<T> {
    private T elem;
    private Tree<T> left, right;

    public Branch(T elem, Tree<T> left, Tree<T> right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }

    public int m(T x, T z) {
        // qui!
    }

    public String toString() {
        return "{" + elem.toString()
                + "," + left.toString()
                + "," + right.toString() + "}";
    }
}

class Ex {

    // TEST DEFINITION
    public static Random r = new Random();

    public static T r() {
        int n = r.nextInt(5);
        if (n == 0)
            return new T("a");
        else if (n == 1)
            return new T("b");
        else if (n == 2)
            return new T("c");
        else if (n == 3)
            return new T("d");
        else // n=4
            return new T("e");
    }

    static T b = new T("b");
    static T d = new T("d");

    public static int c(T y) {
        if ((y.compareTo(b) >= 0) && (y.compareTo(d) != 0))
            return 1;
        else
            return 0;
    }

    public static void test() {
        T[] v = { r(), r(), r(), r(), r(), r(), r(), r(), r() };
        Tree<T> l = new Leaf<>();
        Tree<T> t1 = new Branch<>(v[1],
                l,
                new Branch<>(v[2],
                        new Branch<>(v[3], l, l),
                        new Branch<>(v[4], l, l)));
        Tree<T> t2 = new Branch<>(v[5],
                new Branch<>(v[6],
                        new Branch<>(v[7], l, l),
                        new Branch<>(v[8], l, l)),
                l);
        Tree<T> t = new Branch<>(v[0], t1, t2);

        check("t = " + t.toString() + "\n t.m(b,d)=",
                t.m(b, d),
                c(v[0]) + c(v[1]) + c(v[2]) + c(v[3]) + c(v[4]) +
                        c(v[5]) + c(v[6]) + c(v[7]) + c(v[8]));
    }

    // COMPARING WITH THE RIGHT ANSWER
    public static <T> void check(String s, T a, T b) {
        if (a.equals(b))
            System.out.println(s + a + "\n ===OK===");
        else
            System.out.println(s + a + "\n ***EXPECTED*** " + b);
    }

    static void msg() {
        System.out.println("Alberi nella forma leaf={}, branch = {elem,left,right}");
        System.out.println("m conta quante volte abbiamo: \n (elem maggiore o uguale di b) e (elem diverso da d)");
    }

    // TEST EXECUTION
    public static void main(String[] args) {
        msg();
        test();
        test();
        test();
        test();
        test();
        test();
        test();
        test();
        test();
    }

}

class T implements Comparable<T> {
    public String s;

    public T(String s) {
        this.s = s;
    }

    public int compareTo(T y) {
        return s.compareTo(y.s);
    }

    public String toString() {
        return s;
    }
}