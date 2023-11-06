package inheritance.animals;

public class Satellite  implements  OrbitEarth{
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " flying");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " landing");
    }

    @Override
    public void achieveOrbit() {
        System.out.println(getClass().getSimpleName() + " orbiting earth");
    }
}
