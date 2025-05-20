package Smart;

public class LavatriceSmart extends Lavatrice implements SmartControl {
    public LavatriceSmart(String modello, int potenza) {
        super(modello, potenza);
    }
    
    @Override
    public void connettiRete(String reteWiFi) {
        System.out.println("Lavatrice connessa alla rete " + reteWiFi);
    }

    @Override
    public void aggiornaFirmware() {
        System.out.println("Aggiornamento firmware della lavatrice in corso...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Aggiornamento completato!");
    }
}
