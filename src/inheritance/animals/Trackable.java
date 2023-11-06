package inheritance.animals;

interface Trackable {
    int GMT = 0;
    String CHENNAI_COORDINATES = "60.33E,12.75N";
    private void trackGovernmentFlights() {
        System.out.println("Secret tracking of Flights for Government purposes.");
    }

    default String getDefaultLocation() {
        return "0.00W,0.00N";
    }

    private static void trackBlackListedPlaces() {
        System.out.println("Tracking Black Listed Places.");
    }

    static void trackBlackListedCountries() {
        System.out.println("Tracking Black Listed Countries");
        trackBlackListedPlaces();
    }




    void track();

    default void getCurrentLocation() {
        System.out.printf("%s's current Location is tracked%n", this.getClass().getSimpleName());
    }

}
