package oops.inheritance.constructoroverloading;

public class ConstructoChallenge {
    private String name;
    private String email;
    private double creditLimit;

    public ConstructoChallenge(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public ConstructoChallenge() {
        this("defaultName", "default@email.com");
    }

    public ConstructoChallenge(String name, String email) {
        this(name, email, 0.0);
    }

    public ConstructoChallenge(String email) {
        this("defaultName", email, 0.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return "ConstructoChallenge{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
