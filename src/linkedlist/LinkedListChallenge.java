package linkedlist;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//class City {
//    private String name;
//    private int distance;
//
//    public City(String name, int distance) {
//        this.name = name;
//        this.distance = distance;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    @Override
//    public String toString() {
//        return "City{" +
//                "name='" + name + '\'' +
//                ", distance=" + distance +
//                '}';
//    }
//}

record City(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
public class LinkedListChallenge {
    LinkedList<City> cities = new LinkedList<>();

    ListIterator<City> cityListIterator;

    public LinkedListChallenge() {
        City city = new City("Dharmapuri", 0);
        cities.add(city);
        cityListIterator = cities.listIterator(0);
    }

    public void addCity(City newCity) {
        if (cities.contains(newCity)) {
            System.out.println("Found Duplicate");
            return;
        }
        Integer integer = Integer.valueOf(12);
        ListIterator<City> listIterator = cities.listIterator(1);
        int matchIndex = 0;
        while ((listIterator.hasNext())) {
            City currentCity = listIterator.next();
            if (currentCity.name().equalsIgnoreCase(newCity.name())) {
                System.out.println("Found Duplicate" + newCity.name());
                return;
            }
            if (currentCity.distance() < newCity.distance()) {
                listIterator.add(newCity);
                return;
            }
            matchIndex++;
        }
        listIterator.add(newCity);
    }

    public City forward() {
        if(cityListIterator.hasNext()) {
            return cityListIterator.next();
        }
        return  null;
    }

    public City backward() {
        if(cityListIterator.hasPrevious()) {
            return cityListIterator.previous();
        }
        return  null;
    }

    public void listPlaces() {
        ListIterator<City> listIterator = cities.listIterator(1);
        while ((listIterator.hasNext())) {
            System.out.println(listIterator.next());
        }
    }

    public static void main(String[] args) {

        LinkedListChallenge linkedListChallenge = new LinkedListChallenge();

        linkedListChallenge.addCity(new City("Salem", 70));
        linkedListChallenge.addCity(new City("Kanyakumari", 710));
        linkedListChallenge.addCity(new City("Chennai", 300));
        linkedListChallenge.addCity(new City("Madhurai", 310));
        linkedListChallenge.addCity(new City("COimbature", 220));
        linkedListChallenge.addCity(new City("Trichy", 210));
        linkedListChallenge.addCity(new City("Hosur", 90));

        Scanner sc = new Scanner(System.in);
        String menuOption = """
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (Q)uit
                    """;
        ListIterator<City> listIterator = linkedListChallenge.cities.listIterator();
        System.out.println(menuOption);
        boolean quitLoop = false;
        boolean forward = true;
        while(!quitLoop) {
            if(!listIterator.hasPrevious()) {
                forward = true;
            }
            if(!listIterator.hasNext()) {
                forward = false;
            }
            System.out.println("Enter a value:");
            String option = sc.nextLine().toLowerCase().substring(0,1);
            switch (option) {
                case "f" ->   {
                    if (listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                    }
                }
                case "b" -> {
                    if (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                }
                case "l" -> linkedListChallenge.listPlaces();
                case "q" -> {
                    quitLoop = true;
                    System.out.println("Quiting Program");
                }
                default -> System.out.println("Wrong Option");
            }
        } while(quitLoop);

    }
}
