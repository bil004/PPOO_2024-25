package Es2;

import java.util.Stack;

public class RPM_Calculator {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        StackExt res = new StackExt();

        System.out.println("Inserisco gli elementi all'interno dello Stack...");
        s.push("2+3");
        s.push("4*5");
        s.push("10-2");
        s.push("20/4");
        s.push("15%4");
        s.push("#");

        System.out.println("Risultato: " + res.esegui(s));
    }
}