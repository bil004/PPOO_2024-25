package EsempioEsame;

public class BankAccountYoung extends BankAccount {
    private final double limit = 500;

    public BankAccountYoung(String name) {
        super(name);
    }

    public BankAccountYoung(String name, double total) {
        super(name, total);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > limit) {
            System.out.println("Prelievo superiore al limite consentito: " + limit);
            return false;
        }
        return super.withdraw(amount);
    }
}
