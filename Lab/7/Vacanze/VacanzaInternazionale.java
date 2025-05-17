package Vacanze;

public class VacanzaInternazionale extends Vacanza {
    private String paese;

    public VacanzaInternazionale(String luogo, Data dataPartenza, Data dataRientro, String paese) {
        super(luogo, dataPartenza, dataRientro);
        this.paese = paese;
    }
    
    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public String toString() {
        return "Luogo: " + getLuogo() + "\nData di partenza: " + getDataPartenza().getGiorno() + ", " + getDataPartenza().getAnno()
                + "\nData di rientro: " + getDataRientro().getGiorno() + ", " + getDataRientro().getAnno() + "\nPaese: " + paese;
    }
}
