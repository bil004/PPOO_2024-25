# Domanda d'esame: Modellare gli account di utenti in una biblioteca

**Totale: 31 punti – sufficienza con 18**

---

## Prima parte

Scrivere una classe `LibraryAccount` che contenga i seguenti elementi:

- Una variabile statica intera `counter` che tenga traccia del numero totale di account creati. Ogni nuovo account riceve un identificatore univoco (`id`) basato su questo contatore.

- Tre attributi privati:
  - `id` (intero): identificativo univoco del membro, assegnato automaticamente tramite `counter`.
  - `memberName` (String): nome del titolare dell’account.
  - `booksBorrowed` (int): numero di libri attualmente presi in prestito dal membro.

### Costruttori

- Un costruttore che inizializza `memberName` e `booksBorrowed`.
- Un costruttore che inizializza solo `memberName`, e imposta `booksBorrowed` a zero.

Entrambi i costruttori devono aggiornare il `counter` e assegnare il valore attuale del `counter` a `id`.

### Metodi

- Getter per `memberName` e `booksBorrowed`, setter solo per `memberName`.
- Metodo `toString()`: i dati dell'account vengono rappresentati seguendo il formato  
  `"LibraryAccount[id=X, memberName=Y, numero libri=Z]"`, dove X, Y e Z rappresentano i valori attuali di `id`, `memberName` e `booksBorrowed` rispettivamente.
- `borrow(int n)`: aggiunge `n` libri al conteggio dei libri presi in prestito.
- `returnBooks(int n)`: riduce il numero di libri presi in prestito di `n` (stampa a video  
  `"Errore: il numero di libri restituiti è superiore al numero di libri in prestito."` nel caso in cui `n > booksBorrowed`).
- Metodo statico: `getNumAccounts()`: restituisce il numero totale di account creati (cioè il valore attuale di `counter`).

---

## Seconda parte

Scrivere una sottoclasse `LibraryAccountYoung` con le seguenti caratteristiche:

- Attributo `maxBooks` (int) che rappresenta il limite massimo di libri che il membro può prendere in prestito.
- Ridefinizione del metodo `borrow(int n)` in modo che non sia possibile superare `maxBooks` in totale.

Esempio: supponiamo che un utente abbia già in prestito 4 libri e possa prenderne in prestito al massimo 5:

- In caso tentasse di prendere in prestito altri 3 libri (`borrow(3)`) dovrebbe comparire come messaggio di output:  
  `"La tua richiesta eccede di 2 libri il massimo consentito, prestito non consentito!"`  
  (ovvero in questo caso il prestito non è consentito).
- In caso tentasse di prendere in prestito un solo altro libro (`borrow(1)`), e in generale quando il prestito richiesto non eccede il numero massimo di libri consentiti, stampa a video:  
  `"Prestito avvenuto con successo"`.

**Nota bene:** la decisione sul tipo di ritorno dei metodi è parte del compito di esame.

---

## Esempio di risultati

```
LibraryAccount[id=1, memberName=Mario Rossi, numero libri=3]
LibraryAccount[id=2, memberName=Luisa Bianchi, numero libri=0]

Dopo aver preso in prestito libri:
LibraryAccount[id=1, memberName=Mario Rossi, numero libri=5]
LibraryAccount[id=2, memberName=Luisa Bianchi, numero libri=1]

Errore: il numero di libri restituiti è superiore al numero di libri in prestito

Dopo la restituzione dei libri:
LibraryAccount[id=1, memberName=Mario Rossi, numero libri=4]
LibraryAccount[id=2, memberName=Luisa Bianchi, numero libri=1]

Nuovo nome per acc1: Giovanni Verdi
Totale account creati: 2

=== Test LibraryAccountYoung ===
LibraryAccount[id=3, memberName=Paolo Piccolo, numero libri=0]
La tua richiesta eccede di 1 libri il massimo consentito!

Dopo i tentativi di prestito:
LibraryAccount[id=3, memberName=Paolo Piccolo, numero libri=2]

Errore: il numero di libri restituiti è superiore al numero di libri in prestito

Dopo le restituzioni:
LibraryAccount[id=3, memberName=Paolo Piccolo, numero libri=1]
