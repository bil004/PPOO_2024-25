package Car;

public class TestCarThorough {
    public static void main(String[] args) {
        System.out.println("Thorough testing of Car class:");

        Car c1 = new Car("Toyota1234", 200);
        Car c2 = new Car("Fiat6873", 150);
        Car c3 = new Car();
        c3.setModel("MarioKart");

        // Test getters
        assert "Toyota1234".equals(c1.getModel()) : "c1 model getter failed";
        assert 150 == c2.getSpeed() : "c2 speed getter failed";

        // Test accelerate with valid and invalid values
        c1.accelerate(20);
        assert c1.getSpeed() == 220 : "c1 accelerate failed";
        c1.accelerate(-5); // should print error, speed unchanged
        assert c1.getSpeed() == 220 : "c1 accelerate with negative amount changed speed";

        // Test brake with valid and invalid values
        c2.brake(50);
        assert c2.getSpeed() == 100 : "c2 brake failed";
        c2.brake(-10); // should print error, speed unchanged
        assert c2.getSpeed() == 100 : "c2 brake with negative amount changed speed";
        c2.brake(200); // should print error, speed unchanged
        assert c2.getSpeed() == 100 : "c2 brake with too high amount changed speed";

        // Test equals with various cases
        Car c4 = new Car("Toyota1234", 220);
        assert !c1.equals(c2) : "equals failed for different cars";
        assert !c1.equals(null) : "equals failed for null";
        assert c1.equals(c4) : "equals failed for same model and speed";

        // Test toString contains expected substrings
        String toStr = c1.toString();
        assert toStr.contains("Model: Toyota1234") : "toString missing model";
        assert toStr.contains("Speed") : "toString missing speed";

        System.out.println("Car class tests passed.");

        System.out.println("\nThorough testing of ElectricCar class:");

        ElectricCar e1 = new ElectricCar("Tesla4321", 180);
        ElectricCar e2 = new ElectricCar();

        // Test initial charge and accelerate behavior
        for (int i = 0; i < 20; i++) {
            e1.accelerate(10);
        }
        // After 20 accelerations, charge should be 0 or less
        e1.accelerate(10); // should print out of charge message

        // Test that speed increased correctly
        assert e1.getSpeed() > 180 : "ElectricCar speed did not increase";

        // Test accelerate with zero charge does not increase speed
        double speedBefore = e1.getSpeed();
        e1.accelerate(10);
        assert e1.getSpeed() == speedBefore : "ElectricCar accelerated with zero charge";

        System.out.println("ElectricCar class tests passed.");

        // Test static counter for number of cars
        int totalCars = Car.getNumCars();
        System.out.println("Total cars created: " + totalCars);
        assert totalCars >= 7 : "Car counter incorrect";

        System.out.println("All thorough tests passed.");
    }
}
