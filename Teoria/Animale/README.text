Classe "Animale" che implementa la Security Leak, ovvero tutte quelle implementazioni che evitano le vulnerabilità che possono compromettere la sicurezza di un'applicazione
(es. SQL Injection, gestione impropria della memoria, variabili statiche che causano perdite di memoria)

# Security Leak in Java: spiegazione semplice e concreta

Una **security leak** (fuga di sicurezza) in Java si verifica quando una classe espone involontariamente i suoi dati interni, permettendo a chi usa la classe di modificarli direttamente, anche se i campi sono dichiarati `private`. Questo accade soprattutto quando i metodi getter restituiscono il riferimento originale di un oggetto interno, invece di una copia.

---

## Esempio pratico (vedi file allegati)

Supponiamo di avere queste classi:

- `Animale`: rappresenta un animale con nome, età e peso (tutti i campi sono privati).
- `CoppiaAnimali`: contiene due oggetti `Animale` (`primo` e `secondo`) come campi privati.
- `Hacker`: dimostra come si può modificare un oggetto privato dall’esterno.

### Esempio di security leak

Nel file `CoppiaAnimali.java`:

```java
public Animale getPrimo() {
    return primo;
}
```

Questo metodo restituisce il riferimento originale all’oggetto `primo`. Se qualcuno chiama questo metodo e poi modifica l’oggetto restituito, sta modificando direttamente il campo privato della classe!

#### Dimostrazione (`Hacker.java`):

```java
CoppiaAnimali c = new CoppiaAnimali("Tramot", 3, 5.0, "Galileo", 2, 4.0);
Animale t = c.getPrimo();
t.setNome("X"); // Modifica direttamente il campo privato di c!
```

Dopo questa operazione, anche il campo `primo` di `CoppiaAnimali` avrà il nome cambiato in "X". Questo è un esempio di **security leak**.

---

## Come evitare la security leak

Per evitare questo problema, bisogna restituire una **copia** (clone) dell’oggetto, non il riferimento originale.

Esempio corretto (commentato nel file):

```java
public Animale getPrimo() {
    return new Animale(primo.getNome(), primo.getEta(), primo.getPeso());
}
```

In questo modo, chi riceve l’oggetto può modificarlo, ma le modifiche non influenzano l’oggetto originale contenuto nella classe.

---

## In sintesi

- **Security leak**: si verifica quando si espongono riferimenti a oggetti interni, permettendo modifiche non volute dall’esterno.
- **Soluzione**: restituire sempre una copia (clone) degli oggetti interni nei metodi getter, non il riferimento originale.

---

## Esempio riassuntivo

```java
// Versione che causa security leak
public Animale getPrimo() {
    return primo; // ERRORE: espone il riferimento originale
}

// Versione sicura
public Animale getPrimo() {
    return new Animale(primo.getNome(), primo.getEta(), primo.getPeso());
}
```

---

**Conclusione:**  
Quando si progettano classi che contengono oggetti mutabili come campi privati, bisogna fare attenzione a non esporre i riferimenti originali tramite i getter, per evitare problemi di sicurezza e perdita di incapsulamento.