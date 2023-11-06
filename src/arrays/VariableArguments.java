package arrays;

public class VariableArguments {
    public static void main(String[] args) {
        String[] arr = {"Cool", "Normal", "Hot"};
        printArray(arr);

        printArray("Cool");

        printArray("Cool", "Hot", "Warm");

        printArray(new String[]{"Cool", "Hot", "Warm"});

        System.out.println(String.join(",", arr));

        System.out.println(String.join(",", new String[]{"Sunday", "Friday"}));

    }

    private static void printArray(String... arr) {
        for (String val: arr) {
            System.out.println(val);
        }
        System.out.println();
    }
//    private static void printArray(String[] arr) {
//        for (String val: arr) {
//            System.out.println(val);
//        }
//    }
}
