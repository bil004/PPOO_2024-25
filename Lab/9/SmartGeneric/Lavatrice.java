package SmartGeneric;

public class Lavatrice extends Elettrodomestico {
    public Lavatrice(String modello, int potenza) {
        super(modello, potenza);
    }
    
    public String funzionePrincipale () {
        return "Lavaggio dei vestiti";
    }
}