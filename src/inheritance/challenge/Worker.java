package inheritance.challenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate;
    protected String  endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate;
    }

    public int getAge() {
        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yy");
        Date dob = null;
        try {
            dob = sdf.parse(birthDate);
        } catch (ParseException e) {
            return -1;
        }
        return (int) ((new Date(System.currentTimeMillis()).getYear()) - dob.getYear());
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String date) {
        this.endDate = date;
        System.out.println("Employee is terminated!");
    }
}
