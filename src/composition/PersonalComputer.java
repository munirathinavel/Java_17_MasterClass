package composition;

class Dimension {
    private int height;
    private int width;
    private int depth;

    public Dimension(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}

class Product {
    private String model;
    private String manufacturer;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

class Monitor extends Product {
    private int x;
    private int y;

    private  Dimension dimension;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int x, int y, Dimension dimension) {
        super(model, manufacturer);
        this.x = x;
        this.y = y;
        this.dimension = dimension;
    }

    public void drawPixel() {
        System.out.printf("Drawing from %d to %d \n", x, y);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "x=" + x +
                ", y=" + y +
                ", dimension=" + dimension +
                "} " + super.toString();
    }
}

class MotherBoard extends Product {
    private String programName;
    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, String programName) {
        super(model, manufacturer);
        this.programName = programName;
    }

    public void loadProgram() {
        System.out.println("Program " + programName + " is loaded.");
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "programName='" + programName + '\'' +
                "} " + super.toString();
    }
}

class KeyBoard extends  Product {

    public KeyBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void turnOn() {
        System.out.println("Key Board is turned on.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class PersonalComputer extends Product {
    private Monitor monitor;
    private MotherBoard motherBoard;
    private KeyBoard keyBoard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard, KeyBoard keyBoard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
        this.keyBoard = keyBoard;
    }

    public void turnOn() {
        monitor.drawPixel();
        keyBoard.turnOn();
        motherBoard.loadProgram();
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "monitor=" + monitor +
                ", motherBoard=" + motherBoard +
                ", keyBoard=" + keyBoard +
                "} " + super.toString();
    }
}