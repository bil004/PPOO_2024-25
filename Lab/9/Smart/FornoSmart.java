package Smart;

public class FornoSmart extends Forno implements SmartControl {
    
    public FornoSmart(String modello, int potenza) {
        super(modello, potenza);
    }
    
    @Override
    public void connettiRete(String reteWiFi) {
        System.out.println("Forno connesso alla rete " + reteWiFi);
    }

    @Override
    public void aggiornaFirmware() {
        System.out.println("Aggiornamento firmware del forno in corso...");
        try {
            Thread.sleep(5000); // attendi 5 secondi
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Aggiornamento completato!");
    }
}
