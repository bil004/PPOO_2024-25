package Smartphone;

public class GamingSmartphone extends Smartphone {
    public GamingSmartphone(String model, int battery) {
        super(model, battery);
    }

    public GamingSmartphone() {
        super();
    }

    /*
     * public boolean use(int amount) {
        if (amount > 100 || amount <= 0) 
            return false;
        
        if (amount - battery < 0)
            return false;
        
        battery -= amount;
        return true;
    }
     */
    @Override
    public boolean use(int amount) {
        if (amount > 100 || amount <= 0)
            return false;

        // Consume 10% more battery during gaming
        int totalConsumption = amount + (amount / 10);

        if (super.getBattery() - totalConsumption < 0)
            return false;

        // Use the battery by totalConsumption
        return super.use(totalConsumption);
    }
}
