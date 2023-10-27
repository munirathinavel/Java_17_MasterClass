package pojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentPOJOTest {

    @Test
    public void testStudentPOJO() {
        for (int i = 0; i < 5; i++) {
            StudentPOJO student = new StudentPOJO(10000 + i, switch (i) {
                case 0 -> "Chinnasamy";
                case 1 -> "Ravi";
                case 2 -> "Raja";
                case 3 -> "Sridhar";
                case 4 -> "Suresh";
                default -> "Vel";
            }, "11/12/1987", "CSE");
            System.out.println(student);
        }
    }

}