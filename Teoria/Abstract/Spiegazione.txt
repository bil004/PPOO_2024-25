# A cosa serve `abstract` in Java

In Java, la parola chiave `abstract` viene utilizzata per dichiarare **classi astratte** e **metodi astratti**.  
È uno strumento fondamentale per definire comportamenti generici che devono essere implementati dalle classi derivate, favorendo il **polimorfismo** e la **progettazione orientata agli oggetti**.

---

## 1. Classe Astratta

Una **classe astratta** è una classe che non può essere istanziata direttamente. Serve come base per altre classi e può contenere:
- **Metodi astratti** (senza corpo, solo dichiarazione)
- **Metodi concreti** (con corpo, già implementati)
- **Campi** (variabili di istanza)

Le classi astratte vengono utilizzate quando vuoi fornire una struttura comune per un gruppo di classi, ma lasciare che le classi derivate implementino dettagli specifici.

---

## 2. Metodo Astratto

Un **metodo astratto** è un metodo dichiarato senza corpo (senza implementazione). Deve essere implementato da tutte le classi concrete che estendono la classe astratta.

**Sintassi:**
```java
abstract void nomeMetodo();
```

---

## Regole principali

1. Se una classe contiene almeno un metodo astratto, deve essere dichiarata come `abstract`.
2. Una classe astratta può avere sia metodi astratti che metodi concreti.
3. Le classi derivate devono implementare tutti i metodi astratti della classe astratta, a meno che anch'esse non siano dichiarate astratte.
4. Una classe astratta può avere costruttori, ma non può essere istanziata direttamente.

---

## Esempio completo

Supponiamo di voler modellare una gerarchia di veicoli, dove ogni veicolo ha un comportamento generico, ma i dettagli dipendono dal tipo specifico di veicolo.

```java
// Classe astratta
abstract class Veicolo {
    private String marca;

    public Veicolo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Metodo astratto (da implementare nelle sottoclassi)
    public abstract void muovi();

    // Metodo concreto (già implementato)
    public void descrizione() {
        System.out.println("Questo è un veicolo della marca: " + marca);
    }
}

// Classe concreta che estende la classe astratta
class Auto extends Veicolo {
    public Auto(String marca) {
        super(marca);
    }

    // Implementazione del metodo astratto
    @Override
    public void muovi() {
        System.out.println("L'auto si muove su strada.");
    }
}

// Un'altra classe concreta
class Barca extends Veicolo {
    public Barca(String marca) {
        super(marca);
    }

    // Implementazione del metodo astratto
    @Override
    public void muovi() {
        System.out.println("La barca si muove sull'acqua.");
    }
}

// Classe principale per testare
public class Main {
    public static void main(String[] args) {
        Veicolo auto = new Auto("Toyota");
        Veicolo barca = new Barca("Yamaha");

        auto.descrizione();
        auto.muovi();

        barca.descrizione();
        barca.muovi();
    }
}
```

---

### Output del programma

```
Questo è un veicolo della marca: Toyota
L'auto si muove su strada.
Questo è un veicolo della marca: Yamaha
La barca si muove sull'acqua.
```

---

## Vantaggi dell'uso di `abstract`

1. **Progettazione modulare**: Fornisce una struttura comune per le classi derivate.
2. **Polimorfismo**: Permette di trattare oggetti di classi diverse in modo uniforme (ad esempio, tramite il tipo `Veicolo`).
3. **Riutilizzo del codice**: I metodi concreti nella classe astratta possono essere riutilizzati dalle classi derivate.

---

**In sintesi:**  
`abstract` è uno strumento potente per definire comportamenti generici e lasciare che le classi derivate implementino i dettagli specifici.