package Vacanze;

public class Vacanza {
    private String luogo;
    private Data dataPartenza;
    private Data dataRientro;
    private Set<String> mezzi;

    public Vacanza(String luogo, Data dataPartenza, Data dataRientro) {
        setLuogo(luogo);
        setDataPartenza(dataPartenza);
        setDataRientro(dataRientro);
        this.mezzi = new Set<>();
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public Data getDataPartenza() {
        return dataPartenza;
    }

    public void setDataPartenza(Data dataPartenza) {
        this.dataPartenza = dataPartenza;
    }

    public Data getDataRientro() {
        return dataRientro;
    }

    public void setDataRientro(Data dataRientro) {
        this.dataRientro = dataRientro;
    }

    public Set<String> getMezzi() {
        return mezzi;
    }

    public int durata() {
        int dur = dataPartenza.differenza(dataRientro);
        assert dur >= 1 : "Errore nell'inserimento dei dati!";
        return dur;
    }

    public void aggiungiMezzo(String mezzo) {
        mezzi.add(mezzo);
    }

    public void rimuoviMezzo(String mezzo) {
        if (mezzi.remove(mezzo))
            System.out.println("Mezzo " + mezzo + " rimosso correttamente!");
        else
            System.out.println("Non e' stato possibile rimuovere il mezzo " + mezzo);
    }

    public String toString() {
        return "Luogo: " + luogo + "\nData di partenza: " + dataPartenza.getGiorno() + ", " + dataPartenza.getAnno()
                + "\nData di rientro: " + dataRientro.getGiorno() + ", " + dataRientro.getAnno();

    }
}
