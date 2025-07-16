package Movie;

public class Movie {
    static int counter = 0;
    private int id;
    private String titolo;
    private int durata;

    public Movie(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
        counter++;
        id = counter;
    }

    public Movie() {
        counter++;
        id = counter;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void play() {
        System.out.println("Il film " + titolo + " è iniziato!");
    }

    public void pause() {
        System.out.println("Il film " + titolo + " è terminato!");
    }

    public static int getNumMovies() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                durata == movie.getDurata() &&
                (titolo.compareTo(movie.getTitolo()) == 0);
    }

    /*@Override
    
    // METODO ALTERNATIVO
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return id == movie.id &&
                durata == movie.getDurata() &&
                (Objects.equals(titolo, movie.getTitolo()));
    }

    // Opzionale
    @Override
    public int hashCode() {
        return Objects.hash(id, titolo, durata);
    }*/

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }
}
