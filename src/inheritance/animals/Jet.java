package inheritance.animals;

public class Jet implements OrbitEarth, Trackable {

    @Override
    public void fly() {
        System.out.printf("%s is flying %n", getClass().getSimpleName());
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void track() {
        System.out.printf("%s is being tracked %n", getClass().getSimpleName());
    }
    @Override
    public void getCurrentLocation() {
        Trackable.super.getCurrentLocation();
    }

    @Override
    public void achieveOrbit() {
        System.out.println(getClass().getSimpleName() + " is orbiting earth");
    }
}
