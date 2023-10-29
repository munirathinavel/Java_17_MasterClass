package composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartKitchenTest {

    @Test
    void testSmartKitchen() {
//        SmartKitchen smartKitchen = new SmartKitchen();
//
//        Refrigerator iceBox = smartKitchen.getIceBox();
//        iceBox.orderFood();
//        smartKitchen.addWater();
//        iceBox.orderFood();
//
//        CoffeeMaker brewMaster = smartKitchen.getBrewMaster();
//        brewMaster.breCoffee();
//        smartKitchen.pourMilk();
//        brewMaster.breCoffee();
//
//        DishWasher dishWasher = smartKitchen.getDishWasher();
//        dishWasher.doDishes();
//        smartKitchen.loadDishWasher();
//        dishWasher.doDishes();
//        System.out.println("-------------");

        SmartKitchen smartKitchenComposition = new SmartKitchen();
        smartKitchenComposition.setKitchenState(true, true, true);
        smartKitchenComposition.doKitchenWork();

        smartKitchenComposition.setKitchenState(false, true, false);
        smartKitchenComposition.doKitchenWork();

        smartKitchenComposition.setKitchenState(true, false, true);
        smartKitchenComposition.doKitchenWork();
    }
}