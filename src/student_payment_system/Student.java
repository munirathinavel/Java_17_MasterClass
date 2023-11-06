package student_payment_system;

public class Student {
    private int id;
    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private int courseId;

    private double feePaid;


    public Student(int id, String name, String email, String phoneNo, String address, int courseId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.courseId = courseId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(double feePaid) {
        this.feePaid = feePaid;
    }

    public int getCourseId() {
        return courseId;
    }

    public void payFees(double fee) {
        feePaid = feePaid + fee;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", courseId=" + courseId +
                '}';
    }
}
