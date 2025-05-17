package Vacanze;

public class Data {
    private int giorno, anno;

    public Data(int giorno, int anno) {
        assert((giorno >= 1 && giorno <= 365) && anno >= 1841);
        this.giorno = giorno;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public int getGiorno() {
        return giorno;
    }

    public int differenza(Data d) {
        assert d.getGiorno() >= 1 && d.getGiorno() <= 365 : "giorno inesistente";
        return (d.getAnno() * 365 + d.getGiorno()) - (this.getAnno() * 365 + this.getGiorno());
    }

    public String toString() {
        return "Giorno: " + giorno + "\tAnno: " + anno;
    }
}