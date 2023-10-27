package basic;

class Student implements Cloneable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(1001, "Cool");
        System.out.println(student);
        Student studentClone = (Student) student.clone();
        System.out.println(studentClone);

        if (student instanceof Cloneable) {
            System.out.println("Student object is clonable");
        }
    }
}
