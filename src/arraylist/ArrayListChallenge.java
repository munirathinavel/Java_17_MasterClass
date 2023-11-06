package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>(200);
        array.add("Cool");
        Scanner sc = new Scanner(System.in);
        List<GroceryItem> groceryItemList = new ArrayList<>();
        boolean closeLoop = false;
        do {
            System.out.println("Enter your options to add/remove grocery items \n");
            System.out.println("0 - Shutdown \n" +
                    "1 - Add Item \n" +
                    "2 - Remove Item");
            int option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 0 -> {
                    closeLoop = true;
                    System.out.println("Program shuts down.");
                }
                case 1 -> {
                    System.out.println("Enter Item name, type, quantity (Comma Seperated):");
                    String[] val = sc.nextLine().split(",");
                    groceryItemList.add(new GroceryItem(val[0], val[1], Integer.parseInt(val[2])));
                }
                case 2 -> {
                    System.out.println("Enter the index position out of " + groceryItemList.size());
                    groceryItemList.remove(sc.nextInt());
                }
                default -> {
                    closeLoop = true;
                    System.out.println("Invalid choice");
                }
            }
            System.out.println(groceryItemList);
        } while(!closeLoop);
    }

}
