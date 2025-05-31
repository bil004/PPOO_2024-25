package Car;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Testing Car class:");

        Car c1 = new Car("Toyota1234", 200);
        Car c2 = new Car("Fiat6873", 150);
        Car c3 = new Car();
        c3.setModel("MarioKart");

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        // Test getters
        System.out.println("c1 model: " + c1.getModel());
        System.out.println("c2 speed: " + c2.getSpeed());

        // Test accelerate
        c1.accelerate(20);
        System.out.println("c1 speed after accelerate 20: " + c1.getSpeed());
        c1.accelerate(-5); // invalid

        // Test brake
        c2.brake(50);
        System.out.println("c2 speed after brake 50: " + c2.getSpeed());
        c2.brake(-10); // invalid
        c2.brake(200); // brake amount higher than speed

        // Test equals
        Car c4 = new Car("Toyota1234", 220);
        System.out.println("c1 equals c4: " + c1.equals(c4));
        Car c5 = new Car("Toyota1234", 220);
        System.out.println("c4 equals c5: " + c4.equals(c5));

        System.out.println("\nTesting ElectricCar class:");

        ElectricCar e1 = new ElectricCar("Tesla4321", 180);
        ElectricCar e2 = new ElectricCar();

        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);

        // Test ElectricCar accelerate and charge consumption
        for (int i = 0; i < 22; i++) {
            e1.accelerate(10);
            System.out.println("e1 speed: " + e1.getSpeed());
        }

        // Test accelerate when out of charge
        e1.accelerate(10);

        System.out.println("\nTotal number of cars created: " + Car.getNumCars());
    }
}