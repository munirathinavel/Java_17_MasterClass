package inheritance;

public class StudentInheritance {

    public static void main(String[] args) {
        Student ram = new Student("Ram", 21);
        System.out.println(ram);

        Student thiru = new PrimarySchoolStudent("Thiru", 3, "Vel");
        System.out.println(thiru);
    }
}

class Student extends Object {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student {
    String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}
