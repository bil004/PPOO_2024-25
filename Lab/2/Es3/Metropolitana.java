package Es3;

public class Metropolitana {
    private String mat;
    private int line, station;

    public Metropolitana(String mat, int line, int station) {
        setLine(line);
        setMat(mat);
        setStation(station);
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        assert(line >= 0 && line <= 9);
        this.line = line;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        assert(mat != null);
        this.mat = mat;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public void aggiornaProssimaStazione() {
        if (station < 9) 
            station++;
        else
            station = 0;
    }

}
