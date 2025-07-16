package Pila;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Hello");
        s.push("World");
        s.push("Antonio");
        s.push("Cubeddu");
        s.push("Marco");
        s.push("Ballarin");

        System.out.println("Stack:\n" + s.toString());
        System.out.println("\nSize: " + s.size());

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("Peek: " + s.peek());
        System.out.println("Max: " + s.max());
        System.out.println("Contains \"Antonio\"? " + s.contains("Antonio"));
        System.out.println("Contains \"Bilal\"? " + s.contains("Bilal"));
        System.out.println("s is empty? " + s.isEmpty());

        System.out.println("\n---------------------------------------------------------------\n");

        while (s.size() != 0) {
            System.out.println("pop(): " + s.pop());
        }

        System.out.println("\nStack: " + s.toString());
        System.out.println("Size: " + s.size());
    }
}
