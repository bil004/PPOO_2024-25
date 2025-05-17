import java.util.Scanner;

public class Tabelline {
    static int a[][] = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
        {3, 6, 9, 12, 15, 18, 21, 24, 27, 30},
        {4, 8, 12, 16, 20, 24, 28, 32, 36, 40},
        {5, 10, 15, 20, 25, 30, 35, 40, 45, 50},
        {6, 12, 18, 24, 30, 36, 42, 48, 54, 60},
        {7, 14, 21, 28, 35, 42, 49, 56, 63, 70},
        {8, 16, 24, 32, 40, 48, 56, 64, 72, 80},
        {9, 18, 27, 36, 45, 54, 63, 72, 81, 90},
        {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
    };

    static int research(int i, int j) {
        return a[i][j];
    }

    static void stampa() {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[");
            for(int j = 0; j < a[i].length; j++) {
                if (j == a[i].length - 1)
                    System.out.print(a[i][j]);
                else
                    System.out.print(a[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleziona:\n1) Stampa a video la tabella\n2)Esegui una moltiplicazione");
        switch(in.nextInt()) {
            case 1:
                stampa();
                break;
            
            case 2:
                int n1, n2;

                System.out.print("Inserisci i 2 numeri positivi: ");
                do {
                    n1 = in.nextInt();
                    n2 = in.nextInt();
        
                    if (!((n1 >= 0 || n1 <= 10) && (n2 >= 0 || n2 <= 10)))
                        System.out.print("Errore, re-inserire: ");
                } while((n1 < 0 && n1 > 10) && (n2 < 0 && n2 > 10));
        
                if (n1 == 0 || n2 == 0) 
                    System.out.println(n1 + " * " + n2 + " = " + 0);
                else
                    System.out.println(n1 + " * " + n2 + " = " + research(n1-1, n2-1));
        
                in.close();
        }
    }
}
