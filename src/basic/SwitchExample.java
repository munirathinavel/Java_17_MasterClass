package basic;

public class SwitchExample {

    public static void main(String[] args) {

        callSwitch(1);
        callSwitch(2);
        callSwitch(12);
    }

    private static void callSwitch(int value) {
        switch (value) {
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
            case 3:
                System.out.println("This is 2 or 3");
                break;
            default:
                System.out.println("This is default");
                break;
        }
    }

    private static void enhancedSwitch(int value) {
        switch (value) {
            case 1 -> System.out.println("This is 1");
            case 2, 3 -> System.out.println("This is 2");
            default -> System.out.println("This is default");

        }
    }
}
