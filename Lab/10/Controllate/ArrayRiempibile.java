package Controllate;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArrayRiempibile {
    private int[] elementi;
    private boolean[] occupazione;

    public ArrayRiempibile(int l) {
        if (l <= 0)
            throw new IllegalArgumentException("errore, lunghezza non positiva : " + l);

        elementi = new int[l];
        occupazione = new boolean[l];
    }

    public String toString() {
        String s = "elementi:\n";
        for (int i = 0; i < elementi.length; i++)
            s = s + " " + elementi[i];
        s = s + "\nmodificato:\n";
        for (int i = 0; i < elementi.length; i++)
            s = s + " " + occupazione[i];
        return s;
    }

    public void inserire(int i, int v) {
        if (i < 0 || i > elementi.length)
            throw new IllegalArgumentException("indice" + i + "fuori limite");

        if (occupazione[i])
            throw new IllegalStateException("indice " + i + "già occupato");

        elementi[i] = v;
        occupazione[i] = true;
    }

    public boolean controllarePieno() {
        int i = 0;
        boolean trovatoVuoto = false;
        while (i < elementi.length && !trovatoVuoto) {
            if (occupazione[i] == false)
                trovatoVuoto = true;
            i++;
        }
        return !trovatoVuoto;
    }

    public int calcolareSomma() {
        if (!this.controllarePieno())
            throw new IllegalStateException("calcolare la somma su un array vuoto non e` possibile");

        int somma = 0;
        for (int i = 0; i < elementi.length; i++)
            somma += elementi[i];
        return somma;
    }

    public void scrivereFile() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("Controllate/bin/Output.txt"));

            for (int i = 0; i < elementi.length; i++)
                out.println("Indice: " + i + " = " + elementi[i] + ", inserito " + occupazione[i]);

            System.out.println("Scrittura nel file riuscita correttamente!");
            out.close();
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage() + "\nErrore nell'apertura/creazione del file! (Controlla se hai creato bin/)");
        }
    }
}