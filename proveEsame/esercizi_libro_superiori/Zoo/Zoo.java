package Zoo;

import java.util.*;

public class Zoo {

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner in = new Scanner(System.in);

        String str;
        do {
            str = in.next();
            s.push(str);
        } while (!str.equals("zoo"));

        clearScreen();

        for (int i = s.size() - 1; i >= 0; i--) {
            System.err.println("[" + s.get(i) + "]");
        }
    }
}
