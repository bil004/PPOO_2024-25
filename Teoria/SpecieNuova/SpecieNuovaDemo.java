package SpecieNuova;

import java.util.Scanner;


// Usiamo una classe SpecieNuovaDemo per sperimentare la classe Specie
public class SpecieNuovaDemo { // classe eseguibile pubblica

    private static void pause() {
        /**
         * Questo metodo ferma l’esecuzione del programma e aspetta un a capo per
         * continuare. E' statico, quindi non viene invocato su un oggetto, ma chiamato
         * scrivendo: SpecieNuovaDemo.pause();
         * In realtà, poiché in questo esempio viene invocato all’interno della classe
         * stessa, possiamo invocarlo direttamente così: pause();
         */
        Scanner tastiera = new Scanner(System.in);
        System.out.println("............. premi a capo per continuare");
        tastiera.nextLine();
        tastiera.close();
    }

    public static void main(String[] args) {
        SpecieNuova specieTerrestre = new SpecieNuova();// primo oggetto
        System.out.println("\n 1. Inserisco specieTerrestre usando un metodo di set");
        /**
         * Non possiamo assegnare nome, popolazione e tasso di crescita direttamente
         * perche' questi attributi sono privati
         */
        specieTerrestre.setSpecie("Bufalo Nero", 500, 3);

        System.out.println("\n 2. Dati inseriti specieTerrestre");
        System.out.println(specieTerrestre);
        // sta per: System.out.println(specieTerrestre.toString());
        pause();

        SpecieNuova specieKlingon = new SpecieNuova();// secondo oggetto
        System.out.println("\n 3. Inserisco specieKlingon usando un metodo di set");
        /**
         * Non possiamo assegnare nome, popolazione e tasso di crescita direttamente
         * perche' questi attributi sono privati:
         */
        specieKlingon.setSpecie("Bufalo Klingon", 1000, 10);

        System.out.println("\n 4. Dati inseriti specieKlingon");
        System.out.println(specieKlingon);
        pause();

        System.out.println("\n 5. Assegno specieterrestre = specieKlingon");
        specieTerrestre = specieKlingon;
        System.out.println("Ora le due variabili puntano allo stesso oggetto:");
        System.out.println(specieTerrestre);
        System.out.println(specieKlingon);

        System.out.println("\n 6. Per rendermi conto che le due variabili sono un alias dello stesso oggetto: ");
        System.out.println("se modifico la specie terrestre in Elefante modifico anche il  Klingon");
        specieTerrestre.setSpecie("Elefante", 100, 2);
        System.out.println(specieTerrestre);
        System.out.println(specieKlingon);
        pause();

        System.out.println("\n 7. Vediamo ora un altro modo di modificare gli oggetti");
        System.out.println("Creo \"specieAfricana\" e le assegno i valori Elefante");
        SpecieNuova specieAfricana = new SpecieNuova(); // terzo oggetto
        /** Copio i dati da specieTerrestre in specieAfricana */
        specieTerrestre.cambia(specieAfricana);
        System.out.println(specieAfricana);
        pause();

        System.out.println(
                "\n 8. La prima e la seconda variabile puntano allo stesso oggetto: (specieTerrestre == specieKlingon) vale : "
                        + (specieTerrestre == specieKlingon));
        /** Vero, sono lo stesso indirizzo */

        System.out.println("\n 9. Invece la prima e la terza variabile no: (specieTerrestre == specieAfricana) vale : "
                + (specieTerrestre == specieAfricana));
        /** Falso, hanno gli stessi valori ma non lo stesso indirizzo */

        System.out.println(
                "\n 10. Pero' gli attributi degli oggetti puntati dalle due variabili hanno gli stessi valori: (specieTerrestre.equals(specieAfricana)) vale : "
                        + (specieTerrestre.equals(specieAfricana)));
        /** Vero, hanno gli stessi valori ma indirizzo diverso */
        pause();

        System.out.println("\n 11. Una controprova: modifico la specieAfricana in Elefante Africano.");
        specieAfricana.setSpecie("Elefante Africano", 100, 2);
        System.out.println(specieAfricana);

        System.out.println(
                "\n 12. NON ho modificato l’oggetto puntato da specieTerrestre e specieKlingon perche' ha un diverso indirizzo: ");
        System.out.println(specieKlingon);
    }
}
