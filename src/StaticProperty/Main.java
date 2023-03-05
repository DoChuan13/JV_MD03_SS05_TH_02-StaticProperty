package StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Vin Fast", "VF6");
        System.out.println(car1.numberOfCars);
        Car car2 = new Car("Vin Fast", "VF8");
        System.out.println(car2.numberOfCars);
    }
}
