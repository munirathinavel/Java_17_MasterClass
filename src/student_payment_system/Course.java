package student_payment_system;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private double fees;

    private List<Student> students;

    public Course(int id, String name, double fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ",\n students=" + students +
                '}';
    }
}
