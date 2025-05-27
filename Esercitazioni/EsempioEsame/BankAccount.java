package EsempioEsame;

public class BankAccount {
    static int counter = 0;
    private int id;
    private String name;
    private double total;

    public BankAccount(String name, double total) {
        this.id = counter;
        this.name = name;
        this.total = total;
        counter++;
    }

    public BankAccount(String name) {
        this.id = counter;
        this.name = name;
        this.total = 0.0;
        counter++;
    }

    public String getName() {
        return name;
    }

    public double getTotal() {
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BankAccount))
            return false;

        BankAccount o = (BankAccount)obj;
        return (name.compareTo(o.name) == 0) && (total == o.getTotal());
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tName: " + name + "\tTotal: " + total;
    }

    public void deposit(double l) {
        if (l <= 0) {
            System.out.println("Deposito non possibile!");
            return;
        }
        total += l;
        System.out.println("Deposito avvenuto con successo!");
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Importo non valido.");
            return false;
        }
        if (total >= amount) {
            total -= amount;
            System.out.println("Prelievo avvenuto con successo!");
            return true;
        } else {
            System.out.println("Fondi insufficienti.");
            return false;
        }
    }

    public static int getNumAccounts() {
        return counter;
    }
}