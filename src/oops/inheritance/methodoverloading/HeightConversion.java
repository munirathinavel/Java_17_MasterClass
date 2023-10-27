package oops.inheritance.methodoverloading;

public class HeightConversion {

    public double convertToCentimeters(int heightInInches) {
        double heightInCm = heightInInches * 2.54;
        System.out.println("Height in Centimeters is:" + heightInCm);
        return heightInCm;
    }

    public double convertToCentimeters(int heightInFeet, int heightInInches) {
        double heightInCm = (heightInFeet * 12 + heightInInches) * 2.54;
        System.out.println("Height in Centimeters is:" + heightInCm);
        return heightInCm;
    }
}
