package ArrayExt;

import java.util.Arrays;

// Vettori.java
/* La classe Vettori utilizza la libreria Arrays per gestire array dinamici. Fornisce operazioni di aggiunta e rimozione di elementi mantenendo l'ordine degli elementi. */

public class Vettori {

    private int size;
    private int[] vett;

    // Invariante: (0 <= size <= lunghezza vett) e (lunghezza vett > 0)

    public int getSize() {
        return size;
    }

    public Vettori(int min) {
        assert min > 0 : "min non positivo = " + min;
        size = 0;
        vett = new int[min];
        assert 0 <= size && size <= vett.length;
    }

    public String toString() {
        return "size = " + size + " " + Arrays.toString(Arrays.copyOf(vett, size));
    }

    public int get(int i) {
        assert 0 <= i && i < size : "get su indice non in 0,...,size-1 " + i;
        return vett[i];
    }

    public void set(int i, int x) {
        assert 0 <= i && i < size : "set su indice non in 0,...,size-1 " + i;
        vett[i] = x;
    }

    private void extend() {
        vett = Arrays.copyOf(vett, vett.length * 2);
        assert 0 <= size && size <= vett.length;
    }

    public void add(int i, int x) {
        assert 0 <= i && i <= size : "add su indice non in 0,...,size " + i;
        if (size == vett.length) {
            this.extend();
        }
        assert size < vett.length;
        System.arraycopy(vett, i, vett, i + 1, size - i);
        vett[i] = x;
        ++size;
        assert 0 <= size && size <= vett.length;
    }

    public int remove(int i) {
        assert 0 <= i && i < size : "remove su indice non in 0,...,size-1 " + i;
        int x = vett[i];
        System.arraycopy(vett, i + 1, vett, i, size - i - 1);
        --size;
        assert 0 <= size && size <= vett.length;
        return x;
    }
}