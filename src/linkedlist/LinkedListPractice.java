package linkedlist;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        var placesToVisit = new LinkedList<>();
        placesToVisit.add("Sunday");
        placesToVisit.add(0, "Monday");
        addElements(placesToVisit);
        placesToVisit.add("Add");
        System.out.println(placesToVisit);

        System.out.println("Removing Elements now: \n");
        removeElements(placesToVisit);

        // Get Elements
        LinkedList<String> villages = new LinkedList<>();
        villages.add("Vaguthupatti");
        villages.add("Nadur");
        villages.add("Kottavur");
        villages.add("Mavadipatti");
        villages.add("Mottupatti");
        villages.add("Krishnapuram");

        System.out.println("\n Printing Villages:\n");
        getElements1(villages);
    }

    private static void getElements1(LinkedList<String> list) {
        System.out.println(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void addElements(LinkedList<String> placesToVisit) {
        placesToVisit.addFirst("AddFirst");
        placesToVisit.addLast("AddLast");
        // Queue methods
        placesToVisit.offer("offer");
        placesToVisit.offerFirst("offerFirst");
        placesToVisit.offerLast("offerLast");
        placesToVisit.push("Push");
    }

    private static void removeElements(LinkedList<String> list) {
        System.out.println(list);
        System.out.println(list.remove() + " was removed");
        System.out.println(list);
        System.out.println(list.remove(0) + " was removed");
        System.out.println(list);
        System.out.println(list.removeLast() + " was removed");
        System.out.println(list);


        // Queue
        System.out.println("\nRemoving with Queue Methods: \n");
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);

        // Stack Methods
        System.out.println("\nRemoving with Queue Methods: \n");
        System.out.println(list.pop());
        System.out.println(list);
     }
}
