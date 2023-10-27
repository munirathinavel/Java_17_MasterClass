package inheritance.challenge;

public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1001;

    public Employee(String name, String birthDate,  String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "employeeId=" + employeeId +
                ", hireDate='" + hireDate + " " + super.toString();
    }
}
