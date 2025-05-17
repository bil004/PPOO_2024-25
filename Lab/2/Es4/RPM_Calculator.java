package Es4;

class RPM_Calculator {
    /** stack = pila che contiene fino a 100 interi */
    private int[] stack = new int[100];

    /** size = numero interi introdotti: all'inizio 0 */
    /** le posizioni occupate hanno indice: 0, 1, ..., size-1 */
    private int size = 0;

    /**
     * push(x): aggiunge un intero x a stack dopo la parte utilizzata
     * e aumenta la parte di stack utilizzata di uno.
     */
    private void push(int x) {
        stack[size] = x;
        size++;
    }

    /**
     * pop(): restituisce l'ultima intero utilizzato di stack
     * e lo "cancella", riducendo la parte di stack utilizzata di uno.
     */
    private int pop() {
        size--;
        return stack[size];
    }

    public int esegui(String istruzioni) {
        int numeroIstruzioni = istruzioni.length(); // lunghezza
        int pc = 0;
        /** inizio leggendo l'istruzione 0 */
        while (pc < numeroIstruzioni) { // eseguo le istruzioni in ordine
            char c = istruzioni.charAt(pc); // c = carattere di posto pc
            if (c >= '0' && c <= '9') // vero se c e' una cifra
                push(c - '0'); // questa formula mi da' il valore della cifra c
            else if (c == '+') {
                int ultimo = pop(); // risultato ultimo calcolo
                int penultimo = pop(); // risultato penultimo calcolo
                push(penultimo + ultimo);
            } else if (c == '*') {
                int ultimo = pop(); // risultato ultimo calcolo
                int penultimo = pop(); // risultato penultimo calcolo
                push(penultimo * ultimo);
            } else if (c == '-') {
                int ultimo = pop(); // risultato ultimo calcolo
                int penultimo = pop(); // risultato penultimo calcolo
                push(penultimo - ultimo);
            } else if (c == '/') {
                int ultimo = pop(); // risultato ultimo calcolo
                int penultimo = pop(); // risultato penultimo calcolo
                push(penultimo / ultimo);
            } else if (c == '%') {
                int ultimo = pop(); // risultato ultimo calcolo
                int penultimo = pop(); // risultato penultimo calcolo
                push(penultimo % ultimo);
            } else if (c == '#') {
                System.out.println("dimensione pila " + size);
                for (int i = 0; i < size; i++)
                    System.out.println("posizione " + i + " l'elemento " + stack[i]);
            }
            pc++; // eseguita c passo alla prossima istruzione
        }
        return pop();
        // alla fine delle istruzioni restituisco l'ultimo risultato
        // ottenuto
    }
}