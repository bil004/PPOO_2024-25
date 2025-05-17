package Elettrodomestici;

public abstract class Elettrodomestico {
    private String modello;
    private int potenza;

    public Elettrodomestico(String modello, int potenza) {
        this.modello = modello;
        this.potenza = potenza;
    }

    public abstract String funzionePrincipale();

    public void accendi() {
        System.out.println(modello + " accensione standard");
    }

    public void accendi(String mode) {
        System.out.println(modello + " accensione in modalità " + mode);
    }

    public String toString() {
        return "Modello: " + modello + "\tPotenza: " + potenza + " KW";
    }
}
