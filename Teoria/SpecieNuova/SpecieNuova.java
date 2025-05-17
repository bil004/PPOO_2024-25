package SpecieNuova;

import java.util.Scanner;

class SpecieNuova {
    /** Classe non pubblica */
    /**
     * Rendendo privati gli attributi di Specie, un metodo esterno alla classe non
     * puo' piu' modificare direttamente gli attributi:
     * nome, popolazione, tassoCrescita
     */
    private String nome;
    private int popolazione;
    private double tassoCrescita;

    /**
     * Per modificare gli attributi della classe ora e' necessario un
     * metodo "set": cosi' posso inserire un test per controllare che la
     * modifica sia sensata.
     */
    public void setSpecie(String n, int p, double t) {
        nome = n;
        if (p < 0)
            System.out.println("Valori negativi popolazione non accettati");
        else
            popolazione = p;
        tassoCrescita = t;
    }

    /**
     * Per ottenere gli attributi della classe ora e' necessario un metodo "get". Se
     * un dato e' riservato, basta togliere il suo metodo “get” e l’attributo non e'
     * piu' accessibile dall’esterno della classe.
     */
    public String getNome() {
        return nome;
    }

    public int getPopolazione() {
        return popolazione;
    }

    public double getTassoCrescita() {
        return tassoCrescita;
    }

    private static Scanner tastiera = new Scanner(System.in);

    public void leggiInput() {
        System.out.println(" nome = ");
        nome = tastiera.nextLine();

        System.out.println(" popolazione = ");
        popolazione = tastiera.nextInt();
        tastiera.nextLine();

        System.out.println(" tasso di crescita = ");
        tassoCrescita = tastiera.nextDouble();
        tastiera.nextLine();
    }

    /** Metodo di conversione specie --> stringa */
    public String toString() {
        return " nome = " + nome + "\n popolazione = " + popolazione +
                "\n tasso crescita = " + tassoCrescita;
    }

    public int prediciPopolazione(int anni) {
        double p = popolazione;
        while (anni > 0) {
            p = p + p * tassoCrescita / 100;
            --anni;
        }
        return (int) p;
    }

    /**
     * Questo metodo dinamico assegna gli attributi di this agli attribuiti
     * dell’oggetto "altraSpecie" passato come argomento.
     */
    public void cambia(SpecieNuova altraSpecie) {
        altraSpecie.nome = this.nome;
        altraSpecie.popolazione = this.popolazione;
        altraSpecie.tassoCrescita = this.tassoCrescita;
    }

    /**
     * Dobbiamo aggiungere un metodo per confrontare due oggetti: usare direttamente
     * == tra gli oggetti non va sempre bene, perche' == confronta gli indirizzi dei
     * due oggetti, invece qui vogliamo confrontare i valori dei attributi
     */
    public boolean equals(SpecieNuova altraSpecie) {
        return (nome.equalsIgnoreCase(altraSpecie.nome))
                && (popolazione == altraSpecie.popolazione)
                && (tassoCrescita == altraSpecie.tassoCrescita);
    }
}