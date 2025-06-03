package Movie;

public class MovieTest {
    public static void main(String[] args) {
        // Create Movie instances
        Movie movie1 = new Movie("Inception", 148);
        Movie movie2 = new Movie();
        movie2.setTitolo("Interstellar");
        movie2.play();
        movie2.pause();

        // Create Documentary instances
        Documentary doc1 = new Documentary("Planet Earth", 90);
        doc1.play();
        doc1.pause();

        Documentary doc2 = new Documentary("The Last Dance", 120);
        doc2.play();
        doc2.pause();

        // Test equals and toString
        System.out.println(movie1.toString());
        System.out.println(doc1.toString());
        System.out.println("movie1 equals movie2? " + movie1.equals(movie2));

        // Print number of movies created
        System.out.println("Number of movies created: " + Movie.getNumMovies());
    }
}
