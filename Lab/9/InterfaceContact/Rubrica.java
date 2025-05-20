package InterfaceContact;

public class Rubrica {

    private int numContatti; // all'inizio vale 0
    private Contatto[] contatti; // all'inizio vale null

    public Rubrica(int maxContatti) {
        assert (maxContatti >= 0) : "errore maxContatti negativo: " + maxContatti;
        contatti = new Contatto[maxContatti];
        numContatti = 0;
    }

    public int getNumContatti() {
        return numContatti;
    }

    public String toString() { // conversione Rubrica-->Stringa
        int i = 0;
        String s = "Num. contatti = " + numContatti + "\n ";
        while (i < numContatti) {
            s = s + contatti[i].toString();
            ++i;
        }
        return s;
    }

    private int cercaIndice(String n) {
        return ricercaBinaria(n, 0, numContatti - 1);
    }

    private int ricercaBinaria(String n, int min, int max) {
        if (min > max)
            return numContatti;
        else {
            int mid = (min + max) / 2;
            if (contatti[mid].getNome().compareToIgnoreCase(n) < 0)
                return ricercaBinaria(n, mid + 1, max);
            else if (contatti[mid].getNome().compareToIgnoreCase(n) > 0)
                return ricercaBinaria(n, min, mid - 1);
            else
                return mid;
        }
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

    private int cercaProxIndice(String n) {
        return ricercaBinariaProx(n, 0, numContatti - 1);
    }

    private int ricercaBinariaProx(String n, int min, int max) {
        if (min > max)
            return min;
        else {
            int mid = (min + max) / 2;
            if (contatti[mid].getNome().compareToIgnoreCase(n) < 0)
                return ricercaBinariaProx(n, mid + 1, max);
            else if (contatti[mid].getNome().compareToIgnoreCase(n) > 0)
                return ricercaBinariaProx(n, min, mid - 1);
            else
                return mid;
        }
    }

    public boolean aggiungi(String n, String e) {
        if (presente(n))
            return false;
        else {
            if (piena())
                raddoppia();
            int ins = cercaProxIndice(n);
            for (int i = numContatti; i > ins; i--)
                contatti[i] = contatti[i - 1];
            contatti[ins] = new Contatto(n, e);
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
}