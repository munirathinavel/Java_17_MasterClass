package polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine is started with class: " + this.getClass().getSimpleName());
    }

    public void drive() {
        System.out.println("Driving the Car with class" + this.getClass().getSimpleName());
    }

    public static Car getCar(String description, double avgKmPerLitre, int batterySize, int cylinders, String type) {
        return switch (type) {
            case "Gas" -> new GasPoweredCar(description, avgKmPerLitre, cylinders);
            case "Electric" -> new ElectricCar(description, avgKmPerLitre, batterySize);
            case "Hybrid" -> new HybridCar(description, avgKmPerLitre, batterySize, cylinders);
            default -> new Car(description);
        };
    }

    protected void runEngine() {
        System.out.println("Running engine with class:" + this.getClass().getSimpleName());
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void runEngine() {
        System.out.println("Running engine from Gas Car");
    }
}

class ElectricCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerLitre, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public void runEngine() {
        System.out.println("Running engine from Electric Car");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public void runEngine() {
        System.out.println("Running engine from Hybrid Car");
    }
}
