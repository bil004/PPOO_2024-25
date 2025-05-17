package Elettrodomestici;

public class Forno extends Elettrodomestico {
    public Forno(String modello, int potenza) {
        super(modello, potenza);
    }

    public String funzionePrincipale() {
        return "Cottura degli alimenti";
    }
}
