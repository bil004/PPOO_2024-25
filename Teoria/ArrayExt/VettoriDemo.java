package ArrayExt;

// VettoriDemo.java
public class VettoriDemo {
    public static void main(String[] args) {
        Vettori v = new Vettori(10); // capienza iniziale 10
        // Per controllare il metodo extend() aggiungo 12 elementi.
        String msg = "Aggiungo i valori x=0, 1, ..., 11 al vettore v" +
                "\n - sempre in prima posizione" +
                "\n - ognuno davanti ai valori precedenti" +
                "\n - ogni aggiunta sposta avanti di uno gli elementi precedenti";
        System.out.println(msg);
        int x = 0;
        while (x < 12) {
            v.add(0, x);
            ++x;
        }
        System.out.println(" v \n" + v);
        System.out.println("Rimuovo v[0]=11 e sposto indietro di uno gli altri elementi");
        System.out.println(" v.remove(0)=" + v.remove(0));
        System.out.println(" v \n" + v);
        System.out.println("Aggiungo x=-1 in posizione 11 (in fondo)");
        v.add(11, -1);
        System.out.println(" v \n" + v);
    }
}