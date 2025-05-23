# Metodo `clearScreen()` in Java: spiegazione dettagliata

```java
public static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

---

## Cosa fa il metodo?

1. **Controlla il sistema operativo in uso**
   - Usa `System.getProperty("os.name")` per ottenere il nome del sistema operativo.
   - Se il nome contiene "Windows", capisce che il programma gira su Windows, altrimenti su Unix/Linux/macOS.

2. **Esegue il comando appropriato**
   - Su Windows: esegue `cls` tramite il terminale `cmd`.
   - Su Unix/Linux/macOS: esegue `clear`.

3. **Esegue il comando tramite `ProcessBuilder`**
   - `ProcessBuilder` permette di eseguire comandi di sistema dal programma Java.
   - Il comando viene eseguito con `start()`, e il programma aspetta la fine con `waitFor()`.

4. **Gestisce eventuali errori**
   - Se qualcosa va storto, cattura l'eccezione e stampa lo stack trace.

---

## Passo per passo

1. **Controllo del sistema operativo**
   ```java
   if (System.getProperty("os.name").contains("Windows")) {
   ```
   - Controlla se il sistema operativo è Windows.

2. **Esecuzione del comando appropriato**
   ```java
   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   ```
   - Su Windows, usa il comando `cls` tramite `cmd`.
   - `/c` indica che il comando deve essere eseguito e poi il terminale si chiude.

   ```java
   new ProcessBuilder("clear").inheritIO().start().waitFor();
   ```
   - Su Unix/Linux/macOS, usa il comando `clear`.

3. **Gestione degli errori**
   ```java
   } catch (Exception e) {
       e.printStackTrace();
   }
   ```
   - Se qualcosa va storto, stampa un messaggio di errore dettagliato.

---

## Nota importante
- Questo metodo funziona solo se il terminale supporta i comandi `cls` o `clear`. In alcune IDE (come Eclipse o IntelliJ) potrebbe non funzionare.
- `inheritIO()` fa sì che l'output del comando venga mostrato direttamente nella console del programma.

---

## In sintesi
Il metodo `clearScreen()` cerca di pulire lo schermo della console eseguendo un comando di sistema (`cls` o `clear`), adattandosi al sistema operativo in uso. Se qualcosa va storto, stampa un errore.

---

# Spiegazione di `ProcessBuilder`

`ProcessBuilder` è una classe Java che permette di creare ed eseguire processi di sistema (comandi del sistema operativo) dal codice Java.

### Metodi usati nel codice

- **`ProcessBuilder(String... command)`**: crea un oggetto `ProcessBuilder` con il comando da eseguire.
    - Esempio: `new ProcessBuilder("cmd", "/c", "cls")` o `new ProcessBuilder("clear")`.
- **`inheritIO()`**: fa sì che il processo usi lo stesso input/output del programma Java principale.
- **`start()`**: avvia il processo specificato.
- **`waitFor()`**: fa attendere il programma Java finché il processo non termina.

---

# Spiegazione di `System.getProperty`

`System.getProperty` è un metodo statico della classe `System` che permette di ottenere informazioni sulle proprietà del sistema in cui gira il programma Java.

### Metodi usati nel codice

- **`System.getProperty(String key)`**: restituisce il valore della proprietà di sistema specificata dalla chiave.
    - Esempio: `System.getProperty("os.name")` restituisce il nome del sistema operativo.
- **`String.contains(CharSequence s)`**: metodo della classe `String` che verifica se una stringa contiene una certa sequenza di caratteri.
    - Esempio: `System.getProperty("os.name").contains("Windows")` controlla se il sistema operativo è Windows.

---

## In sintesi
- **`ProcessBuilder`**: serve per eseguire comandi di sistema. Metodi usati: `ProcessBuilder(String... command)`, `inheritIO()`, `start()`, `waitFor()`.
- **`System.getProperty`**: serve per ottenere informazioni sulle proprietà del sistema. Metodo usato: `System.getProperty(String key)` con la chiave `"os.name"` per determinare il sistema operativo.

Questi strumenti lavorano insieme per eseguire il comando corretto (`cls` o `clear`) in base al sistema operativo.