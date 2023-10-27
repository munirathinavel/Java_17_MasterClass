package pojo;

public class StudentPOJO {
    private int id;

    private String name;
    private String email;

    private String classList;

    public StudentPOJO(int id, String name, String email, String classList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.classList = classList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
