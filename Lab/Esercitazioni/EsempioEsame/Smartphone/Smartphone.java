package Smartphone;

public class Smartphone {
    static int counter = 0;
    private int id;
    private String model;
    private int battery;

    public Smartphone(String model, int battery) {
        this.model = model;
        assert(battery > 0 && battery <= 100) : "Carica insufficiente!";
        this.battery = battery;
        counter++;
        id = counter;
    }

    public Smartphone() {
        counter++;
        id = counter;
    }

    public int getBattery() {
        return battery;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tModel: " + model + "\tBattery: " + battery;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Smartphone))
            return false;
        
        Smartphone s = (Smartphone) obj;
        return this.getModel().compareTo(s.getModel()) == 0;
    }

    public boolean charge(int amount) {
        if (amount > 100 || amount <= 0) 
            return false;
        
        if (amount + battery > 100 || amount + battery < 0)
            return false;
        
        battery += amount;
        return true;
    }

    public boolean use(int amount) {
        if (amount > 100 || amount <= 0) 
            return false;
        
        if (battery - amount < 0)
            return false;
        
        battery -= amount;
        return true;
    }

    public static int getNumSmartphones() {
        return counter;
    }
}
