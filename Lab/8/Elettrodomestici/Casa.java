package Elettrodomestici;

public class Casa {
    public static void main(String[] args) {
        Elettrodomestico oven = new Forno("Forno2000", 1),
                freezer = new Frigorifero("Samsung1234", 5),
                washer = new Lavatrice("Candy6902", 10);

        /*
         * Variante:
         * Forno oven = new Forno("Forno2000", 1),
         * Frigorifero freezer = new Frigorifero("Samsung1234", 5);
         * Lavatrice washer = new Lavatrice("Candy6902", 10);
         */

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
    }
}