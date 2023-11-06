package inheritance.animals;

public class Truck implements Trackable{
    static final String PERMIT;
    static final String REGISTRATION = "KA";

    static {
        PERMIT = "NP";
    }

    @Override
    public void track() {
        System.out.printf("%s is being tracked %n", getClass().getSimpleName());
        System.out.printf("Permit=%s  & Registration=%s %n", PERMIT, REGISTRATION);
    }
}
