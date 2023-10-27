package oops.inheritance.constructoroverloading;

public class ConstructorOverloading {
    private String name;
    private String email;
    private String firstName;
    private String lastName;

    public String getName() {
        return (firstName == null ? "" : firstName) + " " + (lastName == null ? "" : lastName);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ConstructorOverloading() {
        System.out.println("This is default constructor..");
    }

    public ConstructorOverloading(String email) {
        this("Default First Name", "Default LastName", email);
        System.out.println("This is email constructor");
    }

    public ConstructorOverloading(String firstName, String lastName, String email) {
        System.out.println("This is name & email constructor");
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
    }

    @Override
    public String toString() {
        return this.getName() + ", " +
                this.getEmail();
    }
}

