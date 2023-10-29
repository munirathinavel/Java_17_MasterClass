package oop_challenge;

import org.junit.jupiter.api.Test;

class MealOrderTest {

    @Test
    void printItemizedList() {
//        MealOrder mealOrder = new MealOrder("AVACADO", "PEPSI", "Pepperoni");
//        mealOrder.printItemizedList();

        MealOrder secondMeal = new MealOrder("chilli", "7-up", "deluxe");
        secondMeal.addBurgetToppings("AVOCADO", "CHEESE", "HAM", "BACON", "SALAMI");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}