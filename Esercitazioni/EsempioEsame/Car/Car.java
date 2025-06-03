package Car;

public class Car {
    static int counter = 0;
    private int id;
    private String model;
    private double speed;

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
        counter++;
        id = counter;
    }

    public Car() {
        counter++;
        id = counter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car))return false;
        Car c = (Car)obj;
        return (this.model.compareTo(c.getModel()) == 0) && (this.speed == c.getSpeed());
    }
    @Override
    public String toString() {
        return  "Obj: " + super.toString() + "\tID: " + id + "\tModel: " + model + "\tSpeed" + speed;
    }

    public void accelerate(double amount) {
        if (amount < 0)
            System.out.println("Invalid accelerate amount!");
        else 
            speed += amount;
    }

    public void brake(double amount) {
        if (amount < 0)
            System.out.println("Invalid accelerate amount!");
        else {
            if (amount > speed) 
                System.out.println("Error! Brake amount is higher than the current Speed!");
            else
                speed -= amount;
        }
    }

    public static int getNumCars() {
        return counter;
    }
}
