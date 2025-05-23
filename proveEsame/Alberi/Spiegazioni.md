# Come creare alberi in Java

## Domande

1. Perché abbiamo bisogno di più classi per rappresentare l'albero?
2. Perché utilizziamo `protected` in Tree?
3. Perché la classe Leaf è sempre vuota?
4. Perché nel main creiamo un oggetto Tree ma ci mettiamo `new Branch()`?

---

## Spiegazione semplice e completa

Per creare alberi binari di ricerca in Java, si seguono questi passi:

1. **Definisci una classe astratta** per rappresentare il concetto generale di albero, ad esempio `Tree`. Qui dichiari i metodi comuni (come `insert`, `remove`, `contains`, ecc.) che ogni tipo di albero dovrà avere.
2. **Crea una sottoclasse per gli alberi non vuoti**: `Branch`. Questa rappresenta i nodi che contengono un valore (`elem`) e due sottoalberi (`left` e `right`).
3. **Crea una sottoclasse per l’albero vuoto**: `Leaf`. Questa rappresenta i nodi terminali, cioè le “foglie” vuote dell’albero.
4. **Usa il polimorfismo**: nel codice client (ad esempio nel `main` di `TestTree.java`), puoi dichiarare variabili di tipo `Tree` e assegnare loro oggetti di tipo `Branch` o `Leaf`. Questo permette di trattare in modo uniforme sia alberi vuoti che non vuoti.

---

## Risposte alle domande

### 1. Perché abbiamo bisogno di più classi per rappresentare l'albero?

Un albero può essere **vuoto** o **non vuoto**:
- La classe `Leaf` rappresenta l’albero vuoto (foglia).
- La classe `Branch` rappresenta un nodo con un valore e due sottoalberi.

Questo permette di gestire in modo semplice e sicuro tutti i casi, sfruttando il polimorfismo: ogni oggetto `Tree` sa “comportarsi” correttamente a seconda che sia una foglia o un nodo.

---

### 2. Perché utilizziamo `protected` in Tree?

Il modificatore `protected` viene usato per i metodi che **devono essere visibili solo alle sottoclassi** (come `toStringAux` in `Tree.java`), ma non all’esterno.  
Serve per permettere alle classi derivate di personalizzare o usare certi comportamenti interni, mantenendo però l’incapsulamento verso il resto del programma.

---

### 3. Perché la classe Leaf è sempre vuota?

`Leaf` rappresenta **sempre** un albero vuoto:
- Non ha attributi, non contiene valori né figli.
- Serve solo come “segnaposto” per indicare che un certo ramo dell’albero è terminato.
- In questo modo, non si usa mai `null` per rappresentare un ramo vuoto, ma sempre un oggetto `Leaf`, rendendo il codice più sicuro e pulito.

---

### 4. Perché nel main creiamo un oggetto Tree ma ci mettiamo `new Branch()`?

Per sfruttare il **polimorfismo**:
- Si dichiara la variabile come tipo astratto `Tree`, ma si può assegnare sia un oggetto `Leaf` che un oggetto `Branch`.
- Questo permette di scrivere codice generico che funziona con qualsiasi tipo di albero, lasciando che sia Java a scegliere il comportamento corretto in base al tipo reale dell’oggetto.

**Esempio:**
```java
Tree t = new Leaf(); // albero vuoto
t = t.insert(5);     // ora t è un Branch con valore 5
```

---

**In sintesi:**  
Si usano più classi per distinguere tra albero vuoto e non vuoto, si sfrutta `protected` per l’incapsulamento tra superclassi e sottoclassi, `Leaf` è sempre vuota per rappresentare i rami terminali, e si usa il polimorfismo per lavorare in modo uniforme con tutti i tipi di albero.

---

## Spiegazione dettagliata del punto 4

### Perché nel main creiamo un oggetto Tree ma ci mettiamo `new Branch()`?

In Java, puoi dichiarare una variabile usando il **tipo astratto** (la superclasse, qui `Tree`), ma assegnarle un oggetto di una **sottoclasse concreta** (`Branch` o `Leaf`).  
Questo si chiama **polimorfismo** ed è uno dei concetti fondamentali della programmazione orientata agli oggetti.

#### Perché si fa così?
- **Uniformità:** Puoi scrivere codice che funziona sia con alberi vuoti (`Leaf`) che con alberi non vuoti (`Branch`) senza dover distinguere ogni volta il tipo concreto.
- **Flessibilità:** Puoi cambiare il tipo di albero (vuoto/non vuoto) durante l’esecuzione, semplicemente assegnando un nuovo oggetto alla variabile.
- **Estendibilità:** Se in futuro aggiungi altri tipi di alberi, il codice che usa `Tree` funzionerà comunque.

#### Esempio pratico
```java
Tree t = new Leaf();      // t è un albero vuoto
t = t.insert(5);          // ora t è un Branch con valore 5
t = t.insert(3);          // t resta un Tree, ma internamente è un Branch più grande
```
In questo modo, il tipo della variabile (`Tree`) resta sempre lo stesso, ma l’**oggetto** a cui punta può cambiare (da `Leaf` a `Branch` e viceversa).

#### Nel tuo codice
Nel main, scrivi:
```java
Tree t = new Leaf();
t = t.insert(5); // insert restituisce un Branch, ma t è sempre dichiarato come Tree
```
Così puoi usare sempre `Tree` e lasciare che sia Java a gestire quale sottoclasse usare in ogni momento.

---

**In sintesi:**  
Dichiari la variabile come `Tree` per poterci mettere sia un `Leaf` che un `Branch`, sfruttando il polimorfismo e rendendo il codice più semplice, flessibile e sicuro.

---

## Esiste la classe Tree in java.util?

No, **non esiste una classe chiamata `Tree` nel package `java.util`** della libreria standard Java.

Nel package `java.util` esistono invece alcune classi che implementano strutture ad albero, come:
- `TreeSet`
- `TreeMap`

Queste classi sono strutture dati specifiche (set e mappe ordinate), ma **non esiste una classe generica `Tree`**.  
La classe `Tree` che stai usando è definita da te nel tuo progetto.

---

## Spiegazione di TreeSet e TreeMap

### TreeSet

- **Cos’è:** Una collezione che memorizza elementi **unici** (senza duplicati) in **ordine crescente** (naturale o tramite un comparatore).
- **Implementazione:** Internamente usa un albero rosso-nero (un tipo di albero binario di ricerca bilanciato).
- **Utilità:**  
  - Quando vuoi una lista di elementi **ordinati** e **senza duplicati**.
  - Puoi cercare, aggiungere e rimuovere elementi in tempo logaritmico.
- **Esempio d’uso:**
    ```java
    TreeSet<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(2);
    set.add(7);
    // set: [2, 5, 7]
    ```

---

### TreeMap

- **Cos’è:** Una mappa (dizionario) che associa **chiavi** a **valori**, mantenendo le chiavi **ordinate**.
- **Implementazione:** Anche qui, usa un albero rosso-nero.
- **Utilità:**  
  - Quando vuoi associare valori a chiavi **ordinate** (ad esempio, per trovare il minimo, massimo, o fare ricerche intervallo).
  - Le operazioni di inserimento, ricerca e rimozione sono efficienti (tempo logaritmico).
- **Esempio d’uso:**
    ```java
    TreeMap<String, Integer> map = new TreeMap<>();
    map.put("cane", 1);
    map.put("gatto", 2);
    map.put("ape", 3);
    // le chiavi sono ordinate: ["ape", "cane", "gatto"]
    ```

---

### Differenza principale

- **TreeSet** memorizza solo **elementi** (senza duplicati, ordinati).
- **TreeMap** memorizza **coppie chiave-valore** (le chiavi sono ordinate e uniche).

---

### Quando usare TreeSet o TreeMap?

- Usa **TreeSet** se ti serve un insieme ordinato di elementi unici.
- Usa **TreeMap** se ti serve una mappa ordinata dove puoi associare valori a chiavi e vuoi che le chiavi siano sempre ordinate.

---

**In sintesi:**  
- **TreeSet** = insieme ordinato senza duplicati  
- **TreeMap** = dizionario ordinato per chiavi

Entrambi sono utili quando l’**ordine** degli elementi/chiavi è importante!