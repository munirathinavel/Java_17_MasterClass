package arraylist;

import java.util.*;

record GroceryItem(String name, String type, int quantity) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}
public class ArrayListExample {

    public static void main(String[] args) {
        Object[] groceries = new Object[3];
        groceries[0] = new GroceryItem("milk");
        groceries[1] =  new GroceryItem("Tomato", "Vegetable", 10);
        groceries[2] = "Cool"; // Any objec type is possible because it's an object.

        System.out.println(Arrays.toString(groceries));

        ArrayList groceries2 = new ArrayList();
        groceries2.add(new GroceryItem("milk"));
        groceries2.add(new GroceryItem("Tomato", "Vegetable", 10));
        groceries2.add("Cool Buddy!"); // This is possible because we didn't specify the Object Type of the List
        System.out.println(groceries2);

        List<GroceryItem> groceries3 = new ArrayList<>();
        groceries3.add(new GroceryItem("milk"));
        groceries3.add(new GroceryItem("Tomato", "Vegetable", 10));
//        groceries3.add("Cool Buddy!"); // We can't store String in place of GroceryItem
        groceries3.add(new GroceryItem("Butter"));
        System.out.println(groceries3);
        groceries3.remove(1);
        System.out.println(groceries3);

        String[] fruits = {"apple", "orange", "banana", "pineapple"};

        List<String> fruitsList = List.of(fruits);
        System.out.println(fruitsList);
        System.out.println(fruitsList.getClass().getName());

        ArrayList<String> groceryList = new ArrayList<>(fruitsList);
        groceryList.add("yogurt");
        groceryList.addAll(List.of("Radish", "Lemon"));
        System.out.println(groceryList);

        System.out.println("2nd Item:" + groceryList.get(1));
        System.out.println("Contains Radish:" + groceryList.contains("Radish"));
        System.out.println("Index Of Radish:" + groceryList.indexOf("Radish"));
        groceryList.add("apple");
        System.out.println("Last Index Of apple:" + groceryList.lastIndexOf("apple"));

        groceryList.removeAll(List.of("apple", "orange"));
        System.out.println(groceryList);

        groceryList.retainAll(List.of("banana", "yogurt", "Lemon"));
        System.out.println(groceryList);

        groceryList.clear();
        System.out.println("isEmpty():" + groceryList.isEmpty());

        groceryList.addAll(Arrays.asList("a3","a2", "a1"));
        System.out.println(groceryList);
        groceryList.set(1, "a2'");
        System.out.println(groceryList);
        System.out.println("\n");

        groceryList.addAll(List.of("v6", "v5", "v4"));
        groceryList.set(4, "v5'");
        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
        groceryList.sort(Comparator.reverseOrder());
        System.out.println(groceryList);

        List<Integer> list = List.of(1, 2, 3);
//        list.set(1, 10);
//        List<Integer> list1 = List.of(1, 2, null);

        String[] groceries6 = groceryList.toArray(new String[groceryList.size()]);
        System.out.println(Arrays.toString(groceries6));

        String[] originalArray = new String[] {"First", "Second", "Third", "Four", "Five"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);
        originalList.sort(Comparator.naturalOrder());
        System.out.println(originalList);
        originalList.set(0, originalList.get(0) + "-1");
        System.out.println(originalList);
//        originalList.remove(0);
//        originalList.add("Sixe");


    }
}
