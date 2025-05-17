package Es2;

import java.util.Stack;

public class StackExt {
    public int esegui(Stack<String> s) {
        int result = 0;

        while (!s.isEmpty()) {
            String e = s.pop().trim(); // Rimuove l'elemento dallo stack e rimuove spazi

            if (e.contains("+")) {
                String[] parts = e.split("\\+");
                result += Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
            } else if (e.contains("-")) {
                String[] parts = e.split("-");
                result += Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
            } else if (e.contains("*")) {
                String[] parts = e.split("\\*");
                result += Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
            } else if (e.contains("/")) {
                String[] parts = e.split("/");
                result += Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
            } else if (e.contains("%")) {
                String[] parts = e.split("%");
                result += Integer.parseInt(parts[0]) % Integer.parseInt(parts[1]);
            } else if (e.equals("#")) {
                System.out.println("Stack size: " + s.size());
            } else {
                result += Integer.parseInt(e); // Caso base: aggiunge il numero
            }
            
        }

        return result;
    }
}
