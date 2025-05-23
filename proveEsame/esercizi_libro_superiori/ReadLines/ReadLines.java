package ReadLines;

import java.util.Stack;

public class ReadLines {
    public static void main(String[] args) {
        Stack<String> records = new Stack<>(), result = new Stack<>();
        records.push("Ciao a tutti, il mio nome e' Francesco Cilurzo, in arte \"Cydonia\"!");
        records.push("Ciao a tutti, il mio nome e' Daniel Carafa, in arte \"Daniel Carafa\"!");
        records.push("Ciao a tutti, il mio nome e' Federico Dore, in arte \"Froz3n\"!");
        records.push("Ciao a tutti, il mio nome e' Poldo, in arte \"\"!");
        
        result.push(records.pop());
        result.push(records.pop());
        result.push(records.pop());
        result.push(records.pop());

        int j = result.size();
        for (int i = 0; i < j; i++) {
            System.out.println(result.pop());
        }
    }
}
