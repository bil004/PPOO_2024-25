package Smart;

public class Casa {
    public static void main(String[] args) {
        FornoSmart oven = new FornoSmart("Forno2000", 1);
        LavatriceSmart washer = new LavatriceSmart("Candy6902", 10);
        Frigorifero freezer = new Frigorifero("Samsung1234", 5);

        System.out.println("Oven: " + oven.toString());
        System.out.println("Freezer: " + freezer.toString());
        System.out.println("Washer: " + washer.toString());

        System.out.println("\nFunzione di oven: " + oven.funzionePrincipale());
        System.out.println("Funzione del freezer: " + freezer.funzionePrincipale());
        System.out.println("Funzione della washer: " + washer.funzionePrincipale());

        System.out.print("\nOven: ");
        oven.accendi();
        System.out.print("Freezer: ");
        freezer.accendi();
        System.out.print("Washer: ");
        washer.accendi();

        System.out.print("\nOven: ");
        oven.accendi("ventilato");
        System.out.print("Freezer: ");
        freezer.accendi("eco");
        System.out.print("Washer: ");
        washer.accendi("colorati");

        System.out.println("\nConnessione alla rete per Oven:");
        oven.connettiRete("Deez Nuts!");
        System.out.println("Aggiornamento del firmware per Oven:");
        oven.aggiornaFirmware();

        System.out.println("\nConnessione alla rete per Washer:");
        washer.connettiRete("JoeBiden98");
        System.out.println("Aggiornamento del firmware per Washer:");
        washer.aggiornaFirmware();
    }
}