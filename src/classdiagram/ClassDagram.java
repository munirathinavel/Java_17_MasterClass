package classdiagram;

import java.util.ArrayList;
import java.util.List;

class College {
    List<Department> departments;

    College(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

class Department {
    List<String> subjects;

    Department(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}

public class ClassDagram {

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Computer Networks");
        Department cse = new Department(subjects);
        List<Department> departments = new ArrayList<>();
        departments.add(cse);
        College jayam = new College(departments);

        jayam.getDepartments();

    }
}
