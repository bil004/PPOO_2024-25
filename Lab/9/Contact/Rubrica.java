package Contact;

import java.util.Arrays;

public class Rubrica {
    private int numContatti; 
    private Contatto[] contatti;

    public Rubrica(int maxContatti) {
        assert (maxContatti >= 0) : "errore maxContatti negativo: " + maxContatti;
        contatti = new Contatto[maxContatti];
        numContatti = 0;
    }

    public int getNumContatti() {
        return numContatti;
    }

    @Override
    public String toString() { // conversione Rubrica-->Stringa
        StringBuilder s = new StringBuilder();
        s.append("Num. contatti = ").append(numContatti).append("\n");
        for (int i = 0; i < numContatti; i++) {
            s.append("  ").append(contatti[i].toString()).append("\n");
        }
        return s.toString();
    }

    private int cercaIndice(String n) {
        for (int i = 0; i < numContatti; i++) {
            if (contatti[i].getNome().equalsIgnoreCase(n))
                return i;
        }
        return numContatti;
    }

    public boolean presente(String n) {
        return (cercaIndice(n) < numContatti);
    }

    public String cercaEmail(String n) {
        int i = cercaIndice(n);
        if (i < numContatti)
            return contatti[i].getEmail();
        else
            return "";
    }

    public boolean piena() {
        return (numContatti == contatti.length);
    }

    public void raddoppia() {
        Contatto[] doppiaContatti = new Contatto[2 * contatti.length];
        for (int i = 0; i < contatti.length; i++)
            doppiaContatti[i] = contatti[i];
        contatti = doppiaContatti;
    }

    public boolean aggiungi(String n, String e) {
        if (presente(n))
            return false;
        else {
            if (piena())
                raddoppia();
            contatti[numContatti] = new Contatto(n, e);
            ++numContatti;
            return true;
        }
    }

    public boolean rimuovi(String n) {
        int ind = cercaIndice(n);
        if (ind == numContatti)
            return false;
        else {
            for (int i = ind; i < numContatti - 1; i++)
                contatti[i] = contatti[i + 1];
            --numContatti;
            return true; // successo
        }
    }

    public boolean cambiaNome(String n, String n2) {
        if (!presente(n) || presente(n2))
            return false;
        else {
            String cambEmail = contatti[cercaIndice(n)].getEmail();
            rimuovi(n);
            aggiungi(n2, cambEmail);
            return true;
        }
    }

    public boolean cambiaEmail(String n, String e2) {
        int i = cercaIndice(n);
        if (i == numContatti)
            return false;
        contatti[i].setEmail(e2);
        return true;
    }

    public void sort() {
        Arrays.sort(contatti, 0, numContatti);
    }
}