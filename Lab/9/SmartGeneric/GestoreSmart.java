package SmartGeneric;

import java.util.ArrayList;
import java.util.Collection;

public class GestoreSmart<T extends Elettrodomestico & SmartControl> {
    private ArrayList<T> gestion = new ArrayList<>();

    public void aggiungiDispositivo(T dispositivo) {
        if (!(dispositivo instanceof Forno) || !(dispositivo instanceof Lavatrice) || !(dispositivo instanceof Frigorifero)) {
            gestion.add(dispositivo);
            System.out.println("Dispositivo aggiunto con successo!");
        } else
            System.out.println("Il dispositivo non ha funzioni smart!");
    }

    public void connettiTutti() {
        for (T t : gestion) {
            t.connettiRete("GianmarcoTouch123");
        }
    }

    public void aggiornaTutti() {
        for(T t : gestion) {
            t.aggiornaFirmware();
        }
    }

    public void stampaInfo() {
        for(T t: gestion) {
            System.out.println(t.toString() + ": " + t.funzionePrincipale());
        }
    }
}
