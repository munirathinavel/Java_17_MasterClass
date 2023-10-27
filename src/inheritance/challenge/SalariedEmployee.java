package inheritance.challenge;

import java.text.SimpleDateFormat;

public class SalariedEmployee extends Employee {
    private double annualPay;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualPay, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualPay = annualPay;
        this.isRetired = isRetired;
    }

    public String retire() {
        isRetired = true;
       return endDate = "10-26-2029";
    }

    @Override
    public double collectPay() {
        double payCheck = annualPay / 12;
        return isRetired ? payCheck * .5 : payCheck;
    }
}
