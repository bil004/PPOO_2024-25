package Es4;

public class RPMDemo {
    public static void main(String[] args) {
        RPM_Calculator C = new RPM_Calculator();

        System.out.println("Eseguo istruzioni 23+ (due piu' tre) ");
        System.out.println(C.esegui("23+") + "\n");

        System.out.println("Eseguo istruzioni 23* (due  per tre) ");
        System.out.println(C.esegui("23*") + "\n");

        System.out.println("Eseguo istruzioni 23*9+ (due  per tre piu' nove) ");
        System.out.println(C.esegui("23*9+") + "\n");

        System.out.println("Eseguo istruzioni 99*9* (nove per nove per nove) ");
        System.out.println(C.esegui("99*9*") + "\n");

        System.out.println("Eseguo istruzioni 99*9*1+ (nove per nove per nove piu' uno) ");
        System.out.println(C.esegui("99*9*1+") + "\n");

        System.out.println("Eseguo istruzioni 96+97++98+* ((15+16)*17) ");
        System.out.println(C.esegui("96+97++98+*") + "\n");
        System.out.println("Eseguo istruzioni 12345678991+********* (fattoriale di 10) ");
        System.out.println(C.esegui("12345678991+*********") + "\n");

        System.out.println("Eseguo istruzioni 12- ");
        System.out.println(C.esegui("12-") + "\n");
        System.out.println("Eseguo istruzioni 32/ ");
        System.out.println(C.esegui("32/") + "\n");
        System.out.println("Eseguo istruzioni 53% ");
        System.out.println(C.esegui("53%") + "\n");

        System.out.println("Eseguo istruzioni 72*#9*1+ , stampando la pila dopo 72*");
        System.out.println(C.esegui("72*#9*1+") + "\n");

        System.out.println("Eseguo istruzioni 72*9#*1+ , stampando la pila dopo 72*9");
        System.out.println(C.esegui("72*9#*1+") + "\n");

        System.out.println("Eseguo istruzioni 72*9*1#+ , stampando la pila dopo 72*9*1");
        System.out.println(C.esegui("72*9*1#+") + "\n");

    }
}
