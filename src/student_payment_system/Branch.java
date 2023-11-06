package student_payment_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Branch {
    private int id;
    private String name;
    private String email;
    private String phoneNo;
    private String address;

    private List<Course> courses;

    private Map<Integer, List<Student>> studentsPerCourse;

    public Branch(int id, String name, String email, String phoneNo, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        courses = new ArrayList<>();
        studentsPerCourse = new HashMap<>();
    }

    /**
     * This method is used for adding new course.
     *
     * @param course
     */
    public void addCourse(Course course) {
        courses.add((course));
        studentsPerCourse.put(course.getId(), course.getStudents());
    }

    public List<Course> getCourses() {
        return courses;
    }

    public Map<Integer, List<Student>> getStudentsPerCourse() {
        return studentsPerCourse;
    }



    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ",\n courses=" + courses +
                '}';
    }


    public void studentPaymentInfo() {
        System.out.println("Students Payment details per Course:\n");
        for (Course course: courses) {
            System.out.println("Course Id:" + course.getId() + ", Course Name:" + course.getName() + ", Fees:" + course.getFees() + "\n\n");

            List<Student> students = course.getStudents();
            System.out.print("-".repeat(120));
            System.out.println();
            System.out.printf("%10s %20s %20s %20s %20s %20s%n", "Student Id", "Student Name", "Email", "Total Fees", "Fee Paid", "Remaining Fee");
            System.out.print("-".repeat(120));
            System.out.println();
            for (Student student: students) {
                System.out.printf("%10s %20s %20s %20s %20s %20s%n", student.getId(), student.getName(), student.getEmail(),
                        course.getFees(), student.getFeePaid(),(course.getFees() - student.getFeePaid()) );
            }
            System.out.print("-".repeat(120));
        }
    }
}
