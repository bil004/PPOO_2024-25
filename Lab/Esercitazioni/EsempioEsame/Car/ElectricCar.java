package Car;

public class ElectricCar extends Car{
    private int charge = 100;
    
    public ElectricCar(String model, double speed) {
        super(model, speed);
    }

    public ElectricCar() {
        super();
    }
    
    @Override
    public void accelerate(double amount) {
        if(charge <= 0) {
            System.out.println("The car is out of charge.");
            return;
        }

        charge -= 5;
        super.accelerate(amount);
    }
}