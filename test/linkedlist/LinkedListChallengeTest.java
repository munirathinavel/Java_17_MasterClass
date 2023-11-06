package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class LinkedListChallengeTest {

    @Test
    void testLinkedListChallenge() {
        LinkedListChallenge linkedListChallenge = new LinkedListChallenge();

        linkedListChallenge.addCity(new City("Salem", 70));
        linkedListChallenge.addCity(new City("Kanyakumari", 710));
        linkedListChallenge.addCity(new City("Chennai", 300));
        linkedListChallenge.addCity(new City("Madhurai", 310));
        linkedListChallenge.addCity(new City("COimbature", 220));
        linkedListChallenge.addCity(new City("Trichy", 210));
        linkedListChallenge.addCity(new City("Hosur", 90));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        if (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        String menuOption = """
                    Available actions (select word or letter):
                    (F)orward
                    (B)ackward
                    (L)ist Places
                    (Q)uit
                    """;
        System.out.println(menuOption);
        boolean quitLoop = false;
        while(!quitLoop) {
            System.out.println("Enter a value:");
            String option = sc.nextLine().toLowerCase().substring(0,1);
            switch (option) {
                case "F" ->  linkedListChallenge.forward();
                case "B" -> linkedListChallenge.backward();
                case "L" -> linkedListChallenge.listPlaces();
                case "Q" -> {
                    quitLoop = true;
                    System.out.println("Quiting Program");
                }
                default -> System.out.println("Wrong Option");
            }
        } while(quitLoop);
    }
}