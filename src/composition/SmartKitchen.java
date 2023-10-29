package composition;

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Food is Orderd!");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Dishwashing is done!");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void breCoffee() {
        if(hasWorkToDo) {
            System.out.println("Coffee is ready!");
            hasWorkToDo = false;
        }
    }
}
public class SmartKitchen {
    private Refrigerator iceBox;
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;

//    public Refrigerator getIceBox() {
//        return iceBox;
//    }
//
//    public void setIceBox(Refrigerator iceBox) {
//        this.iceBox = iceBox;
//    }
//
//    public CoffeeMaker getBrewMaster() {
//        return brewMaster;
//    }
//
//    public void setBrewMaster(CoffeeMaker brewMaster) {
//        this.brewMaster = brewMaster;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public void setDishWasher(DishWasher dishWasher) {
//        this.dishWasher = dishWasher;
//    }

    public SmartKitchen() {
        this.iceBox = new Refrigerator();
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
    }

    public void addWater() {
        iceBox.setHasWorkToDo(true);
    }

    public void pourMilk() {
        brewMaster.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean refregeratorFlag, boolean coffeeFlag, boolean dishwasherFlag) {
        iceBox.setHasWorkToDo(refregeratorFlag);
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishwasherFlag);
    }

    public void doKitchenWork() {
        iceBox.orderFood();
        brewMaster.breCoffee();
        dishWasher.doDishes();
        System.out.println("---------------");
    }
}
