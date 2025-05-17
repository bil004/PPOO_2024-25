package Animal;

/* Verifichiamo che essere uguali e' diverso dall'avere lo stesso   
indirizzo. Usiamo la classe AnimalDemo e il file AnimalDemo.java */
public class AnimalDemo { // classe eseguibile pubblica
  public static void main(String[] args) {
    Animal tramot = new Animal("Tramot", 10, 5.0); // valori significativi
    Animal galileo = new Animal(); // valori di default

    System.out.println("1. Tramot");
    System.out.println(tramot);
    // sta per: System.out.println(tramot.toString());
    System.out.println("2. Galileo");
    System.out.println(galileo);
    /** All'inizio i due oggetti sono diversi */
    System.out.println("3. Tramot e' uguale a Galileo?" + tramot.equals(galileo));
    /**
     * Se assegno il primo al secondo attributo per attributo
     * diventano uguali attributo per attributo.
     */
    System.out.println("4. Assegno gli attributi di Tramot a Galileo ");
    galileo.assegna(tramot);
    System.out.println("5. Tramot e' uguale a Galileo?" + tramot.equals(galileo));
    // Vero: stessi attributi
    System.out.println("6. Tramot == Galileo? " + (tramot == galileo));
    // Falso: diversi indirizzi
  }
}