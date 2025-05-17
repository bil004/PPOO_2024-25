# Il modificatore `protected` in Java

`protected` è un modificatore di accesso in Java che si usa per controllare la visibilità di variabili, metodi e costruttori.

---

## Significato di `protected`

Un membro (variabile o metodo) dichiarato `protected` **può essere usato**:
1. **All’interno della stessa classe**
2. **All’interno di tutte le sottoclassi** (anche se si trovano in package diversi)
3. **All’interno dello stesso package** (come se fosse `package-private`)

---

## Esempio semplice

```java
class Animale {
    protected String nome;

    protected void verso() {
        System.out.println("Verso generico");
    }
}

class Cane extends Animale {
    public void abbaia() {
        System.out.println(nome + " dice: Bau!");
        verso(); // posso chiamare il metodo protected della superclasse
    }
}

public class Test {
    public static void main(String[] args) {
        Cane c = new Cane();
        c.nome = "Fido"; // posso accedere perché sono nello stesso package
        c.abbaia();
    }
}
```

---

## Riassumendo

- `protected` è **più restrittivo di `public`** ma **meno di `private`**.
- Serve per **condividere** membri tra una classe e le sue sottoclassi, ma **non** con tutto il mondo.
- È molto usato per permettere l’**ereditarietà** e la **personalizzazione** dei comportamenti nelle sottoclassi.

---

## Differenza tra i modificatori di accesso

### `public`
- **Visibile ovunque**: dentro la classe, nelle sottoclassi, in altri package, da chiunque.

### `private`
- **Visibile solo nella classe stessa**: nemmeno le sottoclassi possono accedere.

### `protected`
- **Via di mezzo**:
  - Visibile nella classe stessa
  - Visibile nelle sottoclassi (anche se sono in un altro package)
  - Visibile alle altre classi dello stesso package

---

## Quando usare `protected`?

- Quando vuoi che un membro sia accessibile **solo alle sottoclassi** (per permettere l’estensione e la personalizzazione), ma **non** a tutto il mondo come con `public`.
- Quando vuoi che le classi dello stesso package possano accedere (come `package-private`), ma anche le sottoclassi fuori dal package.

---

## Esempio pratico

```java
class Base {
    protected int valoreProtetto = 42;
}

class Derivata extends Base {
    void stampa() {
        System.out.println(valoreProtetto); // OK: è protected
    }
}

class Altra {
    void test() {
        Base b = new Base();
        // System.out.println(b.valoreProtetto); // ERRORE: non è visibile qui
    }
}
```

---

## In sintesi

- **Usa `private`** se vuoi nascondere tutto a tutti (anche alle sottoclassi).
- **Usa `public`** se vuoi che tutti possano accedere.
- **Usa `protected`** se vuoi che **solo le sottoclassi** (e le classi dello stesso package) possano accedere.

È molto utile quando progetti classi da estendere, ma vuoi comunque mantenere un certo livello di incapsulamento!