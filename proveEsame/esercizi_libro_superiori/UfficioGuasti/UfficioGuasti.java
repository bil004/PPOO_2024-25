package UfficioGuasti;

public class UfficioGuasti {
    public static void main(String[] args) {
        StackE<Richieste> s = new StackE<>();

        s.push(new Richieste("Cambio Display", "11/05/2025"));
        s.push(new Richieste("Cambio Pasta Termica", "09/05/2025"));
        s.push(new Richieste("Installazione RAM aggiuntiva", "05/05/2025"));
        s.push(new Richieste("Controllo dei connettori difettosi", "25/04/2025"));
        s.push(new Richieste("Ripristino del PC", "14/03/2025"));
        s.push(new Richieste("Riciclaggio Componenti", "4/01/2025"));

        s = s.order(s);

        System.out.println("Richieste ordinate per data:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}