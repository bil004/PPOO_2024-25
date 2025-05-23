package Palindrome;

import java.util.Stack;

public class Check {

    public static boolean isPalindrome(Stack<Character> s) {
        if (s == null) return false;

        for (int i = 0, j = s.size() - 1; i < j; i++, j--) {
            if (!s.get(i).equals(s.get(j)))
                return false;
        }
        return true;
    }

    /* ALTERNATIVA: LAVORARE DIRETTAMENTE CON LA CLASSE OBJECT

    public static boolean isPalindrome(Stack<Character> s) {
        if (s == null)
            return false;
        Object[] a = s.toArray();

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (!a[i].equals(a[j]))
                return false;
        }

        return true;
    } */

    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<>(), s2 = new Stack<>();

        s1.push('c');
        s1.push('i');
        s1.push('a');
        s1.push('o');

        s2.push('a');
        s2.push('n');
        s2.push('n');
        s2.push('a');

        System.out.println("s2 e' palindroma? " + isPalindrome(s2));

        System.out.println("s1 e' palindroma? " + isPalindrome(s1));
    }
}