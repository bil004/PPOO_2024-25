package Smartphone;

public class TestSmartphone {
    public static void main(String[] args) {
        // Test creation and getters
        Smartphone s1 = new Smartphone("ModelA", 50);
        Smartphone s2 = new Smartphone("ModelB", 80);
        Smartphone s3 = new Smartphone();
        
        System.out.println("Testing creation and getters:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // Test setters
        s3.setModel("ModelC");
        System.out.println("After setting model for s3: " + s3.getModel());
        
        // Test equals method
        Smartphone s4 = new Smartphone("ModelA", 30);
        System.out.println("s1 equals s4 (should be true): " + s1.equals(s4));
        System.out.println("s1 equals s2 (should be false): " + s1.equals(s2));
        
        // Test charge method
        System.out.println("Charging s1 by 30 (should be true): " + s1.charge(30));
        System.out.println("Battery after charge: " + s1.getBattery());
        System.out.println("Charging s1 by 100 (should be false): " + s1.charge(100));
        
        // Test use method
        System.out.println("Using s2 by 50 (should be true): " + s2.use(50));
        System.out.println("Battery after use: " + s2.getBattery());
        System.out.println("Using s2 by 100 (should be false): " + s2.use(100));
        
        // Test GamingSmartphone
        GamingSmartphone gs1 = new GamingSmartphone("GameModel", 70);
        System.out.println("GamingSmartphone created: " + gs1);
        
        // Test overridden use method consumes 10% more battery
        System.out.println("Using GamingSmartphone by 20 (should be true): " + gs1.use(20));
        System.out.println("Battery after use: " + gs1.getBattery());
        
        // Test static counter
        System.out.println("Total smartphones created: " + Smartphone.getNumSmartphones());
    }
}
