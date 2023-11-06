package student_payment_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testStudentPaymentSystem() {
        Branch hsrFiitJee = new Branch(1001, "9-HSR", "fiitjeehsr@gmail.com",
                "+919045434345", "HSR Loayout, Bangalore");
        Course course = new Course(101, "2 Year Pinnacle Program", 213000.00);

        Student vishanth = new Student(10001, "Vishanth", "vishanth@gmail.com", "+91454545453", "Dharmapuri, Tamilnadu", 101);
        course.addStudent(vishanth);
        Student rahul = new Student(10002, "Rahul", "rahul@gmail.com", "+91454545453", "Brangalore, Karnataka", 101);
        course.addStudent(rahul);
        Student vijay = new Student(10002, "Vijay", "vijay@gmail.com", "+91454545453", "Brangalore, Karnataka", 101);
        course.addStudent(vijay);

        hsrFiitJee.addCourse(course);

        System.out.println(hsrFiitJee + "\n\n\n");

        // Fees Payment
        vishanth.payFees(150000.00);
        rahul.payFees(213000.00);
        vijay.payFees(100000.00);

        // Student Payment Detail
        hsrFiitJee.studentPaymentInfo();


        Branch jayaNagarFiitJee = new Branch(1001, "FiitJee-HSR", "fiitjeehsr@gmail.com",
                "+919045434345", "HSR Loayout, Bangalore");
    }

    @Test
    public  void testThis() {
        String message = "Keep Smiling";
        System.out.println(message);
        int userNo = 101;
        System.out.println("User Number is " + userNo);

    }

}